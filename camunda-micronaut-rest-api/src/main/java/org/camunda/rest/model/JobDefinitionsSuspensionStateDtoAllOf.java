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
 * Defines by which selection criterion to activate or suspend job definitions. The selection criteria are mutually exclusive and can only be one of: * &#x60;processDefinitionId&#x60; * &#x60;processDefinitionKey&#x60;
 */
@JsonPropertyOrder({
  JobDefinitionsSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  JobDefinitionsSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  JobDefinitionsSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID,
  JobDefinitionsSuspensionStateDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID
})
@JsonTypeName("JobDefinitionsSuspensionStateDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class JobDefinitionsSuspensionStateDtoAllOf {
    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_TENANT_ID = "processDefinitionTenantId";
    private String processDefinitionTenantId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_WITHOUT_TENANT_ID = "processDefinitionWithoutTenantId";
    private Boolean processDefinitionWithoutTenantId;

    public JobDefinitionsSuspensionStateDtoAllOf() {
    }

    public JobDefinitionsSuspensionStateDtoAllOf processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The process definition id of the job definitions to activate or suspend.
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

    public JobDefinitionsSuspensionStateDtoAllOf processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The process definition key of the job definitions to activate or suspend.
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

    public JobDefinitionsSuspensionStateDtoAllOf processDefinitionTenantId(String processDefinitionTenantId) {
        this.processDefinitionTenantId = processDefinitionTenantId;
        return this;
    }

    /**
     * Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with &#x60;processDefinitionKey&#x60;.
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

    public JobDefinitionsSuspensionStateDtoAllOf processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
        this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
        return this;
    }

    /**
     * Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  Note that this parameter will only be considered  in combination with &#x60;processDefinitionKey&#x60;.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobDefinitionsSuspensionStateDtoAllOf jobDefinitionsSuspensionStateDtoAllOf = (JobDefinitionsSuspensionStateDtoAllOf) o;
        return Objects.equals(this.processDefinitionId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionId) &&
            Objects.equals(this.processDefinitionKey, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionKey) &&
            Objects.equals(this.processDefinitionTenantId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionTenantId) &&
            Objects.equals(this.processDefinitionWithoutTenantId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionWithoutTenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDefinitionsSuspensionStateDtoAllOf {\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
        sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
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
