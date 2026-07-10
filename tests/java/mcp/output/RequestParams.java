package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Common params for any request. */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestParams {
    /** See [General fields: `_meta`](/specification/2025-11-25/basic/index#meta) for notes on `_meta` usage. */
    @JsonProperty(value = "_meta")
    public RequestParamsMeta meta;
}
