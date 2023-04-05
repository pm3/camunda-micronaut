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
 * A JSON object corresponding to the Activity Instance tree of the given process instance.
 */
@JsonPropertyOrder({
  ActivityInstanceDto.JSON_PROPERTY_ID,
  ActivityInstanceDto.JSON_PROPERTY_PARENT_ACTIVITY_INSTANCE_ID,
  ActivityInstanceDto.JSON_PROPERTY_ACTIVITY_ID,
  ActivityInstanceDto.JSON_PROPERTY_ACTIVITY_NAME,
  ActivityInstanceDto.JSON_PROPERTY_ACTIVITY_TYPE,
  ActivityInstanceDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  ActivityInstanceDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  ActivityInstanceDto.JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES,
  ActivityInstanceDto.JSON_PROPERTY_CHILD_TRANSITION_INSTANCES,
  ActivityInstanceDto.JSON_PROPERTY_EXECUTION_IDS,
  ActivityInstanceDto.JSON_PROPERTY_INCIDENT_IDS,
  ActivityInstanceDto.JSON_PROPERTY_INCIDENTS
})
@JsonTypeName("ActivityInstanceDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ActivityInstanceDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_PARENT_ACTIVITY_INSTANCE_ID = "parentActivityInstanceId";
    private String parentActivityInstanceId;

    public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
    private String activityId;

    public static final String JSON_PROPERTY_ACTIVITY_NAME = "activityName";
    private String activityName;

    public static final String JSON_PROPERTY_ACTIVITY_TYPE = "activityType";
    private String activityType;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES = "childActivityInstances";
    private List<ActivityInstanceDto> childActivityInstances = null;

    public static final String JSON_PROPERTY_CHILD_TRANSITION_INSTANCES = "childTransitionInstances";
    private List<TransitionInstanceDto> childTransitionInstances = null;

    public static final String JSON_PROPERTY_EXECUTION_IDS = "executionIds";
    private List<String> executionIds = null;

    public static final String JSON_PROPERTY_INCIDENT_IDS = "incidentIds";
    private List<String> incidentIds = null;

    public static final String JSON_PROPERTY_INCIDENTS = "incidents";
    private List<ActivityInstanceIncidentDto> incidents = null;

    public ActivityInstanceDto() {
    }

    public ActivityInstanceDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the activity instance.
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

    public ActivityInstanceDto parentActivityInstanceId(String parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
        return this;
    }

    /**
     * The id of the parent activity instance, for example a sub process instance.
     * @return parentActivityInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARENT_ACTIVITY_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getParentActivityInstanceId() {
        return parentActivityInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_PARENT_ACTIVITY_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParentActivityInstanceId(String parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
    }

    public ActivityInstanceDto activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The id of the activity.
     * @return activityId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivityId() {
        return activityId;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public ActivityInstanceDto activityName(String activityName) {
        this.activityName = activityName;
        return this;
    }

    /**
     * The name of the activity
     * @return activityName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivityName() {
        return activityName;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public ActivityInstanceDto activityType(String activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * The type of activity (corresponds to the XML element name in the BPMN 2.0, e.g., &#39;userTask&#39;)
     * @return activityType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivityType() {
        return activityType;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public ActivityInstanceDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance this activity instance is part of.
     * @return processInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public ActivityInstanceDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition.
     * @return processDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public ActivityInstanceDto childActivityInstances(List<ActivityInstanceDto> childActivityInstances) {
        this.childActivityInstances = childActivityInstances;
        return this;
    }

    public ActivityInstanceDto addChildActivityInstancesItem(ActivityInstanceDto childActivityInstancesItem) {
        if (this.childActivityInstances == null) {
            this.childActivityInstances = new ArrayList<>();
        }
        this.childActivityInstances.add(childActivityInstancesItem);
        return this;
    }

    /**
     * A list of child activity instances.
     * @return childActivityInstances
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ActivityInstanceDto> getChildActivityInstances() {
        return childActivityInstances;
    }

    @JsonProperty(JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setChildActivityInstances(List<ActivityInstanceDto> childActivityInstances) {
        this.childActivityInstances = childActivityInstances;
    }

    public ActivityInstanceDto childTransitionInstances(List<TransitionInstanceDto> childTransitionInstances) {
        this.childTransitionInstances = childTransitionInstances;
        return this;
    }

    public ActivityInstanceDto addChildTransitionInstancesItem(TransitionInstanceDto childTransitionInstancesItem) {
        if (this.childTransitionInstances == null) {
            this.childTransitionInstances = new ArrayList<>();
        }
        this.childTransitionInstances.add(childTransitionInstancesItem);
        return this;
    }

    /**
     * A list of child transition instances. A transition instance represents an execution waiting in an asynchronous continuation.
     * @return childTransitionInstances
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CHILD_TRANSITION_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TransitionInstanceDto> getChildTransitionInstances() {
        return childTransitionInstances;
    }

    @JsonProperty(JSON_PROPERTY_CHILD_TRANSITION_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setChildTransitionInstances(List<TransitionInstanceDto> childTransitionInstances) {
        this.childTransitionInstances = childTransitionInstances;
    }

    public ActivityInstanceDto executionIds(List<String> executionIds) {
        this.executionIds = executionIds;
        return this;
    }

    public ActivityInstanceDto addExecutionIdsItem(String executionIdsItem) {
        if (this.executionIds == null) {
            this.executionIds = new ArrayList<>();
        }
        this.executionIds.add(executionIdsItem);
        return this;
    }

    /**
     * A list of execution ids.
     * @return executionIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getExecutionIds() {
        return executionIds;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutionIds(List<String> executionIds) {
        this.executionIds = executionIds;
    }

    public ActivityInstanceDto incidentIds(List<String> incidentIds) {
        this.incidentIds = incidentIds;
        return this;
    }

    public ActivityInstanceDto addIncidentIdsItem(String incidentIdsItem) {
        if (this.incidentIds == null) {
            this.incidentIds = new ArrayList<>();
        }
        this.incidentIds.add(incidentIdsItem);
        return this;
    }

    /**
     * A list of incident ids.
     * @return incidentIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCIDENT_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getIncidentIds() {
        return incidentIds;
    }

    @JsonProperty(JSON_PROPERTY_INCIDENT_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncidentIds(List<String> incidentIds) {
        this.incidentIds = incidentIds;
    }

    public ActivityInstanceDto incidents(List<ActivityInstanceIncidentDto> incidents) {
        this.incidents = incidents;
        return this;
    }

    public ActivityInstanceDto addIncidentsItem(ActivityInstanceIncidentDto incidentsItem) {
        if (this.incidents == null) {
            this.incidents = new ArrayList<>();
        }
        this.incidents.add(incidentsItem);
        return this;
    }

    /**
     * A list of JSON objects containing incident specific properties: * &#x60;id&#x60;: the id of the incident * &#x60;activityId&#x60;: the activity id in which the incident occurred
     * @return incidents
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCIDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ActivityInstanceIncidentDto> getIncidents() {
        return incidents;
    }

    @JsonProperty(JSON_PROPERTY_INCIDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncidents(List<ActivityInstanceIncidentDto> incidents) {
        this.incidents = incidents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivityInstanceDto activityInstanceDto = (ActivityInstanceDto) o;
        return Objects.equals(this.id, activityInstanceDto.id) &&
            Objects.equals(this.parentActivityInstanceId, activityInstanceDto.parentActivityInstanceId) &&
            Objects.equals(this.activityId, activityInstanceDto.activityId) &&
            Objects.equals(this.activityName, activityInstanceDto.activityName) &&
            Objects.equals(this.activityType, activityInstanceDto.activityType) &&
            Objects.equals(this.processInstanceId, activityInstanceDto.processInstanceId) &&
            Objects.equals(this.processDefinitionId, activityInstanceDto.processDefinitionId) &&
            Objects.equals(this.childActivityInstances, activityInstanceDto.childActivityInstances) &&
            Objects.equals(this.childTransitionInstances, activityInstanceDto.childTransitionInstances) &&
            Objects.equals(this.executionIds, activityInstanceDto.executionIds) &&
            Objects.equals(this.incidentIds, activityInstanceDto.incidentIds) &&
            Objects.equals(this.incidents, activityInstanceDto.incidents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentActivityInstanceId, activityId, activityName, activityType, processInstanceId, processDefinitionId, childActivityInstances, childTransitionInstances, executionIds, incidentIds, incidents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityInstanceDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentActivityInstanceId: ").append(toIndentedString(parentActivityInstanceId)).append("\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
        sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    childActivityInstances: ").append(toIndentedString(childActivityInstances)).append("\n");
        sb.append("    childTransitionInstances: ").append(toIndentedString(childTransitionInstances)).append("\n");
        sb.append("    executionIds: ").append(toIndentedString(executionIds)).append("\n");
        sb.append("    incidentIds: ").append(toIndentedString(incidentIds)).append("\n");
        sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
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

