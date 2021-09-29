package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AppStoreProduct;
import com.docusign.esign.model.CurrencyPlanPrice;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.SeatDiscount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about a billing plan..
 *
 */
@ApiModel(description = "Contains information about a billing plan.")

public class BillingPlan {
  @JsonProperty("appStoreProducts")
  private java.util.List<AppStoreProduct> appStoreProducts = null;

  @JsonProperty("currencyPlanPrices")
  private java.util.List<CurrencyPlanPrice> currencyPlanPrices = null;

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
  private java.util.List<FeatureSet> planFeatureSets = null;

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("seatDiscounts")
  private java.util.List<SeatDiscount> seatDiscounts = null;

  @JsonProperty("supportIncidentFee")
  private String supportIncidentFee = null;

  @JsonProperty("supportPlanFee")
  private String supportPlanFee = null;


  /**
   * appStoreProducts.
   *
   * @return BillingPlan
   **/
  public BillingPlan appStoreProducts(java.util.List<AppStoreProduct> appStoreProducts) {
    this.appStoreProducts = appStoreProducts;
    return this;
  }
  
  /**
   * addAppStoreProductsItem.
   *
   * @return BillingPlan
   **/
  public BillingPlan addAppStoreProductsItem(AppStoreProduct appStoreProductsItem) {
    if (this.appStoreProducts == null) {
      this.appStoreProducts = new java.util.ArrayList<AppStoreProduct>();
    }
    this.appStoreProducts.add(appStoreProductsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return appStoreProducts
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<AppStoreProduct> getAppStoreProducts() {
    return appStoreProducts;
  }

  /**
   * setAppStoreProducts.
   **/
  public void setAppStoreProducts(java.util.List<AppStoreProduct> appStoreProducts) {
    this.appStoreProducts = appStoreProducts;
  }


  /**
   * currencyPlanPrices.
   *
   * @return BillingPlan
   **/
  public BillingPlan currencyPlanPrices(java.util.List<CurrencyPlanPrice> currencyPlanPrices) {
    this.currencyPlanPrices = currencyPlanPrices;
    return this;
  }
  
  /**
   * addCurrencyPlanPricesItem.
   *
   * @return BillingPlan
   **/
  public BillingPlan addCurrencyPlanPricesItem(CurrencyPlanPrice currencyPlanPricesItem) {
    if (this.currencyPlanPrices == null) {
      this.currencyPlanPrices = new java.util.ArrayList<CurrencyPlanPrice>();
    }
    this.currencyPlanPrices.add(currencyPlanPricesItem);
    return this;
  }

  /**
   * Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set..
   * @return currencyPlanPrices
   **/
  @ApiModelProperty(value = "Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.")
  public java.util.List<CurrencyPlanPrice> getCurrencyPlanPrices() {
    return currencyPlanPrices;
  }

  /**
   * setCurrencyPlanPrices.
   **/
  public void setCurrencyPlanPrices(java.util.List<CurrencyPlanPrice> currencyPlanPrices) {
    this.currencyPlanPrices = currencyPlanPrices;
  }


  /**
   * enableSupport.
   *
   * @return BillingPlan
   **/
  public BillingPlan enableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
    return this;
  }

  /**
   * When set to **true**, then customer support is provided as part of the account plan..
   * @return enableSupport
   **/
  @ApiModelProperty(value = "When set to **true**, then customer support is provided as part of the account plan.")
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
   * @return BillingPlan
   **/
  public BillingPlan includedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
    return this;
  }

