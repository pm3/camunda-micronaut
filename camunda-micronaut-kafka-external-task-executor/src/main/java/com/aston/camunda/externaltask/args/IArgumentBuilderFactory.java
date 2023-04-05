package com.aston.camunda.externaltask.args;

import io.micronaut.inject.ExecutableMethod;

public interface IArgumentBuilderFactory {

    IArgumentBuilder create(ExecutableMethod<?, ?> method, int pos);
}
