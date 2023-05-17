package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AppStoreReceipt;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.DirectDebitProcessorInformation;
import com.docusign.esign.model.PaymentProcessorInformation;
import com.docusign.esign.model.PlanInformation;
import com.docusign.esign.model.ReferralInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains details about a billing plan..
 *
 */
@Schema(description = "This object contains details about a billing plan.")

public class BillingPlanInformation {
  @JsonProperty("appStoreReceipt")
  private AppStoreReceipt appStoreReceipt = null;

  @JsonProperty("billingAddress")
  private AccountAddress billingAddress = null;

  @JsonProperty("creditCardInformation")
  private CreditCardInformation creditCardInformation = null;

  @JsonProperty("directDebitProcessorInformation")
  private DirectDebitProcessorInformation directDebitProcessorInformation = null;

  @JsonProperty("downgradeReason")
  private String downgradeReason = null;

  @JsonProperty("enablePreAuth")
  private String enablePreAuth = null;

  @JsonProperty("enableSupport")
  private String enableSupport = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("incrementalSeats")
  private String incrementalSeats = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("paymentProcessor")
  private String paymentProcessor = null;

  @JsonProperty("paymentProcessorInformation")
  private PaymentProcessorInformation paymentProcessorInformation = null;

  @JsonProperty("planInformation")
  private PlanInformation planInformation = null;

  @JsonProperty("processPayment")
  private String processPayment = null;

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

  @JsonProperty("taxExemptId")
  private String taxExemptId = null;


  /**
   * appStoreReceipt.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation appStoreReceipt(AppStoreReceipt appStoreReceipt) {
    this.appStoreReceipt = appStoreReceipt;
    return this;
  }

  /**
   * .
   * @return appStoreReceipt
   **/
  @Schema(description = "")
  public AppStoreReceipt getAppStoreReceipt() {
    return appStoreReceipt;
  }

  /**
   * setAppStoreReceipt.
   **/
  public void setAppStoreReceipt(AppStoreReceipt appStoreReceipt) {
    this.appStoreReceipt = appStoreReceipt;
  }


  /**
   * billingAddress.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation billingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * The billing address for the account..
   * @return billingAddress
   **/
  @Schema(description = "The billing address for the account.")
  public AccountAddress getBillingAddress() {
    return billingAddress;
  }

