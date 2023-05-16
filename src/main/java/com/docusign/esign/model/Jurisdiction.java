package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes the jurisdiction of a notary. This is read-only object..
 *
 */
@Schema(description = "Describes the jurisdiction of a notary. This is read-only object.")

public class Jurisdiction {
  @JsonProperty("allowSystemCreatedSeal")
  private String allowSystemCreatedSeal = null;

  @JsonProperty("allowUserUploadedSeal")
  private String allowUserUploadedSeal = null;

  @JsonProperty("commissionIdInSeal")
  private String commissionIdInSeal = null;

  @JsonProperty("county")
  private String county = null;

  @JsonProperty("countyInSeal")
  private String countyInSeal = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("jurisdictionId")
  private String jurisdictionId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notaryPublicInSeal")
  private String notaryPublicInSeal = null;

  @JsonProperty("stateNameInSeal")
  private String stateNameInSeal = null;


  /**
   * allowSystemCreatedSeal.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction allowSystemCreatedSeal(String allowSystemCreatedSeal) {
    this.allowSystemCreatedSeal = allowSystemCreatedSeal;
    return this;
  }

  /**
   * .
   * @return allowSystemCreatedSeal
   **/
  @Schema(description = "")
  public String getAllowSystemCreatedSeal() {
    return allowSystemCreatedSeal;
  }

  /**
   * setAllowSystemCreatedSeal.
   **/
  public void setAllowSystemCreatedSeal(String allowSystemCreatedSeal) {
    this.allowSystemCreatedSeal = allowSystemCreatedSeal;
  }


  /**
   * allowUserUploadedSeal.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction allowUserUploadedSeal(String allowUserUploadedSeal) {
    this.allowUserUploadedSeal = allowUserUploadedSeal;
    return this;
  }

  /**
   * .
   * @return allowUserUploadedSeal
   **/
  @Schema(description = "")
  public String getAllowUserUploadedSeal() {
    return allowUserUploadedSeal;
  }

  /**
   * setAllowUserUploadedSeal.
   **/
  public void setAllowUserUploadedSeal(String allowUserUploadedSeal) {
    this.allowUserUploadedSeal = allowUserUploadedSeal;
  }


  /**
   * commissionIdInSeal.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction commissionIdInSeal(String commissionIdInSeal) {
    this.commissionIdInSeal = commissionIdInSeal;
    return this;
  }

  /**
   * .
   * @return commissionIdInSeal
   **/
  @Schema(description = "")
  public String getCommissionIdInSeal() {
    return commissionIdInSeal;
  }

  /**
   * setCommissionIdInSeal.
   **/
  public void setCommissionIdInSeal(String commissionIdInSeal) {
    this.commissionIdInSeal = commissionIdInSeal;
  }


  /**
   * county.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction county(String county) {
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
   * countyInSeal.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction countyInSeal(String countyInSeal) {
    this.countyInSeal = countyInSeal;
    return this;
  }

  /**
   * .
   * @return countyInSeal
   **/
  @Schema(description = "")
  public String getCountyInSeal() {
    return countyInSeal;
  }

  /**
   * setCountyInSeal.
   **/
  public void setCountyInSeal(String countyInSeal) {
    this.countyInSeal = countyInSeal;
  }


  /**
   * enabled.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * .
   * @return enabled
   **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  /**
   * setEnabled.
   **/
  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }


  /**
   * jurisdictionId.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction jurisdictionId(String jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
    return this;
  }

  /**
   * .
   * @return jurisdictionId
   **/
  @Schema(description = "")
  public String getJurisdictionId() {
    return jurisdictionId;
  }

  /**
   * setJurisdictionId.
   **/
  public void setJurisdictionId(String jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
  }


  /**
   * name.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * notaryPublicInSeal.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction notaryPublicInSeal(String notaryPublicInSeal) {
    this.notaryPublicInSeal = notaryPublicInSeal;
    return this;
  }

  /**
   * .
   * @return notaryPublicInSeal
   **/
  @Schema(description = "")
  public String getNotaryPublicInSeal() {
    return notaryPublicInSeal;
  }

  /**
   * setNotaryPublicInSeal.
   **/
  public void setNotaryPublicInSeal(String notaryPublicInSeal) {
    this.notaryPublicInSeal = notaryPublicInSeal;
  }


  /**
   * stateNameInSeal.
   *
   * @return Jurisdiction
   **/
  public Jurisdiction stateNameInSeal(String stateNameInSeal) {
    this.stateNameInSeal = stateNameInSeal;
    return this;
  }

  /**
   * .
   * @return stateNameInSeal
   **/
  @Schema(description = "")
  public String getStateNameInSeal() {
    return stateNameInSeal;
  }

  /**
   * setStateNameInSeal.
   **/
  public void setStateNameInSeal(String stateNameInSeal) {
    this.stateNameInSeal = stateNameInSeal;
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
    Jurisdiction jurisdiction = (Jurisdiction) o;
    return Objects.equals(this.allowSystemCreatedSeal, jurisdiction.allowSystemCreatedSeal) &&
        Objects.equals(this.allowUserUploadedSeal, jurisdiction.allowUserUploadedSeal) &&
        Objects.equals(this.commissionIdInSeal, jurisdiction.commissionIdInSeal) &&
        Objects.equals(this.county, jurisdiction.county) &&
        Objects.equals(this.countyInSeal, jurisdiction.countyInSeal) &&
        Objects.equals(this.enabled, jurisdiction.enabled) &&
        Objects.equals(this.jurisdictionId, jurisdiction.jurisdictionId) &&
        Objects.equals(this.name, jurisdiction.name) &&
        Objects.equals(this.notaryPublicInSeal, jurisdiction.notaryPublicInSeal) &&
        Objects.equals(this.stateNameInSeal, jurisdiction.stateNameInSeal);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowSystemCreatedSeal, allowUserUploadedSeal, commissionIdInSeal, county, countyInSeal, enabled, jurisdictionId, name, notaryPublicInSeal, stateNameInSeal);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jurisdiction {\n");
    
    sb.append("    allowSystemCreatedSeal: ").append(toIndentedString(allowSystemCreatedSeal)).append("\n");
    sb.append("    allowUserUploadedSeal: ").append(toIndentedString(allowUserUploadedSeal)).append("\n");
    sb.append("    commissionIdInSeal: ").append(toIndentedString(commissionIdInSeal)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    countyInSeal: ").append(toIndentedString(countyInSeal)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    jurisdictionId: ").append(toIndentedString(jurisdictionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notaryPublicInSeal: ").append(toIndentedString(notaryPublicInSeal)).append("\n");
    sb.append("    stateNameInSeal: ").append(toIndentedString(stateNameInSeal)).append("\n");
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

