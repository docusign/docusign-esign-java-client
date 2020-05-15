package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingPlanPreview;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines a billing plan update response object.
 */
@ApiModel(description = "Defines a billing plan update response object.")

public class BillingPlanUpdateResponse {
  @JsonProperty("accountPaymentMethod")
  private String accountPaymentMethod = null;

  @JsonProperty("billingPlanPreview")
  private BillingPlanPreview billingPlanPreview = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("paymentCycle")
  private String paymentCycle = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("planName")
  private String planName = null;

  public BillingPlanUpdateResponse accountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
    return this;
  }

   /**
   * 
   * @return accountPaymentMethod
  **/
  @ApiModelProperty(value = "")
  public String getAccountPaymentMethod() {
    return accountPaymentMethod;
  }

  public void setAccountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
  }

  public BillingPlanUpdateResponse billingPlanPreview(BillingPlanPreview billingPlanPreview) {
    this.billingPlanPreview = billingPlanPreview;
    return this;
  }

   /**
   * Get billingPlanPreview
   * @return billingPlanPreview
  **/
  @ApiModelProperty(value = "")
  public BillingPlanPreview getBillingPlanPreview() {
    return billingPlanPreview;
  }

  public void setBillingPlanPreview(BillingPlanPreview billingPlanPreview) {
    this.billingPlanPreview = billingPlanPreview;
  }

  public BillingPlanUpdateResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code for the account.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BillingPlanUpdateResponse includedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
    return this;
  }

   /**
   * The number of seats (users) included.
   * @return includedSeats
  **/
  @ApiModelProperty(value = "The number of seats (users) included.")
  public String getIncludedSeats() {
    return includedSeats;
  }

  public void setIncludedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
  }

  public BillingPlanUpdateResponse paymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

   /**
   * 
   * @return paymentCycle
  **/
  @ApiModelProperty(value = "")
  public String getPaymentCycle() {
    return paymentCycle;
  }

  public void setPaymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
  }

  public BillingPlanUpdateResponse paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public BillingPlanUpdateResponse planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * 
   * @return planId
  **/
  @ApiModelProperty(value = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public BillingPlanUpdateResponse planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * 
   * @return planName
  **/
  @ApiModelProperty(value = "")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanUpdateResponse billingPlanUpdateResponse = (BillingPlanUpdateResponse) o;
    return Objects.equals(this.accountPaymentMethod, billingPlanUpdateResponse.accountPaymentMethod) &&
        Objects.equals(this.billingPlanPreview, billingPlanUpdateResponse.billingPlanPreview) &&
        Objects.equals(this.currencyCode, billingPlanUpdateResponse.currencyCode) &&
        Objects.equals(this.includedSeats, billingPlanUpdateResponse.includedSeats) &&
        Objects.equals(this.paymentCycle, billingPlanUpdateResponse.paymentCycle) &&
        Objects.equals(this.paymentMethod, billingPlanUpdateResponse.paymentMethod) &&
        Objects.equals(this.planId, billingPlanUpdateResponse.planId) &&
        Objects.equals(this.planName, billingPlanUpdateResponse.planName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPaymentMethod, billingPlanPreview, currencyCode, includedSeats, paymentCycle, paymentMethod, planId, planName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanUpdateResponse {\n");
    
    sb.append("    accountPaymentMethod: ").append(toIndentedString(accountPaymentMethod)).append("\n");
    sb.append("    billingPlanPreview: ").append(toIndentedString(billingPlanPreview)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
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

