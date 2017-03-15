package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AccountBillingPlan;
import com.docusign.esign.model.BillingPlan;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.ReferralInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines an account billing plan response object.
 **/

@ApiModel(description = "Defines an account billing plan response object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountBillingPlanResponse   {
  
  private AccountAddress billingAddress = null;
  private String billingAddressIsCreditCardAddress = null;
  private AccountBillingPlan billingPlan = null;
  private CreditCardInformation creditCardInformation = null;
  private ReferralInformation referralInformation = null;
  private java.util.List<BillingPlan> successorPlans = new java.util.ArrayList<BillingPlan>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingAddress")
  public AccountAddress getBillingAddress() {
    return billingAddress;
  }
  public void setBillingAddress(AccountAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  /**
   * When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.")
  @JsonProperty("billingAddressIsCreditCardAddress")
  public String getBillingAddressIsCreditCardAddress() {
    return billingAddressIsCreditCardAddress;
  }
  public void setBillingAddressIsCreditCardAddress(String billingAddressIsCreditCardAddress) {
    this.billingAddressIsCreditCardAddress = billingAddressIsCreditCardAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingPlan")
  public AccountBillingPlan getBillingPlan() {
    return billingPlan;
  }
  public void setBillingPlan(AccountBillingPlan billingPlan) {
    this.billingPlan = billingPlan;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creditCardInformation")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }
  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referralInformation")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }
  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("successorPlans")
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

    return true && Objects.equals(billingAddress, accountBillingPlanResponse.billingAddress) &&
        Objects.equals(billingAddressIsCreditCardAddress, accountBillingPlanResponse.billingAddressIsCreditCardAddress) &&
        Objects.equals(billingPlan, accountBillingPlanResponse.billingPlan) &&
        Objects.equals(creditCardInformation, accountBillingPlanResponse.creditCardInformation) &&
        Objects.equals(referralInformation, accountBillingPlanResponse.referralInformation) &&
        Objects.equals(successorPlans, accountBillingPlanResponse.successorPlans)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, billingAddressIsCreditCardAddress, billingPlan, creditCardInformation, referralInformation, successorPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingPlanResponse {\n");
    
    if (billingAddress != null)
      sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    if (billingAddressIsCreditCardAddress != null)
      sb.append("    billingAddressIsCreditCardAddress: ").append(toIndentedString(billingAddressIsCreditCardAddress)).append("\n");
    if (billingPlan != null)
      sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    if (creditCardInformation != null)
      sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    if (referralInformation != null)
      sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
    if (successorPlans != null)
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

