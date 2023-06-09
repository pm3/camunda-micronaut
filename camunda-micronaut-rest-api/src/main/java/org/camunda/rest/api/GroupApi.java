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

package org.camunda.rest.api;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import org.camunda.rest.model.CountResultDto;
import org.camunda.rest.model.GroupDto;
import org.camunda.rest.model.GroupQueryDto;
import org.camunda.rest.model.ResourceOptionsDto;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Client("${openapi-micronaut-client-base-path}")
public interface GroupApi {
    /**
     * Group Resource Instance Options
     * The &#x60;/group&#x60; resource supports two custom OPTIONS requests, one for the resource as such and this one for individual group instances. The OPTIONS request allows checking for the set of available operations that the currently authenticated user can perform on the &#x60;/group/{id}&#x60; resource instance. If the user can perform an operation or not may depend on various things, including the users authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @param id The id of the group. (required)
     * @return ResourceOptionsDto
     */
    @Options(uri="/group/{id}")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableGroupInstanceOperations(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Group Membership Resource Options
     * The OPTIONS request allows checking for the set of available operations that the currently authenticated user can perform on the resource. If the user can perform an operation or not may depend on various things, including the users authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @param id The id of the group. (required)
     * @return ResourceOptionsDto
     */
    @Options(uri="/group/{id}/members")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableGroupMembersOperations(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Group Resource Options
     * The &#x60;/group&#x60; resource supports two custom OPTIONS requests, this one for the resource as such and one for individual group instances. The OPTIONS request allows checking for the set of available operations that the currently authenticated user can perform on the &#x60;/group&#x60; resource. If the user can perform an operation or not may depend on various things, including the users authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @return ResourceOptionsDto
     */
    @Options(uri="/group")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableGroupOperations();

    /**
     * Create Group
     * Creates a new group.
     *
     * @param groupDto  (optional)
     */
    @Post(uri="/group/create")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> createGroup(
        @Body @Nullable @Valid GroupDto groupDto
    );

    /**
     * Create Group Member
     * Adds a member to a group.
     *
     * @param id The id of the group. (required)
     * @param userId The id of user to add to the group. (required)
     */
    @Put(uri="/group/{id}/members/{userId}")
    @Consumes({"application/json"})
    Mono<Void> createGroupMember(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="userId") @NotNull String userId
    );

    /**
     * Delete Group
     * Deletes a group by id.
     *
     * @param id The id of the group to be deleted. (required)
     */
    @Delete(uri="/group/{id}")
    @Consumes({"application/json"})
    Mono<Void> deleteGroup(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Delete a Group Member
     * Removes a member from a group.
     *
     * @param id The id of the group. (required)
     * @param userId The id of user to remove from the group. (required)
     */
    @Delete(uri="/group/{id}/members/{userId}")
    @Consumes({"application/json"})
    Mono<Void> deleteGroupMember(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="userId") @NotNull String userId
    );

    /**
     * Get Group
     * Retrieves a group by id.
     *
     * @param id The id of the group to be retrieved. (required)
     * @return GroupDto
     */
    @Get(uri="/group/{id}")
    @Consumes({"application/json"})
    Mono<GroupDto> getGroup(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get List Count
     * Queries for groups using a list of parameters and retrieves the count.
     *
     * @param id Filter by the id of the group. (optional)
     * @param idIn Filter by a comma seperated list of group ids. (optional)
     * @param name Filter by the name of the group. (optional)
     * @param nameLike Filter by the name that the parameter is a substring of. (optional)
     * @param type Filter by the type of the group. (optional)
     * @param member Only retrieve groups where the given user id is a member of. (optional)
     * @param memberOfTenant Only retrieve groups which are members of the given tenant. (optional)
     * @return CountResultDto
     */
    @Get(uri="/group/count")
    @Consumes({"application/json"})
    Mono<CountResultDto> getGroupCount(
        @QueryValue(value="id") @Nullable String id, 
        @QueryValue(value="idIn") @Nullable String idIn, 
        @QueryValue(value="name") @Nullable String name, 
        @QueryValue(value="nameLike") @Nullable String nameLike, 
        @QueryValue(value="type") @Nullable String type, 
        @QueryValue(value="member") @Nullable String member, 
        @QueryValue(value="memberOfTenant") @Nullable String memberOfTenant
    );

    /**
     * Get List
     * Queries for a list of groups using a list of parameters. The size of the result set can be retrieved by using the [Get Group Count](https://docs.camunda.org/manual/7.18/reference/rest/group/get-query-count) method.
     *
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param id Filter by the id of the group. (optional)
     * @param idIn Filter by a comma seperated list of group ids. (optional)
     * @param name Filter by the name of the group. (optional)
     * @param nameLike Filter by the name that the parameter is a substring of. (optional)
     * @param type Filter by the type of the group. (optional)
     * @param member Only retrieve groups where the given user id is a member of. (optional)
     * @param memberOfTenant Only retrieve groups which are members of the given tenant. (optional)
     * @return List&lt;GroupDto&gt;
     */
    @Get(uri="/group")
    @Consumes({"application/json"})
    Mono<List<GroupDto>> getQueryGroups(
        @QueryValue(value="sortBy") @Nullable String sortBy, 
        @QueryValue(value="sortOrder") @Nullable String sortOrder, 
        @QueryValue(value="firstResult") @Nullable Integer firstResult, 
        @QueryValue(value="maxResults") @Nullable Integer maxResults, 
        @QueryValue(value="id") @Nullable String id, 
        @QueryValue(value="idIn") @Nullable String idIn, 
        @QueryValue(value="name") @Nullable String name, 
        @QueryValue(value="nameLike") @Nullable String nameLike, 
        @QueryValue(value="type") @Nullable String type, 
        @QueryValue(value="member") @Nullable String member, 
        @QueryValue(value="memberOfTenant") @Nullable String memberOfTenant
    );

    /**
     * Get List (POST)
     * Queries for a list of groups using a list of parameters. The size of the result set can be retrieved by using the [Get Group Count (POST)](https://docs.camunda.org/manual/7.18/reference/rest/group/post-query-count/) method.
     *
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param groupQueryDto  (optional)
     * @return List&lt;GroupDto&gt;
     */
    @Post(uri="/group")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<List<GroupDto>> postQueryGroups(
        @QueryValue(value="firstResult") @Nullable Integer firstResult, 
        @QueryValue(value="maxResults") @Nullable Integer maxResults, 
        @Body @Nullable @Valid GroupQueryDto groupQueryDto
    );

    /**
     * Get List Count (POST)
     * Queries for groups using a list of parameters and retrieves the count.
     *
     * @param groupQueryDto  (optional)
     * @return CountResultDto
     */
    @Post(uri="/group/count")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CountResultDto> queryGroupCount(
        @Body @Nullable @Valid GroupQueryDto groupQueryDto
    );

    /**
     * Update Group
     * Updates a given group by id.
     *
     * @param id The id of the group. (required)
     * @param groupDto  (optional)
     */
    @Put(uri="/group/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> updateGroup(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid GroupDto groupDto
    );

}
