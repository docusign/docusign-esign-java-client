package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserInfo   {
  
  private String activationAccessCode = null;
  private String email = null;
  private ErrorDetails errorDetails = null;
  private String loginStatus = null;
  private String sendActivationEmail = null;
  private String uri = null;
  private String userId = null;
  private String userName = null;
  private String userStatus = null;
  private String userType = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activationAccessCode")
  public String getActivationAccessCode() {
    return activationAccessCode;
  }
  public void setActivationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("loginStatus")
  public String getLoginStatus() {
    return loginStatus;
  }
  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sendActivationEmail")
  public String getSendActivationEmail() {
    return sendActivationEmail;
  }
  public void setSendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("userStatus")
  public String getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userType")
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;

    return true && Objects.equals(activationAccessCode, userInfo.activationAccessCode) &&
        Objects.equals(email, userInfo.email) &&
        Objects.equals(errorDetails, userInfo.errorDetails) &&
        Objects.equals(loginStatus, userInfo.loginStatus) &&
        Objects.equals(sendActivationEmail, userInfo.sendActivationEmail) &&
        Objects.equals(uri, userInfo.uri) &&
        Objects.equals(userId, userInfo.userId) &&
        Objects.equals(userName, userInfo.userName) &&
        Objects.equals(userStatus, userInfo.userStatus) &&
        Objects.equals(userType, userInfo.userType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationAccessCode, email, errorDetails, loginStatus, sendActivationEmail, uri, userId, userName, userStatus, userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    if (activationAccessCode != null)
      sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (loginStatus != null)
      sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
    if (sendActivationEmail != null)
      sb.append("    sendActivationEmail: ").append(toIndentedString(sendActivationEmail)).append("\n");
    if (uri != null)
      sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    if (userName != null)
      sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    if (userStatus != null)
      sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    if (userType != null)
      sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

