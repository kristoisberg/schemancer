package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notification {
    @JsonProperty(value = "method", required = true)
    public String method;
    @JsonProperty(value = "params")
    public Map<String, Object> params;
}
