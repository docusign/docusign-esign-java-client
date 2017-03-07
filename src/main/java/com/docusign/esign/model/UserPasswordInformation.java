package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ForgottenPasswordInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserPasswordInformation   {
  
  private String currentPassword = null;
  private String email = null;
  private ForgottenPasswordInformation forgottenPasswordInfo = null;
  private String newPassword = null;

  
  /**
   * The user's current password to be changed.
   **/
  
  @ApiModelProperty(value = "The user's current password to be changed.")
  @JsonProperty("currentPassword")
  public String getCurrentPassword() {
    return currentPassword;
  }
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  
  /**
   * The user's email address for the associated account.
   **/
  
  @ApiModelProperty(value = "The user's email address for the associated account.")
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
  @JsonProperty("forgottenPasswordInfo")
  public ForgottenPasswordInformation getForgottenPasswordInfo() {
    return forgottenPasswordInfo;
  }
  public void setForgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
  }

  
  /**
   * The user's new password.
   **/
  
  @ApiModelProperty(value = "The user's new password.")
  @JsonProperty("newPassword")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPasswordInformation userPasswordInformation = (UserPasswordInformation) o;

    return true && Objects.equals(currentPassword, userPasswordInformation.currentPassword) &&
        Objects.equals(email, userPasswordInformation.email) &&
        Objects.equals(forgottenPasswordInfo, userPasswordInformation.forgottenPasswordInfo) &&
        Objects.equals(newPassword, userPasswordInformation.newPassword)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, email, forgottenPasswordInfo, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordInformation {\n");
    
    if (currentPassword != null)
      sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (forgottenPasswordInfo != null)
      sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
    if (newPassword != null)
      sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

