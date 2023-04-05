package com.aston.camunda.externaltask.args;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;
import org.camunda.rest.model.VariableValueDto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VariablesResponseBuilder implements IResponseBuilder {

    ObjectMapper objectMapper;

    public VariablesResponseBuilder(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void build(Object response, Map<String, VariableValueDto> responseVariables) throws Exception {
        if (response != null) {
            JsonNode rawResponse = objectMapper.valueToTree(response);
            if (rawResponse instanceof ObjectNode) {
                for (Iterator<Map.Entry<String, JsonNode>> it = rawResponse.fields(); it.hasNext(); ) {
                    Map.Entry<String, JsonNode> e = it.next();
                    JsonNode val = e.getValue();
                    if (val instanceof LongNode)
                        responseVariables.put(e.getKey(), variableValueDto(val.asLong(), "Long", null));
                    else if (val instanceof IntNode)
                        responseVariables.put(e.getKey(), variableValueDto(val.asInt(), "Integer", null));
                    else if (val instanceof ShortNode)
                        responseVariables.put(e.getKey(), variableValueDto(val.asInt(), "Short", null));
                    else if (val instanceof DoubleNode)
                        responseVariables.put(e.getKey(), variableValueDto(val.asDouble(), "Double", null));
                    else if (val instanceof BooleanNode)
                        responseVariables.put(e.getKey(), variableValueDto(val.asBoolean(), "Boolean", null));
                    else if (val instanceof ObjectNode)
                        responseVariables.put(e.getKey(), variableValueDto(objectMapper.writeValueAsString(val), "Object", "java.util.Map"));
                    else if (val instanceof ArrayNode)
                        responseVariables.put(e.getKey(), variableValueDto(objectMapper.writeValueAsString(val), "Object", "java.util.List"));
                    else
                        responseVariables.put(e.getKey(), variableValueDto(val.textValue(), "String", null));
                }
            }
        }
    }

    private VariableValueDto variableValueDto(Object val, String type, String javaType) {
        VariableValueDto valueDto = new VariableValueDto();
        valueDto.setValue(val);
        valueDto.setType(type);
        if ("Object".equals(type)) {
            valueDto.setValueInfo(new HashMap<>());
            valueDto.getValueInfo().put("serializationDataFormat", "application/json");
            valueDto.getValueInfo().put("objectTypeName", javaType);
        }
        return valueDto;
    }
}
