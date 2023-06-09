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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A event subscription query which retrieves a list of event subscriptions
 */
@JsonPropertyOrder({
  EventSubscriptionQueryDto.JSON_PROPERTY_EVENT_SUBSCRIPTION_ID,
  EventSubscriptionQueryDto.JSON_PROPERTY_EVENT_NAME,
  EventSubscriptionQueryDto.JSON_PROPERTY_EVENT_TYPE,
  EventSubscriptionQueryDto.JSON_PROPERTY_EXECUTION_ID,
  EventSubscriptionQueryDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  EventSubscriptionQueryDto.JSON_PROPERTY_ACTIVITY_ID,
  EventSubscriptionQueryDto.JSON_PROPERTY_TENANT_ID_IN,
  EventSubscriptionQueryDto.JSON_PROPERTY_WITHOUT_TENANT_ID,
  EventSubscriptionQueryDto.JSON_PROPERTY_INCLUDE_EVENT_SUBSCRIPTIONS_WITHOUT_TENANT_ID,
  EventSubscriptionQueryDto.JSON_PROPERTY_SORTING
})
@JsonTypeName("EventSubscriptionQueryDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class EventSubscriptionQueryDto {
    public static final String JSON_PROPERTY_EVENT_SUBSCRIPTION_ID = "eventSubscriptionId";
    private String eventSubscriptionId;

    public static final String JSON_PROPERTY_EVENT_NAME = "eventName";
    private String eventName;

    /**
     * The type of the event subscription.
     */
    public enum EventTypeEnum {
        MESSAGE("message"),
        SIGNAL("signal"),
        COMPENSATE("compensate"),
        CONDITIONAL("conditional");

        private String value;

        EventTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventTypeEnum fromValue(String value) {
            for (EventTypeEnum b : EventTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }
    public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
    private EventTypeEnum eventType;

    public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
    private String executionId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
    private String activityId;

    public static final String JSON_PROPERTY_TENANT_ID_IN = "tenantIdIn";
    private List<String> tenantIdIn = null;

    public static final String JSON_PROPERTY_WITHOUT_TENANT_ID = "withoutTenantId";
    private Boolean withoutTenantId;

    public static final String JSON_PROPERTY_INCLUDE_EVENT_SUBSCRIPTIONS_WITHOUT_TENANT_ID = "includeEventSubscriptionsWithoutTenantId";
    private Boolean includeEventSubscriptionsWithoutTenantId;

    public static final String JSON_PROPERTY_SORTING = "sorting";
    private List<EventSubscriptionQueryDtoSortingInner> sorting = null;

    public EventSubscriptionQueryDto() {
    }

    public EventSubscriptionQueryDto eventSubscriptionId(String eventSubscriptionId) {
        this.eventSubscriptionId = eventSubscriptionId;
        return this;
    }

    /**
     * The id of the event subscription.
     * @return eventSubscriptionId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EVENT_SUBSCRIPTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEventSubscriptionId() {
        return eventSubscriptionId;
    }

    @JsonProperty(JSON_PROPERTY_EVENT_SUBSCRIPTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEventSubscriptionId(String eventSubscriptionId) {
        this.eventSubscriptionId = eventSubscriptionId;
    }

    public EventSubscriptionQueryDto eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * The name of the event this subscription belongs to as defined in the process model.
     * @return eventName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EVENT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEventName() {
        return eventName;
    }

    @JsonProperty(JSON_PROPERTY_EVENT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventSubscriptionQueryDto eventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of the event subscription.
     * @return eventType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EventTypeEnum getEventType() {
        return eventType;
    }

    @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public EventSubscriptionQueryDto executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * The execution that is subscribed on the referenced event.
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

    public EventSubscriptionQueryDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The process instance this subscription belongs to.
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

    public EventSubscriptionQueryDto activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The identifier of the activity that this event subscription belongs to. This could for example be the id of a receive task.
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

    public EventSubscriptionQueryDto tenantIdIn(List<String> tenantIdIn) {
        this.tenantIdIn = tenantIdIn;
        return this;
    }

    public EventSubscriptionQueryDto addTenantIdInItem(String tenantIdInItem) {
        if (this.tenantIdIn == null) {
            this.tenantIdIn = new ArrayList<>();
        }
        this.tenantIdIn.add(tenantIdInItem);
        return this;
    }

    /**
     * Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids.
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

    public EventSubscriptionQueryDto withoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
        return this;
    }

    /**
     * Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
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

    public EventSubscriptionQueryDto includeEventSubscriptionsWithoutTenantId(Boolean includeEventSubscriptionsWithoutTenantId) {
        this.includeEventSubscriptionsWithoutTenantId = includeEventSubscriptionsWithoutTenantId;
        return this;
    }

    /**
     * Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
     * @return includeEventSubscriptionsWithoutTenantId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCLUDE_EVENT_SUBSCRIPTIONS_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIncludeEventSubscriptionsWithoutTenantId() {
        return includeEventSubscriptionsWithoutTenantId;
    }

    @JsonProperty(JSON_PROPERTY_INCLUDE_EVENT_SUBSCRIPTIONS_WITHOUT_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncludeEventSubscriptionsWithoutTenantId(Boolean includeEventSubscriptionsWithoutTenantId) {
        this.includeEventSubscriptionsWithoutTenantId = includeEventSubscriptionsWithoutTenantId;
    }

    public EventSubscriptionQueryDto sorting(List<EventSubscriptionQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
        return this;
    }

    public EventSubscriptionQueryDto addSortingItem(EventSubscriptionQueryDtoSortingInner sortingItem) {
        if (this.sorting == null) {
            this.sorting = new ArrayList<>();
        }
        this.sorting.add(sortingItem);
        return this;
    }

    /**
     * Apply sorting of the result
     * @return sorting
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<EventSubscriptionQueryDtoSortingInner> getSorting() {
        return sorting;
    }

    @JsonProperty(JSON_PROPERTY_SORTING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSorting(List<EventSubscriptionQueryDtoSortingInner> sorting) {
        this.sorting = sorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventSubscriptionQueryDto eventSubscriptionQueryDto = (EventSubscriptionQueryDto) o;
        return Objects.equals(this.eventSubscriptionId, eventSubscriptionQueryDto.eventSubscriptionId) &&
            Objects.equals(this.eventName, eventSubscriptionQueryDto.eventName) &&
            Objects.equals(this.eventType, eventSubscriptionQueryDto.eventType) &&
            Objects.equals(this.executionId, eventSubscriptionQueryDto.executionId) &&
            Objects.equals(this.processInstanceId, eventSubscriptionQueryDto.processInstanceId) &&
            Objects.equals(this.activityId, eventSubscriptionQueryDto.activityId) &&
            Objects.equals(this.tenantIdIn, eventSubscriptionQueryDto.tenantIdIn) &&
            Objects.equals(this.withoutTenantId, eventSubscriptionQueryDto.withoutTenantId) &&
            Objects.equals(this.includeEventSubscriptionsWithoutTenantId, eventSubscriptionQueryDto.includeEventSubscriptionsWithoutTenantId) &&
            Objects.equals(this.sorting, eventSubscriptionQueryDto.sorting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, sorting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSubscriptionQueryDto {\n");
        sb.append("    eventSubscriptionId: ").append(toIndentedString(eventSubscriptionId)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
        sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
        sb.append("    includeEventSubscriptionsWithoutTenantId: ").append(toIndentedString(includeEventSubscriptionsWithoutTenantId)).append("\n");
        sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

