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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AuthorizationExceptionDto
 */
@JsonPropertyOrder({
  AuthorizationExceptionDto.JSON_PROPERTY_USER_ID,
  AuthorizationExceptionDto.JSON_PROPERTY_MISSING_AUTHORIZATIONS,
  AuthorizationExceptionDto.JSON_PROPERTY_TYPE,
  AuthorizationExceptionDto.JSON_PROPERTY_MESSAGE,
  AuthorizationExceptionDto.JSON_PROPERTY_CODE
})
@JsonTypeName("AuthorizationExceptionDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class AuthorizationExceptionDto {
    public static final String JSON_PROPERTY_USER_ID = "userId";
    private String userId;

    public static final String JSON_PROPERTY_MISSING_AUTHORIZATIONS = "missingAuthorizations";
    private List<MissingAuthorizationDto> missingAuthorizations = null;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public static final String JSON_PROPERTY_CODE = "code";
    private BigDecimal code;

    public AuthorizationExceptionDto() {
    }

    public AuthorizationExceptionDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The id of the user that does not have expected permissions
     * @return userId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUserId() {
        return userId;
    }

    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AuthorizationExceptionDto missingAuthorizations(List<MissingAuthorizationDto> missingAuthorizations) {
        this.missingAuthorizations = missingAuthorizations;
        return this;
    }

    public AuthorizationExceptionDto addMissingAuthorizationsItem(MissingAuthorizationDto missingAuthorizationsItem) {
        if (this.missingAuthorizations == null) {
            this.missingAuthorizations = new ArrayList<>();
        }
        this.missingAuthorizations.add(missingAuthorizationsItem);
        return this;
    }

    /**
     * 
     * @return missingAuthorizations
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_MISSING_AUTHORIZATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<MissingAuthorizationDto> getMissingAuthorizations() {
        return missingAuthorizations;
    }

    @JsonProperty(JSON_PROPERTY_MISSING_AUTHORIZATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMissingAuthorizations(List<MissingAuthorizationDto> missingAuthorizations) {
        this.missingAuthorizations = missingAuthorizations;
    }

    public AuthorizationExceptionDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * An exception class indicating the occurred error.
     * @return type
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public AuthorizationExceptionDto message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A detailed message of the error.
     * @return message
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(String message) {
        this.message = message;
    }

    public AuthorizationExceptionDto code(BigDecimal code) {
        this.code = code;
        return this;
    }

    /**
     * The code allows your client application to identify the error in an automated fashion. You can look up the meaning of all built-in codes and learn how to add custom codes in the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/error-handling/#exception-codes).
     * @return code
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCode(BigDecimal code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationExceptionDto authorizationExceptionDto = (AuthorizationExceptionDto) o;
        return Objects.equals(this.userId, authorizationExceptionDto.userId) &&
            Objects.equals(this.missingAuthorizations, authorizationExceptionDto.missingAuthorizations) &&
            Objects.equals(this.type, authorizationExceptionDto.type) &&
            Objects.equals(this.message, authorizationExceptionDto.message) &&
            Objects.equals(this.code, authorizationExceptionDto.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, missingAuthorizations, type, message, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationExceptionDto {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    missingAuthorizations: ").append(toIndentedString(missingAuthorizations)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

