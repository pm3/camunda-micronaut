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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VariableInstanceDto
 */
@JsonPropertyOrder({
  VariableInstanceDto.JSON_PROPERTY_ID,
  VariableInstanceDto.JSON_PROPERTY_NAME,
  VariableInstanceDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  VariableInstanceDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  VariableInstanceDto.JSON_PROPERTY_EXECUTION_ID,
  VariableInstanceDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  VariableInstanceDto.JSON_PROPERTY_CASE_EXECUTION_ID,
  VariableInstanceDto.JSON_PROPERTY_TASK_ID,
  VariableInstanceDto.JSON_PROPERTY_BATCH_ID,
  VariableInstanceDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  VariableInstanceDto.JSON_PROPERTY_TENANT_ID,
  VariableInstanceDto.JSON_PROPERTY_ERROR_MESSAGE,
  VariableInstanceDto.JSON_PROPERTY_VALUE,
  VariableInstanceDto.JSON_PROPERTY_TYPE,
  VariableInstanceDto.JSON_PROPERTY_VALUE_INFO
})
@JsonTypeName("VariableInstanceDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class VariableInstanceDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
    private String caseInstanceId;

    public static final String JSON_PROPERTY_CASE_EXECUTION_ID = "caseExecutionId";
    private String caseExecutionId;

    public static final String JSON_PROPERTY_TASK_ID = "taskId";
    private String taskId;

    public static final String JSON_PROPERTY_BATCH_ID = "batchId";
    private String batchId;

    public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
    private String activityInstanceId;

    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public static final String JSON_PROPERTY_VALUE = "value";
    private Object value = null;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_VALUE_INFO = "valueInfo";
    private Map<String, Object> valueInfo = null;

    public VariableInstanceDto() {
    }

    public VariableInstanceDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the variable instance.
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

    public VariableInstanceDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the variable instance.
     * @return name
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public VariableInstanceDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * The id of the process definition that this variable instance belongs to.
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

    public VariableInstanceDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance that this variable instance belongs to.
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

    public VariableInstanceDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * The id of the execution that this variable instance belongs to.
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

    public VariableInstanceDto caseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
        return this;
    }

    /**
     * The id of the case instance that this variable instance belongs to.
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

    public VariableInstanceDto caseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
        return this;
    }

    /**
     * The id of the case execution that this variable instance belongs to.
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

    public VariableInstanceDto taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * The id of the task that this variable instance belongs to.
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

    public VariableInstanceDto batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * The id of the batch that this variable instance belongs to.&lt;
     * @return batchId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BATCH_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBatchId() {
        return batchId;
    }

    @JsonProperty(JSON_PROPERTY_BATCH_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public VariableInstanceDto activityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }

    /**
     * The id of the activity instance that this variable instance belongs to.
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

    public VariableInstanceDto tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The id of the tenant that this variable instance belongs to.
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

    public VariableInstanceDto errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * An error message in case a Java Serialized Object could not be de-serialized.
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

    public VariableInstanceDto value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Can be any value - string, number, boolean, array or object.  **Note**: Not every endpoint supports every type.
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

    public VariableInstanceDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The value type of the variable.
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

    public VariableInstanceDto valueInfo(Map<String, Object> valueInfo) {
        this.valueInfo = valueInfo;
        return this;
    }

    public VariableInstanceDto putValueInfoItem(String key, Object valueInfoItem) {
        if (this.valueInfo == null) {
            this.valueInfo = new HashMap<>();
        }
        this.valueInfo.put(key, valueInfoItem);
        return this;
  }

    /**
     * A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * &#x60;objectTypeName&#x60;: A string representation of the object&#39;s type name. * &#x60;serializationDataFormat&#x60;: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * &#x60;filename&#x60;: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * &#x60;mimetype&#x60;: The MIME type of the file that is being uploaded. * &#x60;encoding&#x60;: The encoding of the file that is being uploaded.  The following property can be provided for all value types:  * &#x60;transient&#x60;: Indicates whether the variable should be transient or not. See [documentation](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables#transient-variables) for more informations. (Not applicable for &#x60;decision-definition&#x60;, &#x60; /process-instance/variables-async&#x60;, and &#x60;/migration/executeAsync&#x60; endpoints)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableInstanceDto variableInstanceDto = (VariableInstanceDto) o;
        return Objects.equals(this.id, variableInstanceDto.id) &&
            Objects.equals(this.name, variableInstanceDto.name) &&
            Objects.equals(this.processDefinitionId, variableInstanceDto.processDefinitionId) &&
            Objects.equals(this.processInstanceId, variableInstanceDto.processInstanceId) &&
            Objects.equals(this.executionId, variableInstanceDto.executionId) &&
            Objects.equals(this.caseInstanceId, variableInstanceDto.caseInstanceId) &&
            Objects.equals(this.caseExecutionId, variableInstanceDto.caseExecutionId) &&
            Objects.equals(this.taskId, variableInstanceDto.taskId) &&
            Objects.equals(this.batchId, variableInstanceDto.batchId) &&
            Objects.equals(this.activityInstanceId, variableInstanceDto.activityInstanceId) &&
            Objects.equals(this.tenantId, variableInstanceDto.tenantId) &&
            Objects.equals(this.errorMessage, variableInstanceDto.errorMessage) &&
            Objects.equals(this.value, variableInstanceDto.value) &&
            Objects.equals(this.type, variableInstanceDto.type) &&
            Objects.equals(this.valueInfo, variableInstanceDto.valueInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, processDefinitionId, processInstanceId, executionId, caseInstanceId, caseExecutionId, taskId, batchId, activityInstanceId, tenantId, errorMessage, value, type, valueInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableInstanceDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
        sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
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

