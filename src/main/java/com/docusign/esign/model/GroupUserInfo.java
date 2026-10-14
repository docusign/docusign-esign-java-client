package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * GroupUserInfo.
 *
 */

public class GroupUserInfo implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * activationAccessCode.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo activationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
    return this;
  }

  /**
   * .
   * @return activationAccessCode
   **/
  @Schema(description = "")
  public String getActivationAccessCode() {
    return activationAccessCode;
  }

  /**
   * setActivationAccessCode.
   **/
  public void setActivationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
  }


  /**
   * email.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
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
   * errorDetails.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * loginStatus.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo loginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
    return this;
  }

  /**
   * .
   * @return loginStatus
   **/
  @Schema(description = "")
  public String getLoginStatus() {
    return loginStatus;
  }

  /**
   * setLoginStatus.
   **/
  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }


  /**
   * sendActivationEmail.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo sendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
    return this;
  }

  /**
   * .
   * @return sendActivationEmail
   **/
  @Schema(description = "")
  public String getSendActivationEmail() {
    return sendActivationEmail;
  }

  /**
   * setSendActivationEmail.
   **/
  public void setSendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
  }


  /**
   * uri.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * userId.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo userId(String userId) {
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
   * @return GroupUserInfo
   **/
  public GroupUserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * .
   * @return userName
   **/
  @Schema(description = "")
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
   * userStatus.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * .
   * @return userStatus
   **/
  @Schema(description = "")
  public String getUserStatus() {
    return userStatus;
  }

  /**
   * setUserStatus.
   **/
  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }


  /**
   * userType.
   *
   * @return GroupUserInfo
   **/
  public GroupUserInfo userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * .
   * @return userType
   **/
  @Schema(description = "")
  public String getUserType() {
    return userType;
  }

  /**
   * setUserType.
   **/
  public void setUserType(String userType) {
    this.userType = userType;
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
    GroupUserInfo groupUserInfo = (GroupUserInfo) o;
    return Objects.equals(this.activationAccessCode, groupUserInfo.activationAccessCode) &&
        Objects.equals(this.email, groupUserInfo.email) &&
        Objects.equals(this.errorDetails, groupUserInfo.errorDetails) &&
        Objects.equals(this.loginStatus, groupUserInfo.loginStatus) &&
        Objects.equals(this.sendActivationEmail, groupUserInfo.sendActivationEmail) &&
        Objects.equals(this.uri, groupUserInfo.uri) &&
        Objects.equals(this.userId, groupUserInfo.userId) &&
        Objects.equals(this.userName, groupUserInfo.userName) &&
        Objects.equals(this.userStatus, groupUserInfo.userStatus) &&
        Objects.equals(this.userType, groupUserInfo.userType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(activationAccessCode, email, errorDetails, loginStatus, sendActivationEmail, uri, userId, userName, userStatus, userType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUserInfo {\n");
    
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

