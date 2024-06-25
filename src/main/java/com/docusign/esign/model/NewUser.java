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
 * Object representing a new user..
 *
 */
@Schema(description = "Object representing a new user.")

public class NewUser implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiPassword")
  private String apiPassword = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("membershipId")
  private String membershipId = null;

  @JsonProperty("permissionProfileId")
  private String permissionProfileId = null;

  @JsonProperty("permissionProfileName")
  private String permissionProfileName = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userStatus")
  private String userStatus = null;


  /**
   * apiPassword.
   *
   * @return NewUser
   **/
  public NewUser apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }

  /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password..
   * @return apiPassword
   **/
  @Schema(description = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
  public String getApiPassword() {
    return apiPassword;
  }

  /**
   * setApiPassword.
   **/
  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }


  /**
   * createdDateTime.
   *
   * @return NewUser
   **/
  public NewUser createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @Schema(description = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * email.
   *
   * @return NewUser
   **/
  public NewUser email(String email) {
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
   * @return NewUser
   **/
  public NewUser errorDetails(ErrorDetails errorDetails) {
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
   * membershipId.
   *
   * @return NewUser
   **/
  public NewUser membershipId(String membershipId) {
    this.membershipId = membershipId;
    return this;
  }

  /**
   * .
   * @return membershipId
   **/
  @Schema(description = "")
  public String getMembershipId() {
    return membershipId;
  }

  /**
   * setMembershipId.
   **/
  public void setMembershipId(String membershipId) {
    this.membershipId = membershipId;
  }


  /**
   * permissionProfileId.
   *
   * @return NewUser
   **/
  public NewUser permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

  /**
   * .
   * @return permissionProfileId
   **/
  @Schema(description = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  /**
   * setPermissionProfileId.
   **/
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }


  /**
   * permissionProfileName.
   *
   * @return NewUser
   **/
  public NewUser permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

  /**
   * .
   * @return permissionProfileName
   **/
  @Schema(description = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  /**
   * setPermissionProfileName.
   **/
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }


  /**
   * uri.
   *
   * @return NewUser
   **/
  public NewUser uri(String uri) {
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
   * @return NewUser
   **/
  public NewUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Specifies the user ID for the new user..
   * @return userId
   **/
  @Schema(description = "Specifies the user ID for the new user.")
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
   * @return NewUser
   **/
  public NewUser userName(String userName) {
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
   * @return NewUser
   **/
  public NewUser userStatus(String userStatus) {
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
    NewUser newUser = (NewUser) o;
    return Objects.equals(this.apiPassword, newUser.apiPassword) &&
        Objects.equals(this.createdDateTime, newUser.createdDateTime) &&
        Objects.equals(this.email, newUser.email) &&
        Objects.equals(this.errorDetails, newUser.errorDetails) &&
        Objects.equals(this.membershipId, newUser.membershipId) &&
        Objects.equals(this.permissionProfileId, newUser.permissionProfileId) &&
        Objects.equals(this.permissionProfileName, newUser.permissionProfileName) &&
        Objects.equals(this.uri, newUser.uri) &&
        Objects.equals(this.userId, newUser.userId) &&
        Objects.equals(this.userName, newUser.userName) &&
        Objects.equals(this.userStatus, newUser.userStatus);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, createdDateTime, email, errorDetails, membershipId, permissionProfileId, permissionProfileName, uri, userId, userName, userStatus);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

