package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata for augmenting a request with task execution.
 * Include this in the `task` field of the request parameters.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskMetadata {
    /** Requested duration in milliseconds to retain task from creation. */
    @JsonProperty(value = "ttl")
    public Long ttl;
}
