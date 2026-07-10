package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitledMultiSelectEnumSchemaItemsAnyOfItem {
    /** The constant enum value. */
    @JsonProperty(value = "const", required = true)
    public String const_;
    /** Display title for this option. */
    @JsonProperty(value = "title", required = true)
    public String title;
}
