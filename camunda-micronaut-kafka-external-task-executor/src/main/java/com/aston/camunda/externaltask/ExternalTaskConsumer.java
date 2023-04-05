package com.aston.camunda.externaltask;

import com.aston.camunda.externaltask.args.IArgumentBuilderFactory;
import com.aston.camunda.externaltask.args.IResponseBuilderFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.ExecutionHandleLocator;
import io.micronaut.context.annotation.Value;
import io.micronaut.context.processor.ExecutableMethodProcessor;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.inject.BeanDefinition;
import io.micronaut.inject.ExecutableMethod;
import io.micronaut.inject.MethodExecutionHandle;
import io.micronaut.messaging.annotation.MessageHeader;
import org.camunda.rest.api.ExecutionApi;
import org.camunda.rest.api.ExternalTaskApi;
import org.camunda.rest.api.ProcessInstanceApi;
import org.camunda.rest.model.CompleteExternalTaskDto;
import org.camunda.rest.model.ExternalTaskFailureDto;
import org.camunda.rest.model.LockExternalTaskDto;
import org.camunda.rest.model.VariableValueDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@KafkaListener(offsetReset = OffsetReset.EARLIEST, groupId = "${external-task-group-id}")
public class ExternalTaskConsumer implements ExecutableMethodProcessor<Camunda> {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExternalTaskConsumer.class);

    ExecutionHandleLocator executionHandleLocator;
    ExternalTaskApi externalTaskApi;
    ProcessInstanceApi processInstanceApi;
    ExecutionApi executionApi;
    ObjectMapper objectMapper;
    String groupId;

    IArgumentBuilderFactory[] argumentBuilderFactories;

    IResponseBuilderFactory[] responseBuilderFactories;
    Map<String, ExternalTaskExecutor> methods = new ConcurrentHashMap<>();

    public ExternalTaskConsumer(ExecutionHandleLocator executionHandleLocator,
                                IArgumentBuilderFactory[] argumentBuilderFactories,
                                IResponseBuilderFactory[] responseBuilderFactories,
                                ExternalTaskApi externalTaskApi,
                                ProcessInstanceApi processInstanceApi,
                                ExecutionApi executionApi,
                                ObjectMapper objectMapper,
                                @Value("${external-task-group-id}") String groupId) {
        this.executionHandleLocator = executionHandleLocator;
        this.argumentBuilderFactories = argumentBuilderFactories;
        this.responseBuilderFactories = responseBuilderFactories;
        this.externalTaskApi = externalTaskApi;
        this.processInstanceApi = processInstanceApi;
        this.executionApi = executionApi;
        this.objectMapper = objectMapper;
        this.groupId = groupId;
    }

    @Topic("camunda-external-tasks")
    public void externalTask(String value, @Nullable @MessageHeader("camunda-topic") String camundaTopic) {
        try {

            LOGGER.info("{} {}", camundaTopic, value);
            if (camundaTopic == null) return;
            ExternalTaskExecutor executor = methods.get(camundaTopic);
            if (executor == null) {
                LOGGER.debug("ignore {}", camundaTopic);
                return;
            }
            ExternalTaskKafka externalTaskKafka = objectMapper.readValue(value, ExternalTaskKafka.class);
            try {
                LockExternalTaskDto lock = new LockExternalTaskDto();
                lock.setLockDuration(executor.getTimeout());
                lock.setWorkerId(groupId);
                externalTaskApi.lock(externalTaskKafka.getExternalTaskId(), lock).block();
                LOGGER.info("locking {}", externalTaskKafka.getExternalTaskId());
            } catch (HttpClientResponseException e) {
                LOGGER.info("ignore, locked or completed {}", externalTaskKafka.getExternalTaskId());
                return;
            }

            try {
                Map<String, VariableValueDto> values = new HashMap<>();
                if (executor.isProcessVariables()) {
                    Map<String, VariableValueDto> m = processInstanceApi.getProcessInstanceVariables(externalTaskKafka.getProcessInstanceId(), true).block();
                    values.putAll(m);
                    LOGGER.info("process values {} {}", externalTaskKafka.getExternalTaskId(), objectMapper.writeValueAsString(values));
                }
                if (executor.isLocalVariables() && externalTaskKafka.getExecutionId() != null) {
                    Map<String, VariableValueDto> m = executionApi.getLocalExecutionVariables(externalTaskKafka.getExecutionId(), true).block();
                    values.putAll(m);
                    LOGGER.info("local values {} {}", externalTaskKafka.getExternalTaskId(), objectMapper.writeValueAsString(values));
                }

                Map<String, VariableValueDto> response = executor.exec(externalTaskKafka, values);
                LOGGER.info("response values {} {}", externalTaskKafka.getExternalTaskId(), objectMapper.writeValueAsString(response));
                minimizeResponse(response, values);
                LOGGER.info("response values cleaned {} {}", externalTaskKafka.getExternalTaskId(), objectMapper.writeValueAsString(response));

                CompleteExternalTaskDto complete = new CompleteExternalTaskDto();
                complete.setWorkerId(groupId);
                complete.setVariables(response);

                externalTaskApi.completeExternalTaskResource(externalTaskKafka.getExternalTaskId(), complete).block();
                LOGGER.info("completed {} {}", externalTaskKafka.getExternalTaskId(), objectMapper.writeValueAsString(complete));

            } catch (Exception e) {
                LOGGER.error("execute error {} {}", externalTaskKafka.getExternalTaskId(), e.getMessage(), e);
                ExternalTaskFailureDto failure = new ExternalTaskFailureDto();
                failure.setWorkerId(groupId);
                failure.setErrorMessage(e.getMessage());
                externalTaskApi.handleFailure(externalTaskKafka.getExternalTaskId(), failure).block();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void minimizeResponse(Map<String, VariableValueDto> response, Map<String, VariableValueDto> values) {
        for (String key : new ArrayList<>(response.keySet())) {
            VariableValueDto var2 = values.get(key);
            if (var2 != null) {
                VariableValueDto var1 = response.get(key);
                if (var1.getValue().equals(var2.getValue())) {
                    response.remove(key);
                }
            }
        }
    }

    @Override
    public void process(BeanDefinition<?> beanDefinition, ExecutableMethod<?, ?> method) {
        if (method.hasAnnotation(ExternalTaskSubscription.class)) {
            MethodExecutionHandle<?, Object> executionHandle = executionHandleLocator.createExecutionHandle(beanDefinition, (ExecutableMethod<Object, ?>) method);
            ExternalTaskExecutor executor = new ExternalTaskExecutor(method, executionHandle, argumentBuilderFactories, responseBuilderFactories);
            addExecutor(executor);
        }
    }

    public void addExecutor(ExternalTaskExecutor externalTaskExecutor) {
        if (methods.containsKey(externalTaskExecutor.getTopic())) {
            LOGGER.warn("ignore duplicated topic {}", externalTaskExecutor);
            return;
        }
        LOGGER.info("register topic {}", externalTaskExecutor.getTopic());
        methods.put(externalTaskExecutor.getTopic(), externalTaskExecutor);
    }

}
