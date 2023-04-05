package com.aston.camunda.externaltask.args;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.inject.ExecutableMethod;
import jakarta.inject.Singleton;

@Singleton
public class DefaultResponseBuilderFactory implements IResponseBuilderFactory {

    ObjectMapper objectMapper;

    public DefaultResponseBuilderFactory(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public IResponseBuilder create(ExecutableMethod<?, ?> method) {
        if (!method.getReturnType().isVoid()) {
            return new VariablesResponseBuilder(objectMapper);
        }
        return null;
    }
}
