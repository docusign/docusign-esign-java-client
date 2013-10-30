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
    "fontStyle",
    "signatureInitials",
    "signatureName"
})
public class SignatureInfo {

    @JsonProperty("fontStyle")
    private String fontStyle;
    @JsonProperty("signatureInitials")
    private String signatureInitials;
    @JsonProperty("signatureName")
    private String signatureName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fontStyle")
    public String getFontStyle() {
        return fontStyle;
    }

    @JsonProperty("fontStyle")
    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public SignatureInfo withFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    @JsonProperty("signatureInitials")
    public String getSignatureInitials() {
        return signatureInitials;
    }

    @JsonProperty("signatureInitials")
    public void setSignatureInitials(String signatureInitials) {
        this.signatureInitials = signatureInitials;
    }

    public SignatureInfo withSignatureInitials(String signatureInitials) {
        this.signatureInitials = signatureInitials;
        return this;
    }

    @JsonProperty("signatureName")
    public String getSignatureName() {
        return signatureName;
    }

    @JsonProperty("signatureName")
    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public SignatureInfo withSignatureName(String signatureName) {
        this.signatureName = signatureName;
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
