package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class NewUser   {
  
  private String apiPassword = null;
  private String createdDateTime = null;
  private String email = null;
  private ErrorDetails errorDetails = null;
  private String permissionProfileId = null;
  private String permissionProfileName = null;
  private String uri = null;
  private String userId = null;
  private String userName = null;
  private String userStatus = null;

  
  /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password.
   **/
  
  @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
  @JsonProperty("apiPassword")
  public String getApiPassword() {
    return apiPassword;
  }
  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
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
  @JsonProperty("permissionProfileId")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionProfileName")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
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
   * Specifies the user ID for the new user.
   **/
  
  @ApiModelProperty(value = "Specifies the user ID for the new user.")
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUser newUser = (NewUser) o;

    return true && Objects.equals(apiPassword, newUser.apiPassword) &&
        Objects.equals(createdDateTime, newUser.createdDateTime) &&
        Objects.equals(email, newUser.email) &&
        Objects.equals(errorDetails, newUser.errorDetails) &&
        Objects.equals(permissionProfileId, newUser.permissionProfileId) &&
        Objects.equals(permissionProfileName, newUser.permissionProfileName) &&
        Objects.equals(uri, newUser.uri) &&
        Objects.equals(userId, newUser.userId) &&
        Objects.equals(userName, newUser.userName) &&
        Objects.equals(userStatus, newUser.userStatus)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, createdDateTime, email, errorDetails, permissionProfileId, permissionProfileName, uri, userId, userName, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    
    if (apiPassword != null)
      sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (permissionProfileId != null)
      sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    if (permissionProfileName != null)
      sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
    if (uri != null)
      sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    if (userName != null)
      sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    if (userStatus != null)
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

