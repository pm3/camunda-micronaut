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
 * HistoryCleanupConfigurationDto
 */
@JsonPropertyOrder({
  HistoryCleanupConfigurationDto.JSON_PROPERTY_BATCH_WINDOW_START_TIME,
  HistoryCleanupConfigurationDto.JSON_PROPERTY_BATCH_WINDOW_END_TIME,
  HistoryCleanupConfigurationDto.JSON_PROPERTY_ENABLED
})
@JsonTypeName("HistoryCleanupConfigurationDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoryCleanupConfigurationDto {
    public static final String JSON_PROPERTY_BATCH_WINDOW_START_TIME = "batchWindowStartTime";
    private OffsetDateTime batchWindowStartTime;

    public static final String JSON_PROPERTY_BATCH_WINDOW_END_TIME = "batchWindowEndTime";
    private OffsetDateTime batchWindowEndTime;

    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean enabled;

    public HistoryCleanupConfigurationDto() {
    }

    public HistoryCleanupConfigurationDto batchWindowStartTime(OffsetDateTime batchWindowStartTime) {
        this.batchWindowStartTime = batchWindowStartTime;
        return this;
    }

    /**
     * Start time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., &#x60;2013-01-23T14:42:45.000+0200&#x60;.
     * @return batchWindowStartTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_WINDOW_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getBatchWindowStartTime() {
        return batchWindowStartTime;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_WINDOW_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setBatchWindowStartTime(OffsetDateTime batchWindowStartTime) {
        this.batchWindowStartTime = batchWindowStartTime;
    }

    public HistoryCleanupConfigurationDto batchWindowEndTime(OffsetDateTime batchWindowEndTime) {
        this.batchWindowEndTime = batchWindowEndTime;
        return this;
    }

    /**
     * End time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., &#x60;2013-01-23T14:42:45.000+0200&#x60;.
     * @return batchWindowEndTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_WINDOW_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getBatchWindowEndTime() {
        return batchWindowEndTime;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_WINDOW_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setBatchWindowEndTime(OffsetDateTime batchWindowEndTime) {
        this.batchWindowEndTime = batchWindowEndTime;
    }

    public HistoryCleanupConfigurationDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Indicates whether the engine node participates in history cleanup or not. The default is &#x60;true&#x60;. Participation can be disabled via [Process Engine Configuration](https://docs.camunda.org/manual/7.18/reference/deployment-descriptors/tags/process-engine/#history-cleanup-enabled).  For more details, see [Cleanup Execution Participation per Node](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#cleanup-execution-participation-per-node).
     * @return enabled
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryCleanupConfigurationDto historyCleanupConfigurationDto = (HistoryCleanupConfigurationDto) o;
        return Objects.equals(this.batchWindowStartTime, historyCleanupConfigurationDto.batchWindowStartTime) &&
            Objects.equals(this.batchWindowEndTime, historyCleanupConfigurationDto.batchWindowEndTime) &&
            Objects.equals(this.enabled, historyCleanupConfigurationDto.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchWindowStartTime, batchWindowEndTime, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryCleanupConfigurationDto {\n");
        sb.append("    batchWindowStartTime: ").append(toIndentedString(batchWindowStartTime)).append("\n");
        sb.append("    batchWindowEndTime: ").append(toIndentedString(batchWindowEndTime)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

