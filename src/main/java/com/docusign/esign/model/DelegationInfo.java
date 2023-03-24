package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DelegationInfo.
 *
 */

public class DelegationInfo {
  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("UserAuthorizationId")
  private String userAuthorizationId = null;

  @JsonProperty("UserId")
  private String userId = null;


  /**
   * email.
   *
   * @return DelegationInfo
   **/
  public DelegationInfo email(String email) {
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
   * @return DelegationInfo
   **/
  public DelegationInfo name(String name) {
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
   * userAuthorizationId.
   *
   * @return DelegationInfo
   **/
  public DelegationInfo userAuthorizationId(String userAuthorizationId) {
    this.userAuthorizationId = userAuthorizationId;
    return this;
  }

  /**
   * .
   * @return userAuthorizationId
   **/
  @Schema(description = "")
  public String getUserAuthorizationId() {
    return userAuthorizationId;
  }

  /**
   * setUserAuthorizationId.
   **/
  public void setUserAuthorizationId(String userAuthorizationId) {
    this.userAuthorizationId = userAuthorizationId;
  }


  /**
   * userId.
   *
   * @return DelegationInfo
   **/
  public DelegationInfo userId(String userId) {
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
    DelegationInfo delegationInfo = (DelegationInfo) o;
    return Objects.equals(this.email, delegationInfo.email) &&
        Objects.equals(this.name, delegationInfo.name) &&
        Objects.equals(this.userAuthorizationId, delegationInfo.userAuthorizationId) &&
        Objects.equals(this.userId, delegationInfo.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, name, userAuthorizationId, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegationInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userAuthorizationId: ").append(toIndentedString(userAuthorizationId)).append("\n");
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

