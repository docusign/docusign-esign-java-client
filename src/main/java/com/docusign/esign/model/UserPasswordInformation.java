package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ForgottenPasswordInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserPasswordInformation.
 *
 */

public class UserPasswordInformation {
  @JsonProperty("currentPassword")
  private String currentPassword = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("forgottenPasswordInfo")
  private ForgottenPasswordInformation forgottenPasswordInfo = null;

  @JsonProperty("newPassword")
  private String newPassword = null;


  /**
   * currentPassword.
   *
   * @return UserPasswordInformation
   **/
  public UserPasswordInformation currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * The user's current password to be changed..
   * @return currentPassword
   **/
  @Schema(description = "The user's current password to be changed.")
  public String getCurrentPassword() {
    return currentPassword;
  }

  /**
   * setCurrentPassword.
   **/
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }


  /**
   * email.
   *
   * @return UserPasswordInformation
   **/
  public UserPasswordInformation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's email address for the associated account..
   * @return email
   **/
  @Schema(description = "The user's email address for the associated account.")
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
   * forgottenPasswordInfo.
   *
   * @return UserPasswordInformation
   **/
  public UserPasswordInformation forgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
    return this;
  }

  /**
   * A complex element containing up to four Question/Answer pairs for forgotten password information..
   * @return forgottenPasswordInfo
   **/
  @Schema(description = "A complex element containing up to four Question/Answer pairs for forgotten password information.")
  public ForgottenPasswordInformation getForgottenPasswordInfo() {
    return forgottenPasswordInfo;
  }

  /**
   * setForgottenPasswordInfo.
   **/
  public void setForgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
  }


  /**
   * newPassword.
   *
   * @return UserPasswordInformation
   **/
  public UserPasswordInformation newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The user's new password..
   * @return newPassword
   **/
  @Schema(description = "The user's new password.")
  public String getNewPassword() {
    return newPassword;
  }

  /**
   * setNewPassword.
   **/
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
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
    UserPasswordInformation userPasswordInformation = (UserPasswordInformation) o;
    return Objects.equals(this.currentPassword, userPasswordInformation.currentPassword) &&
        Objects.equals(this.email, userPasswordInformation.email) &&
        Objects.equals(this.forgottenPasswordInfo, userPasswordInformation.forgottenPasswordInfo) &&
        Objects.equals(this.newPassword, userPasswordInformation.newPassword);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, email, forgottenPasswordInfo, newPassword);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordInformation {\n");
    
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
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

