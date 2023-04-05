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
 * IncidentStatisticsResultDto
 */
@JsonPropertyOrder({
  IncidentStatisticsResultDto.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentStatisticsResultDto.JSON_PROPERTY_INCIDENT_COUNT
})
@JsonTypeName("IncidentStatisticsResultDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class IncidentStatisticsResultDto {
    public static final String JSON_PROPERTY_INCIDENT_TYPE = "incidentType";
    private String incidentType;

    public static final String JSON_PROPERTY_INCIDENT_COUNT = "incidentCount";
    private Integer incidentCount;

    public IncidentStatisticsResultDto() {
    }

    public IncidentStatisticsResultDto incidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    /**
     * The type of the incident the number of incidents is aggregated for. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
     * @return incidentType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIncidentType() {
        return incidentType;
    }

    @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public IncidentStatisticsResultDto incidentCount(Integer incidentCount) {
        this.incidentCount = incidentCount;
        return this;
    }

    /**
     * The total number of incidents for the corresponding incident type.
     * @return incidentCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCIDENT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIncidentCount() {
        return incidentCount;
    }

    @JsonProperty(JSON_PROPERTY_INCIDENT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncidentCount(Integer incidentCount) {
        this.incidentCount = incidentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentStatisticsResultDto incidentStatisticsResultDto = (IncidentStatisticsResultDto) o;
        return Objects.equals(this.incidentType, incidentStatisticsResultDto.incidentType) &&
            Objects.equals(this.incidentCount, incidentStatisticsResultDto.incidentCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentType, incidentCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentStatisticsResultDto {\n");
        sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
        sb.append("    incidentCount: ").append(toIndentedString(incidentCount)).append("\n");
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

