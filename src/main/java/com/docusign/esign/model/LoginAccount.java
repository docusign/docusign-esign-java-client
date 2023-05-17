package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LoginAccount.
 *
 */

public class LoginAccount {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountIdGuid")
  private String accountIdGuid = null;

  @JsonProperty("baseUrl")
  private String baseUrl = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("loginAccountSettings")
  private java.util.List<NameValue> loginAccountSettings = null;

  @JsonProperty("loginUserSettings")
  private java.util.List<NameValue> loginUserSettings = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("siteDescription")
  private String siteDescription = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;


  /**
   * accountId.
   *
   * @return LoginAccount
   **/
  public LoginAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope..
   * @return accountId
   **/
  @Schema(description = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * accountIdGuid.
   *
   * @return LoginAccount
   **/
  public LoginAccount accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }

  /**
   * The GUID associated with the account ID..
   * @return accountIdGuid
   **/
  @Schema(description = "The GUID associated with the account ID.")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }

  /**
   * setAccountIdGuid.
   **/
  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }


  /**
   * baseUrl.
   *
   * @return LoginAccount
   **/
  public LoginAccount baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl..
   * @return baseUrl
   **/
  @Schema(description = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
  public String getBaseUrl() {
    return baseUrl;
  }

  /**
   * setBaseUrl.
   **/
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  /**
   * email.
   *
   * @return LoginAccount
   **/
  public LoginAccount email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address for the user..
   * @return email
   **/
  @Schema(description = "The email address for the user.")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * isDefault.
   *
   * @return LoginAccount
   **/
  public LoginAccount isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * This value is true if this is the default account for the user, otherwise false is returned..
   * @return isDefault
   **/
  @Schema(description = "This value is true if this is the default account for the user, otherwise false is returned.")
  public String getIsDefault() {
    return isDefault;
  }

  /**
   * setIsDefault.
   **/
  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }


  /**
   * loginAccountSettings.
   *
   * @return LoginAccount
   **/
  public LoginAccount loginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
    this.loginAccountSettings = loginAccountSettings;
    return this;
  }
  
  /**
   * addLoginAccountSettingsItem.
   *
   * @return LoginAccount
   **/
  public LoginAccount addLoginAccountSettingsItem(NameValue loginAccountSettingsItem) {
    if (this.loginAccountSettings == null) {
      this.loginAccountSettings = new java.util.ArrayList<>();
    }
    this.loginAccountSettings.add(loginAccountSettingsItem);
    return this;
  }

  /**
   * A list of settings on the acccount that indicate what features are available..
   * @return loginAccountSettings
   **/
  @Schema(description = "A list of settings on the acccount that indicate what features are available.")
  public java.util.List<NameValue> getLoginAccountSettings() {
    return loginAccountSettings;
  }

  /**
   * setLoginAccountSettings.
   **/
  public void setLoginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
    this.loginAccountSettings = loginAccountSettings;
  }


  /**
   * loginUserSettings.
   *
   * @return LoginAccount
   **/
  public LoginAccount loginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
    return this;
  }
  
  /**
   * addLoginUserSettingsItem.
   *
   * @return LoginAccount
   **/
  public LoginAccount addLoginUserSettingsItem(NameValue loginUserSettingsItem) {
    if (this.loginUserSettings == null) {
      this.loginUserSettings = new java.util.ArrayList<>();
    }
    this.loginUserSettings.add(loginUserSettingsItem);
    return this;
  }

  /**
   * A list of user-level settings that indicate what user-specific features are available..
   * @return loginUserSettings
   **/
  @Schema(description = "A list of user-level settings that indicate what user-specific features are available.")
  public java.util.List<NameValue> getLoginUserSettings() {
    return loginUserSettings;
  }

  /**
   * setLoginUserSettings.
   **/
  public void setLoginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
  }


  /**
   * name.
   *
   * @return LoginAccount
   **/
  public LoginAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name associated with the account..
   * @return name
   **/
  @Schema(description = "The name associated with the account.")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * siteDescription.
   *
   * @return LoginAccount
   **/
  public LoginAccount siteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
    return this;
  }

  /**
   * An optional descirption of the site that hosts the account..
   * @return siteDescription
   **/
  @Schema(description = "An optional descirption of the site that hosts the account.")
  public String getSiteDescription() {
    return siteDescription;
  }

  /**
   * setSiteDescription.
   **/
  public void setSiteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
  }


  /**
   * userId.
   *
   * @return LoginAccount
   **/
  public LoginAccount userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * userName.
   *
   * @return LoginAccount
   **/
  public LoginAccount userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The name of this user as defined by the account..
   * @return userName
   **/
  @Schema(description = "The name of this user as defined by the account.")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccount loginAccount = (LoginAccount) o;
    return Objects.equals(this.accountId, loginAccount.accountId) &&
        Objects.equals(this.accountIdGuid, loginAccount.accountIdGuid) &&
        Objects.equals(this.baseUrl, loginAccount.baseUrl) &&
        Objects.equals(this.email, loginAccount.email) &&
        Objects.equals(this.isDefault, loginAccount.isDefault) &&
        Objects.equals(this.loginAccountSettings, loginAccount.loginAccountSettings) &&
        Objects.equals(this.loginUserSettings, loginAccount.loginUserSettings) &&
        Objects.equals(this.name, loginAccount.name) &&
        Objects.equals(this.siteDescription, loginAccount.siteDescription) &&
        Objects.equals(this.userId, loginAccount.userId) &&
        Objects.equals(this.userName, loginAccount.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIdGuid, baseUrl, email, isDefault, loginAccountSettings, loginUserSettings, name, siteDescription, userId, userName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccount {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    loginAccountSettings: ").append(toIndentedString(loginAccountSettings)).append("\n");
    sb.append("    loginUserSettings: ").append(toIndentedString(loginUserSettings)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

