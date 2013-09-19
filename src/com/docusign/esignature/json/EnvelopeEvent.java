
package com.docusign.esignature.json;

import java.util.HashMap;
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
    "envelopeEventStatusCode"
})
public class EnvelopeEvent {

    @JsonProperty("envelopeEventStatusCode")
    private String envelopeEventStatusCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("envelopeEventStatusCode")
    public String getEnvelopeEventStatusCode() {
        return envelopeEventStatusCode;
    }

    @JsonProperty("envelopeEventStatusCode")
    public void setEnvelopeEventStatusCode(String envelopeEventStatusCode) {
        this.envelopeEventStatusCode = envelopeEventStatusCode;
    }

    public EnvelopeEvent withEnvelopeEventStatusCode(String envelopeEventStatusCode) {
        this.envelopeEventStatusCode = envelopeEventStatusCode;
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
