package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The server's response to a completion/complete request */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteResult {
    /** See [General fields: `_meta`](/specification/2025-11-25/basic/index#meta) for notes on `_meta` usage. */
    @JsonProperty(value = "_meta")
    public Map<String, Object> meta;
    @JsonProperty(value = "completion", required = true)
    public CompleteResultCompletion completion;

    public CompleteResult() {
        this.completion = new CompleteResultCompletion();
    }
}
