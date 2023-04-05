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
 * IdentityServiceUserDto
 */
@JsonPropertyOrder({
  IdentityServiceUserDto.JSON_PROPERTY_ID,
  IdentityServiceUserDto.JSON_PROPERTY_FIRST_NAME,
  IdentityServiceUserDto.JSON_PROPERTY_LAST_NAME,
  IdentityServiceUserDto.JSON_PROPERTY_DISPLAY_NAME
})
@JsonTypeName("IdentityServiceUserDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class IdentityServiceUserDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
    private String firstName;

    public static final String JSON_PROPERTY_LAST_NAME = "lastName";
    private String lastName;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public IdentityServiceUserDto() {
    }

    public IdentityServiceUserDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the user.
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

    public IdentityServiceUserDto firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * The firstname of the user.
     * @return firstName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public IdentityServiceUserDto lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The lastname of the user.
     * @return lastName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IdentityServiceUserDto displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The displayName is generated from the id or firstName and lastName if available.
     * @return displayName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityServiceUserDto identityServiceUserDto = (IdentityServiceUserDto) o;
        return Objects.equals(this.id, identityServiceUserDto.id) &&
            Objects.equals(this.firstName, identityServiceUserDto.firstName) &&
            Objects.equals(this.lastName, identityServiceUserDto.lastName) &&
            Objects.equals(this.displayName, identityServiceUserDto.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityServiceUserDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

