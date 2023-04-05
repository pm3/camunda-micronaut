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
import java.util.Objects;

/**
 * PasswordPolicyRequestDto
 */
@JsonPropertyOrder({
  PasswordPolicyRequestDto.JSON_PROPERTY_PASSWORD,
  PasswordPolicyRequestDto.JSON_PROPERTY_PROFILE
})
@JsonTypeName("PasswordPolicyRequestDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class PasswordPolicyRequestDto {
    public static final String JSON_PROPERTY_PASSWORD = "password";
    private String password;

    public static final String JSON_PROPERTY_PROFILE = "profile";
    private UserProfileDto profile;

    public PasswordPolicyRequestDto() {
    }

    public PasswordPolicyRequestDto password(String password) {
        this.password = password;
        return this;
    }

    /**
     * The candidate password to be check against the password policy.
     * @return password
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPassword() {
        return password;
    }

    @JsonProperty(JSON_PROPERTY_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPassword(String password) {
        this.password = password;
    }

    public PasswordPolicyRequestDto profile(UserProfileDto profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get profile
     * @return profile
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROFILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UserProfileDto getProfile() {
        return profile;
    }

    @JsonProperty(JSON_PROPERTY_PROFILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProfile(UserProfileDto profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PasswordPolicyRequestDto passwordPolicyRequestDto = (PasswordPolicyRequestDto) o;
        return Objects.equals(this.password, passwordPolicyRequestDto.password) &&
            Objects.equals(this.profile, passwordPolicyRequestDto.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, profile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordPolicyRequestDto {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

