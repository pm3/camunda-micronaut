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
import org.camunda.rest.model.*;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Client("${openapi-micronaut-client-base-path}")
public interface AuthorizationApi {
    /**
     * Authorization Resource Options
     * The OPTIONS request allows you to check for the set of available operations that the currently authenticated user can perform on the &#x60;/authorization&#x60; resource. Whether the user can perform an operation or not may depend on various factors, including the users authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @return ResourceOptionsDto
     */
    @Options(uri="/authorization")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableOperationsAuthorization();

    /**
     * Authorization Resource Options
     * The OPTIONS request allows you to check for the set of available operations that the currently authenticated user can perform on a given instance of the &#x60;/authorization&#x60; resource. Whether the user can perform an operation or not may depend on various factors, including the users authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @param id The id of the authorization to be retrieved. (required)
     * @return ResourceOptionsDto
     */
    @Options(uri="/authorization/{id}")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableOperationsAuthorizationInstance(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Create a New Authorization
     * Creates a new authorization.
     *
     * @param authorizationCreateDto  (optional)
     * @return AuthorizationDto
     */
    @Post(uri="/authorization/create")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AuthorizationDto> createAuthorization(
        @Body @Nullable @Valid AuthorizationCreateDto authorizationCreateDto
    );

    /**
     * Delete Authorization
     * Deletes an authorization by id.
     *
     * @param id The id of the authorization to be deleted. (required)
     */
    @Delete(uri="/authorization/{id}")
    @Consumes({"application/json"})
    Mono<Void> deleteAuthorization(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get Authorization
     * Retrieves an authorization by id.
     *
     * @param id The id of the authorization to be retrieved. (required)
     * @return AuthorizationDto
     */
    @Get(uri="/authorization/{id}")
    @Consumes({"application/json"})
    Mono<AuthorizationDto> getAuthorization(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get Authorization Count
     * Queries for authorizations using a list of parameters and retrieves the count.
     *
     * @param id Filter by the id of the authorization. (optional)
     * @param type Filter by authorization type. (0&#x3D;global, 1&#x3D;grant, 2&#x3D;revoke). See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/authorization-service/#authorization-type) for more information about authorization types. (optional)
     * @param userIdIn Filter by a comma-separated list of userIds. (optional)
     * @param groupIdIn Filter by a comma-separated list of groupIds. (optional)
     * @param resourceType Filter by an integer representation of the resource type. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/authorization-service/#resources) for a list of integer representations of resource types. (optional)
     * @param resourceId Filter by resource id. (optional)
     * @return CountResultDto
     */
    @Get(uri="/authorization/count")
    @Consumes({"application/json"})
    Mono<CountResultDto> getAuthorizationCount(
        @QueryValue(value="id") @Nullable String id, 
        @QueryValue(value="type") @Nullable Integer type, 
        @QueryValue(value="userIdIn") @Nullable String userIdIn, 
        @QueryValue(value="groupIdIn") @Nullable String groupIdIn, 
        @QueryValue(value="resourceType") @Nullable Integer resourceType, 
        @QueryValue(value="resourceId") @Nullable String resourceId
    );

    /**
     * Perform an Authorization Check
     * Performs an authorization check for the currently authenticated user.
     *
     * @param permissionName String value representing the permission name to check for. (required)
     * @param resourceName String value for the name of the resource to check permissions for. (required)
     * @param resourceType An integer representing the resource type to check permissions for. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/authorization-service/#resources) for a list of integer representations of resource types. (required)
     * @param resourceId The id of the resource to check permissions for. If left blank, a check for global permissions on the resource is performed. (optional)
     * @param userId The id of the user to check permissions for. The currently authenticated user must have a READ permission for the Authorization resource. If &#x60;userId&#x60; is blank, a check for the currently authenticated user is performed. (optional)
     * @return AuthorizationCheckResultDto
     */
    @Get(uri="/authorization/check")
    @Consumes({"application/json"})
    Mono<AuthorizationCheckResultDto> isUserAuthorized(
        @QueryValue(value="permissionName") @NotNull String permissionName, 
        @QueryValue(value="resourceName") @NotNull String resourceName, 
        @QueryValue(value="resourceType") @NotNull Integer resourceType, 
        @QueryValue(value="resourceId") @Nullable String resourceId, 
        @QueryValue(value="userId") @Nullable String userId
    );

    /**
     * Get Authorizations
     * Queries for a list of authorizations using a list of parameters. The size of the result set can be retrieved by using the [Get Authorization Count](https://docs.camunda.org/manual/7.18/reference/rest/authorization/get-query-count/) method.
     *
     * @param id Filter by the id of the authorization. (optional)
     * @param type Filter by authorization type. (0&#x3D;global, 1&#x3D;grant, 2&#x3D;revoke). See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/authorization-service/#authorization-type) for more information about authorization types. (optional)
     * @param userIdIn Filter by a comma-separated list of userIds. (optional)
     * @param groupIdIn Filter by a comma-separated list of groupIds. (optional)
     * @param resourceType Filter by an integer representation of the resource type. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/authorization-service/#resources) for a list of integer representations of resource types. (optional)
     * @param resourceId Filter by resource id. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return List&lt;AuthorizationDto&gt;
     */
    @Get(uri="/authorization")
    @Consumes({"application/json"})
    Mono<List<AuthorizationDto>> queryAuthorizations(
        @QueryValue(value="id") @Nullable String id, 
        @QueryValue(value="type") @Nullable Integer type, 
        @QueryValue(value="userIdIn") @Nullable String userIdIn, 
        @QueryValue(value="groupIdIn") @Nullable String groupIdIn, 
        @QueryValue(value="resourceType") @Nullable Integer resourceType, 
        @QueryValue(value="resourceId") @Nullable String resourceId, 
        @QueryValue(value="sortBy") @Nullable String sortBy, 
        @QueryValue(value="sortOrder") @Nullable String sortOrder, 
        @QueryValue(value="firstResult") @Nullable Integer firstResult, 
        @QueryValue(value="maxResults") @Nullable Integer maxResults
    );

    /**
     * Update an Authorization
     * Updates an authorization by id.
     *
     * @param id The id of the authorization to be updated. (required)
     * @param authorizationUpdateDto  (optional)
     */
    @Put(uri="/authorization/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> updateAuthorization(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid AuthorizationUpdateDto authorizationUpdateDto
    );

}
