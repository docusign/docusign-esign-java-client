package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AdminMessage.
 *
 */

public class AdminMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("baseMessage")
  private String baseMessage = null;

  @JsonProperty("moreInformation")
  private String moreInformation = null;


  /**
   * baseMessage.
   *
   * @return AdminMessage
   **/
  public AdminMessage baseMessage(String baseMessage) {
    this.baseMessage = baseMessage;
    return this;
  }

  /**
   * .
   * @return baseMessage
   **/
  @Schema(description = "")
  public String getBaseMessage() {
    return baseMessage;
  }

  /**
   * setBaseMessage.
   **/
  public void setBaseMessage(String baseMessage) {
    this.baseMessage = baseMessage;
  }


  /**
   * moreInformation.
   *
   * @return AdminMessage
   **/
  public AdminMessage moreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
    return this;
  }

  /**
   * .
   * @return moreInformation
   **/
  @Schema(description = "")
  public String getMoreInformation() {
    return moreInformation;
  }

  /**
   * setMoreInformation.
   **/
  public void setMoreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
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
    AdminMessage adminMessage = (AdminMessage) o;
    return Objects.equals(this.baseMessage, adminMessage.baseMessage) &&
        Objects.equals(this.moreInformation, adminMessage.moreInformation);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(baseMessage, moreInformation);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminMessage {\n");
    
    sb.append("    baseMessage: ").append(toIndentedString(baseMessage)).append("\n");
    sb.append("    moreInformation: ").append(toIndentedString(moreInformation)).append("\n");
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

