package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserAuthorizationCreateRequestWithId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserAuthorizationsRequest.
 *
 */

public class UserAuthorizationsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("authorizations")
  private java.util.List<UserAuthorizationCreateRequestWithId> authorizations = null;

  @JsonProperty("sendNotification")
  private String sendNotification = null;


  /**
   * authorizations.
   *
   * @return UserAuthorizationsRequest
   **/
  public UserAuthorizationsRequest authorizations(java.util.List<UserAuthorizationCreateRequestWithId> authorizations) {
    this.authorizations = authorizations;
    return this;
  }
  
  /**
   * addAuthorizationsItem.
   *
   * @return UserAuthorizationsRequest
   **/
  public UserAuthorizationsRequest addAuthorizationsItem(UserAuthorizationCreateRequestWithId authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new java.util.ArrayList<>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

  /**
   * .
   * @return authorizations
   **/
  @Schema(description = "")
  public java.util.List<UserAuthorizationCreateRequestWithId> getAuthorizations() {
    return authorizations;
  }

  /**
   * setAuthorizations.
   **/
  public void setAuthorizations(java.util.List<UserAuthorizationCreateRequestWithId> authorizations) {
    this.authorizations = authorizations;
  }


  /**
   * sendNotification.
   *
   * @return UserAuthorizationsRequest
   **/
  public UserAuthorizationsRequest sendNotification(String sendNotification) {
    this.sendNotification = sendNotification;
    return this;
  }

  /**
   * .
   * @return sendNotification
   **/
  @Schema(description = "")
  public String getSendNotification() {
    return sendNotification;
  }

  /**
   * setSendNotification.
   **/
  public void setSendNotification(String sendNotification) {
    this.sendNotification = sendNotification;
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
    UserAuthorizationsRequest userAuthorizationsRequest = (UserAuthorizationsRequest) o;
    return Objects.equals(this.authorizations, userAuthorizationsRequest.authorizations) &&
        Objects.equals(this.sendNotification, userAuthorizationsRequest.sendNotification);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorizations, sendNotification);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationsRequest {\n");
    
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    sendNotification: ").append(toIndentedString(sendNotification)).append("\n");
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

