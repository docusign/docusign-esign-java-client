package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public LoginAccount name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name associated with the account.")
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
  public LoginAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The account ID associated with the envelope.")
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
  public LoginAccount accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The GUID associated with the account ID.")
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
  public LoginAccount baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
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
  public LoginAccount isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value is true if this is the default account for the user, otherwise false is returned.")
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
  public LoginAccount userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of this user as defined by the account.")
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
  public LoginAccount userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public LoginAccount email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public LoginAccount siteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional descirption of the site that hosts the account.")
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
  public LoginAccount loginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
    this.loginAccountSettings = loginAccountSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of settings on the acccount that indicate what features are available.")
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
  public LoginAccount loginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of user-level settings that indicate what user-specific features are available.")
  @JsonProperty("loginUserSettings")
  public java.util.List<NameValue> getLoginUserSettings() {
    return loginUserSettings;
  }
  public void setLoginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccount loginAccount = (LoginAccount) o;
    return Objects.equals(this.name, loginAccount.name) &&
        Objects.equals(this.accountId, loginAccount.accountId) &&
        Objects.equals(this.accountIdGuid, loginAccount.accountIdGuid) &&
        Objects.equals(this.baseUrl, loginAccount.baseUrl) &&
        Objects.equals(this.isDefault, loginAccount.isDefault) &&
        Objects.equals(this.userName, loginAccount.userName) &&
        Objects.equals(this.userId, loginAccount.userId) &&
        Objects.equals(this.email, loginAccount.email) &&
        Objects.equals(this.siteDescription, loginAccount.siteDescription) &&
        Objects.equals(this.loginAccountSettings, loginAccount.loginAccountSettings) &&
        Objects.equals(this.loginUserSettings, loginAccount.loginUserSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountId, accountIdGuid, baseUrl, isDefault, userName, userId, email, siteDescription, loginAccountSettings, loginUserSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
    sb.append("    loginAccountSettings: ").append(toIndentedString(loginAccountSettings)).append("\n");
    sb.append("    loginUserSettings: ").append(toIndentedString(loginUserSettings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

