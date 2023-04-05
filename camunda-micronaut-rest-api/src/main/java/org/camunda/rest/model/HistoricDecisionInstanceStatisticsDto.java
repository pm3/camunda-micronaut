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
 * HistoricDecisionInstanceStatisticsDto
 */
@JsonPropertyOrder({
  HistoricDecisionInstanceStatisticsDto.JSON_PROPERTY_DECISION_DEFINITION_KEY,
  HistoricDecisionInstanceStatisticsDto.JSON_PROPERTY_EVALUATIONS
})
@JsonTypeName("HistoricDecisionInstanceStatisticsDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoricDecisionInstanceStatisticsDto {
    public static final String JSON_PROPERTY_DECISION_DEFINITION_KEY = "decisionDefinitionKey";
    private String decisionDefinitionKey;

    public static final String JSON_PROPERTY_EVALUATIONS = "evaluations";
    private Integer evaluations;

    public HistoricDecisionInstanceStatisticsDto() {
    }

    public HistoricDecisionInstanceStatisticsDto decisionDefinitionKey(String decisionDefinitionKey) {
        this.decisionDefinitionKey = decisionDefinitionKey;
        return this;
    }

    /**
     * A key of decision definition.
     * @return decisionDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDecisionDefinitionKey() {
        return decisionDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisionDefinitionKey(String decisionDefinitionKey) {
        this.decisionDefinitionKey = decisionDefinitionKey;
    }

    public HistoricDecisionInstanceStatisticsDto evaluations(Integer evaluations) {
        this.evaluations = evaluations;
        return this;
    }

    /**
     * A number of evaluation for decision definition.
     * @return evaluations
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EVALUATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getEvaluations() {
        return evaluations;
    }

    @JsonProperty(JSON_PROPERTY_EVALUATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEvaluations(Integer evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoricDecisionInstanceStatisticsDto historicDecisionInstanceStatisticsDto = (HistoricDecisionInstanceStatisticsDto) o;
        return Objects.equals(this.decisionDefinitionKey, historicDecisionInstanceStatisticsDto.decisionDefinitionKey) &&
            Objects.equals(this.evaluations, historicDecisionInstanceStatisticsDto.evaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decisionDefinitionKey, evaluations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricDecisionInstanceStatisticsDto {\n");
        sb.append("    decisionDefinitionKey: ").append(toIndentedString(decisionDefinitionKey)).append("\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
