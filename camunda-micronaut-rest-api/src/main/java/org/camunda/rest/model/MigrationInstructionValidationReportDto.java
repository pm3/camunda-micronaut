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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MigrationInstructionValidationReportDto
 */
@JsonPropertyOrder({
  MigrationInstructionValidationReportDto.JSON_PROPERTY_INSTRUCTION,
  MigrationInstructionValidationReportDto.JSON_PROPERTY_FAILURES
})
@JsonTypeName("MigrationInstructionValidationReportDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class MigrationInstructionValidationReportDto {
    public static final String JSON_PROPERTY_INSTRUCTION = "instruction";
    private MigrationInstructionDto instruction;

    public static final String JSON_PROPERTY_FAILURES = "failures";
    private List<String> failures = null;

    public MigrationInstructionValidationReportDto() {
    }

    public MigrationInstructionValidationReportDto instruction(MigrationInstructionDto instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * Get instruction
     * @return instruction
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_INSTRUCTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MigrationInstructionDto getInstruction() {
        return instruction;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstruction(MigrationInstructionDto instruction) {
        this.instruction = instruction;
    }

    public MigrationInstructionValidationReportDto failures(List<String> failures) {
        this.failures = failures;
        return this;
    }

    public MigrationInstructionValidationReportDto addFailuresItem(String failuresItem) {
        if (this.failures == null) {
            this.failures = new ArrayList<>();
        }
        this.failures.add(failuresItem);
        return this;
    }

    /**
     * A list of instruction validation report messages.
     * @return failures
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getFailures() {
        return failures;
    }

    @JsonProperty(JSON_PROPERTY_FAILURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailures(List<String> failures) {
        this.failures = failures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationInstructionValidationReportDto migrationInstructionValidationReportDto = (MigrationInstructionValidationReportDto) o;
        return Objects.equals(this.instruction, migrationInstructionValidationReportDto.instruction) &&
            Objects.equals(this.failures, migrationInstructionValidationReportDto.failures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instruction, failures);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationInstructionValidationReportDto {\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
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
