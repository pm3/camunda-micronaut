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
 * ProcessInstanceSuspensionStateAsyncDtoAllOf
 */
@JsonPropertyOrder({
  ProcessInstanceSuspensionStateAsyncDtoAllOf.JSON_PROPERTY_PROCESS_INSTANCE_IDS,
  ProcessInstanceSuspensionStateAsyncDtoAllOf.JSON_PROPERTY_PROCESS_INSTANCE_QUERY,
  ProcessInstanceSuspensionStateAsyncDtoAllOf.JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY
})
@JsonTypeName("ProcessInstanceSuspensionStateAsyncDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ProcessInstanceSuspensionStateAsyncDtoAllOf {
    public static final String JSON_PROPERTY_PROCESS_INSTANCE_IDS = "processInstanceIds";
    private List<String> processInstanceIds = null;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_QUERY = "processInstanceQuery";
    private ProcessInstanceQueryDto processInstanceQuery;

    public static final String JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
    private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

    public ProcessInstanceSuspensionStateAsyncDtoAllOf() {
    }

    public ProcessInstanceSuspensionStateAsyncDtoAllOf processInstanceIds(List<String> processInstanceIds) {
        this.processInstanceIds = processInstanceIds;
        return this;
    }

    public ProcessInstanceSuspensionStateAsyncDtoAllOf addProcessInstanceIdsItem(String processInstanceIdsItem) {
        if (this.processInstanceIds == null) {
            this.processInstanceIds = new ArrayList<>();
        }
        this.processInstanceIds.add(processInstanceIdsItem);
        return this;
    }

    /**
     * A list of process instance ids which defines a group of process instances which will be activated or suspended by the operation.
     * @return processInstanceIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getProcessInstanceIds() {
        return processInstanceIds;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessInstanceIds(List<String> processInstanceIds) {
        this.processInstanceIds = processInstanceIds;
    }

    public ProcessInstanceSuspensionStateAsyncDtoAllOf processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
        this.processInstanceQuery = processInstanceQuery;
        return this;
    }

    /**
     * Get processInstanceQuery
     * @return processInstanceQuery
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ProcessInstanceQueryDto getProcessInstanceQuery() {
        return processInstanceQuery;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
        this.processInstanceQuery = processInstanceQuery;
    }

    public ProcessInstanceSuspensionStateAsyncDtoAllOf historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
        this.historicProcessInstanceQuery = historicProcessInstanceQuery;
        return this;
    }

    /**
     * Get historicProcessInstanceQuery
     * @return historicProcessInstanceQuery
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public HistoricProcessInstanceQueryDto getHistoricProcessInstanceQuery() {
        return historicProcessInstanceQuery;
    }

    @JsonProperty(JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoricProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
        this.historicProcessInstanceQuery = historicProcessInstanceQuery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessInstanceSuspensionStateAsyncDtoAllOf processInstanceSuspensionStateAsyncDtoAllOf = (ProcessInstanceSuspensionStateAsyncDtoAllOf) o;
        return Objects.equals(this.processInstanceIds, processInstanceSuspensionStateAsyncDtoAllOf.processInstanceIds) &&
            Objects.equals(this.processInstanceQuery, processInstanceSuspensionStateAsyncDtoAllOf.processInstanceQuery) &&
            Objects.equals(this.historicProcessInstanceQuery, processInstanceSuspensionStateAsyncDtoAllOf.historicProcessInstanceQuery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInstanceIds, processInstanceQuery, historicProcessInstanceQuery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceSuspensionStateAsyncDtoAllOf {\n");
        sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
        sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
        sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
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

