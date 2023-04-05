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
import java.util.Objects;

/**
 * JobSuspensionStateDto
 */
@JsonPropertyOrder({
  JobSuspensionStateDto.JSON_PROPERTY_JOB_DEFINITION_ID,
  JobSuspensionStateDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  JobSuspensionStateDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  JobSuspensionStateDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  JobSuspensionStateDto.JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID,
  JobSuspensionStateDto.JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID,
  JobSuspensionStateDto.JSON_PROPERTY_SUSPENDED
})
@JsonTypeName("JobSuspensionStateDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class JobSuspensionStateDto {
    public static final String JSON_PROPERTY_JOB_DEFINITION_ID = "jobDefinitionId";
    private String jobDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID = "processDefinitionTenantId";
    private String processDefinitionTenantId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID = "processDefinitionWithoutTenantId";
    private Boolean processDefinitionWithoutTenantId;

    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public JobSuspensionStateDto() {
    }

    public JobSuspensionStateDto jobDefinitionId(String jobDefinitionId) {
        this.jobDefinitionId = jobDefinitionId;
        return this;
    }

    /**
     * The job definition id of the jobs to activate or suspend.
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

    public JobSuspensionStateDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The process definition id of the jobs to activate or suspend.
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

    public JobSuspensionStateDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The process instance id of the jobs to activate or suspend.
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

    public JobSuspensionStateDto processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The process definition key of the jobs to activate or suspend.
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

    public JobSuspensionStateDto processDefinitionTenantId(String processDefinitionTenantId) {
        this.processDefinitionTenantId = processDefinitionTenantId;
        return this;
    }

    /**
     * Only activate or suspend jobs of a process definition which belongs to a tenant with the given id. Works only when selecting with &#x60;processDefinitionKey&#x60;.
     * @return processDefinitionTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionTenantId() {
        return processDefinitionTenantId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
        this.processDefinitionTenantId = processDefinitionTenantId;
    }

    public JobSuspensionStateDto processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
        this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
        return this;
    }

    /**
     * Only activate or suspend jobs of a process definition which belongs to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. Works only when selecting with &#x60;processDefinitionKey&#x60;.
     * @return processDefinitionWithoutTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getProcessDefinitionWithoutTenantId() {
        return processDefinitionWithoutTenantId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
        this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    }

    public JobSuspensionStateDto suspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * A Boolean value which indicates whether to activate or suspend a given instance  (e.g. process instance, job, job definition, or batch). When the value is set to true,  the given instance will be suspended and when the value is set to false,  the given instance will be activated.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobSuspensionStateDto jobSuspensionStateDto = (JobSuspensionStateDto) o;
        return Objects.equals(this.jobDefinitionId, jobSuspensionStateDto.jobDefinitionId) &&
            Objects.equals(this.processDefinitionId, jobSuspensionStateDto.processDefinitionId) &&
            Objects.equals(this.processInstanceId, jobSuspensionStateDto.processInstanceId) &&
            Objects.equals(this.processDefinitionKey, jobSuspensionStateDto.processDefinitionKey) &&
            Objects.equals(this.processDefinitionTenantId, jobSuspensionStateDto.processDefinitionTenantId) &&
            Objects.equals(this.processDefinitionWithoutTenantId, jobSuspensionStateDto.processDefinitionWithoutTenantId) &&
            Objects.equals(this.suspended, jobSuspensionStateDto.suspended);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobDefinitionId, processDefinitionId, processInstanceId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId, suspended);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobSuspensionStateDto {\n");
        sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
        sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
        sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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
