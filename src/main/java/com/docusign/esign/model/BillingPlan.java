package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AppStoreProduct;
import com.docusign.esign.model.CurrencyPlanPrice;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.SeatDiscount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about a billing plan.
 **/

@ApiModel(description = "Contains information about a billing plan.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPlan   {
  
  private java.util.List<AppStoreProduct> appStoreProducts = new java.util.ArrayList<AppStoreProduct>();
  private java.util.List<CurrencyPlanPrice> currencyPlanPrices = new java.util.ArrayList<CurrencyPlanPrice>();
  private String enableSupport = null;
  private String includedSeats = null;
  private String otherDiscountPercent = null;
  private String paymentCycle = null;
  private String paymentMethod = null;
  private String perSeatPrice = null;
  private String planClassification = null;
  private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();
  private String planId = null;
  private String planName = null;
  private java.util.List<SeatDiscount> seatDiscounts = new java.util.ArrayList<SeatDiscount>();
  private String supportIncidentFee = null;
  private String supportPlanFee = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("appStoreProducts")
  public java.util.List<AppStoreProduct> getAppStoreProducts() {
    return appStoreProducts;
  }
  public void setAppStoreProducts(java.util.List<AppStoreProduct> appStoreProducts) {
    this.appStoreProducts = appStoreProducts;
  }

  
  /**
   * Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.
   **/
  
  @ApiModelProperty(value = "Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.")
  @JsonProperty("currencyPlanPrices")
  public java.util.List<CurrencyPlanPrice> getCurrencyPlanPrices() {
    return currencyPlanPrices;
  }
  public void setCurrencyPlanPrices(java.util.List<CurrencyPlanPrice> currencyPlanPrices) {
    this.currencyPlanPrices = currencyPlanPrices;
  }

  
  /**
   * When set to **true**, then customer support is provided as part of the account plan.
   **/
  
  @ApiModelProperty(value = "When set to **true**, then customer support is provided as part of the account plan.")
  @JsonProperty("enableSupport")
  public String getEnableSupport() {
    return enableSupport;
  }
  public void setEnableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
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
  @JsonProperty("otherDiscountPercent")
  public String getOtherDiscountPercent() {
    return otherDiscountPercent;
  }
  public void setOtherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
  }

  
  /**
   * The payment cycle associated with the plan. The possible values are: Monthly or Annually.
   **/
  
  @ApiModelProperty(value = "The payment cycle associated with the plan. The possible values are: Monthly or Annually.")
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
   * The per seat price for the plan.
   **/
  
  @ApiModelProperty(value = "The per seat price for the plan.")
  @JsonProperty("perSeatPrice")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }
  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }

  
  /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
   **/
  
  @ApiModelProperty(value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  @JsonProperty("planClassification")
  public String getPlanClassification() {
    return planClassification;
  }
  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planFeatureSets")
  public java.util.List<FeatureSet> getPlanFeatureSets() {
    return planFeatureSets;
  }
  public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
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
   * The name of the Billing Plan.
   **/
  
  @ApiModelProperty(value = "The name of the Billing Plan.")
  @JsonProperty("planName")
  public String getPlanName() {
    return planName;
  }
  public void setPlanName(String planName) {
    this.planName = planName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seatDiscounts")
  public java.util.List<SeatDiscount> getSeatDiscounts() {
    return seatDiscounts;
  }
  public void setSeatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
  }

  
  /**
   * The support incident fee charged for each support incident.
   **/
  
  @ApiModelProperty(value = "The support incident fee charged for each support incident.")
  @JsonProperty("supportIncidentFee")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }
  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }

  
  /**
   * The support plan fee charged for this plan.
   **/
  
  @ApiModelProperty(value = "The support plan fee charged for this plan.")
  @JsonProperty("supportPlanFee")
  public String getSupportPlanFee() {
    return supportPlanFee;
  }
  public void setSupportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlan billingPlan = (BillingPlan) o;

    return true && Objects.equals(appStoreProducts, billingPlan.appStoreProducts) &&
        Objects.equals(currencyPlanPrices, billingPlan.currencyPlanPrices) &&
        Objects.equals(enableSupport, billingPlan.enableSupport) &&
        Objects.equals(includedSeats, billingPlan.includedSeats) &&
        Objects.equals(otherDiscountPercent, billingPlan.otherDiscountPercent) &&
        Objects.equals(paymentCycle, billingPlan.paymentCycle) &&
        Objects.equals(paymentMethod, billingPlan.paymentMethod) &&
        Objects.equals(perSeatPrice, billingPlan.perSeatPrice) &&
        Objects.equals(planClassification, billingPlan.planClassification) &&
        Objects.equals(planFeatureSets, billingPlan.planFeatureSets) &&
        Objects.equals(planId, billingPlan.planId) &&
        Objects.equals(planName, billingPlan.planName) &&
        Objects.equals(seatDiscounts, billingPlan.seatDiscounts) &&
        Objects.equals(supportIncidentFee, billingPlan.supportIncidentFee) &&
        Objects.equals(supportPlanFee, billingPlan.supportPlanFee)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreProducts, currencyPlanPrices, enableSupport, includedSeats, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, seatDiscounts, supportIncidentFee, supportPlanFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlan {\n");
    
    if (appStoreProducts != null)
      sb.append("    appStoreProducts: ").append(toIndentedString(appStoreProducts)).append("\n");
    if (currencyPlanPrices != null)
      sb.append("    currencyPlanPrices: ").append(toIndentedString(currencyPlanPrices)).append("\n");
    if (enableSupport != null)
      sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    if (includedSeats != null)
      sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    if (otherDiscountPercent != null)
      sb.append("    otherDiscountPercent: ").append(toIndentedString(otherDiscountPercent)).append("\n");
    if (paymentCycle != null)
      sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    if (paymentMethod != null)
      sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (perSeatPrice != null)
      sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    if (planClassification != null)
      sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    if (planFeatureSets != null)
      sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
    if (planId != null)
      sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    if (planName != null)
      sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    if (seatDiscounts != null)
      sb.append("    seatDiscounts: ").append(toIndentedString(seatDiscounts)).append("\n");
    if (supportIncidentFee != null)
      sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
    if (supportPlanFee != null)
      sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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

