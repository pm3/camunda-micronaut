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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A variable instance query which defines a list of variable instances
 */
@JsonPropertyOrder({
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_NAME,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_NAME_LIKE,
  VariableInstanceQueryDto.JSON_PROPERTY_PROCESS_INSTANCE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_EXECUTION_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_CASE_INSTANCE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_CASE_EXECUTION_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_TASK_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_BATCH_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_TENANT_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_VALUES,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_SCOPE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_SORTING
})
@JsonTypeName("VariableInstanceQueryDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class VariableInstanceQueryDto {
    public static final String JSON_PROPERTY_VARIABLE_NAME = "variableName";
    private String variableName;

    public static final String JSON_PROPERTY_VARIABLE_NAME_LIKE = "variableNameLike";
    private String variableNameLike;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID_IN = "processInstanceIdIn";
    private List<String> processInstanceIdIn = null;

    public static final String JSON_PROPERTY_EXECUTION_ID_IN = "executionIdIn";
    private List<String> executionIdIn = null;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID_IN = "caseInstanceIdIn";
    private List<String> caseInstanceIdIn = null;

    public static final String JSON_PROPERTY_CASE_EXECUTION_ID_IN = "caseExecutionIdIn";
    private List<String> caseExecutionIdIn = null;

    public static final String JSON_PROPERTY_TASK_ID_IN = "taskIdIn";
    private List<String> taskIdIn = null;

    public static final String JSON_PROPERTY_BATCH_ID_IN = "batchIdIn";
    private List<String> batchIdIn = null;

    public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN = "activityInstanceIdIn";
    private List<String> activityInstanceIdIn = null;

    public static final String JSON_PROPERTY_TENANT_ID_IN = "tenantIdIn";
    private List<String> tenantIdIn = null;

    public static final String JSON_PROPERTY_VARIABLE_VALUES = "variableValues";
    private List<VariableQueryParameterDto> variableValues = null;

    public static final String JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE = "variableNamesIgnoreCase";
    private Boolean variableNamesIgnoreCase;

    public static final String JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE = "variableValuesIgnoreCase";
    private Boolean variableValuesIgnoreCase;

    public static final String JSON_PROPERTY_VARIABLE_SCOPE_ID_IN = "variableScopeIdIn";
    private List<String> variableScopeIdIn = null;

    public static final String JSON_PROPERTY_SORTING = "sorting";
    private List<VariableInstanceQueryDtoSortingInner> sorting = null;

    public VariableInstanceQueryDto() {
    }

    public VariableInstanceQueryDto variableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Filter by variable instance name.
     * @return variableName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVariableName() {
        return variableName;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public VariableInstanceQueryDto variableNameLike(String variableNameLike) {
        this.variableNameLike = variableNameLike;
        return this;
    }

    /**
     * Filter by the variable instance name. The parameter can include the wildcard &#x60;%&#x60; to express like-strategy such as: starts with (&#x60;%&#x60;name), ends with (name&#x60;%&#x60;) or contains (&#x60;%&#x60;name&#x60;%&#x60;).
     * @return variableNameLike
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_NAME_LIKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVariableNameLike() {
        return variableNameLike;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_NAME_LIKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableNameLike(String variableNameLike) {
        this.variableNameLike = variableNameLike;
    }

    public VariableInstanceQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
        this.processInstanceIdIn = processInstanceIdIn;
        return this;
    }

    public VariableInstanceQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
        if (this.processInstanceIdIn == null) {
            this.processInstanceIdIn = new ArrayList<>();
        }
        this.processInstanceIdIn.add(processInstanceIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  process instance ids.
     * @return processInstanceIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getProcessInstanceIdIn() {
        return processInstanceIdIn;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
        this.processInstanceIdIn = processInstanceIdIn;
    }

    public VariableInstanceQueryDto executionIdIn(List<String> executionIdIn) {
        this.executionIdIn = executionIdIn;
        return this;
    }

    public VariableInstanceQueryDto addExecutionIdInItem(String executionIdInItem) {
        if (this.executionIdIn == null) {
            this.executionIdIn = new ArrayList<>();
        }
        this.executionIdIn.add(executionIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  execution ids.
     * @return executionIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getExecutionIdIn() {
        return executionIdIn;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutionIdIn(List<String> executionIdIn) {
        this.executionIdIn = executionIdIn;
    }

    public VariableInstanceQueryDto caseInstanceIdIn(List<String> caseInstanceIdIn) {
        this.caseInstanceIdIn = caseInstanceIdIn;
        return this;
    }

    public VariableInstanceQueryDto addCaseInstanceIdInItem(String caseInstanceIdInItem) {
        if (this.caseInstanceIdIn == null) {
            this.caseInstanceIdIn = new ArrayList<>();
        }
        this.caseInstanceIdIn.add(caseInstanceIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  case instance ids.
     * @return caseInstanceIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getCaseInstanceIdIn() {
        return caseInstanceIdIn;
    }

    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseInstanceIdIn(List<String> caseInstanceIdIn) {
        this.caseInstanceIdIn = caseInstanceIdIn;
    }

    public VariableInstanceQueryDto caseExecutionIdIn(List<String> caseExecutionIdIn) {
        this.caseExecutionIdIn = caseExecutionIdIn;
        return this;
    }

    public VariableInstanceQueryDto addCaseExecutionIdInItem(String caseExecutionIdInItem) {
        if (this.caseExecutionIdIn == null) {
            this.caseExecutionIdIn = new ArrayList<>();
        }
        this.caseExecutionIdIn.add(caseExecutionIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  case execution ids.
     * @return caseExecutionIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getCaseExecutionIdIn() {
        return caseExecutionIdIn;
    }

    @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseExecutionIdIn(List<String> caseExecutionIdIn) {
        this.caseExecutionIdIn = caseExecutionIdIn;
    }

    public VariableInstanceQueryDto taskIdIn(List<String> taskIdIn) {
        this.taskIdIn = taskIdIn;
        return this;
    }

    public VariableInstanceQueryDto addTaskIdInItem(String taskIdInItem) {
        if (this.taskIdIn == null) {
            this.taskIdIn = new ArrayList<>();
        }
        this.taskIdIn.add(taskIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  task ids.
     * @return taskIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TASK_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTaskIdIn() {
        return taskIdIn;
    }

    @JsonProperty(JSON_PROPERTY_TASK_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTaskIdIn(List<String> taskIdIn) {
        this.taskIdIn = taskIdIn;
    }

    public VariableInstanceQueryDto batchIdIn(List<String> batchIdIn) {
        this.batchIdIn = batchIdIn;
        return this;
    }

    public VariableInstanceQueryDto addBatchIdInItem(String batchIdInItem) {
        if (this.batchIdIn == null) {
            this.batchIdIn = new ArrayList<>();
        }
        this.batchIdIn.add(batchIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  batch ids.
     * @return batchIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getBatchIdIn() {
        return batchIdIn;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBatchIdIn(List<String> batchIdIn) {
        this.batchIdIn = batchIdIn;
    }

    public VariableInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
        this.activityInstanceIdIn = activityInstanceIdIn;
        return this;
    }

    public VariableInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
        if (this.activityInstanceIdIn == null) {
            this.activityInstanceIdIn = new ArrayList<>();
        }
        this.activityInstanceIdIn.add(activityInstanceIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  activity instance ids.
     * @return activityInstanceIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getActivityInstanceIdIn() {
        return activityInstanceIdIn;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
        this.activityInstanceIdIn = activityInstanceIdIn;
    }

    public VariableInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
        this.tenantIdIn = tenantIdIn;
        return this;
    }

    public VariableInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
        if (this.tenantIdIn == null) {
            this.tenantIdIn = new ArrayList<>();
        }
        this.tenantIdIn.add(tenantIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of the passed  tenant ids.
     * @return tenantIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TENANT_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTenantIdIn() {
        return tenantIdIn;
    }

    @JsonProperty(JSON_PROPERTY_TENANT_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTenantIdIn(List<String> tenantIdIn) {
        this.tenantIdIn = tenantIdIn;
    }

    public VariableInstanceQueryDto variableValues(List<VariableQueryParameterDto> variableValues) {
        this.variableValues = variableValues;
        return this;
    }

    public VariableInstanceQueryDto addVariableValuesItem(VariableQueryParameterDto variableValuesItem) {
        if (this.variableValues == null) {
            this.variableValues = new ArrayList<>();
        }
        this.variableValues.add(variableValuesItem);
        return this;
    }

    /**
     * An array to only include variable instances that have the certain values. The array consists of objects with the three properties &#x60;name&#x60;, &#x60;operator&#x60; and &#x60;value&#x60;. &#x60;name (String)&#x60; is the variable name, &#x60;operator (String)&#x60; is the comparison operator to be used and &#x60;value&#x60; the variable value. &#x60;value&#x60; may be &#x60;String&#x60;, &#x60;Number&#x60; or &#x60;Boolean&#x60;.  Valid operator values are: &#x60;eq&#x60; - equal to; &#x60;neq&#x60; - not equal to; &#x60;gt&#x60; - greater than; &#x60;gteq&#x60; - greater than or equal to; &#x60;lt&#x60; - lower than; &#x60;lteq&#x60; - lower than or equal to; &#x60;like&#x60;
     * @return variableValues
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<VariableQueryParameterDto> getVariableValues() {
        return variableValues;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableValues(List<VariableQueryParameterDto> variableValues) {
        this.variableValues = variableValues;
    }

    public VariableInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
        this.variableNamesIgnoreCase = variableNamesIgnoreCase;
        return this;
    }

    /**
     * Match all variable names provided in &#x60;variableValues&#x60; case-insensitively. If set to &#x60;true&#x60; **variableName** and **variablename** are treated as equal.
     * @return variableNamesIgnoreCase
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getVariableNamesIgnoreCase() {
        return variableNamesIgnoreCase;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
        this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    }

    public VariableInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
        this.variableValuesIgnoreCase = variableValuesIgnoreCase;
        return this;
    }

    /**
     * Match all variable values provided in &#x60;variableValues&#x60; case-insensitively. If set to &#x60;true&#x60; **variableValue** and **variablevalue** are treated as equal.
     * @return variableValuesIgnoreCase
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getVariableValuesIgnoreCase() {
        return variableValuesIgnoreCase;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
        this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    }

    public VariableInstanceQueryDto variableScopeIdIn(List<String> variableScopeIdIn) {
        this.variableScopeIdIn = variableScopeIdIn;
        return this;
    }

    public VariableInstanceQueryDto addVariableScopeIdInItem(String variableScopeIdInItem) {
        if (this.variableScopeIdIn == null) {
            this.variableScopeIdIn = new ArrayList<>();
        }
        this.variableScopeIdIn.add(variableScopeIdInItem);
        return this;
    }

    /**
     * Only include variable instances which belong to one of passed scope ids.
     * @return variableScopeIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_SCOPE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getVariableScopeIdIn() {
        return variableScopeIdIn;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_SCOPE_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableScopeIdIn(List<String> variableScopeIdIn) {
        this.variableScopeIdIn = variableScopeIdIn;
    }

    public VariableInstanceQueryDto sorting(List<VariableInstanceQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
        return this;
    }

    public VariableInstanceQueryDto addSortingItem(VariableInstanceQueryDtoSortingInner sortingItem) {
        if (this.sorting == null) {
            this.sorting = new ArrayList<>();
        }
        this.sorting.add(sortingItem);
        return this;
    }

    /**
     * An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for &#x60;count&#x60; endpoints
     * @return sorting
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<VariableInstanceQueryDtoSortingInner> getSorting() {
        return sorting;
    }

    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSorting(List<VariableInstanceQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableInstanceQueryDto variableInstanceQueryDto = (VariableInstanceQueryDto) o;
        return Objects.equals(this.variableName, variableInstanceQueryDto.variableName) &&
            Objects.equals(this.variableNameLike, variableInstanceQueryDto.variableNameLike) &&
            Objects.equals(this.processInstanceIdIn, variableInstanceQueryDto.processInstanceIdIn) &&
            Objects.equals(this.executionIdIn, variableInstanceQueryDto.executionIdIn) &&
            Objects.equals(this.caseInstanceIdIn, variableInstanceQueryDto.caseInstanceIdIn) &&
            Objects.equals(this.caseExecutionIdIn, variableInstanceQueryDto.caseExecutionIdIn) &&
            Objects.equals(this.taskIdIn, variableInstanceQueryDto.taskIdIn) &&
            Objects.equals(this.batchIdIn, variableInstanceQueryDto.batchIdIn) &&
            Objects.equals(this.activityInstanceIdIn, variableInstanceQueryDto.activityInstanceIdIn) &&
            Objects.equals(this.tenantIdIn, variableInstanceQueryDto.tenantIdIn) &&
            Objects.equals(this.variableValues, variableInstanceQueryDto.variableValues) &&
            Objects.equals(this.variableNamesIgnoreCase, variableInstanceQueryDto.variableNamesIgnoreCase) &&
            Objects.equals(this.variableValuesIgnoreCase, variableInstanceQueryDto.variableValuesIgnoreCase) &&
            Objects.equals(this.variableScopeIdIn, variableInstanceQueryDto.variableScopeIdIn) &&
            Objects.equals(this.sorting, variableInstanceQueryDto.sorting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableName, variableNameLike, processInstanceIdIn, executionIdIn, caseInstanceIdIn, caseExecutionIdIn, taskIdIn, batchIdIn, activityInstanceIdIn, tenantIdIn, variableValues, variableNamesIgnoreCase, variableValuesIgnoreCase, variableScopeIdIn, sorting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableInstanceQueryDto {\n");
        sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
        sb.append("    variableNameLike: ").append(toIndentedString(variableNameLike)).append("\n");
        sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
        sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
        sb.append("    caseInstanceIdIn: ").append(toIndentedString(caseInstanceIdIn)).append("\n");
        sb.append("    caseExecutionIdIn: ").append(toIndentedString(caseExecutionIdIn)).append("\n");
        sb.append("    taskIdIn: ").append(toIndentedString(taskIdIn)).append("\n");
        sb.append("    batchIdIn: ").append(toIndentedString(batchIdIn)).append("\n");
        sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
        sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
        sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
        sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
        sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
        sb.append("    variableScopeIdIn: ").append(toIndentedString(variableScopeIdIn)).append("\n");
        sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

