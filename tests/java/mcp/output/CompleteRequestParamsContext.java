package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Additional, optional context for completions */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteRequestParamsContext {
    /** Previously-resolved variables in a URI template or prompt. */
    @JsonProperty(value = "arguments")
    public Map<String, String> arguments;
}
