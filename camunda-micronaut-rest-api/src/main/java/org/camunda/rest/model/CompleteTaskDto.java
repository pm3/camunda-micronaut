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
 * CompleteTaskDto
 */
@JsonPropertyOrder({
  CompleteTaskDto.JSON_PROPERTY_VARIABLES,
  CompleteTaskDto.JSON_PROPERTY_WITH_VARIABLES_IN_RETURN
})
@JsonTypeName("CompleteTaskDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CompleteTaskDto {
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private Map<String, VariableValueDto> variables = null;

    public static final String JSON_PROPERTY_WITH_VARIABLES_IN_RETURN = "withVariablesInReturn";
    private Boolean withVariablesInReturn = false;

    public CompleteTaskDto() {
    }

    public CompleteTaskDto variables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
        return this;
    }

    public CompleteTaskDto putVariablesItem(String key, VariableValueDto variablesItem) {
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

    public CompleteTaskDto withVariablesInReturn(Boolean withVariablesInReturn) {
        this.withVariablesInReturn = withVariablesInReturn;
        return this;
    }

    /**
     * Indicates whether the response should contain the process variables or not. The default is &#x60;false&#x60; with a response code of &#x60;204&#x60;. If set to &#x60;true&#x60; the response contains the process variables and has a response code of &#x60;200&#x60;. If the task is not associated with a process instance (e.g. if it&#39;s part of a case instance) no variables will be returned.
     * @return withVariablesInReturn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_WITH_VARIABLES_IN_RETURN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getWithVariablesInReturn() {
        return withVariablesInReturn;
    }

    @JsonProperty(JSON_PROPERTY_WITH_VARIABLES_IN_RETURN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWithVariablesInReturn(Boolean withVariablesInReturn) {
        this.withVariablesInReturn = withVariablesInReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteTaskDto completeTaskDto = (CompleteTaskDto) o;
        return Objects.equals(this.variables, completeTaskDto.variables) &&
            Objects.equals(this.withVariablesInReturn, completeTaskDto.withVariablesInReturn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variables, withVariablesInReturn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteTaskDto {\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    withVariablesInReturn: ").append(toIndentedString(withVariablesInReturn)).append("\n");
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

