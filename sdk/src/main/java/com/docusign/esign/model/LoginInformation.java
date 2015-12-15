package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.LoginAccount;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class LoginInformation   {
  
  private java.util.List<LoginAccount> loginAccounts = new java.util.ArrayList<LoginAccount>();
  private String apiPassword = null;

  
  /**
   * The list of accounts that authenticating user is a member of.
   **/
  @ApiModelProperty(value = "The list of accounts that authenticating user is a member of.")
  @JsonProperty("loginAccounts")
  public java.util.List<LoginAccount> getLoginAccounts() {
    return loginAccounts;
  }
  public void setLoginAccounts(java.util.List<LoginAccount> loginAccounts) {
    this.loginAccounts = loginAccounts;
  }

  
  /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.
   **/
  @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.")
  @JsonProperty("apiPassword")
  public String getApiPassword() {
    return apiPassword;
  }
  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInformation loginInformation = (LoginInformation) o;
    return Objects.equals(loginAccounts, loginInformation.loginAccounts) &&
        Objects.equals(apiPassword, loginInformation.apiPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginAccounts, apiPassword);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInformation {\n");
    
    sb.append("    loginAccounts: ").append(StringUtil.toIndentedString(loginAccounts)).append("\n");
    sb.append("    apiPassword: ").append(StringUtil.toIndentedString(apiPassword)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
