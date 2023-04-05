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

package org.camunda.rest.api;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import org.camunda.rest.model.*;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Client("${openapi-micronaut-client-base-path}")
public interface JobApi {
    /**
     * Execute Job
     * Executes a job by id. **Note:** The execution of the job happens synchronously in the same thread.
     *
     * @param id The id of the job to be executed. (required)
     */
    @Post(uri="/job/{id}/execute")
    @Consumes({"application/json"})
    Mono<Void> executeJob(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get Job
     * Retrieves a job by id, according to the &#x60;Job&#x60; interface in the engine.
     *
     * @param id The id of the job to be retrieved. (required)
     * @return JobDto
     */
    @Get(uri="/job/{id}")
    @Consumes({"application/json"})
    Mono<JobDto> getJob(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get Jobs
     * Queries for jobs that fulfill given parameters. The size of the result set can be retrieved by using the [Get Job Count](https://docs.camunda.org/manual/7.18/reference/rest/job/get-query-count/) method.
     *
     * @param jobId Filter by job id. (optional)
     * @param jobIds Filter by a comma-separated list of job ids. (optional)
     * @param jobDefinitionId Only select jobs which exist for the given job definition. (optional)
     * @param processInstanceId Only select jobs which exist for the given process instance. (optional)
     * @param processInstanceIds Only select jobs which exist for the given comma-separated list of process instance ids. (optional)
     * @param executionId Only select jobs which exist for the given execution. (optional)
     * @param processDefinitionId Filter by the id of the process definition the jobs run on. (optional)
     * @param processDefinitionKey Filter by the key of the process definition the jobs run on. (optional)
     * @param activityId Only select jobs which exist for an activity with the given id. (optional)
     * @param withRetriesLeft Only select jobs which have retries left. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param executable Only select jobs which are executable, i.e., retries &gt; 0 and due date is &#x60;null&#x60; or due date is in the past. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param timers Only select jobs that are timers. Cannot be used together with &#x60;messages&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param messages Only select jobs that are messages. Cannot be used together with &#x60;timers&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param dueDates Only select jobs where the due date is lower or higher than the given date. Due date expressions are comma-separated and are structured as follows:  A valid condition value has the form &#x60;operator_value&#x60;. &#x60;operator&#x60; is the comparison operator to be used and &#x60;value&#x60; the date value as string.  Valid operator values are: &#x60;gt&#x60; - greater than; &#x60;lt&#x60; - lower than. &#x60;value&#x60; may not contain underscore or comma characters. (optional)
     * @param createTimes Only select jobs created before or after the given date.  Create time expressions are comma-separated and are structured as follows:  A valid condition value has the form &#x60;operator_value&#x60;. &#x60;operator&#x60; is the comparison operator to be used and &#x60;value&#x60; the date value as string.  Valid operator values are: &#x60;gt&#x60; - greater than; &#x60;lt&#x60; - lower than. &#x60;value&#x60; may not contain underscore or comma characters. (optional)
     * @param withException Only select jobs that failed due to an exception. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param exceptionMessage Only select jobs that failed due to an exception with the given message. (optional)
     * @param failedActivityId Only select jobs that failed due to an exception at an activity with the given id. (optional)
     * @param noRetriesLeft Only select jobs which have no retries left. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param active Only include active jobs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param suspended Only include suspended jobs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param priorityLowerThanOrEquals Only include jobs with a priority lower than or equal to the given value. Value must be a valid &#x60;long&#x60; value. (optional)
     * @param priorityHigherThanOrEquals Only include jobs with a priority higher than or equal to the given value. Value must be a valid &#x60;long&#x60; value. (optional)
     * @param tenantIdIn Only include jobs which belong to one of the passed comma-separated tenant ids. (optional)
     * @param withoutTenantId Only include jobs which belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeJobsWithoutTenantId Include jobs which belong to no tenant. Can be used in combination with &#x60;tenantIdIn&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return List&lt;JobDto&gt;
     */
    @Get(uri="/job")
    @Consumes({"application/json"})
    Mono<List<JobDto>> getJobs(
        @QueryValue(value="jobId") @Nullable String jobId, 
        @QueryValue(value="jobIds") @Nullable String jobIds, 
        @QueryValue(value="jobDefinitionId") @Nullable String jobDefinitionId, 
        @QueryValue(value="processInstanceId") @Nullable String processInstanceId, 
        @QueryValue(value="processInstanceIds") @Nullable String processInstanceIds, 
        @QueryValue(value="executionId") @Nullable String executionId, 
        @QueryValue(value="processDefinitionId") @Nullable String processDefinitionId, 
        @QueryValue(value="processDefinitionKey") @Nullable String processDefinitionKey, 
        @QueryValue(value="activityId") @Nullable String activityId, 
        @QueryValue(value="withRetriesLeft") @Nullable Boolean withRetriesLeft, 
        @QueryValue(value="executable") @Nullable Boolean executable, 
        @QueryValue(value="timers") @Nullable Boolean timers, 
        @QueryValue(value="messages") @Nullable Boolean messages, 
        @QueryValue(value="dueDates") @Nullable String dueDates, 
        @QueryValue(value="createTimes") @Nullable String createTimes, 
        @QueryValue(value="withException") @Nullable Boolean withException, 
        @QueryValue(value="exceptionMessage") @Nullable String exceptionMessage, 
        @QueryValue(value="failedActivityId") @Nullable String failedActivityId, 
        @QueryValue(value="noRetriesLeft") @Nullable Boolean noRetriesLeft, 
        @QueryValue(value="active") @Nullable Boolean active, 
        @QueryValue(value="suspended") @Nullable Boolean suspended, 
        @QueryValue(value="priorityLowerThanOrEquals") @Nullable Long priorityLowerThanOrEquals, 
        @QueryValue(value="priorityHigherThanOrEquals") @Nullable Long priorityHigherThanOrEquals, 
        @QueryValue(value="tenantIdIn") @Nullable String tenantIdIn, 
        @QueryValue(value="withoutTenantId") @Nullable Boolean withoutTenantId, 
        @QueryValue(value="includeJobsWithoutTenantId") @Nullable Boolean includeJobsWithoutTenantId, 
        @QueryValue(value="sortBy") @Nullable String sortBy, 
        @QueryValue(value="sortOrder") @Nullable String sortOrder, 
        @QueryValue(value="firstResult") @Nullable Integer firstResult, 
        @QueryValue(value="maxResults") @Nullable Integer maxResults
    );

    /**
     * Get Job Count
     * Queries for the number of jobs that fulfill given parameters. Takes the same parameters as the [Get Jobs](https://docs.camunda.org/manual/7.18/reference/rest/job/get-query/) method.
     *
     * @param jobId Filter by job id. (optional)
     * @param jobIds Filter by a comma-separated list of job ids. (optional)
     * @param jobDefinitionId Only select jobs which exist for the given job definition. (optional)
     * @param processInstanceId Only select jobs which exist for the given process instance. (optional)
     * @param processInstanceIds Only select jobs which exist for the given comma-separated list of process instance ids. (optional)
     * @param executionId Only select jobs which exist for the given execution. (optional)
     * @param processDefinitionId Filter by the id of the process definition the jobs run on. (optional)
     * @param processDefinitionKey Filter by the key of the process definition the jobs run on. (optional)
     * @param activityId Only select jobs which exist for an activity with the given id. (optional)
     * @param withRetriesLeft Only select jobs which have retries left. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param executable Only select jobs which are executable, i.e., retries &gt; 0 and due date is &#x60;null&#x60; or due date is in the past. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param timers Only select jobs that are timers. Cannot be used together with &#x60;messages&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param messages Only select jobs that are messages. Cannot be used together with &#x60;timers&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param dueDates Only select jobs where the due date is lower or higher than the given date. Due date expressions are comma-separated and are structured as follows:  A valid condition value has the form &#x60;operator_value&#x60;. &#x60;operator&#x60; is the comparison operator to be used and &#x60;value&#x60; the date value as string.  Valid operator values are: &#x60;gt&#x60; - greater than; &#x60;lt&#x60; - lower than. &#x60;value&#x60; may not contain underscore or comma characters. (optional)
     * @param createTimes Only select jobs created before or after the given date.  Create time expressions are comma-separated and are structured as follows:  A valid condition value has the form &#x60;operator_value&#x60;. &#x60;operator&#x60; is the comparison operator to be used and &#x60;value&#x60; the date value as string.  Valid operator values are: &#x60;gt&#x60; - greater than; &#x60;lt&#x60; - lower than. &#x60;value&#x60; may not contain underscore or comma characters. (optional)
     * @param withException Only select jobs that failed due to an exception. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param exceptionMessage Only select jobs that failed due to an exception with the given message. (optional)
     * @param failedActivityId Only select jobs that failed due to an exception at an activity with the given id. (optional)
     * @param noRetriesLeft Only select jobs which have no retries left. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param active Only include active jobs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param suspended Only include suspended jobs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param priorityLowerThanOrEquals Only include jobs with a priority lower than or equal to the given value. Value must be a valid &#x60;long&#x60; value. (optional)
     * @param priorityHigherThanOrEquals Only include jobs with a priority higher than or equal to the given value. Value must be a valid &#x60;long&#x60; value. (optional)
     * @param tenantIdIn Only include jobs which belong to one of the passed comma-separated tenant ids. (optional)
     * @param withoutTenantId Only include jobs which belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeJobsWithoutTenantId Include jobs which belong to no tenant. Can be used in combination with &#x60;tenantIdIn&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @return CountResultDto
     */
    @Get(uri="/job/count")
    @Consumes({"application/json"})
    Mono<CountResultDto> getJobsCount(
        @QueryValue(value="jobId") @Nullable String jobId, 
        @QueryValue(value="jobIds") @Nullable String jobIds, 
        @QueryValue(value="jobDefinitionId") @Nullable String jobDefinitionId, 
        @QueryValue(value="processInstanceId") @Nullable String processInstanceId, 
        @QueryValue(value="processInstanceIds") @Nullable String processInstanceIds, 
        @QueryValue(value="executionId") @Nullable String executionId, 
        @QueryValue(value="processDefinitionId") @Nullable String processDefinitionId, 
        @QueryValue(value="processDefinitionKey") @Nullable String processDefinitionKey, 
        @QueryValue(value="activityId") @Nullable String activityId, 
        @QueryValue(value="withRetriesLeft") @Nullable Boolean withRetriesLeft, 
        @QueryValue(value="executable") @Nullable Boolean executable, 
        @QueryValue(value="timers") @Nullable Boolean timers, 
        @QueryValue(value="messages") @Nullable Boolean messages, 
        @QueryValue(value="dueDates") @Nullable String dueDates, 
        @QueryValue(value="createTimes") @Nullable String createTimes, 
        @QueryValue(value="withException") @Nullable Boolean withException, 
        @QueryValue(value="exceptionMessage") @Nullable String exceptionMessage, 
        @QueryValue(value="failedActivityId") @Nullable String failedActivityId, 
        @QueryValue(value="noRetriesLeft") @Nullable Boolean noRetriesLeft, 
        @QueryValue(value="active") @Nullable Boolean active, 
        @QueryValue(value="suspended") @Nullable Boolean suspended, 
        @QueryValue(value="priorityLowerThanOrEquals") @Nullable Long priorityLowerThanOrEquals, 
        @QueryValue(value="priorityHigherThanOrEquals") @Nullable Long priorityHigherThanOrEquals, 
        @QueryValue(value="tenantIdIn") @Nullable String tenantIdIn, 
        @QueryValue(value="withoutTenantId") @Nullable Boolean withoutTenantId, 
        @QueryValue(value="includeJobsWithoutTenantId") @Nullable Boolean includeJobsWithoutTenantId
    );

    /**
     * Get Exception Stacktrace
     * Retrieves the exception stacktrace corresponding to the passed job id.
     *
     * @param id The id of the job to get the exception stacktrace for. (required)
     * @return Object
     */
    @Get(uri="/job/{id}/stacktrace")
    @Consumes({"text/plain", "application/json"})
    Mono<Object> getStacktrace(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get Jobs (POST)
     * Queries for jobs that fulfill given parameters. This method is slightly more powerful than the [Get Jobs](https://docs.camunda.org/manual/7.18/reference/rest/job/get-query/) method because it allows filtering by multiple jobs of types &#x60;String&#x60;, &#x60;Number&#x60; or &#x60;Boolean&#x60;.
     *
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param jobQueryDto  (optional)
     * @return List&lt;JobDto&gt;
     */
    @Post(uri="/job")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<List<JobDto>> queryJobs(
        @QueryValue(value="firstResult") @Nullable Integer firstResult, 
        @QueryValue(value="maxResults") @Nullable Integer maxResults, 
        @Body @Nullable @Valid JobQueryDto jobQueryDto
    );

    /**
     * Get Job Count (POST)
     * Queries for jobs that fulfill given parameters. This method takes the same message body as the [Get Jobs POST](https://docs.camunda.org/manual/7.18/reference/rest/job/post- query/) method and therefore it is slightly more powerful than the [Get Job Count](https://docs.camunda.org/manual/7.18/reference/rest/job/get-query-count/) method.
     *
     * @param jobQueryDto  (optional)
     * @return CountResultDto
     */
    @Post(uri="/job/count")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CountResultDto> queryJobsCount(
        @Body @Nullable @Valid JobQueryDto jobQueryDto
    );

    /**
     * Recalculate Job Due Date
     * Recalculates the due date of a job by id.
     *
     * @param id The id of the job to be updated. (required)
     * @param creationDateBased Recalculate the due date based on the creation date of the job or the current date. Value may only be &#x60;false&#x60;, as &#x60;true&#x60; is the default behavior.  (optional)
     */
    @Post(uri="/job/{id}/duedate/recalculate")
    @Consumes({"application/json"})
    Mono<Void> recalculateDuedate(
        @PathVariable(name="id") @NotNull String id, 
        @QueryValue(value="creationDateBased") @Nullable Boolean creationDateBased
    );

    /**
     * Set Job Due Date
     * Updates the due date of a job by id.
     *
     * @param id The id of the job to be updated. (required)
     * @param jobDuedateDto  (optional)
     */
    @Put(uri="/job/{id}/duedate")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> setJobDuedate(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid JobDuedateDto jobDuedateDto
    );

    /**
     * Set Job Priority
     * Sets the execution priority of a job by id.
     *
     * @param id The id of the job to be updated. (required)
     * @param priorityDto  (optional)
     */
    @Put(uri="/job/{id}/priority")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> setJobPriority(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid PriorityDto priorityDto
    );

    /**
     * Set Job Retries
     * Sets the retries of the job to the given number of retries by id.
     *
     * @param id The id of the job to be updated. (required)
     * @param retriesDto  (optional)
     */
    @Put(uri="/job/{id}/retries")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> setJobRetries(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid RetriesDto retriesDto
    );

    /**
     * Set Job Retries Async (POST)
     * Create a batch to set retries of jobs asynchronously.
     *
     * @param setJobRetriesDto  (optional)
     * @return BatchDto
     */
    @Post(uri="/job/retries")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<BatchDto> setJobRetriesAsyncOperation(
        @Body @Nullable @Valid SetJobRetriesDto setJobRetriesDto
    );

    /**
     * Activate/Suspend Job By Id
     * Activates or suspends a given job by id.
     *
     * @param id The id of the job to activate or suspend. (required)
     * @param suspensionStateDto  (optional)
     */
    @Put(uri="/job/{id}/suspended")
    @Produces({"application/json"})
    Mono<Void> updateJobSuspensionState(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid SuspensionStateDto suspensionStateDto
    );

    /**
     * Activate/Suspend Jobs
     * Activates or suspends jobs matching the given criterion. This can only be on of: * &#x60;jobDefinitionId&#x60; * &#x60;processDefinitionId&#x60; * &#x60;processInstanceId&#x60; * &#x60;processDefinitionKey&#x60;
     *
     * @param jobSuspensionStateDto  (optional)
     */
    @Put(uri="/job/suspended")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> updateSuspensionStateBy(
        @Body @Nullable @Valid JobSuspensionStateDto jobSuspensionStateDto
    );

}
