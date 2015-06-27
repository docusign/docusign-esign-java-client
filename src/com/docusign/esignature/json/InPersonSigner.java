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

import java.util.HashMap;
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
    "hostName",
    "hostEmail",
    "signerName",
    "signInEachLocation",
    "recipientId",
    "requireIdLookup",
    "userId",
    "routingOrder",
    "status"
})
public class InPersonSigner {

    @JsonProperty("hostName")
    private String hostName;
    @JsonProperty("hostEmail")
    private String hostEmail;
    @JsonProperty("signerName")
    private String signerName;
    @JsonProperty("signInEachLocation")
    private String signInEachLocation;
    @JsonProperty("recipientId")
    private String recipientId;
    @JsonProperty("requireIdLookup")
    private String requireIdLookup;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("routingOrder")
    private String routingOrder;
    @JsonProperty("status")
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hostName")
    public String getHostName() {
        return hostName;
    }

    @JsonProperty("hostName")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public InPersonSigner withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    @JsonProperty("hostEmail")
    public String getHostEmail() {
        return hostEmail;
    }

    @JsonProperty("hostEmail")
    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }

    public InPersonSigner withHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
        return this;
    }

    @JsonProperty("signerName")
    public String getSignerName() {
        return signerName;
    }

    @JsonProperty("signerName")
    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }

    public InPersonSigner withSignerName(String signerName) {
        this.signerName = signerName;
        return this;
    }

    @JsonProperty("signInEachLocation")
    public String getSignInEachLocation() {
        return signInEachLocation;
    }

    @JsonProperty("signInEachLocation")
    public void setSignInEachLocation(String signInEachLocation) {
        this.signInEachLocation = signInEachLocation;
    }

    public InPersonSigner withSignInEachLocation(String signInEachLocation) {
        this.signInEachLocation = signInEachLocation;
        return this;
    }

    @JsonProperty("recipientId")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("recipientId")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public InPersonSigner withRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    @JsonProperty("requireIdLookup")
    public String getRequireIdLookup() {
        return requireIdLookup;
    }

    @JsonProperty("requireIdLookup")
    public void setRequireIdLookup(String requireIdLookup) {
        this.requireIdLookup = requireIdLookup;
    }

    public InPersonSigner withRequireIdLookup(String requireIdLookup) {
        this.requireIdLookup = requireIdLookup;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InPersonSigner withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("routingOrder")
    public String getRoutingOrder() {
        return routingOrder;
    }

    @JsonProperty("routingOrder")
    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }

    public InPersonSigner withRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public InPersonSigner withStatus(String status) {
        this.status = status;
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
