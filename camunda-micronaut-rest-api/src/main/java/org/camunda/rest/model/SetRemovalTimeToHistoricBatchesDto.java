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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SetRemovalTimeToHistoricBatchesDto
 */
@JsonPropertyOrder({
  SetRemovalTimeToHistoricBatchesDto.JSON_PROPERTY_HISTORIC_BATCH_QUERY,
  SetRemovalTimeToHistoricBatchesDto.JSON_PROPERTY_HISTORIC_BATCH_IDS,
  SetRemovalTimeToHistoricBatchesDto.JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME,
  SetRemovalTimeToHistoricBatchesDto.JSON_PROPERTY_CLEARED_REMOVAL_TIME,
  SetRemovalTimeToHistoricBatchesDto.JSON_PROPERTY_CALCULATED_REMOVAL_TIME
})
@JsonTypeName("SetRemovalTimeToHistoricBatchesDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class SetRemovalTimeToHistoricBatchesDto {
    public static final String JSON_PROPERTY_HISTORIC_BATCH_QUERY = "historicBatchQuery";
    private Object historicBatchQuery;

    public static final String JSON_PROPERTY_HISTORIC_BATCH_IDS = "historicBatchIds";
    private List<String> historicBatchIds = null;

    public static final String JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME = "absoluteRemovalTime";
    private OffsetDateTime absoluteRemovalTime;

    public static final String JSON_PROPERTY_CLEARED_REMOVAL_TIME = "clearedRemovalTime";
    private Boolean clearedRemovalTime;

    public static final String JSON_PROPERTY_CALCULATED_REMOVAL_TIME = "calculatedRemovalTime";
    private Boolean calculatedRemovalTime;

    public SetRemovalTimeToHistoricBatchesDto() {
    }

    public SetRemovalTimeToHistoricBatchesDto historicBatchQuery(Object historicBatchQuery) {
        this.historicBatchQuery = historicBatchQuery;
        return this;
    }

    /**
     * Query for the historic batches to set the removal time for.
     * @return historicBatchQuery
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_HISTORIC_BATCH_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getHistoricBatchQuery() {
        return historicBatchQuery;
    }

    @JsonProperty(JSON_PROPERTY_HISTORIC_BATCH_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoricBatchQuery(Object historicBatchQuery) {
        this.historicBatchQuery = historicBatchQuery;
    }

    public SetRemovalTimeToHistoricBatchesDto historicBatchIds(List<String> historicBatchIds) {
        this.historicBatchIds = historicBatchIds;
        return this;
    }

    public SetRemovalTimeToHistoricBatchesDto addHistoricBatchIdsItem(String historicBatchIdsItem) {
        if (this.historicBatchIds == null) {
            this.historicBatchIds = new ArrayList<>();
        }
        this.historicBatchIds.add(historicBatchIdsItem);
        return this;
    }

    /**
     * The ids of the historic batches to set the removal time for.
     * @return historicBatchIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_HISTORIC_BATCH_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getHistoricBatchIds() {
        return historicBatchIds;
    }

    @JsonProperty(JSON_PROPERTY_HISTORIC_BATCH_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoricBatchIds(List<String> historicBatchIds) {
        this.historicBatchIds = historicBatchIds;
    }

    public SetRemovalTimeToHistoricBatchesDto absoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
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

    public SetRemovalTimeToHistoricBatchesDto clearedRemovalTime(Boolean clearedRemovalTime) {
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

    public SetRemovalTimeToHistoricBatchesDto calculatedRemovalTime(Boolean calculatedRemovalTime) {
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
        SetRemovalTimeToHistoricBatchesDto setRemovalTimeToHistoricBatchesDto = (SetRemovalTimeToHistoricBatchesDto) o;
        return Objects.equals(this.historicBatchQuery, setRemovalTimeToHistoricBatchesDto.historicBatchQuery) &&
            Objects.equals(this.historicBatchIds, setRemovalTimeToHistoricBatchesDto.historicBatchIds) &&
            Objects.equals(this.absoluteRemovalTime, setRemovalTimeToHistoricBatchesDto.absoluteRemovalTime) &&
            Objects.equals(this.clearedRemovalTime, setRemovalTimeToHistoricBatchesDto.clearedRemovalTime) &&
            Objects.equals(this.calculatedRemovalTime, setRemovalTimeToHistoricBatchesDto.calculatedRemovalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historicBatchQuery, historicBatchIds, absoluteRemovalTime, clearedRemovalTime, calculatedRemovalTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRemovalTimeToHistoricBatchesDto {\n");
        sb.append("    historicBatchQuery: ").append(toIndentedString(historicBatchQuery)).append("\n");
        sb.append("    historicBatchIds: ").append(toIndentedString(historicBatchIds)).append("\n");
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
