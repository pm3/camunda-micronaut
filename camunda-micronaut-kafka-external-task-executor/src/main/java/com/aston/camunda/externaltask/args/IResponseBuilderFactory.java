package com.aston.camunda.externaltask.args;

import io.micronaut.inject.ExecutableMethod;

public interface IResponseBuilderFactory {
    IResponseBuilder create(ExecutableMethod<?, ?> method);
}
