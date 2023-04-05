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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TaskDto
 */
@JsonPropertyOrder({
  TaskDto.JSON_PROPERTY_ID,
  TaskDto.JSON_PROPERTY_NAME,
  TaskDto.JSON_PROPERTY_ASSIGNEE,
  TaskDto.JSON_PROPERTY_OWNER,
  TaskDto.JSON_PROPERTY_CREATED,
  TaskDto.JSON_PROPERTY_LAST_UPDATED,
  TaskDto.JSON_PROPERTY_DUE,
  TaskDto.JSON_PROPERTY_FOLLOW_UP,
  TaskDto.JSON_PROPERTY_DELEGATION_STATE,
  TaskDto.JSON_PROPERTY_DESCRIPTION,
  TaskDto.JSON_PROPERTY_EXECUTION_ID,
  TaskDto.JSON_PROPERTY_PARENT_TASK_ID,
  TaskDto.JSON_PROPERTY_PRIORITY,
  TaskDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  TaskDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  TaskDto.JSON_PROPERTY_CASE_EXECUTION_ID,
  TaskDto.JSON_PROPERTY_CASE_DEFINITION_ID,
  TaskDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  TaskDto.JSON_PROPERTY_TASK_DEFINITION_KEY,
  TaskDto.JSON_PROPERTY_SUSPENDED,
  TaskDto.JSON_PROPERTY_FORM_KEY,
  TaskDto.JSON_PROPERTY_CAMUNDA_FORM_REF,
  TaskDto.JSON_PROPERTY_TENANT_ID
})
@JsonTypeName("TaskDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class TaskDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
    private String assignee;

    public static final String JSON_PROPERTY_OWNER = "owner";
    private String owner;

    public static final String JSON_PROPERTY_CREATED = "created";
    private OffsetDateTime created;

    public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
    private OffsetDateTime lastUpdated;

    public static final String JSON_PROPERTY_DUE = "due";
    private OffsetDateTime due;

    public static final String JSON_PROPERTY_FOLLOW_UP = "followUp";
    private OffsetDateTime followUp;

    /**
     * The task&#39;s delegation state. Possible values are &#x60;PENDING&#x60; and &#x60;RESOLVED&#x60;.
     */
    public enum DelegationStateEnum {
        PENDING("PENDING"),
        RESOLVED("RESOLVED");

        private String value;

        DelegationStateEnum(String value) {
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
        public static DelegationStateEnum fromValue(String value) {
            for (DelegationStateEnum b : DelegationStateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }
    public static final String JSON_PROPERTY_DELEGATION_STATE = "delegationState";
    private DelegationStateEnum delegationState;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_PARENT_TASK_ID = "parentTaskId";
    private String parentTaskId;

    public static final String JSON_PROPERTY_PRIORITY = "priority";
    private Integer priority;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_CASE_EXECUTION_ID = "caseExecutionId";
    private String caseExecutionId;

    public static final String JSON_PROPERTY_CASE_DEFINITION_ID = "caseDefinitionId";
    private String caseDefinitionId;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
    private String caseInstanceId;

    public static final String JSON_PROPERTY_TASK_DEFINITION_KEY = "taskDefinitionKey";
    private String taskDefinitionKey;

    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public static final String JSON_PROPERTY_FORM_KEY = "formKey";
    private String formKey;

    public static final String JSON_PROPERTY_CAMUNDA_FORM_REF = "camundaFormRef";
    private Map<String, CamundaFormRef> camundaFormRef = null;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public TaskDto() {
    }

    public TaskDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The task id.
     * @return id
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public TaskDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The task name.
     * @return name
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public TaskDto assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * The assignee&#39;s id.
     * @return assignee
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ASSIGNEE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAssignee() {
        return assignee;
    }

    @JsonProperty(JSON_PROPERTY_ASSIGNEE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public TaskDto owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The owner&#39;s id.
     * @return owner
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOwner() {
        return owner;
    }

    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskDto created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * The date the task was created on. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return created
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getCreated() {
        return created;
    }

    @JsonProperty(JSON_PROPERTY_CREATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public TaskDto lastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * The date the task was last updated. Every action that fires a [task update event](https://docs.camunda.org/manual/7.18/user-guide/process-engine/delegation-code/#task-listener-event-lifecycle) will update this property. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return lastUpdated
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public TaskDto due(OffsetDateTime due) {
        this.due = due;
        return this;
    }

    /**
     * The task&#39;s due date. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return due
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDue() {
        return due;
    }

    @JsonProperty(JSON_PROPERTY_DUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDue(OffsetDateTime due) {
        this.due = due;
    }

    public TaskDto followUp(OffsetDateTime followUp) {
        this.followUp = followUp;
        return this;
    }

    /**
     * The follow-up date for the task. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return followUp
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FOLLOW_UP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getFollowUp() {
        return followUp;
    }

    @JsonProperty(JSON_PROPERTY_FOLLOW_UP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setFollowUp(OffsetDateTime followUp) {
        this.followUp = followUp;
    }

    public TaskDto delegationState(DelegationStateEnum delegationState) {
        this.delegationState = delegationState;
        return this;
    }

    /**
     * The task&#39;s delegation state. Possible values are &#x60;PENDING&#x60; and &#x60;RESOLVED&#x60;.
     * @return delegationState
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DELEGATION_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DelegationStateEnum getDelegationState() {
        return delegationState;
    }

    @JsonProperty(JSON_PROPERTY_DELEGATION_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDelegationState(DelegationStateEnum delegationState) {
        this.delegationState = delegationState;
    }

    public TaskDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The task&#39;s description.
     * @return description
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public TaskDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * The id of the execution the task belongs to.
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

    public TaskDto parentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }

    /**
     * The id the parent task, if this task is a subtask.
     * @return parentTaskId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARENT_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getParentTaskId() {
        return parentTaskId;
    }

    @JsonProperty(JSON_PROPERTY_PARENT_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public TaskDto priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The task&#39;s priority.
     * @return priority
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PRIORITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty(JSON_PROPERTY_PRIORITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public TaskDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition the task belongs to.
     * @return processDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public TaskDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance the task belongs to.
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

    public TaskDto caseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
        return this;
    }

    /**
     * The id of the case execution the task belongs to.
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

    public TaskDto caseDefinitionId(String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
        return this;
    }

    /**
     * The id of the case definition the task belongs to.
     * @return caseDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseDefinitionId() {
        return caseDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseDefinitionId(String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
    }

    public TaskDto caseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
        return this;
    }

    /**
     * The id of the case instance the task belongs to.
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

    public TaskDto taskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
        return this;
    }

    /**
     * The task&#39;s key.
     * @return taskDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTaskDefinitionKey() {
        return taskDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
    }

    public TaskDto suspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * Whether the task belongs to a process instance that is suspended.
     * @return suspended
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUSPENDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSuspended() {
        return suspended;
    }

    @JsonProperty(JSON_PROPERTY_SUSPENDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public TaskDto formKey(String formKey) {
        this.formKey = formKey;
        return this;
    }

    /**
     * If not &#x60;null&#x60;, the form key for the task.
     * @return formKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FORM_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFormKey() {
        return formKey;
    }

    @JsonProperty(JSON_PROPERTY_FORM_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public TaskDto camundaFormRef(Map<String, CamundaFormRef> camundaFormRef) {
        this.camundaFormRef = camundaFormRef;
        return this;
    }

    public TaskDto putCamundaFormRefItem(String key, CamundaFormRef camundaFormRefItem) {
        if (this.camundaFormRef == null) {
            this.camundaFormRef = new HashMap<>();
        }
        this.camundaFormRef.put(key, camundaFormRefItem);
        return this;
  }

    /**
     * A reference to a specific version of a Camunda Form.
     * @return camundaFormRef
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CAMUNDA_FORM_REF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, CamundaFormRef> getCamundaFormRef() {
        return camundaFormRef;
    }

    @JsonProperty(JSON_PROPERTY_CAMUNDA_FORM_REF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCamundaFormRef(Map<String, CamundaFormRef> camundaFormRef) {
        this.camundaFormRef = camundaFormRef;
    }

    public TaskDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * If not &#x60;null&#x60;, the tenant id of the task.
     * @return tenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskDto taskDto = (TaskDto) o;
        return Objects.equals(this.id, taskDto.id) &&
            Objects.equals(this.name, taskDto.name) &&
            Objects.equals(this.assignee, taskDto.assignee) &&
            Objects.equals(this.owner, taskDto.owner) &&
            Objects.equals(this.created, taskDto.created) &&
            Objects.equals(this.lastUpdated, taskDto.lastUpdated) &&
            Objects.equals(this.due, taskDto.due) &&
            Objects.equals(this.followUp, taskDto.followUp) &&
            Objects.equals(this.delegationState, taskDto.delegationState) &&
            Objects.equals(this.description, taskDto.description) &&
            Objects.equals(this.executionId, taskDto.executionId) &&
            Objects.equals(this.parentTaskId, taskDto.parentTaskId) &&
            Objects.equals(this.priority, taskDto.priority) &&
            Objects.equals(this.processDefinitionId, taskDto.processDefinitionId) &&
            Objects.equals(this.processInstanceId, taskDto.processInstanceId) &&
            Objects.equals(this.caseExecutionId, taskDto.caseExecutionId) &&
            Objects.equals(this.caseDefinitionId, taskDto.caseDefinitionId) &&
            Objects.equals(this.caseInstanceId, taskDto.caseInstanceId) &&
            Objects.equals(this.taskDefinitionKey, taskDto.taskDefinitionKey) &&
            Objects.equals(this.suspended, taskDto.suspended) &&
            Objects.equals(this.formKey, taskDto.formKey) &&
            Objects.equals(this.camundaFormRef, taskDto.camundaFormRef) &&
            Objects.equals(this.tenantId, taskDto.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, assignee, owner, created, lastUpdated, due, followUp, delegationState, description, executionId, parentTaskId, priority, processDefinitionId, processInstanceId, caseExecutionId, caseDefinitionId, caseInstanceId, taskDefinitionKey, suspended, formKey, camundaFormRef, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    due: ").append(toIndentedString(due)).append("\n");
        sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
        sb.append("    delegationState: ").append(toIndentedString(delegationState)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
        sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
        sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
        sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
        sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
        sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
        sb.append("    camundaFormRef: ").append(toIndentedString(camundaFormRef)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

