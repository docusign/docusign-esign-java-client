package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UsersResponse. */
public class UsersResponse {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  @JsonProperty("users")
  private java.util.List<UserInfo> users = null;

  /**
   * endPosition.
   *
   * @return UsersResponse
   */
  public UsersResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   *
   * @return endPosition
   */
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /** setEndPosition. */
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  /**
   * nextUri.
   *
   * @return UsersResponse
   */
  public UsersResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the
   * entire results of the search, this is null. .
   *
   * @return nextUri
   */
  @ApiModelProperty(
      value =
          "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /** setNextUri. */
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  /**
   * previousUri.
   *
   * @return UsersResponse
   */
  public UsersResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   *
   * @return previousUri
   */
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /** setPreviousUri. */
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  /**
   * resultSetSize.
   *
   * @return UsersResponse
   */
  public UsersResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   *
   * @return resultSetSize
   */
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /** setResultSetSize. */
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  /**
   * startPosition.
   *
   * @return UsersResponse
   */
  public UsersResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   *
   * @return startPosition
   */
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /** setStartPosition. */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * totalSetSize.
   *
   * @return UsersResponse
   */
  public UsersResponse totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or
   * equal to the value of the property returning the results in the in the response..
   *
   * @return totalSetSize
   */
  @ApiModelProperty(
      value =
          "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /** setTotalSetSize. */
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  /**
   * users.
   *
   * @return UsersResponse
   */
  public UsersResponse users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }

  /**
   * addUsersItem.
   *
   * @return UsersResponse
   */
  public UsersResponse addUsersItem(UserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * .
   *
   * @return users
   */
  @ApiModelProperty(value = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  /** setUsers. */
  public void setUsers(java.util.List<UserInfo> users) {
    this.users = users;
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
    UsersResponse usersResponse = (UsersResponse) o;
    return Objects.equals(this.endPosition, usersResponse.endPosition)
        && Objects.equals(this.nextUri, usersResponse.nextUri)
        && Objects.equals(this.previousUri, usersResponse.previousUri)
        && Objects.equals(this.resultSetSize, usersResponse.resultSetSize)
        && Objects.equals(this.startPosition, usersResponse.startPosition)
        && Objects.equals(this.totalSetSize, usersResponse.totalSetSize)
        && Objects.equals(this.users, usersResponse.users);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize, users);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");

    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
