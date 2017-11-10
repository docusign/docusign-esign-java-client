package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewUser
 */

public class NewUser {
  @JsonProperty("apiPassword")
  private String apiPassword = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

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

  public NewUser apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }

   /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password.
   * @return apiPassword
  **/
  @ApiModelProperty(example = "null", value = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
  public String getApiPassword() {
    return apiPassword;
  }

  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  public NewUser createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Indicates the date and time the item was created.
   * @return createdDateTime
  **/
  @ApiModelProperty(example = "null", value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public NewUser email(String email) {
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

  public NewUser errorDetails(ErrorDetails errorDetails) {
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

  public NewUser permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

   /**
   * 
   * @return permissionProfileId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  public NewUser permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

   /**
   * 
   * @return permissionProfileName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }

  public NewUser uri(String uri) {
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

  public NewUser userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the user ID for the new user.
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the user ID for the new user.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public NewUser userName(String userName) {
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

  public NewUser userStatus(String userStatus) {
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
        Objects.equals(this.permissionProfileId, newUser.permissionProfileId) &&
        Objects.equals(this.permissionProfileName, newUser.permissionProfileName) &&
        Objects.equals(this.uri, newUser.uri) &&
        Objects.equals(this.userId, newUser.userId) &&
        Objects.equals(this.userName, newUser.userName) &&
        Objects.equals(this.userStatus, newUser.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, createdDateTime, email, errorDetails, permissionProfileId, permissionProfileName, uri, userId, userName, userStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

