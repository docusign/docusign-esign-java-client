package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserAuthorization;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserAuthorizationWithStatus.
 *
 */

public class UserAuthorizationWithStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("authorization")
  private UserAuthorization authorization = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("success")
  private String success = null;


  /**
   * authorization.
   *
   * @return UserAuthorizationWithStatus
   **/
  public UserAuthorizationWithStatus authorization(UserAuthorization authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * .
   * @return authorization
   **/
  @Schema(description = "")
  public UserAuthorization getAuthorization() {
    return authorization;
  }

  /**
   * setAuthorization.
   **/
  public void setAuthorization(UserAuthorization authorization) {
    this.authorization = authorization;
  }


  /**
   * errorMessage.
   *
   * @return UserAuthorizationWithStatus
   **/
  public UserAuthorizationWithStatus errorMessage(String errorMessage) {
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
   * @return UserAuthorizationWithStatus
   **/
  public UserAuthorizationWithStatus success(String success) {
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
    UserAuthorizationWithStatus userAuthorizationWithStatus = (UserAuthorizationWithStatus) o;
    return Objects.equals(this.authorization, userAuthorizationWithStatus.authorization) &&
        Objects.equals(this.errorMessage, userAuthorizationWithStatus.errorMessage) &&
        Objects.equals(this.success, userAuthorizationWithStatus.success);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorization, errorMessage, success);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationWithStatus {\n");
    
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

