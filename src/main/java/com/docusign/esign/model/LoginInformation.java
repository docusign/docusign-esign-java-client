package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.LoginAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class LoginInformation   {
  
  private String apiPassword = null;
  private java.util.List<LoginAccount> loginAccounts = new java.util.ArrayList<LoginAccount>();

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInformation loginInformation = (LoginInformation) o;

    return true && Objects.equals(apiPassword, loginInformation.apiPassword) &&
        Objects.equals(loginAccounts, loginInformation.loginAccounts)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, loginAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInformation {\n");
    
    if (apiPassword != null)
      sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    if (loginAccounts != null)
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