  /**
   * The number of seats (users) included..
   * @return includedSeats
   **/
  @ApiModelProperty(value = "The number of seats (users) included.")
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
   * otherDiscountPercent.
   *
   * @return BillingPlan
   **/
  public BillingPlan otherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
    return this;
  }

  /**
   * .
   * @return otherDiscountPercent
   **/
  @ApiModelProperty(value = "")
  public String getOtherDiscountPercent() {
    return otherDiscountPercent;
  }

  /**
   * setOtherDiscountPercent.
   **/
  public void setOtherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
  }


  /**
   * paymentCycle.
   *
   * @return BillingPlan
   **/
  public BillingPlan paymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

  /**
   *  The payment cycle associated with the plan. The possible values are: Monthly or Annually. .
   * @return paymentCycle
   **/
  @ApiModelProperty(value = " The payment cycle associated with the plan. The possible values are: Monthly or Annually. ")
  public String getPaymentCycle() {
    return paymentCycle;
  }

  /**
   * setPaymentCycle.
   **/
  public void setPaymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
  }


  /**
   * paymentMethod.
   *
   * @return BillingPlan
   **/
  public BillingPlan paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * .
   * @return paymentMethod
   **/
  @ApiModelProperty(value = "")
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
   * perSeatPrice.
   *
   * @return BillingPlan
   **/
  public BillingPlan perSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
    return this;
  }

  /**
   * The per seat price for the plan..
   * @return perSeatPrice
   **/
  @ApiModelProperty(value = "The per seat price for the plan.")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }

  /**
   * setPerSeatPrice.
   **/
  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }


  /**
   * planClassification.
   *
   * @return BillingPlan
   **/
  public BillingPlan planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }

  /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free..
   * @return planClassification
   **/
  @ApiModelProperty(value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  public String getPlanClassification() {
    return planClassification;
  }

  /**
   * setPlanClassification.
   **/
  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }


  /**
   * planFeatureSets.
   *
   * @return BillingPlan
   **/
  public BillingPlan planFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
    return this;
  }
  
  /**
   * addPlanFeatureSetsItem.
   *
   * @return BillingPlan
   **/
  public BillingPlan addPlanFeatureSetsItem(FeatureSet planFeatureSetsItem) {
    if (this.planFeatureSets == null) {
      this.planFeatureSets = new java.util.ArrayList<FeatureSet>();
    }
    this.planFeatureSets.add(planFeatureSetsItem);
    return this;
  }

  /**
   * .
   * @return planFeatureSets
   **/
  @ApiModelProperty(value = "")
  public java.util.List<FeatureSet> getPlanFeatureSets() {
    return planFeatureSets;
  }

  /**
   * setPlanFeatureSets.
   **/
  public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
  }


  /**
   * planId.
   *
   * @return BillingPlan
   **/
  public BillingPlan planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * .
   * @return planId
   **/
  @ApiModelProperty(value = "")
  public String getPlanId() {
    return planId;
  }

  /**
   * setPlanId.
   **/
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  /**
   * planName.
   *
   * @return BillingPlan
   **/
  public BillingPlan planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * The name of the Billing Plan..
   * @return planName
   **/
  @ApiModelProperty(value = "The name of the Billing Plan.")
  public String getPlanName() {
    return planName;
  }

  /**
   * setPlanName.
   **/
  public void setPlanName(String planName) {
    this.planName = planName;
  }


  /**
   * seatDiscounts.
   *
   * @return BillingPlan
   **/
  public BillingPlan seatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
    return this;
  }
  
  /**
   * addSeatDiscountsItem.
   *
   * @return BillingPlan
   **/
  public BillingPlan addSeatDiscountsItem(SeatDiscount seatDiscountsItem) {
    if (this.seatDiscounts == null) {
      this.seatDiscounts = new java.util.ArrayList<SeatDiscount>();
    }
    this.seatDiscounts.add(seatDiscountsItem);
    return this;
  }

  /**
   * .
   * @return seatDiscounts
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SeatDiscount> getSeatDiscounts() {
    return seatDiscounts;
  }

  /**
   * setSeatDiscounts.
   **/
  public void setSeatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
  }


  /**
   * supportIncidentFee.
   *
   * @return BillingPlan
   **/
  public BillingPlan supportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
    return this;
  }

  /**
   * The support incident fee charged for each support incident..
   * @return supportIncidentFee
   **/
  @ApiModelProperty(value = "The support incident fee charged for each support incident.")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }

  /**
   * setSupportIncidentFee.
   **/
  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }


  /**
   * supportPlanFee.
   *
   * @return BillingPlan
   **/
  public BillingPlan supportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
    return this;
  }

  /**
   * The support plan fee charged for this plan..
   * @return supportPlanFee
   **/
  @ApiModelProperty(value = "The support plan fee charged for this plan.")
  public String getSupportPlanFee() {
    return supportPlanFee;
  }

  /**
   * setSupportPlanFee.
   **/
  public void setSupportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(appStoreProducts, currencyPlanPrices, enableSupport, includedSeats, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, seatDiscounts, supportIncidentFee, supportPlanFee);
  }


  /**
   * Converts the given object to string.
   */
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

