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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Describes a rule of a password policy.
 */
@JsonPropertyOrder({
  PasswordPolicyRuleDto.JSON_PROPERTY_PLACEHOLDER,
  PasswordPolicyRuleDto.JSON_PROPERTY_PARAMETER
})
@JsonTypeName("PasswordPolicyRuleDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class PasswordPolicyRuleDto {
    public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
    private String placeholder;

    public static final String JSON_PROPERTY_PARAMETER = "parameter";
    private Map<String, String> parameter = null;

    public PasswordPolicyRuleDto() {
    }

    public PasswordPolicyRuleDto placeholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * A placeholder string that contains the name of a password policy rule.
     * @return placeholder
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPlaceholder() {
        return placeholder;
    }

    @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public PasswordPolicyRuleDto parameter(Map<String, String> parameter) {
        this.parameter = parameter;
        return this;
    }

    public PasswordPolicyRuleDto putParameterItem(String key, String parameterItem) {
        if (this.parameter == null) {
            this.parameter = new HashMap<>();
        }
        this.parameter.put(key, parameterItem);
        return this;
  }

    /**
     * A map that describes the characteristics of a password policy rule, such as the minimum number of digits.
     * @return parameter
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARAMETER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getParameter() {
        return parameter;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParameter(Map<String, String> parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PasswordPolicyRuleDto passwordPolicyRuleDto = (PasswordPolicyRuleDto) o;
        return Objects.equals(this.placeholder, passwordPolicyRuleDto.placeholder) &&
            Objects.equals(this.parameter, passwordPolicyRuleDto.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeholder, parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordPolicyRuleDto {\n");
        sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

