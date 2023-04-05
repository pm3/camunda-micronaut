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
import java.util.*;

/**
 * MigrationPlanDto
 */
@JsonPropertyOrder({
  MigrationPlanDto.JSON_PROPERTY_SOURCE_PROCESS_DEFINITION_ID,
  MigrationPlanDto.JSON_PROPERTY_TARGET_PROCESS_DEFINITION_ID,
  MigrationPlanDto.JSON_PROPERTY_INSTRUCTIONS,
  MigrationPlanDto.JSON_PROPERTY_VARIABLES
})
@JsonTypeName("MigrationPlanDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class MigrationPlanDto {
    public static final String JSON_PROPERTY_SOURCE_PROCESS_DEFINITION_ID = "sourceProcessDefinitionId";
    private String sourceProcessDefinitionId;

    public static final String JSON_PROPERTY_TARGET_PROCESS_DEFINITION_ID = "targetProcessDefinitionId";
    private String targetProcessDefinitionId;

    public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
    private List<MigrationInstructionDto> instructions = null;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private Map<String, VariableValueDto> variables = null;

    public MigrationPlanDto() {
    }

    public MigrationPlanDto sourceProcessDefinitionId(String sourceProcessDefinitionId) {
        this.sourceProcessDefinitionId = sourceProcessDefinitionId;
        return this;
    }

    /**
     * The id of the source process definition for the migration.
     * @return sourceProcessDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSourceProcessDefinitionId() {
        return sourceProcessDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceProcessDefinitionId(String sourceProcessDefinitionId) {
        this.sourceProcessDefinitionId = sourceProcessDefinitionId;
    }

    public MigrationPlanDto targetProcessDefinitionId(String targetProcessDefinitionId) {
        this.targetProcessDefinitionId = targetProcessDefinitionId;
        return this;
    }

    /**
     * The id of the target process definition for the migration.
     * @return targetProcessDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TARGET_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTargetProcessDefinitionId() {
        return targetProcessDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_TARGET_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTargetProcessDefinitionId(String targetProcessDefinitionId) {
        this.targetProcessDefinitionId = targetProcessDefinitionId;
    }

    public MigrationPlanDto instructions(List<MigrationInstructionDto> instructions) {
        this.instructions = instructions;
        return this;
    }

    public MigrationPlanDto addInstructionsItem(MigrationInstructionDto instructionsItem) {
        if (this.instructions == null) {
            this.instructions = new ArrayList<>();
        }
        this.instructions.add(instructionsItem);
        return this;
    }

    /**
     * A list of migration instructions which map equal activities. Each migration instruction is a JSON object with the following properties:
     * @return instructions
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<MigrationInstructionDto> getInstructions() {
        return instructions;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstructions(List<MigrationInstructionDto> instructions) {
        this.instructions = instructions;
    }

    public MigrationPlanDto variables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
        return this;
    }

    public MigrationPlanDto putVariablesItem(String key, VariableValueDto variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
  }

    /**
     * A map of variables which will be set into the process instances&#39; scope. Each key is a variable name and each value a JSON variable value object.
     * @return variables
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, VariableValueDto> getVariables() {
        return variables;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariables(Map<String, VariableValueDto> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationPlanDto migrationPlanDto = (MigrationPlanDto) o;
        return Objects.equals(this.sourceProcessDefinitionId, migrationPlanDto.sourceProcessDefinitionId) &&
            Objects.equals(this.targetProcessDefinitionId, migrationPlanDto.targetProcessDefinitionId) &&
            Objects.equals(this.instructions, migrationPlanDto.instructions) &&
            Objects.equals(this.variables, migrationPlanDto.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProcessDefinitionId, targetProcessDefinitionId, instructions, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationPlanDto {\n");
        sb.append("    sourceProcessDefinitionId: ").append(toIndentedString(sourceProcessDefinitionId)).append("\n");
        sb.append("    targetProcessDefinitionId: ").append(toIndentedString(targetProcessDefinitionId)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

