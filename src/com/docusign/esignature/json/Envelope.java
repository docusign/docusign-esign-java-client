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
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "status",
    "documentsUri",
    "recipientsUri",
    "envelopeUri",
    "envelopeId",
    "customFieldsUri",
    "notificationUri",
    "statusChangedDateTime",
    "documentsCombinedUri",
    "certificateUri",
    "templatesUri"
})
public class Envelope {

    @JsonProperty("status")
    private String status;
    @JsonProperty("documentsUri")
    private String documentsUri;
    @JsonProperty("recipientsUri")
    private String recipientsUri;
    @JsonProperty("envelopeUri")
    private String envelopeUri;
    @JsonProperty("envelopeId")
    private String envelopeId;
    @JsonProperty("customFieldsUri")
    private String customFieldsUri;
    @JsonProperty("notificationUri")
    private String notificationUri;
    @JsonProperty("statusChangedDateTime")
    private String statusChangedDateTime;
    @JsonProperty("documentsCombinedUri")
    private String documentsCombinedUri;
    @JsonProperty("certificateUri")
    private String certificateUri;
    @JsonProperty("templatesUri")
    private String templatesUri;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Envelope withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("documentsUri")
    public String getDocumentsUri() {
        return documentsUri;
    }

    @JsonProperty("documentsUri")
    public void setDocumentsUri(String documentsUri) {
        this.documentsUri = documentsUri;
    }

    public Envelope withDocumentsUri(String documentsUri) {
        this.documentsUri = documentsUri;
        return this;
    }

    @JsonProperty("recipientsUri")
    public String getRecipientsUri() {
        return recipientsUri;
    }

    @JsonProperty("recipientsUri")
    public void setRecipientsUri(String recipientsUri) {
        this.recipientsUri = recipientsUri;
    }

    public Envelope withRecipientsUri(String recipientsUri) {
        this.recipientsUri = recipientsUri;
        return this;
    }

    @JsonProperty("envelopeUri")
    public String getEnvelopeUri() {
        return envelopeUri;
    }

    @JsonProperty("envelopeUri")
    public void setEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
    }

    public Envelope withEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
        return this;
    }

    @JsonProperty("envelopeId")
    public String getEnvelopeId() {
        return envelopeId;
    }

    @JsonProperty("envelopeId")
    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public Envelope withEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
        return this;
    }

    @JsonProperty("customFieldsUri")
    public String getCustomFieldsUri() {
        return customFieldsUri;
    }

    @JsonProperty("customFieldsUri")
    public void setCustomFieldsUri(String customFieldsUri) {
        this.customFieldsUri = customFieldsUri;
    }

    public Envelope withCustomFieldsUri(String customFieldsUri) {
        this.customFieldsUri = customFieldsUri;
        return this;
    }

    @JsonProperty("notificationUri")
    public String getNotificationUri() {
        return notificationUri;
    }

    @JsonProperty("notificationUri")
    public void setNotificationUri(String notificationUri) {
        this.notificationUri = notificationUri;
    }

    public Envelope withNotificationUri(String notificationUri) {
        this.notificationUri = notificationUri;
        return this;
    }

    @JsonProperty("statusChangedDateTime")
    public String getStatusChangedDateTime() {
        return statusChangedDateTime;
    }

    @JsonProperty("statusChangedDateTime")
    public void setStatusChangedDateTime(String statusChangedDateTime) {
        this.statusChangedDateTime = statusChangedDateTime;
    }

    public Envelope withStatusChangedDateTime(String statusChangedDateTime) {
        this.statusChangedDateTime = statusChangedDateTime;
        return this;
    }

    @JsonProperty("documentsCombinedUri")
    public String getDocumentsCombinedUri() {
        return documentsCombinedUri;
    }

    @JsonProperty("documentsCombinedUri")
    public void setDocumentsCombinedUri(String documentsCombinedUri) {
        this.documentsCombinedUri = documentsCombinedUri;
    }

    public Envelope withDocumentsCombinedUri(String documentsCombinedUri) {
        this.documentsCombinedUri = documentsCombinedUri;
        return this;
    }

    @JsonProperty("certificateUri")
    public String getCertificateUri() {
        return certificateUri;
    }

    @JsonProperty("certificateUri")
    public void setCertificateUri(String certificateUri) {
        this.certificateUri = certificateUri;
    }

    public Envelope withCertificateUri(String certificateUri) {
        this.certificateUri = certificateUri;
        return this;
    }

    @JsonProperty("templatesUri")
    public String getTemplatesUri() {
        return templatesUri;
    }

    @JsonProperty("templatesUri")
    public void setTemplatesUri(String templatesUri) {
        this.templatesUri = templatesUri;
    }

    public Envelope withTemplatesUri(String templatesUri) {
        this.templatesUri = templatesUri;
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
