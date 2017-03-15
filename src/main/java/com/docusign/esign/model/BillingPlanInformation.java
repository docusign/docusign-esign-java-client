package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AppStoreReceipt;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.PlanInformation;
import com.docusign.esign.model.ReferralInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPlanInformation   {
  
  private AppStoreReceipt appStoreReceipt = null;
  private AccountAddress billingAddress = null;
  private CreditCardInformation creditCardInformation = null;
  private String downgradeReason = null;
  private String enableSupport = null;
  private String includedSeats = null;
  private String incrementalSeats = null;
  private PlanInformation planInformation = null;
  private ReferralInformation referralInformation = null;
  private String renewalStatus = null;
  private String saleDiscountAmount = null;
  private String saleDiscountFixedAmount = null;
  private String saleDiscountPercent = null;
  private String saleDiscountPeriods = null;
  private String saleDiscountSeatPriceOverride = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appStoreReceipt")
  public AppStoreReceipt getAppStoreReceipt() {
    return appStoreReceipt;
  }
  public void setAppStoreReceipt(AppStoreReceipt appStoreReceipt) {
    this.appStoreReceipt = appStoreReceipt;
  }

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("downgradeReason")
  public String getDowngradeReason() {
    return downgradeReason;
  }
  public void setDowngradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
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
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("incrementalSeats")
  public String getIncrementalSeats() {
    return incrementalSeats;
  }
  public void setIncrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planInformation")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }
  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
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
  @JsonProperty("renewalStatus")
  public String getRenewalStatus() {
    return renewalStatus;
  }
  public void setRenewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("saleDiscountAmount")
  public String getSaleDiscountAmount() {
    return saleDiscountAmount;
  }
  public void setSaleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("saleDiscountFixedAmount")
  public String getSaleDiscountFixedAmount() {
    return saleDiscountFixedAmount;
  }
  public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("saleDiscountPercent")
  public String getSaleDiscountPercent() {
    return saleDiscountPercent;
  }
  public void setSaleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("saleDiscountPeriods")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }
  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("saleDiscountSeatPriceOverride")
  public String getSaleDiscountSeatPriceOverride() {
    return saleDiscountSeatPriceOverride;
  }
  public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanInformation billingPlanInformation = (BillingPlanInformation) o;

    return true && Objects.equals(appStoreReceipt, billingPlanInformation.appStoreReceipt) &&
        Objects.equals(billingAddress, billingPlanInformation.billingAddress) &&
        Objects.equals(creditCardInformation, billingPlanInformation.creditCardInformation) &&
        Objects.equals(downgradeReason, billingPlanInformation.downgradeReason) &&
        Objects.equals(enableSupport, billingPlanInformation.enableSupport) &&
        Objects.equals(includedSeats, billingPlanInformation.includedSeats) &&
        Objects.equals(incrementalSeats, billingPlanInformation.incrementalSeats) &&
        Objects.equals(planInformation, billingPlanInformation.planInformation) &&
        Objects.equals(referralInformation, billingPlanInformation.referralInformation) &&
        Objects.equals(renewalStatus, billingPlanInformation.renewalStatus) &&
        Objects.equals(saleDiscountAmount, billingPlanInformation.saleDiscountAmount) &&
        Objects.equals(saleDiscountFixedAmount, billingPlanInformation.saleDiscountFixedAmount) &&
        Objects.equals(saleDiscountPercent, billingPlanInformation.saleDiscountPercent) &&
        Objects.equals(saleDiscountPeriods, billingPlanInformation.saleDiscountPeriods) &&
        Objects.equals(saleDiscountSeatPriceOverride, billingPlanInformation.saleDiscountSeatPriceOverride)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreReceipt, billingAddress, creditCardInformation, downgradeReason, enableSupport, includedSeats, incrementalSeats, planInformation, referralInformation, renewalStatus, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanInformation {\n");
    
    if (appStoreReceipt != null)
      sb.append("    appStoreReceipt: ").append(toIndentedString(appStoreReceipt)).append("\n");
    if (billingAddress != null)
      sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    if (creditCardInformation != null)
      sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    if (downgradeReason != null)
      sb.append("    downgradeReason: ").append(toIndentedString(downgradeReason)).append("\n");
    if (enableSupport != null)
      sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    if (includedSeats != null)
      sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    if (incrementalSeats != null)
      sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
    if (planInformation != null)
      sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    if (referralInformation != null)
      sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
    if (renewalStatus != null)
      sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
    if (saleDiscountAmount != null)
      sb.append("    saleDiscountAmount: ").append(toIndentedString(saleDiscountAmount)).append("\n");
    if (saleDiscountFixedAmount != null)
      sb.append("    saleDiscountFixedAmount: ").append(toIndentedString(saleDiscountFixedAmount)).append("\n");
    if (saleDiscountPercent != null)
      sb.append("    saleDiscountPercent: ").append(toIndentedString(saleDiscountPercent)).append("\n");
    if (saleDiscountPeriods != null)
      sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
    if (saleDiscountSeatPriceOverride != null)
      sb.append("    saleDiscountSeatPriceOverride: ").append(toIndentedString(saleDiscountSeatPriceOverride)).append("\n");
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

