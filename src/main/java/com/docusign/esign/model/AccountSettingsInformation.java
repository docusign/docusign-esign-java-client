package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains account settings information..
 *
 */
@ApiModel(description = "Contains account settings information.")

public class AccountSettingsInformation {
  @JsonProperty("accountSettings")
  private java.util.List<NameValue> accountSettings = null;


  /**
   * accountSettings.
   *
   * @return AccountSettingsInformation
   **/
  public AccountSettingsInformation accountSettings(java.util.List<NameValue> accountSettings) {
    this.accountSettings = accountSettings;
    return this;
  }
  
  /**
   * addAccountSettingsItem.
   *
   * @return AccountSettingsInformation
   **/
  public AccountSettingsInformation addAccountSettingsItem(NameValue accountSettingsItem) {
    if (this.accountSettings == null) {
      this.accountSettings = new java.util.ArrayList<NameValue>();
    }
    this.accountSettings.add(accountSettingsItem);
    return this;
  }

  /**
   * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden..
   * @return accountSettings
   **/
  @ApiModelProperty(value = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
  public java.util.List<NameValue> getAccountSettings() {
    return accountSettings;
  }

  /**
   * setAccountSettings.
   **/
  public void setAccountSettings(java.util.List<NameValue> accountSettings) {
    this.accountSettings = accountSettings;
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
    AccountSettingsInformation accountSettingsInformation = (AccountSettingsInformation) o;
    return Objects.equals(this.accountSettings, accountSettingsInformation.accountSettings);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountSettings);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSettingsInformation {\n");
    
    sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
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

