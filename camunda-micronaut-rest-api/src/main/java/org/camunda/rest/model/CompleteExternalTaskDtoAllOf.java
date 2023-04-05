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
 * CompleteExternalTaskDtoAllOf
 */
@JsonPropertyOrder({
  CompleteExternalTaskDtoAllOf.JSON_PROPERTY_VARIABLES,
  CompleteExternalTaskDtoAllOf.JSON_PROPERTY_LOCAL_VARIABLES
})
@JsonTypeName("CompleteExternalTaskDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CompleteExternalTaskDtoAllOf {
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private Map<String, VariableValueDto> variables = null;

    public static final String JSON_PROPERTY_LOCAL_VARIABLES = "localVariables";
    private Map<String, VariableValueDto> localVariables = null;

    public CompleteExternalTaskDtoAllOf() {
    }

    public CompleteExternalTaskDtoAllOf variables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
        return this;
    }

    public CompleteExternalTaskDtoAllOf putVariablesItem(String key, VariableValueDto variablesItem) {
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

    public CompleteExternalTaskDtoAllOf localVariables(Map<String, VariableValueDto> localVariables) {
        this.localVariables = localVariables;
        return this;
    }

    public CompleteExternalTaskDtoAllOf putLocalVariablesItem(String key, VariableValueDto localVariablesItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteExternalTaskDtoAllOf completeExternalTaskDtoAllOf = (CompleteExternalTaskDtoAllOf) o;
        return Objects.equals(this.variables, completeExternalTaskDtoAllOf.variables) &&
            Objects.equals(this.localVariables, completeExternalTaskDtoAllOf.localVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variables, localVariables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteExternalTaskDtoAllOf {\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
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
