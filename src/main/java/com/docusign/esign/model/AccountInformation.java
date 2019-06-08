package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.RecipientDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains account Information.
 */
@ApiModel(description = "Contains account Information.")

public class AccountInformation {
  @JsonProperty("accountIdGuid")
  private String accountIdGuid = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountSettings")
  private AccountSettingsInformation accountSettings = null;

  @JsonProperty("allowTransactionRooms")
  private String allowTransactionRooms = null;

  @JsonProperty("billingPeriodDaysRemaining")
  private String billingPeriodDaysRemaining = null;

  @JsonProperty("billingPeriodEndDate")
  private String billingPeriodEndDate = null;

  @JsonProperty("billingPeriodEnvelopesAllowed")
  private String billingPeriodEnvelopesAllowed = null;

  @JsonProperty("billingPeriodEnvelopesSent")
  private String billingPeriodEnvelopesSent = null;

  @JsonProperty("billingPeriodStartDate")
  private String billingPeriodStartDate = null;

  @JsonProperty("billingProfile")
  private String billingProfile = null;

  @JsonProperty("canUpgrade")
  private String canUpgrade = null;

  @JsonProperty("connectPermission")
  private String connectPermission = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currentPlanId")
  private String currentPlanId = null;

  @JsonProperty("distributorCode")
  private String distributorCode = null;

  @JsonProperty("docuSignLandingUrl")
  private String docuSignLandingUrl = null;

  @JsonProperty("envelopeSendingBlocked")
  private String envelopeSendingBlocked = null;

  @JsonProperty("envelopeUnitPrice")
  private String envelopeUnitPrice = null;

  @JsonProperty("externalAccountId")
  private String externalAccountId = null;

  @JsonProperty("forgottenPasswordQuestionsCount")
  private String forgottenPasswordQuestionsCount = null;

  @JsonProperty("isDowngrade")
  private String isDowngrade = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("planClassification")
  private String planClassification = null;

  @JsonProperty("planEndDate")
  private String planEndDate = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("planStartDate")
  private String planStartDate = null;

  @JsonProperty("recipientDomains")
  private java.util.List<RecipientDomain> recipientDomains = new java.util.ArrayList<RecipientDomain>();

  @JsonProperty("seatsAllowed")
  private String seatsAllowed = null;

  @JsonProperty("seatsInUse")
  private String seatsInUse = null;

  @JsonProperty("status21CFRPart11")
  private String status21CFRPart11 = null;

  @JsonProperty("suspensionDate")
  private String suspensionDate = null;

  @JsonProperty("suspensionStatus")
  private String suspensionStatus = null;

