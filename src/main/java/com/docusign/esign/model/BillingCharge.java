package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingDiscount;
import com.docusign.esign.model.BillingPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about a billing charge.
 **/

@ApiModel(description = "Contains information about a billing charge.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingCharge   {
  
  private String allowedQuantity = null;
  private String blocked = null;
  private String chargeName = null;
  private String chargeType = null;
  private String chargeUnitOfMeasure = null;
  private java.util.List<BillingDiscount> discounts = new java.util.ArrayList<BillingDiscount>();
  private String firstEffectiveDate = null;
  private String includedQuantity = null;
  private String incrementalQuantity = null;
  private String lastEffectiveDate = null;
  private java.util.List<BillingPrice> prices = new java.util.ArrayList<BillingPrice>();
  private String unitPrice = null;
  private String usedQuantity = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("allowedQuantity")
  public String getAllowedQuantity() {
    return allowedQuantity;
  }
  public void setAllowedQuantity(String allowedQuantity) {
    this.allowedQuantity = allowedQuantity;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("blocked")
  public String getBlocked() {
    return blocked;
  }
  public void setBlocked(String blocked) {
    this.blocked = blocked;
  }

  
  /**
   * Provides information on what services the charge item is for.\n\nThe following table provides a description of the different chargeName values available at this time.\n\n| chargeName | Description |\n| --- | --- |\n| id_check | ID Check Charge |\n| in_person_signing | In Person Signing charge |\n| envelopes Included | Sent Envelopes for the account |\n| age_verify | Age verification check |\n| ofac | OFAC Check |\n| id_confirm | ID confirmation check |\n| student_authentication | STAN PIN authentication check |\n| wet_sign_fax | Pages for returning signed documents by fax |\n| attachment_fax | Pages for returning attachments by fax |\n| phone_authentication | Phone authentication charge |\n| powerforms | PowerForm envelopes sent |\n| signer_payments | Payment processing charge |\n| outbound_fax | Send by fax charge |\n| bulk_recipient_envelopes | Bulk Recipient Envelopes sent |\n| sms_authentications | SMS authentication charge |\n| saml_authentications | SAML authentication charge |\n| express_signer_certificate | DocuSign Express Certificate charge |\n| personal_signer_certificate | Personal Signer Certificate charge |\n| safe_certificate | SAFE BioPharma Signer Certificate charge |\n| seats | Included active seats charge |\n| open_trust_certificate | OpenTrust Signer Certificate charge |
   **/
  
  @ApiModelProperty(value = "Provides information on what services the charge item is for.\n\nThe following table provides a description of the different chargeName values available at this time.\n\n| chargeName | Description |\n| --- | --- |\n| id_check | ID Check Charge |\n| in_person_signing | In Person Signing charge |\n| envelopes Included | Sent Envelopes for the account |\n| age_verify | Age verification check |\n| ofac | OFAC Check |\n| id_confirm | ID confirmation check |\n| student_authentication | STAN PIN authentication check |\n| wet_sign_fax | Pages for returning signed documents by fax |\n| attachment_fax | Pages for returning attachments by fax |\n| phone_authentication | Phone authentication charge |\n| powerforms | PowerForm envelopes sent |\n| signer_payments | Payment processing charge |\n| outbound_fax | Send by fax charge |\n| bulk_recipient_envelopes | Bulk Recipient Envelopes sent |\n| sms_authentications | SMS authentication charge |\n| saml_authentications | SAML authentication charge |\n| express_signer_certificate | DocuSign Express Certificate charge |\n| personal_signer_certificate | Personal Signer Certificate charge |\n| safe_certificate | SAFE BioPharma Signer Certificate charge |\n| seats | Included active seats charge |\n| open_trust_certificate | OpenTrust Signer Certificate charge |")
  @JsonProperty("chargeName")
  public String getChargeName() {
    return chargeName;
  }
  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("chargeType")
  public String getChargeType() {
    return chargeType;
  }
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("chargeUnitOfMeasure")
  public String getChargeUnitOfMeasure() {
    return chargeUnitOfMeasure;
  }
  public void setChargeUnitOfMeasure(String chargeUnitOfMeasure) {
    this.chargeUnitOfMeasure = chargeUnitOfMeasure;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("discounts")
  public java.util.List<BillingDiscount> getDiscounts() {
    return discounts;
  }
  public void setDiscounts(java.util.List<BillingDiscount> discounts) {
    this.discounts = discounts;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstEffectiveDate")
  public String getFirstEffectiveDate() {
    return firstEffectiveDate;
  }
  public void setFirstEffectiveDate(String firstEffectiveDate) {
    this.firstEffectiveDate = firstEffectiveDate;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("includedQuantity")
  public String getIncludedQuantity() {
    return includedQuantity;
  }
  public void setIncludedQuantity(String includedQuantity) {
    this.includedQuantity = includedQuantity;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("incrementalQuantity")
  public String getIncrementalQuantity() {
    return incrementalQuantity;
  }
  public void setIncrementalQuantity(String incrementalQuantity) {
    this.incrementalQuantity = incrementalQuantity;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastEffectiveDate")
  public String getLastEffectiveDate() {
    return lastEffectiveDate;
  }
  public void setLastEffectiveDate(String lastEffectiveDate) {
    this.lastEffectiveDate = lastEffectiveDate;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prices")
  public java.util.List<BillingPrice> getPrices() {
    return prices;
  }
  public void setPrices(java.util.List<BillingPrice> prices) {
    this.prices = prices;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("unitPrice")
  public String getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usedQuantity")
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

    return true && Objects.equals(allowedQuantity, billingCharge.allowedQuantity) &&
        Objects.equals(blocked, billingCharge.blocked) &&
        Objects.equals(chargeName, billingCharge.chargeName) &&
        Objects.equals(chargeType, billingCharge.chargeType) &&
        Objects.equals(chargeUnitOfMeasure, billingCharge.chargeUnitOfMeasure) &&
        Objects.equals(discounts, billingCharge.discounts) &&
        Objects.equals(firstEffectiveDate, billingCharge.firstEffectiveDate) &&
        Objects.equals(includedQuantity, billingCharge.includedQuantity) &&
        Objects.equals(incrementalQuantity, billingCharge.incrementalQuantity) &&
        Objects.equals(lastEffectiveDate, billingCharge.lastEffectiveDate) &&
        Objects.equals(prices, billingCharge.prices) &&
        Objects.equals(unitPrice, billingCharge.unitPrice) &&
        Objects.equals(usedQuantity, billingCharge.usedQuantity)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedQuantity, blocked, chargeName, chargeType, chargeUnitOfMeasure, discounts, firstEffectiveDate, includedQuantity, incrementalQuantity, lastEffectiveDate, prices, unitPrice, usedQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCharge {\n");
    
    if (allowedQuantity != null)
      sb.append("    allowedQuantity: ").append(toIndentedString(allowedQuantity)).append("\n");
    if (blocked != null)
      sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    if (chargeName != null)
      sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    if (chargeType != null)
      sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    if (chargeUnitOfMeasure != null)
      sb.append("    chargeUnitOfMeasure: ").append(toIndentedString(chargeUnitOfMeasure)).append("\n");
    if (discounts != null)
      sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    if (firstEffectiveDate != null)
      sb.append("    firstEffectiveDate: ").append(toIndentedString(firstEffectiveDate)).append("\n");
    if (includedQuantity != null)
      sb.append("    includedQuantity: ").append(toIndentedString(includedQuantity)).append("\n");
    if (incrementalQuantity != null)
      sb.append("    incrementalQuantity: ").append(toIndentedString(incrementalQuantity)).append("\n");
    if (lastEffectiveDate != null)
      sb.append("    lastEffectiveDate: ").append(toIndentedString(lastEffectiveDate)).append("\n");
    if (prices != null)
      sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    if (unitPrice != null)
      sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    if (usedQuantity != null)
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

