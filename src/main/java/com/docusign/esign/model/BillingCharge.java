package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingDiscount;
import com.docusign.esign.model.BillingPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about a billing charge..
 *
 */
@Schema(description = "Contains information about a billing charge.")

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
  private java.util.List<BillingDiscount> discounts = null;

  @JsonProperty("firstEffectiveDate")
  private String firstEffectiveDate = null;

  @JsonProperty("includedQuantity")
  private String includedQuantity = null;

  @JsonProperty("incrementalQuantity")
  private String incrementalQuantity = null;

  @JsonProperty("lastEffectiveDate")
  private String lastEffectiveDate = null;

  @JsonProperty("prices")
  private java.util.List<BillingPrice> prices = null;

  @JsonProperty("unitPrice")
  private String unitPrice = null;

  @JsonProperty("usedQuantity")
  private String usedQuantity = null;


  /**
   * allowedQuantity.
   *
   * @return BillingCharge
   **/
  public BillingCharge allowedQuantity(String allowedQuantity) {
    this.allowedQuantity = allowedQuantity;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return allowedQuantity
   **/
  @Schema(description = "Reserved: TBD")
  public String getAllowedQuantity() {
    return allowedQuantity;
  }

  /**
   * setAllowedQuantity.
   **/
  public void setAllowedQuantity(String allowedQuantity) {
    this.allowedQuantity = allowedQuantity;
  }


  /**
   * blocked.
   *
   * @return BillingCharge
   **/
  public BillingCharge blocked(String blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return blocked
   **/
  @Schema(description = "Reserved: TBD")
  public String getBlocked() {
    return blocked;
  }

  /**
   * setBlocked.
   **/
  public void setBlocked(String blocked) {
    this.blocked = blocked;
  }


  /**
   * chargeName.
   *
   * @return BillingCharge
   **/
  public BillingCharge chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

  /**
   * Provides information on what services the charge item is for.  The following table provides a description of the different chargeName values available at this time.  | chargeName | Description | | --- | --- | | id_check | IDÂ Check Charge | | in_person_signing | In Person Signing charge | | envelopes Included | Sent Envelopes for the account | | age_verify | Age verification check | | ofac | OFAC Check | | id_confirm | ID confirmation check | | student_authentication | STAN PIN authentication check | | wet_sign_fax | Pages for returning signed documents by fax | | attachment_fax | Pages for returning attachments by fax | | phone_authentication | Phone authentication charge | | powerforms | PowerForm envelopes sent | | signer_payments | Payment processing charge | | outbound_fax | Send by fax charge | | bulk_recipient_envelopes | Bulk Recipient Envelopes sent | | sms_authentications | SMS authentication charge | | saml_authentications | SAML authentication charge | | express_signer_certificate | DocuSign Express Certificate charge | | personal_signer_certificate | Personal Signer Certificate charge | | safe_certificate | SAFE BioPharma Signer Certificate charge | | seats | Included active seats charge | | open_trust_certificate | OpenTrust Signer Certificate charge |.
   * @return chargeName
   **/
  @Schema(description = "Provides information on what services the charge item is for.  The following table provides a description of the different chargeName values available at this time.  | chargeName | Description | | --- | --- | | id_check | IDÂ Check Charge | | in_person_signing | In Person Signing charge | | envelopes Included | Sent Envelopes for the account | | age_verify | Age verification check | | ofac | OFAC Check | | id_confirm | ID confirmation check | | student_authentication | STAN PIN authentication check | | wet_sign_fax | Pages for returning signed documents by fax | | attachment_fax | Pages for returning attachments by fax | | phone_authentication | Phone authentication charge | | powerforms | PowerForm envelopes sent | | signer_payments | Payment processing charge | | outbound_fax | Send by fax charge | | bulk_recipient_envelopes | Bulk Recipient Envelopes sent | | sms_authentications | SMS authentication charge | | saml_authentications | SAML authentication charge | | express_signer_certificate | DocuSign Express Certificate charge | | personal_signer_certificate | Personal Signer Certificate charge | | safe_certificate | SAFE BioPharma Signer Certificate charge | | seats | Included active seats charge | | open_trust_certificate | OpenTrust Signer Certificate charge |")
  public String getChargeName() {
    return chargeName;
  }

  /**
   * setChargeName.
   **/
  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }


  /**
   * chargeType.
   *
   * @return BillingCharge
   **/
  public BillingCharge chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return chargeType
   **/
  @Schema(description = "Reserved: TBD")
  public String getChargeType() {
    return chargeType;
  }

  /**
   * setChargeType.
   **/
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  /**
   * chargeUnitOfMeasure.
   *
   * @return BillingCharge
   **/
  public BillingCharge chargeUnitOfMeasure(String chargeUnitOfMeasure) {
    this.chargeUnitOfMeasure = chargeUnitOfMeasure;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return chargeUnitOfMeasure
   **/
  @Schema(description = "Reserved: TBD")
  public String getChargeUnitOfMeasure() {
    return chargeUnitOfMeasure;
  }

  /**
   * setChargeUnitOfMeasure.
   **/
  public void setChargeUnitOfMeasure(String chargeUnitOfMeasure) {
    this.chargeUnitOfMeasure = chargeUnitOfMeasure;
  }


  /**
   * discounts.
   *
   * @return BillingCharge
   **/
  public BillingCharge discounts(java.util.List<BillingDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }
  
  /**
   * addDiscountsItem.
   *
   * @return BillingCharge
   **/
  public BillingCharge addDiscountsItem(BillingDiscount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new java.util.ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * .
   * @return discounts
   **/
  @Schema(description = "")
  public java.util.List<BillingDiscount> getDiscounts() {
    return discounts;
  }

  /**
   * setDiscounts.
   **/
  public void setDiscounts(java.util.List<BillingDiscount> discounts) {
    this.discounts = discounts;
  }


  /**
   * firstEffectiveDate.
   *
   * @return BillingCharge
   **/
  public BillingCharge firstEffectiveDate(String firstEffectiveDate) {
    this.firstEffectiveDate = firstEffectiveDate;
    return this;
  }

  /**
   * .
   * @return firstEffectiveDate
   **/
  @Schema(description = "")
  public String getFirstEffectiveDate() {
    return firstEffectiveDate;
  }

  /**
   * setFirstEffectiveDate.
   **/
  public void setFirstEffectiveDate(String firstEffectiveDate) {
    this.firstEffectiveDate = firstEffectiveDate;
  }


  /**
   * includedQuantity.
   *
   * @return BillingCharge
   **/
  public BillingCharge includedQuantity(String includedQuantity) {
    this.includedQuantity = includedQuantity;
    return this;
  }

  /**
   * .
   * @return includedQuantity
   **/
  @Schema(description = "")
  public String getIncludedQuantity() {
    return includedQuantity;
  }

  /**
   * setIncludedQuantity.
   **/
  public void setIncludedQuantity(String includedQuantity) {
    this.includedQuantity = includedQuantity;
  }


  /**
   * incrementalQuantity.
   *
   * @return BillingCharge
   **/
  public BillingCharge incrementalQuantity(String incrementalQuantity) {
    this.incrementalQuantity = incrementalQuantity;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return incrementalQuantity
   **/
  @Schema(description = "Reserved: TBD")
  public String getIncrementalQuantity() {
    return incrementalQuantity;
  }

  /**
   * setIncrementalQuantity.
   **/
  public void setIncrementalQuantity(String incrementalQuantity) {
    this.incrementalQuantity = incrementalQuantity;
  }


  /**
   * lastEffectiveDate.
   *
   * @return BillingCharge
   **/
  public BillingCharge lastEffectiveDate(String lastEffectiveDate) {
    this.lastEffectiveDate = lastEffectiveDate;
    return this;
  }

  /**
   * .
   * @return lastEffectiveDate
   **/
  @Schema(description = "")
  public String getLastEffectiveDate() {
    return lastEffectiveDate;
  }

  /**
   * setLastEffectiveDate.
   **/
  public void setLastEffectiveDate(String lastEffectiveDate) {
    this.lastEffectiveDate = lastEffectiveDate;
  }


  /**
   * prices.
   *
   * @return BillingCharge
   **/
  public BillingCharge prices(java.util.List<BillingPrice> prices) {
    this.prices = prices;
    return this;
  }
  
  /**
   * addPricesItem.
   *
   * @return BillingCharge
   **/
  public BillingCharge addPricesItem(BillingPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new java.util.ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * .
   * @return prices
   **/
  @Schema(description = "")
  public java.util.List<BillingPrice> getPrices() {
    return prices;
  }

  /**
   * setPrices.
   **/
  public void setPrices(java.util.List<BillingPrice> prices) {
    this.prices = prices;
  }


  /**
   * unitPrice.
   *
   * @return BillingCharge
   **/
  public BillingCharge unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return unitPrice
   **/
  @Schema(description = "Reserved: TBD")
  public String getUnitPrice() {
    return unitPrice;
  }

  /**
   * setUnitPrice.
   **/
  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  /**
   * usedQuantity.
   *
   * @return BillingCharge
   **/
  public BillingCharge usedQuantity(String usedQuantity) {
    this.usedQuantity = usedQuantity;
    return this;
  }

  /**
   * .
   * @return usedQuantity
   **/
  @Schema(description = "")
  public String getUsedQuantity() {
    return usedQuantity;
  }

  /**
   * setUsedQuantity.
   **/
  public void setUsedQuantity(String usedQuantity) {
    this.usedQuantity = usedQuantity;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowedQuantity, blocked, chargeName, chargeType, chargeUnitOfMeasure, discounts, firstEffectiveDate, includedQuantity, incrementalQuantity, lastEffectiveDate, prices, unitPrice, usedQuantity);
  }


  /**
   * Converts the given object to string.
   */
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

