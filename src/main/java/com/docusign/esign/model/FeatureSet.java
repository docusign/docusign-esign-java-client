package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CurrencyFeatureSetPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FeatureSet.
 *
 */

public class FeatureSet {
  @JsonProperty("currencyFeatureSetPrices")
  private java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices = null;

  @JsonProperty("envelopeFee")
  private String envelopeFee = null;

  @JsonProperty("featureSetId")
  private String featureSetId = null;

  @JsonProperty("fixedFee")
  private String fixedFee = null;

  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("isActive")
  private String isActive = null;

  @JsonProperty("isEnabled")
  private String isEnabled = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("seatFee")
  private String seatFee = null;


  /**
   * currencyFeatureSetPrices.
   *
   * @return FeatureSet
   **/
  public FeatureSet currencyFeatureSetPrices(java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices) {
    this.currencyFeatureSetPrices = currencyFeatureSetPrices;
    return this;
  }
  
  /**
   * addCurrencyFeatureSetPricesItem.
   *
   * @return FeatureSet
   **/
  public FeatureSet addCurrencyFeatureSetPricesItem(CurrencyFeatureSetPrice currencyFeatureSetPricesItem) {
    if (this.currencyFeatureSetPrices == null) {
      this.currencyFeatureSetPrices = new java.util.ArrayList<CurrencyFeatureSetPrice>();
    }
    this.currencyFeatureSetPrices.add(currencyFeatureSetPricesItem);
    return this;
  }

  /**
   * A complex type that contains alternate currency values that are configured for this plan feature set..
   * @return currencyFeatureSetPrices
   **/
  @ApiModelProperty(value = "A complex type that contains alternate currency values that are configured for this plan feature set.")
  public java.util.List<CurrencyFeatureSetPrice> getCurrencyFeatureSetPrices() {
    return currencyFeatureSetPrices;
  }

  /**
   * setCurrencyFeatureSetPrices.
   **/
  public void setCurrencyFeatureSetPrices(java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices) {
    this.currencyFeatureSetPrices = currencyFeatureSetPrices;
  }


  /**
   * envelopeFee.
   *
   * @return FeatureSet
   **/
  public FeatureSet envelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
    return this;
  }

  /**
   * .
   * @return envelopeFee
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopeFee() {
    return envelopeFee;
  }

  /**
   * setEnvelopeFee.
   **/
  public void setEnvelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
  }


  /**
   * featureSetId.
   *
   * @return FeatureSet
   **/
  public FeatureSet featureSetId(String featureSetId) {
    this.featureSetId = featureSetId;
    return this;
  }

  /**
   * A unique ID for the feature set..
   * @return featureSetId
   **/
  @ApiModelProperty(value = "A unique ID for the feature set.")
  public String getFeatureSetId() {
    return featureSetId;
  }

  /**
   * setFeatureSetId.
   **/
  public void setFeatureSetId(String featureSetId) {
    this.featureSetId = featureSetId;
  }


  /**
   * fixedFee.
   *
   * @return FeatureSet
   **/
  public FeatureSet fixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
    return this;
  }

  /**
   * .
   * @return fixedFee
   **/
  @ApiModelProperty(value = "")
  public String getFixedFee() {
    return fixedFee;
  }

  /**
   * setFixedFee.
   **/
  public void setFixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
  }


  /**
   * is21CFRPart11.
   *
   * @return FeatureSet
   **/
  public FeatureSet is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

  /**
   * When set to **true**, indicates that this module is enabled on the account..
   * @return is21CFRPart11
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  /**
   * setIs21CFRPart11.
   **/
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }


  /**
   * isActive.
   *
   * @return FeatureSet
   **/
  public FeatureSet isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * .
   * @return isActive
   **/
  @ApiModelProperty(value = "")
  public String getIsActive() {
    return isActive;
  }

  /**
   * setIsActive.
   **/
  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }


  /**
   * isEnabled.
   *
   * @return FeatureSet
   **/
  public FeatureSet isEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Specifies whether the feature set is actively enabled as part of the plan..
   * @return isEnabled
   **/
  @ApiModelProperty(value = "Specifies whether the feature set is actively enabled as part of the plan.")
  public String getIsEnabled() {
    return isEnabled;
  }

  /**
   * setIsEnabled.
   **/
  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }


  /**
   * name.
   *
   * @return FeatureSet
   **/
  public FeatureSet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
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
   * seatFee.
   *
   * @return FeatureSet
   **/
  public FeatureSet seatFee(String seatFee) {
    this.seatFee = seatFee;
    return this;
  }

  /**
   * An incremental seat cost for seat-based plans. Only valid when isEnabled for the feature set is set to true..
   * @return seatFee
   **/
  @ApiModelProperty(value = "An incremental seat cost for seat-based plans. Only valid when isEnabled for the feature set is set to true.")
  public String getSeatFee() {
    return seatFee;
  }

  /**
   * setSeatFee.
   **/
  public void setSeatFee(String seatFee) {
    this.seatFee = seatFee;
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
    FeatureSet featureSet = (FeatureSet) o;
    return Objects.equals(this.currencyFeatureSetPrices, featureSet.currencyFeatureSetPrices) &&
        Objects.equals(this.envelopeFee, featureSet.envelopeFee) &&
        Objects.equals(this.featureSetId, featureSet.featureSetId) &&
        Objects.equals(this.fixedFee, featureSet.fixedFee) &&
        Objects.equals(this.is21CFRPart11, featureSet.is21CFRPart11) &&
        Objects.equals(this.isActive, featureSet.isActive) &&
        Objects.equals(this.isEnabled, featureSet.isEnabled) &&
        Objects.equals(this.name, featureSet.name) &&
        Objects.equals(this.seatFee, featureSet.seatFee);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currencyFeatureSetPrices, envelopeFee, featureSetId, fixedFee, is21CFRPart11, isActive, isEnabled, name, seatFee);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSet {\n");
    
    sb.append("    currencyFeatureSetPrices: ").append(toIndentedString(currencyFeatureSetPrices)).append("\n");
    sb.append("    envelopeFee: ").append(toIndentedString(envelopeFee)).append("\n");
    sb.append("    featureSetId: ").append(toIndentedString(featureSetId)).append("\n");
    sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

