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
 * SuspensionStateDto
 */
@JsonPropertyOrder({
  SuspensionStateDto.JSON_PROPERTY_SUSPENDED
})
@JsonTypeName("SuspensionStateDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class SuspensionStateDto {
    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public SuspensionStateDto() {
    }

    public SuspensionStateDto suspended(Boolean suspended) {
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
        SuspensionStateDto suspensionStateDto = (SuspensionStateDto) o;
        return Objects.equals(this.suspended, suspensionStateDto.suspended);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suspended);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuspensionStateDto {\n");
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

