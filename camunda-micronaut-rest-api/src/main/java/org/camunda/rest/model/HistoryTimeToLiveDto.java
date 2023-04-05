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
import javax.validation.constraints.Min;
import java.util.Objects;

/**
 * HistoryTimeToLiveDto
 */
@JsonPropertyOrder({
  HistoryTimeToLiveDto.JSON_PROPERTY_HISTORY_TIME_TO_LIVE
})
@JsonTypeName("HistoryTimeToLiveDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoryTimeToLiveDto {
    public static final String JSON_PROPERTY_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
    private Integer historyTimeToLive;

    public HistoryTimeToLiveDto() {
    }

    public HistoryTimeToLiveDto historyTimeToLive(Integer historyTimeToLive) {
        this.historyTimeToLive = historyTimeToLive;
        return this;
    }

    /**
     * New value for historyTimeToLive field of the definition. Can be &#x60;null&#x60;. Can not be negative.
     * minimum: 0
     * @return historyTimeToLive
     **/
    @Nullable
    @Min(0)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryTimeToLiveDto historyTimeToLiveDto = (HistoryTimeToLiveDto) o;
        return Objects.equals(this.historyTimeToLive, historyTimeToLiveDto.historyTimeToLive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyTimeToLive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryTimeToLiveDto {\n");
        sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
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
