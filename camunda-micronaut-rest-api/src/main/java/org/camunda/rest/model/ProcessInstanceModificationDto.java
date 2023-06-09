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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProcessInstanceModificationDto
 */
@JsonPropertyOrder({
  ProcessInstanceModificationDto.JSON_PROPERTY_SKIP_CUSTOM_LISTENERS,
  ProcessInstanceModificationDto.JSON_PROPERTY_SKIP_IO_MAPPINGS,
  ProcessInstanceModificationDto.JSON_PROPERTY_INSTRUCTIONS,
  ProcessInstanceModificationDto.JSON_PROPERTY_ANNOTATION
})
@JsonTypeName("ProcessInstanceModificationDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ProcessInstanceModificationDto {
    public static final String JSON_PROPERTY_SKIP_CUSTOM_LISTENERS = "skipCustomListeners";
    private Boolean skipCustomListeners;

    public static final String JSON_PROPERTY_SKIP_IO_MAPPINGS = "skipIoMappings";
    private Boolean skipIoMappings;

    public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
    private List<ProcessInstanceModificationInstructionDto> instructions = null;

    public static final String JSON_PROPERTY_ANNOTATION = "annotation";
    private String annotation;

    public ProcessInstanceModificationDto() {
    }

    public ProcessInstanceModificationDto skipCustomListeners(Boolean skipCustomListeners) {
        this.skipCustomListeners = skipCustomListeners;
        return this;
    }

    /**
     * Skip execution listener invocation for activities that are started or ended as part of this request.
     * @return skipCustomListeners
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSkipCustomListeners() {
        return skipCustomListeners;
    }

    @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSkipCustomListeners(Boolean skipCustomListeners) {
        this.skipCustomListeners = skipCustomListeners;
    }

    public ProcessInstanceModificationDto skipIoMappings(Boolean skipIoMappings) {
        this.skipIoMappings = skipIoMappings;
        return this;
    }

    /**
     * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.
     * @return skipIoMappings
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSkipIoMappings() {
        return skipIoMappings;
    }

    @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSkipIoMappings(Boolean skipIoMappings) {
        this.skipIoMappings = skipIoMappings;
    }

    public ProcessInstanceModificationDto instructions(List<ProcessInstanceModificationInstructionDto> instructions) {
        this.instructions = instructions;
        return this;
    }

    public ProcessInstanceModificationDto addInstructionsItem(ProcessInstanceModificationInstructionDto instructionsItem) {
        if (this.instructions == null) {
            this.instructions = new ArrayList<>();
        }
        this.instructions.add(instructionsItem);
        return this;
    }

    /**
     * JSON array of modification instructions. The instructions are executed in the order they are in.
     * @return instructions
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ProcessInstanceModificationInstructionDto> getInstructions() {
        return instructions;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstructions(List<ProcessInstanceModificationInstructionDto> instructions) {
        this.instructions = instructions;
    }

    public ProcessInstanceModificationDto annotation(String annotation) {
        this.annotation = annotation;
        return this;
    }

    /**
     * An arbitrary text annotation set by a user for auditing reasons.
     * @return annotation
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ANNOTATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAnnotation() {
        return annotation;
    }

    @JsonProperty(JSON_PROPERTY_ANNOTATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessInstanceModificationDto processInstanceModificationDto = (ProcessInstanceModificationDto) o;
        return Objects.equals(this.skipCustomListeners, processInstanceModificationDto.skipCustomListeners) &&
            Objects.equals(this.skipIoMappings, processInstanceModificationDto.skipIoMappings) &&
            Objects.equals(this.instructions, processInstanceModificationDto.instructions) &&
            Objects.equals(this.annotation, processInstanceModificationDto.annotation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skipCustomListeners, skipIoMappings, instructions, annotation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceModificationDto {\n");
        sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
        sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
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

