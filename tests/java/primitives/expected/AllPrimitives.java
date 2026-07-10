package com.example.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllPrimitives {
    @JsonProperty(value = "boolField", required = true)
    public boolean boolField;
    @JsonProperty(value = "floatField", required = true)
    public double floatField;
    @JsonProperty(value = "intField", required = true)
    public long intField;
    @JsonProperty(value = "optionalBool")
    public Boolean optionalBool;
    @JsonProperty(value = "optionalFloat")
    public Double optionalFloat;
    @JsonProperty(value = "optionalInt")
    public Long optionalInt;
    @JsonProperty(value = "optionalString")
    public String optionalString;
    @JsonProperty(value = "stringField", required = true)
    public String stringField;
}
