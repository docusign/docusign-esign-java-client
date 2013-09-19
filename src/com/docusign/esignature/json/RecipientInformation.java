
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
    "signers",
    "agents",
    "editors",
    "intermediaries",
    "carbonCopies",
    "certifiedDeliveries",
    "inPersonSigners",
    "recipientCount"
})
public class RecipientInformation {

    @JsonProperty("signers")
    private List<Signer> signers = new ArrayList<Signer>();
    @JsonProperty("agents")
    private List<Agent> agents = new ArrayList<Agent>();
    @JsonProperty("editors")
    private List<Editor> editors = new ArrayList<Editor>();
    @JsonProperty("intermediaries")
    private List<Intermediary> intermediaries = new ArrayList<Intermediary>();
    @JsonProperty("carbonCopies")
    private List<CarbonCopy> carbonCopies = new ArrayList<CarbonCopy>();
    @JsonProperty("certifiedDeliveries")
    private List<CertifiedDelivery> certifiedDeliveries = new ArrayList<CertifiedDelivery>();
    @JsonProperty("inPersonSigners")
    private List<InPersonSigner> inPersonSigners = new ArrayList<InPersonSigner>();
    @JsonProperty("recipientCount")
    private String recipientCount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("signers")
    public List<Signer> getSigners() {
        return signers;
    }

    @JsonProperty("signers")
    public void setSigners(List<Signer> signers) {
        this.signers = signers;
    }

    public RecipientInformation withSigners(List<Signer> signers) {
        this.signers = signers;
        return this;
    }

    @JsonProperty("agents")
    public List<Agent> getAgents() {
        return agents;
    }

    @JsonProperty("agents")
    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public RecipientInformation withAgents(List<Agent> agents) {
        this.agents = agents;
        return this;
    }

    @JsonProperty("editors")
    public List<Editor> getEditors() {
        return editors;
    }

    @JsonProperty("editors")
    public void setEditors(List<Editor> editors) {
        this.editors = editors;
    }

    public RecipientInformation withEditors(List<Editor> editors) {
        this.editors = editors;
        return this;
    }

    @JsonProperty("intermediaries")
    public List<Intermediary> getIntermediaries() {
        return intermediaries;
    }

    @JsonProperty("intermediaries")
    public void setIntermediaries(List<Intermediary> intermediaries) {
        this.intermediaries = intermediaries;
    }

    public RecipientInformation withIntermediaries(List<Intermediary> intermediaries) {
        this.intermediaries = intermediaries;
        return this;
    }

    @JsonProperty("carbonCopies")
    public List<CarbonCopy> getCarbonCopies() {
        return carbonCopies;
    }

    @JsonProperty("carbonCopies")
    public void setCarbonCopies(List<CarbonCopy> carbonCopies) {
        this.carbonCopies = carbonCopies;
    }

    public RecipientInformation withCarbonCopies(List<CarbonCopy> carbonCopies) {
        this.carbonCopies = carbonCopies;
        return this;
    }

    @JsonProperty("certifiedDeliveries")
    public List<CertifiedDelivery> getCertifiedDeliveries() {
        return certifiedDeliveries;
    }

    @JsonProperty("certifiedDeliveries")
    public void setCertifiedDeliveries(List<CertifiedDelivery> certifiedDeliveries) {
        this.certifiedDeliveries = certifiedDeliveries;
    }

    public RecipientInformation withCertifiedDeliveries(List<CertifiedDelivery> certifiedDeliveries) {
        this.certifiedDeliveries = certifiedDeliveries;
        return this;
    }

    @JsonProperty("inPersonSigners")
    public List<InPersonSigner> getInPersonSigners() {
        return inPersonSigners;
    }

    @JsonProperty("inPersonSigners")
    public void setInPersonSigners(List<InPersonSigner> inPersonSigners) {
        this.inPersonSigners = inPersonSigners;
    }

    public RecipientInformation withInPersonSigners(List<InPersonSigner> inPersonSigners) {
        this.inPersonSigners = inPersonSigners;
        return this;
    }

    @JsonProperty("recipientCount")
    public String getRecipientCount() {
        return recipientCount;
    }

    @JsonProperty("recipientCount")
    public void setRecipientCount(String recipientCount) {
        this.recipientCount = recipientCount;
    }

    public RecipientInformation withRecipientCount(String recipientCount) {
        this.recipientCount = recipientCount;
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
