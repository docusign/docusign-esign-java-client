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
    "name",
    "accountId",
    "baseUrl",
    "isDefault",
    "userName",
    "userId",
    "email",
    "siteDescription"
})
public class LoginAccount {

    @JsonProperty("name")
    private String name;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonProperty("isDefault")
    private String isDefault;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("email")
    private String email;
    @JsonProperty("siteDescription")
    private String siteDescription;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public LoginAccount withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public LoginAccount withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public LoginAccount withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    @JsonProperty("isDefault")
    public String getIsDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public LoginAccount withIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LoginAccount withUserName(String userName) {
        this.userName = userName;
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

    public LoginAccount withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public LoginAccount withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("siteDescription")
    public String getSiteDescription() {
        return siteDescription;
    }

    @JsonProperty("siteDescription")
    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    public LoginAccount withSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
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
