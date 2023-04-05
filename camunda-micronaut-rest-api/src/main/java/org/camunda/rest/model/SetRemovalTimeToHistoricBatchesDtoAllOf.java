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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SetRemovalTimeToHistoricBatchesDtoAllOf
 */
@JsonPropertyOrder({
  SetRemovalTimeToHistoricBatchesDtoAllOf.JSON_PROPERTY_HISTORIC_BATCH_QUERY,
  SetRemovalTimeToHistoricBatchesDtoAllOf.JSON_PROPERTY_HISTORIC_BATCH_IDS
})
@JsonTypeName("SetRemovalTimeToHistoricBatchesDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class SetRemovalTimeToHistoricBatchesDtoAllOf {
    public static final String JSON_PROPERTY_HISTORIC_BATCH_QUERY = "historicBatchQuery";
    private Object historicBatchQuery;

    public static final String JSON_PROPERTY_HISTORIC_BATCH_IDS = "historicBatchIds";
    private List<String> historicBatchIds = null;

    public SetRemovalTimeToHistoricBatchesDtoAllOf() {
    }

    public SetRemovalTimeToHistoricBatchesDtoAllOf historicBatchQuery(Object historicBatchQuery) {
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

    public SetRemovalTimeToHistoricBatchesDtoAllOf historicBatchIds(List<String> historicBatchIds) {
        this.historicBatchIds = historicBatchIds;
        return this;
    }

    public SetRemovalTimeToHistoricBatchesDtoAllOf addHistoricBatchIdsItem(String historicBatchIdsItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetRemovalTimeToHistoricBatchesDtoAllOf setRemovalTimeToHistoricBatchesDtoAllOf = (SetRemovalTimeToHistoricBatchesDtoAllOf) o;
        return Objects.equals(this.historicBatchQuery, setRemovalTimeToHistoricBatchesDtoAllOf.historicBatchQuery) &&
            Objects.equals(this.historicBatchIds, setRemovalTimeToHistoricBatchesDtoAllOf.historicBatchIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historicBatchQuery, historicBatchIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRemovalTimeToHistoricBatchesDtoAllOf {\n");
        sb.append("    historicBatchQuery: ").append(toIndentedString(historicBatchQuery)).append("\n");
        sb.append("    historicBatchIds: ").append(toIndentedString(historicBatchIds)).append("\n");
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
