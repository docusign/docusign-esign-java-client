package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AddOn;
import com.docusign.esign.model.DowngradePlanUpdateResponse;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.SeatDiscount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about an account billing plan..
 *
 */
@Schema(description = "Contains information about an account billing plan.")

public class AccountBillingPlan {
  @JsonProperty("addOns")
  private java.util.List<AddOn> addOns = null;

  @JsonProperty("appStoreReceiptExpirationDate")
  private String appStoreReceiptExpirationDate = null;

  @JsonProperty("appStoreReceiptPurchaseDate")
  private String appStoreReceiptPurchaseDate = null;

  @JsonProperty("canCancelRenewal")
  private String canCancelRenewal = null;

  @JsonProperty("canUpgrade")
  private String canUpgrade = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("downgradePlanInformation")
  private DowngradePlanUpdateResponse downgradePlanInformation = null;

  @JsonProperty("enableSupport")
  private String enableSupport = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("incrementalSeats")
  private String incrementalSeats = null;

  @JsonProperty("isDowngrade")
  private String isDowngrade = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

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

  @JsonProperty("planStartDate")
  private String planStartDate = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("renewalDate")
  private String renewalDate = null;

  @JsonProperty("renewalStatus")
  private String renewalStatus = null;

  @JsonProperty("seatDiscounts")
  private java.util.List<SeatDiscount> seatDiscounts = null;

  @JsonProperty("subscriptionStartDate")
  private String subscriptionStartDate = null;

  @JsonProperty("supportIncidentFee")
  private String supportIncidentFee = null;

  @JsonProperty("supportPlanFee")
  private String supportPlanFee = null;

  @JsonProperty("taxExemptId")
  private String taxExemptId = null;


  /**
   * addOns.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan addOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
    return this;
  }
  
  /**
   * addAddOnsItem.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan addAddOnsItem(AddOn addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new java.util.ArrayList<>();
    }
    this.addOns.add(addOnsItem);
    return this;
  }

  /**
   * Reserved:.
   * @return addOns
   **/
  @Schema(description = "Reserved:")
  public java.util.List<AddOn> getAddOns() {
    return addOns;
  }

