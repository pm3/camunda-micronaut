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
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeleteHistoricDecisionInstancesDto
 */
@JsonPropertyOrder({
  DeleteHistoricDecisionInstancesDto.JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS,
  DeleteHistoricDecisionInstancesDto.JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY,
  DeleteHistoricDecisionInstancesDto.JSON_PROPERTY_DELETE_REASON
})
@JsonTypeName("DeleteHistoricDecisionInstancesDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class DeleteHistoricDecisionInstancesDto {
    public static final String JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS = "historicDecisionInstanceIds";
    private List<String> historicDecisionInstanceIds = null;

    public static final String JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY = "historicDecisionInstanceQuery";
    private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

    public static final String JSON_PROPERTY_DELETE_REASON = "deleteReason";
    private String deleteReason;

    public DeleteHistoricDecisionInstancesDto() {
    }

    public DeleteHistoricDecisionInstancesDto historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
        this.historicDecisionInstanceIds = historicDecisionInstanceIds;
        return this;
    }

    public DeleteHistoricDecisionInstancesDto addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
        if (this.historicDecisionInstanceIds == null) {
            this.historicDecisionInstanceIds = new ArrayList<>();
        }
        this.historicDecisionInstanceIds.add(historicDecisionInstanceIdsItem);
        return this;
    }

    /**
     * A list of historic decision instance ids to delete.
     * @return historicDecisionInstanceIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getHistoricDecisionInstanceIds() {
        return historicDecisionInstanceIds;
    }

    @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoricDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
        this.historicDecisionInstanceIds = historicDecisionInstanceIds;
    }

    public DeleteHistoricDecisionInstancesDto historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
        this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
        return this;
    }

    /**
     * Get historicDecisionInstanceQuery
     * @return historicDecisionInstanceQuery
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public HistoricDecisionInstanceQueryDto getHistoricDecisionInstanceQuery() {
        return historicDecisionInstanceQuery;
    }

    @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoricDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
        this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
    }

    public DeleteHistoricDecisionInstancesDto deleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
        return this;
    }

    /**
     * A string with delete reason.
     * @return deleteReason
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DELETE_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDeleteReason() {
        return deleteReason;
    }

    @JsonProperty(JSON_PROPERTY_DELETE_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteHistoricDecisionInstancesDto deleteHistoricDecisionInstancesDto = (DeleteHistoricDecisionInstancesDto) o;
        return Objects.equals(this.historicDecisionInstanceIds, deleteHistoricDecisionInstancesDto.historicDecisionInstanceIds) &&
            Objects.equals(this.historicDecisionInstanceQuery, deleteHistoricDecisionInstancesDto.historicDecisionInstanceQuery) &&
            Objects.equals(this.deleteReason, deleteHistoricDecisionInstancesDto.deleteReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historicDecisionInstanceIds, historicDecisionInstanceQuery, deleteReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHistoricDecisionInstancesDto {\n");
        sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
        sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
        sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
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

