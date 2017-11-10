package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry   ###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.
 */
@ApiModel(description = "A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry   ###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.")

public class ReferralInformation {
  @JsonProperty("advertisementId")
  private String advertisementId = null;

  @JsonProperty("enableSupport")
  private String enableSupport = null;

  @JsonProperty("externalOrgId")
  private String externalOrgId = null;

  @JsonProperty("groupMemberId")
  private String groupMemberId = null;

  @JsonProperty("idType")
  private String idType = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("industry")
  private String industry = null;

  @JsonProperty("planStartMonth")
  private String planStartMonth = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("publisherId")
  private String publisherId = null;

  @JsonProperty("referralCode")
  private String referralCode = null;

  @JsonProperty("referrerName")
  private String referrerName = null;

  @JsonProperty("saleDiscountAmount")
  private String saleDiscountAmount = null;

  @JsonProperty("saleDiscountFixedAmount")
  private String saleDiscountFixedAmount = null;

  @JsonProperty("saleDiscountPercent")
  private String saleDiscountPercent = null;

  @JsonProperty("saleDiscountPeriods")
  private String saleDiscountPeriods = null;

  @JsonProperty("saleDiscountSeatPriceOverride")
  private String saleDiscountSeatPriceOverride = null;

  @JsonProperty("shopperId")
  private String shopperId = null;

  public ReferralInformation advertisementId(String advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

   /**
   * A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry.  ###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.  
   * @return advertisementId
  **/
  @ApiModelProperty(example = "null", value = "A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry.  ###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.  ")
  public String getAdvertisementId() {
    return advertisementId;
  }

  public void setAdvertisementId(String advertisementId) {
    this.advertisementId = advertisementId;
  }

  public ReferralInformation enableSupport(String enableSupport) {
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

  public ReferralInformation externalOrgId(String externalOrgId) {
    this.externalOrgId = externalOrgId;
    return this;
  }

   /**
   * 
   * @return externalOrgId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalOrgId() {
    return externalOrgId;
  }

  public void setExternalOrgId(String externalOrgId) {
    this.externalOrgId = externalOrgId;
  }

  public ReferralInformation groupMemberId(String groupMemberId) {
    this.groupMemberId = groupMemberId;
    return this;
  }

   /**
   * 
   * @return groupMemberId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupMemberId() {
    return groupMemberId;
  }

  public void setGroupMemberId(String groupMemberId) {
    this.groupMemberId = groupMemberId;
  }

  public ReferralInformation idType(String idType) {
    this.idType = idType;
    return this;
  }

   /**
   * 
   * @return idType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public ReferralInformation includedSeats(String includedSeats) {
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

  public ReferralInformation industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * 
   * @return industry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public ReferralInformation planStartMonth(String planStartMonth) {
    this.planStartMonth = planStartMonth;
    return this;
  }

   /**
   * 
   * @return planStartMonth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlanStartMonth() {
    return planStartMonth;
  }

  public void setPlanStartMonth(String planStartMonth) {
    this.planStartMonth = planStartMonth;
  }

  public ReferralInformation promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * 
   * @return promoCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public ReferralInformation publisherId(String publisherId) {
    this.publisherId = publisherId;
    return this;
  }

   /**
   * 
   * @return publisherId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(String publisherId) {
    this.publisherId = publisherId;
  }

  public ReferralInformation referralCode(String referralCode) {
    this.referralCode = referralCode;
    return this;
  }

   /**
   * 
   * @return referralCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  public ReferralInformation referrerName(String referrerName) {
    this.referrerName = referrerName;
    return this;
  }

   /**
   * 
   * @return referrerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReferrerName() {
    return referrerName;
  }

  public void setReferrerName(String referrerName) {
    this.referrerName = referrerName;
  }

  public ReferralInformation saleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
    return this;
  }

   /**
   * Reserved for DocuSign use only.
   * @return saleDiscountAmount
  **/
  @ApiModelProperty(example = "null", value = "Reserved for DocuSign use only.")
  public String getSaleDiscountAmount() {
    return saleDiscountAmount;
  }

  public void setSaleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
  }

  public ReferralInformation saleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
    return this;
  }

