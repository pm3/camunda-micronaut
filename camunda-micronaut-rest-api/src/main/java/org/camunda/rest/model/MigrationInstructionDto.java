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
 * MigrationInstructionDto
 */
@JsonPropertyOrder({
  MigrationInstructionDto.JSON_PROPERTY_SOURCE_ACTIVITY_IDS,
  MigrationInstructionDto.JSON_PROPERTY_TARGET_ACTIVITY_IDS,
  MigrationInstructionDto.JSON_PROPERTY_UPDATE_EVENT_TRIGGER
})
@JsonTypeName("MigrationInstructionDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class MigrationInstructionDto {
    public static final String JSON_PROPERTY_SOURCE_ACTIVITY_IDS = "sourceActivityIds";
    private List<String> sourceActivityIds = null;

    public static final String JSON_PROPERTY_TARGET_ACTIVITY_IDS = "targetActivityIds";
    private List<String> targetActivityIds = null;

    public static final String JSON_PROPERTY_UPDATE_EVENT_TRIGGER = "updateEventTrigger";
    private Boolean updateEventTrigger;

    public MigrationInstructionDto() {
    }

    public MigrationInstructionDto sourceActivityIds(List<String> sourceActivityIds) {
        this.sourceActivityIds = sourceActivityIds;
        return this;
    }

    public MigrationInstructionDto addSourceActivityIdsItem(String sourceActivityIdsItem) {
        if (this.sourceActivityIds == null) {
            this.sourceActivityIds = new ArrayList<>();
        }
        this.sourceActivityIds.add(sourceActivityIdsItem);
        return this;
    }

    /**
     * The activity ids from the source process definition being mapped.
     * @return sourceActivityIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_ACTIVITY_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getSourceActivityIds() {
        return sourceActivityIds;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_ACTIVITY_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceActivityIds(List<String> sourceActivityIds) {
        this.sourceActivityIds = sourceActivityIds;
    }

    public MigrationInstructionDto targetActivityIds(List<String> targetActivityIds) {
        this.targetActivityIds = targetActivityIds;
        return this;
    }

    public MigrationInstructionDto addTargetActivityIdsItem(String targetActivityIdsItem) {
        if (this.targetActivityIds == null) {
            this.targetActivityIds = new ArrayList<>();
        }
        this.targetActivityIds.add(targetActivityIdsItem);
        return this;
    }

    /**
     * The activity ids from the target process definition being mapped.
     * @return targetActivityIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TARGET_ACTIVITY_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTargetActivityIds() {
        return targetActivityIds;
    }

    @JsonProperty(JSON_PROPERTY_TARGET_ACTIVITY_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTargetActivityIds(List<String> targetActivityIds) {
        this.targetActivityIds = targetActivityIds;
    }

    public MigrationInstructionDto updateEventTrigger(Boolean updateEventTrigger) {
        this.updateEventTrigger = updateEventTrigger;
        return this;
    }

    /**
     * Configuration flag whether event triggers defined are going to be updated during migration.
     * @return updateEventTrigger
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_UPDATE_EVENT_TRIGGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getUpdateEventTrigger() {
        return updateEventTrigger;
    }

    @JsonProperty(JSON_PROPERTY_UPDATE_EVENT_TRIGGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdateEventTrigger(Boolean updateEventTrigger) {
        this.updateEventTrigger = updateEventTrigger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationInstructionDto migrationInstructionDto = (MigrationInstructionDto) o;
        return Objects.equals(this.sourceActivityIds, migrationInstructionDto.sourceActivityIds) &&
            Objects.equals(this.targetActivityIds, migrationInstructionDto.targetActivityIds) &&
            Objects.equals(this.updateEventTrigger, migrationInstructionDto.updateEventTrigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceActivityIds, targetActivityIds, updateEventTrigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationInstructionDto {\n");
        sb.append("    sourceActivityIds: ").append(toIndentedString(sourceActivityIds)).append("\n");
        sb.append("    targetActivityIds: ").append(toIndentedString(targetActivityIds)).append("\n");
        sb.append("    updateEventTrigger: ").append(toIndentedString(updateEventTrigger)).append("\n");
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

