package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserAuthorizationIdWithStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserAuthorizationsDeleteResponse.
 *
 */

public class UserAuthorizationsDeleteResponse {
  @JsonProperty("results")
  private java.util.List<UserAuthorizationIdWithStatus> results = null;


  /**
   * results.
   *
   * @return UserAuthorizationsDeleteResponse
   **/
  public UserAuthorizationsDeleteResponse results(java.util.List<UserAuthorizationIdWithStatus> results) {
    this.results = results;
    return this;
  }
  
  /**
   * addResultsItem.
   *
   * @return UserAuthorizationsDeleteResponse
   **/
  public UserAuthorizationsDeleteResponse addResultsItem(UserAuthorizationIdWithStatus resultsItem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * .
   * @return results
   **/
  @Schema(description = "")
  public java.util.List<UserAuthorizationIdWithStatus> getResults() {
    return results;
  }

  /**
   * setResults.
   **/
  public void setResults(java.util.List<UserAuthorizationIdWithStatus> results) {
    this.results = results;
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
    UserAuthorizationsDeleteResponse userAuthorizationsDeleteResponse = (UserAuthorizationsDeleteResponse) o;
    return Objects.equals(this.results, userAuthorizationsDeleteResponse.results);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationsDeleteResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

