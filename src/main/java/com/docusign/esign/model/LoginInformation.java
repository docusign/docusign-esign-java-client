package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.LoginAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class LoginInformation   {
  
  private java.util.List<LoginAccount> loginAccounts = new java.util.ArrayList<LoginAccount>();
  private String apiPassword = null;

  
  /**
   * The list of accounts that authenticating user is a member of.
   **/
  public LoginInformation loginAccounts(java.util.List<LoginAccount> loginAccounts) {
    this.loginAccounts = loginAccounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of accounts that authenticating user is a member of.")
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
  public LoginInformation apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.")
  @JsonProperty("apiPassword")
  public String getApiPassword() {
    return apiPassword;
  }
  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
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
    return Objects.equals(this.loginAccounts, loginInformation.loginAccounts) &&
        Objects.equals(this.apiPassword, loginInformation.apiPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginAccounts, apiPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInformation {\n");
    
    sb.append("    loginAccounts: ").append(toIndentedString(loginAccounts)).append("\n");
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
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

