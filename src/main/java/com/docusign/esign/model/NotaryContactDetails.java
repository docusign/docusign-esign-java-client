package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.JurisdictionSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * NotaryContactDetails.
 *
 */

public class NotaryContactDetails {
  @JsonProperty("hasDocusignCertificate")
  private String hasDocusignCertificate = null;

  @JsonProperty("jurisdictions")
  private java.util.List<JurisdictionSummary> jurisdictions = null;


  /**
   * hasDocusignCertificate.
   *
   * @return NotaryContactDetails
   **/
  public NotaryContactDetails hasDocusignCertificate(String hasDocusignCertificate) {
    this.hasDocusignCertificate = hasDocusignCertificate;
    return this;
  }

  /**
   * .
   * @return hasDocusignCertificate
   **/
  @Schema(description = "")
  public String getHasDocusignCertificate() {
    return hasDocusignCertificate;
  }

  /**
   * setHasDocusignCertificate.
   **/
  public void setHasDocusignCertificate(String hasDocusignCertificate) {
    this.hasDocusignCertificate = hasDocusignCertificate;
  }


  /**
   * jurisdictions.
   *
   * @return NotaryContactDetails
   **/
  public NotaryContactDetails jurisdictions(java.util.List<JurisdictionSummary> jurisdictions) {
    this.jurisdictions = jurisdictions;
    return this;
  }
  
  /**
   * addJurisdictionsItem.
   *
   * @return NotaryContactDetails
   **/
  public NotaryContactDetails addJurisdictionsItem(JurisdictionSummary jurisdictionsItem) {
    if (this.jurisdictions == null) {
      this.jurisdictions = new java.util.ArrayList<>();
    }
    this.jurisdictions.add(jurisdictionsItem);
    return this;
  }

  /**
   * .
   * @return jurisdictions
   **/
  @Schema(description = "")
  public java.util.List<JurisdictionSummary> getJurisdictions() {
    return jurisdictions;
  }

  /**
   * setJurisdictions.
   **/
  public void setJurisdictions(java.util.List<JurisdictionSummary> jurisdictions) {
    this.jurisdictions = jurisdictions;
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
    NotaryContactDetails notaryContactDetails = (NotaryContactDetails) o;
    return Objects.equals(this.hasDocusignCertificate, notaryContactDetails.hasDocusignCertificate) &&
        Objects.equals(this.jurisdictions, notaryContactDetails.jurisdictions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(hasDocusignCertificate, jurisdictions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryContactDetails {\n");
    
    sb.append("    hasDocusignCertificate: ").append(toIndentedString(hasDocusignCertificate)).append("\n");
    sb.append("    jurisdictions: ").append(toIndentedString(jurisdictions)).append("\n");
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

