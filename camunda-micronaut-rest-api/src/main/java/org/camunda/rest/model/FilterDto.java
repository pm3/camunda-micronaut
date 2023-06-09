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
 * FilterDto
 */
@JsonPropertyOrder({
  FilterDto.JSON_PROPERTY_ID,
  FilterDto.JSON_PROPERTY_RESOURCE_TYPE,
  FilterDto.JSON_PROPERTY_NAME,
  FilterDto.JSON_PROPERTY_OWNER,
  FilterDto.JSON_PROPERTY_QUERY,
  FilterDto.JSON_PROPERTY_PROPERTIES,
  FilterDto.JSON_PROPERTY_ITEM_COUNT
})
@JsonTypeName("FilterDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class FilterDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
    private String resourceType;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_OWNER = "owner";
    private String owner;

    public static final String JSON_PROPERTY_QUERY = "query";
    private Object query;

    public static final String JSON_PROPERTY_PROPERTIES = "properties";
    private Object properties;

    public static final String JSON_PROPERTY_ITEM_COUNT = "itemCount";
    private Long itemCount;

    public FilterDto() {
    }

    public FilterDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the filter.
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

    public FilterDto resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The resource type of the filter.
     * @return resourceType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public FilterDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the filter.
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

    public FilterDto owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The user id of the owner of the filter.
     * @return owner
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOwner() {
        return owner;
    }

    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public FilterDto query(Object query) {
        this.query = query;
        return this;
    }

    /**
     * The query of the filter as a JSON object.
     * @return query
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getQuery() {
        return query;
    }

    @JsonProperty(JSON_PROPERTY_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuery(Object query) {
        this.query = query;
    }

    public FilterDto properties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * The properties of a filter as a JSON object.
     * @return properties
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROPERTIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getProperties() {
        return properties;
    }

    @JsonProperty(JSON_PROPERTY_PROPERTIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public FilterDto itemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     *  The number of items matched by the filter itself. Note: Only exists if the query parameter &#x60;itemCount&#x60; was set to &#x60;true&#x60;
     * @return itemCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ITEM_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getItemCount() {
        return itemCount;
    }

    @JsonProperty(JSON_PROPERTY_ITEM_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterDto filterDto = (FilterDto) o;
        return Objects.equals(this.id, filterDto.id) &&
            Objects.equals(this.resourceType, filterDto.resourceType) &&
            Objects.equals(this.name, filterDto.name) &&
            Objects.equals(this.owner, filterDto.owner) &&
            Objects.equals(this.query, filterDto.query) &&
            Objects.equals(this.properties, filterDto.properties) &&
            Objects.equals(this.itemCount, filterDto.itemCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceType, name, owner, query, properties, itemCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

