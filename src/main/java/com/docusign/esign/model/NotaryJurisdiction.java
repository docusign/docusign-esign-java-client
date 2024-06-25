package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Jurisdiction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A notary jurisdiction..
 *
 */
@Schema(description = "A notary jurisdiction.")

public class NotaryJurisdiction implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * commissionExpiration.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction commissionExpiration(String commissionExpiration) {
    this.commissionExpiration = commissionExpiration;
    return this;
  }

  /**
   * .
   * @return commissionExpiration
   **/
  @Schema(description = "")
  public String getCommissionExpiration() {
    return commissionExpiration;
  }

  /**
   * setCommissionExpiration.
   **/
  public void setCommissionExpiration(String commissionExpiration) {
    this.commissionExpiration = commissionExpiration;
  }


  /**
   * commissionId.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction commissionId(String commissionId) {
    this.commissionId = commissionId;
    return this;
  }

  /**
   * .
   * @return commissionId
   **/
  @Schema(description = "")
  public String getCommissionId() {
    return commissionId;
  }

  /**
   * setCommissionId.
   **/
  public void setCommissionId(String commissionId) {
    this.commissionId = commissionId;
  }


  /**
   * county.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction county(String county) {
    this.county = county;
    return this;
  }

  /**
   * .
   * @return county
   **/
  @Schema(description = "")
  public String getCounty() {
    return county;
  }

  /**
   * setCounty.
   **/
  public void setCounty(String county) {
    this.county = county;
  }


  /**
   * errorDetails.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * jurisdiction.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction jurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Description of the jurisdiction for this notary. This is a read-only property..
   * @return jurisdiction
   **/
  @Schema(description = "Description of the jurisdiction for this notary. This is a read-only property.")
  public Jurisdiction getJurisdiction() {
    return jurisdiction;
  }

  /**
   * setJurisdiction.
   **/
  public void setJurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * registeredName.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction registeredName(String registeredName) {
    this.registeredName = registeredName;
    return this;
  }

  /**
   * .
   * @return registeredName
   **/
  @Schema(description = "")
  public String getRegisteredName() {
    return registeredName;
  }

  /**
   * setRegisteredName.
   **/
  public void setRegisteredName(String registeredName) {
    this.registeredName = registeredName;
  }


  /**
   * sealType.
   *
   * @return NotaryJurisdiction
   **/
  public NotaryJurisdiction sealType(String sealType) {
    this.sealType = sealType;
    return this;
  }

  /**
   * .
   * @return sealType
   **/
  @Schema(description = "")
  public String getSealType() {
    return sealType;
  }

  /**
   * setSealType.
   **/
  public void setSealType(String sealType) {
    this.sealType = sealType;
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
    NotaryJurisdiction notaryJurisdiction = (NotaryJurisdiction) o;
    return Objects.equals(this.commissionExpiration, notaryJurisdiction.commissionExpiration) &&
        Objects.equals(this.commissionId, notaryJurisdiction.commissionId) &&
        Objects.equals(this.county, notaryJurisdiction.county) &&
        Objects.equals(this.errorDetails, notaryJurisdiction.errorDetails) &&
        Objects.equals(this.jurisdiction, notaryJurisdiction.jurisdiction) &&
        Objects.equals(this.registeredName, notaryJurisdiction.registeredName) &&
        Objects.equals(this.sealType, notaryJurisdiction.sealType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(commissionExpiration, commissionId, county, errorDetails, jurisdiction, registeredName, sealType);
  }


  /**
   * Converts the given object to string.
   */
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

