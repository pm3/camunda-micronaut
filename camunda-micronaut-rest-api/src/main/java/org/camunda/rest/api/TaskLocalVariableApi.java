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
import org.camunda.rest.model.PatchVariablesDto;
import org.camunda.rest.model.VariableValueDto;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.Map;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Client("${openapi-micronaut-client-base-path}")
public interface TaskLocalVariableApi {
    /**
     * Delete Local Task Variable
     * Removes a local variable from a task by id.
     *
     * @param id The id of the task to delete the variable from. (required)
     * @param varName The name of the variable to be removed. (required)
     */
    @Delete(uri="/task/{id}/localVariables/{varName}")
    @Consumes({"application/json"})
    Mono<Void> deleteTaskLocalVariable(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="varName") @NotNull String varName
    );

    /**
     * Get Local Task Variable
     * Retrieves a variable from the context of a given task by id.
     *
     * @param id The id of the task to retrieve the variable from. (required)
     * @param varName The name of the variable to get (required)
     * @param deserializeValue Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on the server side (default &#x60;true&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  Note: While &#x60;true&#x60; is the default value for reasons of backward compatibility, we recommend setting this parameter to &#x60;false&#x60; when developing web applications that are independent of the Java process applications deployed to the engine. (optional, default to true)
     * @return VariableValueDto
     */
    @Get(uri="/task/{id}/localVariables/{varName}")
    @Consumes({"application/json"})
    Mono<VariableValueDto> getTaskLocalVariable(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="varName") @NotNull String varName, 
        @QueryValue(value="deserializeValue", defaultValue="true") @Nullable Boolean deserializeValue
    );

    /**
     * Get Local Task Variable (Binary)
     * Retrieves a binary variable from the context of a given task by id. Applicable for byte array and file variables.
     *
     * @param id The id of the task to retrieve the variable for. (required)
     * @param varName The name of the variable to retrieve. (required)
     * @return File
     */
    @Get(uri="/task/{id}/localVariables/{varName}/data")
    @Consumes({"application/octet-stream", "text/plain", "application/json"})
    Mono<File> getTaskLocalVariableBinary(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="varName") @NotNull String varName
    );

    /**
     * Get Local Task Variables
     * Retrieves all variables of a given task by id.
     *
     * @param id The id of the task to retrieve the variables from. (required)
     * @param deserializeValues Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on the server side (default &#x60;true&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While &#x60;true&#x60; is the default value for reasons of backward compatibility, we recommend setting this parameter to &#x60;false&#x60; when developing web applications that are independent of the Java process applications deployed to the engine. (optional, default to true)
     * @return Map&lt;String, VariableValueDto&gt;
     */
    @Get(uri="/task/{id}/localVariables")
    @Consumes({"application/json"})
    Mono<Map<String, VariableValueDto>> getTaskLocalVariables(
        @PathVariable(name="id") @NotNull String id, 
        @QueryValue(value="deserializeValues", defaultValue="true") @Nullable Boolean deserializeValues
    );

    /**
     * Update/Delete Local Task Variables
     * Updates or deletes the variables in the context of a task. Updates precede deletions. So, if a variable is updated AND deleted, the deletion overrides the update.
     *
     * @param id The id of the task to set variables for. (required)
     * @param patchVariablesDto  (optional)
     */
    @Post(uri="/task/{id}/localVariables")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> modifyTaskLocalVariables(
        @PathVariable(name="id") @NotNull String id, 
        @Body @Nullable @Valid PatchVariablesDto patchVariablesDto
    );

    /**
     * Update Local Task Variable
     * Sets a variable in the context of a given task.
     *
     * @param id The id of the task to set the variable for. (required)
     * @param varName The name of the variable to set. (required)
     * @param variableValueDto  (optional)
     */
    @Put(uri="/task/{id}/localVariables/{varName}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> putTaskLocalVariable(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="varName") @NotNull String varName, 
        @Body @Nullable @Valid VariableValueDto variableValueDto
    );

    /**
     * Update Local Task Variable (Binary)
     * Sets the serialized value for a binary variable or the binary value for a file variable.
     *
     * @param id The id of the task to retrieve the variable for. (required)
     * @param varName The name of the variable to retrieve. (required)
     * @param data The binary data to be set. For File variables, this multipart can contain the filename, binary value and MIME type of the file variable to be set Only the filename is mandatory. (optional)
     * @param valueType The name of the variable type. Either Bytes for a byte array variable or File for a file variable. (optional)
     */
    @Post(uri="/task/{id}/localVariables/{varName}/data")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<Void> setBinaryTaskLocalVariable(
        @PathVariable(name="id") @NotNull String id, 
        @PathVariable(name="varName") @NotNull String varName, 
        @Nullable File data, 
        @Nullable String valueType
    );

}
