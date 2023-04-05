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
 * ProcessDefinitionStatisticsResultDto
 */
@JsonPropertyOrder({
  ProcessDefinitionStatisticsResultDto.JSON_PROPERTY_ID,
  ProcessDefinitionStatisticsResultDto.JSON_PROPERTY_INSTANCES,
  ProcessDefinitionStatisticsResultDto.JSON_PROPERTY_FAILED_JOBS,
  ProcessDefinitionStatisticsResultDto.JSON_PROPERTY_INCIDENTS,
  ProcessDefinitionStatisticsResultDto.JSON_PROPERTY_DEFINITION
})
@JsonTypeName("ProcessDefinitionStatisticsResultDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ProcessDefinitionStatisticsResultDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_INSTANCES = "instances";
    private Integer instances;

    public static final String JSON_PROPERTY_FAILED_JOBS = "failedJobs";
    private Integer failedJobs;

    public static final String JSON_PROPERTY_INCIDENTS = "incidents";
    private List<IncidentStatisticsResultDto> incidents = null;

    public static final String JSON_PROPERTY_DEFINITION = "definition";
    private ProcessDefinitionDto definition;

    public ProcessDefinitionStatisticsResultDto() {
    }

    public ProcessDefinitionStatisticsResultDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the process definition the results are aggregated for.
     * @return id
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public ProcessDefinitionStatisticsResultDto instances(Integer instances) {
        this.instances = instances;
        return this;
    }

    /**
     * The total number of running process instances of this process definition.
     * @return instances
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getInstances() {
        return instances;
    }

    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    public ProcessDefinitionStatisticsResultDto failedJobs(Integer failedJobs) {
        this.failedJobs = failedJobs;
        return this;
    }

    /**
     * The total number of failed jobs for the running instances. **Note**: Will be &#x60;0&#x60; (not &#x60;null&#x60;), if failed jobs were excluded.
     * @return failedJobs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getFailedJobs() {
        return failedJobs;
    }

    @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailedJobs(Integer failedJobs) {
        this.failedJobs = failedJobs;
    }

    public ProcessDefinitionStatisticsResultDto incidents(List<IncidentStatisticsResultDto> incidents) {
        this.incidents = incidents;
        return this;
    }

    public ProcessDefinitionStatisticsResultDto addIncidentsItem(IncidentStatisticsResultDto incidentsItem) {
        if (this.incidents == null) {
            this.incidents = new ArrayList<>();
        }
        this.incidents.add(incidentsItem);
        return this;
    }

    /**
     * Each item in the resulting array is an object which contains &#x60;incidentType&#x60; and &#x60;incidentCount&#x60;. **Note**: Will be an empty array, if &#x60;incidents&#x60; or &#x60;incidentsForType&#x60; were excluded. Furthermore, the array will be also empty if no incidents were found.
     * @return incidents
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCIDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<IncidentStatisticsResultDto> getIncidents() {
        return incidents;
    }

    @JsonProperty(JSON_PROPERTY_INCIDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncidents(List<IncidentStatisticsResultDto> incidents) {
        this.incidents = incidents;
    }

    public ProcessDefinitionStatisticsResultDto definition(ProcessDefinitionDto definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get definition
     * @return definition
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEFINITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ProcessDefinitionDto getDefinition() {
        return definition;
    }

    @JsonProperty(JSON_PROPERTY_DEFINITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefinition(ProcessDefinitionDto definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessDefinitionStatisticsResultDto processDefinitionStatisticsResultDto = (ProcessDefinitionStatisticsResultDto) o;
        return Objects.equals(this.id, processDefinitionStatisticsResultDto.id) &&
            Objects.equals(this.instances, processDefinitionStatisticsResultDto.instances) &&
            Objects.equals(this.failedJobs, processDefinitionStatisticsResultDto.failedJobs) &&
            Objects.equals(this.incidents, processDefinitionStatisticsResultDto.incidents) &&
            Objects.equals(this.definition, processDefinitionStatisticsResultDto.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instances, failedJobs, incidents, definition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessDefinitionStatisticsResultDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
        sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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

