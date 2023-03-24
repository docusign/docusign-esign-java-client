package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.BrandsResponse;
import com.docusign.esign.model.RecipientDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains account Information..
 *
 */
@Schema(description = "Contains account Information.")

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

  @JsonProperty("brands")
  private BrandsResponse brands = null;

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

  @JsonProperty("displayApplianceStartUrl")
  private String displayApplianceStartUrl = null;

  @JsonProperty("displayApplianceUrl")
  private String displayApplianceUrl = null;

  @JsonProperty("distributorCode")
  private String distributorCode = null;

  @JsonProperty("docuSignLandingUrl")
  private String docuSignLandingUrl = null;

  @JsonProperty("dssValues")
  private java.util.Map<String, String> dssValues = null;

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
  private java.util.List<RecipientDomain> recipientDomains = null;

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

  @JsonProperty("useDisplayAppliance")
  private Boolean useDisplayAppliance = null;


  /**
   * accountIdGuid.
   *
   * @return AccountInformation
   **/
  public AccountInformation accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }

  /**
   * The GUID associated with the account ID..
   * @return accountIdGuid
   **/
  @Schema(description = "The GUID associated with the account ID.")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }

  /**
   * setAccountIdGuid.
   **/
  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }


  /**
   * accountName.
   *
   * @return AccountInformation
   **/
  public AccountInformation accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The name of the current account..
   * @return accountName
   **/
  @Schema(description = "The name of the current account.")
  public String getAccountName() {
    return accountName;
  }

  /**
   * setAccountName.
   **/
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  /**
   * accountSettings.
   *
   * @return AccountInformation
   **/
  public AccountInformation accountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
    return this;
  }

  /**
   * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden..
   * @return accountSettings
   **/
  @Schema(description = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
  public AccountSettingsInformation getAccountSettings() {
    return accountSettings;
  }

  /**
   * setAccountSettings.
   **/
  public void setAccountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
  }


  /**
   * allowTransactionRooms.
   *
   * @return AccountInformation
   **/
  public AccountInformation allowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
    return this;
  }

  /**
   * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled..
   * @return allowTransactionRooms
   **/
  @Schema(description = "When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.")
  public String getAllowTransactionRooms() {
    return allowTransactionRooms;
  }

  /**
   * setAllowTransactionRooms.
   **/
  public void setAllowTransactionRooms(String allowTransactionRooms) {
    this.allowTransactionRooms = allowTransactionRooms;
  }


  /**
   * billingPeriodDaysRemaining.
   *
   * @return AccountInformation
   **/
  public AccountInformation billingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingPeriodDaysRemaining
   **/
  @Schema(description = "Reserved: TBD")
  public String getBillingPeriodDaysRemaining() {
    return billingPeriodDaysRemaining;
  }

  /**
   * setBillingPeriodDaysRemaining.
   **/
  public void setBillingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
    this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
  }


  /**
   * billingPeriodEndDate.
   *
   * @return AccountInformation
   **/
  public AccountInformation billingPeriodEndDate(String billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingPeriodEndDate
   **/
  @Schema(description = "Reserved: TBD")
  public String getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  /**
   * setBillingPeriodEndDate.
   **/
  public void setBillingPeriodEndDate(String billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }


  /**
   * billingPeriodEnvelopesAllowed.
   *
   * @return AccountInformation
   **/
  public AccountInformation billingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
    this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingPeriodEnvelopesAllowed
   **/
  @Schema(description = "Reserved: TBD")
  public String getBillingPeriodEnvelopesAllowed() {
    return billingPeriodEnvelopesAllowed;
  }

  /**
   * setBillingPeriodEnvelopesAllowed.
   **/
  public void setBillingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
    this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
  }


  /**
   * billingPeriodEnvelopesSent.
   *
   * @return AccountInformation
   **/
  public AccountInformation billingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
    this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingPeriodEnvelopesSent
   **/
  @Schema(description = "Reserved: TBD")
  public String getBillingPeriodEnvelopesSent() {
    return billingPeriodEnvelopesSent;
  }

  /**
   * setBillingPeriodEnvelopesSent.
   **/
  public void setBillingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
    this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
  }


  /**
   * billingPeriodStartDate.
   *
   * @return AccountInformation
   **/
  public AccountInformation billingPeriodStartDate(String billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingPeriodStartDate
   **/
  @Schema(description = "Reserved: TBD")
  public String getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  /**
   * setBillingPeriodStartDate.
   **/
  public void setBillingPeriodStartDate(String billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }


  /**
   * billingProfile.
   *
   * @return AccountInformation
   **/
  public AccountInformation billingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingProfile
   **/
  @Schema(description = "Reserved: TBD")
  public String getBillingProfile() {
    return billingProfile;
  }

  /**
   * setBillingProfile.
   **/
  public void setBillingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
  }


  /**
   * brands.
   *
   * @return AccountInformation
   **/
  public AccountInformation brands(BrandsResponse brands) {
    this.brands = brands;
    return this;
  }

  /**
   * .
   * @return brands
   **/
  @Schema(description = "")
  public BrandsResponse getBrands() {
    return brands;
  }

  /**
   * setBrands.
   **/
  public void setBrands(BrandsResponse brands) {
    this.brands = brands;
  }


  /**
   * canUpgrade.
   *
   * @return AccountInformation
   **/
  public AccountInformation canUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
    return this;
  }

  /**
   * When set to **true**, specifies that you can upgrade the account through the API..
   * @return canUpgrade
   **/
  @Schema(description = "When set to **true**, specifies that you can upgrade the account through the API.")
  public String getCanUpgrade() {
    return canUpgrade;
  }

  /**
   * setCanUpgrade.
   **/
  public void setCanUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
  }


  /**
   * connectPermission.
   *
   * @return AccountInformation
   **/
  public AccountInformation connectPermission(String connectPermission) {
    this.connectPermission = connectPermission;
    return this;
  }

  /**
   * .
   * @return connectPermission
   **/
  @Schema(description = "")
  public String getConnectPermission() {
    return connectPermission;
  }

  /**
   * setConnectPermission.
   **/
  public void setConnectPermission(String connectPermission) {
    this.connectPermission = connectPermission;
  }


  /**
   * createdDate.
   *
   * @return AccountInformation
   **/
  public AccountInformation createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * .
   * @return createdDate
   **/
  @Schema(description = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * currencyCode.
   *
   * @return AccountInformation
   **/
  public AccountInformation currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Specifies the ISO currency code for the account..
   * @return currencyCode
   **/
  @Schema(description = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * setCurrencyCode.
   **/
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * currentPlanId.
   *
   * @return AccountInformation
   **/
  public AccountInformation currentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
    return this;
  }

  /**
   * Identifies the plan that was used create this account..
   * @return currentPlanId
   **/
  @Schema(description = "Identifies the plan that was used create this account.")
  public String getCurrentPlanId() {
    return currentPlanId;
  }

  /**
   * setCurrentPlanId.
   **/
  public void setCurrentPlanId(String currentPlanId) {
    this.currentPlanId = currentPlanId;
  }


  /**
   * displayApplianceStartUrl.
   *
   * @return AccountInformation
   **/
  public AccountInformation displayApplianceStartUrl(String displayApplianceStartUrl) {
    this.displayApplianceStartUrl = displayApplianceStartUrl;
    return this;
  }

  /**
   * .
   * @return displayApplianceStartUrl
   **/
  @Schema(description = "")
  public String getDisplayApplianceStartUrl() {
    return displayApplianceStartUrl;
  }

  /**
   * setDisplayApplianceStartUrl.
   **/
  public void setDisplayApplianceStartUrl(String displayApplianceStartUrl) {
    this.displayApplianceStartUrl = displayApplianceStartUrl;
  }


  /**
   * displayApplianceUrl.
   *
   * @return AccountInformation
   **/
  public AccountInformation displayApplianceUrl(String displayApplianceUrl) {
    this.displayApplianceUrl = displayApplianceUrl;
    return this;
  }

  /**
   * .
   * @return displayApplianceUrl
   **/
  @Schema(description = "")
  public String getDisplayApplianceUrl() {
    return displayApplianceUrl;
  }

  /**
   * setDisplayApplianceUrl.
   **/
  public void setDisplayApplianceUrl(String displayApplianceUrl) {
    this.displayApplianceUrl = displayApplianceUrl;
  }


  /**
   * distributorCode.
   *
   * @return AccountInformation
   **/
  public AccountInformation distributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
    return this;
  }

  /**
   * The code that identifies the billing plan groups and plans for the new account..
   * @return distributorCode
   **/
  @Schema(description = "The code that identifies the billing plan groups and plans for the new account.")
  public String getDistributorCode() {
    return distributorCode;
  }

  /**
   * setDistributorCode.
   **/
  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }


  /**
   * docuSignLandingUrl.
   *
   * @return AccountInformation
   **/
  public AccountInformation docuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
    return this;
  }

  /**
   * .
   * @return docuSignLandingUrl
   **/
  @Schema(description = "")
  public String getDocuSignLandingUrl() {
    return docuSignLandingUrl;
  }

  /**
   * setDocuSignLandingUrl.
   **/
  public void setDocuSignLandingUrl(String docuSignLandingUrl) {
    this.docuSignLandingUrl = docuSignLandingUrl;
  }


  /**
   * dssValues.
   *
   * @return AccountInformation
   **/
  public AccountInformation dssValues(java.util.Map<String, String> dssValues) {
    this.dssValues = dssValues;
    return this;
  }

  /**
   * putDssValuesItem.
   *
   * @return AccountInformation
   **/
  public AccountInformation putDssValuesItem(String key, String dssValuesItem) {
    if (this.dssValues == null) {
      this.dssValues = new java.util.HashMap<>();
    }
    this.dssValues.put(key, dssValuesItem);
    return this;
  }

  /**
   * .
   * @return dssValues
   **/
  @Schema(description = "")
  public java.util.Map<String, String> getDssValues() {
    return dssValues;
  }

  /**
   * setDssValues.
   **/
  public void setDssValues(java.util.Map<String, String> dssValues) {
    this.dssValues = dssValues;
  }


  /**
   * envelopeSendingBlocked.
   *
   * @return AccountInformation
   **/
  public AccountInformation envelopeSendingBlocked(String envelopeSendingBlocked) {
    this.envelopeSendingBlocked = envelopeSendingBlocked;
    return this;
  }

  /**
   * .
   * @return envelopeSendingBlocked
   **/
  @Schema(description = "")
  public String getEnvelopeSendingBlocked() {
    return envelopeSendingBlocked;
  }

  /**
   * setEnvelopeSendingBlocked.
   **/
  public void setEnvelopeSendingBlocked(String envelopeSendingBlocked) {
    this.envelopeSendingBlocked = envelopeSendingBlocked;
  }


  /**
   * envelopeUnitPrice.
   *
   * @return AccountInformation
   **/
  public AccountInformation envelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
    return this;
  }

  /**
   * .
   * @return envelopeUnitPrice
   **/
  @Schema(description = "")
  public String getEnvelopeUnitPrice() {
    return envelopeUnitPrice;
  }

  /**
   * setEnvelopeUnitPrice.
   **/
  public void setEnvelopeUnitPrice(String envelopeUnitPrice) {
    this.envelopeUnitPrice = envelopeUnitPrice;
  }


  /**
   * externalAccountId.
   *
   * @return AccountInformation
   **/
  public AccountInformation externalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * .
   * @return externalAccountId
   **/
  @Schema(description = "")
  public String getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * setExternalAccountId.
   **/
  public void setExternalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  /**
   * forgottenPasswordQuestionsCount.
   *
   * @return AccountInformation
   **/
  public AccountInformation forgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
    this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
    return this;
  }

  /**
   *  A complex element that contains up to four Question/Answer pairs for forgotten password information for a user..
   * @return forgottenPasswordQuestionsCount
   **/
  @Schema(description = " A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.")
  public String getForgottenPasswordQuestionsCount() {
    return forgottenPasswordQuestionsCount;
  }

  /**
   * setForgottenPasswordQuestionsCount.
   **/
  public void setForgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
    this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
  }


  /**
   * isDowngrade.
   *
   * @return AccountInformation
   **/
  public AccountInformation isDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
    return this;
  }

  /**
   * .
   * @return isDowngrade
   **/
  @Schema(description = "")
  public String getIsDowngrade() {
    return isDowngrade;
  }

  /**
   * setIsDowngrade.
   **/
  public void setIsDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
  }


  /**
   * paymentMethod.
   *
   * @return AccountInformation
   **/
  public AccountInformation paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * .
   * @return paymentMethod
   **/
  @Schema(description = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * setPaymentMethod.
   **/
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  /**
   * planClassification.
   *
   * @return AccountInformation
   **/
  public AccountInformation planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }

  /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free..
   * @return planClassification
   **/
  @Schema(description = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  public String getPlanClassification() {
    return planClassification;
  }

  /**
   * setPlanClassification.
   **/
  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }


  /**
   * planEndDate.
   *
   * @return AccountInformation
   **/
  public AccountInformation planEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
    return this;
  }

  /**
   * The date that the current plan will end..
   * @return planEndDate
   **/
  @Schema(description = "The date that the current plan will end.")
  public String getPlanEndDate() {
    return planEndDate;
  }

  /**
   * setPlanEndDate.
   **/
  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }


  /**
   * planName.
   *
   * @return AccountInformation
   **/
  public AccountInformation planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * The name of the Billing Plan..
   * @return planName
   **/
  @Schema(description = "The name of the Billing Plan.")
  public String getPlanName() {
    return planName;
  }

  /**
   * setPlanName.
   **/
  public void setPlanName(String planName) {
    this.planName = planName;
  }


  /**
   * planStartDate.
   *
   * @return AccountInformation
   **/
  public AccountInformation planStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
    return this;
  }

  /**
   * The date that the Account started using the current plan..
   * @return planStartDate
   **/
  @Schema(description = "The date that the Account started using the current plan.")
  public String getPlanStartDate() {
    return planStartDate;
  }

  /**
   * setPlanStartDate.
   **/
  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }


  /**
   * recipientDomains.
   *
   * @return AccountInformation
   **/
  public AccountInformation recipientDomains(java.util.List<RecipientDomain> recipientDomains) {
    this.recipientDomains = recipientDomains;
    return this;
  }
  
  /**
   * addRecipientDomainsItem.
   *
   * @return AccountInformation
   **/
  public AccountInformation addRecipientDomainsItem(RecipientDomain recipientDomainsItem) {
    if (this.recipientDomains == null) {
      this.recipientDomains = new java.util.ArrayList<>();
    }
    this.recipientDomains.add(recipientDomainsItem);
    return this;
  }

  /**
   * .
   * @return recipientDomains
   **/
  @Schema(description = "")
  public java.util.List<RecipientDomain> getRecipientDomains() {
    return recipientDomains;
  }

  /**
   * setRecipientDomains.
   **/
  public void setRecipientDomains(java.util.List<RecipientDomain> recipientDomains) {
    this.recipientDomains = recipientDomains;
  }


  /**
   * seatsAllowed.
   *
   * @return AccountInformation
   **/
  public AccountInformation seatsAllowed(String seatsAllowed) {
    this.seatsAllowed = seatsAllowed;
    return this;
  }

  /**
   * .
   * @return seatsAllowed
   **/
  @Schema(description = "")
  public String getSeatsAllowed() {
    return seatsAllowed;
  }

  /**
   * setSeatsAllowed.
   **/
  public void setSeatsAllowed(String seatsAllowed) {
    this.seatsAllowed = seatsAllowed;
  }


  /**
   * seatsInUse.
   *
   * @return AccountInformation
   **/
  public AccountInformation seatsInUse(String seatsInUse) {
    this.seatsInUse = seatsInUse;
    return this;
  }

  /**
   * .
   * @return seatsInUse
   **/
  @Schema(description = "")
  public String getSeatsInUse() {
    return seatsInUse;
  }

  /**
   * setSeatsInUse.
   **/
  public void setSeatsInUse(String seatsInUse) {
    this.seatsInUse = seatsInUse;
  }


  /**
   * status21CFRPart11.
   *
   * @return AccountInformation
   **/
  public AccountInformation status21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
    return this;
  }

  /**
   * .
   * @return status21CFRPart11
   **/
  @Schema(description = "")
  public String getStatus21CFRPart11() {
    return status21CFRPart11;
  }

  /**
   * setStatus21CFRPart11.
   **/
  public void setStatus21CFRPart11(String status21CFRPart11) {
    this.status21CFRPart11 = status21CFRPart11;
  }


  /**
   * suspensionDate.
   *
   * @return AccountInformation
   **/
  public AccountInformation suspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
    return this;
  }

  /**
   * .
   * @return suspensionDate
   **/
  @Schema(description = "")
  public String getSuspensionDate() {
    return suspensionDate;
  }

  /**
   * setSuspensionDate.
   **/
  public void setSuspensionDate(String suspensionDate) {
    this.suspensionDate = suspensionDate;
  }


  /**
   * suspensionStatus.
   *
   * @return AccountInformation
   **/
  public AccountInformation suspensionStatus(String suspensionStatus) {
    this.suspensionStatus = suspensionStatus;
    return this;
  }

  /**
   * .
   * @return suspensionStatus
   **/
  @Schema(description = "")
  public String getSuspensionStatus() {
    return suspensionStatus;
  }

  /**
   * setSuspensionStatus.
   **/
  public void setSuspensionStatus(String suspensionStatus) {
    this.suspensionStatus = suspensionStatus;
  }


  /**
   * useDisplayAppliance.
   *
   * @return AccountInformation
   **/
  public AccountInformation useDisplayAppliance(Boolean useDisplayAppliance) {
    this.useDisplayAppliance = useDisplayAppliance;
    return this;
  }

  /**
   * .
   * @return useDisplayAppliance
   **/
  @Schema(description = "")
  public Boolean isUseDisplayAppliance() {
    return useDisplayAppliance;
  }

  /**
   * setUseDisplayAppliance.
   **/
  public void setUseDisplayAppliance(Boolean useDisplayAppliance) {
    this.useDisplayAppliance = useDisplayAppliance;
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
        Objects.equals(this.brands, accountInformation.brands) &&
        Objects.equals(this.canUpgrade, accountInformation.canUpgrade) &&
        Objects.equals(this.connectPermission, accountInformation.connectPermission) &&
        Objects.equals(this.createdDate, accountInformation.createdDate) &&
        Objects.equals(this.currencyCode, accountInformation.currencyCode) &&
        Objects.equals(this.currentPlanId, accountInformation.currentPlanId) &&
        Objects.equals(this.displayApplianceStartUrl, accountInformation.displayApplianceStartUrl) &&
        Objects.equals(this.displayApplianceUrl, accountInformation.displayApplianceUrl) &&
        Objects.equals(this.distributorCode, accountInformation.distributorCode) &&
        Objects.equals(this.docuSignLandingUrl, accountInformation.docuSignLandingUrl) &&
        Objects.equals(this.dssValues, accountInformation.dssValues) &&
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
        Objects.equals(this.suspensionStatus, accountInformation.suspensionStatus) &&
        Objects.equals(this.useDisplayAppliance, accountInformation.useDisplayAppliance);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountIdGuid, accountName, accountSettings, allowTransactionRooms, billingPeriodDaysRemaining, billingPeriodEndDate, billingPeriodEnvelopesAllowed, billingPeriodEnvelopesSent, billingPeriodStartDate, billingProfile, brands, canUpgrade, connectPermission, createdDate, currencyCode, currentPlanId, displayApplianceStartUrl, displayApplianceUrl, distributorCode, docuSignLandingUrl, dssValues, envelopeSendingBlocked, envelopeUnitPrice, externalAccountId, forgottenPasswordQuestionsCount, isDowngrade, paymentMethod, planClassification, planEndDate, planName, planStartDate, recipientDomains, seatsAllowed, seatsInUse, status21CFRPart11, suspensionDate, suspensionStatus, useDisplayAppliance);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
    sb.append("    connectPermission: ").append(toIndentedString(connectPermission)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currentPlanId: ").append(toIndentedString(currentPlanId)).append("\n");
    sb.append("    displayApplianceStartUrl: ").append(toIndentedString(displayApplianceStartUrl)).append("\n");
    sb.append("    displayApplianceUrl: ").append(toIndentedString(displayApplianceUrl)).append("\n");
    sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    sb.append("    docuSignLandingUrl: ").append(toIndentedString(docuSignLandingUrl)).append("\n");
    sb.append("    dssValues: ").append(toIndentedString(dssValues)).append("\n");
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
    sb.append("    useDisplayAppliance: ").append(toIndentedString(useDisplayAppliance)).append("\n");
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

