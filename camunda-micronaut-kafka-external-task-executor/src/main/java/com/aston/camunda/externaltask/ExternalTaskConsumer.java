package com.aston.camunda.externaltask;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Value;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.messaging.annotation.MessageHeader;
import org.camunda.rest.api.ExecutionApi;
import org.camunda.rest.api.ExternalTaskApi;
import org.camunda.rest.api.ProcessInstanceApi;
import org.camunda.rest.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@KafkaListener(offsetReset = OffsetReset.EARLIEST, groupId = "${external-task-group-id}")
public class ExternalTaskConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExternalTaskConsumer.class);

    ExternalTaskApi externalTaskApi;
    ProcessInstanceApi processInstanceApi;
    ExecutionApi executionApi;
    ObjectMapper objectMapper;
    String groupId;

    Map<String, ExternalTaskExecutor> methods = new ConcurrentHashMap<>();

    public ExternalTaskConsumer(ExternalTaskApi externalTaskApi,
                                ProcessInstanceApi processInstanceApi,
                                ExecutionApi executionApi,
                                ObjectMapper objectMapper,
                                @Value("${external-task-group-id}") String groupId) {
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
                if (e.getStatus().getCode() != 404) {
                    LOGGER.info("ignore, locked or completed {}", externalTaskKafka.getExternalTaskId());
                    return;
                }
                Thread.sleep(100);
                LOGGER.info("re-lock 404 {}", externalTaskKafka.getExternalTaskId());
                try {
                    LockExternalTaskDto lock = new LockExternalTaskDto();
                    lock.setLockDuration(executor.getTimeout());
                    lock.setWorkerId(groupId);
                    externalTaskApi.lock(externalTaskKafka.getExternalTaskId(), lock).block();
                    LOGGER.info("locking {}", externalTaskKafka.getExternalTaskId());
                } catch (HttpClientResponseException e2) {
                    LOGGER.info("ignore, locked or completed {}", externalTaskKafka.getExternalTaskId());
                    return;
                }
            }

            try {
                Map<String, VariableValueDto> values = new HashMap<>();
                if (executor.isProcessVariables()) {
                    Map<String, VariableValueDto> m = processInstanceApi.getProcessInstanceVariables(externalTaskKafka.getProcessInstanceId(), true).block();
                    if (m != null) values.putAll(m);
                    LOGGER.info("process values {} {}", externalTaskKafka.getExternalTaskId(), objectMapper.writeValueAsString(values));
                }
                if (executor.isLocalVariables() && externalTaskKafka.getExecutionId() != null) {
                    Map<String, VariableValueDto> m = executionApi.getLocalExecutionVariables(externalTaskKafka.getExecutionId(), true).block();
                    if (m != null) values.putAll(m);
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

            } catch (BpmnException e) {
                LOGGER.error("execute bpmn error {} {}", externalTaskKafka.getExternalTaskId(), e.getMessage(), e);
                ExternalTaskBpmnError bpmnError = new ExternalTaskBpmnError();
                bpmnError.setWorkerId(groupId);
                bpmnError.setErrorCode(e.getCode());
                bpmnError.setErrorMessage(e.getMessage());
                externalTaskApi.handleExternalTaskBpmnError(externalTaskKafka.getExternalTaskId(), bpmnError).block();
            } catch (RetryFailureException e) {
                int retries = e.getMaxRetry();
                if (externalTaskKafka.getRetries() != null) {
                    retries = externalTaskKafka.getRetries() - 1;
                    if (retries < 0) retries = 0;
                }
                LOGGER.error("execute retry error {} retries {} {}", externalTaskKafka.getExternalTaskId(), retries, e.getMessage(), e);
                ExternalTaskFailureDto failure = new ExternalTaskFailureDto();
                failure.setWorkerId(groupId);
                failure.setErrorMessage(e.getMessage());
                failure.setRetries(retries);
                failure.setRetryTimeout(e.getRetryTimeout() > 0 ? e.getRetryTimeout() : 15_000L);
                externalTaskApi.handleFailure(externalTaskKafka.getExternalTaskId(), failure).block();
            } catch (Exception e) {
                LOGGER.error("execute technical error {} {}", externalTaskKafka.getExternalTaskId(), e.getMessage(), e);
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
                if (var1 != null && var1.getValue() != null && var1.getValue().equals(var2.getValue())) {
                    response.remove(key);
                }
            }
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
