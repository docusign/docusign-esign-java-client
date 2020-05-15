package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Jurisdiction;
import com.docusign.esign.model.Notary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotaryResult
 */

public class NotaryResult {
  @JsonProperty("jurisdictions")
  private java.util.List<Jurisdiction> jurisdictions = null;

  @JsonProperty("notary")
  private Notary notary = null;

  public NotaryResult jurisdictions(java.util.List<Jurisdiction> jurisdictions) {
    this.jurisdictions = jurisdictions;
    return this;
  }

  public NotaryResult addJurisdictionsItem(Jurisdiction jurisdictionsItem) {
    if (this.jurisdictions == null) {
      this.jurisdictions = new java.util.ArrayList<Jurisdiction>();
    }
    this.jurisdictions.add(jurisdictionsItem);
    return this;
  }

   /**
   * 
   * @return jurisdictions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Jurisdiction> getJurisdictions() {
    return jurisdictions;
  }

  public void setJurisdictions(java.util.List<Jurisdiction> jurisdictions) {
    this.jurisdictions = jurisdictions;
  }

  public NotaryResult notary(Notary notary) {
    this.notary = notary;
    return this;
  }

   /**
   * Get notary
   * @return notary
  **/
  @ApiModelProperty(value = "")
  public Notary getNotary() {
    return notary;
  }

  public void setNotary(Notary notary) {
    this.notary = notary;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(jurisdictions, notary);
  }


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

