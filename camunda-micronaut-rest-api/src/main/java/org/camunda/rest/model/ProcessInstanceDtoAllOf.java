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
 * ProcessInstanceDtoAllOf
 */
@JsonPropertyOrder({
  ProcessInstanceDtoAllOf.JSON_PROPERTY_ID,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_DEFINITION_ID,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_BUSINESS_KEY,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_CASE_INSTANCE_ID,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_ENDED,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_SUSPENDED,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_TENANT_ID
})
@JsonTypeName("ProcessInstanceDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ProcessInstanceDtoAllOf {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_DEFINITION_ID = "definitionId";
    private String definitionId;

    public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
    private String businessKey;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
    private String caseInstanceId;

    public static final String JSON_PROPERTY_ENDED = "ended";
    private Boolean ended;

    public static final String JSON_PROPERTY_SUSPENDED = "suspended";
    private Boolean suspended;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public ProcessInstanceDtoAllOf() {
    }

    public ProcessInstanceDtoAllOf id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the process instance.
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

    public ProcessInstanceDtoAllOf definitionId(String definitionId) {
        this.definitionId = definitionId;
        return this;
    }

    /**
     * The id of the process definition that this process instance belongs to.
     * @return definitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDefinitionId() {
        return definitionId;
    }

    @JsonProperty(JSON_PROPERTY_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }

    public ProcessInstanceDtoAllOf businessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }

    /**
     * The business key of the process instance.
     * @return businessKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBusinessKey() {
        return businessKey;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public ProcessInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
        return this;
    }

    /**
     * The id of the case instance associated with the process instance.
     * @return caseInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseInstanceId() {
        return caseInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
    }

    public ProcessInstanceDtoAllOf ended(Boolean ended) {
        this.ended = ended;
        return this;
    }

    /**
     * A flag indicating whether the process instance has ended or not. Deprecated: will always be false!
     * @return ended
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ENDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnded() {
        return ended;
    }

    @JsonProperty(JSON_PROPERTY_ENDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public ProcessInstanceDtoAllOf suspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * A flag indicating whether the process instance is suspended or not.
     * @return suspended
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUSPENDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSuspended() {
        return suspended;
    }

    @JsonProperty(JSON_PROPERTY_SUSPENDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public ProcessInstanceDtoAllOf tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The tenant id of the process instance.
     * @return tenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessInstanceDtoAllOf processInstanceDtoAllOf = (ProcessInstanceDtoAllOf) o;
        return Objects.equals(this.id, processInstanceDtoAllOf.id) &&
            Objects.equals(this.definitionId, processInstanceDtoAllOf.definitionId) &&
            Objects.equals(this.businessKey, processInstanceDtoAllOf.businessKey) &&
            Objects.equals(this.caseInstanceId, processInstanceDtoAllOf.caseInstanceId) &&
            Objects.equals(this.ended, processInstanceDtoAllOf.ended) &&
            Objects.equals(this.suspended, processInstanceDtoAllOf.suspended) &&
            Objects.equals(this.tenantId, processInstanceDtoAllOf.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, definitionId, businessKey, caseInstanceId, ended, suspended, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceDtoAllOf {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
        sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
        sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
        sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
        sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
