package com.aston.camunda.externaltask.args;

import com.aston.camunda.externaltask.ExternalTaskKafka;
import org.camunda.rest.model.VariableValueDto;

import java.util.Map;

public interface IArgumentBuilder {

    boolean needVariables();

    Object build(ExternalTaskKafka externalTask, Map<String, VariableValueDto> variables) throws Exception;
}
