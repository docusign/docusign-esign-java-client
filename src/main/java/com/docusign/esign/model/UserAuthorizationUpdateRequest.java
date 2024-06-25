package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserAuthorizationUpdateRequest.
 *
 */

public class UserAuthorizationUpdateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;


  /**
   * endDate.
   *
   * @return UserAuthorizationUpdateRequest
   **/
  public UserAuthorizationUpdateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * .
   * @return endDate
   **/
  @Schema(description = "")
  public String getEndDate() {
    return endDate;
  }

  /**
   * setEndDate.
   **/
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  /**
   * startDate.
   *
   * @return UserAuthorizationUpdateRequest
   **/
  public UserAuthorizationUpdateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * .
   * @return startDate
   **/
  @Schema(description = "")
  public String getStartDate() {
    return startDate;
  }

  /**
   * setStartDate.
   **/
  public void setStartDate(String startDate) {
    this.startDate = startDate;
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
    UserAuthorizationUpdateRequest userAuthorizationUpdateRequest = (UserAuthorizationUpdateRequest) o;
    return Objects.equals(this.endDate, userAuthorizationUpdateRequest.endDate) &&
        Objects.equals(this.startDate, userAuthorizationUpdateRequest.startDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationUpdateRequest {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

