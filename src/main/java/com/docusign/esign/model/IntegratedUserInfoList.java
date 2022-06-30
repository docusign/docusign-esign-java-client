package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IntegratedUserInfoList.
 *
 */

public class IntegratedUserInfoList {
  @JsonProperty("allUsersSelected")
  private String allUsersSelected = null;

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
   * allUsersSelected.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList allUsersSelected(String allUsersSelected) {
    this.allUsersSelected = allUsersSelected;
    return this;
  }

  /**
   * .
   * @return allUsersSelected
   **/
  @ApiModelProperty(value = "")
  public String getAllUsersSelected() {
    return allUsersSelected;
  }

  /**
   * setAllUsersSelected.
   **/
  public void setAllUsersSelected(String allUsersSelected) {
    this.allUsersSelected = allUsersSelected;
  }


  /**
   * endPosition.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * nextUri.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. .
   * @return nextUri
   **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * previousUri.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   * @return previousUri
   **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /**
   * setPreviousUri.
   **/
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * resultSetSize.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * totalSetSize.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }


  /**
   * users.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return IntegratedUserInfoList
   **/
  public IntegratedUserInfoList addUsersItem(UserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * .
   * @return users
   **/
  @ApiModelProperty(value = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
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
    IntegratedUserInfoList integratedUserInfoList = (IntegratedUserInfoList) o;
    return Objects.equals(this.allUsersSelected, integratedUserInfoList.allUsersSelected) &&
        Objects.equals(this.endPosition, integratedUserInfoList.endPosition) &&
        Objects.equals(this.nextUri, integratedUserInfoList.nextUri) &&
        Objects.equals(this.previousUri, integratedUserInfoList.previousUri) &&
        Objects.equals(this.resultSetSize, integratedUserInfoList.resultSetSize) &&
        Objects.equals(this.startPosition, integratedUserInfoList.startPosition) &&
        Objects.equals(this.totalSetSize, integratedUserInfoList.totalSetSize) &&
        Objects.equals(this.users, integratedUserInfoList.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allUsersSelected, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize, users);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegratedUserInfoList {\n");
    
    sb.append("    allUsersSelected: ").append(toIndentedString(allUsersSelected)).append("\n");
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

