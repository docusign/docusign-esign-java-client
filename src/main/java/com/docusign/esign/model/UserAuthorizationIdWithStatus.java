package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserAuthorizationIdWithStatus.
 *
 */

public class UserAuthorizationIdWithStatus {
  @JsonProperty("authorizationId")
  private String authorizationId = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("success")
  private String success = null;


  /**
   * authorizationId.
   *
   * @return UserAuthorizationIdWithStatus
   **/
  public UserAuthorizationIdWithStatus authorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
    return this;
  }

  /**
   * .
   * @return authorizationId
   **/
  @Schema(description = "")
  public String getAuthorizationId() {
    return authorizationId;
  }

  /**
   * setAuthorizationId.
   **/
  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }


  /**
   * errorMessage.
   *
   * @return UserAuthorizationIdWithStatus
   **/
  public UserAuthorizationIdWithStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * .
   * @return errorMessage
   **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * setErrorMessage.
   **/
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * success.
   *
   * @return UserAuthorizationIdWithStatus
   **/
  public UserAuthorizationIdWithStatus success(String success) {
    this.success = success;
    return this;
  }

  /**
   * .
   * @return success
   **/
  @Schema(description = "")
  public String getSuccess() {
    return success;
  }

  /**
   * setSuccess.
   **/
  public void setSuccess(String success) {
    this.success = success;
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
    UserAuthorizationIdWithStatus userAuthorizationIdWithStatus = (UserAuthorizationIdWithStatus) o;
    return Objects.equals(this.authorizationId, userAuthorizationIdWithStatus.authorizationId) &&
        Objects.equals(this.errorMessage, userAuthorizationIdWithStatus.errorMessage) &&
        Objects.equals(this.success, userAuthorizationIdWithStatus.success);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorizationId, errorMessage, success);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationIdWithStatus {\n");
    
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

