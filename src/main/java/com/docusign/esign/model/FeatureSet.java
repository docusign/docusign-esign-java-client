package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CurrencyFeatureSetPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class FeatureSet   {
  
  private java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices = new java.util.ArrayList<CurrencyFeatureSetPrice>();
  private String envelopeFee = null;
  private String featureSetId = null;
  private String fixedFee = null;
  private String is21CFRPart11 = null;
  private String isActive = null;
  private String isEnabled = null;
  private String name = null;
  private String seatFee = null;

  
  /**
   * A complex type that contains alternate currency values that are configured for this plan feature set.
   **/
  
  @ApiModelProperty(value = "A complex type that contains alternate currency values that are configured for this plan feature set.")
  @JsonProperty("currencyFeatureSetPrices")
  public java.util.List<CurrencyFeatureSetPrice> getCurrencyFeatureSetPrices() {
    return currencyFeatureSetPrices;
  }
  public void setCurrencyFeatureSetPrices(java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices) {
    this.currencyFeatureSetPrices = currencyFeatureSetPrices;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeFee")
  public String getEnvelopeFee() {
    return envelopeFee;
  }
  public void setEnvelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
  }

  
  /**
   * A unique ID for the feature set.
   **/
  
  @ApiModelProperty(value = "A unique ID for the feature set.")
  @JsonProperty("featureSetId")
  public String getFeatureSetId() {
    return featureSetId;
  }
  public void setFeatureSetId(String featureSetId) {
    this.featureSetId = featureSetId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fixedFee")
  public String getFixedFee() {
    return fixedFee;
  }
  public void setFixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
  }

  
  /**
   * When set to **true**, indicates that this module is enabled on the account.
   **/
  
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  @JsonProperty("is21CFRPart11")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isActive")
  public String getIsActive() {
    return isActive;
  }
  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  
  /**
   * Specifies whether the feature set is actively enabled as part of the plan.
   **/
  
  @ApiModelProperty(value = "Specifies whether the feature set is actively enabled as part of the plan.")
  @JsonProperty("isEnabled")
  public String getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * An incremental seat cost for seat-based plans. Only valid when isEnabled for the feature set is set to true.
   **/
  
  @ApiModelProperty(value = "An incremental seat cost for seat-based plans. Only valid when isEnabled for the feature set is set to true.")
  @JsonProperty("seatFee")
  public String getSeatFee() {
    return seatFee;
  }
  public void setSeatFee(String seatFee) {
    this.seatFee = seatFee;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSet featureSet = (FeatureSet) o;

    return true && Objects.equals(currencyFeatureSetPrices, featureSet.currencyFeatureSetPrices) &&
        Objects.equals(envelopeFee, featureSet.envelopeFee) &&
        Objects.equals(featureSetId, featureSet.featureSetId) &&
        Objects.equals(fixedFee, featureSet.fixedFee) &&
        Objects.equals(is21CFRPart11, featureSet.is21CFRPart11) &&
        Objects.equals(isActive, featureSet.isActive) &&
        Objects.equals(isEnabled, featureSet.isEnabled) &&
        Objects.equals(name, featureSet.name) &&
        Objects.equals(seatFee, featureSet.seatFee)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyFeatureSetPrices, envelopeFee, featureSetId, fixedFee, is21CFRPart11, isActive, isEnabled, name, seatFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSet {\n");
    
    if (currencyFeatureSetPrices != null)
      sb.append("    currencyFeatureSetPrices: ").append(toIndentedString(currencyFeatureSetPrices)).append("\n");
    if (envelopeFee != null)
      sb.append("    envelopeFee: ").append(toIndentedString(envelopeFee)).append("\n");
    if (featureSetId != null)
      sb.append("    featureSetId: ").append(toIndentedString(featureSetId)).append("\n");
    if (fixedFee != null)
      sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
    if (is21CFRPart11 != null)
      sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    if (isActive != null)
      sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    if (isEnabled != null)
      sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (seatFee != null)
      sb.append("    seatFee: ").append(toIndentedString(seatFee)).append("\n");
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

