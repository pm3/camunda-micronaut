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
 * AttachmentDto
 */
@JsonPropertyOrder({
  AttachmentDto.JSON_PROPERTY_ID,
  AttachmentDto.JSON_PROPERTY_NAME,
  AttachmentDto.JSON_PROPERTY_DESCRIPTION,
  AttachmentDto.JSON_PROPERTY_TASK_ID,
  AttachmentDto.JSON_PROPERTY_TYPE,
  AttachmentDto.JSON_PROPERTY_URL,
  AttachmentDto.JSON_PROPERTY_CREATE_TIME,
  AttachmentDto.JSON_PROPERTY_REMOVAL_TIME,
  AttachmentDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID,
  AttachmentDto.JSON_PROPERTY_LINKS
})
@JsonTypeName("AttachmentDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class AttachmentDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_TASK_ID = "taskId";
    private String taskId;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
    private OffsetDateTime createTime;

    public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
    private OffsetDateTime removalTime;

    public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
    private String rootProcessInstanceId;

    public static final String JSON_PROPERTY_LINKS = "links";
    private List<AtomLink> links = null;

    public AttachmentDto() {
    }

    public AttachmentDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the task attachment.
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

    public AttachmentDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the task attachment.
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

    public AttachmentDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the task attachment.
     * @return description
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public AttachmentDto taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * The id of the task to which the attachment belongs.
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

    public AttachmentDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indication of the type of content that this attachment refers to. Can be MIME type or any other indication.
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

    public AttachmentDto url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The url to the remote content of the task attachment.
     * @return url
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public AttachmentDto createTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * @return createTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    @JsonProperty(JSON_PROPERTY_CREATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AttachmentDto removalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
        return this;
    }

    /**
     * The time after which the attachment should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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

    public AttachmentDto rootProcessInstanceId(String rootProcessInstanceId) {
        this.rootProcessInstanceId = rootProcessInstanceId;
        return this;
    }

    /**
     * The process instance id of the root process instance that initiated the process containing the task.
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

    public AttachmentDto links(List<AtomLink> links) {
        this.links = links;
        return this;
    }

    public AttachmentDto addLinksItem(AtomLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
     * The links associated to this resource, with &#x60;method&#x60;, &#x60;href&#x60; and &#x60;rel&#x60;.
     * @return links
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<AtomLink> getLinks() {
        return links;
    }

    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLinks(List<AtomLink> links) {
        this.links = links;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachmentDto attachmentDto = (AttachmentDto) o;
        return Objects.equals(this.id, attachmentDto.id) &&
            Objects.equals(this.name, attachmentDto.name) &&
            Objects.equals(this.description, attachmentDto.description) &&
            Objects.equals(this.taskId, attachmentDto.taskId) &&
            Objects.equals(this.type, attachmentDto.type) &&
            Objects.equals(this.url, attachmentDto.url) &&
            Objects.equals(this.createTime, attachmentDto.createTime) &&
            Objects.equals(this.removalTime, attachmentDto.removalTime) &&
            Objects.equals(this.rootProcessInstanceId, attachmentDto.rootProcessInstanceId) &&
            Objects.equals(this.links, attachmentDto.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, taskId, type, url, createTime, removalTime, rootProcessInstanceId, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
        sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

