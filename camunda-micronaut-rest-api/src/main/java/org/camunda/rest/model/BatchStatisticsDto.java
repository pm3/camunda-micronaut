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
 * BatchStatisticsDto
 */
@JsonPropertyOrder({
  BatchStatisticsDto.JSON_PROPERTY_REMAINING_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_COMPLETED_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_FAILED_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_ID,
  BatchStatisticsDto.JSON_PROPERTY_TYPE,
  BatchStatisticsDto.JSON_PROPERTY_TOTAL_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_JOBS_CREATED,
  BatchStatisticsDto.JSON_PROPERTY_BATCH_JOBS_PER_SEED,
  BatchStatisticsDto.JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB,
  BatchStatisticsDto.JSON_PROPERTY_SEED_JOB_DEFINITION_ID,
  BatchStatisticsDto.JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID,
  BatchStatisticsDto.JSON_PROPERTY_BATCH_JOB_DEFINITION_ID,
  BatchStatisticsDto.JSON_PROPERTY_SUSPENDED,
  BatchStatisticsDto.JSON_PROPERTY_TENANT_ID,
  BatchStatisticsDto.JSON_PROPERTY_CREATE_USER_ID,
  BatchStatisticsDto.JSON_PROPERTY_START_TIME,
  BatchStatisticsDto.JSON_PROPERTY_EXECUTION_START_TIME
})
@JsonTypeName("BatchStatisticsDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class BatchStatisticsDto {
    public static final String JSON_PROPERTY_REMAINING_JOBS = "remainingJobs";
    private Integer remainingJobs;

    public static final String JSON_PROPERTY_COMPLETED_JOBS = "completedJobs";
    private Integer completedJobs;

    public static final String JSON_PROPERTY_FAILED_JOBS = "failedJobs";
    private Integer failedJobs;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_TOTAL_JOBS = "totalJobs";
    private Integer totalJobs;

    public static final String JSON_PROPERTY_JOBS_CREATED = "jobsCreated";
    private Integer jobsCreated;

    public static final String JSON_PROPERTY_BATCH_JOBS_PER_SEED = "batchJobsPerSeed";
    private Integer batchJobsPerSeed;

    public static final String JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB = "invocationsPerBatchJob";
    private Integer invocationsPerBatchJob;

    public static final String JSON_PROPERTY_SEED_JOB_DEFINITION_ID = "seedJobDefinitionId";
    private String seedJobDefinitionId;

    public static final String JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID = "monitorJobDefinitionId";
    private String monitorJobDefinitionId;

    public static final String JSON_PROPERTY_BATCH_JOB_DEFINITION_ID = "batchJobDefinitionId";
    private String batchJobDefinitionId;

    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_CREATE_USER_ID = "createUserId";
    private String createUserId;

    public static final String JSON_PROPERTY_START_TIME = "startTime";
    private OffsetDateTime startTime;

    public static final String JSON_PROPERTY_EXECUTION_START_TIME = "executionStartTime";
    private OffsetDateTime executionStartTime;

    public BatchStatisticsDto() {
    }

    public BatchStatisticsDto remainingJobs(Integer remainingJobs) {
        this.remainingJobs = remainingJobs;
        return this;
    }

    /**
     * The number of remaining batch execution jobs. This does include failed batch execution jobs and batch execution jobs which still have to be created by the seed job.
     * @return remainingJobs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REMAINING_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRemainingJobs() {
        return remainingJobs;
    }

    @JsonProperty(JSON_PROPERTY_REMAINING_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRemainingJobs(Integer remainingJobs) {
        this.remainingJobs = remainingJobs;
    }

    public BatchStatisticsDto completedJobs(Integer completedJobs) {
        this.completedJobs = completedJobs;
        return this;
    }

    /**
     * The number of completed batch execution jobs. This does include aborted/deleted batch execution jobs.
     * @return completedJobs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_COMPLETED_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCompletedJobs() {
        return completedJobs;
    }

    @JsonProperty(JSON_PROPERTY_COMPLETED_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCompletedJobs(Integer completedJobs) {
        this.completedJobs = completedJobs;
    }

    public BatchStatisticsDto failedJobs(Integer failedJobs) {
        this.failedJobs = failedJobs;
        return this;
    }

    /**
     * The number of failed batch execution jobs. This does not include aborted or deleted batch execution jobs.
     * @return failedJobs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getFailedJobs() {
        return failedJobs;
    }

    @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailedJobs(Integer failedJobs) {
        this.failedJobs = failedJobs;
    }

    public BatchStatisticsDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the batch.
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

    public BatchStatisticsDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.
     * @return type
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public BatchStatisticsDto totalJobs(Integer totalJobs) {
        this.totalJobs = totalJobs;
        return this;
    }

    /**
     * The total jobs of a batch is the number of batch execution jobs required to complete the batch.
     * @return totalJobs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTotalJobs() {
        return totalJobs;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalJobs(Integer totalJobs) {
        this.totalJobs = totalJobs;
    }

    public BatchStatisticsDto jobsCreated(Integer jobsCreated) {
        this.jobsCreated = jobsCreated;
        return this;
    }

    /**
     * The number of batch execution jobs already created by the seed job.
     * @return jobsCreated
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_JOBS_CREATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getJobsCreated() {
        return jobsCreated;
    }

    @JsonProperty(JSON_PROPERTY_JOBS_CREATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setJobsCreated(Integer jobsCreated) {
        this.jobsCreated = jobsCreated;
    }

    public BatchStatisticsDto batchJobsPerSeed(Integer batchJobsPerSeed) {
        this.batchJobsPerSeed = batchJobsPerSeed;
        return this;
    }

    /**
     * The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see &#x60;totalJobs&#x60; property).
     * @return batchJobsPerSeed
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_JOBS_PER_SEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getBatchJobsPerSeed() {
        return batchJobsPerSeed;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_JOBS_PER_SEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBatchJobsPerSeed(Integer batchJobsPerSeed) {
        this.batchJobsPerSeed = batchJobsPerSeed;
    }

    public BatchStatisticsDto invocationsPerBatchJob(Integer invocationsPerBatchJob) {
        this.invocationsPerBatchJob = invocationsPerBatchJob;
        return this;
    }

    /**
     * Every batch execution job invokes the command executed by the batch &#x60;invocationsPerBatchJob&#x60; times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job.
     * @return invocationsPerBatchJob
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getInvocationsPerBatchJob() {
        return invocationsPerBatchJob;
    }

    @JsonProperty(JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInvocationsPerBatchJob(Integer invocationsPerBatchJob) {
        this.invocationsPerBatchJob = invocationsPerBatchJob;
    }

    public BatchStatisticsDto seedJobDefinitionId(String seedJobDefinitionId) {
        this.seedJobDefinitionId = seedJobDefinitionId;
        return this;
    }

    /**
     * The job definition id for the seed jobs of this batch.
     * @return seedJobDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SEED_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSeedJobDefinitionId() {
        return seedJobDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_SEED_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSeedJobDefinitionId(String seedJobDefinitionId) {
        this.seedJobDefinitionId = seedJobDefinitionId;
    }

    public BatchStatisticsDto monitorJobDefinitionId(String monitorJobDefinitionId) {
        this.monitorJobDefinitionId = monitorJobDefinitionId;
        return this;
    }

    /**
     * The job definition id for the monitor jobs of this batch.
     * @return monitorJobDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMonitorJobDefinitionId() {
        return monitorJobDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMonitorJobDefinitionId(String monitorJobDefinitionId) {
        this.monitorJobDefinitionId = monitorJobDefinitionId;
    }

    public BatchStatisticsDto batchJobDefinitionId(String batchJobDefinitionId) {
        this.batchJobDefinitionId = batchJobDefinitionId;
        return this;
    }

    /**
     * The job definition id for the batch execution jobs of this batch.
     * @return batchJobDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBatchJobDefinitionId() {
        return batchJobDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_JOB_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBatchJobDefinitionId(String batchJobDefinitionId) {
        this.batchJobDefinitionId = batchJobDefinitionId;
    }

    public BatchStatisticsDto suspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * Indicates whether this batch is suspended or not.
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

    public BatchStatisticsDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The tenant id of the batch.
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

    public BatchStatisticsDto createUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * The id of the user that created the batch.
     * @return createUserId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATE_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreateUserId() {
        return createUserId;
    }

    @JsonProperty(JSON_PROPERTY_CREATE_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public BatchStatisticsDto startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time the batch was started. Default format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. For further information, please see the [documentation] (https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/)
     * @return startTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public BatchStatisticsDto executionStartTime(OffsetDateTime executionStartTime) {
        this.executionStartTime = executionStartTime;
        return this;
    }

    /**
     * The time the batch execution was started, i.e., at least one batch job has been executed. Default format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. For further information, please see the [documentation] (https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/)
     * @return executionStartTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getExecutionStartTime() {
        return executionStartTime;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setExecutionStartTime(OffsetDateTime executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStatisticsDto batchStatisticsDto = (BatchStatisticsDto) o;
        return Objects.equals(this.remainingJobs, batchStatisticsDto.remainingJobs) &&
            Objects.equals(this.completedJobs, batchStatisticsDto.completedJobs) &&
            Objects.equals(this.failedJobs, batchStatisticsDto.failedJobs) &&
            Objects.equals(this.id, batchStatisticsDto.id) &&
            Objects.equals(this.type, batchStatisticsDto.type) &&
            Objects.equals(this.totalJobs, batchStatisticsDto.totalJobs) &&
            Objects.equals(this.jobsCreated, batchStatisticsDto.jobsCreated) &&
            Objects.equals(this.batchJobsPerSeed, batchStatisticsDto.batchJobsPerSeed) &&
            Objects.equals(this.invocationsPerBatchJob, batchStatisticsDto.invocationsPerBatchJob) &&
            Objects.equals(this.seedJobDefinitionId, batchStatisticsDto.seedJobDefinitionId) &&
            Objects.equals(this.monitorJobDefinitionId, batchStatisticsDto.monitorJobDefinitionId) &&
            Objects.equals(this.batchJobDefinitionId, batchStatisticsDto.batchJobDefinitionId) &&
            Objects.equals(this.suspended, batchStatisticsDto.suspended) &&
            Objects.equals(this.tenantId, batchStatisticsDto.tenantId) &&
            Objects.equals(this.createUserId, batchStatisticsDto.createUserId) &&
            Objects.equals(this.startTime, batchStatisticsDto.startTime) &&
            Objects.equals(this.executionStartTime, batchStatisticsDto.executionStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remainingJobs, completedJobs, failedJobs, id, type, totalJobs, jobsCreated, batchJobsPerSeed, invocationsPerBatchJob, seedJobDefinitionId, monitorJobDefinitionId, batchJobDefinitionId, suspended, tenantId, createUserId, startTime, executionStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStatisticsDto {\n");
        sb.append("    remainingJobs: ").append(toIndentedString(remainingJobs)).append("\n");
        sb.append("    completedJobs: ").append(toIndentedString(completedJobs)).append("\n");
        sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    totalJobs: ").append(toIndentedString(totalJobs)).append("\n");
        sb.append("    jobsCreated: ").append(toIndentedString(jobsCreated)).append("\n");
        sb.append("    batchJobsPerSeed: ").append(toIndentedString(batchJobsPerSeed)).append("\n");
        sb.append("    invocationsPerBatchJob: ").append(toIndentedString(invocationsPerBatchJob)).append("\n");
        sb.append("    seedJobDefinitionId: ").append(toIndentedString(seedJobDefinitionId)).append("\n");
        sb.append("    monitorJobDefinitionId: ").append(toIndentedString(monitorJobDefinitionId)).append("\n");
        sb.append("    batchJobDefinitionId: ").append(toIndentedString(batchJobDefinitionId)).append("\n");
        sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    executionStartTime: ").append(toIndentedString(executionStartTime)).append("\n");
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

