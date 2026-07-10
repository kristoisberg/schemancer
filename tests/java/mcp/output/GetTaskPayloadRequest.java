package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A request to retrieve the result of a completed task. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskPayloadRequest {
    @JsonProperty(value = "id", required = true)
    public RequestId id;
    @JsonProperty(value = "jsonrpc", required = true)
    public String jsonrpc;
    @JsonProperty(value = "method", required = true)
    public String method;
    @JsonProperty(value = "params", required = true)
    public GetTaskPayloadRequestParams params;

    public GetTaskPayloadRequest() {
        this.params = new GetTaskPayloadRequestParams();
    }
}
