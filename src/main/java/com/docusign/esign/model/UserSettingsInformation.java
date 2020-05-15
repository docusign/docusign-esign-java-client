package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.SenderEmailNotifications;
import com.docusign.esign.model.SignerEmailNotifications;
import com.docusign.esign.model.UserAccountManagementGranularInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSettingsInformation
 */

public class UserSettingsInformation {
  @JsonProperty("accountManagementGranular")
  private UserAccountManagementGranularInformation accountManagementGranular = null;

  @JsonProperty("senderEmailNotifications")
  private SenderEmailNotifications senderEmailNotifications = null;

  @JsonProperty("signerEmailNotifications")
  private SignerEmailNotifications signerEmailNotifications = null;

  @JsonProperty("userSettings")
  private java.util.List<NameValue> userSettings = null;

  public UserSettingsInformation accountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
    return this;
  }

   /**
   * Get accountManagementGranular
   * @return accountManagementGranular
  **/
  @ApiModelProperty(value = "")
  public UserAccountManagementGranularInformation getAccountManagementGranular() {
    return accountManagementGranular;
  }

  public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
  }

  public UserSettingsInformation senderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
    return this;
  }

   /**
   * Get senderEmailNotifications
   * @return senderEmailNotifications
  **/
  @ApiModelProperty(value = "")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }

  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }

  public UserSettingsInformation signerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
    return this;
  }

   /**
   * Get signerEmailNotifications
   * @return signerEmailNotifications
  **/
  @ApiModelProperty(value = "")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }

  public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
  }

  public UserSettingsInformation userSettings(java.util.List<NameValue> userSettings) {
    this.userSettings = userSettings;
    return this;
  }

  public UserSettingsInformation addUserSettingsItem(NameValue userSettingsItem) {
    if (this.userSettings == null) {
      this.userSettings = new java.util.ArrayList<NameValue>();
    }
    this.userSettings.add(userSettingsItem);
    return this;
  }

   /**
   * 
   * @return userSettings
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NameValue> getUserSettings() {
    return userSettings;
  }

  public void setUserSettings(java.util.List<NameValue> userSettings) {
    this.userSettings = userSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettingsInformation userSettingsInformation = (UserSettingsInformation) o;
    return Objects.equals(this.accountManagementGranular, userSettingsInformation.accountManagementGranular) &&
        Objects.equals(this.senderEmailNotifications, userSettingsInformation.senderEmailNotifications) &&
        Objects.equals(this.signerEmailNotifications, userSettingsInformation.signerEmailNotifications) &&
        Objects.equals(this.userSettings, userSettingsInformation.userSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagementGranular, senderEmailNotifications, signerEmailNotifications, userSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsInformation {\n");
    
    sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
    sb.append("    senderEmailNotifications: ").append(toIndentedString(senderEmailNotifications)).append("\n");
    sb.append("    signerEmailNotifications: ").append(toIndentedString(signerEmailNotifications)).append("\n");
    sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
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

