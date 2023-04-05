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

import com.fasterxml.jackson.annotation.*;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * HistoricDetailQueryDtoSortingInner
 */
@JsonPropertyOrder({
  HistoricDetailQueryDtoSortingInner.JSON_PROPERTY_SORT_BY,
  HistoricDetailQueryDtoSortingInner.JSON_PROPERTY_SORT_ORDER
})
@JsonTypeName("HistoricDetailQueryDto_sorting_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoricDetailQueryDtoSortingInner {
    /**
     * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
     */
    public enum SortByEnum {
        PROCESSINSTANCEID("processInstanceId"),
        VARIABLENAME("variableName"),
        VARIABLETYPE("variableType"),
        VARIABLEREVISION("variableRevision"),
        FORMPROPERTYID("formPropertyId"),
        TIME("time"),
        OCCURRENCE("occurrence"),
        TENANTID("tenantId");

        private String value;

        SortByEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortByEnum fromValue(String value) {
            for (SortByEnum b : SortByEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }
    public static final String JSON_PROPERTY_SORT_BY = "sortBy";
    private SortByEnum sortBy;

    /**
     * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
     */
    public enum SortOrderEnum {
        ASC("asc"),
        DESC("desc");

        private String value;

        SortOrderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortOrderEnum fromValue(String value) {
            for (SortOrderEnum b : SortOrderEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }
    public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
    private SortOrderEnum sortOrder;

    public HistoricDetailQueryDtoSortingInner() {
    }

    public HistoricDetailQueryDtoSortingInner sortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
     * @return sortBy
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SORT_BY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SortByEnum getSortBy() {
        return sortBy;
    }

    @JsonProperty(JSON_PROPERTY_SORT_BY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
    }

    public HistoricDetailQueryDtoSortingInner sortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
     * @return sortOrder
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SORT_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    @JsonProperty(JSON_PROPERTY_SORT_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoricDetailQueryDtoSortingInner historicDetailQueryDtoSortingInner = (HistoricDetailQueryDtoSortingInner) o;
        return Objects.equals(this.sortBy, historicDetailQueryDtoSortingInner.sortBy) &&
            Objects.equals(this.sortOrder, historicDetailQueryDtoSortingInner.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortBy, sortOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricDetailQueryDtoSortingInner {\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

