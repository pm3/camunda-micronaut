package com.aston.camunda.externaltask.args;

import com.aston.camunda.externaltask.ExternalTaskKafka;
import org.camunda.rest.model.VariableValueDto;

import java.util.Map;
import java.util.function.Function;

public class TaskPropertiesArgumentBuilder implements IArgumentBuilder {

    Function<ExternalTaskKafka, String> getter;

    public TaskPropertiesArgumentBuilder(Function<ExternalTaskKafka, String> getter) {
        this.getter = getter;
    }

    @Override
    public boolean needVariables() {
        return false;
    }

    @Override
    public Object build(ExternalTaskKafka externalTask, Map<String, VariableValueDto> variables) {
        return getter.apply(externalTask);
    }
}
