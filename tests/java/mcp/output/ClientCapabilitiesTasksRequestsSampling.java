package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Task support for sampling-related requests. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCapabilitiesTasksRequestsSampling {
    /** Whether the client supports task-augmented sampling/createMessage requests. */
    @JsonProperty(value = "createMessage")
    public ClientCapabilitiesTasksRequestsSamplingCreateMessage createMessage;
}
