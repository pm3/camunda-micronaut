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
import java.util.Objects;

/**
 * HistoricExternalTaskLogDto
 */
@JsonPropertyOrder({
  HistoricExternalTaskLogDto.JSON_PROPERTY_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_EXTERNAL_TASK_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_TIMESTAMP,
  HistoricExternalTaskLogDto.JSON_PROPERTY_TOPIC_NAME,
  HistoricExternalTaskLogDto.JSON_PROPERTY_WORKER_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_RETRIES,
  HistoricExternalTaskLogDto.JSON_PROPERTY_PRIORITY,
  HistoricExternalTaskLogDto.JSON_PROPERTY_ERROR_MESSAGE,
  HistoricExternalTaskLogDto.JSON_PROPERTY_ACTIVITY_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_EXECUTION_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricExternalTaskLogDto.JSON_PROPERTY_TENANT_ID,
  HistoricExternalTaskLogDto.JSON_PROPERTY_CREATION_LOG,
  HistoricExternalTaskLogDto.JSON_PROPERTY_FAILURE_LOG,
  HistoricExternalTaskLogDto.JSON_PROPERTY_SUCCESS_LOG,
  HistoricExternalTaskLogDto.JSON_PROPERTY_DELETION_LOG,
  HistoricExternalTaskLogDto.JSON_PROPERTY_REMOVAL_TIME,
  HistoricExternalTaskLogDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID
})
@JsonTypeName("HistoricExternalTaskLogDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoricExternalTaskLogDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_EXTERNAL_TASK_ID = "externalTaskId";
    private String externalTaskId;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private OffsetDateTime timestamp;

    public static final String JSON_PROPERTY_TOPIC_NAME = "topicName";
    private String topicName;

    public static final String JSON_PROPERTY_WORKER_ID = "workerId";
    private String workerId;

    public static final String JSON_PROPERTY_RETRIES = "retries";
    private Integer retries;

    public static final String JSON_PROPERTY_PRIORITY = "priority";
    private Long priority;

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
    private String activityId;

    public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
    private String activityInstanceId;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_CREATION_LOG = "creationLog";
    private Boolean creationLog;

    public static final String JSON_PROPERTY_FAILURE_LOG = "failureLog";
    private Boolean failureLog;

    public static final String JSON_PROPERTY_SUCCESS_LOG = "successLog";
    private Boolean successLog;

    public static final String JSON_PROPERTY_DELETION_LOG = "deletionLog";
    private Boolean deletionLog;

    public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
    private OffsetDateTime removalTime;

    public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
    private String rootProcessInstanceId;

    public HistoricExternalTaskLogDto() {
    }

    public HistoricExternalTaskLogDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the log entry.
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

    public HistoricExternalTaskLogDto externalTaskId(String externalTaskId) {
        this.externalTaskId = externalTaskId;
        return this;
    }

    /**
     * The id of the external task.
     * @return externalTaskId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXTERNAL_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExternalTaskId() {
        return externalTaskId;
    }

    @JsonProperty(JSON_PROPERTY_EXTERNAL_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExternalTaskId(String externalTaskId) {
        this.externalTaskId = externalTaskId;
    }

    public HistoricExternalTaskLogDto timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The time when the log entry has been written.
     * @return timestamp
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public HistoricExternalTaskLogDto topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * The topic name of the associated external task.
     * @return topicName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTopicName() {
        return topicName;
    }

    @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public HistoricExternalTaskLogDto workerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * The id of the worker that posessed the most recent lock.
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

    public HistoricExternalTaskLogDto retries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * The number of retries the associated external task has left.
     * @return retries
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_RETRIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty(JSON_PROPERTY_RETRIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public HistoricExternalTaskLogDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The execution priority the external task had when the log entry was created.
     * @return priority
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PRIORITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getPriority() {
        return priority;
    }

    @JsonProperty(JSON_PROPERTY_PRIORITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public HistoricExternalTaskLogDto errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * The message of the error that occurred by executing the associated external task.
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

    public HistoricExternalTaskLogDto activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The id of the activity on which the associated external task was created.
     * @return activityId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivityId() {
        return activityId;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public HistoricExternalTaskLogDto activityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }

    /**
     * The id of the activity instance on which the associated external task was created.
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

    public HistoricExternalTaskLogDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * The execution id on which the associated external task was created.
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

    public HistoricExternalTaskLogDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance on which the associated external task was created.
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

    public HistoricExternalTaskLogDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition which the associated external task belongs to.
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

    public HistoricExternalTaskLogDto processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The key of the process definition which the associated external task belongs to.
     * @return processDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public HistoricExternalTaskLogDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The id of the tenant that this historic external task log entry belongs to.
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

    public HistoricExternalTaskLogDto creationLog(Boolean creationLog) {
        this.creationLog = creationLog;
        return this;
    }

    /**
     * A flag indicating whether this log represents the creation of the associated external task.
     * @return creationLog
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATION_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCreationLog() {
        return creationLog;
    }

    @JsonProperty(JSON_PROPERTY_CREATION_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreationLog(Boolean creationLog) {
        this.creationLog = creationLog;
    }

    public HistoricExternalTaskLogDto failureLog(Boolean failureLog) {
        this.failureLog = failureLog;
        return this;
    }

    /**
     * A flag indicating whether this log represents the failed execution of the associated external task.
     * @return failureLog
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILURE_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getFailureLog() {
        return failureLog;
    }

    @JsonProperty(JSON_PROPERTY_FAILURE_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailureLog(Boolean failureLog) {
        this.failureLog = failureLog;
    }

    public HistoricExternalTaskLogDto successLog(Boolean successLog) {
        this.successLog = successLog;
        return this;
    }

    /**
     * A flag indicating whether this log represents the successful execution of the associated external task.
     * @return successLog
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUCCESS_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSuccessLog() {
        return successLog;
    }

    @JsonProperty(JSON_PROPERTY_SUCCESS_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuccessLog(Boolean successLog) {
        this.successLog = successLog;
    }

    public HistoricExternalTaskLogDto deletionLog(Boolean deletionLog) {
        this.deletionLog = deletionLog;
        return this;
    }

    /**
     * A flag indicating whether this log represents the deletion of the associated external task.
     * @return deletionLog
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DELETION_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDeletionLog() {
        return deletionLog;
    }

    @JsonProperty(JSON_PROPERTY_DELETION_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDeletionLog(Boolean deletionLog) {
        this.deletionLog = deletionLog;
    }

    public HistoricExternalTaskLogDto removalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
        return this;
    }

    /**
     * The time after which this log should be removed by the History Cleanup job. Default format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.  For further information, please see the [documentation](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/)
     * @return removalTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getRemovalTime() {
        return removalTime;
    }

    @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setRemovalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
    }

    public HistoricExternalTaskLogDto rootProcessInstanceId(String rootProcessInstanceId) {
        this.rootProcessInstanceId = rootProcessInstanceId;
        return this;
    }

    /**
     * The process instance id of the root process instance that initiated the process containing this log.
     * @return rootProcessInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRootProcessInstanceId() {
        return rootProcessInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRootProcessInstanceId(String rootProcessInstanceId) {
        this.rootProcessInstanceId = rootProcessInstanceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoricExternalTaskLogDto historicExternalTaskLogDto = (HistoricExternalTaskLogDto) o;
        return Objects.equals(this.id, historicExternalTaskLogDto.id) &&
            Objects.equals(this.externalTaskId, historicExternalTaskLogDto.externalTaskId) &&
            Objects.equals(this.timestamp, historicExternalTaskLogDto.timestamp) &&
            Objects.equals(this.topicName, historicExternalTaskLogDto.topicName) &&
            Objects.equals(this.workerId, historicExternalTaskLogDto.workerId) &&
            Objects.equals(this.retries, historicExternalTaskLogDto.retries) &&
            Objects.equals(this.priority, historicExternalTaskLogDto.priority) &&
            Objects.equals(this.errorMessage, historicExternalTaskLogDto.errorMessage) &&
            Objects.equals(this.activityId, historicExternalTaskLogDto.activityId) &&
            Objects.equals(this.activityInstanceId, historicExternalTaskLogDto.activityInstanceId) &&
            Objects.equals(this.executionId, historicExternalTaskLogDto.executionId) &&
            Objects.equals(this.processInstanceId, historicExternalTaskLogDto.processInstanceId) &&
            Objects.equals(this.processDefinitionId, historicExternalTaskLogDto.processDefinitionId) &&
            Objects.equals(this.processDefinitionKey, historicExternalTaskLogDto.processDefinitionKey) &&
            Objects.equals(this.tenantId, historicExternalTaskLogDto.tenantId) &&
            Objects.equals(this.creationLog, historicExternalTaskLogDto.creationLog) &&
            Objects.equals(this.failureLog, historicExternalTaskLogDto.failureLog) &&
            Objects.equals(this.successLog, historicExternalTaskLogDto.successLog) &&
            Objects.equals(this.deletionLog, historicExternalTaskLogDto.deletionLog) &&
            Objects.equals(this.removalTime, historicExternalTaskLogDto.removalTime) &&
            Objects.equals(this.rootProcessInstanceId, historicExternalTaskLogDto.rootProcessInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, externalTaskId, timestamp, topicName, workerId, retries, priority, errorMessage, activityId, activityInstanceId, executionId, processInstanceId, processDefinitionId, processDefinitionKey, tenantId, creationLog, failureLog, successLog, deletionLog, removalTime, rootProcessInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricExternalTaskLogDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
        sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    creationLog: ").append(toIndentedString(creationLog)).append("\n");
        sb.append("    failureLog: ").append(toIndentedString(failureLog)).append("\n");
        sb.append("    successLog: ").append(toIndentedString(successLog)).append("\n");
        sb.append("    deletionLog: ").append(toIndentedString(deletionLog)).append("\n");
        sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
        sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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
