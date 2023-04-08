package com.aston.camunda.externaltask;

import com.aston.camunda.externaltask.args.IArgumentBuilderFactory;
import com.aston.camunda.externaltask.args.IResponseBuilderFactory;
import io.micronaut.context.ExecutionHandleLocator;
import io.micronaut.context.processor.ExecutableMethodProcessor;
import io.micronaut.inject.BeanDefinition;
import io.micronaut.inject.ExecutableMethod;
import io.micronaut.inject.MethodExecutionHandle;
import jakarta.inject.Singleton;

@Singleton
public class ExternalTaskMethodProcessor implements ExecutableMethodProcessor<Camunda> {

    ExecutionHandleLocator executionHandleLocator;
    IArgumentBuilderFactory[] argumentBuilderFactories;
    IResponseBuilderFactory[] responseBuilderFactories;
    ExternalTaskConsumer externalTaskConsumer;

    public ExternalTaskMethodProcessor(ExecutionHandleLocator executionHandleLocator,
                                       IArgumentBuilderFactory[] argumentBuilderFactories,
                                       IResponseBuilderFactory[] responseBuilderFactories,
                                       ExternalTaskConsumer externalTaskConsumer) {
        this.executionHandleLocator = executionHandleLocator;
        this.argumentBuilderFactories = argumentBuilderFactories;
        this.responseBuilderFactories = responseBuilderFactories;
        this.externalTaskConsumer = externalTaskConsumer;
    }

    @Override
    public void process(BeanDefinition<?> beanDefinition, ExecutableMethod<?, ?> method) {
        if (method.hasAnnotation(ExternalTaskSubscription.class)) {
            MethodExecutionHandle<?, Object> executionHandle = executionHandleLocator.createExecutionHandle(beanDefinition, (ExecutableMethod<Object, ?>) method);
            ExternalTaskExecutor executor = new ExternalTaskExecutor(method, executionHandle, argumentBuilderFactories, responseBuilderFactories);
            externalTaskConsumer.addExecutor(executor);
        }
    }
}
