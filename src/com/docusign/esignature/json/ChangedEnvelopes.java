
package com.docusign.esignature.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "resultSetSize",
    "totalSetSize",
    "startPosition",
    "endPosition",
    "nextUri",
    "previousUri",
    "envelopes"
})
public class ChangedEnvelopes {

    @JsonProperty("resultSetSize")
    private String resultSetSize;
    @JsonProperty("totalSetSize")
    private String totalSetSize;
    @JsonProperty("startPosition")
    private String startPosition;
    @JsonProperty("endPosition")
    private String endPosition;
    @JsonProperty("nextUri")
    private String nextUri;
    @JsonProperty("previousUri")
    private String previousUri;
    @JsonProperty("envelopes")
    private List<Envelope> envelopes = new ArrayList<Envelope>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resultSetSize")
    public String getResultSetSize() {
        return resultSetSize;
    }

    @JsonProperty("resultSetSize")
    public void setResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
    }

    public ChangedEnvelopes withResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
        return this;
    }

    @JsonProperty("totalSetSize")
    public String getTotalSetSize() {
        return totalSetSize;
    }

    @JsonProperty("totalSetSize")
    public void setTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
    }

    public ChangedEnvelopes withTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
        return this;
    }

    @JsonProperty("startPosition")
    public String getStartPosition() {
        return startPosition;
    }

    @JsonProperty("startPosition")
    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public ChangedEnvelopes withStartPosition(String startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    @JsonProperty("endPosition")
    public String getEndPosition() {
        return endPosition;
    }

    @JsonProperty("endPosition")
    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }

    public ChangedEnvelopes withEndPosition(String endPosition) {
        this.endPosition = endPosition;
        return this;
    }

    @JsonProperty("nextUri")
    public String getNextUri() {
        return nextUri;
    }

    @JsonProperty("nextUri")
    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }

    public ChangedEnvelopes withNextUri(String nextUri) {
        this.nextUri = nextUri;
        return this;
    }

    @JsonProperty("previousUri")
    public String getPreviousUri() {
        return previousUri;
    }

    @JsonProperty("previousUri")
    public void setPreviousUri(String previousUri) {
        this.previousUri = previousUri;
    }

    public ChangedEnvelopes withPreviousUri(String previousUri) {
        this.previousUri = previousUri;
        return this;
    }

    @JsonProperty("envelopes")
    public List<Envelope> getEnvelopes() {
        return envelopes;
    }

    @JsonProperty("envelopes")
    public void setEnvelopes(List<Envelope> envelopes) {
        this.envelopes = envelopes;
    }

    public ChangedEnvelopes withEnvelopes(List<Envelope> envelopes) {
        this.envelopes = envelopes;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
