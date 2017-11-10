package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AppStoreProduct;
import com.docusign.esign.model.CurrencyPlanPrice;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.SeatDiscount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about a billing plan.
 */
@ApiModel(description = "Contains information about a billing plan.")

public class BillingPlan {
  @JsonProperty("appStoreProducts")
  private java.util.List<AppStoreProduct> appStoreProducts = new java.util.ArrayList<AppStoreProduct>();

  @JsonProperty("currencyPlanPrices")
  private java.util.List<CurrencyPlanPrice> currencyPlanPrices = new java.util.ArrayList<CurrencyPlanPrice>();

  @JsonProperty("enableSupport")
  private String enableSupport = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("otherDiscountPercent")
  private String otherDiscountPercent = null;

  @JsonProperty("paymentCycle")
  private String paymentCycle = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("perSeatPrice")
  private String perSeatPrice = null;

  @JsonProperty("planClassification")
  private String planClassification = null;

  @JsonProperty("planFeatureSets")
  private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("seatDiscounts")
  private java.util.List<SeatDiscount> seatDiscounts = new java.util.ArrayList<SeatDiscount>();

  @JsonProperty("supportIncidentFee")
  private String supportIncidentFee = null;

  @JsonProperty("supportPlanFee")
  private String supportPlanFee = null;

  public BillingPlan appStoreProducts(java.util.List<AppStoreProduct> appStoreProducts) {
    this.appStoreProducts = appStoreProducts;
    return this;
  }

  public BillingPlan addAppStoreProductsItem(AppStoreProduct appStoreProductsItem) {
    this.appStoreProducts.add(appStoreProductsItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return appStoreProducts
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public java.util.List<AppStoreProduct> getAppStoreProducts() {
    return appStoreProducts;
  }

  public void setAppStoreProducts(java.util.List<AppStoreProduct> appStoreProducts) {
    this.appStoreProducts = appStoreProducts;
  }

  public BillingPlan currencyPlanPrices(java.util.List<CurrencyPlanPrice> currencyPlanPrices) {
    this.currencyPlanPrices = currencyPlanPrices;
    return this;
  }

  public BillingPlan addCurrencyPlanPricesItem(CurrencyPlanPrice currencyPlanPricesItem) {
    this.currencyPlanPrices.add(currencyPlanPricesItem);
    return this;
  }

   /**
   * Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.
   * @return currencyPlanPrices
  **/
  @ApiModelProperty(example = "null", value = "Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.")
  public java.util.List<CurrencyPlanPrice> getCurrencyPlanPrices() {
    return currencyPlanPrices;
  }

  public void setCurrencyPlanPrices(java.util.List<CurrencyPlanPrice> currencyPlanPrices) {
    this.currencyPlanPrices = currencyPlanPrices;
  }

  public BillingPlan enableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
    return this;
  }

   /**
   * When set to **true**, then customer support is provided as part of the account plan.
   * @return enableSupport
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, then customer support is provided as part of the account plan.")
  public String getEnableSupport() {
    return enableSupport;
  }

  public void setEnableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
  }

  public BillingPlan includedSeats(String includedSeats) {
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

  public BillingPlan otherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
    return this;
  }

   /**
   * 
   * @return otherDiscountPercent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOtherDiscountPercent() {
    return otherDiscountPercent;
  }

  public void setOtherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
  }

  public BillingPlan paymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

   /**
   *  The payment cycle associated with the plan. The possible values are: Monthly or Annually. 
   * @return paymentCycle
  **/
  @ApiModelProperty(example = "null", value = " The payment cycle associated with the plan. The possible values are: Monthly or Annually. ")
  public String getPaymentCycle() {
    return paymentCycle;
  }

  public void setPaymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
  }

  public BillingPlan paymentMethod(String paymentMethod) {
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

  public BillingPlan perSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
    return this;
  }

   /**
   * The per seat price for the plan.
   * @return perSeatPrice
  **/
  @ApiModelProperty(example = "null", value = "The per seat price for the plan.")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }

  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }

  public BillingPlan planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }

   /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
   * @return planClassification
  **/
  @ApiModelProperty(example = "null", value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  public String getPlanClassification() {
    return planClassification;
  }

  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }

  public BillingPlan planFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
    return this;
  }

  public BillingPlan addPlanFeatureSetsItem(FeatureSet planFeatureSetsItem) {
    this.planFeatureSets.add(planFeatureSetsItem);
    return this;
  }

   /**
   * 
   * @return planFeatureSets
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<FeatureSet> getPlanFeatureSets() {
    return planFeatureSets;
  }

  public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
  }

  public BillingPlan planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * 
   * @return planId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public BillingPlan planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * The name of the Billing Plan.
   * @return planName
  **/
  @ApiModelProperty(example = "null", value = "The name of the Billing Plan.")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public BillingPlan seatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
    return this;
  }

  public BillingPlan addSeatDiscountsItem(SeatDiscount seatDiscountsItem) {
    this.seatDiscounts.add(seatDiscountsItem);
    return this;
  }

   /**
   * 
   * @return seatDiscounts
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<SeatDiscount> getSeatDiscounts() {
    return seatDiscounts;
  }

  public void setSeatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
  }

  public BillingPlan supportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
    return this;
  }

   /**
   * The support incident fee charged for each support incident.
   * @return supportIncidentFee
  **/
  @ApiModelProperty(example = "null", value = "The support incident fee charged for each support incident.")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }

  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }

  public BillingPlan supportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
    return this;
  }

   /**
   * The support plan fee charged for this plan.
   * @return supportPlanFee
  **/
  @ApiModelProperty(example = "null", value = "The support plan fee charged for this plan.")
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
    return Objects.equals(this.appStoreProducts, billingPlan.appStoreProducts) &&
        Objects.equals(this.currencyPlanPrices, billingPlan.currencyPlanPrices) &&
        Objects.equals(this.enableSupport, billingPlan.enableSupport) &&
        Objects.equals(this.includedSeats, billingPlan.includedSeats) &&
        Objects.equals(this.otherDiscountPercent, billingPlan.otherDiscountPercent) &&
        Objects.equals(this.paymentCycle, billingPlan.paymentCycle) &&
        Objects.equals(this.paymentMethod, billingPlan.paymentMethod) &&
        Objects.equals(this.perSeatPrice, billingPlan.perSeatPrice) &&
        Objects.equals(this.planClassification, billingPlan.planClassification) &&
        Objects.equals(this.planFeatureSets, billingPlan.planFeatureSets) &&
        Objects.equals(this.planId, billingPlan.planId) &&
        Objects.equals(this.planName, billingPlan.planName) &&
        Objects.equals(this.seatDiscounts, billingPlan.seatDiscounts) &&
        Objects.equals(this.supportIncidentFee, billingPlan.supportIncidentFee) &&
        Objects.equals(this.supportPlanFee, billingPlan.supportPlanFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreProducts, currencyPlanPrices, enableSupport, includedSeats, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, seatDiscounts, supportIncidentFee, supportPlanFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlan {\n");
    
    sb.append("    appStoreProducts: ").append(toIndentedString(appStoreProducts)).append("\n");
    sb.append("    currencyPlanPrices: ").append(toIndentedString(currencyPlanPrices)).append("\n");
    sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    otherDiscountPercent: ").append(toIndentedString(otherDiscountPercent)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    seatDiscounts: ").append(toIndentedString(seatDiscounts)).append("\n");
    sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
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

