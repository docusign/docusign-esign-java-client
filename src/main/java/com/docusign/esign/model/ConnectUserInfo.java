package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConnectUserInfo. */
public class ConnectUserInfo {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("isIncluded")
  private String isIncluded = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  /**
   * email.
   *
   * @return ConnectUserInfo
   */
  public ConnectUserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   *
   * @return email
   */
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  /** setEmail. */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * isIncluded.
   *
   * @return ConnectUserInfo
   */
  public ConnectUserInfo isIncluded(String isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

  /**
   * .
   *
   * @return isIncluded
   */
  @ApiModelProperty(value = "")
  public String getIsIncluded() {
    return isIncluded;
  }

  /** setIsIncluded. */
  public void setIsIncluded(String isIncluded) {
    this.isIncluded = isIncluded;
  }

  /**
   * userId.
   *
   * @return ConnectUserInfo
   */
  public ConnectUserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   *
   * @return userId
   */
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  /** setUserId. */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * userName.
   *
   * @return ConnectUserInfo
   */
  public ConnectUserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * .
   *
   * @return userName
   */
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  /** setUserName. */
  public void setUserName(String userName) {
    this.userName = userName;
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
    ConnectUserInfo connectUserInfo = (ConnectUserInfo) o;
    return Objects.equals(this.email, connectUserInfo.email)
        && Objects.equals(this.isIncluded, connectUserInfo.isIncluded)
        && Objects.equals(this.userId, connectUserInfo.userId)
        && Objects.equals(this.userName, connectUserInfo.userName);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(email, isIncluded, userId, userName);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectUserInfo {\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
