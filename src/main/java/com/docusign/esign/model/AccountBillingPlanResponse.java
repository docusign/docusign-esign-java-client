package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AccountBillingPlan;
import com.docusign.esign.model.BillingPlan;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.PaymentProcessorInformation;
import com.docusign.esign.model.ReferralInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines an account billing plan response object.
 */
@ApiModel(description = "Defines an account billing plan response object.")

public class AccountBillingPlanResponse {
  @JsonProperty("billingAddress")
  private AccountAddress billingAddress = null;

  @JsonProperty("billingAddressIsCreditCardAddress")
  private String billingAddressIsCreditCardAddress = null;

  @JsonProperty("billingPlan")
  private AccountBillingPlan billingPlan = null;

  @JsonProperty("creditCardInformation")
  private CreditCardInformation creditCardInformation = null;

  @JsonProperty("paymentProcessorInformation")
  private PaymentProcessorInformation paymentProcessorInformation = null;

  @JsonProperty("referralInformation")
  private ReferralInformation referralInformation = null;

  @JsonProperty("successorPlans")
  private java.util.List<BillingPlan> successorPlans = null;

  public AccountBillingPlanResponse billingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public AccountAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public AccountBillingPlanResponse billingAddressIsCreditCardAddress(String billingAddressIsCreditCardAddress) {
    this.billingAddressIsCreditCardAddress = billingAddressIsCreditCardAddress;
    return this;
  }

   /**
   * When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.
   * @return billingAddressIsCreditCardAddress
  **/
  @ApiModelProperty(value = "When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.")
  public String getBillingAddressIsCreditCardAddress() {
    return billingAddressIsCreditCardAddress;
  }

  public void setBillingAddressIsCreditCardAddress(String billingAddressIsCreditCardAddress) {
    this.billingAddressIsCreditCardAddress = billingAddressIsCreditCardAddress;
  }

  public AccountBillingPlanResponse billingPlan(AccountBillingPlan billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

   /**
   * Get billingPlan
   * @return billingPlan
  **/
  @ApiModelProperty(value = "")
  public AccountBillingPlan getBillingPlan() {
    return billingPlan;
  }

  public void setBillingPlan(AccountBillingPlan billingPlan) {
    this.billingPlan = billingPlan;
  }

  public AccountBillingPlanResponse creditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
    return this;
  }

   /**
   * Get creditCardInformation
   * @return creditCardInformation
  **/
  @ApiModelProperty(value = "")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }

  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  public AccountBillingPlanResponse paymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
    return this;
  }

   /**
   * Get paymentProcessorInformation
   * @return paymentProcessorInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentProcessorInformation getPaymentProcessorInformation() {
    return paymentProcessorInformation;
  }

  public void setPaymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
  }

  public AccountBillingPlanResponse referralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
    return this;
  }

   /**
   * Get referralInformation
   * @return referralInformation
  **/
  @ApiModelProperty(value = "")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }

  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }

  public AccountBillingPlanResponse successorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
    return this;
  }

  public AccountBillingPlanResponse addSuccessorPlansItem(BillingPlan successorPlansItem) {
    if (this.successorPlans == null) {
      this.successorPlans = new java.util.ArrayList<BillingPlan>();
    }
    this.successorPlans.add(successorPlansItem);
    return this;
  }

   /**
   * 
   * @return successorPlans
  **/
  @ApiModelProperty(value = "")
  public java.util.List<BillingPlan> getSuccessorPlans() {
    return successorPlans;
  }

  public void setSuccessorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingPlanResponse accountBillingPlanResponse = (AccountBillingPlanResponse) o;
    return Objects.equals(this.billingAddress, accountBillingPlanResponse.billingAddress) &&
        Objects.equals(this.billingAddressIsCreditCardAddress, accountBillingPlanResponse.billingAddressIsCreditCardAddress) &&
        Objects.equals(this.billingPlan, accountBillingPlanResponse.billingPlan) &&
        Objects.equals(this.creditCardInformation, accountBillingPlanResponse.creditCardInformation) &&
        Objects.equals(this.paymentProcessorInformation, accountBillingPlanResponse.paymentProcessorInformation) &&
        Objects.equals(this.referralInformation, accountBillingPlanResponse.referralInformation) &&
        Objects.equals(this.successorPlans, accountBillingPlanResponse.successorPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, billingAddressIsCreditCardAddress, billingPlan, creditCardInformation, paymentProcessorInformation, referralInformation, successorPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingPlanResponse {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingAddressIsCreditCardAddress: ").append(toIndentedString(billingAddressIsCreditCardAddress)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    sb.append("    paymentProcessorInformation: ").append(toIndentedString(paymentProcessorInformation)).append("\n");
    sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
    sb.append("    successorPlans: ").append(toIndentedString(successorPlans)).append("\n");
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

