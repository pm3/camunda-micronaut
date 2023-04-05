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
 * JobDto
 */
@JsonPropertyOrder({
  JobDto.JSON_PROPERTY_ID,
  JobDto.JSON_PROPERTY_JOB_DEFINITION_ID,
  JobDto.JSON_PROPERTY_DUE_DATE,
  JobDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  JobDto.JSON_PROPERTY_EXECUTION_ID,
  JobDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  JobDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  JobDto.JSON_PROPERTY_RETRIES,
  JobDto.JSON_PROPERTY_EXCEPTION_MESSAGE,
  JobDto.JSON_PROPERTY_FAILED_ACTIVITY_ID,
  JobDto.JSON_PROPERTY_SUSPENDED,
  JobDto.JSON_PROPERTY_PRIORITY,
  JobDto.JSON_PROPERTY_TENANT_ID,
  JobDto.JSON_PROPERTY_CREATE_TIME
})
@JsonTypeName("JobDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class JobDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_JOB_DEFINITION_ID = "jobDefinitionId";
    private String jobDefinitionId;

    public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
    private OffsetDateTime dueDate;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_RETRIES = "retries";
    private Integer retries;

    public static final String JSON_PROPERTY_EXCEPTION_MESSAGE = "exceptionMessage";
    private String exceptionMessage;

    public static final String JSON_PROPERTY_FAILED_ACTIVITY_ID = "failedActivityId";
    private String failedActivityId;

    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public static final String JSON_PROPERTY_PRIORITY = "priority";
    private Long priority;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
    private OffsetDateTime createTime;

    public JobDto() {
    }

    public JobDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the job.
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

    public JobDto jobDefinitionId(String jobDefinitionId) {
        this.jobDefinitionId = jobDefinitionId;
        return this;
    }

    /**
     * The id of the associated job definition.
     * @return jobDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getJobDefinitionId() {
        return jobDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setJobDefinitionId(String jobDefinitionId) {
        this.jobDefinitionId = jobDefinitionId;
    }

    public JobDto dueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * The date on which this job is supposed to be processed.
     * @return dueDate
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DUE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    @JsonProperty(JSON_PROPERTY_DUE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public JobDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance which execution created the job.
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

    public JobDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * The specific execution id on which the job was created.
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

    public JobDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition which this job belongs to.
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

    public JobDto processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The key of the process definition which this job belongs to.
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

    public JobDto retries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * The number of retries this job has left.
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

    public JobDto exceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
        return this;
    }

    /**
     * The message of the exception that occurred, the last time the job was executed. Is null when no exception occurred.
     * @return exceptionMessage
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXCEPTION_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    @JsonProperty(JSON_PROPERTY_EXCEPTION_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public JobDto failedActivityId(String failedActivityId) {
        this.failedActivityId = failedActivityId;
        return this;
    }

    /**
     * The id of the activity on which the last exception occurred, the last time the job was executed. Is null when no exception occurred.
     * @return failedActivityId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILED_ACTIVITY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFailedActivityId() {
        return failedActivityId;
    }

    @JsonProperty(JSON_PROPERTY_FAILED_ACTIVITY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailedActivityId(String failedActivityId) {
        this.failedActivityId = failedActivityId;
    }

    public JobDto suspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * A flag indicating whether the job is suspended or not.
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

    public JobDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The job&#39;s priority for execution.
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

    public JobDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The id of the tenant which this job belongs to.
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

    public JobDto createTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * The date on which this job has been created.
     * @return createTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    @JsonProperty(JSON_PROPERTY_CREATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobDto jobDto = (JobDto) o;
        return Objects.equals(this.id, jobDto.id) &&
            Objects.equals(this.jobDefinitionId, jobDto.jobDefinitionId) &&
            Objects.equals(this.dueDate, jobDto.dueDate) &&
            Objects.equals(this.processInstanceId, jobDto.processInstanceId) &&
            Objects.equals(this.executionId, jobDto.executionId) &&
            Objects.equals(this.processDefinitionId, jobDto.processDefinitionId) &&
            Objects.equals(this.processDefinitionKey, jobDto.processDefinitionKey) &&
            Objects.equals(this.retries, jobDto.retries) &&
            Objects.equals(this.exceptionMessage, jobDto.exceptionMessage) &&
            Objects.equals(this.failedActivityId, jobDto.failedActivityId) &&
            Objects.equals(this.suspended, jobDto.suspended) &&
            Objects.equals(this.priority, jobDto.priority) &&
            Objects.equals(this.tenantId, jobDto.tenantId) &&
            Objects.equals(this.createTime, jobDto.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobDefinitionId, dueDate, processInstanceId, executionId, processDefinitionId, processDefinitionKey, retries, exceptionMessage, failedActivityId, suspended, priority, tenantId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
        sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
        sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
        sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

