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
 * BasicUserCredentialsDto
 */
@JsonPropertyOrder({
  BasicUserCredentialsDto.JSON_PROPERTY_USERNAME,
  BasicUserCredentialsDto.JSON_PROPERTY_PASSWORD
})
@JsonTypeName("BasicUserCredentialsDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class BasicUserCredentialsDto {
    public static final String JSON_PROPERTY_USERNAME = "username";
    private String username;

    public static final String JSON_PROPERTY_PASSWORD = "password";
    private String password;

    public BasicUserCredentialsDto() {
    }

    public BasicUserCredentialsDto username(String username) {
        this.username = username;
        return this;
    }

    /**
     * The username of a user.
     * @return username
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUsername() {
        return username;
    }

    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUsername(String username) {
        this.username = username;
    }

    public BasicUserCredentialsDto password(String password) {
        this.password = password;
        return this;
    }

    /**
     * A password of a user.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasicUserCredentialsDto basicUserCredentialsDto = (BasicUserCredentialsDto) o;
        return Objects.equals(this.username, basicUserCredentialsDto.username) &&
            Objects.equals(this.password, basicUserCredentialsDto.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicUserCredentialsDto {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

