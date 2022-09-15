package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about the shared item..
 *
 */
@ApiModel(description = "Information about the shared item.")

public class SharedItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("user")
  private UserInfo user = null;


  /**
   * errorDetails.
   *
   * @return SharedItem
   **/
  public SharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and ignored in requests..
   * @return errorDetails
   **/
  @ApiModelProperty(value = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * shared.
   *
   * @return SharedItem
   **/
  public SharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * @return shared
   **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /**
   * setShared.
   **/
  public void setShared(String shared) {
    this.shared = shared;
  }


  /**
   * user.
   *
   * @return SharedItem
   **/
  public SharedItem user(UserInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Information about the user who owns the shared item..
   * @return user
   **/
  @ApiModelProperty(value = "Information about the user who owns the shared item.")
  public UserInfo getUser() {
    return user;
  }

  /**
   * setUser.
   **/
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
    SharedItem sharedItem = (SharedItem) o;
    return Objects.equals(this.errorDetails, sharedItem.errorDetails) &&
        Objects.equals(this.shared, sharedItem.shared) &&
        Objects.equals(this.user, sharedItem.user);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, shared, user);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedItem {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

