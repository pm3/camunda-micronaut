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
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * FetchExternalTaskTopicDto
 */
@JsonPropertyOrder({
  FetchExternalTaskTopicDto.JSON_PROPERTY_TOPIC_NAME,
  FetchExternalTaskTopicDto.JSON_PROPERTY_LOCK_DURATION,
  FetchExternalTaskTopicDto.JSON_PROPERTY_VARIABLES,
  FetchExternalTaskTopicDto.JSON_PROPERTY_LOCAL_VARIABLES,
  FetchExternalTaskTopicDto.JSON_PROPERTY_BUSINESS_KEY,
  FetchExternalTaskTopicDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  FetchExternalTaskTopicDto.JSON_PROPERTY_PROCESS_DEFINITION_ID_IN,
  FetchExternalTaskTopicDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  FetchExternalTaskTopicDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY_IN,
  FetchExternalTaskTopicDto.JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG,
  FetchExternalTaskTopicDto.JSON_PROPERTY_WITHOUT_TENANT_ID,
  FetchExternalTaskTopicDto.JSON_PROPERTY_TENANT_ID_IN,
  FetchExternalTaskTopicDto.JSON_PROPERTY_PROCESS_VARIABLES,
  FetchExternalTaskTopicDto.JSON_PROPERTY_DESERIALIZE_VALUES,
  FetchExternalTaskTopicDto.JSON_PROPERTY_INCLUDE_EXTENSION_PROPERTIES
})
@JsonTypeName("FetchExternalTaskTopicDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class FetchExternalTaskTopicDto {
    public static final String JSON_PROPERTY_TOPIC_NAME = "topicName";
    private String topicName;

    public static final String JSON_PROPERTY_LOCK_DURATION = "lockDuration";
    private Long lockDuration;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    private List<String> variables = null;

    public static final String JSON_PROPERTY_LOCAL_VARIABLES = "localVariables";
    private Boolean localVariables = false;

    public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
    private String businessKey;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
    private String processDefinitionId;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID_IN = "processDefinitionIdIn";
    private List<String> processDefinitionIdIn = null;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
    private String processDefinitionKey;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY_IN = "processDefinitionKeyIn";
    private List<String> processDefinitionKeyIn = null;

    public static final String JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG = "processDefinitionVersionTag";
    private String processDefinitionVersionTag;

    public static final String JSON_PROPERTY_WITHOUT_TENANT_ID = "withoutTenantId";
    private Boolean withoutTenantId = false;

    public static final String JSON_PROPERTY_TENANT_ID_IN = "tenantIdIn";
    private List<String> tenantIdIn = null;

    public static final String JSON_PROPERTY_PROCESS_VARIABLES = "processVariables";
    private Map<String, Object> processVariables = null;

    public static final String JSON_PROPERTY_DESERIALIZE_VALUES = "deserializeValues";
    private Boolean deserializeValues = false;

    public static final String JSON_PROPERTY_INCLUDE_EXTENSION_PROPERTIES = "includeExtensionProperties";
    private Boolean includeExtensionProperties = false;

    public FetchExternalTaskTopicDto(String topicName, Long lockDuration) {
        this.topicName = topicName;
        this.lockDuration = lockDuration;
    }

    public FetchExternalTaskTopicDto topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * **Mandatory.** The topic&#39;s name.
     * @return topicName
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTopicName() {
        return topicName;
    }

    @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public FetchExternalTaskTopicDto lockDuration(Long lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * **Mandatory.** The duration to lock the external tasks for in milliseconds.
     * @return lockDuration
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_LOCK_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getLockDuration() {
        return lockDuration;
    }

    @JsonProperty(JSON_PROPERTY_LOCK_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLockDuration(Long lockDuration) {
        this.lockDuration = lockDuration;
    }

    public FetchExternalTaskTopicDto variables(List<String> variables) {
        this.variables = variables;
        return this;
    }

    public FetchExternalTaskTopicDto addVariablesItem(String variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    /**
     * A JSON array of &#x60;String&#x60; values that represent variable names. For each result task belonging to this topic, the given variables are returned as well if they are accessible from the external task&#39;s execution. If not provided - all variables will be fetched.
     * @return variables
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getVariables() {
        return variables;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariables(List<String> variables) {
        this.variables = variables;
    }

    public FetchExternalTaskTopicDto localVariables(Boolean localVariables) {
        this.localVariables = localVariables;
        return this;
    }

    /**
     * If &#x60;true&#x60; only local variables will be fetched.
     * @return localVariables
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_LOCAL_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getLocalVariables() {
        return localVariables;
    }

    @JsonProperty(JSON_PROPERTY_LOCAL_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocalVariables(Boolean localVariables) {
        this.localVariables = localVariables;
    }

    public FetchExternalTaskTopicDto businessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }

    /**
     * A &#x60;String&#x60; value which enables the filtering of tasks based on process instance business key.
     * @return businessKey
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBusinessKey() {
        return businessKey;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public FetchExternalTaskTopicDto processDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    /**
     * Filter tasks based on process definition id.
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

    public FetchExternalTaskTopicDto processDefinitionIdIn(List<String> processDefinitionIdIn) {
        this.processDefinitionIdIn = processDefinitionIdIn;
        return this;
    }

    public FetchExternalTaskTopicDto addProcessDefinitionIdInItem(String processDefinitionIdInItem) {
        if (this.processDefinitionIdIn == null) {
            this.processDefinitionIdIn = new ArrayList<>();
        }
        this.processDefinitionIdIn.add(processDefinitionIdInItem);
        return this;
    }

    /**
     * Filter tasks based on process definition ids.
     * @return processDefinitionIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getProcessDefinitionIdIn() {
        return processDefinitionIdIn;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionIdIn(List<String> processDefinitionIdIn) {
        this.processDefinitionIdIn = processDefinitionIdIn;
    }

    public FetchExternalTaskTopicDto processDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    /**
     * Filter tasks based on process definition key.
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

    public FetchExternalTaskTopicDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
        this.processDefinitionKeyIn = processDefinitionKeyIn;
        return this;
    }

    public FetchExternalTaskTopicDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
        if (this.processDefinitionKeyIn == null) {
            this.processDefinitionKeyIn = new ArrayList<>();
        }
        this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
        return this;
    }

    /**
     * Filter tasks based on process definition keys.
     * @return processDefinitionKeyIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getProcessDefinitionKeyIn() {
        return processDefinitionKeyIn;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
        this.processDefinitionKeyIn = processDefinitionKeyIn;
    }

    public FetchExternalTaskTopicDto processDefinitionVersionTag(String processDefinitionVersionTag) {
        this.processDefinitionVersionTag = processDefinitionVersionTag;
        return this;
    }

    /**
     * Filter tasks based on process definition version tag.
     * @return processDefinitionVersionTag
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProcessDefinitionVersionTag() {
        return processDefinitionVersionTag;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessDefinitionVersionTag(String processDefinitionVersionTag) {
        this.processDefinitionVersionTag = processDefinitionVersionTag;
    }

    public FetchExternalTaskTopicDto withoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
        return this;
    }

    /**
     * Filter tasks without tenant id.
     * @return withoutTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getWithoutTenantId() {
        return withoutTenantId;
    }

    @JsonProperty(JSON_PROPERTY_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWithoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
    }

    public FetchExternalTaskTopicDto tenantIdIn(List<String> tenantIdIn) {
        this.tenantIdIn = tenantIdIn;
        return this;
    }

    public FetchExternalTaskTopicDto addTenantIdInItem(String tenantIdInItem) {
        if (this.tenantIdIn == null) {
            this.tenantIdIn = new ArrayList<>();
        }
        this.tenantIdIn.add(tenantIdInItem);
        return this;
    }

    /**
     * Filter tasks based on tenant ids.
     * @return tenantIdIn
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TENANT_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTenantIdIn() {
        return tenantIdIn;
    }

    @JsonProperty(JSON_PROPERTY_TENANT_ID_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTenantIdIn(List<String> tenantIdIn) {
        this.tenantIdIn = tenantIdIn;
    }

    public FetchExternalTaskTopicDto processVariables(Map<String, Object> processVariables) {
        this.processVariables = processVariables;
        return this;
    }

    public FetchExternalTaskTopicDto putProcessVariablesItem(String key, Object processVariablesItem) {
        if (this.processVariables == null) {
            this.processVariables = new HashMap<>();
        }
        this.processVariables.put(key, processVariablesItem);
        return this;
  }

    /**
     * A &#x60;JSON&#x60; object used for filtering tasks based on process instance variable values. A property name of the object represents a process variable name, while the property value represents the process variable value to filter tasks by.
     * @return processVariables
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROCESS_VARIABLES)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, Object> getProcessVariables() {
        return processVariables;
    }

    @JsonProperty(JSON_PROPERTY_PROCESS_VARIABLES)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public void setProcessVariables(Map<String, Object> processVariables) {
        this.processVariables = processVariables;
    }

    public FetchExternalTaskTopicDto deserializeValues(Boolean deserializeValues) {
        this.deserializeValues = deserializeValues;
        return this;
    }

    /**
     * Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default &#x60;false&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.
     * @return deserializeValues
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DESERIALIZE_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDeserializeValues() {
        return deserializeValues;
    }

    @JsonProperty(JSON_PROPERTY_DESERIALIZE_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDeserializeValues(Boolean deserializeValues) {
        this.deserializeValues = deserializeValues;
    }

    public FetchExternalTaskTopicDto includeExtensionProperties(Boolean includeExtensionProperties) {
        this.includeExtensionProperties = includeExtensionProperties;
        return this;
    }

    /**
     * Determines whether custom extension properties defined in the BPMN activity of the external task (e.g. via the Extensions tab in the Camunda modeler) should be included in the response. Default: false
     * @return includeExtensionProperties
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCLUDE_EXTENSION_PROPERTIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIncludeExtensionProperties() {
        return includeExtensionProperties;
    }

    @JsonProperty(JSON_PROPERTY_INCLUDE_EXTENSION_PROPERTIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncludeExtensionProperties(Boolean includeExtensionProperties) {
        this.includeExtensionProperties = includeExtensionProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchExternalTaskTopicDto fetchExternalTaskTopicDto = (FetchExternalTaskTopicDto) o;
        return Objects.equals(this.topicName, fetchExternalTaskTopicDto.topicName) &&
            Objects.equals(this.lockDuration, fetchExternalTaskTopicDto.lockDuration) &&
            Objects.equals(this.variables, fetchExternalTaskTopicDto.variables) &&
            Objects.equals(this.localVariables, fetchExternalTaskTopicDto.localVariables) &&
            Objects.equals(this.businessKey, fetchExternalTaskTopicDto.businessKey) &&
            Objects.equals(this.processDefinitionId, fetchExternalTaskTopicDto.processDefinitionId) &&
            Objects.equals(this.processDefinitionIdIn, fetchExternalTaskTopicDto.processDefinitionIdIn) &&
            Objects.equals(this.processDefinitionKey, fetchExternalTaskTopicDto.processDefinitionKey) &&
            Objects.equals(this.processDefinitionKeyIn, fetchExternalTaskTopicDto.processDefinitionKeyIn) &&
            Objects.equals(this.processDefinitionVersionTag, fetchExternalTaskTopicDto.processDefinitionVersionTag) &&
            Objects.equals(this.withoutTenantId, fetchExternalTaskTopicDto.withoutTenantId) &&
            Objects.equals(this.tenantIdIn, fetchExternalTaskTopicDto.tenantIdIn) &&
            Objects.equals(this.processVariables, fetchExternalTaskTopicDto.processVariables) &&
            Objects.equals(this.deserializeValues, fetchExternalTaskTopicDto.deserializeValues) &&
            Objects.equals(this.includeExtensionProperties, fetchExternalTaskTopicDto.includeExtensionProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicName, lockDuration, variables, localVariables, businessKey, processDefinitionId, processDefinitionIdIn, processDefinitionKey, processDefinitionKeyIn, processDefinitionVersionTag, withoutTenantId, tenantIdIn, processVariables, deserializeValues, includeExtensionProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchExternalTaskTopicDto {\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    lockDuration: ").append(toIndentedString(lockDuration)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
        sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
        sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
        sb.append("    processDefinitionIdIn: ").append(toIndentedString(processDefinitionIdIn)).append("\n");
        sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
        sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
        sb.append("    processDefinitionVersionTag: ").append(toIndentedString(processDefinitionVersionTag)).append("\n");
        sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
        sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
        sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
        sb.append("    deserializeValues: ").append(toIndentedString(deserializeValues)).append("\n");
        sb.append("    includeExtensionProperties: ").append(toIndentedString(includeExtensionProperties)).append("\n");
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

