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
 * ExtendLockOnExternalTaskDto
 */
@JsonPropertyOrder({
  ExtendLockOnExternalTaskDto.JSON_PROPERTY_NEW_DURATION,
  ExtendLockOnExternalTaskDto.JSON_PROPERTY_WORKER_ID
})
@JsonTypeName("ExtendLockOnExternalTaskDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ExtendLockOnExternalTaskDto {
    public static final String JSON_PROPERTY_NEW_DURATION = "newDuration";
    private Long newDuration;

    public static final String JSON_PROPERTY_WORKER_ID = "workerId";
    private String workerId;

    public ExtendLockOnExternalTaskDto() {
    }

    public ExtendLockOnExternalTaskDto newDuration(Long newDuration) {
        this.newDuration = newDuration;
        return this;
    }

    /**
     * An amount of time (in milliseconds). This is the new lock duration starting from the current moment.
     * @return newDuration
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NEW_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getNewDuration() {
        return newDuration;
    }

    @JsonProperty(JSON_PROPERTY_NEW_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNewDuration(Long newDuration) {
        this.newDuration = newDuration;
    }

    public ExtendLockOnExternalTaskDto workerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * **Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendLockOnExternalTaskDto extendLockOnExternalTaskDto = (ExtendLockOnExternalTaskDto) o;
        return Objects.equals(this.newDuration, extendLockOnExternalTaskDto.newDuration) &&
            Objects.equals(this.workerId, extendLockOnExternalTaskDto.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newDuration, workerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendLockOnExternalTaskDto {\n");
        sb.append("    newDuration: ").append(toIndentedString(newDuration)).append("\n");
        sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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
