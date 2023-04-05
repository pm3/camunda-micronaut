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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A historic detail query which defines a group of historic details.
 */
@JsonPropertyOrder({
  HistoricDetailQueryDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_PROCESS_INSTANCE_ID_IN,
  HistoricDetailQueryDto.JSON_PROPERTY_EXECUTION_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_TASK_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_CASE_EXECUTION_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_VARIABLE_INSTANCE_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_VARIABLE_TYPE_IN,
  HistoricDetailQueryDto.JSON_PROPERTY_TENANT_ID_IN,
  HistoricDetailQueryDto.JSON_PROPERTY_WITHOUT_TENANT_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_USER_OPERATION_ID,
  HistoricDetailQueryDto.JSON_PROPERTY_FORM_FIELDS,
  HistoricDetailQueryDto.JSON_PROPERTY_VARIABLE_UPDATES,
  HistoricDetailQueryDto.JSON_PROPERTY_EXCLUDE_TASK_DETAILS,
  HistoricDetailQueryDto.JSON_PROPERTY_INITIAL,
  HistoricDetailQueryDto.JSON_PROPERTY_OCCURRED_BEFORE,
  HistoricDetailQueryDto.JSON_PROPERTY_OCCURRED_AFTER,
  HistoricDetailQueryDto.JSON_PROPERTY_SORTING
})
@JsonTypeName("HistoricDetailQueryDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoricDetailQueryDto {
    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID_IN = "processInstanceIdIn";
    private List<String> processInstanceIdIn = null;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_TASK_ID = "taskId";
    private String taskId;

    public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
    private String activityInstanceId;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
    private String caseInstanceId;

    public static final String JSON_PROPERTY_CASE_EXECUTION_ID = "caseExecutionId";
    private String caseExecutionId;

    public static final String JSON_PROPERTY_VARIABLE_INSTANCE_ID = "variableInstanceId";
    private String variableInstanceId;

    public static final String JSON_PROPERTY_VARIABLE_TYPE_IN = "variableTypeIn";
    private List<String> variableTypeIn = null;

    public static final String JSON_PROPERTY_TENANT_ID_IN = "tenantIdIn";
    private List<String> tenantIdIn = null;

    public static final String JSON_PROPERTY_WITHOUT_TENANT_ID = "withoutTenantId";
    private Boolean withoutTenantId;

    public static final String JSON_PROPERTY_USER_OPERATION_ID = "userOperationId";
    private String userOperationId;

    public static final String JSON_PROPERTY_FORM_FIELDS = "formFields";
    private Boolean formFields;

    public static final String JSON_PROPERTY_VARIABLE_UPDATES = "variableUpdates";
    private Boolean variableUpdates;

    public static final String JSON_PROPERTY_EXCLUDE_TASK_DETAILS = "excludeTaskDetails";
    private Boolean excludeTaskDetails;

    public static final String JSON_PROPERTY_INITIAL = "initial";
    private Boolean initial;

    public static final String JSON_PROPERTY_OCCURRED_BEFORE = "occurredBefore";
    private OffsetDateTime occurredBefore;

    public static final String JSON_PROPERTY_OCCURRED_AFTER = "occurredAfter";
    private OffsetDateTime occurredAfter;

    public static final String JSON_PROPERTY_SORTING = "sorting";
    private List<HistoricDetailQueryDtoSortingInner> sorting = null;

    public HistoricDetailQueryDto() {
    }

    public HistoricDetailQueryDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * Filter by process instance id.
     * @return processInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public HistoricDetailQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
        this.processInstanceIdIn = processInstanceIdIn;
        return this;
    }

    public HistoricDetailQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
        if (this.processInstanceIdIn == null) {
            this.processInstanceIdIn = new ArrayList<>();
        }
        this.processInstanceIdIn.add(processInstanceIdInItem);
        return this;
    }

    /**
     * Only include historic details which belong to one of the passed  process instance ids.
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

    public HistoricDetailQueryDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * Filter by execution id.
     * @return executionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExecutionId() {
        return executionId;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public HistoricDetailQueryDto taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Filter by task id.
     * @return taskId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTaskId() {
        return taskId;
    }

    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public HistoricDetailQueryDto activityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }

    /**
     * Filter by activity instance id.
     * @return activityInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivityInstanceId() {
        return activityInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    public HistoricDetailQueryDto caseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
        return this;
    }

    /**
     * Filter by case instance id.
     * @return caseInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseInstanceId() {
        return caseInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
    }

    public HistoricDetailQueryDto caseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
        return this;
    }

    /**
     * Filter by case execution id.
     * @return caseExecutionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseExecutionId() {
        return caseExecutionId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
    }

    public HistoricDetailQueryDto variableInstanceId(String variableInstanceId) {
        this.variableInstanceId = variableInstanceId;
        return this;
    }

    /**
     * Filter by variable instance id.
     * @return variableInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVariableInstanceId() {
        return variableInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableInstanceId(String variableInstanceId) {
        this.variableInstanceId = variableInstanceId;
    }

    public HistoricDetailQueryDto variableTypeIn(List<String> variableTypeIn) {
        this.variableTypeIn = variableTypeIn;
        return this;
    }

    public HistoricDetailQueryDto addVariableTypeInItem(String variableTypeInItem) {
        if (this.variableTypeIn == null) {
            this.variableTypeIn = new ArrayList<>();
        }
        this.variableTypeIn.add(variableTypeInItem);
        return this;
    }

    /**
     * Only include historic details where the variable updates belong to one of the passed  list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type &#x60;serializable&#x60;.
     * @return variableTypeIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_TYPE_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getVariableTypeIn() {
        return variableTypeIn;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_TYPE_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableTypeIn(List<String> variableTypeIn) {
        this.variableTypeIn = variableTypeIn;
    }

    public HistoricDetailQueryDto tenantIdIn(List<String> tenantIdIn) {
        this.tenantIdIn = tenantIdIn;
        return this;
    }

    public HistoricDetailQueryDto addTenantIdInItem(String tenantIdInItem) {
        if (this.tenantIdIn == null) {
            this.tenantIdIn = new ArrayList<>();
        }
        this.tenantIdIn.add(tenantIdInItem);
        return this;
    }

    /**
     * Filter by a  list of tenant ids.
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

    public HistoricDetailQueryDto withoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
        return this;
    }

    /**
     * Only include historic details that belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return withoutTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getWithoutTenantId() {
        return withoutTenantId;
    }

    @JsonProperty(JSON_PROPERTY_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWithoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
    }

    public HistoricDetailQueryDto userOperationId(String userOperationId) {
        this.userOperationId = userOperationId;
        return this;
    }

    /**
     * Filter by a user operation id.
     * @return userOperationId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_USER_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUserOperationId() {
        return userOperationId;
    }

    @JsonProperty(JSON_PROPERTY_USER_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserOperationId(String userOperationId) {
        this.userOperationId = userOperationId;
    }

    public HistoricDetailQueryDto formFields(Boolean formFields) {
        this.formFields = formFields;
        return this;
    }

    /**
     * Only include &#x60;HistoricFormFields&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return formFields
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getFormFields() {
        return formFields;
    }

    @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormFields(Boolean formFields) {
        this.formFields = formFields;
    }

    public HistoricDetailQueryDto variableUpdates(Boolean variableUpdates) {
        this.variableUpdates = variableUpdates;
        return this;
    }

    /**
     * Only include &#x60;HistoricVariableUpdates&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return variableUpdates
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_UPDATES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getVariableUpdates() {
        return variableUpdates;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_UPDATES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableUpdates(Boolean variableUpdates) {
        this.variableUpdates = variableUpdates;
    }

    public HistoricDetailQueryDto excludeTaskDetails(Boolean excludeTaskDetails) {
        this.excludeTaskDetails = excludeTaskDetails;
        return this;
    }

    /**
     * Excludes all task-related &#x60;HistoricDetails&#x60;, so only items which have no task id set will be selected. When this parameter is used together with &#x60;taskId&#x60;, this call is ignored and task details are not excluded. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return excludeTaskDetails
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXCLUDE_TASK_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getExcludeTaskDetails() {
        return excludeTaskDetails;
    }

    @JsonProperty(JSON_PROPERTY_EXCLUDE_TASK_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExcludeTaskDetails(Boolean excludeTaskDetails) {
        this.excludeTaskDetails = excludeTaskDetails;
    }

    public HistoricDetailQueryDto initial(Boolean initial) {
        this.initial = initial;
        return this;
    }

    /**
     * Restrict to historic variable updates that contain only initial variable values. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return initial
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INITIAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getInitial() {
        return initial;
    }

    @JsonProperty(JSON_PROPERTY_INITIAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInitial(Boolean initial) {
        this.initial = initial;
    }

    public HistoricDetailQueryDto occurredBefore(OffsetDateTime occurredBefore) {
        this.occurredBefore = occurredBefore;
        return this;
    }

    /**
     * Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., 2013-01-23T14:42:45.000+0200.
     * @return occurredBefore
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OCCURRED_BEFORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getOccurredBefore() {
        return occurredBefore;
    }

    @JsonProperty(JSON_PROPERTY_OCCURRED_BEFORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setOccurredBefore(OffsetDateTime occurredBefore) {
        this.occurredBefore = occurredBefore;
    }

    public HistoricDetailQueryDto occurredAfter(OffsetDateTime occurredAfter) {
        this.occurredAfter = occurredAfter;
        return this;
    }

    /**
     * Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., 2013-01-23T14:42:45.000+0200.
     * @return occurredAfter
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OCCURRED_AFTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getOccurredAfter() {
        return occurredAfter;
    }

    @JsonProperty(JSON_PROPERTY_OCCURRED_AFTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setOccurredAfter(OffsetDateTime occurredAfter) {
        this.occurredAfter = occurredAfter;
    }

    public HistoricDetailQueryDto sorting(List<HistoricDetailQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
        return this;
    }

    public HistoricDetailQueryDto addSortingItem(HistoricDetailQueryDtoSortingInner sortingItem) {
        if (this.sorting == null) {
            this.sorting = new ArrayList<>();
        }
        this.sorting.add(sortingItem);
        return this;
    }

    /**
     * A JSON array of criteria to sort the result by. Each element of the array is                     a JSON object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Does not have an effect for the &#x60;count&#x60; endpoint.
     * @return sorting
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<HistoricDetailQueryDtoSortingInner> getSorting() {
        return sorting;
    }

    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSorting(List<HistoricDetailQueryDtoSortingInner> sorting) {
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
        HistoricDetailQueryDto historicDetailQueryDto = (HistoricDetailQueryDto) o;
        return Objects.equals(this.processInstanceId, historicDetailQueryDto.processInstanceId) &&
            Objects.equals(this.processInstanceIdIn, historicDetailQueryDto.processInstanceIdIn) &&
            Objects.equals(this.executionId, historicDetailQueryDto.executionId) &&
            Objects.equals(this.taskId, historicDetailQueryDto.taskId) &&
            Objects.equals(this.activityInstanceId, historicDetailQueryDto.activityInstanceId) &&
            Objects.equals(this.caseInstanceId, historicDetailQueryDto.caseInstanceId) &&
            Objects.equals(this.caseExecutionId, historicDetailQueryDto.caseExecutionId) &&
            Objects.equals(this.variableInstanceId, historicDetailQueryDto.variableInstanceId) &&
            Objects.equals(this.variableTypeIn, historicDetailQueryDto.variableTypeIn) &&
            Objects.equals(this.tenantIdIn, historicDetailQueryDto.tenantIdIn) &&
            Objects.equals(this.withoutTenantId, historicDetailQueryDto.withoutTenantId) &&
            Objects.equals(this.userOperationId, historicDetailQueryDto.userOperationId) &&
            Objects.equals(this.formFields, historicDetailQueryDto.formFields) &&
            Objects.equals(this.variableUpdates, historicDetailQueryDto.variableUpdates) &&
            Objects.equals(this.excludeTaskDetails, historicDetailQueryDto.excludeTaskDetails) &&
            Objects.equals(this.initial, historicDetailQueryDto.initial) &&
            Objects.equals(this.occurredBefore, historicDetailQueryDto.occurredBefore) &&
            Objects.equals(this.occurredAfter, historicDetailQueryDto.occurredAfter) &&
            Objects.equals(this.sorting, historicDetailQueryDto.sorting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInstanceId, processInstanceIdIn, executionId, taskId, activityInstanceId, caseInstanceId, caseExecutionId, variableInstanceId, variableTypeIn, tenantIdIn, withoutTenantId, userOperationId, formFields, variableUpdates, excludeTaskDetails, initial, occurredBefore, occurredAfter, sorting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricDetailQueryDto {\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
        sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
        sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
        sb.append("    variableInstanceId: ").append(toIndentedString(variableInstanceId)).append("\n");
        sb.append("    variableTypeIn: ").append(toIndentedString(variableTypeIn)).append("\n");
        sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
        sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
        sb.append("    userOperationId: ").append(toIndentedString(userOperationId)).append("\n");
        sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
        sb.append("    variableUpdates: ").append(toIndentedString(variableUpdates)).append("\n");
        sb.append("    excludeTaskDetails: ").append(toIndentedString(excludeTaskDetails)).append("\n");
        sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
        sb.append("    occurredBefore: ").append(toIndentedString(occurredBefore)).append("\n");
        sb.append("    occurredAfter: ").append(toIndentedString(occurredAfter)).append("\n");
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

