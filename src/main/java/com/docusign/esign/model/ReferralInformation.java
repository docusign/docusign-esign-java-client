package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry \n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.
 **/

@ApiModel(description = "A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry \n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ReferralInformation   {
  
  private String advertisementId = null;
  private String enableSupport = null;
  private String externalOrgId = null;
  private String groupMemberId = null;
  private String idType = null;
  private String includedSeats = null;
  private String industry = null;
  private String planStartMonth = null;
  private String promoCode = null;
  private String publisherId = null;
  private String referralCode = null;
  private String referrerName = null;
  private String saleDiscountAmount = null;
  private String saleDiscountFixedAmount = null;
  private String saleDiscountPercent = null;
  private String saleDiscountPeriods = null;
  private String saleDiscountSeatPriceOverride = null;
  private String shopperId = null;

  
  /**
   * A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry.\n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.
   **/
  
  @ApiModelProperty(value = "A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry.\n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.")
  @JsonProperty("advertisementId")
  public String getAdvertisementId() {
    return advertisementId;
  }
  public void setAdvertisementId(String advertisementId) {
    this.advertisementId = advertisementId;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalOrgId")
  public String getExternalOrgId() {
    return externalOrgId;
  }
  public void setExternalOrgId(String externalOrgId) {
    this.externalOrgId = externalOrgId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupMemberId")
  public String getGroupMemberId() {
    return groupMemberId;
  }
  public void setGroupMemberId(String groupMemberId) {
    this.groupMemberId = groupMemberId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idType")
  public String getIdType() {
    return idType;
  }
  public void setIdType(String idType) {
    this.idType = idType;
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
  @JsonProperty("industry")
  public String getIndustry() {
    return industry;
  }
  public void setIndustry(String industry) {
    this.industry = industry;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planStartMonth")
  public String getPlanStartMonth() {
    return planStartMonth;
  }
  public void setPlanStartMonth(String planStartMonth) {
    this.planStartMonth = planStartMonth;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publisherId")
  public String getPublisherId() {
    return publisherId;
  }
  public void setPublisherId(String publisherId) {
    this.publisherId = publisherId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referralCode")
  public String getReferralCode() {
    return referralCode;
  }
  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referrerName")
  public String getReferrerName() {
    return referrerName;
  }
  public void setReferrerName(String referrerName) {
    this.referrerName = referrerName;
  }

  
  /**
   * Reserved for DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved for DocuSign use only.")
  @JsonProperty("saleDiscountAmount")
  public String getSaleDiscountAmount() {
    return saleDiscountAmount;
  }
  public void setSaleDiscountAmount(String saleDiscountAmount) {
    this.saleDiscountAmount = saleDiscountAmount;
  }

  
  /**
   * Reserved for DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved for DocuSign use only.")
  @JsonProperty("saleDiscountFixedAmount")
  public String getSaleDiscountFixedAmount() {
    return saleDiscountFixedAmount;
  }
  public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
    this.saleDiscountFixedAmount = saleDiscountFixedAmount;
  }

  
  /**
   * Reserved for DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved for DocuSign use only.")
  @JsonProperty("saleDiscountPercent")
  public String getSaleDiscountPercent() {
    return saleDiscountPercent;
  }
  public void setSaleDiscountPercent(String saleDiscountPercent) {
    this.saleDiscountPercent = saleDiscountPercent;
  }

  
  /**
   * Reserved for DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved for DocuSign use only.")
  @JsonProperty("saleDiscountPeriods")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }
  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }

  
  /**
   * Reserved for DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved for DocuSign use only.")
  @JsonProperty("saleDiscountSeatPriceOverride")
  public String getSaleDiscountSeatPriceOverride() {
    return saleDiscountSeatPriceOverride;
  }
  public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
    this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shopperId")
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

    return true && Objects.equals(advertisementId, referralInformation.advertisementId) &&
        Objects.equals(enableSupport, referralInformation.enableSupport) &&
        Objects.equals(externalOrgId, referralInformation.externalOrgId) &&
        Objects.equals(groupMemberId, referralInformation.groupMemberId) &&
        Objects.equals(idType, referralInformation.idType) &&
        Objects.equals(includedSeats, referralInformation.includedSeats) &&
        Objects.equals(industry, referralInformation.industry) &&
        Objects.equals(planStartMonth, referralInformation.planStartMonth) &&
        Objects.equals(promoCode, referralInformation.promoCode) &&
        Objects.equals(publisherId, referralInformation.publisherId) &&
        Objects.equals(referralCode, referralInformation.referralCode) &&
        Objects.equals(referrerName, referralInformation.referrerName) &&
        Objects.equals(saleDiscountAmount, referralInformation.saleDiscountAmount) &&
        Objects.equals(saleDiscountFixedAmount, referralInformation.saleDiscountFixedAmount) &&
        Objects.equals(saleDiscountPercent, referralInformation.saleDiscountPercent) &&
        Objects.equals(saleDiscountPeriods, referralInformation.saleDiscountPeriods) &&
        Objects.equals(saleDiscountSeatPriceOverride, referralInformation.saleDiscountSeatPriceOverride) &&
        Objects.equals(shopperId, referralInformation.shopperId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertisementId, enableSupport, externalOrgId, groupMemberId, idType, includedSeats, industry, planStartMonth, promoCode, publisherId, referralCode, referrerName, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride, shopperId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferralInformation {\n");
    
    if (advertisementId != null)
      sb.append("    advertisementId: ").append(toIndentedString(advertisementId)).append("\n");
    if (enableSupport != null)
      sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    if (externalOrgId != null)
      sb.append("    externalOrgId: ").append(toIndentedString(externalOrgId)).append("\n");
    if (groupMemberId != null)
      sb.append("    groupMemberId: ").append(toIndentedString(groupMemberId)).append("\n");
    if (idType != null)
      sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    if (includedSeats != null)
      sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    if (industry != null)
      sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    if (planStartMonth != null)
      sb.append("    planStartMonth: ").append(toIndentedString(planStartMonth)).append("\n");
    if (promoCode != null)
      sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    if (publisherId != null)
      sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
    if (referralCode != null)
      sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
    if (referrerName != null)
      sb.append("    referrerName: ").append(toIndentedString(referrerName)).append("\n");
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
    if (shopperId != null)
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

