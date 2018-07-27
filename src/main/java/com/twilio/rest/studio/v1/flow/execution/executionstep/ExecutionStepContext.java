/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.studio.v1.flow.execution.executionstep;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExecutionStepContext extends Resource {
    private static final long serialVersionUID = 255055850550863L;

    /**
     * Create a ExecutionStepContextFetcher to execute fetch.
     * 
     * @param pathFlowSid Flow Sid.
     * @param pathExecutionSid Execution Sid.
     * @param pathStepSid Step Sid.
     * @return ExecutionStepContextFetcher capable of executing the fetch
     */
    public static ExecutionStepContextFetcher fetcher(final String pathFlowSid, 
                                                      final String pathExecutionSid, 
                                                      final String pathStepSid) {
        return new ExecutionStepContextFetcher(pathFlowSid, pathExecutionSid, pathStepSid);
    }

    /**
     * Converts a JSON String into a ExecutionStepContext object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return ExecutionStepContext object represented by the provided JSON
     */
    public static ExecutionStepContext fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ExecutionStepContext.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a ExecutionStepContext object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return ExecutionStepContext object represented by the provided JSON
     */
    public static ExecutionStepContext fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ExecutionStepContext.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Map<String, Object> context;
    private final String executionSid;
    private final String flowSid;
    private final String stepSid;
    private final URI url;

    @JsonCreator
    private ExecutionStepContext(@JsonProperty("account_sid")
                                 final String accountSid, 
                                 @JsonProperty("context")
                                 final Map<String, Object> context, 
                                 @JsonProperty("execution_sid")
                                 final String executionSid, 
                                 @JsonProperty("flow_sid")
                                 final String flowSid, 
                                 @JsonProperty("step_sid")
                                 final String stepSid, 
                                 @JsonProperty("url")
                                 final URI url) {
        this.accountSid = accountSid;
        this.context = context;
        this.executionSid = executionSid;
        this.flowSid = flowSid;
        this.stepSid = stepSid;
        this.url = url;
    }

    /**
     * Returns The Account Sid..
     * 
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The Flow state..
     * 
     * @return Flow state.
     */
    public final Map<String, Object> getContext() {
        return this.context;
    }

    /**
     * Returns The Execution Sid..
     * 
     * @return Execution Sid.
     */
    public final String getExecutionSid() {
        return this.executionSid;
    }

    /**
     * Returns The Flow Sid..
     * 
     * @return Flow Sid.
     */
    public final String getFlowSid() {
        return this.flowSid;
    }

    /**
     * Returns The Step Sid..
     * 
     * @return Step Sid.
     */
    public final String getStepSid() {
        return this.stepSid;
    }

    /**
     * Returns The The URL of this resource..
     * 
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExecutionStepContext other = (ExecutionStepContext) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(context, other.context) && 
               Objects.equals(executionSid, other.executionSid) && 
               Objects.equals(flowSid, other.flowSid) && 
               Objects.equals(stepSid, other.stepSid) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            context,
                            executionSid,
                            flowSid,
                            stepSid,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("context", context)
                          .add("executionSid", executionSid)
                          .add("flowSid", flowSid)
                          .add("stepSid", stepSid)
                          .add("url", url)
                          .toString();
    }
}