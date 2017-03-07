package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingPlanPreview;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines a billing plan update response object.
 **/

@ApiModel(description = "Defines a billing plan update response object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPlanUpdateResponse   {
  
  private BillingPlanPreview billingPlanPreview = null;
  private String currencyCode = null;
  private String includedSeats = null;
  private String paymentCycle = null;
  private String paymentMethod = null;
  private String planId = null;
  private String planName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingPlanPreview")
  public BillingPlanPreview getBillingPlanPreview() {
    return billingPlanPreview;
  }
  public void setBillingPlanPreview(BillingPlanPreview billingPlanPreview) {
    this.billingPlanPreview = billingPlanPreview;
  }

  
  /**
   * Specifies the ISO currency code for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * The number of seats (users) included.
   **/
  
  @ApiModelProperty(value = "The number of seats (users) included.")
  @JsonProperty("includedSeats")
  public String getIncludedSeats() {
    return includedSeats;
  }
  public void setIncludedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentCycle")
  public String getPaymentCycle() {
    return paymentCycle;
  }
  public void setPaymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentMethod")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planId")
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planName")
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

    return true && Objects.equals(billingPlanPreview, billingPlanUpdateResponse.billingPlanPreview) &&
        Objects.equals(currencyCode, billingPlanUpdateResponse.currencyCode) &&
        Objects.equals(includedSeats, billingPlanUpdateResponse.includedSeats) &&
        Objects.equals(paymentCycle, billingPlanUpdateResponse.paymentCycle) &&
        Objects.equals(paymentMethod, billingPlanUpdateResponse.paymentMethod) &&
        Objects.equals(planId, billingPlanUpdateResponse.planId) &&
        Objects.equals(planName, billingPlanUpdateResponse.planName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPlanPreview, currencyCode, includedSeats, paymentCycle, paymentMethod, planId, planName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanUpdateResponse {\n");
    
    if (billingPlanPreview != null)
      sb.append("    billingPlanPreview: ").append(toIndentedString(billingPlanPreview)).append("\n");
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (includedSeats != null)
      sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    if (paymentCycle != null)
      sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    if (paymentMethod != null)
      sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (planId != null)
      sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    if (planName != null)
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

