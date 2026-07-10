package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A JSON Schema object defining the expected parameters for the tool. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ToolInputSchema {
    @JsonProperty(value = "$schema")
    public String schema;
    @JsonProperty(value = "properties")
    public Map<String, ToolInputSchemaPropertiesValue> properties;
    @JsonProperty(value = "required")
    public List<String> required;
    @JsonProperty(value = "type", required = true)
    public String type;
}
