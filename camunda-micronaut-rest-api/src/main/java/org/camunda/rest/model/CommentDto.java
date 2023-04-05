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
 * CommentDto
 */
@JsonPropertyOrder({
  CommentDto.JSON_PROPERTY_ID,
  CommentDto.JSON_PROPERTY_USER_ID,
  CommentDto.JSON_PROPERTY_TASK_ID,
  CommentDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  CommentDto.JSON_PROPERTY_TIME,
  CommentDto.JSON_PROPERTY_MESSAGE,
  CommentDto.JSON_PROPERTY_REMOVAL_TIME,
  CommentDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID,
  CommentDto.JSON_PROPERTY_LINKS
})
@JsonTypeName("CommentDto")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class CommentDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_USER_ID = "userId";
    private String userId;

    public static final String JSON_PROPERTY_TASK_ID = "taskId";
    private String taskId;

    public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
    private String processInstanceId;

    public static final String JSON_PROPERTY_TIME = "time";
    private OffsetDateTime time;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
    private OffsetDateTime removalTime;

    public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
    private String rootProcessInstanceId;

    public static final String JSON_PROPERTY_LINKS = "links";
    private List<AtomLink> links = null;

    public CommentDto() {
    }

    public CommentDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the task comment.
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

    public CommentDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The id of the user who created the comment.
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

    public CommentDto taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * The id of the task to which the comment belongs.
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

    public CommentDto processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * The id of the process instance the comment is related to.
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

    public CommentDto time(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * The time when the comment was created. [Default format]($(docsUrl)/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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

    public CommentDto message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The content of the comment.
     * @return message
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(String message) {
        this.message = message;
    }

    public CommentDto removalTime(OffsetDateTime removalTime) {
        this.removalTime = removalTime;
        return this;
    }

    /**
     * The time after which the comment should be removed by the History Cleanup job. [Default format]($(docsUrl)/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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

    public CommentDto rootProcessInstanceId(String rootProcessInstanceId) {
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

    public CommentDto links(List<AtomLink> links) {
        this.links = links;
        return this;
    }

    public CommentDto addLinksItem(AtomLink linksItem) {
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
        CommentDto commentDto = (CommentDto) o;
        return Objects.equals(this.id, commentDto.id) &&
            Objects.equals(this.userId, commentDto.userId) &&
            Objects.equals(this.taskId, commentDto.taskId) &&
            Objects.equals(this.processInstanceId, commentDto.processInstanceId) &&
            Objects.equals(this.time, commentDto.time) &&
            Objects.equals(this.message, commentDto.message) &&
            Objects.equals(this.removalTime, commentDto.removalTime) &&
            Objects.equals(this.rootProcessInstanceId, commentDto.rootProcessInstanceId) &&
            Objects.equals(this.links, commentDto.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, taskId, processInstanceId, time, message, removalTime, rootProcessInstanceId, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
