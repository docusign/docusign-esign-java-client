package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingDiscount;
import com.docusign.esign.model.BillingPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about a billing charge.
 */
@ApiModel(description = "Contains information about a billing charge.")

public class BillingCharge {
  @JsonProperty("allowedQuantity")
  private String allowedQuantity = null;

  @JsonProperty("blocked")
  private String blocked = null;

  @JsonProperty("chargeName")
  private String chargeName = null;

  @JsonProperty("chargeType")
  private String chargeType = null;

  @JsonProperty("chargeUnitOfMeasure")
  private String chargeUnitOfMeasure = null;

  @JsonProperty("discounts")
  private java.util.List<BillingDiscount> discounts = new java.util.ArrayList<BillingDiscount>();

  @JsonProperty("firstEffectiveDate")
  private String firstEffectiveDate = null;

  @JsonProperty("includedQuantity")
  private String includedQuantity = null;

  @JsonProperty("incrementalQuantity")
  private String incrementalQuantity = null;

  @JsonProperty("lastEffectiveDate")
  private String lastEffectiveDate = null;

  @JsonProperty("prices")
  private java.util.List<BillingPrice> prices = new java.util.ArrayList<BillingPrice>();

  @JsonProperty("unitPrice")
  private String unitPrice = null;

  @JsonProperty("usedQuantity")
  private String usedQuantity = null;

  public BillingCharge allowedQuantity(String allowedQuantity) {
    this.allowedQuantity = allowedQuantity;
    return this;
  }

   /**
   * Reserved: TBD
   * @return allowedQuantity
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getAllowedQuantity() {
    return allowedQuantity;
  }

  public void setAllowedQuantity(String allowedQuantity) {
    this.allowedQuantity = allowedQuantity;
  }

  public BillingCharge blocked(String blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Reserved: TBD
   * @return blocked
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBlocked() {
    return blocked;
  }

  public void setBlocked(String blocked) {
    this.blocked = blocked;
  }

  public BillingCharge chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

   /**
   * Provides information on what services the charge item is for.  The following table provides a description of the different chargeName values available at this time.  | chargeName | Description | | --- | --- | | id_check | IDÂ Check Charge | | in_person_signing | In Person Signing charge | | envelopes Included | Sent Envelopes for the account | | age_verify | Age verification check | | ofac | OFAC Check | | id_confirm | ID confirmation check | | student_authentication | STAN PIN authentication check | | wet_sign_fax | Pages for returning signed documents by fax | | attachment_fax | Pages for returning attachments by fax | | phone_authentication | Phone authentication charge | | powerforms | PowerForm envelopes sent | | signer_payments | Payment processing charge | | outbound_fax | Send by fax charge | | bulk_recipient_envelopes | Bulk Recipient Envelopes sent | | sms_authentications | SMS authentication charge | | saml_authentications | SAML authentication charge | | express_signer_certificate | DocuSign Express Certificate charge | | personal_signer_certificate | Personal Signer Certificate charge | | safe_certificate | SAFE BioPharma Signer Certificate charge | | seats | Included active seats charge | | open_trust_certificate | OpenTrust Signer Certificate charge |
   * @return chargeName
  **/
  @ApiModelProperty(example = "null", value = "Provides information on what services the charge item is for.  The following table provides a description of the different chargeName values available at this time.  | chargeName | Description | | --- | --- | | id_check | IDÂ Check Charge | | in_person_signing | In Person Signing charge | | envelopes Included | Sent Envelopes for the account | | age_verify | Age verification check | | ofac | OFAC Check | | id_confirm | ID confirmation check | | student_authentication | STAN PIN authentication check | | wet_sign_fax | Pages for returning signed documents by fax | | attachment_fax | Pages for returning attachments by fax | | phone_authentication | Phone authentication charge | | powerforms | PowerForm envelopes sent | | signer_payments | Payment processing charge | | outbound_fax | Send by fax charge | | bulk_recipient_envelopes | Bulk Recipient Envelopes sent | | sms_authentications | SMS authentication charge | | saml_authentications | SAML authentication charge | | express_signer_certificate | DocuSign Express Certificate charge | | personal_signer_certificate | Personal Signer Certificate charge | | safe_certificate | SAFE BioPharma Signer Certificate charge | | seats | Included active seats charge | | open_trust_certificate | OpenTrust Signer Certificate charge |")
  public String getChargeName() {
    return chargeName;
  }

  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  public BillingCharge chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Reserved: TBD
   * @return chargeType
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public BillingCharge chargeUnitOfMeasure(String chargeUnitOfMeasure) {
    this.chargeUnitOfMeasure = chargeUnitOfMeasure;
    return this;
  }

