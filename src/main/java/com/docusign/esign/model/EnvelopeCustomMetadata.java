package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopeCustomMetadata.
 *
 */

public class EnvelopeCustomMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("envelopeCustomMetadataDetails")
  private java.util.List<NameValue> envelopeCustomMetadataDetails = null;


  /**
   * envelopeCustomMetadataDetails.
   *
   * @return EnvelopeCustomMetadata
   **/
  public EnvelopeCustomMetadata envelopeCustomMetadataDetails(java.util.List<NameValue> envelopeCustomMetadataDetails) {
    this.envelopeCustomMetadataDetails = envelopeCustomMetadataDetails;
    return this;
  }
  
  /**
   * addEnvelopeCustomMetadataDetailsItem.
   *
   * @return EnvelopeCustomMetadata
   **/
  public EnvelopeCustomMetadata addEnvelopeCustomMetadataDetailsItem(NameValue envelopeCustomMetadataDetailsItem) {
    if (this.envelopeCustomMetadataDetails == null) {
      this.envelopeCustomMetadataDetails = new java.util.ArrayList<>();
    }
    this.envelopeCustomMetadataDetails.add(envelopeCustomMetadataDetailsItem);
    return this;
  }

  /**
   * .
   * @return envelopeCustomMetadataDetails
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getEnvelopeCustomMetadataDetails() {
    return envelopeCustomMetadataDetails;
  }

  /**
   * setEnvelopeCustomMetadataDetails.
   **/
  public void setEnvelopeCustomMetadataDetails(java.util.List<NameValue> envelopeCustomMetadataDetails) {
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
    return Objects.equals(this.envelopeCustomMetadataDetails, envelopeCustomMetadata.envelopeCustomMetadataDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeCustomMetadataDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeCustomMetadata {\n");
    
    sb.append("    envelopeCustomMetadataDetails: ").append(toIndentedString(envelopeCustomMetadataDetails)).append("\n");
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

