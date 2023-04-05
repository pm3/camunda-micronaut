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
 * CleanableHistoricBatchReportResultDto
 */
@JsonPropertyOrder({
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_BATCH_TYPE,
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_HISTORY_TIME_TO_LIVE,
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_FINISHED_BATCHES_COUNT,
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_CLEANABLE_BATCHES_COUNT
})
@JsonTypeName("CleanableHistoricBatchReportResultDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CleanableHistoricBatchReportResultDto {
    public static final String JSON_PROPERTY_BATCH_TYPE = "batchType";
    private String batchType;

    public static final String JSON_PROPERTY_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
    private Integer historyTimeToLive;

    public static final String JSON_PROPERTY_FINISHED_BATCHES_COUNT = "finishedBatchesCount";
    private Long finishedBatchesCount;

    public static final String JSON_PROPERTY_CLEANABLE_BATCHES_COUNT = "cleanableBatchesCount";
    private Long cleanableBatchesCount;

    public CleanableHistoricBatchReportResultDto() {
    }

    public CleanableHistoricBatchReportResultDto batchType(String batchType) {
        this.batchType = batchType;
        return this;
    }

    /**
     * The type of the batch operation.
     * @return batchType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBatchType() {
        return batchType;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }

    public CleanableHistoricBatchReportResultDto historyTimeToLive(Integer historyTimeToLive) {
        this.historyTimeToLive = historyTimeToLive;
        return this;
    }

    /**
     * The history time to live of the batch operation.
     * @return historyTimeToLive
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_HISTORY_TIME_TO_LIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getHistoryTimeToLive() {
        return historyTimeToLive;
    }

    @JsonProperty(JSON_PROPERTY_HISTORY_TIME_TO_LIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoryTimeToLive(Integer historyTimeToLive) {
        this.historyTimeToLive = historyTimeToLive;
    }

    public CleanableHistoricBatchReportResultDto finishedBatchesCount(Long finishedBatchesCount) {
        this.finishedBatchesCount = finishedBatchesCount;
        return this;
    }

    /**
     * The count of the finished batch operations.
     * @return finishedBatchesCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FINISHED_BATCHES_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getFinishedBatchesCount() {
        return finishedBatchesCount;
    }

    @JsonProperty(JSON_PROPERTY_FINISHED_BATCHES_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFinishedBatchesCount(Long finishedBatchesCount) {
        this.finishedBatchesCount = finishedBatchesCount;
    }

    public CleanableHistoricBatchReportResultDto cleanableBatchesCount(Long cleanableBatchesCount) {
        this.cleanableBatchesCount = cleanableBatchesCount;
        return this;
    }

    /**
     * The count of the cleanable historic batch operations, referring to history time to live.
     * @return cleanableBatchesCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CLEANABLE_BATCHES_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getCleanableBatchesCount() {
        return cleanableBatchesCount;
    }

    @JsonProperty(JSON_PROPERTY_CLEANABLE_BATCHES_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCleanableBatchesCount(Long cleanableBatchesCount) {
        this.cleanableBatchesCount = cleanableBatchesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CleanableHistoricBatchReportResultDto cleanableHistoricBatchReportResultDto = (CleanableHistoricBatchReportResultDto) o;
        return Objects.equals(this.batchType, cleanableHistoricBatchReportResultDto.batchType) &&
            Objects.equals(this.historyTimeToLive, cleanableHistoricBatchReportResultDto.historyTimeToLive) &&
            Objects.equals(this.finishedBatchesCount, cleanableHistoricBatchReportResultDto.finishedBatchesCount) &&
            Objects.equals(this.cleanableBatchesCount, cleanableHistoricBatchReportResultDto.cleanableBatchesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchType, historyTimeToLive, finishedBatchesCount, cleanableBatchesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CleanableHistoricBatchReportResultDto {\n");
        sb.append("    batchType: ").append(toIndentedString(batchType)).append("\n");
        sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
        sb.append("    finishedBatchesCount: ").append(toIndentedString(finishedBatchesCount)).append("\n");
        sb.append("    cleanableBatchesCount: ").append(toIndentedString(cleanableBatchesCount)).append("\n");
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

