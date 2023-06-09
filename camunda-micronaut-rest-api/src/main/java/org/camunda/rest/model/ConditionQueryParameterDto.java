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
 * ConditionQueryParameterDto
 */
@JsonPropertyOrder({
  ConditionQueryParameterDto.JSON_PROPERTY_OPERATOR,
  ConditionQueryParameterDto.JSON_PROPERTY_VALUE
})
@JsonTypeName("ConditionQueryParameterDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ConditionQueryParameterDto {
    /**
     * Comparison operator to be used. &#x60;notLike&#x60; is not supported by all endpoints.
     */
    public enum OperatorEnum {
        EQ("eq"),
        NEQ("neq"),
        GT("gt"),
        GTEQ("gteq"),
        LT("lt"),
        LTEQ("lteq"),
        LIKE("like"),
        NOTLIKE("notLike");

        private String value;

        OperatorEnum(String value) {
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
        public static OperatorEnum fromValue(String value) {
            for (OperatorEnum b : OperatorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }
    public static final String JSON_PROPERTY_OPERATOR = "operator";
    private OperatorEnum operator;

    public static final String JSON_PROPERTY_VALUE = "value";
    private Object value = null;

    public ConditionQueryParameterDto() {
    }

    public ConditionQueryParameterDto operator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Comparison operator to be used. &#x60;notLike&#x60; is not supported by all endpoints.
     * @return operator
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OPERATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OperatorEnum getOperator() {
        return operator;
    }

    @JsonProperty(JSON_PROPERTY_OPERATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public ConditionQueryParameterDto value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Can be any value - string, number, boolean, array or object.  **Note**: Not every endpoint supports every type.
     * @return value
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionQueryParameterDto conditionQueryParameterDto = (ConditionQueryParameterDto) o;
        return Objects.equals(this.operator, conditionQueryParameterDto.operator) &&
            Objects.equals(this.value, conditionQueryParameterDto.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionQueryParameterDto {\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