  public AccountInformation accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }

   /**
   * The GUID associated with the account ID.
   * @return accountIdGuid
  **/
  @ApiModelProperty(example = "null", value = "The GUID associated with the account ID.")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }

  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  public AccountInformation accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * The name of the current account.
   * @return accountName
  **/
  @ApiModelProperty(example = "null", value = "The name of the current account.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountInformation accountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
    return this;
  }

   /**
   * Get accountSettings
   * @return accountSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountSettingsInformation getAccountSettings() {
    return accountSettings;
  }

  public void setAccountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
  }

  public AccountInformation allowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
    return this;
  }

   /**
   * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.
   * @return allowTransactionRooms
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.")
  public String getAllowTransactionRooms() {
    return allowTransactionRooms;
  }

  public void setAllowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
  }

  public AccountInformation billingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPeriodDaysRemaining
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBillingPeriodDaysRemaining() {
    return billingPeriodDaysRemaining;
  }

  public void setBillingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
  }

  public AccountInformation billingPeriodEndDate(String billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPeriodEndDate
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  public void setBillingPeriodEndDate(String billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  public AccountInformation billingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
    this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPeriodEnvelopesAllowed
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBillingPeriodEnvelopesAllowed() {
    return billingPeriodEnvelopesAllowed;
  }

  public void setBillingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
    this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
  }

  public AccountInformation billingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
    this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPeriodEnvelopesSent
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBillingPeriodEnvelopesSent() {
    return billingPeriodEnvelopesSent;
  }

  public void setBillingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
    this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
  }

  public AccountInformation billingPeriodStartDate(String billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPeriodStartDate
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  public void setBillingPeriodStartDate(String billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  public AccountInformation billingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingProfile
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBillingProfile() {
    return billingProfile;
  }

  public void setBillingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
  }

  public AccountInformation canUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
    return this;
  }

   /**
   * When set to **true**, specifies that you can upgrade the account through the API.
   * @return canUpgrade
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, specifies that you can upgrade the account through the API.")
  public String getCanUpgrade() {
    return canUpgrade;
  }

  public void setCanUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
  }

  public AccountInformation connectPermission(String connectPermission) {
    this.connectPermission = connectPermission;
    return this;
  }

   /**
   * 
   * @return connectPermission
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectPermission() {
    return connectPermission;
  }

  public void setConnectPermission(String connectPermission) {
    this.connectPermission = connectPermission;
  }

  public AccountInformation createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public AccountInformation currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code for the account.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AccountInformation currentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
    return this;
  }

   /**
   * Identifies the plan that was used create this account.
   * @return currentPlanId
  **/
  @ApiModelProperty(example = "null", value = "Identifies the plan that was used create this account.")
  public String getCurrentPlanId() {
    return currentPlanId;
  }

  public void setCurrentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
  }

  public AccountInformation distributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
    return this;
  }

   /**
   * The code that identifies the billing plan groups and plans for the new account.
   * @return distributorCode
  **/
  @ApiModelProperty(example = "null", value = "The code that identifies the billing plan groups and plans for the new account.")
  public String getDistributorCode() {
    return distributorCode;
  }

  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  public AccountInformation docuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
    return this;
  }

   /**
   * 
   * @return docuSignLandingUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocuSignLandingUrl() {
    return docuSignLandingUrl;
  }

  public void setDocuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
  }

  public AccountInformation envelopeSendingBlocked(String envelopeSendingBlocked) {
    this.envelopeSendingBlocked = envelopeSendingBlocked;
    return this;
  }

   /**
   * 
   * @return envelopeSendingBlocked
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopeSendingBlocked() {
    return envelopeSendingBlocked;
  }

  public void setEnvelopeSendingBlocked(String envelopeSendingBlocked) {
    this.envelopeSendingBlocked = envelopeSendingBlocked;
  }

  public AccountInformation envelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
    return this;
  }

   /**
   * 
   * @return envelopeUnitPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopeUnitPrice() {
    return envelopeUnitPrice;
  }

  public void setEnvelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
  }

  public AccountInformation externalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

   /**
   * 
   * @return externalAccountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }

  public AccountInformation forgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
    this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
    return this;
  }

   /**
   *  A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.
   * @return forgottenPasswordQuestionsCount
  **/
  @ApiModelProperty(example = "null", value = " A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.")
  public String getForgottenPasswordQuestionsCount() {
    return forgottenPasswordQuestionsCount;
  }

  public void setForgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
    this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
  }

  public AccountInformation isDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
    return this;
  }

   /**
   * 
   * @return isDowngrade
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsDowngrade() {
    return isDowngrade;
  }

  public void setIsDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
  }

  public AccountInformation paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public AccountInformation planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }

   /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
   * @return planClassification
  **/
  @ApiModelProperty(example = "null", value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  public String getPlanClassification() {
    return planClassification;
  }

  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }

  public AccountInformation planEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
    return this;
  }

   /**
   * The date that the current plan will end.
   * @return planEndDate
  **/
  @ApiModelProperty(example = "null", value = "The date that the current plan will end.")
  public String getPlanEndDate() {
    return planEndDate;
  }

  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }

  public AccountInformation planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * The name of the Billing Plan.
   * @return planName
  **/
  @ApiModelProperty(example = "null", value = "The name of the Billing Plan.")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public AccountInformation planStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
    return this;
  }

   /**
   * The date that the Account started using the current plan.
   * @return planStartDate
  **/
  @ApiModelProperty(example = "null", value = "The date that the Account started using the current plan.")
  public String getPlanStartDate() {
    return planStartDate;
  }

  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }

  public AccountInformation recipientDomains(java.util.List<RecipientDomain> recipientDomains) {
    this.recipientDomains = recipientDomains;
    return this;
  }

  public AccountInformation addRecipientDomainsItem(RecipientDomain recipientDomainsItem) {
    this.recipientDomains.add(recipientDomainsItem);
    return this;
  }

   /**
   * 
   * @return recipientDomains
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<RecipientDomain> getRecipientDomains() {
    return recipientDomains;
  }

  public void setRecipientDomains(java.util.List<RecipientDomain> recipientDomains) {
    this.recipientDomains = recipientDomains;
  }

  public AccountInformation seatsAllowed(String seatsAllowed) {
    this.seatsAllowed = seatsAllowed;
    return this;
  }

   /**
   * 
   * @return seatsAllowed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeatsAllowed() {
    return seatsAllowed;
  }

  public void setSeatsAllowed(String seatsAllowed) {
    this.seatsAllowed = seatsAllowed;
  }

  public AccountInformation seatsInUse(String seatsInUse) {
    this.seatsInUse = seatsInUse;
    return this;
  }

   /**
   * 
   * @return seatsInUse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeatsInUse() {
    return seatsInUse;
  }

  public void setSeatsInUse(String seatsInUse) {
    this.seatsInUse = seatsInUse;
  }

  public AccountInformation status21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
    return this;
  }

   /**
   * 
   * @return status21CFRPart11
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus21CFRPart11() {
    return status21CFRPart11;
  }

  public void setStatus21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
  }

  public AccountInformation suspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
    return this;
  }

   /**
   * 
   * @return suspensionDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuspensionDate() {
    return suspensionDate;
  }

  public void setSuspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
  }

  public AccountInformation suspensionStatus(String suspensionStatus) {
    this.suspensionStatus = suspensionStatus;
    return this;
  }

   /**
   * 
   * @return suspensionStatus
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.accountIdGuid, accountInformation.accountIdGuid) &&
        Objects.equals(this.accountName, accountInformation.accountName) &&
        Objects.equals(this.accountSettings, accountInformation.accountSettings) &&
        Objects.equals(this.allowTransactionRooms, accountInformation.allowTransactionRooms) &&
        Objects.equals(this.billingPeriodDaysRemaining, accountInformation.billingPeriodDaysRemaining) &&
        Objects.equals(this.billingPeriodEndDate, accountInformation.billingPeriodEndDate) &&
        Objects.equals(this.billingPeriodEnvelopesAllowed, accountInformation.billingPeriodEnvelopesAllowed) &&
        Objects.equals(this.billingPeriodEnvelopesSent, accountInformation.billingPeriodEnvelopesSent) &&
        Objects.equals(this.billingPeriodStartDate, accountInformation.billingPeriodStartDate) &&
        Objects.equals(this.billingProfile, accountInformation.billingProfile) &&
        Objects.equals(this.canUpgrade, accountInformation.canUpgrade) &&
        Objects.equals(this.connectPermission, accountInformation.connectPermission) &&
        Objects.equals(this.createdDate, accountInformation.createdDate) &&
        Objects.equals(this.currencyCode, accountInformation.currencyCode) &&
        Objects.equals(this.currentPlanId, accountInformation.currentPlanId) &&
        Objects.equals(this.distributorCode, accountInformation.distributorCode) &&
        Objects.equals(this.docuSignLandingUrl, accountInformation.docuSignLandingUrl) &&
        Objects.equals(this.envelopeSendingBlocked, accountInformation.envelopeSendingBlocked) &&
        Objects.equals(this.envelopeUnitPrice, accountInformation.envelopeUnitPrice) &&
        Objects.equals(this.externalAccountId, accountInformation.externalAccountId) &&
        Objects.equals(this.forgottenPasswordQuestionsCount, accountInformation.forgottenPasswordQuestionsCount) &&
        Objects.equals(this.isDowngrade, accountInformation.isDowngrade) &&
        Objects.equals(this.paymentMethod, accountInformation.paymentMethod) &&
        Objects.equals(this.planClassification, accountInformation.planClassification) &&
        Objects.equals(this.planEndDate, accountInformation.planEndDate) &&
        Objects.equals(this.planName, accountInformation.planName) &&
        Objects.equals(this.planStartDate, accountInformation.planStartDate) &&
        Objects.equals(this.recipientDomains, accountInformation.recipientDomains) &&
        Objects.equals(this.seatsAllowed, accountInformation.seatsAllowed) &&
        Objects.equals(this.seatsInUse, accountInformation.seatsInUse) &&
        Objects.equals(this.status21CFRPart11, accountInformation.status21CFRPart11) &&
        Objects.equals(this.suspensionDate, accountInformation.suspensionDate) &&
        Objects.equals(this.suspensionStatus, accountInformation.suspensionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdGuid, accountName, accountSettings, allowTransactionRooms, billingPeriodDaysRemaining, billingPeriodEndDate, billingPeriodEnvelopesAllowed, billingPeriodEnvelopesSent, billingPeriodStartDate, billingProfile, canUpgrade, connectPermission, createdDate, currencyCode, currentPlanId, distributorCode, docuSignLandingUrl, envelopeSendingBlocked, envelopeUnitPrice, externalAccountId, forgottenPasswordQuestionsCount, isDowngrade, paymentMethod, planClassification, planEndDate, planName, planStartDate, recipientDomains, seatsAllowed, seatsInUse, status21CFRPart11, suspensionDate, suspensionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformation {\n");
    
    sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
    sb.append("    allowTransactionRooms: ").append(toIndentedString(allowTransactionRooms)).append("\n");
    sb.append("    billingPeriodDaysRemaining: ").append(toIndentedString(billingPeriodDaysRemaining)).append("\n");
    sb.append("    billingPeriodEndDate: ").append(toIndentedString(billingPeriodEndDate)).append("\n");
    sb.append("    billingPeriodEnvelopesAllowed: ").append(toIndentedString(billingPeriodEnvelopesAllowed)).append("\n");
    sb.append("    billingPeriodEnvelopesSent: ").append(toIndentedString(billingPeriodEnvelopesSent)).append("\n");
    sb.append("    billingPeriodStartDate: ").append(toIndentedString(billingPeriodStartDate)).append("\n");
    sb.append("    billingProfile: ").append(toIndentedString(billingProfile)).append("\n");
    sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
    sb.append("    connectPermission: ").append(toIndentedString(connectPermission)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currentPlanId: ").append(toIndentedString(currentPlanId)).append("\n");
    sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    sb.append("    docuSignLandingUrl: ").append(toIndentedString(docuSignLandingUrl)).append("\n");
    sb.append("    envelopeSendingBlocked: ").append(toIndentedString(envelopeSendingBlocked)).append("\n");
    sb.append("    envelopeUnitPrice: ").append(toIndentedString(envelopeUnitPrice)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    forgottenPasswordQuestionsCount: ").append(toIndentedString(forgottenPasswordQuestionsCount)).append("\n");
    sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
    sb.append("    recipientDomains: ").append(toIndentedString(recipientDomains)).append("\n");
    sb.append("    seatsAllowed: ").append(toIndentedString(seatsAllowed)).append("\n");
    sb.append("    seatsInUse: ").append(toIndentedString(seatsInUse)).append("\n");
    sb.append("    status21CFRPart11: ").append(toIndentedString(status21CFRPart11)).append("\n");
    sb.append("    suspensionDate: ").append(toIndentedString(suspensionDate)).append("\n");
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

