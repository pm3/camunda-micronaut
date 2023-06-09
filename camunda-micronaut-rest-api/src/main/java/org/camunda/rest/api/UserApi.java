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
public interface UserApi {
    /**
     * Options
     * The &#x60;/user&#x60; resource supports two custom &#x60;OPTIONS&#x60; requests, one for the resource as such and one for individual user instances. The &#x60;OPTIONS&#x60; request allows checking for the set of available operations that the currently authenticated user can perform on the /user resource. If the user can perform an operation or not may depend on various things, including the user&#39;s authorizations to interact with this resource and the internal configuration of the process engine. &#x60;OPTIONS /user&#x60; returns available interactions on the resource.
     *
     * @return ResourceOptionsDto
     */
    @Options(uri="/user")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableOperations();

    /**
     * Options
     * The &#x60;/user&#x60; resource supports two custom &#x60;OPTIONS&#x60; requests, one for the resource as such and one for individual user instances. The &#x60;OPTIONS&#x60; request allows checking for the set of available operations that the currently authenticated user can perform on the /user resource. If the user can perform an operation or not may depend on various things, including the user&#39;s authorizations to interact with this resource and the internal configuration of the process engine. &#x60;OPTIONS /user/{id}&#x60; returns available interactions on a resource instance.
     *
     * @param id The id of the user to be deleted. (required)
     * @return ResourceOptionsDto
     */
    @Options(uri="/user/{id}")
    @Consumes({"application/json"})
    Mono<ResourceOptionsDto> availableUserOperations(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Create
     * Create a new user.
     *
     * @param userDto  (optional)
     */
    @Post(uri="/user/create")
    @Produces({"application/json"})
    Mono<Void> createUser(
        @Body @Nullable @Valid UserDto userDto
    );

    /**
     * Delete
     * Deletes a user by id.
     *
     * @param id The id of the user to be deleted. (required)
     */
    @Delete(uri="/user/{id}")
    @Consumes({"application/json"})
    Mono<Void> deleteUser(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get List Count
     * Queries for the number of deployments that fulfill given parameters. Takes the same parameters as the [Get Users](https://docs.camunda.org/manual/7.18/reference/rest/user/get-query/) method.
     *
     * @param id Filter by user id (optional)
     * @param idIn Filter by a comma-separated list of user ids. (optional)
     * @param firstName Filter by the first name of the user. Exact match. (optional)
     * @param firstNameLike Filter by the first name that the parameter is a substring of. (optional)
     * @param lastName Filter by the last name of the user. Exact match. (optional)
     * @param lastNameLike Filter by the last name that the parameter is a substring of. (optional)
     * @param email Filter by the email of the user. Exact match. (optional)
     * @param emailLike Filter by the email that the parameter is a substring of. (optional)
     * @param memberOfGroup Filter for users which are members of the given group. (optional)
     * @param memberOfTenant Filter for users which are members of the given tenant. (optional)
     * @param potentialStarter Only select Users that are potential starter for the given process definition. (optional)
     * @return CountResultDto
     */
    @Get(uri="/user/count")
    @Consumes({"application/json"})
    Mono<CountResultDto> getUserCount(
        @QueryValue(value="id") @Nullable String id, 
        @QueryValue(value="idIn") @Nullable String idIn, 
        @QueryValue(value="firstName") @Nullable String firstName, 
        @QueryValue(value="firstNameLike") @Nullable String firstNameLike, 
        @QueryValue(value="lastName") @Nullable String lastName, 
        @QueryValue(value="lastNameLike") @Nullable String lastNameLike, 
        @QueryValue(value="email") @Nullable String email, 
        @QueryValue(value="emailLike") @Nullable String emailLike, 
        @QueryValue(value="memberOfGroup") @Nullable String memberOfGroup, 
        @QueryValue(value="memberOfTenant") @Nullable String memberOfTenant, 
        @QueryValue(value="potentialStarter") @Nullable String potentialStarter
    );

    /**
     * Get Profile
     * Retrieves a user&#39;s profile.
     *
     * @param id The id of the user to retrieve. (required)
     * @return UserProfileDto
     */
    @Get(uri="/user/{id}/profile")
    @Consumes({"application/json"})
    Mono<UserProfileDto> getUserProfile(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Get List
     * Query for a list of users using a list of parameters. The size of the result set can be retrieved by using the Get User Count method. [Get User Count](https://docs.camunda.org/manual/7.18/reference/rest/user/get-query-count/) method.
     *
     * @param id Filter by user id (optional)
     * @param idIn Filter by a comma-separated list of user ids. (optional)
     * @param firstName Filter by the first name of the user. Exact match. (optional)
     * @param firstNameLike Filter by the first name that the parameter is a substring of. (optional)
     * @param lastName Filter by the last name of the user. Exact match. (optional)
     * @param lastNameLike Filter by the last name that the parameter is a substring of. (optional)
     * @param email Filter by the email of the user. Exact match. (optional)
     * @param emailLike Filter by the email that the parameter is a substring of. (optional)
     * @param memberOfGroup Filter for users which are members of the given group. (optional)
     * @param memberOfTenant Filter for users which are members of the given tenant. (optional)
     * @param potentialStarter Only select Users that are potential starter for the given process definition. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return List&lt;UserProfileDto&gt;
     */
    @Get(uri="/user")
    @Consumes({"application/json"})
    Mono<List<UserProfileDto>> getUsers(
        @QueryValue(value="id") @Nullable String id, 
        @QueryValue(value="idIn") @Nullable String idIn, 
        @QueryValue(value="firstName") @Nullable String firstName, 
        @QueryValue(value="firstNameLike") @Nullable String firstNameLike, 
        @QueryValue(value="lastName") @Nullable String lastName, 
        @QueryValue(value="lastNameLike") @Nullable String lastNameLike, 
        @QueryValue(value="email") @Nullable String email, 
        @QueryValue(value="emailLike") @Nullable String emailLike, 
        @QueryValue(value="memberOfGroup") @Nullable String memberOfGroup, 
        @QueryValue(value="memberOfTenant") @Nullable String memberOfTenant, 
        @QueryValue(value="potentialStarter") @Nullable String potentialStarter, 
        @QueryValue(value="sortBy") @Nullable String sortBy, 
        @QueryValue(value="sortOrder") @Nullable String sortOrder, 
        @QueryValue(value="firstResult") @Nullable Integer firstResult, 
        @QueryValue(value="maxResults") @Nullable Integer maxResults
    );

    /**
     * Unlock User
     * Unlocks a user by id.
     *
     * @param id The id of the user to be unlocked. (required)
     */
    @Post(uri="/user/{id}/unlock")
    @Consumes({"application/json"})
    Mono<Void> unlockUser(
        @PathVariable(name="id") @NotNull String id
    );

    /**
     * Update Credentials
     * Updates a user&#39;s credentials (password)
     *
     * @param id The id of the user to be updated. (required)
     * @param userCredentialsDto  (optional)
     */
    @Put(uri="/user/{id}/credentials")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> updateCredentials(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid UserCredentialsDto userCredentialsDto
    );

    /**
     * Update User Profile
     * Updates the profile information of an already existing user.
     *
     * @param id The id of the user. (required)
     * @param userProfileDto  (optional)
     */
    @Put(uri="/user/{id}/profile")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> updateProfile(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid UserProfileDto userProfileDto
    );

}