   /**
   * Reserved: TBD
   * @return chargeUnitOfMeasure
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getChargeUnitOfMeasure() {
    return chargeUnitOfMeasure;
  }

  public void setChargeUnitOfMeasure(String chargeUnitOfMeasure) {
    this.chargeUnitOfMeasure = chargeUnitOfMeasure;
  }

  public BillingCharge discounts(java.util.List<BillingDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public BillingCharge addDiscountsItem(BillingDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * 
   * @return discounts
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<BillingDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(java.util.List<BillingDiscount> discounts) {
    this.discounts = discounts;
  }

  public BillingCharge firstEffectiveDate(String firstEffectiveDate) {
    this.firstEffectiveDate = firstEffectiveDate;
    return this;
  }

   /**
   * 
   * @return firstEffectiveDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstEffectiveDate() {
    return firstEffectiveDate;
  }

  public void setFirstEffectiveDate(String firstEffectiveDate) {
    this.firstEffectiveDate = firstEffectiveDate;
  }

  public BillingCharge includedQuantity(String includedQuantity) {
    this.includedQuantity = includedQuantity;
    return this;
  }

   /**
   * 
   * @return includedQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncludedQuantity() {
    return includedQuantity;
  }

  public void setIncludedQuantity(String includedQuantity) {
    this.includedQuantity = includedQuantity;
  }

  public BillingCharge incrementalQuantity(String incrementalQuantity) {
    this.incrementalQuantity = incrementalQuantity;
    return this;
  }

   /**
   * Reserved: TBD
   * @return incrementalQuantity
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getIncrementalQuantity() {
    return incrementalQuantity;
  }

  public void setIncrementalQuantity(String incrementalQuantity) {
    this.incrementalQuantity = incrementalQuantity;
  }

  public BillingCharge lastEffectiveDate(String lastEffectiveDate) {
    this.lastEffectiveDate = lastEffectiveDate;
    return this;
  }

   /**
   * 
   * @return lastEffectiveDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastEffectiveDate() {
    return lastEffectiveDate;
  }

  public void setLastEffectiveDate(String lastEffectiveDate) {
    this.lastEffectiveDate = lastEffectiveDate;
  }

  public BillingCharge prices(java.util.List<BillingPrice> prices) {
    this.prices = prices;
    return this;
  }

  public BillingCharge addPricesItem(BillingPrice pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * 
   * @return prices
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<BillingPrice> getPrices() {
    return prices;
  }

  public void setPrices(java.util.List<BillingPrice> prices) {
    this.prices = prices;
  }

  public BillingCharge unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Reserved: TBD
   * @return unitPrice
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public BillingCharge usedQuantity(String usedQuantity) {
    this.usedQuantity = usedQuantity;
    return this;
  }

   /**
   * 
   * @return usedQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUsedQuantity() {
    return usedQuantity;
  }

  public void setUsedQuantity(String usedQuantity) {
    this.usedQuantity = usedQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCharge billingCharge = (BillingCharge) o;
    return Objects.equals(this.allowedQuantity, billingCharge.allowedQuantity) &&
        Objects.equals(this.blocked, billingCharge.blocked) &&
        Objects.equals(this.chargeName, billingCharge.chargeName) &&
        Objects.equals(this.chargeType, billingCharge.chargeType) &&
        Objects.equals(this.chargeUnitOfMeasure, billingCharge.chargeUnitOfMeasure) &&
        Objects.equals(this.discounts, billingCharge.discounts) &&
        Objects.equals(this.firstEffectiveDate, billingCharge.firstEffectiveDate) &&
        Objects.equals(this.includedQuantity, billingCharge.includedQuantity) &&
        Objects.equals(this.incrementalQuantity, billingCharge.incrementalQuantity) &&
        Objects.equals(this.lastEffectiveDate, billingCharge.lastEffectiveDate) &&
        Objects.equals(this.prices, billingCharge.prices) &&
        Objects.equals(this.unitPrice, billingCharge.unitPrice) &&
        Objects.equals(this.usedQuantity, billingCharge.usedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedQuantity, blocked, chargeName, chargeType, chargeUnitOfMeasure, discounts, firstEffectiveDate, includedQuantity, incrementalQuantity, lastEffectiveDate, prices, unitPrice, usedQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCharge {\n");
    
    sb.append("    allowedQuantity: ").append(toIndentedString(allowedQuantity)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    chargeUnitOfMeasure: ").append(toIndentedString(chargeUnitOfMeasure)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    firstEffectiveDate: ").append(toIndentedString(firstEffectiveDate)).append("\n");
    sb.append("    includedQuantity: ").append(toIndentedString(includedQuantity)).append("\n");
    sb.append("    incrementalQuantity: ").append(toIndentedString(incrementalQuantity)).append("\n");
    sb.append("    lastEffectiveDate: ").append(toIndentedString(lastEffectiveDate)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    usedQuantity: ").append(toIndentedString(usedQuantity)).append("\n");
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

