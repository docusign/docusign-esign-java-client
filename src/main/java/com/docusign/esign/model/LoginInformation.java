package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.LoginAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LoginInformation
 */

public class LoginInformation {
  @JsonProperty("apiPassword")
  private String apiPassword = null;

  @JsonProperty("loginAccounts")
  private java.util.List<LoginAccount> loginAccounts = null;

  public LoginInformation apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }

   /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.
   * @return apiPassword
  **/
  @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.")
  public String getApiPassword() {
    return apiPassword;
  }

  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  public LoginInformation loginAccounts(java.util.List<LoginAccount> loginAccounts) {
    this.loginAccounts = loginAccounts;
    return this;
  }

  public LoginInformation addLoginAccountsItem(LoginAccount loginAccountsItem) {
    if (this.loginAccounts == null) {
      this.loginAccounts = new java.util.ArrayList<LoginAccount>();
    }
    this.loginAccounts.add(loginAccountsItem);
    return this;
  }

   /**
   * The list of accounts that authenticating user is a member of.
   * @return loginAccounts
  **/
  @ApiModelProperty(value = "The list of accounts that authenticating user is a member of.")
  public java.util.List<LoginAccount> getLoginAccounts() {
    return loginAccounts;
  }

  public void setLoginAccounts(java.util.List<LoginAccount> loginAccounts) {
    this.loginAccounts = loginAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInformation loginInformation = (LoginInformation) o;
    return Objects.equals(this.apiPassword, loginInformation.apiPassword) &&
        Objects.equals(this.loginAccounts, loginInformation.loginAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, loginAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInformation {\n");
    
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    sb.append("    loginAccounts: ").append(toIndentedString(loginAccounts)).append("\n");
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

