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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HistoricDetailDto
 */
@JsonPropertyOrder({
  HistoricDetailDto.JSON_PROPERTY_ID,
  HistoricDetailDto.JSON_PROPERTY_TYPE,
  HistoricDetailDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricDetailDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricDetailDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  HistoricDetailDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  HistoricDetailDto.JSON_PROPERTY_EXECUTION_ID,
  HistoricDetailDto.JSON_PROPERTY_CASE_DEFINITION_KEY,
  HistoricDetailDto.JSON_PROPERTY_CASE_DEFINITION_ID,
  HistoricDetailDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  HistoricDetailDto.JSON_PROPERTY_CASE_EXECUTION_ID,
  HistoricDetailDto.JSON_PROPERTY_TASK_ID,
  HistoricDetailDto.JSON_PROPERTY_TENANT_ID,
  HistoricDetailDto.JSON_PROPERTY_USER_OPERATION_ID,
  HistoricDetailDto.JSON_PROPERTY_TIME,
  HistoricDetailDto.JSON_PROPERTY_REMOVAL_TIME,
  HistoricDetailDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID,
  HistoricDetailDto.JSON_PROPERTY_FIELD_ID,
  HistoricDetailDto.JSON_PROPERTY_FIELD_VALUE,
  HistoricDetailDto.JSON_PROPERTY_VARIABLE_NAME,
  HistoricDetailDto.JSON_PROPERTY_VARIABLE_INSTANCE_ID,
  HistoricDetailDto.JSON_PROPERTY_VARIABLE_TYPE,
  HistoricDetailDto.JSON_PROPERTY_VALUE,
  HistoricDetailDto.JSON_PROPERTY_VALUE_INFO,
  HistoricDetailDto.JSON_PROPERTY_INITIAL,
  HistoricDetailDto.JSON_PROPERTY_REVISION,
  HistoricDetailDto.JSON_PROPERTY_ERROR_MESSAGE
})
@JsonTypeName("HistoricDetailDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class HistoricDetailDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
    private String activityInstanceId;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_CASE_DEFINITION_KEY = "caseDefinitionKey";
    private String caseDefinitionKey;

    public static final String JSON_PROPERTY_CASE_DEFINITION_ID = "caseDefinitionId";
    private String caseDefinitionId;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
    private String caseInstanceId;

    public static final String JSON_PROPERTY_CASE_EXECUTION_ID = "caseExecutionId";
    private String caseExecutionId;

    public static final String JSON_PROPERTY_TASK_ID = "taskId";
    private String taskId;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_USER_OPERATION_ID = "userOperationId";
    private String userOperationId;

    public static final String JSON_PROPERTY_TIME = "time";
    private OffsetDateTime time;

    public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
    private OffsetDateTime removalTime;

    public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
    private String rootProcessInstanceId;

    public static final String JSON_PROPERTY_FIELD_ID = "fieldId";
    private String fieldId;

    public static final String JSON_PROPERTY_FIELD_VALUE = "fieldValue";
    private Object fieldValue;

    public static final String JSON_PROPERTY_VARIABLE_NAME = "variableName";
    private String variableName;

    public static final String JSON_PROPERTY_VARIABLE_INSTANCE_ID = "variableInstanceId";
    private String variableInstanceId;

    public static final String JSON_PROPERTY_VARIABLE_TYPE = "variableType";
    private String variableType;

    public static final String JSON_PROPERTY_VALUE = "value";
    private Object value;

    public static final String JSON_PROPERTY_VALUE_INFO = "valueInfo";
    private Map<String, Object> valueInfo = null;

    public static final String JSON_PROPERTY_INITIAL = "initial";
    private Boolean initial;

    public static final String JSON_PROPERTY_REVISION = "revision";
    private Integer revision;

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public HistoricDetailDto() {
    }

    public HistoricDetailDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the historic detail.
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

    public HistoricDetailDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the historic detail. Either &#x60;formField&#x60; for a submitted form field value or &#x60;variableUpdate&#x60; for variable updates.
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

    public HistoricDetailDto processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * The key of the process definition that this historic detail belongs to.
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

    public HistoricDetailDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition that this historic detail belongs to.
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

    public HistoricDetailDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance the historic detail belongs to.
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

    public HistoricDetailDto activityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }

    /**
     * The id of the activity instance the historic detail belongs to.
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

    public HistoricDetailDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * The id of the execution the historic detail belongs to.
     * @return executionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExecutionId() {
        return executionId;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public HistoricDetailDto caseDefinitionKey(String caseDefinitionKey) {
        this.caseDefinitionKey = caseDefinitionKey;
        return this;
    }

    /**
     * The key of the case definition that this historic detail belongs to.
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

    public HistoricDetailDto caseDefinitionId(String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
        return this;
    }

    /**
     * The id of the case definition that this historic detail belongs to.
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

    public HistoricDetailDto caseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
        return this;
    }

    /**
     * The id of the case instance the historic detail belongs to.
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

    public HistoricDetailDto caseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
        return this;
    }

    /**
     * The id of the case execution the historic detail belongs to.
     * @return caseExecutionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCaseExecutionId() {
        return caseExecutionId;
    }

    @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCaseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
    }

    public HistoricDetailDto taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * The id of the task the historic detail belongs to.
     * @return taskId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTaskId() {
        return taskId;
    }

    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public HistoricDetailDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The id of the tenant that this historic detail belongs to.
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

    public HistoricDetailDto userOperationId(String userOperationId) {
        this.userOperationId = userOperationId;
        return this;
    }

    /**
     * The id of user operation which links historic detail with [user operation log](https://docs.camunda.org/manual/7.18/reference/rest/history/user-operation-log/) entries.
     * @return userOperationId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_USER_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUserOperationId() {
        return userOperationId;
    }

    @JsonProperty(JSON_PROPERTY_USER_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserOperationId(String userOperationId) {
        this.userOperationId = userOperationId;
    }

    public HistoricDetailDto time(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * The time when this historic detail occurred. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return time
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getTime() {
        return time;
    }

    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public HistoricDetailDto removalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
        return this;
    }

    /**
     * The time after which the historic detail should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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

    public HistoricDetailDto rootProcessInstanceId(String rootProcessInstanceId) {
        this.rootProcessInstanceId = rootProcessInstanceId;
        return this;
    }

    /**
     * The process instance id of the root process instance that initiated the process containing this historic detail.
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

    public HistoricDetailDto fieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    /**
     * The id of the form field.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;formField&#x60;.
     * @return fieldId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FIELD_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFieldId() {
        return fieldId;
    }

    @JsonProperty(JSON_PROPERTY_FIELD_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public HistoricDetailDto fieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    /**
     * The submitted form field value. The value differs depending on the form field&#39;s type and on the &#x60;deserializeValue&#x60; parameter.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;formField&#x60;.
     * @return fieldValue
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getFieldValue() {
        return fieldValue;
    }

    @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    public HistoricDetailDto variableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * The name of the variable which has been updated.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return variableName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVariableName() {
        return variableName;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public HistoricDetailDto variableInstanceId(String variableInstanceId) {
        this.variableInstanceId = variableInstanceId;
        return this;
    }

    /**
     * The id of the associated variable instance.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return variableInstanceId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVariableInstanceId() {
        return variableInstanceId;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_INSTANCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableInstanceId(String variableInstanceId) {
        this.variableInstanceId = variableInstanceId;
    }

    public HistoricDetailDto variableType(String variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * The value type of the variable.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return variableType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVariableType() {
        return variableType;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public HistoricDetailDto value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * The variable&#39;s value. Value differs depending on the variable&#39;s type and on the deserializeValues parameter.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return value
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(Object value) {
        this.value = value;
    }

    public HistoricDetailDto valueInfo(Map<String, Object> valueInfo) {
        this.valueInfo = valueInfo;
        return this;
    }

    public HistoricDetailDto putValueInfoItem(String key, Object valueInfoItem) {
        if (this.valueInfo == null) {
            this.valueInfo = new HashMap<>();
        }
        this.valueInfo.put(key, valueInfoItem);
        return this;
  }

    /**
     * A JSON object containing additional, value-type-dependent properties. For variables of type &#x60;Object&#x60;, the following properties are returned:  * &#x60;objectTypeName&#x60;: A string representation of the object&#39;s type name. * &#x60;serializationDataFormat&#x60;: The serialization format used to store the variable.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return valueInfo
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VALUE_INFO)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, Object> getValueInfo() {
        return valueInfo;
    }

    @JsonProperty(JSON_PROPERTY_VALUE_INFO)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public void setValueInfo(Map<String, Object> valueInfo) {
        this.valueInfo = valueInfo;
    }

    public HistoricDetailDto initial(Boolean initial) {
        this.initial = initial;
        return this;
    }

    /**
     * Returns &#x60;true&#x60; for variable updates that contains the initial values of the variables.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return initial
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INITIAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getInitial() {
        return initial;
    }

    @JsonProperty(JSON_PROPERTY_INITIAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInitial(Boolean initial) {
        this.initial = initial;
    }

    public HistoricDetailDto revision(Integer revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The revision of the historic variable update.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return revision
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REVISION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRevision() {
        return revision;
    }

    @JsonProperty(JSON_PROPERTY_REVISION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public HistoricDetailDto errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * An error message in case a Java Serialized Object could not be de-serialized.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
     * @return errorMessage
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoricDetailDto historicDetailDto = (HistoricDetailDto) o;
        return Objects.equals(this.id, historicDetailDto.id) &&
            Objects.equals(this.type, historicDetailDto.type) &&
            Objects.equals(this.processDefinitionKey, historicDetailDto.processDefinitionKey) &&
            Objects.equals(this.processDefinitionId, historicDetailDto.processDefinitionId) &&
            Objects.equals(this.processInstanceId, historicDetailDto.processInstanceId) &&
            Objects.equals(this.activityInstanceId, historicDetailDto.activityInstanceId) &&
            Objects.equals(this.executionId, historicDetailDto.executionId) &&
            Objects.equals(this.caseDefinitionKey, historicDetailDto.caseDefinitionKey) &&
            Objects.equals(this.caseDefinitionId, historicDetailDto.caseDefinitionId) &&
            Objects.equals(this.caseInstanceId, historicDetailDto.caseInstanceId) &&
            Objects.equals(this.caseExecutionId, historicDetailDto.caseExecutionId) &&
            Objects.equals(this.taskId, historicDetailDto.taskId) &&
            Objects.equals(this.tenantId, historicDetailDto.tenantId) &&
            Objects.equals(this.userOperationId, historicDetailDto.userOperationId) &&
            Objects.equals(this.time, historicDetailDto.time) &&
            Objects.equals(this.removalTime, historicDetailDto.removalTime) &&
            Objects.equals(this.rootProcessInstanceId, historicDetailDto.rootProcessInstanceId) &&
            Objects.equals(this.fieldId, historicDetailDto.fieldId) &&
            Objects.equals(this.fieldValue, historicDetailDto.fieldValue) &&
            Objects.equals(this.variableName, historicDetailDto.variableName) &&
            Objects.equals(this.variableInstanceId, historicDetailDto.variableInstanceId) &&
            Objects.equals(this.variableType, historicDetailDto.variableType) &&
            Objects.equals(this.value, historicDetailDto.value) &&
            Objects.equals(this.valueInfo, historicDetailDto.valueInfo) &&
            Objects.equals(this.initial, historicDetailDto.initial) &&
            Objects.equals(this.revision, historicDetailDto.revision) &&
            Objects.equals(this.errorMessage, historicDetailDto.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, processDefinitionKey, processDefinitionId, processInstanceId, activityInstanceId, executionId, caseDefinitionKey, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, tenantId, userOperationId, time, removalTime, rootProcessInstanceId, fieldId, fieldValue, variableName, variableInstanceId, variableType, value, valueInfo, initial, revision, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricDetailDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
        sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
        sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
        sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    userOperationId: ").append(toIndentedString(userOperationId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
        sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
        sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
        sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
        sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
        sb.append("    variableInstanceId: ").append(toIndentedString(variableInstanceId)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
        sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