  /**
   * setAddOns.
   **/
  public void setAddOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
  }


  /**
   * appStoreReceiptExpirationDate.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan appStoreReceiptExpirationDate(String appStoreReceiptExpirationDate) {
    this.appStoreReceiptExpirationDate = appStoreReceiptExpirationDate;
    return this;
  }

  /**
   * .
   * @return appStoreReceiptExpirationDate
   **/
  @Schema(description = "")
  public String getAppStoreReceiptExpirationDate() {
    return appStoreReceiptExpirationDate;
  }

  /**
   * setAppStoreReceiptExpirationDate.
   **/
  public void setAppStoreReceiptExpirationDate(String appStoreReceiptExpirationDate) {
    this.appStoreReceiptExpirationDate = appStoreReceiptExpirationDate;
  }


  /**
   * appStoreReceiptPurchaseDate.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan appStoreReceiptPurchaseDate(String appStoreReceiptPurchaseDate) {
    this.appStoreReceiptPurchaseDate = appStoreReceiptPurchaseDate;
    return this;
  }

  /**
   * .
   * @return appStoreReceiptPurchaseDate
   **/
  @Schema(description = "")
  public String getAppStoreReceiptPurchaseDate() {
    return appStoreReceiptPurchaseDate;
  }

  /**
   * setAppStoreReceiptPurchaseDate.
   **/
  public void setAppStoreReceiptPurchaseDate(String appStoreReceiptPurchaseDate) {
    this.appStoreReceiptPurchaseDate = appStoreReceiptPurchaseDate;
  }


  /**
   * canCancelRenewal.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan canCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return canCancelRenewal
   **/
  @Schema(description = "Reserved: TBD")
  public String getCanCancelRenewal() {
    return canCancelRenewal;
  }

  /**
   * setCanCancelRenewal.
   **/
  public void setCanCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
  }


  /**
   * canUpgrade.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan canUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
    return this;
  }

  /**
   * When set to **true**, specifies that you can upgrade the account through the API..
   * @return canUpgrade
   **/
  @Schema(description = "When set to **true**, specifies that you can upgrade the account through the API.")
  public String getCanUpgrade() {
    return canUpgrade;
  }

  /**
   * setCanUpgrade.
   **/
  public void setCanUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
  }


  /**
   * currencyCode.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Specifies the ISO currency code for the account..
   * @return currencyCode
   **/
  @Schema(description = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * setCurrencyCode.
   **/
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * downgradePlanInformation.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan downgradePlanInformation(DowngradePlanUpdateResponse downgradePlanInformation) {
    this.downgradePlanInformation = downgradePlanInformation;
    return this;
  }

  /**
   * .
   * @return downgradePlanInformation
   **/
  @Schema(description = "")
  public DowngradePlanUpdateResponse getDowngradePlanInformation() {
    return downgradePlanInformation;
  }

  /**
   * setDowngradePlanInformation.
   **/
  public void setDowngradePlanInformation(DowngradePlanUpdateResponse downgradePlanInformation) {
    this.downgradePlanInformation = downgradePlanInformation;
  }


  /**
   * enableSupport.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan enableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
    return this;
  }

  /**
   * When set to **true**, then customer support is provided as part of the account plan..
   * @return enableSupport
   **/
  @Schema(description = "When set to **true**, then customer support is provided as part of the account plan.")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan includedSeats(String includedSeats) {
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan incrementalSeats(String incrementalSeats) {
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
   * isDowngrade.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan isDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
    return this;
  }

  /**
   * .
   * @return isDowngrade
   **/
  @Schema(description = "")
  public String getIsDowngrade() {
    return isDowngrade;
  }

  /**
   * setIsDowngrade.
   **/
  public void setIsDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
  }


  /**
   * notificationType.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * .
   * @return notificationType
   **/
  @Schema(description = "")
  public String getNotificationType() {
    return notificationType;
  }

  /**
   * setNotificationType.
   **/
  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }


  /**
   * otherDiscountPercent.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan otherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
    return this;
  }

  /**
   *  Any other percentage discount for the plan. .
   * @return otherDiscountPercent
   **/
  @Schema(description = " Any other percentage discount for the plan. ")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan paymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

  /**
   * .
   * @return paymentCycle
   **/
  @Schema(description = "")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   *  The payment method used with the plan. The possible values are: CreditCard, PurchaseOrder, Premium, or Freemium. .
   * @return paymentMethod
   **/
  @Schema(description = " The payment method used with the plan. The possible values are: CreditCard, PurchaseOrder, Premium, or Freemium. ")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan perSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
    return this;
  }

  /**
   * .
   * @return perSeatPrice
   **/
  @Schema(description = "")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }

  /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free..
   * @return planClassification
   **/
  @Schema(description = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan planFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
    return this;
  }
  
  /**
   * addPlanFeatureSetsItem.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan addPlanFeatureSetsItem(FeatureSet planFeatureSetsItem) {
    if (this.planFeatureSets == null) {
      this.planFeatureSets = new java.util.ArrayList<>();
    }
    this.planFeatureSets.add(planFeatureSetsItem);
    return this;
  }

  /**
   * A complex type that sets the feature sets for the account. It contains the following information (all string content):  * currencyFeatureSetPrices - Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, seatFee that are configured for this plan feature set. * envelopeFee - An incremental envelope cost for plans with envelope overages (when isEnabled=true). * featureSetId - A unique ID for the feature set. * fixedFee - A one-time fee associated with the plan (when isEnabled=true). * isActive - Specifies whether the feature set is actively set as part of the plan. * isEnabled - Specifies whether the feature set is actively enabled as part of the plan. * name - The name of the feature set. * seatFee - An incremental seat cost for seat-based plans (when isEnabled=true). .
   * @return planFeatureSets
   **/
  @Schema(description = "A complex type that sets the feature sets for the account. It contains the following information (all string content):  * currencyFeatureSetPrices - Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, seatFee that are configured for this plan feature set. * envelopeFee - An incremental envelope cost for plans with envelope overages (when isEnabled=true). * featureSetId - A unique ID for the feature set. * fixedFee - A one-time fee associated with the plan (when isEnabled=true). * isActive - Specifies whether the feature set is actively set as part of the plan. * isEnabled - Specifies whether the feature set is actively enabled as part of the plan. * name - The name of the feature set. * seatFee - An incremental seat cost for seat-based plans (when isEnabled=true). ")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * .
   * @return planId
   **/
  @Schema(description = "")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * The name of the Billing Plan..
   * @return planName
   **/
  @Schema(description = "The name of the Billing Plan.")
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
   * planStartDate.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan planStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
    return this;
  }

  /**
   * .
   * @return planStartDate
   **/
  @Schema(description = "")
  public String getPlanStartDate() {
    return planStartDate;
  }

  /**
   * setPlanStartDate.
   **/
  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }


  /**
   * productId.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * .
   * @return productId
   **/
  @Schema(description = "")
  public String getProductId() {
    return productId;
  }

  /**
   * setProductId.
   **/
  public void setProductId(String productId) {
    this.productId = productId;
  }


  /**
   * renewalDate.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan renewalDate(String renewalDate) {
    this.renewalDate = renewalDate;
    return this;
  }

  /**
   * .
   * @return renewalDate
   **/
  @Schema(description = "")
  public String getRenewalDate() {
    return renewalDate;
  }

  /**
   * setRenewalDate.
   **/
  public void setRenewalDate(String renewalDate) {
    this.renewalDate = renewalDate;
  }


  /**
   * renewalStatus.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan renewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
    return this;
  }

  /**
   * The renewal status for the account. The acceptable values are:  * auto: The account automatically renews. * queued_for_close: Account will be closed at the billingPeriodEndDate. * queued_for_downgrade: Account will be downgraded at the billingPeriodEndDate..
   * @return renewalStatus
   **/
  @Schema(description = "The renewal status for the account. The acceptable values are:  * auto: The account automatically renews. * queued_for_close: Account will be closed at the billingPeriodEndDate. * queued_for_downgrade: Account will be downgraded at the billingPeriodEndDate.")
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
   * seatDiscounts.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan seatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
    return this;
  }
  
  /**
   * addSeatDiscountsItem.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan addSeatDiscountsItem(SeatDiscount seatDiscountsItem) {
    if (this.seatDiscounts == null) {
      this.seatDiscounts = new java.util.ArrayList<>();
    }
    this.seatDiscounts.add(seatDiscountsItem);
    return this;
  }

  /**
   *  A complex type that contains any seat discount information.  Values are: BeginSeatCount, EndSeatCount, and SeatDiscountPercent.  .
   * @return seatDiscounts
   **/
  @Schema(description = " A complex type that contains any seat discount information.  Values are: BeginSeatCount, EndSeatCount, and SeatDiscountPercent.  ")
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
   * subscriptionStartDate.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan subscriptionStartDate(String subscriptionStartDate) {
    this.subscriptionStartDate = subscriptionStartDate;
    return this;
  }

  /**
   * .
   * @return subscriptionStartDate
   **/
  @Schema(description = "")
  public String getSubscriptionStartDate() {
    return subscriptionStartDate;
  }

  /**
   * setSubscriptionStartDate.
   **/
  public void setSubscriptionStartDate(String subscriptionStartDate) {
    this.subscriptionStartDate = subscriptionStartDate;
  }


  /**
   * supportIncidentFee.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan supportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
    return this;
  }

  /**
   * The support incident fee charged for each support incident..
   * @return supportIncidentFee
   **/
  @Schema(description = "The support incident fee charged for each support incident.")
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
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan supportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
    return this;
  }

  /**
   * The support plan fee charged for this plan..
   * @return supportPlanFee
   **/
  @Schema(description = "The support plan fee charged for this plan.")
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
   * taxExemptId.
   *
   * @return AccountBillingPlan
   **/
  public AccountBillingPlan taxExemptId(String taxExemptId) {
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
    AccountBillingPlan accountBillingPlan = (AccountBillingPlan) o;
    return Objects.equals(this.addOns, accountBillingPlan.addOns) &&
        Objects.equals(this.appStoreReceiptExpirationDate, accountBillingPlan.appStoreReceiptExpirationDate) &&
        Objects.equals(this.appStoreReceiptPurchaseDate, accountBillingPlan.appStoreReceiptPurchaseDate) &&
        Objects.equals(this.canCancelRenewal, accountBillingPlan.canCancelRenewal) &&
        Objects.equals(this.canUpgrade, accountBillingPlan.canUpgrade) &&
        Objects.equals(this.currencyCode, accountBillingPlan.currencyCode) &&
        Objects.equals(this.downgradePlanInformation, accountBillingPlan.downgradePlanInformation) &&
        Objects.equals(this.enableSupport, accountBillingPlan.enableSupport) &&
        Objects.equals(this.includedSeats, accountBillingPlan.includedSeats) &&
        Objects.equals(this.incrementalSeats, accountBillingPlan.incrementalSeats) &&
        Objects.equals(this.isDowngrade, accountBillingPlan.isDowngrade) &&
        Objects.equals(this.notificationType, accountBillingPlan.notificationType) &&
        Objects.equals(this.otherDiscountPercent, accountBillingPlan.otherDiscountPercent) &&
        Objects.equals(this.paymentCycle, accountBillingPlan.paymentCycle) &&
        Objects.equals(this.paymentMethod, accountBillingPlan.paymentMethod) &&
        Objects.equals(this.perSeatPrice, accountBillingPlan.perSeatPrice) &&
        Objects.equals(this.planClassification, accountBillingPlan.planClassification) &&
        Objects.equals(this.planFeatureSets, accountBillingPlan.planFeatureSets) &&
        Objects.equals(this.planId, accountBillingPlan.planId) &&
        Objects.equals(this.planName, accountBillingPlan.planName) &&
        Objects.equals(this.planStartDate, accountBillingPlan.planStartDate) &&
        Objects.equals(this.productId, accountBillingPlan.productId) &&
        Objects.equals(this.renewalDate, accountBillingPlan.renewalDate) &&
        Objects.equals(this.renewalStatus, accountBillingPlan.renewalStatus) &&
        Objects.equals(this.seatDiscounts, accountBillingPlan.seatDiscounts) &&
        Objects.equals(this.subscriptionStartDate, accountBillingPlan.subscriptionStartDate) &&
        Objects.equals(this.supportIncidentFee, accountBillingPlan.supportIncidentFee) &&
        Objects.equals(this.supportPlanFee, accountBillingPlan.supportPlanFee) &&
        Objects.equals(this.taxExemptId, accountBillingPlan.taxExemptId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(addOns, appStoreReceiptExpirationDate, appStoreReceiptPurchaseDate, canCancelRenewal, canUpgrade, currencyCode, downgradePlanInformation, enableSupport, includedSeats, incrementalSeats, isDowngrade, notificationType, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, planStartDate, productId, renewalDate, renewalStatus, seatDiscounts, subscriptionStartDate, supportIncidentFee, supportPlanFee, taxExemptId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingPlan {\n");
    
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    appStoreReceiptExpirationDate: ").append(toIndentedString(appStoreReceiptExpirationDate)).append("\n");
    sb.append("    appStoreReceiptPurchaseDate: ").append(toIndentedString(appStoreReceiptPurchaseDate)).append("\n");
    sb.append("    canCancelRenewal: ").append(toIndentedString(canCancelRenewal)).append("\n");
    sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    downgradePlanInformation: ").append(toIndentedString(downgradePlanInformation)).append("\n");
    sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
    sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    otherDiscountPercent: ").append(toIndentedString(otherDiscountPercent)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    renewalDate: ").append(toIndentedString(renewalDate)).append("\n");
    sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
    sb.append("    seatDiscounts: ").append(toIndentedString(seatDiscounts)).append("\n");
    sb.append("    subscriptionStartDate: ").append(toIndentedString(subscriptionStartDate)).append("\n");
    sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
    sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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

