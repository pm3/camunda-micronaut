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
 * CompleteExternalTaskDto
 */
@JsonPropertyOrder({
  CompleteExternalTaskDto.JSON_PROPERTY_VARIABLES,
  CompleteExternalTaskDto.JSON_PROPERTY_LOCAL_VARIABLES,
  CompleteExternalTaskDto.JSON_PROPERTY_WORKER_ID
})
@JsonTypeName("CompleteExternalTaskDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CompleteExternalTaskDto {
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private Map<String, VariableValueDto> variables = null;

    public static final String JSON_PROPERTY_LOCAL_VARIABLES = "localVariables";
    private Map<String, VariableValueDto> localVariables = null;

    public static final String JSON_PROPERTY_WORKER_ID = "workerId";
    private String workerId;

    public CompleteExternalTaskDto() {
    }

    public CompleteExternalTaskDto variables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
        return this;
    }

    public CompleteExternalTaskDto putVariablesItem(String key, VariableValueDto variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
  }

    /**
     * A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object with the following properties:
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

    public CompleteExternalTaskDto localVariables(Map<String, VariableValueDto> localVariables) {
        this.localVariables = localVariables;
        return this;
    }

    public CompleteExternalTaskDto putLocalVariablesItem(String key, VariableValueDto localVariablesItem) {
        if (this.localVariables == null) {
            this.localVariables = new HashMap<>();
        }
        this.localVariables.put(key, localVariablesItem);
        return this;
  }

    /**
     * A JSON object containing local variable key-value pairs. Local variables are set only in the scope of external task. Each key is a variable name and each value a JSON variable value object with the following properties:
     * @return localVariables
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_LOCAL_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, VariableValueDto> getLocalVariables() {
        return localVariables;
    }

    @JsonProperty(JSON_PROPERTY_LOCAL_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocalVariables(Map<String, VariableValueDto> localVariables) {
        this.localVariables = localVariables;
    }

    public CompleteExternalTaskDto workerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * **Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.
     * @return workerId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_WORKER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWorkerId() {
        return workerId;
    }

    @JsonProperty(JSON_PROPERTY_WORKER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteExternalTaskDto completeExternalTaskDto = (CompleteExternalTaskDto) o;
        return Objects.equals(this.variables, completeExternalTaskDto.variables) &&
            Objects.equals(this.localVariables, completeExternalTaskDto.localVariables) &&
            Objects.equals(this.workerId, completeExternalTaskDto.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variables, localVariables, workerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteExternalTaskDto {\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
        sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

