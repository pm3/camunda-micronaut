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
 * SetRemovalTimeToHistoricDecisionInstancesDtoAllOf
 */
@JsonPropertyOrder({
  SetRemovalTimeToHistoricDecisionInstancesDtoAllOf.JSON_PROPERTY_HIERARCHICAL,
  SetRemovalTimeToHistoricDecisionInstancesDtoAllOf.JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY,
  SetRemovalTimeToHistoricDecisionInstancesDtoAllOf.JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS
})
@JsonTypeName("SetRemovalTimeToHistoricDecisionInstancesDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class SetRemovalTimeToHistoricDecisionInstancesDtoAllOf {
    public static final String JSON_PROPERTY_HIERARCHICAL = "hierarchical";
    private Boolean hierarchical;

    public static final String JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY = "historicDecisionInstanceQuery";
    private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

    public static final String JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS = "historicDecisionInstanceIds";
    private List<String> historicDecisionInstanceIds = null;

    public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf() {
    }

    public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf hierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
        return this;
    }

    /**
     * Sets the removal time to all historic decision instances in the hierarchy. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return hierarchical
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_HIERARCHICAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getHierarchical() {
        return hierarchical;
    }

    @JsonProperty(JSON_PROPERTY_HIERARCHICAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
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

    public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
        this.historicDecisionInstanceIds = historicDecisionInstanceIds;
        return this;
    }

    public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
        if (this.historicDecisionInstanceIds == null) {
            this.historicDecisionInstanceIds = new ArrayList<>();
        }
        this.historicDecisionInstanceIds.add(historicDecisionInstanceIdsItem);
        return this;
    }

    /**
     * The ids of the historic decision instances to set the removal time for.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetRemovalTimeToHistoricDecisionInstancesDtoAllOf setRemovalTimeToHistoricDecisionInstancesDtoAllOf = (SetRemovalTimeToHistoricDecisionInstancesDtoAllOf) o;
        return Objects.equals(this.hierarchical, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.hierarchical) &&
            Objects.equals(this.historicDecisionInstanceQuery, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.historicDecisionInstanceQuery) &&
            Objects.equals(this.historicDecisionInstanceIds, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.historicDecisionInstanceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hierarchical, historicDecisionInstanceQuery, historicDecisionInstanceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRemovalTimeToHistoricDecisionInstancesDtoAllOf {\n");
        sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
        sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
        sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
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

