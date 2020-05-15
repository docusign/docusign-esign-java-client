package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DowngradePlanUpdateResponse
 */

public class DowngradePlanUpdateResponse {
  @JsonProperty("accountPaymentMethod")
  private String accountPaymentMethod = null;

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

  public DowngradePlanUpdateResponse accountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
    return this;
  }

   /**
   * 
   * @return accountPaymentMethod
  **/
  @ApiModelProperty(value = "")
  public String getAccountPaymentMethod() {
    return accountPaymentMethod;
  }

  public void setAccountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
  }

  public DowngradePlanUpdateResponse downgradeEffectiveDate(String downgradeEffectiveDate) {
    this.downgradeEffectiveDate = downgradeEffectiveDate;
    return this;
  }

   /**
   * 
   * @return downgradeEffectiveDate
  **/
  @ApiModelProperty(value = "")
  public String getDowngradeEffectiveDate() {
    return downgradeEffectiveDate;
  }

  public void setDowngradeEffectiveDate(String downgradeEffectiveDate) {
    this.downgradeEffectiveDate = downgradeEffectiveDate;
  }

  public DowngradePlanUpdateResponse downgradePaymentCycle(String downgradePaymentCycle) {
    this.downgradePaymentCycle = downgradePaymentCycle;
    return this;
  }

   /**
   * 
   * @return downgradePaymentCycle
  **/
  @ApiModelProperty(value = "")
  public String getDowngradePaymentCycle() {
    return downgradePaymentCycle;
  }

  public void setDowngradePaymentCycle(String downgradePaymentCycle) {
    this.downgradePaymentCycle = downgradePaymentCycle;
  }

  public DowngradePlanUpdateResponse downgradePlanId(String downgradePlanId) {
    this.downgradePlanId = downgradePlanId;
    return this;
  }

   /**
   * 
   * @return downgradePlanId
  **/
  @ApiModelProperty(value = "")
  public String getDowngradePlanId() {
    return downgradePlanId;
  }

  public void setDowngradePlanId(String downgradePlanId) {
    this.downgradePlanId = downgradePlanId;
  }

  public DowngradePlanUpdateResponse downgradePlanName(String downgradePlanName) {
    this.downgradePlanName = downgradePlanName;
    return this;
  }

   /**
   * 
   * @return downgradePlanName
  **/
  @ApiModelProperty(value = "")
  public String getDowngradePlanName() {
    return downgradePlanName;
  }

  public void setDowngradePlanName(String downgradePlanName) {
    this.downgradePlanName = downgradePlanName;
  }

  public DowngradePlanUpdateResponse downgradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
    return this;
  }

   /**
   * 
   * @return downgradeRequestStatus
  **/
  @ApiModelProperty(value = "")
  public String getDowngradeRequestStatus() {
    return downgradeRequestStatus;
  }

  public void setDowngradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
  }

  public DowngradePlanUpdateResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


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
        Objects.equals(this.downgradeEffectiveDate, downgradePlanUpdateResponse.downgradeEffectiveDate) &&
        Objects.equals(this.downgradePaymentCycle, downgradePlanUpdateResponse.downgradePaymentCycle) &&
        Objects.equals(this.downgradePlanId, downgradePlanUpdateResponse.downgradePlanId) &&
        Objects.equals(this.downgradePlanName, downgradePlanUpdateResponse.downgradePlanName) &&
        Objects.equals(this.downgradeRequestStatus, downgradePlanUpdateResponse.downgradeRequestStatus) &&
        Objects.equals(this.message, downgradePlanUpdateResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPaymentMethod, downgradeEffectiveDate, downgradePaymentCycle, downgradePlanId, downgradePlanName, downgradeRequestStatus, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradePlanUpdateResponse {\n");
    
    sb.append("    accountPaymentMethod: ").append(toIndentedString(accountPaymentMethod)).append("\n");
    sb.append("    downgradeEffectiveDate: ").append(toIndentedString(downgradeEffectiveDate)).append("\n");
    sb.append("    downgradePaymentCycle: ").append(toIndentedString(downgradePaymentCycle)).append("\n");
    sb.append("    downgradePlanId: ").append(toIndentedString(downgradePlanId)).append("\n");
    sb.append("    downgradePlanName: ").append(toIndentedString(downgradePlanName)).append("\n");
    sb.append("    downgradeRequestStatus: ").append(toIndentedString(downgradeRequestStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

