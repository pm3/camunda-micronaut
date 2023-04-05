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
 * ExtendLockOnExternalTaskDtoAllOf
 */
@JsonPropertyOrder({
  ExtendLockOnExternalTaskDtoAllOf.JSON_PROPERTY_NEW_DURATION
})
@JsonTypeName("ExtendLockOnExternalTaskDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ExtendLockOnExternalTaskDtoAllOf {
    public static final String JSON_PROPERTY_NEW_DURATION = "newDuration";
    private Long newDuration;

    public ExtendLockOnExternalTaskDtoAllOf() {
    }

    public ExtendLockOnExternalTaskDtoAllOf newDuration(Long newDuration) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendLockOnExternalTaskDtoAllOf extendLockOnExternalTaskDtoAllOf = (ExtendLockOnExternalTaskDtoAllOf) o;
        return Objects.equals(this.newDuration, extendLockOnExternalTaskDtoAllOf.newDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendLockOnExternalTaskDtoAllOf {\n");
        sb.append("    newDuration: ").append(toIndentedString(newDuration)).append("\n");
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
