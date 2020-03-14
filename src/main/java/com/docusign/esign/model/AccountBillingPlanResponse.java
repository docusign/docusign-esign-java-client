package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AccountBillingPlan;
import com.docusign.esign.model.BillingPlan;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.DirectDebitProcessorInformation;
import com.docusign.esign.model.DowngradePlanUpdateResponse;
import com.docusign.esign.model.PaymentProcessorInformation;
import com.docusign.esign.model.ReferralInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

  @JsonProperty("directDebitProcessorInformation")
  private DirectDebitProcessorInformation directDebitProcessorInformation = null;

  @JsonProperty("downgradePlanInformation")
  private DowngradePlanUpdateResponse downgradePlanInformation = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("paymentProcessorInformation")
  private PaymentProcessorInformation paymentProcessorInformation = null;

  @JsonProperty("referralInformation")
  private ReferralInformation referralInformation = null;

  @JsonProperty("successorPlans")
  private java.util.List<BillingPlan> successorPlans = new java.util.ArrayList<BillingPlan>();

  public AccountBillingPlanResponse billingAddress(AccountAddress billingAddress) {
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

  public AccountBillingPlanResponse billingAddressIsCreditCardAddress(String billingAddressIsCreditCardAddress) {
    this.billingAddressIsCreditCardAddress = billingAddressIsCreditCardAddress;
    return this;
  }

   /**
   * When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.
   * @return billingAddressIsCreditCardAddress
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }

  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  public AccountBillingPlanResponse directDebitProcessorInformation(DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
    return this;
  }

   /**
   * Get directDebitProcessorInformation
   * @return directDebitProcessorInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public DirectDebitProcessorInformation getDirectDebitProcessorInformation() {
    return directDebitProcessorInformation;
  }

  public void setDirectDebitProcessorInformation(DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
  }

  public AccountBillingPlanResponse downgradePlanInformation(DowngradePlanUpdateResponse downgradePlanInformation) {
    this.downgradePlanInformation = downgradePlanInformation;
    return this;
  }

   /**
   * Get downgradePlanInformation
   * @return downgradePlanInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public DowngradePlanUpdateResponse getDowngradePlanInformation() {
    return downgradePlanInformation;
  }

  public void setDowngradePlanInformation(DowngradePlanUpdateResponse downgradePlanInformation) {
    this.downgradePlanInformation = downgradePlanInformation;
  }

  public AccountBillingPlanResponse paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public AccountBillingPlanResponse paymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
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

  public AccountBillingPlanResponse referralInformation(ReferralInformation referralInformation) {
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

  public AccountBillingPlanResponse successorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
    return this;
  }

  public AccountBillingPlanResponse addSuccessorPlansItem(BillingPlan successorPlansItem) {
    this.successorPlans.add(successorPlansItem);
    return this;
  }

   /**
   * 
   * @return successorPlans
  **/
  @ApiModelProperty(example = "null", value = "")
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
        Objects.equals(this.directDebitProcessorInformation, accountBillingPlanResponse.directDebitProcessorInformation) &&
        Objects.equals(this.downgradePlanInformation, accountBillingPlanResponse.downgradePlanInformation) &&
        Objects.equals(this.paymentMethod, accountBillingPlanResponse.paymentMethod) &&
        Objects.equals(this.paymentProcessorInformation, accountBillingPlanResponse.paymentProcessorInformation) &&
        Objects.equals(this.referralInformation, accountBillingPlanResponse.referralInformation) &&
        Objects.equals(this.successorPlans, accountBillingPlanResponse.successorPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, billingAddressIsCreditCardAddress, billingPlan, creditCardInformation, directDebitProcessorInformation, downgradePlanInformation, paymentMethod, paymentProcessorInformation, referralInformation, successorPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingPlanResponse {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingAddressIsCreditCardAddress: ").append(toIndentedString(billingAddressIsCreditCardAddress)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    sb.append("    directDebitProcessorInformation: ").append(toIndentedString(directDebitProcessorInformation)).append("\n");
    sb.append("    downgradePlanInformation: ").append(toIndentedString(downgradePlanInformation)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

