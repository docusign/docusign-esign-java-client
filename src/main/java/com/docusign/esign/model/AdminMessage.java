package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AdminMessage. */
public class AdminMessage {
  @JsonProperty("baseMessage")
  private String baseMessage = null;

  @JsonProperty("moreInformation")
  private String moreInformation = null;

  /**
   * baseMessage.
   *
   * @return AdminMessage
   */
  public AdminMessage baseMessage(String baseMessage) {
    this.baseMessage = baseMessage;
    return this;
  }

  /**
   * .
   *
   * @return baseMessage
   */
  @ApiModelProperty(value = "")
  public String getBaseMessage() {
    return baseMessage;
  }

  /** setBaseMessage. */
  public void setBaseMessage(String baseMessage) {
    this.baseMessage = baseMessage;
  }

  /**
   * moreInformation.
   *
   * @return AdminMessage
   */
  public AdminMessage moreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
    return this;
  }

  /**
   * .
   *
   * @return moreInformation
   */
  @ApiModelProperty(value = "")
  public String getMoreInformation() {
    return moreInformation;
  }

  /** setMoreInformation. */
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
    return Objects.equals(this.baseMessage, adminMessage.baseMessage)
        && Objects.equals(this.moreInformation, adminMessage.moreInformation);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(baseMessage, moreInformation);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
