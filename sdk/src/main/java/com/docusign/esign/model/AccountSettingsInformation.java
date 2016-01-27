package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.NameValue;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class AccountSettingsInformation   {
  
  private java.util.List<NameValue> accountSettings = new java.util.ArrayList<NameValue>();

  
  /**
   * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.
   **/
  @ApiModelProperty(value = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
  @JsonProperty("accountSettings")
  public java.util.List<NameValue> getAccountSettings() {
    return accountSettings;
  }
  public void setAccountSettings(java.util.List<NameValue> accountSettings) {
    this.accountSettings = accountSettings;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSettingsInformation accountSettingsInformation = (AccountSettingsInformation) o;
    return Objects.equals(accountSettings, accountSettingsInformation.accountSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSettings);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSettingsInformation {\n");
    
    sb.append("    accountSettings: ").append(StringUtil.toIndentedString(accountSettings)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
