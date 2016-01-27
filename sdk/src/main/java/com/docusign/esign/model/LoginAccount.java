package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.NameValue;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class LoginAccount   {
  
  private String name = null;
  private String accountId = null;
  private String accountIdGuid = null;
  private String baseUrl = null;
  private String isDefault = null;
  private String userName = null;
  private String userId = null;
  private String email = null;
  private String siteDescription = null;
  private java.util.List<NameValue> loginAccountSettings = new java.util.ArrayList<NameValue>();
  private java.util.List<NameValue> loginUserSettings = new java.util.ArrayList<NameValue>();

  
  /**
   * The name associated with the account.
   **/
  @ApiModelProperty(value = "The name associated with the account.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The account ID associated with the envelope.
   **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * The GUID associated with the account ID.
   **/
  @ApiModelProperty(value = "The GUID associated with the account ID.")
  @JsonProperty("accountIdGuid")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }
  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  
  /**
   * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
   **/
  @ApiModelProperty(value = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
  @JsonProperty("baseUrl")
  public String getBaseUrl() {
    return baseUrl;
  }
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  
  /**
   * This value is true if this is the default account for the user, otherwise false is returned.
   **/
  @ApiModelProperty(value = "This value is true if this is the default account for the user, otherwise false is returned.")
  @JsonProperty("isDefault")
  public String getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  
  /**
   * The name of this user as defined by the account.
   **/
  @ApiModelProperty(value = "The name of this user as defined by the account.")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * An optional descirption of the site that hosts the account.
   **/
  @ApiModelProperty(value = "An optional descirption of the site that hosts the account.")
  @JsonProperty("siteDescription")
  public String getSiteDescription() {
    return siteDescription;
  }
  public void setSiteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
  }

  
  /**
   * A list of settings on the acccount that indicate what features are available.
   **/
  @ApiModelProperty(value = "A list of settings on the acccount that indicate what features are available.")
  @JsonProperty("loginAccountSettings")
  public java.util.List<NameValue> getLoginAccountSettings() {
    return loginAccountSettings;
  }
  public void setLoginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
    this.loginAccountSettings = loginAccountSettings;
  }

  
  /**
   * A list of user-level settings that indicate what user-specific features are available.
   **/
  @ApiModelProperty(value = "A list of user-level settings that indicate what user-specific features are available.")
  @JsonProperty("loginUserSettings")
  public java.util.List<NameValue> getLoginUserSettings() {
    return loginUserSettings;
  }
  public void setLoginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccount loginAccount = (LoginAccount) o;
    return Objects.equals(name, loginAccount.name) &&
        Objects.equals(accountId, loginAccount.accountId) &&
        Objects.equals(accountIdGuid, loginAccount.accountIdGuid) &&
        Objects.equals(baseUrl, loginAccount.baseUrl) &&
        Objects.equals(isDefault, loginAccount.isDefault) &&
        Objects.equals(userName, loginAccount.userName) &&
        Objects.equals(userId, loginAccount.userId) &&
        Objects.equals(email, loginAccount.email) &&
        Objects.equals(siteDescription, loginAccount.siteDescription) &&
        Objects.equals(loginAccountSettings, loginAccount.loginAccountSettings) &&
        Objects.equals(loginUserSettings, loginAccount.loginUserSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountId, accountIdGuid, baseUrl, isDefault, userName, userId, email, siteDescription, loginAccountSettings, loginUserSettings);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccount {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(StringUtil.toIndentedString(accountId)).append("\n");
    sb.append("    accountIdGuid: ").append(StringUtil.toIndentedString(accountIdGuid)).append("\n");
    sb.append("    baseUrl: ").append(StringUtil.toIndentedString(baseUrl)).append("\n");
    sb.append("    isDefault: ").append(StringUtil.toIndentedString(isDefault)).append("\n");
    sb.append("    userName: ").append(StringUtil.toIndentedString(userName)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    siteDescription: ").append(StringUtil.toIndentedString(siteDescription)).append("\n");
    sb.append("    loginAccountSettings: ").append(StringUtil.toIndentedString(loginAccountSettings)).append("\n");
    sb.append("    loginUserSettings: ").append(StringUtil.toIndentedString(loginUserSettings)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
