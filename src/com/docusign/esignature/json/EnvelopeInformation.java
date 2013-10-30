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
    "emailSubject",
    "emailBlurb",
    "envelopeId",
    "customFieldsUri",
    "notificationUri",
    "enableWetSign",
    "allowReassign",
    "createdDateTime",
    "sentDateTime",
    "statusChangedDateTime",
    "documentsCombinedUri",
    "certificateUri",
    "templatesUri"
})
public class EnvelopeInformation {

    @JsonProperty("status")
    private String status;
    @JsonProperty("documentsUri")
    private String documentsUri;
    @JsonProperty("recipientsUri")
    private String recipientsUri;
    @JsonProperty("envelopeUri")
    private String envelopeUri;
    @JsonProperty("emailSubject")
    private String emailSubject;
    @JsonProperty("emailBlurb")
    private String emailBlurb;
    @JsonProperty("envelopeId")
    private String envelopeId;
    @JsonProperty("customFieldsUri")
    private String customFieldsUri;
    @JsonProperty("notificationUri")
    private String notificationUri;
    @JsonProperty("enableWetSign")
    private String enableWetSign;
    @JsonProperty("allowReassign")
    private String allowReassign;
    @JsonProperty("createdDateTime")
    private String createdDateTime;
    @JsonProperty("sentDateTime")
    private String sentDateTime;
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

    public EnvelopeInformation withStatus(String status) {
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

    public EnvelopeInformation withDocumentsUri(String documentsUri) {
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

    public EnvelopeInformation withRecipientsUri(String recipientsUri) {
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

    public EnvelopeInformation withEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
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

    public EnvelopeInformation withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    @JsonProperty("emailBlurb")
    public String getEmailBlurb() {
        return emailBlurb;
    }

    @JsonProperty("emailBlurb")
    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    public EnvelopeInformation withEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
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

    public EnvelopeInformation withEnvelopeId(String envelopeId) {
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

    public EnvelopeInformation withCustomFieldsUri(String customFieldsUri) {
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

    public EnvelopeInformation withNotificationUri(String notificationUri) {
        this.notificationUri = notificationUri;
        return this;
    }

    @JsonProperty("enableWetSign")
    public String getEnableWetSign() {
        return enableWetSign;
    }

    @JsonProperty("enableWetSign")
    public void setEnableWetSign(String enableWetSign) {
        this.enableWetSign = enableWetSign;
    }

    public EnvelopeInformation withEnableWetSign(String enableWetSign) {
        this.enableWetSign = enableWetSign;
        return this;
    }

    @JsonProperty("allowReassign")
    public String getAllowReassign() {
        return allowReassign;
    }

    @JsonProperty("allowReassign")
    public void setAllowReassign(String allowReassign) {
        this.allowReassign = allowReassign;
    }

    public EnvelopeInformation withAllowReassign(String allowReassign) {
        this.allowReassign = allowReassign;
        return this;
    }

    @JsonProperty("createdDateTime")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    @JsonProperty("createdDateTime")
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public EnvelopeInformation withCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    @JsonProperty("sentDateTime")
    public String getSentDateTime() {
        return sentDateTime;
    }

    @JsonProperty("sentDateTime")
    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }

    public EnvelopeInformation withSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
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

    public EnvelopeInformation withStatusChangedDateTime(String statusChangedDateTime) {
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

    public EnvelopeInformation withDocumentsCombinedUri(String documentsCombinedUri) {
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

    public EnvelopeInformation withCertificateUri(String certificateUri) {
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

    public EnvelopeInformation withTemplatesUri(String templatesUri) {
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
