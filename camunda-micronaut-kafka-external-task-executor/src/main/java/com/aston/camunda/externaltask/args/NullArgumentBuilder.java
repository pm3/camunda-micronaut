package com.aston.camunda.externaltask.args;

import com.aston.camunda.externaltask.ExternalTaskKafka;
import org.camunda.rest.model.VariableValueDto;

import java.util.Map;

public class NullArgumentBuilder implements IArgumentBuilder {
    @Override
    public Object build(ExternalTaskKafka externalTask, Map<String, VariableValueDto> variables) {
        return null;
    }
}
