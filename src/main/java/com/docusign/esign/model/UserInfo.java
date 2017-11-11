package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserInfo
 */

public class UserInfo {
  @JsonProperty("activationAccessCode")
  private String activationAccessCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("loginStatus")
  private String loginStatus = null;

  @JsonProperty("sendActivationEmail")
  private String sendActivationEmail = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userStatus")
  private String userStatus = null;

  @JsonProperty("userType")
  private String userType = null;

  public UserInfo activationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
    return this;
  }

   /**
   * 
   * @return activationAccessCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActivationAccessCode() {
    return activationAccessCode;
  }

  public void setActivationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
  }

  public UserInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInfo errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public UserInfo loginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
    return this;
  }

   /**
   * 
   * @return loginStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLoginStatus() {
    return loginStatus;
  }

  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }

  public UserInfo sendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
    return this;
  }

   /**
   * 
   * @return sendActivationEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSendActivationEmail() {
    return sendActivationEmail;
  }

  public void setSendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
  }

  public UserInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public UserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserInfo userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

   /**
   * 
   * @return userStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  public UserInfo userType(String userType) {
    this.userType = userType;
    return this;
  }

   /**
   * 
   * @return userType
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.activationAccessCode, userInfo.activationAccessCode) &&
        Objects.equals(this.email, userInfo.email) &&
        Objects.equals(this.errorDetails, userInfo.errorDetails) &&
        Objects.equals(this.loginStatus, userInfo.loginStatus) &&
        Objects.equals(this.sendActivationEmail, userInfo.sendActivationEmail) &&
        Objects.equals(this.uri, userInfo.uri) &&
        Objects.equals(this.userId, userInfo.userId) &&
        Objects.equals(this.userName, userInfo.userName) &&
        Objects.equals(this.userStatus, userInfo.userStatus) &&
        Objects.equals(this.userType, userInfo.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationAccessCode, email, errorDetails, loginStatus, sendActivationEmail, uri, userId, userName, userStatus, userType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
    sb.append("    sendActivationEmail: ").append(toIndentedString(sendActivationEmail)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

