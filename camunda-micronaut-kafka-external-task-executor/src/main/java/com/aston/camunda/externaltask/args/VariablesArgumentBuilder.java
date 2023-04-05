package com.aston.camunda.externaltask.args;

import com.aston.camunda.externaltask.ExternalTaskKafka;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.camunda.rest.model.VariableValueDto;

import java.util.Map;
import java.util.function.Function;

public class VariablesArgumentBuilder implements IArgumentBuilder {

    JavaType javaType;
    ObjectMapper objectMapper;

    Map<String, Function<ExternalTaskKafka, String>> externalTaskGetters;

    public VariablesArgumentBuilder(JavaType javaType,
                                    ObjectMapper objectMapper,
                                    Map<String, Function<ExternalTaskKafka, String>> externalTaskGetters) {
        this.javaType = javaType;
        this.objectMapper = objectMapper;
        this.externalTaskGetters = externalTaskGetters;
    }

    @Override
    public boolean needVariables() {
        return true;
    }

    @Override
    public Object build(ExternalTaskKafka externalTask, Map<String, VariableValueDto> variables) throws Exception {
        ObjectNode root = objectMapper.createObjectNode();
        for (Map.Entry<String, Function<ExternalTaskKafka, String>> e : externalTaskGetters.entrySet()) {
            root.put(e.getKey(), e.getValue().apply(externalTask));
        }
        for (Map.Entry<String, VariableValueDto> e : variables.entrySet()) {
            Object v = e.getValue().getValue();
            root.put(e.getKey(), objectMapper.valueToTree(v));
        }
        return objectMapper.treeToValue(root, javaType);
    }
}
