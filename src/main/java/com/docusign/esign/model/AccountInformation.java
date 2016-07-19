package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains account Information.
 **/

@ApiModel(description = "Contains account Information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class AccountInformation   {
  
  private String currentPlanId = null;
  private String planName = null;
  private String planClassification = null;
  private String planStartDate = null;
  private String planEndDate = null;
  private String billingPeriodStartDate = null;
  private String billingPeriodEndDate = null;
  private String billingPeriodEnvelopesSent = null;
  private String billingPeriodEnvelopesAllowed = null;
  private String billingPeriodDaysRemaining = null;
  private String canUpgrade = null;
  private String canCancelRenewal = null;
  private String envelopeSendingBlocked = null;
  private String envelopeUnitPrice = null;
  private String suspensionStatus = null;
  private String suspensionDate = null;
  private String accountName = null;
  private String connectPermission = null;
  private String docuSignLandingUrl = null;
  private String distributorCode = null;
  private String accountIdGuid = null;
  private String currencyCode = null;
  private String forgottenPasswordQuestionsCount = null;
  private String paymentMethod = null;
  private String seatsAllowed = null;
  private String seatsInUse = null;
  private String createdDate = null;
  private String isDowngrade = null;
  private String billingProfile = null;
  private String status21CFRPart11 = null;
  private String allowTransactionRooms = null;

  
  /**
   * Identifies the plan that was used create this account.
   **/
  public AccountInformation currentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the plan that was used create this account.")
  @JsonProperty("currentPlanId")
  public String getCurrentPlanId() {
    return currentPlanId;
  }
  public void setCurrentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
  }

  
  /**
   * The name of the Billing Plan.
   **/
  public AccountInformation planName(String planName) {
    this.planName = planName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Billing Plan.")
  @JsonProperty("planName")
  public String getPlanName() {
    return planName;
  }
  public void setPlanName(String planName) {
    this.planName = planName;
  }

  
  /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
   **/
  public AccountInformation planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  @JsonProperty("planClassification")
  public String getPlanClassification() {
    return planClassification;
  }
  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }

  
  /**
   * The date that the Account started using the current plan.
   **/
  public AccountInformation planStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date that the Account started using the current plan.")
  @JsonProperty("planStartDate")
  public String getPlanStartDate() {
    return planStartDate;
  }
  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }

  
  /**
   * The date that the current plan will end.
   **/
  public AccountInformation planEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date that the current plan will end.")
  @JsonProperty("planEndDate")
  public String getPlanEndDate() {
    return planEndDate;
  }
  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }

  
  /**
   * Reserved: TBD
   **/
  public AccountInformation billingPeriodStartDate(String billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public AccountInformation billingPeriodEndDate(String billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public AccountInformation billingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
    this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public AccountInformation billingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
    this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public AccountInformation billingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("billingPeriodDaysRemaining")
  public String getBillingPeriodDaysRemaining() {
    return billingPeriodDaysRemaining;
  }
  public void setBillingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
  }

  
  /**
   * When set to **true**, specifies that you can upgrade the account through the API.
   **/
  public AccountInformation canUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, specifies that you can upgrade the account through the API.")
  @JsonProperty("canUpgrade")
  public String getCanUpgrade() {
    return canUpgrade;
  }
  public void setCanUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
  }

  
  /**
   * Reserved: TBD
   **/
  public AccountInformation canCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("canCancelRenewal")
  public String getCanCancelRenewal() {
    return canCancelRenewal;
  }
  public void setCanCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
  }

  
  /**
   * 
   **/
  public AccountInformation envelopeSendingBlocked(String envelopeSendingBlocked) {
    this.envelopeSendingBlocked = envelopeSendingBlocked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public AccountInformation envelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelopeUnitPrice")
  public String getEnvelopeUnitPrice() {
    return envelopeUnitPrice;
  }
  public void setEnvelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
  }

  
  /**
   * 
   **/
  public AccountInformation suspensionStatus(String suspensionStatus) {
    this.suspensionStatus = suspensionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("suspensionStatus")
  public String getSuspensionStatus() {
    return suspensionStatus;
  }
  public void setSuspensionStatus(String suspensionStatus) {
    this.suspensionStatus = suspensionStatus;
  }

  
  /**
   * 
   **/
  public AccountInformation suspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("suspensionDate")
  public String getSuspensionDate() {
    return suspensionDate;
  }
  public void setSuspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
  }

  
  /**
   * The name of the current account.
   **/
  public AccountInformation accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the current account.")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   * 
   **/
  public AccountInformation connectPermission(String connectPermission) {
    this.connectPermission = connectPermission;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public AccountInformation docuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("docuSignLandingUrl")
  public String getDocuSignLandingUrl() {
    return docuSignLandingUrl;
  }
  public void setDocuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
  }

  
  /**
   * The code that identifies the billing plan groups and plans for the new account.
   **/
  public AccountInformation distributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The code that identifies the billing plan groups and plans for the new account.")
  @JsonProperty("distributorCode")
  public String getDistributorCode() {
    return distributorCode;
  }
  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  
  /**
   * The GUID associated with the account ID.
   **/
  public AccountInformation accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The GUID associated with the account ID.")
  @JsonProperty("accountIdGuid")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }
  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  
  /**
   * Specifies the ISO currency code for the account.
   **/
  public AccountInformation currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   *  A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.
   **/
  public AccountInformation forgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
    this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.")
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
  public AccountInformation paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("paymentMethod")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  
  /**
   * 
   **/
  public AccountInformation seatsAllowed(String seatsAllowed) {
    this.seatsAllowed = seatsAllowed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public AccountInformation seatsInUse(String seatsInUse) {
    this.seatsInUse = seatsInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public AccountInformation createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * 
   **/
  public AccountInformation isDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isDowngrade")
  public String getIsDowngrade() {
    return isDowngrade;
  }
  public void setIsDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
  }

  
  /**
   * Reserved: TBD
   **/
  public AccountInformation billingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("billingProfile")
  public String getBillingProfile() {
    return billingProfile;
  }
  public void setBillingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
  }

  
  /**
   * 
   **/
  public AccountInformation status21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status21CFRPart11")
  public String getStatus21CFRPart11() {
    return status21CFRPart11;
  }
  public void setStatus21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
  }

  
  /**
   * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.
   **/
  public AccountInformation allowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.")
  @JsonProperty("allowTransactionRooms")
  public String getAllowTransactionRooms() {
    return allowTransactionRooms;
  }
  public void setAllowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
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
    return Objects.equals(this.currentPlanId, accountInformation.currentPlanId) &&
        Objects.equals(this.planName, accountInformation.planName) &&
        Objects.equals(this.planClassification, accountInformation.planClassification) &&
        Objects.equals(this.planStartDate, accountInformation.planStartDate) &&
        Objects.equals(this.planEndDate, accountInformation.planEndDate) &&
        Objects.equals(this.billingPeriodStartDate, accountInformation.billingPeriodStartDate) &&
        Objects.equals(this.billingPeriodEndDate, accountInformation.billingPeriodEndDate) &&
        Objects.equals(this.billingPeriodEnvelopesSent, accountInformation.billingPeriodEnvelopesSent) &&
        Objects.equals(this.billingPeriodEnvelopesAllowed, accountInformation.billingPeriodEnvelopesAllowed) &&
        Objects.equals(this.billingPeriodDaysRemaining, accountInformation.billingPeriodDaysRemaining) &&
        Objects.equals(this.canUpgrade, accountInformation.canUpgrade) &&
        Objects.equals(this.canCancelRenewal, accountInformation.canCancelRenewal) &&
        Objects.equals(this.envelopeSendingBlocked, accountInformation.envelopeSendingBlocked) &&
        Objects.equals(this.envelopeUnitPrice, accountInformation.envelopeUnitPrice) &&
        Objects.equals(this.suspensionStatus, accountInformation.suspensionStatus) &&
        Objects.equals(this.suspensionDate, accountInformation.suspensionDate) &&
        Objects.equals(this.accountName, accountInformation.accountName) &&
        Objects.equals(this.connectPermission, accountInformation.connectPermission) &&
        Objects.equals(this.docuSignLandingUrl, accountInformation.docuSignLandingUrl) &&
        Objects.equals(this.distributorCode, accountInformation.distributorCode) &&
        Objects.equals(this.accountIdGuid, accountInformation.accountIdGuid) &&
        Objects.equals(this.currencyCode, accountInformation.currencyCode) &&
        Objects.equals(this.forgottenPasswordQuestionsCount, accountInformation.forgottenPasswordQuestionsCount) &&
        Objects.equals(this.paymentMethod, accountInformation.paymentMethod) &&
        Objects.equals(this.seatsAllowed, accountInformation.seatsAllowed) &&
        Objects.equals(this.seatsInUse, accountInformation.seatsInUse) &&
        Objects.equals(this.createdDate, accountInformation.createdDate) &&
        Objects.equals(this.isDowngrade, accountInformation.isDowngrade) &&
        Objects.equals(this.billingProfile, accountInformation.billingProfile) &&
        Objects.equals(this.status21CFRPart11, accountInformation.status21CFRPart11) &&
        Objects.equals(this.allowTransactionRooms, accountInformation.allowTransactionRooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPlanId, planName, planClassification, planStartDate, planEndDate, billingPeriodStartDate, billingPeriodEndDate, billingPeriodEnvelopesSent, billingPeriodEnvelopesAllowed, billingPeriodDaysRemaining, canUpgrade, canCancelRenewal, envelopeSendingBlocked, envelopeUnitPrice, suspensionStatus, suspensionDate, accountName, connectPermission, docuSignLandingUrl, distributorCode, accountIdGuid, currencyCode, forgottenPasswordQuestionsCount, paymentMethod, seatsAllowed, seatsInUse, createdDate, isDowngrade, billingProfile, status21CFRPart11, allowTransactionRooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformation {\n");
    
    sb.append("    currentPlanId: ").append(toIndentedString(currentPlanId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
    sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
    sb.append("    billingPeriodStartDate: ").append(toIndentedString(billingPeriodStartDate)).append("\n");
    sb.append("    billingPeriodEndDate: ").append(toIndentedString(billingPeriodEndDate)).append("\n");
    sb.append("    billingPeriodEnvelopesSent: ").append(toIndentedString(billingPeriodEnvelopesSent)).append("\n");
    sb.append("    billingPeriodEnvelopesAllowed: ").append(toIndentedString(billingPeriodEnvelopesAllowed)).append("\n");
    sb.append("    billingPeriodDaysRemaining: ").append(toIndentedString(billingPeriodDaysRemaining)).append("\n");
    sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
    sb.append("    canCancelRenewal: ").append(toIndentedString(canCancelRenewal)).append("\n");
    sb.append("    envelopeSendingBlocked: ").append(toIndentedString(envelopeSendingBlocked)).append("\n");
    sb.append("    envelopeUnitPrice: ").append(toIndentedString(envelopeUnitPrice)).append("\n");
    sb.append("    suspensionStatus: ").append(toIndentedString(suspensionStatus)).append("\n");
    sb.append("    suspensionDate: ").append(toIndentedString(suspensionDate)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    connectPermission: ").append(toIndentedString(connectPermission)).append("\n");
    sb.append("    docuSignLandingUrl: ").append(toIndentedString(docuSignLandingUrl)).append("\n");
    sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    forgottenPasswordQuestionsCount: ").append(toIndentedString(forgottenPasswordQuestionsCount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    seatsAllowed: ").append(toIndentedString(seatsAllowed)).append("\n");
    sb.append("    seatsInUse: ").append(toIndentedString(seatsInUse)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
    sb.append("    billingProfile: ").append(toIndentedString(billingProfile)).append("\n");
    sb.append("    status21CFRPart11: ").append(toIndentedString(status21CFRPart11)).append("\n");
    sb.append("    allowTransactionRooms: ").append(toIndentedString(allowTransactionRooms)).append("\n");
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

