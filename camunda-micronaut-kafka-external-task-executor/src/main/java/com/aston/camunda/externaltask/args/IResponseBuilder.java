package com.aston.camunda.externaltask.args;

import org.camunda.rest.model.VariableValueDto;

import java.util.Map;

public interface IResponseBuilder {

    void build(Object response, Map<String, VariableValueDto> responseVariables) throws Exception;
}
