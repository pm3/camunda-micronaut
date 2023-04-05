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
 * CheckPasswordPolicyRuleDtoAllOf
 */
@JsonPropertyOrder({
  CheckPasswordPolicyRuleDtoAllOf.JSON_PROPERTY_VALID
})
@JsonTypeName("CheckPasswordPolicyRuleDto_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CheckPasswordPolicyRuleDtoAllOf {
    public static final String JSON_PROPERTY_VALID = "valid";
    private Boolean valid;

    public CheckPasswordPolicyRuleDtoAllOf() {
    }

    public CheckPasswordPolicyRuleDtoAllOf valid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * &#x60;true&#x60; if the password is compliant with this rule, otherwise &#x60;false&#x60;.
     * @return valid
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VALID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getValid() {
        return valid;
    }

    @JsonProperty(JSON_PROPERTY_VALID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckPasswordPolicyRuleDtoAllOf checkPasswordPolicyRuleDtoAllOf = (CheckPasswordPolicyRuleDtoAllOf) o;
        return Objects.equals(this.valid, checkPasswordPolicyRuleDtoAllOf.valid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckPasswordPolicyRuleDtoAllOf {\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