   /**
   * Reserved for DocuSign use only.
   * @return saleDiscountFixedAmount
  **/
  @ApiModelProperty(example = "null", value = "Reserved for DocuSign use only.")
  public String getSaleDiscountFixedAmount() {
    return saleDiscountFixedAmount;
  }

  public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
  }

  public ReferralInformation saleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
    return this;
  }

   /**
   * Reserved for DocuSign use only.
   * @return saleDiscountPercent
  **/
  @ApiModelProperty(example = "null", value = "Reserved for DocuSign use only.")
  public String getSaleDiscountPercent() {
    return saleDiscountPercent;
  }

  public void setSaleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
  }

  public ReferralInformation saleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
    return this;
  }

   /**
   * Reserved for DocuSign use only.
   * @return saleDiscountPeriods
  **/
  @ApiModelProperty(example = "null", value = "Reserved for DocuSign use only.")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }

  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }

  public ReferralInformation saleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
    return this;
  }

   /**
   * Reserved for DocuSign use only.
   * @return saleDiscountSeatPriceOverride
  **/
  @ApiModelProperty(example = "null", value = "Reserved for DocuSign use only.")
  public String getSaleDiscountSeatPriceOverride() {
    return saleDiscountSeatPriceOverride;
  }

  public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
  }

  public ReferralInformation shopperId(String shopperId) {
    this.shopperId = shopperId;
    return this;
  }

   /**
   * 
   * @return shopperId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShopperId() {
    return shopperId;
  }

  public void setShopperId(String shopperId) {
    this.shopperId = shopperId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferralInformation referralInformation = (ReferralInformation) o;
    return Objects.equals(this.advertisementId, referralInformation.advertisementId) &&
        Objects.equals(this.enableSupport, referralInformation.enableSupport) &&
        Objects.equals(this.externalOrgId, referralInformation.externalOrgId) &&
        Objects.equals(this.groupMemberId, referralInformation.groupMemberId) &&
        Objects.equals(this.idType, referralInformation.idType) &&
        Objects.equals(this.includedSeats, referralInformation.includedSeats) &&
        Objects.equals(this.industry, referralInformation.industry) &&
        Objects.equals(this.planStartMonth, referralInformation.planStartMonth) &&
        Objects.equals(this.promoCode, referralInformation.promoCode) &&
        Objects.equals(this.publisherId, referralInformation.publisherId) &&
        Objects.equals(this.referralCode, referralInformation.referralCode) &&
        Objects.equals(this.referrerName, referralInformation.referrerName) &&
        Objects.equals(this.saleDiscountAmount, referralInformation.saleDiscountAmount) &&
        Objects.equals(this.saleDiscountFixedAmount, referralInformation.saleDiscountFixedAmount) &&
        Objects.equals(this.saleDiscountPercent, referralInformation.saleDiscountPercent) &&
        Objects.equals(this.saleDiscountPeriods, referralInformation.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountSeatPriceOverride, referralInformation.saleDiscountSeatPriceOverride) &&
        Objects.equals(this.shopperId, referralInformation.shopperId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertisementId, enableSupport, externalOrgId, groupMemberId, idType, includedSeats, industry, planStartMonth, promoCode, publisherId, referralCode, referrerName, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride, shopperId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferralInformation {\n");
    
    sb.append("    advertisementId: ").append(toIndentedString(advertisementId)).append("\n");
    sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    sb.append("    externalOrgId: ").append(toIndentedString(externalOrgId)).append("\n");
    sb.append("    groupMemberId: ").append(toIndentedString(groupMemberId)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    planStartMonth: ").append(toIndentedString(planStartMonth)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
    sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
    sb.append("    referrerName: ").append(toIndentedString(referrerName)).append("\n");
    sb.append("    saleDiscountAmount: ").append(toIndentedString(saleDiscountAmount)).append("\n");
    sb.append("    saleDiscountFixedAmount: ").append(toIndentedString(saleDiscountFixedAmount)).append("\n");
    sb.append("    saleDiscountPercent: ").append(toIndentedString(saleDiscountPercent)).append("\n");
    sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
    sb.append("    saleDiscountSeatPriceOverride: ").append(toIndentedString(saleDiscountSeatPriceOverride)).append("\n");
    sb.append("    shopperId: ").append(toIndentedString(shopperId)).append("\n");
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

