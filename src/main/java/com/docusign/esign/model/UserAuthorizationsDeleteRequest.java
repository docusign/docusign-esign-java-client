package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserAuthorizationsDeleteRequest.
 *
 */

public class UserAuthorizationsDeleteRequest {
  @JsonProperty("authorizations")
  private java.util.List<String> authorizations = null;


  /**
   * authorizations.
   *
   * @return UserAuthorizationsDeleteRequest
   **/
  public UserAuthorizationsDeleteRequest authorizations(java.util.List<String> authorizations) {
    this.authorizations = authorizations;
    return this;
  }
  
  /**
   * addAuthorizationsItem.
   *
   * @return UserAuthorizationsDeleteRequest
   **/
  public UserAuthorizationsDeleteRequest addAuthorizationsItem(String authorizationsItem) {
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
  public java.util.List<String> getAuthorizations() {
    return authorizations;
  }

  /**
   * setAuthorizations.
   **/
  public void setAuthorizations(java.util.List<String> authorizations) {
    this.authorizations = authorizations;
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
    UserAuthorizationsDeleteRequest userAuthorizationsDeleteRequest = (UserAuthorizationsDeleteRequest) o;
    return Objects.equals(this.authorizations, userAuthorizationsDeleteRequest.authorizations);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorizations);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationsDeleteRequest {\n");
    
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
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

