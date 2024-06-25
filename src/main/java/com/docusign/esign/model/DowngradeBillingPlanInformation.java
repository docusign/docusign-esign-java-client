package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PlanInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DowngradeBillingPlanInformation.
 *
 */

public class DowngradeBillingPlanInformation implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * downgradeEventType.
   *
   * @return DowngradeBillingPlanInformation
   **/
  public DowngradeBillingPlanInformation downgradeEventType(String downgradeEventType) {
    this.downgradeEventType = downgradeEventType;
    return this;
  }

  /**
   * .
   * @return downgradeEventType
   **/
  @Schema(description = "")
  public String getDowngradeEventType() {
    return downgradeEventType;
  }

  /**
   * setDowngradeEventType.
   **/
  public void setDowngradeEventType(String downgradeEventType) {
    this.downgradeEventType = downgradeEventType;
  }


  /**
   * planInformation.
   *
   * @return DowngradeBillingPlanInformation
   **/
  public DowngradeBillingPlanInformation planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

  /**
   * An object used to identify the features and attributes of the account being created..
   * @return planInformation
   **/
  @Schema(description = "An object used to identify the features and attributes of the account being created.")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  /**
   * setPlanInformation.
   **/
  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }


  /**
   * promoCode.
   *
   * @return DowngradeBillingPlanInformation
   **/
  public DowngradeBillingPlanInformation promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * .
   * @return promoCode
   **/
  @Schema(description = "")
  public String getPromoCode() {
    return promoCode;
  }

  /**
   * setPromoCode.
   **/
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }


  /**
   * saleDiscount.
   *
   * @return DowngradeBillingPlanInformation
   **/
  public DowngradeBillingPlanInformation saleDiscount(String saleDiscount) {
    this.saleDiscount = saleDiscount;
    return this;
  }

  /**
   * .
   * @return saleDiscount
   **/
  @Schema(description = "")
  public String getSaleDiscount() {
    return saleDiscount;
  }

  /**
   * setSaleDiscount.
   **/
  public void setSaleDiscount(String saleDiscount) {
    this.saleDiscount = saleDiscount;
  }


  /**
   * saleDiscountPeriods.
   *
   * @return DowngradeBillingPlanInformation
   **/
  public DowngradeBillingPlanInformation saleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
    return this;
  }

  /**
   * .
   * @return saleDiscountPeriods
   **/
  @Schema(description = "")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }

  /**
   * setSaleDiscountPeriods.
   **/
  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }


  /**
   * saleDiscountType.
   *
   * @return DowngradeBillingPlanInformation
   **/
  public DowngradeBillingPlanInformation saleDiscountType(String saleDiscountType) {
    this.saleDiscountType = saleDiscountType;
    return this;
  }

  /**
   * .
   * @return saleDiscountType
   **/
  @Schema(description = "")
  public String getSaleDiscountType() {
    return saleDiscountType;
  }

  /**
   * setSaleDiscountType.
   **/
  public void setSaleDiscountType(String saleDiscountType) {
    this.saleDiscountType = saleDiscountType;
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
    DowngradeBillingPlanInformation downgradeBillingPlanInformation = (DowngradeBillingPlanInformation) o;
    return Objects.equals(this.downgradeEventType, downgradeBillingPlanInformation.downgradeEventType) &&
        Objects.equals(this.planInformation, downgradeBillingPlanInformation.planInformation) &&
        Objects.equals(this.promoCode, downgradeBillingPlanInformation.promoCode) &&
        Objects.equals(this.saleDiscount, downgradeBillingPlanInformation.saleDiscount) &&
        Objects.equals(this.saleDiscountPeriods, downgradeBillingPlanInformation.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountType, downgradeBillingPlanInformation.saleDiscountType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(downgradeEventType, planInformation, promoCode, saleDiscount, saleDiscountPeriods, saleDiscountType);
  }


  /**
   * Converts the given object to string.
   */
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

