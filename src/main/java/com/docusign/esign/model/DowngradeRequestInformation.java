package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DowngradeRequestInformation. */
public class DowngradeRequestInformation {
  @JsonProperty("downgradeRequestCreation")
  private String downgradeRequestCreation = null;

  @JsonProperty("downgradeRequestProductId")
  private String downgradeRequestProductId = null;

  @JsonProperty("downgradeRequestStatus")
  private String downgradeRequestStatus = null;

  /**
   * downgradeRequestCreation.
   *
   * @return DowngradeRequestInformation
   */
  public DowngradeRequestInformation downgradeRequestCreation(String downgradeRequestCreation) {
    this.downgradeRequestCreation = downgradeRequestCreation;
    return this;
  }

  /**
   * .
   *
   * @return downgradeRequestCreation
   */
  @ApiModelProperty(value = "")
  public String getDowngradeRequestCreation() {
    return downgradeRequestCreation;
  }

  /** setDowngradeRequestCreation. */
  public void setDowngradeRequestCreation(String downgradeRequestCreation) {
    this.downgradeRequestCreation = downgradeRequestCreation;
  }

  /**
   * downgradeRequestProductId.
   *
   * @return DowngradeRequestInformation
   */
  public DowngradeRequestInformation downgradeRequestProductId(String downgradeRequestProductId) {
    this.downgradeRequestProductId = downgradeRequestProductId;
    return this;
  }

  /**
   * .
   *
   * @return downgradeRequestProductId
   */
  @ApiModelProperty(value = "")
  public String getDowngradeRequestProductId() {
    return downgradeRequestProductId;
  }

  /** setDowngradeRequestProductId. */
  public void setDowngradeRequestProductId(String downgradeRequestProductId) {
    this.downgradeRequestProductId = downgradeRequestProductId;
  }

  /**
   * downgradeRequestStatus.
   *
   * @return DowngradeRequestInformation
   */
  public DowngradeRequestInformation downgradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
    return this;
  }

  /**
   * .
   *
   * @return downgradeRequestStatus
   */
  @ApiModelProperty(value = "")
  public String getDowngradeRequestStatus() {
    return downgradeRequestStatus;
  }

  /** setDowngradeRequestStatus. */
  public void setDowngradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
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
    DowngradeRequestInformation downgradeRequestInformation = (DowngradeRequestInformation) o;
    return Objects.equals(
            this.downgradeRequestCreation, downgradeRequestInformation.downgradeRequestCreation)
        && Objects.equals(
            this.downgradeRequestProductId, downgradeRequestInformation.downgradeRequestProductId)
        && Objects.equals(
            this.downgradeRequestStatus, downgradeRequestInformation.downgradeRequestStatus);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        downgradeRequestCreation, downgradeRequestProductId, downgradeRequestStatus);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradeRequestInformation {\n");

    sb.append("    downgradeRequestCreation: ")
        .append(toIndentedString(downgradeRequestCreation))
        .append("\n");
    sb.append("    downgradeRequestProductId: ")
        .append(toIndentedString(downgradeRequestProductId))
        .append("\n");
    sb.append("    downgradeRequestStatus: ")
        .append(toIndentedString(downgradeRequestStatus))
        .append("\n");
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
