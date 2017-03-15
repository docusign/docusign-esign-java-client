package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains account Information.
 **/

@ApiModel(description = "Contains account Information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountInformation   {
  
  private String accountIdGuid = null;
  private String accountName = null;
  private String allowTransactionRooms = null;
  private String billingPeriodDaysRemaining = null;
  private String billingPeriodEndDate = null;
  private String billingPeriodEnvelopesAllowed = null;
  private String billingPeriodEnvelopesSent = null;
  private String billingPeriodStartDate = null;
  private String billingProfile = null;
  private String canCancelRenewal = null;
  private String canUpgrade = null;
  private String connectPermission = null;
  private String createdDate = null;
  private String currencyCode = null;
  private String currentPlanId = null;
  private String distributorCode = null;
  private String docuSignLandingUrl = null;
  private String envelopeSendingBlocked = null;
  private String envelopeUnitPrice = null;
  private String forgottenPasswordQuestionsCount = null;
  private String isDowngrade = null;
  private String paymentMethod = null;
  private String planClassification = null;
  private String planEndDate = null;
  private String planName = null;
  private String planStartDate = null;
  private String seatsAllowed = null;
  private String seatsInUse = null;
  private String status21CFRPart11 = null;
  private String suspensionDate = null;
  private String suspensionStatus = null;

  
  /**
   * The GUID associated with the account ID.
   **/
  
  @ApiModelProperty(value = "The GUID associated with the account ID.")
  @JsonProperty("accountIdGuid")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }
  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  
  /**
   * The name of the current account.
   **/
  
  @ApiModelProperty(value = "The name of the current account.")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.")
  @JsonProperty("allowTransactionRooms")
  public String getAllowTransactionRooms() {
    return allowTransactionRooms;
  }
  public void setAllowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPeriodDaysRemaining")
  public String getBillingPeriodDaysRemaining() {
    return billingPeriodDaysRemaining;
  }
  public void setBillingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPeriodEndDate")
  public String getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }
  public void setBillingPeriodEndDate(String billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPeriodEnvelopesAllowed")
  public String getBillingPeriodEnvelopesAllowed() {
    return billingPeriodEnvelopesAllowed;
  }
  public void setBillingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
    this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPeriodEnvelopesSent")
  public String getBillingPeriodEnvelopesSent() {
    return billingPeriodEnvelopesSent;
  }
  public void setBillingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
    this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPeriodStartDate")
  public String getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }
  public void setBillingPeriodStartDate(String billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingProfile")
  public String getBillingProfile() {
    return billingProfile;
  }
  public void setBillingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("canCancelRenewal")
  public String getCanCancelRenewal() {
    return canCancelRenewal;
  }
  public void setCanCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
  }

  
  /**
   * When set to **true**, specifies that you can upgrade the account through the API.
   **/
  
  @ApiModelProperty(value = "When set to **true**, specifies that you can upgrade the account through the API.")
  @JsonProperty("canUpgrade")
  public String getCanUpgrade() {
    return canUpgrade;
  }
  public void setCanUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectPermission")
  public String getConnectPermission() {
    return connectPermission;
  }
  public void setConnectPermission(String connectPermission) {
    this.connectPermission = connectPermission;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdDate")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * Specifies the ISO currency code for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * Identifies the plan that was used create this account.
   **/
  
  @ApiModelProperty(value = "Identifies the plan that was used create this account.")
  @JsonProperty("currentPlanId")
  public String getCurrentPlanId() {
    return currentPlanId;
  }
  public void setCurrentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
  }

  
  /**
   * The code that identifies the billing plan groups and plans for the new account.
   **/
  
  @ApiModelProperty(value = "The code that identifies the billing plan groups and plans for the new account.")
  @JsonProperty("distributorCode")
  public String getDistributorCode() {
    return distributorCode;
  }
  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("docuSignLandingUrl")
  public String getDocuSignLandingUrl() {
    return docuSignLandingUrl;
  }
  public void setDocuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeSendingBlocked")
  public String getEnvelopeSendingBlocked() {
    return envelopeSendingBlocked;
  }
  public void setEnvelopeSendingBlocked(String envelopeSendingBlocked) {
    this.envelopeSendingBlocked = envelopeSendingBlocked;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeUnitPrice")
  public String getEnvelopeUnitPrice() {
    return envelopeUnitPrice;
  }
  public void setEnvelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
  }

  
  /**
   * A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.
   **/
  
  @ApiModelProperty(value = "A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.")
  @JsonProperty("forgottenPasswordQuestionsCount")
  public String getForgottenPasswordQuestionsCount() {
    return forgottenPasswordQuestionsCount;
  }
  public void setForgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
    this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isDowngrade")
  public String getIsDowngrade() {
    return isDowngrade;
  }
  public void setIsDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentMethod")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  
  /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
   **/
  
  @ApiModelProperty(value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  @JsonProperty("planClassification")
  public String getPlanClassification() {
    return planClassification;
  }
  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }

  
  /**
   * The date that the current plan will end.
   **/
  
  @ApiModelProperty(value = "The date that the current plan will end.")
  @JsonProperty("planEndDate")
  public String getPlanEndDate() {
    return planEndDate;
  }
  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }

  
  /**
   * The name of the Billing Plan.
   **/
  
  @ApiModelProperty(value = "The name of the Billing Plan.")
  @JsonProperty("planName")
  public String getPlanName() {
    return planName;
  }
  public void setPlanName(String planName) {
    this.planName = planName;
  }

  
  /**
   * The date that the Account started using the current plan.
   **/
  
  @ApiModelProperty(value = "The date that the Account started using the current plan.")
  @JsonProperty("planStartDate")
  public String getPlanStartDate() {
    return planStartDate;
  }
  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seatsAllowed")
  public String getSeatsAllowed() {
    return seatsAllowed;
  }
  public void setSeatsAllowed(String seatsAllowed) {
    this.seatsAllowed = seatsAllowed;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seatsInUse")
  public String getSeatsInUse() {
    return seatsInUse;
  }
  public void setSeatsInUse(String seatsInUse) {
    this.seatsInUse = seatsInUse;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status21CFRPart11")
  public String getStatus21CFRPart11() {
    return status21CFRPart11;
  }
  public void setStatus21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suspensionDate")
  public String getSuspensionDate() {
    return suspensionDate;
  }
  public void setSuspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suspensionStatus")
  public String getSuspensionStatus() {
    return suspensionStatus;
  }
  public void setSuspensionStatus(String suspensionStatus) {
    this.suspensionStatus = suspensionStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInformation accountInformation = (AccountInformation) o;

    return true && Objects.equals(accountIdGuid, accountInformation.accountIdGuid) &&
        Objects.equals(accountName, accountInformation.accountName) &&
        Objects.equals(allowTransactionRooms, accountInformation.allowTransactionRooms) &&
        Objects.equals(billingPeriodDaysRemaining, accountInformation.billingPeriodDaysRemaining) &&
        Objects.equals(billingPeriodEndDate, accountInformation.billingPeriodEndDate) &&
        Objects.equals(billingPeriodEnvelopesAllowed, accountInformation.billingPeriodEnvelopesAllowed) &&
        Objects.equals(billingPeriodEnvelopesSent, accountInformation.billingPeriodEnvelopesSent) &&
        Objects.equals(billingPeriodStartDate, accountInformation.billingPeriodStartDate) &&
        Objects.equals(billingProfile, accountInformation.billingProfile) &&
        Objects.equals(canCancelRenewal, accountInformation.canCancelRenewal) &&
        Objects.equals(canUpgrade, accountInformation.canUpgrade) &&
        Objects.equals(connectPermission, accountInformation.connectPermission) &&
        Objects.equals(createdDate, accountInformation.createdDate) &&
        Objects.equals(currencyCode, accountInformation.currencyCode) &&
        Objects.equals(currentPlanId, accountInformation.currentPlanId) &&
        Objects.equals(distributorCode, accountInformation.distributorCode) &&
        Objects.equals(docuSignLandingUrl, accountInformation.docuSignLandingUrl) &&
        Objects.equals(envelopeSendingBlocked, accountInformation.envelopeSendingBlocked) &&
        Objects.equals(envelopeUnitPrice, accountInformation.envelopeUnitPrice) &&
        Objects.equals(forgottenPasswordQuestionsCount, accountInformation.forgottenPasswordQuestionsCount) &&
        Objects.equals(isDowngrade, accountInformation.isDowngrade) &&
        Objects.equals(paymentMethod, accountInformation.paymentMethod) &&
        Objects.equals(planClassification, accountInformation.planClassification) &&
        Objects.equals(planEndDate, accountInformation.planEndDate) &&
        Objects.equals(planName, accountInformation.planName) &&
        Objects.equals(planStartDate, accountInformation.planStartDate) &&
        Objects.equals(seatsAllowed, accountInformation.seatsAllowed) &&
        Objects.equals(seatsInUse, accountInformation.seatsInUse) &&
        Objects.equals(status21CFRPart11, accountInformation.status21CFRPart11) &&
        Objects.equals(suspensionDate, accountInformation.suspensionDate) &&
        Objects.equals(suspensionStatus, accountInformation.suspensionStatus)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdGuid, accountName, allowTransactionRooms, billingPeriodDaysRemaining, billingPeriodEndDate, billingPeriodEnvelopesAllowed, billingPeriodEnvelopesSent, billingPeriodStartDate, billingProfile, canCancelRenewal, canUpgrade, connectPermission, createdDate, currencyCode, currentPlanId, distributorCode, docuSignLandingUrl, envelopeSendingBlocked, envelopeUnitPrice, forgottenPasswordQuestionsCount, isDowngrade, paymentMethod, planClassification, planEndDate, planName, planStartDate, seatsAllowed, seatsInUse, status21CFRPart11, suspensionDate, suspensionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformation {\n");
    
    if (accountIdGuid != null)
      sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    if (accountName != null)
      sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    if (allowTransactionRooms != null)
      sb.append("    allowTransactionRooms: ").append(toIndentedString(allowTransactionRooms)).append("\n");
    if (billingPeriodDaysRemaining != null)
      sb.append("    billingPeriodDaysRemaining: ").append(toIndentedString(billingPeriodDaysRemaining)).append("\n");
    if (billingPeriodEndDate != null)
      sb.append("    billingPeriodEndDate: ").append(toIndentedString(billingPeriodEndDate)).append("\n");
    if (billingPeriodEnvelopesAllowed != null)
      sb.append("    billingPeriodEnvelopesAllowed: ").append(toIndentedString(billingPeriodEnvelopesAllowed)).append("\n");
    if (billingPeriodEnvelopesSent != null)
      sb.append("    billingPeriodEnvelopesSent: ").append(toIndentedString(billingPeriodEnvelopesSent)).append("\n");
    if (billingPeriodStartDate != null)
      sb.append("    billingPeriodStartDate: ").append(toIndentedString(billingPeriodStartDate)).append("\n");
    if (billingProfile != null)
      sb.append("    billingProfile: ").append(toIndentedString(billingProfile)).append("\n");
    if (canCancelRenewal != null)
      sb.append("    canCancelRenewal: ").append(toIndentedString(canCancelRenewal)).append("\n");
    if (canUpgrade != null)
      sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
    if (connectPermission != null)
      sb.append("    connectPermission: ").append(toIndentedString(connectPermission)).append("\n");
    if (createdDate != null)
      sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (currentPlanId != null)
      sb.append("    currentPlanId: ").append(toIndentedString(currentPlanId)).append("\n");
    if (distributorCode != null)
      sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    if (docuSignLandingUrl != null)
      sb.append("    docuSignLandingUrl: ").append(toIndentedString(docuSignLandingUrl)).append("\n");
    if (envelopeSendingBlocked != null)
      sb.append("    envelopeSendingBlocked: ").append(toIndentedString(envelopeSendingBlocked)).append("\n");
    if (envelopeUnitPrice != null)
      sb.append("    envelopeUnitPrice: ").append(toIndentedString(envelopeUnitPrice)).append("\n");
    if (forgottenPasswordQuestionsCount != null)
      sb.append("    forgottenPasswordQuestionsCount: ").append(toIndentedString(forgottenPasswordQuestionsCount)).append("\n");
    if (isDowngrade != null)
      sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
    if (paymentMethod != null)
      sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (planClassification != null)
      sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    if (planEndDate != null)
      sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
    if (planName != null)
      sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    if (planStartDate != null)
      sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
    if (seatsAllowed != null)
      sb.append("    seatsAllowed: ").append(toIndentedString(seatsAllowed)).append("\n");
    if (seatsInUse != null)
      sb.append("    seatsInUse: ").append(toIndentedString(seatsInUse)).append("\n");
    if (status21CFRPart11 != null)
      sb.append("    status21CFRPart11: ").append(toIndentedString(status21CFRPart11)).append("\n");
    if (suspensionDate != null)
      sb.append("    suspensionDate: ").append(toIndentedString(suspensionDate)).append("\n");
    if (suspensionStatus != null)
      sb.append("    suspensionStatus: ").append(toIndentedString(suspensionStatus)).append("\n");
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

