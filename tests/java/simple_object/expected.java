package com.example.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @JsonProperty(value = "active")
    public Boolean active;
    @JsonProperty(value = "age")
    public Long age;
    @JsonProperty(value = "email", required = true)
    public String email;
    @JsonProperty(value = "id", required = true)
    public UUID id;
    @JsonProperty(value = "name", required = true)
    public String name;
}
