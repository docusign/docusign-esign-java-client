/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * 
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
 
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "editors",
    "agents",
    "signers",
    "certifiedDeliveries",
    "carbonCopies"
})
public class Recipients {

    @JsonProperty("editors")
    private List<Editor> editors = new ArrayList<Editor>();
    @JsonProperty("agents")
    private List<Agent> agents = new ArrayList<Agent>();
    @JsonProperty("signers")
    private List<Signer> signers = new ArrayList<Signer>();
    @JsonProperty("certifiedDeliveries")
    private List<CertifiedDelivery> certifiedDeliveries = new ArrayList<CertifiedDelivery>();
    @JsonProperty("carbonCopies")
    private List<CarbonCopy> carbonCopies = new ArrayList<CarbonCopy>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("editors")
    public List<Editor> getEditors() {
        return editors;
    }

    @JsonProperty("editors")
    public void setEditors(List<Editor> editors) {
        this.editors = editors;
    }

    public Recipients withEditors(List<Editor> editors) {
        this.editors = editors;
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

    public Recipients withAgents(List<Agent> agents) {
        this.agents = agents;
        return this;
    }

    @JsonProperty("signers")
    public List<Signer> getSigners() {
        return signers;
    }

    @JsonProperty("signers")
    public void setSigners(List<Signer> signers) {
        this.signers = signers;
    }

    public Recipients withSigners(List<Signer> signers) {
        this.signers = signers;
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

    public Recipients withCertifiedDeliveries(List<CertifiedDelivery> certifiedDeliveries) {
        this.certifiedDeliveries = certifiedDeliveries;
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

    public Recipients withCarbonCopies(List<CarbonCopy> carbonCopies) {
        this.carbonCopies = carbonCopies;
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
