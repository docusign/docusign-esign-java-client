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
    "emailBlurb",
    "emailSubject",
    "documents",
    "recipients",
    "status",
    "eventNotification"
})
public class RequestSignatureFromDocuments {

    @JsonProperty("emailBlurb")
    private String emailBlurb;
    @JsonProperty("emailSubject")
    private String emailSubject;
    @JsonProperty("documents")
    private List<Document> documents = new ArrayList<Document>();
    @JsonProperty("recipients")
    private Recipients recipients;
    @JsonProperty("status")
    private String status;
    @JsonProperty("eventNotification")
    private EventNotification eventNotification;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("emailBlurb")
    public String getEmailBlurb() {
        return emailBlurb;
    }

    @JsonProperty("emailBlurb")
    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    public RequestSignatureFromDocuments withEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
        return this;
    }

    @JsonProperty("emailSubject")
    public String getEmailSubject() {
        return emailSubject;
    }

    @JsonProperty("emailSubject")
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public RequestSignatureFromDocuments withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    @JsonProperty("documents")
    public List<Document> getDocuments() {
        return documents;
    }

    @JsonProperty("documents")
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public RequestSignatureFromDocuments withDocuments(List<Document> documents) {
        this.documents = documents;
        return this;
    }

    @JsonProperty("recipients")
    public Recipients getRecipients() {
        return recipients;
    }

    @JsonProperty("recipients")
    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }

    public RequestSignatureFromDocuments withRecipients(Recipients recipients) {
        this.recipients = recipients;
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

    public RequestSignatureFromDocuments withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("eventNotification")
    public EventNotification getEventNotification() {
        return eventNotification;
    }

    @JsonProperty("eventNotification")
    public void setEventNotification(EventNotification eventNotification) {
        this.eventNotification = eventNotification;
    }

    public RequestSignatureFromDocuments withEventNotification(EventNotification eventNotification) {
        this.eventNotification = eventNotification;
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
