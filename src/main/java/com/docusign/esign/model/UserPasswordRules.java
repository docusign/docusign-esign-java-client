package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountPasswordRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains details about the password rules for a user..
 *
 */
@Schema(description = "Contains details about the password rules for a user.")

public class UserPasswordRules {
  @JsonProperty("passwordRules")
  private AccountPasswordRules passwordRules = null;

  @JsonProperty("userId")
  private String userId = null;

  /**
   * passwordRules.
   *
   * @return UserPasswordRules
   **/
  public UserPasswordRules passwordRules(AccountPasswordRules passwordRules) {
    this.passwordRules = passwordRules;
    return this;
  }

  /**
   * Contains details about the password rules for the user..
   * 
   * @return passwordRules
   **/
  @Schema(description = "Contains details about the password rules for the user.")
  public AccountPasswordRules getPasswordRules() {
    return passwordRules;
  }

  /**
   * setPasswordRules.
   **/
  public void setPasswordRules(AccountPasswordRules passwordRules) {
    this.passwordRules = passwordRules;
  }

  /**
   * userId.
   *
   * @return UserPasswordRules
   **/
  public UserPasswordRules userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * 
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
    UserPasswordRules userPasswordRules = (UserPasswordRules) o;
    return Objects.equals(this.passwordRules, userPasswordRules.passwordRules) &&
        Objects.equals(this.userId, userPasswordRules.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(passwordRules, userId);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordRules {\n");

    sb.append("    passwordRules: ").append(toIndentedString(passwordRules)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
