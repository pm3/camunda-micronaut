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
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.annotation.Client;
import org.camunda.rest.model.CorrelationMessageDto;
import org.camunda.rest.model.MessageCorrelationResultWithVariableDto;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Client("${openapi-micronaut-client-base-path}")
public interface MessageApi {
    /**
     * Correlate
     * Correlates a message to the process engine to either trigger a message start event or an intermediate message  catching event. Internally this maps to the engine&#39;s message correlation builder methods &#x60;MessageCorrelationBuilder#correlateWithResult()&#x60; and &#x60;MessageCorrelationBuilder#correlateAllWithResult()&#x60;. For more information about the correlation behavior, see the [Message Events](https://docs.camunda.org/manual/7.18/bpmn20/events/message-events/) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.18/reference/bpmn20/).
     *
     * @param correlationMessageDto  (optional)
     * @return List&lt;MessageCorrelationResultWithVariableDto&gt;
     */
    @Post(uri="/message")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<List<MessageCorrelationResultWithVariableDto>> deliverMessage(
        @Body @Nullable @Valid CorrelationMessageDto correlationMessageDto
    );

}
