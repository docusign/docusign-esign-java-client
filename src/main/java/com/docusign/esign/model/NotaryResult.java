package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Jurisdiction;
import com.docusign.esign.model.Notary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Describes a single notary jurisdiction..
 *
 */
@Schema(description = "Describes a single notary jurisdiction.")

public class NotaryResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("jurisdictions")
  private java.util.List<Jurisdiction> jurisdictions = null;

  @JsonProperty("notary")
  private Notary notary = null;


  /**
   * jurisdictions.
   *
   * @return NotaryResult
   **/
  public NotaryResult jurisdictions(java.util.List<Jurisdiction> jurisdictions) {
    this.jurisdictions = jurisdictions;
    return this;
  }
  
  /**
   * addJurisdictionsItem.
   *
   * @return NotaryResult
   **/
  public NotaryResult addJurisdictionsItem(Jurisdiction jurisdictionsItem) {
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
  public java.util.List<Jurisdiction> getJurisdictions() {
    return jurisdictions;
  }

  /**
   * setJurisdictions.
   **/
  public void setJurisdictions(java.util.List<Jurisdiction> jurisdictions) {
    this.jurisdictions = jurisdictions;
  }


  /**
   * notary.
   *
   * @return NotaryResult
   **/
  public NotaryResult notary(Notary notary) {
    this.notary = notary;
    return this;
  }

  /**
   * .
   * @return notary
   **/
  @Schema(description = "")
  public Notary getNotary() {
    return notary;
  }

  /**
   * setNotary.
   **/
  public void setNotary(Notary notary) {
    this.notary = notary;
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
    NotaryResult notaryResult = (NotaryResult) o;
    return Objects.equals(this.jurisdictions, notaryResult.jurisdictions) &&
        Objects.equals(this.notary, notaryResult.notary);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(jurisdictions, notary);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryResult {\n");
    
    sb.append("    jurisdictions: ").append(toIndentedString(jurisdictions)).append("\n");
    sb.append("    notary: ").append(toIndentedString(notary)).append("\n");
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

