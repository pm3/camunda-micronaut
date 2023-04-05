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
 * JobDefinitionSuspensionStateDto
 */
@JsonPropertyOrder({
  JobDefinitionSuspensionStateDto.JSON_PROPERTY_INCLUDE_JOBS,
  JobDefinitionSuspensionStateDto.JSON_PROPERTY_EXECUTION_DATE,
  JobDefinitionSuspensionStateDto.JSON_PROPERTY_SUSPENDED
})
@JsonTypeName("JobDefinitionSuspensionStateDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class JobDefinitionSuspensionStateDto {
    public static final String JSON_PROPERTY_INCLUDE_JOBS = "includeJobs";
    private Boolean includeJobs;

    public static final String JSON_PROPERTY_EXECUTION_DATE = "executionDate";
    private String executionDate;

    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public JobDefinitionSuspensionStateDto() {
    }

    public JobDefinitionSuspensionStateDto includeJobs(Boolean includeJobs) {
        this.includeJobs = includeJobs;
        return this;
    }

    /**
     * A &#x60;Boolean&#x60; value which indicates whether to activate or suspend also all jobs of the referenced job definitions. When the value is set to &#x60;true&#x60;, all jobs of the provided job definitions will be activated or suspended and when the value is set to &#x60;false&#x60;, the suspension state of all jobs of the provided job definitions will not be updated.
     * @return includeJobs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCLUDE_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIncludeJobs() {
        return includeJobs;
    }

    @JsonProperty(JSON_PROPERTY_INCLUDE_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncludeJobs(Boolean includeJobs) {
        this.includeJobs = includeJobs;
    }

    public JobDefinitionSuspensionStateDto executionDate(String executionDate) {
        this.executionDate = executionDate;
        return this;
    }

    /**
     * The date on which the referenced job definitions will be activated or suspended. If null, the suspension state of the given job definitions is updated immediately. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format &#x60;yyyy-MM- dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., &#x60;2013-01-23T14:42:45.000+0200&#x60;.
     * @return executionDate
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExecutionDate() {
        return executionDate;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    public JobDefinitionSuspensionStateDto suspended(Boolean suspended) {
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
        JobDefinitionSuspensionStateDto jobDefinitionSuspensionStateDto = (JobDefinitionSuspensionStateDto) o;
        return Objects.equals(this.includeJobs, jobDefinitionSuspensionStateDto.includeJobs) &&
            Objects.equals(this.executionDate, jobDefinitionSuspensionStateDto.executionDate) &&
            Objects.equals(this.suspended, jobDefinitionSuspensionStateDto.suspended);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeJobs, executionDate, suspended);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDefinitionSuspensionStateDto {\n");
        sb.append("    includeJobs: ").append(toIndentedString(includeJobs)).append("\n");
        sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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

