package com.aston.camunda.externaltask.args;

import com.aston.camunda.externaltask.ExternalTaskKafka;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.core.annotation.Order;
import io.micronaut.core.type.Argument;
import io.micronaut.http.annotation.Body;
import io.micronaut.inject.ExecutableMethod;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Singleton
@Order(100)
public class DefaultArgumentBuilderFactory implements IArgumentBuilderFactory {

    private final static Logger LOGGER = LoggerFactory.getLogger(DefaultArgumentBuilderFactory.class);

    ObjectMapper objectMapper;
    Map<String, Function<ExternalTaskKafka, String>> externalTaskGetters = new HashMap<>();

    public DefaultArgumentBuilderFactory(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        externalTaskGetters.put("externalTaskId", ExternalTaskKafka::getExternalTaskId);
        externalTaskGetters.put("processInstanceId", ExternalTaskKafka::getProcessInstanceId);
        externalTaskGetters.put("processDefinitionKey", ExternalTaskKafka::getProcessDefinitionKey);
        externalTaskGetters.put("activityId", ExternalTaskKafka::getActivityId);
    }

    @Override
    public IArgumentBuilder create(ExecutableMethod<?, ?> method, int pos) {
        Argument<?> arg = method.getArguments()[pos];
        if (arg.getType().equals(String.class)) {
            Function<ExternalTaskKafka, String> getter = externalTaskGetters.get(arg.getName());
            if (getter != null) {
                LOGGER.debug("create external task getter {} {}", arg.getName(), method.getDescription());
                return new TaskPropertiesArgumentBuilder(getter);
            }
            return null;
        }
        if (method.getArguments().length == 1 || arg.isAnnotationPresent(Body.class)) {
            JavaType javaType = objectMapper.constructType(arg.asType());
            LOGGER.debug("create variables object {} {}", arg.getName(), method.getDescription());
            return new VariablesArgumentBuilder(javaType, objectMapper, externalTaskGetters);
        }
        return null;
    }
}
