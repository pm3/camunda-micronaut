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
 * DecisionRequirementsDefinitionXmlDto
 */
@JsonPropertyOrder({
  DecisionRequirementsDefinitionXmlDto.JSON_PROPERTY_ID,
  DecisionRequirementsDefinitionXmlDto.JSON_PROPERTY_DMN_XML
})
@JsonTypeName("DecisionRequirementsDefinitionXmlDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class DecisionRequirementsDefinitionXmlDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_DMN_XML = "dmnXml";
    private String dmnXml;

    public DecisionRequirementsDefinitionXmlDto() {
    }

    public DecisionRequirementsDefinitionXmlDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the decision requirements definition.
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

    public DecisionRequirementsDefinitionXmlDto dmnXml(String dmnXml) {
        this.dmnXml = dmnXml;
        return this;
    }

    /**
     * An escaped XML string containing the XML that this decision requirements definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.
     * @return dmnXml
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DMN_XML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDmnXml() {
        return dmnXml;
    }

    @JsonProperty(JSON_PROPERTY_DMN_XML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDmnXml(String dmnXml) {
        this.dmnXml = dmnXml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DecisionRequirementsDefinitionXmlDto decisionRequirementsDefinitionXmlDto = (DecisionRequirementsDefinitionXmlDto) o;
        return Objects.equals(this.id, decisionRequirementsDefinitionXmlDto.id) &&
            Objects.equals(this.dmnXml, decisionRequirementsDefinitionXmlDto.dmnXml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dmnXml);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecisionRequirementsDefinitionXmlDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dmnXml: ").append(toIndentedString(dmnXml)).append("\n");
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

