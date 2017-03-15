package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class LoginAccount   {
  
  private String accountId = null;
  private String accountIdGuid = null;
  private String baseUrl = null;
  private String email = null;
  private String isDefault = null;
  private java.util.List<NameValue> loginAccountSettings = new java.util.ArrayList<NameValue>();
  private java.util.List<NameValue> loginUserSettings = new java.util.ArrayList<NameValue>();
  private String name = null;
  private String siteDescription = null;
  private String userId = null;
  private String userName = null;

  
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
   * The email address for the user.
   **/
  
  @ApiModelProperty(value = "The email address for the user.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccount loginAccount = (LoginAccount) o;

    return true && Objects.equals(accountId, loginAccount.accountId) &&
        Objects.equals(accountIdGuid, loginAccount.accountIdGuid) &&
        Objects.equals(baseUrl, loginAccount.baseUrl) &&
        Objects.equals(email, loginAccount.email) &&
        Objects.equals(isDefault, loginAccount.isDefault) &&
        Objects.equals(loginAccountSettings, loginAccount.loginAccountSettings) &&
        Objects.equals(loginUserSettings, loginAccount.loginUserSettings) &&
        Objects.equals(name, loginAccount.name) &&
        Objects.equals(siteDescription, loginAccount.siteDescription) &&
        Objects.equals(userId, loginAccount.userId) &&
        Objects.equals(userName, loginAccount.userName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIdGuid, baseUrl, email, isDefault, loginAccountSettings, loginUserSettings, name, siteDescription, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccount {\n");
    
    if (accountId != null)
      sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    if (accountIdGuid != null)
      sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    if (baseUrl != null)
      sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (isDefault != null)
      sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    if (loginAccountSettings != null)
      sb.append("    loginAccountSettings: ").append(toIndentedString(loginAccountSettings)).append("\n");
    if (loginUserSettings != null)
      sb.append("    loginUserSettings: ").append(toIndentedString(loginUserSettings)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (siteDescription != null)
      sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    if (userName != null)
      sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

