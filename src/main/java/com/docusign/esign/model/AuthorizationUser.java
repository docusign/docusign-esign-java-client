package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AuthorizationUser.
 *
 */

public class AuthorizationUser {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("userId")
  private String userId = null;


  /**
   * accountId.
   *
   * @return AuthorizationUser
   **/
  public AuthorizationUser accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope..
   * @return accountId
   **/
  @Schema(description = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * email.
   *
   * @return AuthorizationUser
   **/
  public AuthorizationUser email(String email) {
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
   * name.
   *
   * @return AuthorizationUser
   **/
  public AuthorizationUser name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * userId.
   *
   * @return AuthorizationUser
   **/
  public AuthorizationUser userId(String userId) {
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
    AuthorizationUser authorizationUser = (AuthorizationUser) o;
    return Objects.equals(this.accountId, authorizationUser.accountId) &&
        Objects.equals(this.email, authorizationUser.email) &&
        Objects.equals(this.name, authorizationUser.name) &&
        Objects.equals(this.userId, authorizationUser.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, email, name, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationUser {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

