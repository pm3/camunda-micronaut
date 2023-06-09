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

import com.fasterxml.jackson.annotation.*;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HistoricDecisionInstanceDto
 */
@JsonPropertyOrder({
  HistoricDecisionInstanceDto.JSON_PROPERTY_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_DECISION_DEFINITION_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_DECISION_DEFINITION_KEY,
  HistoricDecisionInstanceDto.JSON_PROPERTY_DECISION_DEFINITION_NAME,
  HistoricDecisionInstanceDto.JSON_PROPERTY_EVALUATION_TIME,
  HistoricDecisionInstanceDto.JSON_PROPERTY_REMOVAL_TIME,
  HistoricDecisionInstanceDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricDecisionInstanceDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_CASE_DEFINITION_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_CASE_DEFINITION_KEY,
  HistoricDecisionInstanceDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_ACTIVITY_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_TENANT_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_USER_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_INPUTS,
  HistoricDecisionInstanceDto.JSON_PROPERTY_OUPUTS,
  HistoricDecisionInstanceDto.JSON_PROPERTY_COLLECT_RESULT_VALUE,
  HistoricDecisionInstanceDto.JSON_PROPERTY_ROOT_DECISION_INSTANCE_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_ID,
  HistoricDecisionInstanceDto.JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_KEY
})
@JsonTypeName("HistoricDecisionInstanceDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoricDecisionInstanceDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_DECISION_DEFINITION_ID = "decisionDefinitionId";
    private String decisionDefinitionId;

    public static final String JSON_PROPERTY_DECISION_DEFINITION_KEY = "decisionDefinitionKey";
    private String decisionDefinitionKey;

    public static final String JSON_PROPERTY_DECISION_DEFINITION_NAME = "decisionDefinitionName";
    private String decisionDefinitionName;

    public static final String JSON_PROPERTY_EVALUATION_TIME = "evaluationTime";
    private OffsetDateTime evaluationTime;

    public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
    private OffsetDateTime removalTime;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_CASE_DEFINITION_ID = "caseDefinitionId";
    private String caseDefinitionId;

    public static final String JSON_PROPERTY_CASE_DEFINITION_KEY = "caseDefinitionKey";
    private String caseDefinitionKey;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
    private String caseInstanceId;

    public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
    private String activityId;

    public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
    private String activityInstanceId;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_USER_ID = "userId";
    private String userId;

    public static final String JSON_PROPERTY_INPUTS = "inputs";
    private List<HistoricDecisionInputInstanceDto> inputs = null;

    public static final String JSON_PROPERTY_OUPUTS = "ouputs";
    private List<HistoricDecisionOutputInstanceDto> ouputs = null;

    public static final String JSON_PROPERTY_COLLECT_RESULT_VALUE = "collectResultValue";
    private Double collectResultValue;

    public static final String JSON_PROPERTY_ROOT_DECISION_INSTANCE_ID = "rootDecisionInstanceId";
    private String rootDecisionInstanceId;

    public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
    private String rootProcessInstanceId;

    public static final String JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_ID = "decisionRequirementsDefinitionId";
    private String decisionRequirementsDefinitionId;

    public static final String JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_KEY = "decisionRequirementsDefinitionKey";
    private String decisionRequirementsDefinitionKey;

    public HistoricDecisionInstanceDto() {
    }

    public HistoricDecisionInstanceDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the decision instance.
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

    public HistoricDecisionInstanceDto decisionDefinitionId(String decisionDefinitionId) {
        this.decisionDefinitionId = decisionDefinitionId;
        return this;
    }

    /**
     * The id of the decision definition that this decision instance belongs to.
     * @return decisionDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDecisionDefinitionId() {
        return decisionDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisionDefinitionId(String decisionDefinitionId) {
        this.decisionDefinitionId = decisionDefinitionId;
    }

    public HistoricDecisionInstanceDto decisionDefinitionKey(String decisionDefinitionKey) {
        this.decisionDefinitionKey = decisionDefinitionKey;
        return this;
    }

    /**
     * The key of the decision definition that this decision instance belongs to.
     * @return decisionDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDecisionDefinitionKey() {
        return decisionDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisionDefinitionKey(String decisionDefinitionKey) {
        this.decisionDefinitionKey = decisionDefinitionKey;
    }

    public HistoricDecisionInstanceDto decisionDefinitionName(String decisionDefinitionName) {
        this.decisionDefinitionName = decisionDefinitionName;
        return this;
    }

    /**
     * The name of the decision definition that this decision instance belongs to.
     * @return decisionDefinitionName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDecisionDefinitionName() {
        return decisionDefinitionName;
    }

    @JsonProperty(JSON_PROPERTY_DECISION_DEFINITION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisionDefinitionName(String decisionDefinitionName) {
        this.decisionDefinitionName = decisionDefinitionName;
    }

    public HistoricDecisionInstanceDto evaluationTime(OffsetDateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
        return this;
    }

    /**
     * The time the instance was evaluated.  [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return evaluationTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EVALUATION_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getEvaluationTime() {
        return evaluationTime;
    }

    @JsonProperty(JSON_PROPERTY_EVALUATION_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setEvaluationTime(OffsetDateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public HistoricDecisionInstanceDto removalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
        return this;
    }

    /**
     * The time after which the instance should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return removalTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getRemovalTime() {
        return removalTime;
    }

    @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setRemovalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
    }

    public HistoricDecisionInstanceDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition that this decision instance belongs to.
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

    public HistoricDecisionInstanceDto processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The key of the process definition that this decision instance belongs to.
     * @return processDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public HistoricDecisionInstanceDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance that this decision instance belongs to.
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

    public HistoricDecisionInstanceDto caseDefinitionId(String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
        return this;
    }

    /**
     * The id of the case definition that this decision instance belongs to.
     * @return caseDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseDefinitionId() {
        return caseDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseDefinitionId(String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
    }

    public HistoricDecisionInstanceDto caseDefinitionKey(String caseDefinitionKey) {
        this.caseDefinitionKey = caseDefinitionKey;
        return this;
    }

    /**
     * The key of the case definition that this decision instance belongs to.
     * @return caseDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseDefinitionKey() {
        return caseDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseDefinitionKey(String caseDefinitionKey) {
        this.caseDefinitionKey = caseDefinitionKey;
    }

    public HistoricDecisionInstanceDto caseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
        return this;
    }

    /**
     * The id of the case instance that this decision instance belongs to.
     * @return caseInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseInstanceId() {
        return caseInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
    }

    public HistoricDecisionInstanceDto activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The id of the activity that this decision instance belongs to.
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

    public HistoricDecisionInstanceDto activityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }

    /**
     * The id of the activity instance that this decision instance belongs to.
     * @return activityInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivityInstanceId() {
        return activityInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    public HistoricDecisionInstanceDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The tenant id of the historic decision instance.
     * @return tenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public HistoricDecisionInstanceDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The id of the authenticated user that has evaluated this decision instance without a process or case instance.
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

    public HistoricDecisionInstanceDto inputs(List<HistoricDecisionInputInstanceDto> inputs) {
        this.inputs = inputs;
        return this;
    }

    public HistoricDecisionInstanceDto addInputsItem(HistoricDecisionInputInstanceDto inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    /**
     * The list of decision input values. **Only exists** if &#x60;includeInputs&#x60; was set to &#x60;true&#x60; in the query.
     * @return inputs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INPUTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<HistoricDecisionInputInstanceDto> getInputs() {
        return inputs;
    }

    @JsonProperty(JSON_PROPERTY_INPUTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInputs(List<HistoricDecisionInputInstanceDto> inputs) {
        this.inputs = inputs;
    }

    public HistoricDecisionInstanceDto ouputs(List<HistoricDecisionOutputInstanceDto> ouputs) {
        this.ouputs = ouputs;
        return this;
    }

    public HistoricDecisionInstanceDto addOuputsItem(HistoricDecisionOutputInstanceDto ouputsItem) {
        if (this.ouputs == null) {
            this.ouputs = new ArrayList<>();
        }
        this.ouputs.add(ouputsItem);
        return this;
    }

    /**
     * The list of decision output values. **Only exists** if &#x60;includeOutputs&#x60; was set to &#x60;true&#x60; in the query.
     * @return ouputs
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OUPUTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<HistoricDecisionOutputInstanceDto> getOuputs() {
        return ouputs;
    }

    @JsonProperty(JSON_PROPERTY_OUPUTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOuputs(List<HistoricDecisionOutputInstanceDto> ouputs) {
        this.ouputs = ouputs;
    }

    public HistoricDecisionInstanceDto collectResultValue(Double collectResultValue) {
        this.collectResultValue = collectResultValue;
        return this;
    }

    /**
     * The result of the collect aggregation of the decision result if used. &#x60;null&#x60; if no aggregation was used.
     * @return collectResultValue
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_COLLECT_RESULT_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Double getCollectResultValue() {
        return collectResultValue;
    }

    @JsonProperty(JSON_PROPERTY_COLLECT_RESULT_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCollectResultValue(Double collectResultValue) {
        this.collectResultValue = collectResultValue;
    }

    public HistoricDecisionInstanceDto rootDecisionInstanceId(String rootDecisionInstanceId) {
        this.rootDecisionInstanceId = rootDecisionInstanceId;
        return this;
    }

    /**
     * The decision instance id of the evaluated root decision. Can be &#x60;null&#x60; if this instance is the root decision instance of the evaluation.
     * @return rootDecisionInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ROOT_DECISION_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRootDecisionInstanceId() {
        return rootDecisionInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_ROOT_DECISION_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRootDecisionInstanceId(String rootDecisionInstanceId) {
        this.rootDecisionInstanceId = rootDecisionInstanceId;
    }

    public HistoricDecisionInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
        this.rootProcessInstanceId = rootProcessInstanceId;
        return this;
    }

    /**
     * The process instance id of the root process instance that initiated the evaluation of this decision. Can be &#x60;null&#x60; if this decision instance is not evaluated as part of a BPMN process.
     * @return rootProcessInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRootProcessInstanceId() {
        return rootProcessInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRootProcessInstanceId(String rootProcessInstanceId) {
        this.rootProcessInstanceId = rootProcessInstanceId;
    }

    public HistoricDecisionInstanceDto decisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
        this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
        return this;
    }

    /**
     * The id of the decision requirements definition that this decision instance belongs to.
     * @return decisionRequirementsDefinitionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDecisionRequirementsDefinitionId() {
        return decisionRequirementsDefinitionId;
    }

    @JsonProperty(JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
        this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
    }

    public HistoricDecisionInstanceDto decisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
        this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
        return this;
    }

    /**
     * The key of the decision requirements definition that this decision instance belongs to.
     * @return decisionRequirementsDefinitionKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDecisionRequirementsDefinitionKey() {
        return decisionRequirementsDefinitionKey;
    }

    @JsonProperty(JSON_PROPERTY_DECISION_REQUIREMENTS_DEFINITION_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
        this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoricDecisionInstanceDto historicDecisionInstanceDto = (HistoricDecisionInstanceDto) o;
        return Objects.equals(this.id, historicDecisionInstanceDto.id) &&
            Objects.equals(this.decisionDefinitionId, historicDecisionInstanceDto.decisionDefinitionId) &&
            Objects.equals(this.decisionDefinitionKey, historicDecisionInstanceDto.decisionDefinitionKey) &&
            Objects.equals(this.decisionDefinitionName, historicDecisionInstanceDto.decisionDefinitionName) &&
            Objects.equals(this.evaluationTime, historicDecisionInstanceDto.evaluationTime) &&
            Objects.equals(this.removalTime, historicDecisionInstanceDto.removalTime) &&
            Objects.equals(this.processDefinitionId, historicDecisionInstanceDto.processDefinitionId) &&
            Objects.equals(this.processDefinitionKey, historicDecisionInstanceDto.processDefinitionKey) &&
            Objects.equals(this.processInstanceId, historicDecisionInstanceDto.processInstanceId) &&
            Objects.equals(this.caseDefinitionId, historicDecisionInstanceDto.caseDefinitionId) &&
            Objects.equals(this.caseDefinitionKey, historicDecisionInstanceDto.caseDefinitionKey) &&
            Objects.equals(this.caseInstanceId, historicDecisionInstanceDto.caseInstanceId) &&
            Objects.equals(this.activityId, historicDecisionInstanceDto.activityId) &&
            Objects.equals(this.activityInstanceId, historicDecisionInstanceDto.activityInstanceId) &&
            Objects.equals(this.tenantId, historicDecisionInstanceDto.tenantId) &&
            Objects.equals(this.userId, historicDecisionInstanceDto.userId) &&
            Objects.equals(this.inputs, historicDecisionInstanceDto.inputs) &&
            Objects.equals(this.ouputs, historicDecisionInstanceDto.ouputs) &&
            Objects.equals(this.collectResultValue, historicDecisionInstanceDto.collectResultValue) &&
            Objects.equals(this.rootDecisionInstanceId, historicDecisionInstanceDto.rootDecisionInstanceId) &&
            Objects.equals(this.rootProcessInstanceId, historicDecisionInstanceDto.rootProcessInstanceId) &&
            Objects.equals(this.decisionRequirementsDefinitionId, historicDecisionInstanceDto.decisionRequirementsDefinitionId) &&
            Objects.equals(this.decisionRequirementsDefinitionKey, historicDecisionInstanceDto.decisionRequirementsDefinitionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, decisionDefinitionId, decisionDefinitionKey, decisionDefinitionName, evaluationTime, removalTime, processDefinitionId, processDefinitionKey, processInstanceId, caseDefinitionId, caseDefinitionKey, caseInstanceId, activityId, activityInstanceId, tenantId, userId, inputs, ouputs, collectResultValue, rootDecisionInstanceId, rootProcessInstanceId, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricDecisionInstanceDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    decisionDefinitionId: ").append(toIndentedString(decisionDefinitionId)).append("\n");
        sb.append("    decisionDefinitionKey: ").append(toIndentedString(decisionDefinitionKey)).append("\n");
        sb.append("    decisionDefinitionName: ").append(toIndentedString(decisionDefinitionName)).append("\n");
        sb.append("    evaluationTime: ").append(toIndentedString(evaluationTime)).append("\n");
        sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
        sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
        sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    ouputs: ").append(toIndentedString(ouputs)).append("\n");
        sb.append("    collectResultValue: ").append(toIndentedString(collectResultValue)).append("\n");
        sb.append("    rootDecisionInstanceId: ").append(toIndentedString(rootDecisionInstanceId)).append("\n");
        sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
        sb.append("    decisionRequirementsDefinitionId: ").append(toIndentedString(decisionRequirementsDefinitionId)).append("\n");
        sb.append("    decisionRequirementsDefinitionKey: ").append(toIndentedString(decisionRequirementsDefinitionKey)).append("\n");
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

