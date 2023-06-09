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
import javax.validation.constraints.Min;
import java.util.Objects;

/**
 * CaseDefinitionDto
 */
@JsonPropertyOrder({
  CaseDefinitionDto.JSON_PROPERTY_ID,
  CaseDefinitionDto.JSON_PROPERTY_KEY,
  CaseDefinitionDto.JSON_PROPERTY_CATEGORY,
  CaseDefinitionDto.JSON_PROPERTY_NAME,
  CaseDefinitionDto.JSON_PROPERTY_VERSION,
  CaseDefinitionDto.JSON_PROPERTY_RESOURCE,
  CaseDefinitionDto.JSON_PROPERTY_DEPLOYMENT_ID,
  CaseDefinitionDto.JSON_PROPERTY_TENANT_ID,
  CaseDefinitionDto.JSON_PROPERTY_HISTORY_TIME_TO_LIVE
})
@JsonTypeName("CaseDefinitionDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CaseDefinitionDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_KEY = "key";
    private String key;

    public static final String JSON_PROPERTY_CATEGORY = "category";
    private String category;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_VERSION = "version";
    private Integer version;

    public static final String JSON_PROPERTY_RESOURCE = "resource";
    private String resource;

    public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
    private String deploymentId;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
    private Integer historyTimeToLive;

    public CaseDefinitionDto() {
    }

    public CaseDefinitionDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the case definition
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

    public CaseDefinitionDto key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The key of the case definition, i.e., the id of the CMMN 2.0 XML case definition.
     * @return key
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getKey() {
        return key;
    }

    @JsonProperty(JSON_PROPERTY_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setKey(String key) {
        this.key = key;
    }

    public CaseDefinitionDto category(String category) {
        this.category = category;
        return this;
    }

    /**
     * The category of the case definition.
     * @return category
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCategory() {
        return category;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCategory(String category) {
        this.category = category;
    }

    public CaseDefinitionDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the case definition.
     * @return name
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CaseDefinitionDto version(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the case definition that the engine assigned to it.
     * @return version
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getVersion() {
        return version;
    }

    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVersion(Integer version) {
        this.version = version;
    }

    public CaseDefinitionDto resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * The file name of the case definition.
     * @return resource
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getResource() {
        return resource;
    }

    @JsonProperty(JSON_PROPERTY_RESOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResource(String resource) {
        this.resource = resource;
    }

    public CaseDefinitionDto deploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The deployment id of the case definition.
     * @return deploymentId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDeploymentId() {
        return deploymentId;
    }

    @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public CaseDefinitionDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The tenant id of the case definition.
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

    public CaseDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
        this.historyTimeToLive = historyTimeToLive;
        return this;
    }

    /**
     * History time to live value of the case definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).
     * minimum: 0
     * @return historyTimeToLive
     **/
    @Nullable
    @Min(0)
    @JsonProperty(JSON_PROPERTY_HISTORY_TIME_TO_LIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getHistoryTimeToLive() {
        return historyTimeToLive;
    }

    @JsonProperty(JSON_PROPERTY_HISTORY_TIME_TO_LIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHistoryTimeToLive(Integer historyTimeToLive) {
        this.historyTimeToLive = historyTimeToLive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaseDefinitionDto caseDefinitionDto = (CaseDefinitionDto) o;
        return Objects.equals(this.id, caseDefinitionDto.id) &&
            Objects.equals(this.key, caseDefinitionDto.key) &&
            Objects.equals(this.category, caseDefinitionDto.category) &&
            Objects.equals(this.name, caseDefinitionDto.name) &&
            Objects.equals(this.version, caseDefinitionDto.version) &&
            Objects.equals(this.resource, caseDefinitionDto.resource) &&
            Objects.equals(this.deploymentId, caseDefinitionDto.deploymentId) &&
            Objects.equals(this.tenantId, caseDefinitionDto.tenantId) &&
            Objects.equals(this.historyTimeToLive, caseDefinitionDto.historyTimeToLive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, category, name, version, resource, deploymentId, tenantId, historyTimeToLive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseDefinitionDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
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

