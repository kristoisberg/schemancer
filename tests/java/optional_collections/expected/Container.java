package com.example.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Container {
    @JsonProperty(value = "items", required = true)
    public List<String> items = new ArrayList<>();
    @JsonProperty(value = "metadata")
    public Map<String, String> metadata;
    @JsonProperty(value = "name", required = true)
    public String name;
    @JsonProperty(value = "tags")
    public List<String> tags;
}
