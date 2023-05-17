package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserAuthorizationWithStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserAuthorizationsResponse.
 *
 */

public class UserAuthorizationsResponse {
  @JsonProperty("results")
  private java.util.List<UserAuthorizationWithStatus> results = null;


  /**
   * results.
   *
   * @return UserAuthorizationsResponse
   **/
  public UserAuthorizationsResponse results(java.util.List<UserAuthorizationWithStatus> results) {
    this.results = results;
    return this;
  }
  
  /**
   * addResultsItem.
   *
   * @return UserAuthorizationsResponse
   **/
  public UserAuthorizationsResponse addResultsItem(UserAuthorizationWithStatus resultsItem) {
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
  public java.util.List<UserAuthorizationWithStatus> getResults() {
    return results;
  }

  /**
   * setResults.
   **/
  public void setResults(java.util.List<UserAuthorizationWithStatus> results) {
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
    UserAuthorizationsResponse userAuthorizationsResponse = (UserAuthorizationsResponse) o;
    return Objects.equals(this.results, userAuthorizationsResponse.results);
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
    sb.append("class UserAuthorizationsResponse {\n");
    
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

