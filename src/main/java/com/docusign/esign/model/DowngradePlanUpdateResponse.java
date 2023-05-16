package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DowngradePlanUpdateResponse.
 *
 */

public class DowngradePlanUpdateResponse {
  @JsonProperty("accountPaymentMethod")
  private String accountPaymentMethod = null;

  @JsonProperty("discountApplied")
  private String discountApplied = null;

  @JsonProperty("downgradeEffectiveDate")
  private String downgradeEffectiveDate = null;

  @JsonProperty("downgradePaymentCycle")
  private String downgradePaymentCycle = null;

  @JsonProperty("downgradePlanId")
  private String downgradePlanId = null;

  @JsonProperty("downgradePlanName")
  private String downgradePlanName = null;

  @JsonProperty("downgradeRequestStatus")
  private String downgradeRequestStatus = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("saleDiscount")
  private String saleDiscount = null;

  @JsonProperty("saleDiscountPeriods")
  private String saleDiscountPeriods = null;

  @JsonProperty("saleDiscountType")
  private String saleDiscountType = null;


  /**
   * accountPaymentMethod.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse accountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
    return this;
  }

  /**
   * .
   * @return accountPaymentMethod
   **/
  @Schema(description = "")
  public String getAccountPaymentMethod() {
    return accountPaymentMethod;
  }

  /**
   * setAccountPaymentMethod.
   **/
  public void setAccountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
  }


  /**
   * discountApplied.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse discountApplied(String discountApplied) {
    this.discountApplied = discountApplied;
    return this;
  }

  /**
   * .
   * @return discountApplied
   **/
  @Schema(description = "")
  public String getDiscountApplied() {
    return discountApplied;
  }

  /**
   * setDiscountApplied.
   **/
  public void setDiscountApplied(String discountApplied) {
    this.discountApplied = discountApplied;
  }


  /**
   * downgradeEffectiveDate.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse downgradeEffectiveDate(String downgradeEffectiveDate) {
    this.downgradeEffectiveDate = downgradeEffectiveDate;
    return this;
  }

  /**
   * .
   * @return downgradeEffectiveDate
   **/
  @Schema(description = "")
  public String getDowngradeEffectiveDate() {
    return downgradeEffectiveDate;
  }

  /**
   * setDowngradeEffectiveDate.
   **/
  public void setDowngradeEffectiveDate(String downgradeEffectiveDate) {
    this.downgradeEffectiveDate = downgradeEffectiveDate;
  }


  /**
   * downgradePaymentCycle.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse downgradePaymentCycle(String downgradePaymentCycle) {
    this.downgradePaymentCycle = downgradePaymentCycle;
    return this;
  }

  /**
   * .
   * @return downgradePaymentCycle
   **/
  @Schema(description = "")
  public String getDowngradePaymentCycle() {
    return downgradePaymentCycle;
  }

  /**
   * setDowngradePaymentCycle.
   **/
  public void setDowngradePaymentCycle(String downgradePaymentCycle) {
    this.downgradePaymentCycle = downgradePaymentCycle;
  }


  /**
   * downgradePlanId.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse downgradePlanId(String downgradePlanId) {
    this.downgradePlanId = downgradePlanId;
    return this;
  }

  /**
   * .
   * @return downgradePlanId
   **/
  @Schema(description = "")
  public String getDowngradePlanId() {
    return downgradePlanId;
  }

  /**
   * setDowngradePlanId.
   **/
  public void setDowngradePlanId(String downgradePlanId) {
    this.downgradePlanId = downgradePlanId;
  }


  /**
   * downgradePlanName.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse downgradePlanName(String downgradePlanName) {
    this.downgradePlanName = downgradePlanName;
    return this;
  }

  /**
   * .
   * @return downgradePlanName
   **/
  @Schema(description = "")
  public String getDowngradePlanName() {
    return downgradePlanName;
  }

  /**
   * setDowngradePlanName.
   **/
  public void setDowngradePlanName(String downgradePlanName) {
    this.downgradePlanName = downgradePlanName;
  }


  /**
   * downgradeRequestStatus.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse downgradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
    return this;
  }

  /**
   * .
   * @return downgradeRequestStatus
   **/
  @Schema(description = "")
  public String getDowngradeRequestStatus() {
    return downgradeRequestStatus;
  }

  /**
   * setDowngradeRequestStatus.
   **/
  public void setDowngradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
  }


  /**
   * message.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * .
   * @return message
   **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * productId.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse productId(String productId) {
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
   * promoCode.
   *
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse promoCode(String promoCode) {
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
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse saleDiscount(String saleDiscount) {
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
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse saleDiscountPeriods(String saleDiscountPeriods) {
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
   * @return DowngradePlanUpdateResponse
   **/
  public DowngradePlanUpdateResponse saleDiscountType(String saleDiscountType) {
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
    DowngradePlanUpdateResponse downgradePlanUpdateResponse = (DowngradePlanUpdateResponse) o;
    return Objects.equals(this.accountPaymentMethod, downgradePlanUpdateResponse.accountPaymentMethod) &&
        Objects.equals(this.discountApplied, downgradePlanUpdateResponse.discountApplied) &&
        Objects.equals(this.downgradeEffectiveDate, downgradePlanUpdateResponse.downgradeEffectiveDate) &&
        Objects.equals(this.downgradePaymentCycle, downgradePlanUpdateResponse.downgradePaymentCycle) &&
        Objects.equals(this.downgradePlanId, downgradePlanUpdateResponse.downgradePlanId) &&
        Objects.equals(this.downgradePlanName, downgradePlanUpdateResponse.downgradePlanName) &&
        Objects.equals(this.downgradeRequestStatus, downgradePlanUpdateResponse.downgradeRequestStatus) &&
        Objects.equals(this.message, downgradePlanUpdateResponse.message) &&
        Objects.equals(this.productId, downgradePlanUpdateResponse.productId) &&
        Objects.equals(this.promoCode, downgradePlanUpdateResponse.promoCode) &&
        Objects.equals(this.saleDiscount, downgradePlanUpdateResponse.saleDiscount) &&
        Objects.equals(this.saleDiscountPeriods, downgradePlanUpdateResponse.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountType, downgradePlanUpdateResponse.saleDiscountType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountPaymentMethod, discountApplied, downgradeEffectiveDate, downgradePaymentCycle, downgradePlanId, downgradePlanName, downgradeRequestStatus, message, productId, promoCode, saleDiscount, saleDiscountPeriods, saleDiscountType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradePlanUpdateResponse {\n");
    
    sb.append("    accountPaymentMethod: ").append(toIndentedString(accountPaymentMethod)).append("\n");
    sb.append("    discountApplied: ").append(toIndentedString(discountApplied)).append("\n");
    sb.append("    downgradeEffectiveDate: ").append(toIndentedString(downgradeEffectiveDate)).append("\n");
    sb.append("    downgradePaymentCycle: ").append(toIndentedString(downgradePaymentCycle)).append("\n");
    sb.append("    downgradePlanId: ").append(toIndentedString(downgradePlanId)).append("\n");
    sb.append("    downgradePlanName: ").append(toIndentedString(downgradePlanName)).append("\n");
    sb.append("    downgradeRequestStatus: ").append(toIndentedString(downgradeRequestStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

