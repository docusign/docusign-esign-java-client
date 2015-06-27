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
    "companyTabs",
    "titleTabs",
    "textTabs",
    "emailTabs",
    "fullNameTabs",
    "initialHereTabs",
    "signHereTabs"
})
public class Tabs {

    @JsonProperty("companyTabs")
    private List<CompanyTab> companyTabs = new ArrayList<CompanyTab>();
    @JsonProperty("titleTabs")
    private List<TitleTab> titleTabs = new ArrayList<TitleTab>();
    @JsonProperty("textTabs")
    private List<TextTab> textTabs = new ArrayList<TextTab>();
    @JsonProperty("emailTabs")
    private List<EmailTab> emailTabs = new ArrayList<EmailTab>();
    @JsonProperty("fullNameTabs")
    private List<FullNameTab> fullNameTabs = new ArrayList<FullNameTab>();
    @JsonProperty("initialHereTabs")
    private List<InitialHereTab> initialHereTabs = new ArrayList<InitialHereTab>();
    @JsonProperty("signHereTabs")
    private List<SignHereTab> signHereTabs = new ArrayList<SignHereTab>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("companyTabs")
    public List<CompanyTab> getCompanyTabs() {
        return companyTabs;
    }

    @JsonProperty("companyTabs")
    public void setCompanyTabs(List<CompanyTab> companyTabs) {
        this.companyTabs = companyTabs;
    }

    public Tabs withCompanyTabs(List<CompanyTab> companyTabs) {
        this.companyTabs = companyTabs;
        return this;
    }

    @JsonProperty("titleTabs")
    public List<TitleTab> getTitleTabs() {
        return titleTabs;
    }

    @JsonProperty("titleTabs")
    public void setTitleTabs(List<TitleTab> titleTabs) {
        this.titleTabs = titleTabs;
    }

    public Tabs withTitleTabs(List<TitleTab> titleTabs) {
        this.titleTabs = titleTabs;
        return this;
    }

    @JsonProperty("textTabs")
    public List<TextTab> getTextTabs() {
        return textTabs;
    }

    @JsonProperty("textTabs")
    public void setTextTabs(List<TextTab> textTabs) {
        this.textTabs = textTabs;
    }

    public Tabs withTextTabs(List<TextTab> textTabs) {
        this.textTabs = textTabs;
        return this;
    }

    @JsonProperty("emailTabs")
    public List<EmailTab> getEmailTabs() {
        return emailTabs;
    }

    @JsonProperty("emailTabs")
    public void setEmailTabs(List<EmailTab> emailTabs) {
        this.emailTabs = emailTabs;
    }

    public Tabs withEmailTabs(List<EmailTab> emailTabs) {
        this.emailTabs = emailTabs;
        return this;
    }

    @JsonProperty("fullNameTabs")
    public List<FullNameTab> getFullNameTabs() {
        return fullNameTabs;
    }

    @JsonProperty("fullNameTabs")
    public void setFullNameTabs(List<FullNameTab> fullNameTabs) {
        this.fullNameTabs = fullNameTabs;
    }

    public Tabs withFullNameTabs(List<FullNameTab> fullNameTabs) {
        this.fullNameTabs = fullNameTabs;
        return this;
    }

    @JsonProperty("initialHereTabs")
    public List<InitialHereTab> getInitialHereTabs() {
        return initialHereTabs;
    }

    @JsonProperty("initialHereTabs")
    public void setInitialHereTabs(List<InitialHereTab> initialHereTabs) {
        this.initialHereTabs = initialHereTabs;
    }

    public Tabs withInitialHereTabs(List<InitialHereTab> initialHereTabs) {
        this.initialHereTabs = initialHereTabs;
        return this;
    }

    @JsonProperty("signHereTabs")
    public List<SignHereTab> getSignHereTabs() {
        return signHereTabs;
    }

    @JsonProperty("signHereTabs")
    public void setSignHereTabs(List<SignHereTab> signHereTabs) {
        this.signHereTabs = signHereTabs;
    }

    public Tabs withSignHereTabs(List<SignHereTab> signHereTabs) {
        this.signHereTabs = signHereTabs;
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
