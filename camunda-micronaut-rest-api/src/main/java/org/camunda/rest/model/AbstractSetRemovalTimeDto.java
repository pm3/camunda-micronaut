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
 * AbstractSetRemovalTimeDto
 */
@JsonPropertyOrder({
  AbstractSetRemovalTimeDto.JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME,
  AbstractSetRemovalTimeDto.JSON_PROPERTY_CLEARED_REMOVAL_TIME,
  AbstractSetRemovalTimeDto.JSON_PROPERTY_CALCULATED_REMOVAL_TIME
})
@JsonTypeName("AbstractSetRemovalTimeDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class AbstractSetRemovalTimeDto {
    public static final String JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME = "absoluteRemovalTime";
    private OffsetDateTime absoluteRemovalTime;

    public static final String JSON_PROPERTY_CLEARED_REMOVAL_TIME = "clearedRemovalTime";
    private Boolean clearedRemovalTime;

    public static final String JSON_PROPERTY_CALCULATED_REMOVAL_TIME = "calculatedRemovalTime";
    private Boolean calculatedRemovalTime;

    public AbstractSetRemovalTimeDto() {
    }

    public AbstractSetRemovalTimeDto absoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
        this.absoluteRemovalTime = absoluteRemovalTime;
        return this;
    }

    /**
     * The date for which the instances shall be removed. Value may not be &#x60;null&#x60;.  **Note:** Cannot be set in conjunction with &#x60;clearedRemovalTime&#x60; or &#x60;calculatedRemovalTime&#x60;.
     * @return absoluteRemovalTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getAbsoluteRemovalTime() {
        return absoluteRemovalTime;
    }

    @JsonProperty(JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setAbsoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
        this.absoluteRemovalTime = absoluteRemovalTime;
    }

    public AbstractSetRemovalTimeDto clearedRemovalTime(Boolean clearedRemovalTime) {
        this.clearedRemovalTime = clearedRemovalTime;
        return this;
    }

    /**
     * Sets the removal time to &#x60;null&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  **Note:** Cannot be set in conjunction with &#x60;absoluteRemovalTime&#x60; or &#x60;calculatedRemovalTime&#x60;.
     * @return clearedRemovalTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CLEARED_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getClearedRemovalTime() {
        return clearedRemovalTime;
    }

    @JsonProperty(JSON_PROPERTY_CLEARED_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClearedRemovalTime(Boolean clearedRemovalTime) {
        this.clearedRemovalTime = clearedRemovalTime;
    }

    public AbstractSetRemovalTimeDto calculatedRemovalTime(Boolean calculatedRemovalTime) {
        this.calculatedRemovalTime = calculatedRemovalTime;
        return this;
    }

    /**
     * The removal time is calculated based on the engine&#39;s configuration settings. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  **Note:** Cannot be set in conjunction with &#x60;absoluteRemovalTime&#x60; or &#x60;clearedRemovalTime&#x60;.
     * @return calculatedRemovalTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CALCULATED_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCalculatedRemovalTime() {
        return calculatedRemovalTime;
    }

    @JsonProperty(JSON_PROPERTY_CALCULATED_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCalculatedRemovalTime(Boolean calculatedRemovalTime) {
        this.calculatedRemovalTime = calculatedRemovalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractSetRemovalTimeDto abstractSetRemovalTimeDto = (AbstractSetRemovalTimeDto) o;
        return Objects.equals(this.absoluteRemovalTime, abstractSetRemovalTimeDto.absoluteRemovalTime) &&
            Objects.equals(this.clearedRemovalTime, abstractSetRemovalTimeDto.clearedRemovalTime) &&
            Objects.equals(this.calculatedRemovalTime, abstractSetRemovalTimeDto.calculatedRemovalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(absoluteRemovalTime, clearedRemovalTime, calculatedRemovalTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractSetRemovalTimeDto {\n");
        sb.append("    absoluteRemovalTime: ").append(toIndentedString(absoluteRemovalTime)).append("\n");
        sb.append("    clearedRemovalTime: ").append(toIndentedString(clearedRemovalTime)).append("\n");
        sb.append("    calculatedRemovalTime: ").append(toIndentedString(calculatedRemovalTime)).append("\n");
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

