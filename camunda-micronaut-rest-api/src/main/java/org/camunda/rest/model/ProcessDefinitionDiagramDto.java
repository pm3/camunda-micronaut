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
 * ProcessDefinitionDiagramDto
 */
@JsonPropertyOrder({
  ProcessDefinitionDiagramDto.JSON_PROPERTY_ID,
  ProcessDefinitionDiagramDto.JSON_PROPERTY_BPMN20_XML
})
@JsonTypeName("ProcessDefinitionDiagramDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ProcessDefinitionDiagramDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_BPMN20_XML = "bpmn20Xml";
    private String bpmn20Xml;

    public ProcessDefinitionDiagramDto() {
    }

    public ProcessDefinitionDiagramDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the process definition.
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

    public ProcessDefinitionDiagramDto bpmn20Xml(String bpmn20Xml) {
        this.bpmn20Xml = bpmn20Xml;
        return this;
    }

    /**
     * An escaped XML string containing the XML that this definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.
     * @return bpmn20Xml
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BPMN20_XML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBpmn20Xml() {
        return bpmn20Xml;
    }

    @JsonProperty(JSON_PROPERTY_BPMN20_XML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBpmn20Xml(String bpmn20Xml) {
        this.bpmn20Xml = bpmn20Xml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessDefinitionDiagramDto processDefinitionDiagramDto = (ProcessDefinitionDiagramDto) o;
        return Objects.equals(this.id, processDefinitionDiagramDto.id) &&
            Objects.equals(this.bpmn20Xml, processDefinitionDiagramDto.bpmn20Xml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bpmn20Xml);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessDefinitionDiagramDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bpmn20Xml: ").append(toIndentedString(bpmn20Xml)).append("\n");
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
