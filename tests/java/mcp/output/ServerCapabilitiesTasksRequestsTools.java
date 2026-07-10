package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Task support for tool-related requests. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerCapabilitiesTasksRequestsTools {
    /** Whether the server supports task-augmented tools/call requests. */
    @JsonProperty(value = "call")
    public ServerCapabilitiesTasksRequestsToolsCall call;
}
