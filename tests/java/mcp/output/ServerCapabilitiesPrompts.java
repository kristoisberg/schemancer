package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Present if the server offers any prompt templates. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerCapabilitiesPrompts {
    /** Whether this server supports notifications for changes to the prompt list. */
    @JsonProperty(value = "listChanged")
    public Boolean listChanged;
}
