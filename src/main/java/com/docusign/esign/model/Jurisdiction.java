package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Jurisdiction
 */

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

  public Jurisdiction allowSystemCreatedSeal(String allowSystemCreatedSeal) {
    this.allowSystemCreatedSeal = allowSystemCreatedSeal;
    return this;
  }

   /**
   * 
   * @return allowSystemCreatedSeal
  **/
  @ApiModelProperty(value = "")
  public String getAllowSystemCreatedSeal() {
    return allowSystemCreatedSeal;
  }

  public void setAllowSystemCreatedSeal(String allowSystemCreatedSeal) {
    this.allowSystemCreatedSeal = allowSystemCreatedSeal;
  }

  public Jurisdiction allowUserUploadedSeal(String allowUserUploadedSeal) {
    this.allowUserUploadedSeal = allowUserUploadedSeal;
    return this;
  }

   /**
   * 
   * @return allowUserUploadedSeal
  **/
  @ApiModelProperty(value = "")
  public String getAllowUserUploadedSeal() {
    return allowUserUploadedSeal;
  }

  public void setAllowUserUploadedSeal(String allowUserUploadedSeal) {
    this.allowUserUploadedSeal = allowUserUploadedSeal;
  }

  public Jurisdiction commissionIdInSeal(String commissionIdInSeal) {
    this.commissionIdInSeal = commissionIdInSeal;
    return this;
  }

   /**
   * 
   * @return commissionIdInSeal
  **/
  @ApiModelProperty(value = "")
  public String getCommissionIdInSeal() {
    return commissionIdInSeal;
  }

  public void setCommissionIdInSeal(String commissionIdInSeal) {
    this.commissionIdInSeal = commissionIdInSeal;
  }

  public Jurisdiction county(String county) {
    this.county = county;
    return this;
  }

   /**
   * 
   * @return county
  **/
  @ApiModelProperty(value = "")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Jurisdiction countyInSeal(String countyInSeal) {
    this.countyInSeal = countyInSeal;
    return this;
  }

   /**
   * 
   * @return countyInSeal
  **/
  @ApiModelProperty(value = "")
  public String getCountyInSeal() {
    return countyInSeal;
  }

  public void setCountyInSeal(String countyInSeal) {
    this.countyInSeal = countyInSeal;
  }

  public Jurisdiction enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * 
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public Jurisdiction jurisdictionId(String jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
    return this;
  }

   /**
   * 
   * @return jurisdictionId
  **/
  @ApiModelProperty(value = "")
  public String getJurisdictionId() {
    return jurisdictionId;
  }

  public void setJurisdictionId(String jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
  }

  public Jurisdiction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Jurisdiction notaryPublicInSeal(String notaryPublicInSeal) {
    this.notaryPublicInSeal = notaryPublicInSeal;
    return this;
  }

   /**
   * 
   * @return notaryPublicInSeal
  **/
  @ApiModelProperty(value = "")
  public String getNotaryPublicInSeal() {
    return notaryPublicInSeal;
  }

  public void setNotaryPublicInSeal(String notaryPublicInSeal) {
    this.notaryPublicInSeal = notaryPublicInSeal;
  }

  public Jurisdiction stateNameInSeal(String stateNameInSeal) {
    this.stateNameInSeal = stateNameInSeal;
    return this;
  }

   /**
   * 
   * @return stateNameInSeal
  **/
  @ApiModelProperty(value = "")
  public String getStateNameInSeal() {
    return stateNameInSeal;
  }

  public void setStateNameInSeal(String stateNameInSeal) {
    this.stateNameInSeal = stateNameInSeal;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(allowSystemCreatedSeal, allowUserUploadedSeal, commissionIdInSeal, county, countyInSeal, enabled, jurisdictionId, name, notaryPublicInSeal, stateNameInSeal);
  }


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

