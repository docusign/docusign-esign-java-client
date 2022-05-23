package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeCustomMetadata. */
public class EnvelopeCustomMetadata {
  @JsonProperty("envelopeCustomMetadataDetails")
  private java.util.List<NameValue> envelopeCustomMetadataDetails = null;

  /**
   * envelopeCustomMetadataDetails.
   *
   * @return EnvelopeCustomMetadata
   */
  public EnvelopeCustomMetadata envelopeCustomMetadataDetails(
      java.util.List<NameValue> envelopeCustomMetadataDetails) {
    this.envelopeCustomMetadataDetails = envelopeCustomMetadataDetails;
    return this;
  }

  /**
   * addEnvelopeCustomMetadataDetailsItem.
   *
   * @return EnvelopeCustomMetadata
   */
  public EnvelopeCustomMetadata addEnvelopeCustomMetadataDetailsItem(
      NameValue envelopeCustomMetadataDetailsItem) {
    if (this.envelopeCustomMetadataDetails == null) {
      this.envelopeCustomMetadataDetails = new java.util.ArrayList<>();
    }
    this.envelopeCustomMetadataDetails.add(envelopeCustomMetadataDetailsItem);
    return this;
  }

  /**
   * .
   *
   * @return envelopeCustomMetadataDetails
   */
  @ApiModelProperty(value = "")
  public java.util.List<NameValue> getEnvelopeCustomMetadataDetails() {
    return envelopeCustomMetadataDetails;
  }

  /** setEnvelopeCustomMetadataDetails. */
  public void setEnvelopeCustomMetadataDetails(
      java.util.List<NameValue> envelopeCustomMetadataDetails) {
    this.envelopeCustomMetadataDetails = envelopeCustomMetadataDetails;
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
    EnvelopeCustomMetadata envelopeCustomMetadata = (EnvelopeCustomMetadata) o;
    return Objects.equals(
        this.envelopeCustomMetadataDetails, envelopeCustomMetadata.envelopeCustomMetadataDetails);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeCustomMetadataDetails);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeCustomMetadata {\n");

    sb.append("    envelopeCustomMetadataDetails: ")
        .append(toIndentedString(envelopeCustomMetadataDetails))
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
