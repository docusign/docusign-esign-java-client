package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AppStoreReceipt;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.PaymentProcessorInformation;
import com.docusign.esign.model.PlanInformation;
import com.docusign.esign.model.ReferralInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BillingPlanInformation
 */

public class BillingPlanInformation {
  @JsonProperty("appStoreReceipt")
  private AppStoreReceipt appStoreReceipt = null;

  @JsonProperty("billingAddress")
  private AccountAddress billingAddress = null;

  @JsonProperty("creditCardInformation")
  private CreditCardInformation creditCardInformation = null;

  @JsonProperty("downgradeReason")
  private String downgradeReason = null;

  @JsonProperty("enableSupport")
  private String enableSupport = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("incrementalSeats")
  private String incrementalSeats = null;

  @JsonProperty("paymentProcessorInformation")
  private PaymentProcessorInformation paymentProcessorInformation = null;

  @JsonProperty("planInformation")
  private PlanInformation planInformation = null;

  @JsonProperty("referralInformation")
  private ReferralInformation referralInformation = null;

  @JsonProperty("renewalStatus")
  private String renewalStatus = null;

  @JsonProperty("saleDiscountAmount")
  private String saleDiscountAmount = null;

  @JsonProperty("saleDiscountFixedAmount")
  private String saleDiscountFixedAmount = null;

  @JsonProperty("saleDiscountPercent")
  private String saleDiscountPercent = null;

  @JsonProperty("saleDiscountPeriods")
  private String saleDiscountPeriods = null;

  @JsonProperty("saleDiscountSeatPriceOverride")
  private String saleDiscountSeatPriceOverride = null;

  public BillingPlanInformation appStoreReceipt(AppStoreReceipt appStoreReceipt) {
    this.appStoreReceipt = appStoreReceipt;
    return this;
  }

   /**
   * Get appStoreReceipt
   * @return appStoreReceipt
  **/
  @ApiModelProperty(example = "null", value = "")
  public AppStoreReceipt getAppStoreReceipt() {
    return appStoreReceipt;
  }

  public void setAppStoreReceipt(AppStoreReceipt appStoreReceipt) {
    this.appStoreReceipt = appStoreReceipt;
  }

  public BillingPlanInformation billingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public BillingPlanInformation creditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
    return this;
  }

   /**
   * Get creditCardInformation
   * @return creditCardInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }

  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  public BillingPlanInformation downgradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
    return this;
  }

   /**
   * 
   * @return downgradeReason
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDowngradeReason() {
    return downgradeReason;
  }

  public void setDowngradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
  }

  public BillingPlanInformation enableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
    return this;
  }

   /**
   * 
   * @return enableSupport
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableSupport() {
    return enableSupport;
  }

  public void setEnableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
  }

  public BillingPlanInformation includedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
    return this;
  }

   /**
   * The number of seats (users) included.
   * @return includedSeats
  **/
  @ApiModelProperty(example = "null", value = "The number of seats (users) included.")
  public String getIncludedSeats() {
    return includedSeats;
  }

  public void setIncludedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
  }

  public BillingPlanInformation incrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
    return this;
  }

   /**
   * Reserved: TBD
   * @return incrementalSeats
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getIncrementalSeats() {
    return incrementalSeats;
  }

  public void setIncrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
  }

  public BillingPlanInformation paymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
    return this;
  }

   /**
   * Get paymentProcessorInformation
   * @return paymentProcessorInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentProcessorInformation getPaymentProcessorInformation() {
    return paymentProcessorInformation;
  }

  public void setPaymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
  }

  public BillingPlanInformation planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public BillingPlanInformation referralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
    return this;
  }

   /**
   * Get referralInformation
   * @return referralInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }

  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }

  public BillingPlanInformation renewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
    return this;
  }

   /**
   * 
   * @return renewalStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRenewalStatus() {
    return renewalStatus;
  }

  public void setRenewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
  }

  public BillingPlanInformation saleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
    return this;
  }

   /**
   * 
   * @return saleDiscountAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSaleDiscountAmount() {
    return saleDiscountAmount;
  }

  public void setSaleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
  }

  public BillingPlanInformation saleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
    return this;
  }

   /**
   * 
   * @return saleDiscountFixedAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSaleDiscountFixedAmount() {
    return saleDiscountFixedAmount;
  }

  public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
  }

  public BillingPlanInformation saleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
    return this;
  }

   /**
   * 
   * @return saleDiscountPercent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSaleDiscountPercent() {
    return saleDiscountPercent;
  }

  public void setSaleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
  }

  public BillingPlanInformation saleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
    return this;
  }

   /**
   * 
   * @return saleDiscountPeriods
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }

  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }

  public BillingPlanInformation saleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
    return this;
  }

   /**
   * 
   * @return saleDiscountSeatPriceOverride
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSaleDiscountSeatPriceOverride() {
    return saleDiscountSeatPriceOverride;
  }

  public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanInformation billingPlanInformation = (BillingPlanInformation) o;
    return Objects.equals(this.appStoreReceipt, billingPlanInformation.appStoreReceipt) &&
        Objects.equals(this.billingAddress, billingPlanInformation.billingAddress) &&
        Objects.equals(this.creditCardInformation, billingPlanInformation.creditCardInformation) &&
        Objects.equals(this.downgradeReason, billingPlanInformation.downgradeReason) &&
        Objects.equals(this.enableSupport, billingPlanInformation.enableSupport) &&
        Objects.equals(this.includedSeats, billingPlanInformation.includedSeats) &&
        Objects.equals(this.incrementalSeats, billingPlanInformation.incrementalSeats) &&
        Objects.equals(this.paymentProcessorInformation, billingPlanInformation.paymentProcessorInformation) &&
        Objects.equals(this.planInformation, billingPlanInformation.planInformation) &&
        Objects.equals(this.referralInformation, billingPlanInformation.referralInformation) &&
        Objects.equals(this.renewalStatus, billingPlanInformation.renewalStatus) &&
        Objects.equals(this.saleDiscountAmount, billingPlanInformation.saleDiscountAmount) &&
        Objects.equals(this.saleDiscountFixedAmount, billingPlanInformation.saleDiscountFixedAmount) &&
        Objects.equals(this.saleDiscountPercent, billingPlanInformation.saleDiscountPercent) &&
        Objects.equals(this.saleDiscountPeriods, billingPlanInformation.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountSeatPriceOverride, billingPlanInformation.saleDiscountSeatPriceOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreReceipt, billingAddress, creditCardInformation, downgradeReason, enableSupport, includedSeats, incrementalSeats, paymentProcessorInformation, planInformation, referralInformation, renewalStatus, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanInformation {\n");
    
    sb.append("    appStoreReceipt: ").append(toIndentedString(appStoreReceipt)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    sb.append("    downgradeReason: ").append(toIndentedString(downgradeReason)).append("\n");
    sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
    sb.append("    paymentProcessorInformation: ").append(toIndentedString(paymentProcessorInformation)).append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
    sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
    sb.append("    saleDiscountAmount: ").append(toIndentedString(saleDiscountAmount)).append("\n");
    sb.append("    saleDiscountFixedAmount: ").append(toIndentedString(saleDiscountFixedAmount)).append("\n");
    sb.append("    saleDiscountPercent: ").append(toIndentedString(saleDiscountPercent)).append("\n");
    sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
    sb.append("    saleDiscountSeatPriceOverride: ").append(toIndentedString(saleDiscountSeatPriceOverride)).append("\n");
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

