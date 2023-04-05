package com.aston.camunda.externaltask;

import com.aston.camunda.externaltask.args.*;
import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.inject.ExecutableMethod;
import io.micronaut.inject.MethodExecutionHandle;
import org.camunda.rest.model.VariableValueDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ExternalTaskExecutor {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExternalTaskExecutor.class);

    private final ExecutableMethod<?, ?> method;
    private final MethodExecutionHandle<?, Object> executionHandle;
    IArgumentBuilder[] builders;

    IResponseBuilder responseBuilder;
    private String topic;
    private long timeout;
    private boolean needVariables;

    public ExternalTaskExecutor(ExecutableMethod<?, ?> method,
                                MethodExecutionHandle<?, Object> executionHandle,
                                IArgumentBuilderFactory[] argumentBuilderFactories,
                                IResponseBuilderFactory[] responseBuilderFactories) {
        this.method = method;
        this.executionHandle = executionHandle;
        initAnnotationProperties(method);
        initArgumentBuilders(method, argumentBuilderFactories);
        initNeedVariables();
        initResponseBuilder(method, responseBuilderFactories);
    }

    private void initAnnotationProperties(ExecutableMethod<?, ?> method) {
        AnnotationValue<?> a = method.getAnnotation(ExternalTaskSubscription.class);
        this.topic = a.stringValue("topic").get();
        this.timeout = a.longValue("timeout").orElse(10_000);
    }

    private void initArgumentBuilders(ExecutableMethod<?, ?> method, IArgumentBuilderFactory[] argumentBuilderFactories) {
        this.builders = new IArgumentBuilder[method.getArguments().length];
        for (int pos = 0; pos < builders.length; pos++) {
            IArgumentBuilder builder = null;
            for (int i = 0; i < argumentBuilderFactories.length; i++) {
                builder = argumentBuilderFactories[i].create(method, pos);
                if (builder != null) break;
            }
            if (builder == null) {
                LOGGER.debug("ignore argument {} {}", method.getArgumentNames()[pos], method.getDescription());
                builder = new NullArgumentBuilder();
            }
            builders[pos] = builder;
        }
    }

    private void initNeedVariables() {
        this.needVariables = false;
        for (IArgumentBuilder builder : builders) {
            if (builder.needVariables()) this.needVariables = true;
        }
    }

    private void initResponseBuilder(ExecutableMethod<?, ?> method, IResponseBuilderFactory[] responseBuilderFactories) {
        for (IResponseBuilderFactory factory : responseBuilderFactories) {
            this.responseBuilder = factory.create(method);
            if (responseBuilder != null) break;
        }
    }

    public String getTopic() {
        return topic;
    }

    public long getTimeout() {
        return timeout;
    }

    public boolean needVariables() {
        return needVariables;
    }

    public Map<String, VariableValueDto> exec(ExternalTaskKafka externalTask, Map<String, VariableValueDto> variables) throws Exception {
        Object[] args = new Object[builders.length];
        for (int i = 0; i < args.length; i++) {
            args[i] = builders[i].build(externalTask, variables);
        }
        Object resp = executionHandle.invoke(args);
        Map<String, VariableValueDto> variablesResponse = new HashMap<>();
        if (responseBuilder != null) {
            responseBuilder.build(resp, variablesResponse);
        }
        return variablesResponse;
    }

    @Override
    public String toString() {
        return topic + " " + method.getDescription();
    }
}
