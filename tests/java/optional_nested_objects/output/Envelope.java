package com.example.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Envelope {
    @JsonProperty(value = "header", required = true)
    public Header header;
    @JsonProperty(value = "payload")
    public Payload payload;

    public Envelope() {
        this.header = new Header();
    }
}
