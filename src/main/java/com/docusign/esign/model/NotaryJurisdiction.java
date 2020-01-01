package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Jurisdiction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotaryJurisdiction
 */

public class NotaryJurisdiction {
  @JsonProperty("commissionExpiration")
  private String commissionExpiration = null;

  @JsonProperty("commissionId")
  private String commissionId = null;

  @JsonProperty("county")
  private String county = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("jurisdiction")
  private Jurisdiction jurisdiction = null;

  @JsonProperty("registeredName")
  private String registeredName = null;

  @JsonProperty("sealType")
  private String sealType = null;

  public NotaryJurisdiction commissionExpiration(String commissionExpiration) {
    this.commissionExpiration = commissionExpiration;
    return this;
  }

   /**
   * 
   * @return commissionExpiration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommissionExpiration() {
    return commissionExpiration;
  }

  public void setCommissionExpiration(String commissionExpiration) {
    this.commissionExpiration = commissionExpiration;
  }

  public NotaryJurisdiction commissionId(String commissionId) {
    this.commissionId = commissionId;
    return this;
  }

   /**
   * 
   * @return commissionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommissionId() {
    return commissionId;
  }

  public void setCommissionId(String commissionId) {
    this.commissionId = commissionId;
  }

  public NotaryJurisdiction county(String county) {
    this.county = county;
    return this;
  }

   /**
   * 
   * @return county
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public NotaryJurisdiction errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public NotaryJurisdiction jurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(example = "null", value = "")
  public Jurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public NotaryJurisdiction registeredName(String registeredName) {
    this.registeredName = registeredName;
    return this;
  }

   /**
   * 
   * @return registeredName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRegisteredName() {
    return registeredName;
  }

  public void setRegisteredName(String registeredName) {
    this.registeredName = registeredName;
  }

  public NotaryJurisdiction sealType(String sealType) {
    this.sealType = sealType;
    return this;
  }

   /**
   * 
   * @return sealType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSealType() {
    return sealType;
  }

  public void setSealType(String sealType) {
    this.sealType = sealType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotaryJurisdiction notaryJurisdiction = (NotaryJurisdiction) o;
    return Objects.equals(this.commissionExpiration, notaryJurisdiction.commissionExpiration) &&
        Objects.equals(this.commissionId, notaryJurisdiction.commissionId) &&
        Objects.equals(this.county, notaryJurisdiction.county) &&
        Objects.equals(this.errorDetails, notaryJurisdiction.errorDetails) &&
        Objects.equals(this.jurisdiction, notaryJurisdiction.jurisdiction) &&
        Objects.equals(this.registeredName, notaryJurisdiction.registeredName) &&
        Objects.equals(this.sealType, notaryJurisdiction.sealType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionExpiration, commissionId, county, errorDetails, jurisdiction, registeredName, sealType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryJurisdiction {\n");
    
    sb.append("    commissionExpiration: ").append(toIndentedString(commissionExpiration)).append("\n");
    sb.append("    commissionId: ").append(toIndentedString(commissionId)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    registeredName: ").append(toIndentedString(registeredName)).append("\n");
    sb.append("    sealType: ").append(toIndentedString(sealType)).append("\n");
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

