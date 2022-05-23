package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UserSharedItem. */
public class UserSharedItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("user")
  private UserInfo user = null;

  /**
   * errorDetails.
   *
   * @return UserSharedItem
   */
  public UserSharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * shared.
   *
   * @return UserSharedItem
   */
  public UserSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   *
   * @return shared
   */
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /** setShared. */
  public void setShared(String shared) {
    this.shared = shared;
  }

  /**
   * user.
   *
   * @return UserSharedItem
   */
  public UserSharedItem user(UserInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Get user.
   *
   * @return user
   */
  @ApiModelProperty(value = "")
  public UserInfo getUser() {
    return user;
  }

  /** setUser. */
  public void setUser(UserInfo user) {
    this.user = user;
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
    UserSharedItem userSharedItem = (UserSharedItem) o;
    return Objects.equals(this.errorDetails, userSharedItem.errorDetails)
        && Objects.equals(this.shared, userSharedItem.shared)
        && Objects.equals(this.user, userSharedItem.user);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, shared, user);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSharedItem {\n");

    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