  /**
   * setBillingAddress.
   **/
  public void setBillingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  /**
   * creditCardInformation.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation creditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
    return this;
  }

  /**
   * A complex type that has information about the credit card used to pay for this account..
   * @return creditCardInformation
   **/
  @Schema(description = "A complex type that has information about the credit card used to pay for this account.")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }

  /**
   * setCreditCardInformation.
   **/
  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }


  /**
   * directDebitProcessorInformation.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation directDebitProcessorInformation(DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
    return this;
  }

  /**
   * Information about the bank that processes direct debits for the payment plan..
   * @return directDebitProcessorInformation
   **/
  @Schema(description = "Information about the bank that processes direct debits for the payment plan.")
  public DirectDebitProcessorInformation getDirectDebitProcessorInformation() {
    return directDebitProcessorInformation;
  }

  /**
   * setDirectDebitProcessorInformation.
   **/
  public void setDirectDebitProcessorInformation(DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
  }


  /**
   * downgradeReason.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation downgradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
    return this;
  }

  /**
   * .
   * @return downgradeReason
   **/
  @Schema(description = "")
  public String getDowngradeReason() {
    return downgradeReason;
  }

  /**
   * setDowngradeReason.
   **/
  public void setDowngradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
  }


  /**
   * enablePreAuth.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation enablePreAuth(String enablePreAuth) {
    this.enablePreAuth = enablePreAuth;
    return this;
  }

  /**
   * .
   * @return enablePreAuth
   **/
  @Schema(description = "")
  public String getEnablePreAuth() {
    return enablePreAuth;
  }

  /**
   * setEnablePreAuth.
   **/
  public void setEnablePreAuth(String enablePreAuth) {
    this.enablePreAuth = enablePreAuth;
  }


  /**
   * enableSupport.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation enableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
    return this;
  }

  /**
   * .
   * @return enableSupport
   **/
  @Schema(description = "")
  public String getEnableSupport() {
    return enableSupport;
  }

  /**
   * setEnableSupport.
   **/
  public void setEnableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
  }


  /**
   * includedSeats.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation includedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
    return this;
  }

  /**
   * The number of seats (users) included..
   * @return includedSeats
   **/
  @Schema(description = "The number of seats (users) included.")
  public String getIncludedSeats() {
    return includedSeats;
  }

  /**
   * setIncludedSeats.
   **/
  public void setIncludedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
  }


  /**
   * incrementalSeats.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation incrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return incrementalSeats
   **/
  @Schema(description = "Reserved: TBD")
  public String getIncrementalSeats() {
    return incrementalSeats;
  }

  /**
   * setIncrementalSeats.
   **/
  public void setIncrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
  }


  /**
   * paymentMethod.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * .
   * @return paymentMethod
   **/
  @Schema(description = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * setPaymentMethod.
   **/
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  /**
   * paymentProcessor.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation paymentProcessor(String paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
    return this;
  }

  /**
   * .
   * @return paymentProcessor
   **/
  @Schema(description = "")
  public String getPaymentProcessor() {
    return paymentProcessor;
  }

  /**
   * setPaymentProcessor.
   **/
  public void setPaymentProcessor(String paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }


  /**
   * paymentProcessorInformation.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation paymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
    return this;
  }

  /**
   * Information about the entity that processes payments for the billing plan..
   * @return paymentProcessorInformation
   **/
  @Schema(description = "Information about the entity that processes payments for the billing plan.")
  public PaymentProcessorInformation getPaymentProcessorInformation() {
    return paymentProcessorInformation;
  }

  /**
   * setPaymentProcessorInformation.
   **/
  public void setPaymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
  }


  /**
   * planInformation.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

  /**
   * An object used to identify the features and attributes of the account being created..
   * @return planInformation
   **/
  @Schema(description = "An object used to identify the features and attributes of the account being created.")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  /**
   * setPlanInformation.
   **/
  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }


  /**
   * processPayment.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation processPayment(String processPayment) {
    this.processPayment = processPayment;
    return this;
  }

  /**
   * .
   * @return processPayment
   **/
  @Schema(description = "")
  public String getProcessPayment() {
    return processPayment;
  }

  /**
   * setProcessPayment.
   **/
  public void setProcessPayment(String processPayment) {
    this.processPayment = processPayment;
  }


  /**
   * referralInformation.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation referralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
    return this;
  }

  /**
   * A complex type that contains properties for entering referral and discount information..
   * @return referralInformation
   **/
  @Schema(description = "A complex type that contains properties for entering referral and discount information.")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }

  /**
   * setReferralInformation.
   **/
  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }


  /**
   * renewalStatus.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation renewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
    return this;
  }

  /**
   * .
   * @return renewalStatus
   **/
  @Schema(description = "")
  public String getRenewalStatus() {
    return renewalStatus;
  }

  /**
   * setRenewalStatus.
   **/
  public void setRenewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
  }


  /**
   * saleDiscountAmount.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation saleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
    return this;
  }

  /**
   * .
   * @return saleDiscountAmount
   **/
  @Schema(description = "")
  public String getSaleDiscountAmount() {
    return saleDiscountAmount;
  }

  /**
   * setSaleDiscountAmount.
   **/
  public void setSaleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
  }


  /**
   * saleDiscountFixedAmount.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation saleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
    return this;
  }

  /**
   * .
   * @return saleDiscountFixedAmount
   **/
  @Schema(description = "")
  public String getSaleDiscountFixedAmount() {
    return saleDiscountFixedAmount;
  }

  /**
   * setSaleDiscountFixedAmount.
   **/
  public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
  }


  /**
   * saleDiscountPercent.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation saleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
    return this;
  }

  /**
   * .
   * @return saleDiscountPercent
   **/
  @Schema(description = "")
  public String getSaleDiscountPercent() {
    return saleDiscountPercent;
  }

  /**
   * setSaleDiscountPercent.
   **/
  public void setSaleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
  }


  /**
   * saleDiscountPeriods.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation saleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
    return this;
  }

  /**
   * .
   * @return saleDiscountPeriods
   **/
  @Schema(description = "")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }

  /**
   * setSaleDiscountPeriods.
   **/
  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }


  /**
   * saleDiscountSeatPriceOverride.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation saleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
    return this;
  }

  /**
   * .
   * @return saleDiscountSeatPriceOverride
   **/
  @Schema(description = "")
  public String getSaleDiscountSeatPriceOverride() {
    return saleDiscountSeatPriceOverride;
  }

  /**
   * setSaleDiscountSeatPriceOverride.
   **/
  public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
  }


  /**
   * taxExemptId.
   *
   * @return BillingPlanInformation
   **/
  public BillingPlanInformation taxExemptId(String taxExemptId) {
    this.taxExemptId = taxExemptId;
    return this;
  }

  /**
   * .
   * @return taxExemptId
   **/
  @Schema(description = "")
  public String getTaxExemptId() {
    return taxExemptId;
  }

  /**
   * setTaxExemptId.
   **/
  public void setTaxExemptId(String taxExemptId) {
    this.taxExemptId = taxExemptId;
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
    BillingPlanInformation billingPlanInformation = (BillingPlanInformation) o;
    return Objects.equals(this.appStoreReceipt, billingPlanInformation.appStoreReceipt) &&
        Objects.equals(this.billingAddress, billingPlanInformation.billingAddress) &&
        Objects.equals(this.creditCardInformation, billingPlanInformation.creditCardInformation) &&
        Objects.equals(this.directDebitProcessorInformation, billingPlanInformation.directDebitProcessorInformation) &&
        Objects.equals(this.downgradeReason, billingPlanInformation.downgradeReason) &&
        Objects.equals(this.enablePreAuth, billingPlanInformation.enablePreAuth) &&
        Objects.equals(this.enableSupport, billingPlanInformation.enableSupport) &&
        Objects.equals(this.includedSeats, billingPlanInformation.includedSeats) &&
        Objects.equals(this.incrementalSeats, billingPlanInformation.incrementalSeats) &&
        Objects.equals(this.paymentMethod, billingPlanInformation.paymentMethod) &&
        Objects.equals(this.paymentProcessor, billingPlanInformation.paymentProcessor) &&
        Objects.equals(this.paymentProcessorInformation, billingPlanInformation.paymentProcessorInformation) &&
        Objects.equals(this.planInformation, billingPlanInformation.planInformation) &&
        Objects.equals(this.processPayment, billingPlanInformation.processPayment) &&
        Objects.equals(this.referralInformation, billingPlanInformation.referralInformation) &&
        Objects.equals(this.renewalStatus, billingPlanInformation.renewalStatus) &&
        Objects.equals(this.saleDiscountAmount, billingPlanInformation.saleDiscountAmount) &&
        Objects.equals(this.saleDiscountFixedAmount, billingPlanInformation.saleDiscountFixedAmount) &&
        Objects.equals(this.saleDiscountPercent, billingPlanInformation.saleDiscountPercent) &&
        Objects.equals(this.saleDiscountPeriods, billingPlanInformation.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountSeatPriceOverride, billingPlanInformation.saleDiscountSeatPriceOverride) &&
        Objects.equals(this.taxExemptId, billingPlanInformation.taxExemptId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(appStoreReceipt, billingAddress, creditCardInformation, directDebitProcessorInformation, downgradeReason, enablePreAuth, enableSupport, includedSeats, incrementalSeats, paymentMethod, paymentProcessor, paymentProcessorInformation, planInformation, processPayment, referralInformation, renewalStatus, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride, taxExemptId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanInformation {\n");
    
    sb.append("    appStoreReceipt: ").append(toIndentedString(appStoreReceipt)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    sb.append("    directDebitProcessorInformation: ").append(toIndentedString(directDebitProcessorInformation)).append("\n");
    sb.append("    downgradeReason: ").append(toIndentedString(downgradeReason)).append("\n");
    sb.append("    enablePreAuth: ").append(toIndentedString(enablePreAuth)).append("\n");
    sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentProcessor: ").append(toIndentedString(paymentProcessor)).append("\n");
    sb.append("    paymentProcessorInformation: ").append(toIndentedString(paymentProcessorInformation)).append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    processPayment: ").append(toIndentedString(processPayment)).append("\n");
    sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
    sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
    sb.append("    saleDiscountAmount: ").append(toIndentedString(saleDiscountAmount)).append("\n");
    sb.append("    saleDiscountFixedAmount: ").append(toIndentedString(saleDiscountFixedAmount)).append("\n");
    sb.append("    saleDiscountPercent: ").append(toIndentedString(saleDiscountPercent)).append("\n");
    sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
    sb.append("    saleDiscountSeatPriceOverride: ").append(toIndentedString(saleDiscountSeatPriceOverride)).append("\n");
    sb.append("    taxExemptId: ").append(toIndentedString(taxExemptId)).append("\n");
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

