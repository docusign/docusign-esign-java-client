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
    "tabId",
    "name",
    "pageNumber",
    "documentId",
    "anchorString",
    "anchorXOffset",
    "anchorYOffset",
    "yPosition",
    "xPosition"
})
public class SignHereTab {

    @JsonProperty("tabId")
    private String tabId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pageNumber")
    private String pageNumber;
    @JsonProperty("documentId")
    private String documentId;
    @JsonProperty("anchorString")
    private String anchorString;
    @JsonProperty("anchorXOffset")
    private String anchorXOffset;
    @JsonProperty("anchorYOffset")
    private String anchorYOffset;
    @JsonProperty("yPosition")
    private String yPosition;
    @JsonProperty("xPosition")
    private String xPosition;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tabId")
    public String getTabId() {
        return tabId;
    }

    @JsonProperty("tabId")
    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    public SignHereTab withTabId(String tabId) {
        this.tabId = tabId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SignHereTab withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("pageNumber")
    public String getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public SignHereTab withPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    @JsonProperty("documentId")
    public String getDocumentId() {
        return documentId;
    }

    @JsonProperty("documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public SignHereTab withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    @JsonProperty("anchorString")
    public String getAnchorString() {
        return anchorString;
    }

    @JsonProperty("anchorString")
    public void setAnchorString(String anchorString) {
        this.anchorString = anchorString;
    }

    public SignHereTab withAnchorString(String anchorString) {
        this.anchorString = anchorString;
        return this;
    }

    @JsonProperty("anchorXOffset")
    public String getAnchorXOffset() {
        return anchorXOffset;
    }

    @JsonProperty("anchorXOffset")
    public void setAnchorXOffset(String anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
    }

    public SignHereTab withAnchorXOffset(String anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
        return this;
    }

    @JsonProperty("anchorYOffset")
    public String getAnchorYOffset() {
        return anchorYOffset;
    }

    @JsonProperty("anchorYOffset")
    public void setAnchorYOffset(String anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
    }

    public SignHereTab withAnchorYOffset(String anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
        return this;
    }

    @JsonProperty("yPosition")
    public String getYPosition() {
        return yPosition;
    }

    @JsonProperty("yPosition")
    public void setYPosition(String yPosition) {
        this.yPosition = yPosition;
    }

    public SignHereTab withYPosition(String yPosition) {
        this.yPosition = yPosition;
        return this;
    }

    @JsonProperty("xPosition")
    public String getXPosition() {
        return xPosition;
    }

    @JsonProperty("xPosition")
    public void setXPosition(String xPosition) {
        this.xPosition = xPosition;
    }

    public SignHereTab withXPosition(String xPosition) {
        this.xPosition = xPosition;
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
