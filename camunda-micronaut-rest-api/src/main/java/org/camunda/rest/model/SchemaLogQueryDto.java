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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SchemaLogQueryDto
 */
@JsonPropertyOrder({
  SchemaLogQueryDto.JSON_PROPERTY_VERSION,
  SchemaLogQueryDto.JSON_PROPERTY_SORTING
})
@JsonTypeName("SchemaLogQueryDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class SchemaLogQueryDto {
    public static final String JSON_PROPERTY_VERSION = "version";
    private String version;

    public static final String JSON_PROPERTY_SORTING = "sorting";
    private List<SchemaLogQueryDtoSortingInner> sorting = null;

    public SchemaLogQueryDto() {
    }

    public SchemaLogQueryDto version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the schema.
     * @return version
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVersion() {
        return version;
    }

    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVersion(String version) {
        this.version = version;
    }

    public SchemaLogQueryDto sorting(List<SchemaLogQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
        return this;
    }

    public SchemaLogQueryDto addSortingItem(SchemaLogQueryDtoSortingInner sortingItem) {
        if (this.sorting == null) {
            this.sorting = new ArrayList<>();
        }
        this.sorting.add(sortingItem);
        return this;
    }

    /**
     * A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. 
     * @return sorting
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<SchemaLogQueryDtoSortingInner> getSorting() {
        return sorting;
    }

    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSorting(List<SchemaLogQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchemaLogQueryDto schemaLogQueryDto = (SchemaLogQueryDto) o;
        return Objects.equals(this.version, schemaLogQueryDto.version) &&
            Objects.equals(this.sorting, schemaLogQueryDto.sorting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, sorting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaLogQueryDto {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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
