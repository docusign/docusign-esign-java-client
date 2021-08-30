package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PlanInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DowngradeBillingPlanInformation
 */

public class DowngradeBillingPlanInformation {
  @JsonProperty("downgradeEventType")
  private String downgradeEventType = null;

  @JsonProperty("planInformation")
  private PlanInformation planInformation = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("saleDiscount")
  private String saleDiscount = null;

  @JsonProperty("saleDiscountPeriods")
  private String saleDiscountPeriods = null;

  @JsonProperty("saleDiscountType")
  private String saleDiscountType = null;

  public DowngradeBillingPlanInformation downgradeEventType(String downgradeEventType) {
    this.downgradeEventType = downgradeEventType;
    return this;
  }

   /**
   * 
   * @return downgradeEventType
  **/
  @ApiModelProperty(value = "")
  public String getDowngradeEventType() {
    return downgradeEventType;
  }

  public void setDowngradeEventType(String downgradeEventType) {
    this.downgradeEventType = downgradeEventType;
  }

  public DowngradeBillingPlanInformation planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(value = "")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public DowngradeBillingPlanInformation promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * 
   * @return promoCode
  **/
  @ApiModelProperty(value = "")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public DowngradeBillingPlanInformation saleDiscount(String saleDiscount) {
    this.saleDiscount = saleDiscount;
    return this;
  }

   /**
   * 
   * @return saleDiscount
  **/
  @ApiModelProperty(value = "")
  public String getSaleDiscount() {
    return saleDiscount;
  }

  public void setSaleDiscount(String saleDiscount) {
    this.saleDiscount = saleDiscount;
  }

  public DowngradeBillingPlanInformation saleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
    return this;
  }

   /**
   * 
   * @return saleDiscountPeriods
  **/
  @ApiModelProperty(value = "")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }

  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }

  public DowngradeBillingPlanInformation saleDiscountType(String saleDiscountType) {
    this.saleDiscountType = saleDiscountType;
    return this;
  }

   /**
   * 
   * @return saleDiscountType
  **/
  @ApiModelProperty(value = "")
  public String getSaleDiscountType() {
    return saleDiscountType;
  }

  public void setSaleDiscountType(String saleDiscountType) {
    this.saleDiscountType = saleDiscountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowngradeBillingPlanInformation downgradeBillingPlanInformation = (DowngradeBillingPlanInformation) o;
    return Objects.equals(this.downgradeEventType, downgradeBillingPlanInformation.downgradeEventType) &&
        Objects.equals(this.planInformation, downgradeBillingPlanInformation.planInformation) &&
        Objects.equals(this.promoCode, downgradeBillingPlanInformation.promoCode) &&
        Objects.equals(this.saleDiscount, downgradeBillingPlanInformation.saleDiscount) &&
        Objects.equals(this.saleDiscountPeriods, downgradeBillingPlanInformation.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountType, downgradeBillingPlanInformation.saleDiscountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downgradeEventType, planInformation, promoCode, saleDiscount, saleDiscountPeriods, saleDiscountType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradeBillingPlanInformation {\n");
    
    sb.append("    downgradeEventType: ").append(toIndentedString(downgradeEventType)).append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    saleDiscount: ").append(toIndentedString(saleDiscount)).append("\n");
    sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
    sb.append("    saleDiscountType: ").append(toIndentedString(saleDiscountType)).append("\n");
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

