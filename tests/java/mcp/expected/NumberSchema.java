package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NumberSchema {
    @JsonProperty(value = "default")
    public Long default_;
    @JsonProperty(value = "description")
    public String description;
    @JsonProperty(value = "maximum")
    public Long maximum;
    @JsonProperty(value = "minimum")
    public Long minimum;
    @JsonProperty(value = "title")
    public String title;
    @JsonProperty(value = "type", required = true)
    public String type;
}
