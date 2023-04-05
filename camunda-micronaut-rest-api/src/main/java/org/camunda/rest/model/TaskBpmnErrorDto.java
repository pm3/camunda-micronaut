/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.18.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.camunda.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TaskBpmnErrorDto
 */
@JsonPropertyOrder({
  TaskBpmnErrorDto.JSON_PROPERTY_ERROR_CODE,
  TaskBpmnErrorDto.JSON_PROPERTY_ERROR_MESSAGE,
  TaskBpmnErrorDto.JSON_PROPERTY_VARIABLES
})
@JsonTypeName("TaskBpmnErrorDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class TaskBpmnErrorDto {
    public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
    private String errorCode;

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private Map<String, VariableValueDto> variables = null;

    public TaskBpmnErrorDto() {
    }

    public TaskBpmnErrorDto errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * An error code that indicates the predefined error. It is used to identify the BPMN error handler.
     * @return errorCode
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public TaskBpmnErrorDto errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * An error message that describes the error.
     * @return errorMessage
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public TaskBpmnErrorDto variables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
        return this;
    }

    public TaskBpmnErrorDto putVariablesItem(String key, VariableValueDto variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
  }

    /**
     * A JSON object containing variable key-value pairs.
     * @return variables
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, VariableValueDto> getVariables() {
        return variables;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskBpmnErrorDto taskBpmnErrorDto = (TaskBpmnErrorDto) o;
        return Objects.equals(this.errorCode, taskBpmnErrorDto.errorCode) &&
            Objects.equals(this.errorMessage, taskBpmnErrorDto.errorMessage) &&
            Objects.equals(this.variables, taskBpmnErrorDto.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBpmnErrorDto {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

