package com.example.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {
    @JsonProperty(value = "email")
    public String email;
    @JsonProperty(value = "id", required = true)
    public String id;
    @JsonProperty(value = "name", required = true)
    public String name;
}
