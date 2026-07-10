package com.example.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineItem {
    @JsonProperty(value = "price", required = true)
    public double price;
    @JsonProperty(value = "productId", required = true)
    public String productID;
    @JsonProperty(value = "quantity", required = true)
    public long quantity;
}
