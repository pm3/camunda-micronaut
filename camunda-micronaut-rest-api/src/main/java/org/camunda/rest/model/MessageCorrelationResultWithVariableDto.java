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

import com.fasterxml.jackson.annotation.*;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The &#x60;processInstance&#x60; property only has a value if the resultType is set to &#x60;ProcessDefinition&#x60;. The processInstance with the properties as described in the [get single instance](https://docs.camunda.org/manual/7.18/reference/rest/process-instance/get/) method.  The &#x60;execution&#x60; property only has a value if the resultType is set to &#x60;Execution&#x60;. The execution with the properties as described in the [get single execution](https://docs.camunda.org/manual/7.18/reference/rest/execution/get/) method.
 */
@JsonPropertyOrder({
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_RESULT_TYPE,
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_PROCESS_INSTANCE,
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_EXECUTION,
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_VARIABLES
})
@JsonTypeName("MessageCorrelationResultWithVariableDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class MessageCorrelationResultWithVariableDto {
    /**
     * Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  &#x60;ProcessDefinition&#x60; and otherwise &#x60;Execution&#x60;.
     */
    public enum ResultTypeEnum {
        EXECUTION("Execution"),
        PROCESSDEFINITION("ProcessDefinition");

        private String value;

        ResultTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResultTypeEnum fromValue(String value) {
            for (ResultTypeEnum b : ResultTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }
    public static final String JSON_PROPERTY_RESULT_TYPE = "resultType";
    private ResultTypeEnum resultType;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE = "processInstance";
    private ProcessInstanceDto processInstance;

    public static final String JSON_PROPERTY_EXECUTION = "execution";
    private ExecutionDto execution;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private Map<String, VariableValueDto> variables = null;

    public MessageCorrelationResultWithVariableDto() {
    }

    public MessageCorrelationResultWithVariableDto resultType(ResultTypeEnum resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  &#x60;ProcessDefinition&#x60; and otherwise &#x60;Execution&#x60;.
     * @return resultType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ResultTypeEnum getResultType() {
        return resultType;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResultType(ResultTypeEnum resultType) {
        this.resultType = resultType;
    }

    public MessageCorrelationResultWithVariableDto processInstance(ProcessInstanceDto processInstance) {
        this.processInstance = processInstance;
        return this;
    }

    /**
     * Get processInstance
     * @return processInstance
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ProcessInstanceDto getProcessInstance() {
        return processInstance;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessInstance(ProcessInstanceDto processInstance) {
        this.processInstance = processInstance;
    }

    public MessageCorrelationResultWithVariableDto execution(ExecutionDto execution) {
        this.execution = execution;
        return this;
    }

    /**
     * Get execution
     * @return execution
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ExecutionDto getExecution() {
        return execution;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecution(ExecutionDto execution) {
        this.execution = execution;
    }

    public MessageCorrelationResultWithVariableDto variables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
        return this;
    }

    public MessageCorrelationResultWithVariableDto putVariablesItem(String key, VariableValueDto variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
  }

    /**
     * This property is returned if the &#x60;variablesInResultEnabled&#x60; is set to &#x60;true&#x60;. Contains a list of the process variables. 
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
        MessageCorrelationResultWithVariableDto messageCorrelationResultWithVariableDto = (MessageCorrelationResultWithVariableDto) o;
        return Objects.equals(this.resultType, messageCorrelationResultWithVariableDto.resultType) &&
            Objects.equals(this.processInstance, messageCorrelationResultWithVariableDto.processInstance) &&
            Objects.equals(this.execution, messageCorrelationResultWithVariableDto.execution) &&
            Objects.equals(this.variables, messageCorrelationResultWithVariableDto.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultType, processInstance, execution, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageCorrelationResultWithVariableDto {\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    processInstance: ").append(toIndentedString(processInstance)).append("\n");
        sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
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
