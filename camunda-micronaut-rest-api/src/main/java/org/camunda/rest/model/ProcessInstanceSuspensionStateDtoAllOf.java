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
 * ProcessInstanceSuspensionStateDtoAllOf
 */
@JsonPropertyOrder({
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID,
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID,
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_INSTANCE_IDS,
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_INSTANCE_QUERY,
  ProcessInstanceSuspensionStateDtoAllOf.JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY
})
@JsonTypeName("ProcessInstanceSuspensionStateDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ProcessInstanceSuspensionStateDtoAllOf {
    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID = "processDefinitionTenantId";
    private String processDefinitionTenantId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID = "processDefinitionWithoutTenantId";
    private Boolean processDefinitionWithoutTenantId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_IDS = "processInstanceIds";
    private List<String> processInstanceIds = null;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_QUERY = "processInstanceQuery";
    private ProcessInstanceQueryDto processInstanceQuery;

    public static final String JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
    private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

    public ProcessInstanceSuspensionStateDtoAllOf() {
    }

    public ProcessInstanceSuspensionStateDtoAllOf processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The process definition id of the process instances to activate or suspend.  **Note**: This parameter can be used only with combination of &#x60;suspended&#x60;.
     * @return processDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public ProcessInstanceSuspensionStateDtoAllOf processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The process definition key of the process instances to activate or suspend.  **Note**: This parameter can be used only with combination of &#x60;suspended&#x60;, &#x60;processDefinitionTenantId&#x60;, and &#x60;processDefinitionWithoutTenantId&#x60;.
     * @return processDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public ProcessInstanceSuspensionStateDtoAllOf processDefinitionTenantId(String processDefinitionTenantId) {
        this.processDefinitionTenantId = processDefinitionTenantId;
        return this;
    }

    /**
     * Only activate or suspend process instances of a process definition which belongs to a tenant with the given id.  **Note**: This parameter can be used only with combination of &#x60;suspended&#x60;, &#x60;processDefinitionKey&#x60;, and &#x60;processDefinitionWithoutTenantId&#x60;.
     * @return processDefinitionTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionTenantId() {
        return processDefinitionTenantId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
        this.processDefinitionTenantId = processDefinitionTenantId;
    }

    public ProcessInstanceSuspensionStateDtoAllOf processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
        this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
        return this;
    }

    /**
     * Only activate or suspend process instances of a process definition which belongs to no tenant. Value may only be true, as false is the default behavior.  **Note**: This parameter can be used only with combination of &#x60;suspended&#x60;, &#x60;processDefinitionKey&#x60;, and &#x60;processDefinitionTenantId&#x60;.
     * @return processDefinitionWithoutTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getProcessDefinitionWithoutTenantId() {
        return processDefinitionWithoutTenantId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
        this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    }

    public ProcessInstanceSuspensionStateDtoAllOf processInstanceIds(List<String> processInstanceIds) {
        this.processInstanceIds = processInstanceIds;
        return this;
    }

    public ProcessInstanceSuspensionStateDtoAllOf addProcessInstanceIdsItem(String processInstanceIdsItem) {
        if (this.processInstanceIds == null) {
            this.processInstanceIds = new ArrayList<>();
        }
        this.processInstanceIds.add(processInstanceIdsItem);
        return this;
    }

    /**
     * A list of process instance ids which defines a group of process instances which will be activated or suspended by the operation.  **Note**: This parameter can be used only with combination of &#x60;suspended&#x60;, &#x60;processInstanceQuery&#x60;, and &#x60;historicProcessInstanceQuery&#x60;.
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

    public ProcessInstanceSuspensionStateDtoAllOf processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
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

    public ProcessInstanceSuspensionStateDtoAllOf historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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
        ProcessInstanceSuspensionStateDtoAllOf processInstanceSuspensionStateDtoAllOf = (ProcessInstanceSuspensionStateDtoAllOf) o;
        return Objects.equals(this.processDefinitionId, processInstanceSuspensionStateDtoAllOf.processDefinitionId) &&
            Objects.equals(this.processDefinitionKey, processInstanceSuspensionStateDtoAllOf.processDefinitionKey) &&
            Objects.equals(this.processDefinitionTenantId, processInstanceSuspensionStateDtoAllOf.processDefinitionTenantId) &&
            Objects.equals(this.processDefinitionWithoutTenantId, processInstanceSuspensionStateDtoAllOf.processDefinitionWithoutTenantId) &&
            Objects.equals(this.processInstanceIds, processInstanceSuspensionStateDtoAllOf.processInstanceIds) &&
            Objects.equals(this.processInstanceQuery, processInstanceSuspensionStateDtoAllOf.processInstanceQuery) &&
            Objects.equals(this.historicProcessInstanceQuery, processInstanceSuspensionStateDtoAllOf.historicProcessInstanceQuery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId, processInstanceIds, processInstanceQuery, historicProcessInstanceQuery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceSuspensionStateDtoAllOf {\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
        sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
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

