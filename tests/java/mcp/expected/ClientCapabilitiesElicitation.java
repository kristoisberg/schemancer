package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Present if the client supports elicitation from the server. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCapabilitiesElicitation {
    @JsonProperty(value = "form")
    public ClientCapabilitiesElicitationForm form;
    @JsonProperty(value = "url")
    public ClientCapabilitiesElicitationURL url;
}
