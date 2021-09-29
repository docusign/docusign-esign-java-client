package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectUserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IntegratedConnectUserInfoList.
 *
 */

public class IntegratedConnectUserInfoList {
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
  private java.util.List<ConnectUserInfo> users = null;


  /**
   * endPosition.
   *
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * .
   * @return endPosition
   **/
  @ApiModelProperty(value = "")
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
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * .
   * @return nextUri
   **/
  @ApiModelProperty(value = "")
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
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * .
   * @return previousUri
   **/
  @ApiModelProperty(value = "")
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
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * .
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "")
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
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * .
   * @return startPosition
   **/
  @ApiModelProperty(value = "")
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
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * .
   * @return totalSetSize
   **/
  @ApiModelProperty(value = "")
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
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList users(java.util.List<ConnectUserInfo> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return IntegratedConnectUserInfoList
   **/
  public IntegratedConnectUserInfoList addUsersItem(ConnectUserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<ConnectUserInfo>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * .
   * @return users
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ConnectUserInfo> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<ConnectUserInfo> users) {
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
    IntegratedConnectUserInfoList integratedConnectUserInfoList = (IntegratedConnectUserInfoList) o;
    return Objects.equals(this.endPosition, integratedConnectUserInfoList.endPosition) &&
        Objects.equals(this.nextUri, integratedConnectUserInfoList.nextUri) &&
        Objects.equals(this.previousUri, integratedConnectUserInfoList.previousUri) &&
        Objects.equals(this.resultSetSize, integratedConnectUserInfoList.resultSetSize) &&
        Objects.equals(this.startPosition, integratedConnectUserInfoList.startPosition) &&
        Objects.equals(this.totalSetSize, integratedConnectUserInfoList.totalSetSize) &&
        Objects.equals(this.users, integratedConnectUserInfoList.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize, users);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegratedConnectUserInfoList {\n");
    
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

