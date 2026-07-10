package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A request from the client to the server, to enable or adjust logging. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetLevelRequest {
    @JsonProperty(value = "id", required = true)
    public RequestId id;
    @JsonProperty(value = "jsonrpc", required = true)
    public String jsonrpc;
    @JsonProperty(value = "method", required = true)
    public String method;
    @JsonProperty(value = "params", required = true)
    public SetLevelRequestParams params;

    public SetLevelRequest() {
        this.params = new SetLevelRequestParams();
    }
}
