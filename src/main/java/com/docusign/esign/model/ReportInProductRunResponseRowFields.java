package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductRunResponseRowFields
 */

public class ReportInProductRunResponseRowFields {
  @JsonProperty("accessCodeRequired")
  private String accessCodeRequired = null;

  @JsonProperty("accessCodesAttempted")
  private String accessCodesAttempted = null;

  @JsonProperty("accessCodesFailed")
  private String accessCodesFailed = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("authenticationCategory")
  private String authenticationCategory = null;

  @JsonProperty("authenticationSuccess")
  private String authenticationSuccess = null;

  @JsonProperty("authenticationType")
  private String authenticationType = null;

  @JsonProperty("averageTimeToCompleteSeconds")
  private String averageTimeToCompleteSeconds = null;

  @JsonProperty("avgCompleteSeconds")
  private String avgCompleteSeconds = null;

  @JsonProperty("captureMethod")
  private String captureMethod = null;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("completedTs")
  private String completedTs = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("customField")
  private String customField = null;

  @JsonProperty("declinedDate")
  private String declinedDate = null;

  @JsonProperty("declinedReason")
  private String declinedReason = null;

  @JsonProperty("deliveredDate")
  private String deliveredDate = null;

  @JsonProperty("envelopeCount")
  private String envelopeCount = null;

  @JsonProperty("envelopeCreator")
  private String envelopeCreator = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeInitialSendTs")
  private String envelopeInitialSendTs = null;

  @JsonProperty("envelopesBilled")
  private String envelopesBilled = null;

  @JsonProperty("envelopesCompleted")
  private String envelopesCompleted = null;

  @JsonProperty("envelopesCompletedCount")
  private String envelopesCompletedCount = null;

  @JsonProperty("envelopesDeclined")
  private String envelopesDeclined = null;

  @JsonProperty("envelopesSent")
  private String envelopesSent = null;

  @JsonProperty("envelopesSentCount")
  private String envelopesSentCount = null;

  @JsonProperty("envelopesVoided")
  private String envelopesVoided = null;

  @JsonProperty("envelopeVoidedReason")
  private String envelopeVoidedReason = null;

  @JsonProperty("eodDocumentDescription")
  private String eodDocumentDescription = null;

  @JsonProperty("eodDocumentName")
  private String eodDocumentName = null;

  @JsonProperty("eodDocumentProfileId")
  private String eodDocumentProfileId = null;

  @JsonProperty("eodTransactionId")
  private String eodTransactionId = null;

  @JsonProperty("eodTransactionName")
  private String eodTransactionName = null;

  @JsonProperty("eventDate")
  private String eventDate = null;

  @JsonProperty("expirationDate")
  private String expirationDate = null;

  @JsonProperty("expiredTs")
  private String expiredTs = null;

  @JsonProperty("failureReason")
  private String failureReason = null;

  @JsonProperty("failures")
  private String failures = null;

  @JsonProperty("failureVendorCode")
  private String failureVendorCode = null;

  @JsonProperty("failureVendorReason")
  private String failureVendorReason = null;

  @JsonProperty("firstSendTs")
  private String firstSendTs = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("hoursToCompleteEnd")
  private String hoursToCompleteEnd = null;

  @JsonProperty("hoursToCompleteStart")
  private String hoursToCompleteStart = null;

  @JsonProperty("idChecksAttempted")
  private String idChecksAttempted = null;

  @JsonProperty("idChecksFailed")
  private String idChecksFailed = null;

  @JsonProperty("idCountry")
  private String idCountry = null;

  @JsonProperty("idMethod")
  private String idMethod = null;

  @JsonProperty("initialSendTs")
  private String initialSendTs = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("lastActivity")
  private String lastActivity = null;

  @JsonProperty("lastActivityDate")
  private String lastActivityDate = null;

  @JsonProperty("lastSentDate")
  private String lastSentDate = null;

  @JsonProperty("metadataRemoved")
  private String metadataRemoved = null;

  @JsonProperty("notSigned")
  private String notSigned = null;

  @JsonProperty("numberOfAuthenticatedRecipients")
  private String numberOfAuthenticatedRecipients = null;

  @JsonProperty("numberOfCompletedSignatures")
  private String numberOfCompletedSignatures = null;

  @JsonProperty("numberOfDocuments")
  private String numberOfDocuments = null;

  @JsonProperty("numberOfPages")
  private String numberOfPages = null;

  @JsonProperty("numberOfRecipients")
  private String numberOfRecipients = null;

  @JsonProperty("numberOfSends")
  private String numberOfSends = null;

  @JsonProperty("numberOfSigners")
  private String numberOfSigners = null;

  @JsonProperty("numberOfTotalDocuments")
  private String numberOfTotalDocuments = null;

  @JsonProperty("numberOfTotalPages")
  private String numberOfTotalPages = null;

  @JsonProperty("numberOfTotalSigners")
  private String numberOfTotalSigners = null;

  @JsonProperty("numberOfUniqueSenders")
  private String numberOfUniqueSenders = null;

  @JsonProperty("numberTotalRecipients")
  private String numberTotalRecipients = null;

  @JsonProperty("periodEnd")
  private String periodEnd = null;

  @JsonProperty("periodStart")
  private String periodStart = null;

  @JsonProperty("phoneCallsAttempted")
  private String phoneCallsAttempted = null;

  @JsonProperty("phoneCallsFailed")
  private String phoneCallsFailed = null;

  @JsonProperty("piiRedacted")
  private String piiRedacted = null;

  @JsonProperty("purgeDate")
  private String purgeDate = null;

  @JsonProperty("reasonForDeclining")
  private String reasonForDeclining = null;

  @JsonProperty("reasonForVoiding")
  private String reasonForVoiding = null;

  @JsonProperty("reassignReason")
  private String reassignReason = null;

  @JsonProperty("received")
  private String received = null;

  @JsonProperty("recipient")
  private String recipient = null;

  @JsonProperty("recipientAction")
  private String recipientAction = null;

  @JsonProperty("recipientCompanyName")
  private String recipientCompanyName = null;

  @JsonProperty("recipientCountry")
  private String recipientCountry = null;

  @JsonProperty("recipientEmail")
  private String recipientEmail = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientName")
  private String recipientName = null;

  @JsonProperty("recipientTemplateRoleName")
  private String recipientTemplateRoleName = null;

  @JsonProperty("recipientTitle")
  private String recipientTitle = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("recipientUserId")
  private String recipientUserId = null;

  @JsonProperty("remainingSignatures")
  private String remainingSignatures = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("senderAccountId")
  private String senderAccountId = null;

  @JsonProperty("senderCompanyName")
  private String senderCompanyName = null;

  @JsonProperty("senderCountry")
  private String senderCountry = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderIPAddress")
  private String senderIPAddress = null;

  @JsonProperty("senderJobTitle")
  private String senderJobTitle = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;

  @JsonProperty("signDate")
  private String signDate = null;

  @JsonProperty("signed")
  private String signed = null;

  @JsonProperty("signedDate")
  private String signedDate = null;

  @JsonProperty("signedOnMobile")
  private String signedOnMobile = null;

  @JsonProperty("signedOnPaper")
  private String signedOnPaper = null;

  @JsonProperty("signerList")
  private String signerList = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusChangedDate")
  private String statusChangedDate = null;

  @JsonProperty("statusChangedTs")
  private String statusChangedTs = null;

  @JsonProperty("statusComment")
  private String statusComment = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("successes")
  private String successes = null;

  @JsonProperty("templatesCreated")
  private String templatesCreated = null;

  @JsonProperty("templatesCreatedCount")
  private String templatesCreatedCount = null;

  @JsonProperty("terminalStatusDate")
  private String terminalStatusDate = null;

  @JsonProperty("timeToCompleteSeconds")
  private String timeToCompleteSeconds = null;

  @JsonProperty("timeToDeliver")
  private String timeToDeliver = null;

  @JsonProperty("totalDocuments")
  private String totalDocuments = null;

  @JsonProperty("totalEnvelopes")
  private String totalEnvelopes = null;

  @JsonProperty("totalPages")
  private String totalPages = null;

  @JsonProperty("totalRecipients")
  private String totalRecipients = null;

  @JsonProperty("totalSigners")
  private String totalSigners = null;

  @JsonProperty("uniqueSenders")
  private String uniqueSenders = null;

  @JsonProperty("userAccountEmail")
  private String userAccountEmail = null;

  @JsonProperty("userAccountName")
  private String userAccountName = null;

  @JsonProperty("userAccountStatus")
  private String userAccountStatus = null;

  @JsonProperty("userCount")
  private String userCount = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("verificationStatus")
  private String verificationStatus = null;

  @JsonProperty("verificationType")
  private String verificationType = null;

  @JsonProperty("viewDate")
  private String viewDate = null;

  @JsonProperty("voidedTs")
  private String voidedTs = null;

  public ReportInProductRunResponseRowFields accessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
    return this;
  }

   /**
   * 
   * @return accessCodeRequired
  **/
  @ApiModelProperty(value = "")
  public String getAccessCodeRequired() {
    return accessCodeRequired;
  }

  public void setAccessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
  }

  public ReportInProductRunResponseRowFields accessCodesAttempted(String accessCodesAttempted) {
    this.accessCodesAttempted = accessCodesAttempted;
    return this;
  }

   /**
   * 
   * @return accessCodesAttempted
  **/
  @ApiModelProperty(value = "")
  public String getAccessCodesAttempted() {
    return accessCodesAttempted;
  }

  public void setAccessCodesAttempted(String accessCodesAttempted) {
    this.accessCodesAttempted = accessCodesAttempted;
  }

  public ReportInProductRunResponseRowFields accessCodesFailed(String accessCodesFailed) {
    this.accessCodesFailed = accessCodesFailed;
    return this;
  }

   /**
   * 
   * @return accessCodesFailed
  **/
  @ApiModelProperty(value = "")
  public String getAccessCodesFailed() {
    return accessCodesFailed;
  }

  public void setAccessCodesFailed(String accessCodesFailed) {
    this.accessCodesFailed = accessCodesFailed;
  }

  public ReportInProductRunResponseRowFields accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ReportInProductRunResponseRowFields authenticationCategory(String authenticationCategory) {
    this.authenticationCategory = authenticationCategory;
    return this;
  }

   /**
   * 
   * @return authenticationCategory
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationCategory() {
    return authenticationCategory;
  }

  public void setAuthenticationCategory(String authenticationCategory) {
    this.authenticationCategory = authenticationCategory;
  }

  public ReportInProductRunResponseRowFields authenticationSuccess(String authenticationSuccess) {
    this.authenticationSuccess = authenticationSuccess;
    return this;
  }

   /**
   * 
   * @return authenticationSuccess
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationSuccess() {
    return authenticationSuccess;
  }

  public void setAuthenticationSuccess(String authenticationSuccess) {
    this.authenticationSuccess = authenticationSuccess;
  }

  public ReportInProductRunResponseRowFields authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * 
   * @return authenticationType
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public ReportInProductRunResponseRowFields averageTimeToCompleteSeconds(String averageTimeToCompleteSeconds) {
    this.averageTimeToCompleteSeconds = averageTimeToCompleteSeconds;
    return this;
  }

   /**
   * 
   * @return averageTimeToCompleteSeconds
  **/
  @ApiModelProperty(value = "")
  public String getAverageTimeToCompleteSeconds() {
    return averageTimeToCompleteSeconds;
  }

  public void setAverageTimeToCompleteSeconds(String averageTimeToCompleteSeconds) {
    this.averageTimeToCompleteSeconds = averageTimeToCompleteSeconds;
  }

  public ReportInProductRunResponseRowFields avgCompleteSeconds(String avgCompleteSeconds) {
    this.avgCompleteSeconds = avgCompleteSeconds;
    return this;
  }

   /**
   * 
   * @return avgCompleteSeconds
  **/
  @ApiModelProperty(value = "")
  public String getAvgCompleteSeconds() {
    return avgCompleteSeconds;
  }

  public void setAvgCompleteSeconds(String avgCompleteSeconds) {
    this.avgCompleteSeconds = avgCompleteSeconds;
  }

  public ReportInProductRunResponseRowFields captureMethod(String captureMethod) {
    this.captureMethod = captureMethod;
    return this;
  }

   /**
   * 
   * @return captureMethod
  **/
  @ApiModelProperty(value = "")
  public String getCaptureMethod() {
    return captureMethod;
  }

  public void setCaptureMethod(String captureMethod) {
    this.captureMethod = captureMethod;
  }

  public ReportInProductRunResponseRowFields completed(String completed) {
    this.completed = completed;
    return this;
  }

   /**
   * 
   * @return completed
  **/
  @ApiModelProperty(value = "")
  public String getCompleted() {
    return completed;
  }

  public void setCompleted(String completed) {
    this.completed = completed;
  }

  public ReportInProductRunResponseRowFields completedTs(String completedTs) {
    this.completedTs = completedTs;
    return this;
  }

   /**
   * 
   * @return completedTs
  **/
  @ApiModelProperty(value = "")
  public String getCompletedTs() {
    return completedTs;
  }

  public void setCompletedTs(String completedTs) {
    this.completedTs = completedTs;
  }

  public ReportInProductRunResponseRowFields createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public ReportInProductRunResponseRowFields customField(String customField) {
    this.customField = customField;
    return this;
  }

   /**
   * 
   * @return customField
  **/
  @ApiModelProperty(value = "")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public ReportInProductRunResponseRowFields declinedDate(String declinedDate) {
    this.declinedDate = declinedDate;
    return this;
  }

   /**
   * 
   * @return declinedDate
  **/
  @ApiModelProperty(value = "")
  public String getDeclinedDate() {
    return declinedDate;
  }

  public void setDeclinedDate(String declinedDate) {
    this.declinedDate = declinedDate;
  }

  public ReportInProductRunResponseRowFields declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

   /**
   * The reason the recipient declined the document.
   * @return declinedReason
  **/
  @ApiModelProperty(value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  public ReportInProductRunResponseRowFields deliveredDate(String deliveredDate) {
    this.deliveredDate = deliveredDate;
    return this;
  }

   /**
   * 
   * @return deliveredDate
  **/
  @ApiModelProperty(value = "")
  public String getDeliveredDate() {
    return deliveredDate;
  }

  public void setDeliveredDate(String deliveredDate) {
    this.deliveredDate = deliveredDate;
  }

  public ReportInProductRunResponseRowFields envelopeCount(String envelopeCount) {
    this.envelopeCount = envelopeCount;
    return this;
  }

   /**
   * 
   * @return envelopeCount
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeCount() {
    return envelopeCount;
  }

  public void setEnvelopeCount(String envelopeCount) {
    this.envelopeCount = envelopeCount;
  }

  public ReportInProductRunResponseRowFields envelopeCreator(String envelopeCreator) {
    this.envelopeCreator = envelopeCreator;
    return this;
  }

   /**
   * 
   * @return envelopeCreator
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeCreator() {
    return envelopeCreator;
  }

  public void setEnvelopeCreator(String envelopeCreator) {
    this.envelopeCreator = envelopeCreator;
  }

  public ReportInProductRunResponseRowFields envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public ReportInProductRunResponseRowFields envelopeInitialSendTs(String envelopeInitialSendTs) {
    this.envelopeInitialSendTs = envelopeInitialSendTs;
    return this;
  }

   /**
   * 
   * @return envelopeInitialSendTs
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeInitialSendTs() {
    return envelopeInitialSendTs;
  }

  public void setEnvelopeInitialSendTs(String envelopeInitialSendTs) {
    this.envelopeInitialSendTs = envelopeInitialSendTs;
  }

  public ReportInProductRunResponseRowFields envelopesBilled(String envelopesBilled) {
    this.envelopesBilled = envelopesBilled;
    return this;
  }

   /**
   * 
   * @return envelopesBilled
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesBilled() {
    return envelopesBilled;
  }

  public void setEnvelopesBilled(String envelopesBilled) {
    this.envelopesBilled = envelopesBilled;
  }

  public ReportInProductRunResponseRowFields envelopesCompleted(String envelopesCompleted) {
    this.envelopesCompleted = envelopesCompleted;
    return this;
  }

   /**
   * 
   * @return envelopesCompleted
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesCompleted() {
    return envelopesCompleted;
  }

  public void setEnvelopesCompleted(String envelopesCompleted) {
    this.envelopesCompleted = envelopesCompleted;
  }

  public ReportInProductRunResponseRowFields envelopesCompletedCount(String envelopesCompletedCount) {
    this.envelopesCompletedCount = envelopesCompletedCount;
    return this;
  }

   /**
   * 
   * @return envelopesCompletedCount
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesCompletedCount() {
    return envelopesCompletedCount;
  }

  public void setEnvelopesCompletedCount(String envelopesCompletedCount) {
    this.envelopesCompletedCount = envelopesCompletedCount;
  }

  public ReportInProductRunResponseRowFields envelopesDeclined(String envelopesDeclined) {
    this.envelopesDeclined = envelopesDeclined;
    return this;
  }

   /**
   * 
   * @return envelopesDeclined
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesDeclined() {
    return envelopesDeclined;
  }

  public void setEnvelopesDeclined(String envelopesDeclined) {
    this.envelopesDeclined = envelopesDeclined;
  }

  public ReportInProductRunResponseRowFields envelopesSent(String envelopesSent) {
    this.envelopesSent = envelopesSent;
    return this;
  }

   /**
   * 
   * @return envelopesSent
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesSent() {
    return envelopesSent;
  }

  public void setEnvelopesSent(String envelopesSent) {
    this.envelopesSent = envelopesSent;
  }

  public ReportInProductRunResponseRowFields envelopesSentCount(String envelopesSentCount) {
    this.envelopesSentCount = envelopesSentCount;
    return this;
  }

   /**
   * 
   * @return envelopesSentCount
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesSentCount() {
    return envelopesSentCount;
  }

  public void setEnvelopesSentCount(String envelopesSentCount) {
    this.envelopesSentCount = envelopesSentCount;
  }

  public ReportInProductRunResponseRowFields envelopesVoided(String envelopesVoided) {
    this.envelopesVoided = envelopesVoided;
    return this;
  }

   /**
   * 
   * @return envelopesVoided
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesVoided() {
    return envelopesVoided;
  }

  public void setEnvelopesVoided(String envelopesVoided) {
    this.envelopesVoided = envelopesVoided;
  }

  public ReportInProductRunResponseRowFields envelopeVoidedReason(String envelopeVoidedReason) {
    this.envelopeVoidedReason = envelopeVoidedReason;
    return this;
  }

   /**
   * 
   * @return envelopeVoidedReason
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeVoidedReason() {
    return envelopeVoidedReason;
  }

  public void setEnvelopeVoidedReason(String envelopeVoidedReason) {
    this.envelopeVoidedReason = envelopeVoidedReason;
  }

  public ReportInProductRunResponseRowFields eodDocumentDescription(String eodDocumentDescription) {
    this.eodDocumentDescription = eodDocumentDescription;
    return this;
  }

   /**
   * 
   * @return eodDocumentDescription
  **/
  @ApiModelProperty(value = "")
  public String getEodDocumentDescription() {
    return eodDocumentDescription;
  }

  public void setEodDocumentDescription(String eodDocumentDescription) {
    this.eodDocumentDescription = eodDocumentDescription;
  }

  public ReportInProductRunResponseRowFields eodDocumentName(String eodDocumentName) {
    this.eodDocumentName = eodDocumentName;
    return this;
  }

   /**
   * 
   * @return eodDocumentName
  **/
  @ApiModelProperty(value = "")
  public String getEodDocumentName() {
    return eodDocumentName;
  }

  public void setEodDocumentName(String eodDocumentName) {
    this.eodDocumentName = eodDocumentName;
  }

  public ReportInProductRunResponseRowFields eodDocumentProfileId(String eodDocumentProfileId) {
    this.eodDocumentProfileId = eodDocumentProfileId;
    return this;
  }

   /**
   * 
   * @return eodDocumentProfileId
  **/
  @ApiModelProperty(value = "")
  public String getEodDocumentProfileId() {
    return eodDocumentProfileId;
  }

  public void setEodDocumentProfileId(String eodDocumentProfileId) {
    this.eodDocumentProfileId = eodDocumentProfileId;
  }

  public ReportInProductRunResponseRowFields eodTransactionId(String eodTransactionId) {
    this.eodTransactionId = eodTransactionId;
    return this;
  }

   /**
   * 
   * @return eodTransactionId
  **/
  @ApiModelProperty(value = "")
  public String getEodTransactionId() {
    return eodTransactionId;
  }

  public void setEodTransactionId(String eodTransactionId) {
    this.eodTransactionId = eodTransactionId;
  }

  public ReportInProductRunResponseRowFields eodTransactionName(String eodTransactionName) {
    this.eodTransactionName = eodTransactionName;
    return this;
  }

   /**
   * 
   * @return eodTransactionName
  **/
  @ApiModelProperty(value = "")
  public String getEodTransactionName() {
    return eodTransactionName;
  }

  public void setEodTransactionName(String eodTransactionName) {
    this.eodTransactionName = eodTransactionName;
  }

  public ReportInProductRunResponseRowFields eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * 
   * @return eventDate
  **/
  @ApiModelProperty(value = "")
  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public ReportInProductRunResponseRowFields expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ReportInProductRunResponseRowFields expiredTs(String expiredTs) {
    this.expiredTs = expiredTs;
    return this;
  }

   /**
   * 
   * @return expiredTs
  **/
  @ApiModelProperty(value = "")
  public String getExpiredTs() {
    return expiredTs;
  }

  public void setExpiredTs(String expiredTs) {
    this.expiredTs = expiredTs;
  }

  public ReportInProductRunResponseRowFields failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * 
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public ReportInProductRunResponseRowFields failures(String failures) {
    this.failures = failures;
    return this;
  }

   /**
   * 
   * @return failures
  **/
  @ApiModelProperty(value = "")
  public String getFailures() {
    return failures;
  }

  public void setFailures(String failures) {
    this.failures = failures;
  }

  public ReportInProductRunResponseRowFields failureVendorCode(String failureVendorCode) {
    this.failureVendorCode = failureVendorCode;
    return this;
  }

   /**
   * 
   * @return failureVendorCode
  **/
  @ApiModelProperty(value = "")
  public String getFailureVendorCode() {
    return failureVendorCode;
  }

  public void setFailureVendorCode(String failureVendorCode) {
    this.failureVendorCode = failureVendorCode;
  }

  public ReportInProductRunResponseRowFields failureVendorReason(String failureVendorReason) {
    this.failureVendorReason = failureVendorReason;
    return this;
  }

   /**
   * 
   * @return failureVendorReason
  **/
  @ApiModelProperty(value = "")
  public String getFailureVendorReason() {
    return failureVendorReason;
  }

  public void setFailureVendorReason(String failureVendorReason) {
    this.failureVendorReason = failureVendorReason;
  }

  public ReportInProductRunResponseRowFields firstSendTs(String firstSendTs) {
    this.firstSendTs = firstSendTs;
    return this;
  }

   /**
   * 
   * @return firstSendTs
  **/
  @ApiModelProperty(value = "")
  public String getFirstSendTs() {
    return firstSendTs;
  }

  public void setFirstSendTs(String firstSendTs) {
    this.firstSendTs = firstSendTs;
  }

  public ReportInProductRunResponseRowFields groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * 
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ReportInProductRunResponseRowFields groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group.
   * @return groupName
  **/
  @ApiModelProperty(value = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public ReportInProductRunResponseRowFields hoursToCompleteEnd(String hoursToCompleteEnd) {
    this.hoursToCompleteEnd = hoursToCompleteEnd;
    return this;
  }

   /**
   * 
   * @return hoursToCompleteEnd
  **/
  @ApiModelProperty(value = "")
  public String getHoursToCompleteEnd() {
    return hoursToCompleteEnd;
  }

  public void setHoursToCompleteEnd(String hoursToCompleteEnd) {
    this.hoursToCompleteEnd = hoursToCompleteEnd;
  }

  public ReportInProductRunResponseRowFields hoursToCompleteStart(String hoursToCompleteStart) {
    this.hoursToCompleteStart = hoursToCompleteStart;
    return this;
  }

   /**
   * 
   * @return hoursToCompleteStart
  **/
  @ApiModelProperty(value = "")
  public String getHoursToCompleteStart() {
    return hoursToCompleteStart;
  }

  public void setHoursToCompleteStart(String hoursToCompleteStart) {
    this.hoursToCompleteStart = hoursToCompleteStart;
  }

  public ReportInProductRunResponseRowFields idChecksAttempted(String idChecksAttempted) {
    this.idChecksAttempted = idChecksAttempted;
    return this;
  }

   /**
   * 
   * @return idChecksAttempted
  **/
  @ApiModelProperty(value = "")
  public String getIdChecksAttempted() {
    return idChecksAttempted;
  }

  public void setIdChecksAttempted(String idChecksAttempted) {
    this.idChecksAttempted = idChecksAttempted;
  }

  public ReportInProductRunResponseRowFields idChecksFailed(String idChecksFailed) {
    this.idChecksFailed = idChecksFailed;
    return this;
  }

   /**
   * 
   * @return idChecksFailed
  **/
  @ApiModelProperty(value = "")
  public String getIdChecksFailed() {
    return idChecksFailed;
  }

  public void setIdChecksFailed(String idChecksFailed) {
    this.idChecksFailed = idChecksFailed;
  }

  public ReportInProductRunResponseRowFields idCountry(String idCountry) {
    this.idCountry = idCountry;
    return this;
  }

   /**
   * 
   * @return idCountry
  **/
  @ApiModelProperty(value = "")
  public String getIdCountry() {
    return idCountry;
  }

  public void setIdCountry(String idCountry) {
    this.idCountry = idCountry;
  }

  public ReportInProductRunResponseRowFields idMethod(String idMethod) {
    this.idMethod = idMethod;
    return this;
  }

   /**
   * 
   * @return idMethod
  **/
  @ApiModelProperty(value = "")
  public String getIdMethod() {
    return idMethod;
  }

  public void setIdMethod(String idMethod) {
    this.idMethod = idMethod;
  }

  public ReportInProductRunResponseRowFields initialSendTs(String initialSendTs) {
    this.initialSendTs = initialSendTs;
    return this;
  }

   /**
   * 
   * @return initialSendTs
  **/
  @ApiModelProperty(value = "")
  public String getInitialSendTs() {
    return initialSendTs;
  }

  public void setInitialSendTs(String initialSendTs) {
    this.initialSendTs = initialSendTs;
  }

  public ReportInProductRunResponseRowFields ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public ReportInProductRunResponseRowFields lastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * 
   * @return lastActivity
  **/
  @ApiModelProperty(value = "")
  public String getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
  }

  public ReportInProductRunResponseRowFields lastActivityDate(String lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * 
   * @return lastActivityDate
  **/
  @ApiModelProperty(value = "")
  public String getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(String lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public ReportInProductRunResponseRowFields lastSentDate(String lastSentDate) {
    this.lastSentDate = lastSentDate;
    return this;
  }

   /**
   * 
   * @return lastSentDate
  **/
  @ApiModelProperty(value = "")
  public String getLastSentDate() {
    return lastSentDate;
  }

  public void setLastSentDate(String lastSentDate) {
    this.lastSentDate = lastSentDate;
  }

  public ReportInProductRunResponseRowFields metadataRemoved(String metadataRemoved) {
    this.metadataRemoved = metadataRemoved;
    return this;
  }

   /**
   * 
   * @return metadataRemoved
  **/
  @ApiModelProperty(value = "")
  public String getMetadataRemoved() {
    return metadataRemoved;
  }

  public void setMetadataRemoved(String metadataRemoved) {
    this.metadataRemoved = metadataRemoved;
  }

  public ReportInProductRunResponseRowFields notSigned(String notSigned) {
    this.notSigned = notSigned;
    return this;
  }

   /**
   * 
   * @return notSigned
  **/
  @ApiModelProperty(value = "")
  public String getNotSigned() {
    return notSigned;
  }

  public void setNotSigned(String notSigned) {
    this.notSigned = notSigned;
  }

  public ReportInProductRunResponseRowFields numberOfAuthenticatedRecipients(String numberOfAuthenticatedRecipients) {
    this.numberOfAuthenticatedRecipients = numberOfAuthenticatedRecipients;
    return this;
  }

   /**
   * 
   * @return numberOfAuthenticatedRecipients
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfAuthenticatedRecipients() {
    return numberOfAuthenticatedRecipients;
  }

  public void setNumberOfAuthenticatedRecipients(String numberOfAuthenticatedRecipients) {
    this.numberOfAuthenticatedRecipients = numberOfAuthenticatedRecipients;
  }

  public ReportInProductRunResponseRowFields numberOfCompletedSignatures(String numberOfCompletedSignatures) {
    this.numberOfCompletedSignatures = numberOfCompletedSignatures;
    return this;
  }

   /**
   * 
   * @return numberOfCompletedSignatures
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfCompletedSignatures() {
    return numberOfCompletedSignatures;
  }

  public void setNumberOfCompletedSignatures(String numberOfCompletedSignatures) {
    this.numberOfCompletedSignatures = numberOfCompletedSignatures;
  }

  public ReportInProductRunResponseRowFields numberOfDocuments(String numberOfDocuments) {
    this.numberOfDocuments = numberOfDocuments;
    return this;
  }

   /**
   * 
   * @return numberOfDocuments
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfDocuments() {
    return numberOfDocuments;
  }

  public void setNumberOfDocuments(String numberOfDocuments) {
    this.numberOfDocuments = numberOfDocuments;
  }

  public ReportInProductRunResponseRowFields numberOfPages(String numberOfPages) {
    this.numberOfPages = numberOfPages;
    return this;
  }

   /**
   * 
   * @return numberOfPages
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(String numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public ReportInProductRunResponseRowFields numberOfRecipients(String numberOfRecipients) {
    this.numberOfRecipients = numberOfRecipients;
    return this;
  }

   /**
   * 
   * @return numberOfRecipients
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfRecipients() {
    return numberOfRecipients;
  }

  public void setNumberOfRecipients(String numberOfRecipients) {
    this.numberOfRecipients = numberOfRecipients;
  }

  public ReportInProductRunResponseRowFields numberOfSends(String numberOfSends) {
    this.numberOfSends = numberOfSends;
    return this;
  }

   /**
   * 
   * @return numberOfSends
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfSends() {
    return numberOfSends;
  }

  public void setNumberOfSends(String numberOfSends) {
    this.numberOfSends = numberOfSends;
  }

  public ReportInProductRunResponseRowFields numberOfSigners(String numberOfSigners) {
    this.numberOfSigners = numberOfSigners;
    return this;
  }

   /**
   * 
   * @return numberOfSigners
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfSigners() {
    return numberOfSigners;
  }

  public void setNumberOfSigners(String numberOfSigners) {
    this.numberOfSigners = numberOfSigners;
  }

  public ReportInProductRunResponseRowFields numberOfTotalDocuments(String numberOfTotalDocuments) {
    this.numberOfTotalDocuments = numberOfTotalDocuments;
    return this;
  }

   /**
   * 
   * @return numberOfTotalDocuments
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfTotalDocuments() {
    return numberOfTotalDocuments;
  }

  public void setNumberOfTotalDocuments(String numberOfTotalDocuments) {
    this.numberOfTotalDocuments = numberOfTotalDocuments;
  }

  public ReportInProductRunResponseRowFields numberOfTotalPages(String numberOfTotalPages) {
    this.numberOfTotalPages = numberOfTotalPages;
    return this;
  }

   /**
   * 
   * @return numberOfTotalPages
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfTotalPages() {
    return numberOfTotalPages;
  }

  public void setNumberOfTotalPages(String numberOfTotalPages) {
    this.numberOfTotalPages = numberOfTotalPages;
  }

  public ReportInProductRunResponseRowFields numberOfTotalSigners(String numberOfTotalSigners) {
    this.numberOfTotalSigners = numberOfTotalSigners;
    return this;
  }

   /**
   * 
   * @return numberOfTotalSigners
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfTotalSigners() {
    return numberOfTotalSigners;
  }

  public void setNumberOfTotalSigners(String numberOfTotalSigners) {
    this.numberOfTotalSigners = numberOfTotalSigners;
  }

  public ReportInProductRunResponseRowFields numberOfUniqueSenders(String numberOfUniqueSenders) {
    this.numberOfUniqueSenders = numberOfUniqueSenders;
    return this;
  }

   /**
   * 
   * @return numberOfUniqueSenders
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfUniqueSenders() {
    return numberOfUniqueSenders;
  }

  public void setNumberOfUniqueSenders(String numberOfUniqueSenders) {
    this.numberOfUniqueSenders = numberOfUniqueSenders;
  }

  public ReportInProductRunResponseRowFields numberTotalRecipients(String numberTotalRecipients) {
    this.numberTotalRecipients = numberTotalRecipients;
    return this;
  }

   /**
   * 
   * @return numberTotalRecipients
  **/
  @ApiModelProperty(value = "")
  public String getNumberTotalRecipients() {
    return numberTotalRecipients;
  }

  public void setNumberTotalRecipients(String numberTotalRecipients) {
    this.numberTotalRecipients = numberTotalRecipients;
  }

  public ReportInProductRunResponseRowFields periodEnd(String periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * 
   * @return periodEnd
  **/
  @ApiModelProperty(value = "")
  public String getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(String periodEnd) {
    this.periodEnd = periodEnd;
  }

  public ReportInProductRunResponseRowFields periodStart(String periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * 
   * @return periodStart
  **/
  @ApiModelProperty(value = "")
  public String getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(String periodStart) {
    this.periodStart = periodStart;
  }

  public ReportInProductRunResponseRowFields phoneCallsAttempted(String phoneCallsAttempted) {
    this.phoneCallsAttempted = phoneCallsAttempted;
    return this;
  }

   /**
   * 
   * @return phoneCallsAttempted
  **/
  @ApiModelProperty(value = "")
  public String getPhoneCallsAttempted() {
    return phoneCallsAttempted;
  }

  public void setPhoneCallsAttempted(String phoneCallsAttempted) {
    this.phoneCallsAttempted = phoneCallsAttempted;
  }

  public ReportInProductRunResponseRowFields phoneCallsFailed(String phoneCallsFailed) {
    this.phoneCallsFailed = phoneCallsFailed;
    return this;
  }

   /**
   * 
   * @return phoneCallsFailed
  **/
  @ApiModelProperty(value = "")
  public String getPhoneCallsFailed() {
    return phoneCallsFailed;
  }

  public void setPhoneCallsFailed(String phoneCallsFailed) {
    this.phoneCallsFailed = phoneCallsFailed;
  }

  public ReportInProductRunResponseRowFields piiRedacted(String piiRedacted) {
    this.piiRedacted = piiRedacted;
    return this;
  }

   /**
   * 
   * @return piiRedacted
  **/
  @ApiModelProperty(value = "")
  public String getPiiRedacted() {
    return piiRedacted;
  }

  public void setPiiRedacted(String piiRedacted) {
    this.piiRedacted = piiRedacted;
  }

  public ReportInProductRunResponseRowFields purgeDate(String purgeDate) {
    this.purgeDate = purgeDate;
    return this;
  }

   /**
   * 
   * @return purgeDate
  **/
  @ApiModelProperty(value = "")
  public String getPurgeDate() {
    return purgeDate;
  }

  public void setPurgeDate(String purgeDate) {
    this.purgeDate = purgeDate;
  }

  public ReportInProductRunResponseRowFields reasonForDeclining(String reasonForDeclining) {
    this.reasonForDeclining = reasonForDeclining;
    return this;
  }

   /**
   * 
   * @return reasonForDeclining
  **/
  @ApiModelProperty(value = "")
  public String getReasonForDeclining() {
    return reasonForDeclining;
  }

  public void setReasonForDeclining(String reasonForDeclining) {
    this.reasonForDeclining = reasonForDeclining;
  }

  public ReportInProductRunResponseRowFields reasonForVoiding(String reasonForVoiding) {
    this.reasonForVoiding = reasonForVoiding;
    return this;
  }

   /**
   * 
   * @return reasonForVoiding
  **/
  @ApiModelProperty(value = "")
  public String getReasonForVoiding() {
    return reasonForVoiding;
  }

  public void setReasonForVoiding(String reasonForVoiding) {
    this.reasonForVoiding = reasonForVoiding;
  }

  public ReportInProductRunResponseRowFields reassignReason(String reassignReason) {
    this.reassignReason = reassignReason;
    return this;
  }

   /**
   * 
   * @return reassignReason
  **/
  @ApiModelProperty(value = "")
  public String getReassignReason() {
    return reassignReason;
  }

  public void setReassignReason(String reassignReason) {
    this.reassignReason = reassignReason;
  }

  public ReportInProductRunResponseRowFields received(String received) {
    this.received = received;
    return this;
  }

   /**
   * 
   * @return received
  **/
  @ApiModelProperty(value = "")
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public ReportInProductRunResponseRowFields recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * 
   * @return recipient
  **/
  @ApiModelProperty(value = "")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public ReportInProductRunResponseRowFields recipientAction(String recipientAction) {
    this.recipientAction = recipientAction;
    return this;
  }

   /**
   * 
   * @return recipientAction
  **/
  @ApiModelProperty(value = "")
  public String getRecipientAction() {
    return recipientAction;
  }

  public void setRecipientAction(String recipientAction) {
    this.recipientAction = recipientAction;
  }

  public ReportInProductRunResponseRowFields recipientCompanyName(String recipientCompanyName) {
    this.recipientCompanyName = recipientCompanyName;
    return this;
  }

   /**
   * 
   * @return recipientCompanyName
  **/
  @ApiModelProperty(value = "")
  public String getRecipientCompanyName() {
    return recipientCompanyName;
  }

  public void setRecipientCompanyName(String recipientCompanyName) {
    this.recipientCompanyName = recipientCompanyName;
  }

  public ReportInProductRunResponseRowFields recipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
    return this;
  }

   /**
   * 
   * @return recipientCountry
  **/
  @ApiModelProperty(value = "")
  public String getRecipientCountry() {
    return recipientCountry;
  }

  public void setRecipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
  }

  public ReportInProductRunResponseRowFields recipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
    return this;
  }

   /**
   * 
   * @return recipientEmail
  **/
  @ApiModelProperty(value = "")
  public String getRecipientEmail() {
    return recipientEmail;
  }

  public void setRecipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
  }

  public ReportInProductRunResponseRowFields recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public ReportInProductRunResponseRowFields recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

   /**
   * 
   * @return recipientName
  **/
  @ApiModelProperty(value = "")
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  public ReportInProductRunResponseRowFields recipientTemplateRoleName(String recipientTemplateRoleName) {
    this.recipientTemplateRoleName = recipientTemplateRoleName;
    return this;
  }

   /**
   * 
   * @return recipientTemplateRoleName
  **/
  @ApiModelProperty(value = "")
  public String getRecipientTemplateRoleName() {
    return recipientTemplateRoleName;
  }

  public void setRecipientTemplateRoleName(String recipientTemplateRoleName) {
    this.recipientTemplateRoleName = recipientTemplateRoleName;
  }

  public ReportInProductRunResponseRowFields recipientTitle(String recipientTitle) {
    this.recipientTitle = recipientTitle;
    return this;
  }

   /**
   * 
   * @return recipientTitle
  **/
  @ApiModelProperty(value = "")
  public String getRecipientTitle() {
    return recipientTitle;
  }

  public void setRecipientTitle(String recipientTitle) {
    this.recipientTitle = recipientTitle;
  }

  public ReportInProductRunResponseRowFields recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * 
   * @return recipientType
  **/
  @ApiModelProperty(value = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public ReportInProductRunResponseRowFields recipientUserId(String recipientUserId) {
    this.recipientUserId = recipientUserId;
    return this;
  }

   /**
   * 
   * @return recipientUserId
  **/
  @ApiModelProperty(value = "")
  public String getRecipientUserId() {
    return recipientUserId;
  }

  public void setRecipientUserId(String recipientUserId) {
    this.recipientUserId = recipientUserId;
  }

  public ReportInProductRunResponseRowFields remainingSignatures(String remainingSignatures) {
    this.remainingSignatures = remainingSignatures;
    return this;
  }

   /**
   * 
   * @return remainingSignatures
  **/
  @ApiModelProperty(value = "")
  public String getRemainingSignatures() {
    return remainingSignatures;
  }

  public void setRemainingSignatures(String remainingSignatures) {
    this.remainingSignatures = remainingSignatures;
  }

  public ReportInProductRunResponseRowFields routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

   /**
   * Specifies the routing order of the recipient in the envelope. 
   * @return routingOrder
  **/
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  public ReportInProductRunResponseRowFields senderAccountId(String senderAccountId) {
    this.senderAccountId = senderAccountId;
    return this;
  }

   /**
   * 
   * @return senderAccountId
  **/
  @ApiModelProperty(value = "")
  public String getSenderAccountId() {
    return senderAccountId;
  }

  public void setSenderAccountId(String senderAccountId) {
    this.senderAccountId = senderAccountId;
  }

  public ReportInProductRunResponseRowFields senderCompanyName(String senderCompanyName) {
    this.senderCompanyName = senderCompanyName;
    return this;
  }

   /**
   * 
   * @return senderCompanyName
  **/
  @ApiModelProperty(value = "")
  public String getSenderCompanyName() {
    return senderCompanyName;
  }

  public void setSenderCompanyName(String senderCompanyName) {
    this.senderCompanyName = senderCompanyName;
  }

  public ReportInProductRunResponseRowFields senderCountry(String senderCountry) {
    this.senderCountry = senderCountry;
    return this;
  }

   /**
   * 
   * @return senderCountry
  **/
  @ApiModelProperty(value = "")
  public String getSenderCountry() {
    return senderCountry;
  }

  public void setSenderCountry(String senderCountry) {
    this.senderCountry = senderCountry;
  }

  public ReportInProductRunResponseRowFields senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * 
   * @return senderEmail
  **/
  @ApiModelProperty(value = "")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public ReportInProductRunResponseRowFields senderIPAddress(String senderIPAddress) {
    this.senderIPAddress = senderIPAddress;
    return this;
  }

   /**
   * 
   * @return senderIPAddress
  **/
  @ApiModelProperty(value = "")
  public String getSenderIPAddress() {
    return senderIPAddress;
  }

  public void setSenderIPAddress(String senderIPAddress) {
    this.senderIPAddress = senderIPAddress;
  }

  public ReportInProductRunResponseRowFields senderJobTitle(String senderJobTitle) {
    this.senderJobTitle = senderJobTitle;
    return this;
  }

   /**
   * 
   * @return senderJobTitle
  **/
  @ApiModelProperty(value = "")
  public String getSenderJobTitle() {
    return senderJobTitle;
  }

  public void setSenderJobTitle(String senderJobTitle) {
    this.senderJobTitle = senderJobTitle;
  }

  public ReportInProductRunResponseRowFields senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * 
   * @return senderName
  **/
  @ApiModelProperty(value = "")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public ReportInProductRunResponseRowFields senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

   /**
   * 
   * @return senderUserId
  **/
  @ApiModelProperty(value = "")
  public String getSenderUserId() {
    return senderUserId;
  }

  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }

  public ReportInProductRunResponseRowFields signDate(String signDate) {
    this.signDate = signDate;
    return this;
  }

   /**
   * 
   * @return signDate
  **/
  @ApiModelProperty(value = "")
  public String getSignDate() {
    return signDate;
  }

  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }

  public ReportInProductRunResponseRowFields signed(String signed) {
    this.signed = signed;
    return this;
  }

   /**
   * 
   * @return signed
  **/
  @ApiModelProperty(value = "")
  public String getSigned() {
    return signed;
  }

  public void setSigned(String signed) {
    this.signed = signed;
  }

  public ReportInProductRunResponseRowFields signedDate(String signedDate) {
    this.signedDate = signedDate;
    return this;
  }

   /**
   * 
   * @return signedDate
  **/
  @ApiModelProperty(value = "")
  public String getSignedDate() {
    return signedDate;
  }

  public void setSignedDate(String signedDate) {
    this.signedDate = signedDate;
  }

  public ReportInProductRunResponseRowFields signedOnMobile(String signedOnMobile) {
    this.signedOnMobile = signedOnMobile;
    return this;
  }

   /**
   * 
   * @return signedOnMobile
  **/
  @ApiModelProperty(value = "")
  public String getSignedOnMobile() {
    return signedOnMobile;
  }

  public void setSignedOnMobile(String signedOnMobile) {
    this.signedOnMobile = signedOnMobile;
  }

  public ReportInProductRunResponseRowFields signedOnPaper(String signedOnPaper) {
    this.signedOnPaper = signedOnPaper;
    return this;
  }

   /**
   * 
   * @return signedOnPaper
  **/
  @ApiModelProperty(value = "")
  public String getSignedOnPaper() {
    return signedOnPaper;
  }

  public void setSignedOnPaper(String signedOnPaper) {
    this.signedOnPaper = signedOnPaper;
  }

  public ReportInProductRunResponseRowFields signerList(String signerList) {
    this.signerList = signerList;
    return this;
  }

   /**
   * 
   * @return signerList
  **/
  @ApiModelProperty(value = "")
  public String getSignerList() {
    return signerList;
  }

  public void setSignerList(String signerList) {
    this.signerList = signerList;
  }

  public ReportInProductRunResponseRowFields status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReportInProductRunResponseRowFields statusChangedDate(String statusChangedDate) {
    this.statusChangedDate = statusChangedDate;
    return this;
  }

   /**
   * 
   * @return statusChangedDate
  **/
  @ApiModelProperty(value = "")
  public String getStatusChangedDate() {
    return statusChangedDate;
  }

  public void setStatusChangedDate(String statusChangedDate) {
    this.statusChangedDate = statusChangedDate;
  }

  public ReportInProductRunResponseRowFields statusChangedTs(String statusChangedTs) {
    this.statusChangedTs = statusChangedTs;
    return this;
  }

   /**
   * 
   * @return statusChangedTs
  **/
  @ApiModelProperty(value = "")
  public String getStatusChangedTs() {
    return statusChangedTs;
  }

  public void setStatusChangedTs(String statusChangedTs) {
    this.statusChangedTs = statusChangedTs;
  }

  public ReportInProductRunResponseRowFields statusComment(String statusComment) {
    this.statusComment = statusComment;
    return this;
  }

   /**
   * 
   * @return statusComment
  **/
  @ApiModelProperty(value = "")
  public String getStatusComment() {
    return statusComment;
  }

  public void setStatusComment(String statusComment) {
    this.statusComment = statusComment;
  }

  public ReportInProductRunResponseRowFields subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * 
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ReportInProductRunResponseRowFields successes(String successes) {
    this.successes = successes;
    return this;
  }

   /**
   * 
   * @return successes
  **/
  @ApiModelProperty(value = "")
  public String getSuccesses() {
    return successes;
  }

  public void setSuccesses(String successes) {
    this.successes = successes;
  }

  public ReportInProductRunResponseRowFields templatesCreated(String templatesCreated) {
    this.templatesCreated = templatesCreated;
    return this;
  }

   /**
   * 
   * @return templatesCreated
  **/
  @ApiModelProperty(value = "")
  public String getTemplatesCreated() {
    return templatesCreated;
  }

  public void setTemplatesCreated(String templatesCreated) {
    this.templatesCreated = templatesCreated;
  }

  public ReportInProductRunResponseRowFields templatesCreatedCount(String templatesCreatedCount) {
    this.templatesCreatedCount = templatesCreatedCount;
    return this;
  }

   /**
   * 
   * @return templatesCreatedCount
  **/
  @ApiModelProperty(value = "")
  public String getTemplatesCreatedCount() {
    return templatesCreatedCount;
  }

  public void setTemplatesCreatedCount(String templatesCreatedCount) {
    this.templatesCreatedCount = templatesCreatedCount;
  }

  public ReportInProductRunResponseRowFields terminalStatusDate(String terminalStatusDate) {
    this.terminalStatusDate = terminalStatusDate;
    return this;
  }

   /**
   * 
   * @return terminalStatusDate
  **/
  @ApiModelProperty(value = "")
  public String getTerminalStatusDate() {
    return terminalStatusDate;
  }

  public void setTerminalStatusDate(String terminalStatusDate) {
    this.terminalStatusDate = terminalStatusDate;
  }

  public ReportInProductRunResponseRowFields timeToCompleteSeconds(String timeToCompleteSeconds) {
    this.timeToCompleteSeconds = timeToCompleteSeconds;
    return this;
  }

   /**
   * 
   * @return timeToCompleteSeconds
  **/
  @ApiModelProperty(value = "")
  public String getTimeToCompleteSeconds() {
    return timeToCompleteSeconds;
  }

  public void setTimeToCompleteSeconds(String timeToCompleteSeconds) {
    this.timeToCompleteSeconds = timeToCompleteSeconds;
  }

  public ReportInProductRunResponseRowFields timeToDeliver(String timeToDeliver) {
    this.timeToDeliver = timeToDeliver;
    return this;
  }

   /**
   * 
   * @return timeToDeliver
  **/
  @ApiModelProperty(value = "")
  public String getTimeToDeliver() {
    return timeToDeliver;
  }

  public void setTimeToDeliver(String timeToDeliver) {
    this.timeToDeliver = timeToDeliver;
  }

  public ReportInProductRunResponseRowFields totalDocuments(String totalDocuments) {
    this.totalDocuments = totalDocuments;
    return this;
  }

   /**
   * 
   * @return totalDocuments
  **/
  @ApiModelProperty(value = "")
  public String getTotalDocuments() {
    return totalDocuments;
  }

  public void setTotalDocuments(String totalDocuments) {
    this.totalDocuments = totalDocuments;
  }

  public ReportInProductRunResponseRowFields totalEnvelopes(String totalEnvelopes) {
    this.totalEnvelopes = totalEnvelopes;
    return this;
  }

   /**
   * 
   * @return totalEnvelopes
  **/
  @ApiModelProperty(value = "")
  public String getTotalEnvelopes() {
    return totalEnvelopes;
  }

  public void setTotalEnvelopes(String totalEnvelopes) {
    this.totalEnvelopes = totalEnvelopes;
  }

  public ReportInProductRunResponseRowFields totalPages(String totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * 
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  public String getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(String totalPages) {
    this.totalPages = totalPages;
  }

  public ReportInProductRunResponseRowFields totalRecipients(String totalRecipients) {
    this.totalRecipients = totalRecipients;
    return this;
  }

   /**
   * 
   * @return totalRecipients
  **/
  @ApiModelProperty(value = "")
  public String getTotalRecipients() {
    return totalRecipients;
  }

  public void setTotalRecipients(String totalRecipients) {
    this.totalRecipients = totalRecipients;
  }

  public ReportInProductRunResponseRowFields totalSigners(String totalSigners) {
    this.totalSigners = totalSigners;
    return this;
  }

   /**
   * 
   * @return totalSigners
  **/
  @ApiModelProperty(value = "")
  public String getTotalSigners() {
    return totalSigners;
  }

  public void setTotalSigners(String totalSigners) {
    this.totalSigners = totalSigners;
  }

  public ReportInProductRunResponseRowFields uniqueSenders(String uniqueSenders) {
    this.uniqueSenders = uniqueSenders;
    return this;
  }

   /**
   * 
   * @return uniqueSenders
  **/
  @ApiModelProperty(value = "")
  public String getUniqueSenders() {
    return uniqueSenders;
  }

  public void setUniqueSenders(String uniqueSenders) {
    this.uniqueSenders = uniqueSenders;
  }

  public ReportInProductRunResponseRowFields userAccountEmail(String userAccountEmail) {
    this.userAccountEmail = userAccountEmail;
    return this;
  }

   /**
   * 
   * @return userAccountEmail
  **/
  @ApiModelProperty(value = "")
  public String getUserAccountEmail() {
    return userAccountEmail;
  }

  public void setUserAccountEmail(String userAccountEmail) {
    this.userAccountEmail = userAccountEmail;
  }

  public ReportInProductRunResponseRowFields userAccountName(String userAccountName) {
    this.userAccountName = userAccountName;
    return this;
  }

   /**
   * 
   * @return userAccountName
  **/
  @ApiModelProperty(value = "")
  public String getUserAccountName() {
    return userAccountName;
  }

  public void setUserAccountName(String userAccountName) {
    this.userAccountName = userAccountName;
  }

  public ReportInProductRunResponseRowFields userAccountStatus(String userAccountStatus) {
    this.userAccountStatus = userAccountStatus;
    return this;
  }

   /**
   * 
   * @return userAccountStatus
  **/
  @ApiModelProperty(value = "")
  public String getUserAccountStatus() {
    return userAccountStatus;
  }

  public void setUserAccountStatus(String userAccountStatus) {
    this.userAccountStatus = userAccountStatus;
  }

  public ReportInProductRunResponseRowFields userCount(String userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * 
   * @return userCount
  **/
  @ApiModelProperty(value = "")
  public String getUserCount() {
    return userCount;
  }

  public void setUserCount(String userCount) {
    this.userCount = userCount;
  }

  public ReportInProductRunResponseRowFields userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ReportInProductRunResponseRowFields verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * 
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "")
  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public ReportInProductRunResponseRowFields verificationType(String verificationType) {
    this.verificationType = verificationType;
    return this;
  }

   /**
   * 
   * @return verificationType
  **/
  @ApiModelProperty(value = "")
  public String getVerificationType() {
    return verificationType;
  }

  public void setVerificationType(String verificationType) {
    this.verificationType = verificationType;
  }

  public ReportInProductRunResponseRowFields viewDate(String viewDate) {
    this.viewDate = viewDate;
    return this;
  }

   /**
   * 
   * @return viewDate
  **/
  @ApiModelProperty(value = "")
  public String getViewDate() {
    return viewDate;
  }

  public void setViewDate(String viewDate) {
    this.viewDate = viewDate;
  }

  public ReportInProductRunResponseRowFields voidedTs(String voidedTs) {
    this.voidedTs = voidedTs;
    return this;
  }

   /**
   * 
   * @return voidedTs
  **/
  @ApiModelProperty(value = "")
  public String getVoidedTs() {
    return voidedTs;
  }

  public void setVoidedTs(String voidedTs) {
    this.voidedTs = voidedTs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductRunResponseRowFields reportInProductRunResponseRowFields = (ReportInProductRunResponseRowFields) o;
    return Objects.equals(this.accessCodeRequired, reportInProductRunResponseRowFields.accessCodeRequired) &&
        Objects.equals(this.accessCodesAttempted, reportInProductRunResponseRowFields.accessCodesAttempted) &&
        Objects.equals(this.accessCodesFailed, reportInProductRunResponseRowFields.accessCodesFailed) &&
        Objects.equals(this.accountId, reportInProductRunResponseRowFields.accountId) &&
        Objects.equals(this.authenticationCategory, reportInProductRunResponseRowFields.authenticationCategory) &&
        Objects.equals(this.authenticationSuccess, reportInProductRunResponseRowFields.authenticationSuccess) &&
        Objects.equals(this.authenticationType, reportInProductRunResponseRowFields.authenticationType) &&
        Objects.equals(this.averageTimeToCompleteSeconds, reportInProductRunResponseRowFields.averageTimeToCompleteSeconds) &&
        Objects.equals(this.avgCompleteSeconds, reportInProductRunResponseRowFields.avgCompleteSeconds) &&
        Objects.equals(this.captureMethod, reportInProductRunResponseRowFields.captureMethod) &&
        Objects.equals(this.completed, reportInProductRunResponseRowFields.completed) &&
        Objects.equals(this.completedTs, reportInProductRunResponseRowFields.completedTs) &&
        Objects.equals(this.createdDate, reportInProductRunResponseRowFields.createdDate) &&
        Objects.equals(this.customField, reportInProductRunResponseRowFields.customField) &&
        Objects.equals(this.declinedDate, reportInProductRunResponseRowFields.declinedDate) &&
        Objects.equals(this.declinedReason, reportInProductRunResponseRowFields.declinedReason) &&
        Objects.equals(this.deliveredDate, reportInProductRunResponseRowFields.deliveredDate) &&
        Objects.equals(this.envelopeCount, reportInProductRunResponseRowFields.envelopeCount) &&
        Objects.equals(this.envelopeCreator, reportInProductRunResponseRowFields.envelopeCreator) &&
        Objects.equals(this.envelopeId, reportInProductRunResponseRowFields.envelopeId) &&
        Objects.equals(this.envelopeInitialSendTs, reportInProductRunResponseRowFields.envelopeInitialSendTs) &&
        Objects.equals(this.envelopesBilled, reportInProductRunResponseRowFields.envelopesBilled) &&
        Objects.equals(this.envelopesCompleted, reportInProductRunResponseRowFields.envelopesCompleted) &&
        Objects.equals(this.envelopesCompletedCount, reportInProductRunResponseRowFields.envelopesCompletedCount) &&
        Objects.equals(this.envelopesDeclined, reportInProductRunResponseRowFields.envelopesDeclined) &&
        Objects.equals(this.envelopesSent, reportInProductRunResponseRowFields.envelopesSent) &&
        Objects.equals(this.envelopesSentCount, reportInProductRunResponseRowFields.envelopesSentCount) &&
        Objects.equals(this.envelopesVoided, reportInProductRunResponseRowFields.envelopesVoided) &&
        Objects.equals(this.envelopeVoidedReason, reportInProductRunResponseRowFields.envelopeVoidedReason) &&
        Objects.equals(this.eodDocumentDescription, reportInProductRunResponseRowFields.eodDocumentDescription) &&
        Objects.equals(this.eodDocumentName, reportInProductRunResponseRowFields.eodDocumentName) &&
        Objects.equals(this.eodDocumentProfileId, reportInProductRunResponseRowFields.eodDocumentProfileId) &&
        Objects.equals(this.eodTransactionId, reportInProductRunResponseRowFields.eodTransactionId) &&
        Objects.equals(this.eodTransactionName, reportInProductRunResponseRowFields.eodTransactionName) &&
        Objects.equals(this.eventDate, reportInProductRunResponseRowFields.eventDate) &&
        Objects.equals(this.expirationDate, reportInProductRunResponseRowFields.expirationDate) &&
        Objects.equals(this.expiredTs, reportInProductRunResponseRowFields.expiredTs) &&
        Objects.equals(this.failureReason, reportInProductRunResponseRowFields.failureReason) &&
        Objects.equals(this.failures, reportInProductRunResponseRowFields.failures) &&
        Objects.equals(this.failureVendorCode, reportInProductRunResponseRowFields.failureVendorCode) &&
        Objects.equals(this.failureVendorReason, reportInProductRunResponseRowFields.failureVendorReason) &&
        Objects.equals(this.firstSendTs, reportInProductRunResponseRowFields.firstSendTs) &&
        Objects.equals(this.groupId, reportInProductRunResponseRowFields.groupId) &&
        Objects.equals(this.groupName, reportInProductRunResponseRowFields.groupName) &&
        Objects.equals(this.hoursToCompleteEnd, reportInProductRunResponseRowFields.hoursToCompleteEnd) &&
        Objects.equals(this.hoursToCompleteStart, reportInProductRunResponseRowFields.hoursToCompleteStart) &&
        Objects.equals(this.idChecksAttempted, reportInProductRunResponseRowFields.idChecksAttempted) &&
        Objects.equals(this.idChecksFailed, reportInProductRunResponseRowFields.idChecksFailed) &&
        Objects.equals(this.idCountry, reportInProductRunResponseRowFields.idCountry) &&
        Objects.equals(this.idMethod, reportInProductRunResponseRowFields.idMethod) &&
        Objects.equals(this.initialSendTs, reportInProductRunResponseRowFields.initialSendTs) &&
        Objects.equals(this.ipAddress, reportInProductRunResponseRowFields.ipAddress) &&
        Objects.equals(this.lastActivity, reportInProductRunResponseRowFields.lastActivity) &&
        Objects.equals(this.lastActivityDate, reportInProductRunResponseRowFields.lastActivityDate) &&
        Objects.equals(this.lastSentDate, reportInProductRunResponseRowFields.lastSentDate) &&
        Objects.equals(this.metadataRemoved, reportInProductRunResponseRowFields.metadataRemoved) &&
        Objects.equals(this.notSigned, reportInProductRunResponseRowFields.notSigned) &&
        Objects.equals(this.numberOfAuthenticatedRecipients, reportInProductRunResponseRowFields.numberOfAuthenticatedRecipients) &&
        Objects.equals(this.numberOfCompletedSignatures, reportInProductRunResponseRowFields.numberOfCompletedSignatures) &&
        Objects.equals(this.numberOfDocuments, reportInProductRunResponseRowFields.numberOfDocuments) &&
        Objects.equals(this.numberOfPages, reportInProductRunResponseRowFields.numberOfPages) &&
        Objects.equals(this.numberOfRecipients, reportInProductRunResponseRowFields.numberOfRecipients) &&
        Objects.equals(this.numberOfSends, reportInProductRunResponseRowFields.numberOfSends) &&
        Objects.equals(this.numberOfSigners, reportInProductRunResponseRowFields.numberOfSigners) &&
        Objects.equals(this.numberOfTotalDocuments, reportInProductRunResponseRowFields.numberOfTotalDocuments) &&
        Objects.equals(this.numberOfTotalPages, reportInProductRunResponseRowFields.numberOfTotalPages) &&
        Objects.equals(this.numberOfTotalSigners, reportInProductRunResponseRowFields.numberOfTotalSigners) &&
        Objects.equals(this.numberOfUniqueSenders, reportInProductRunResponseRowFields.numberOfUniqueSenders) &&
        Objects.equals(this.numberTotalRecipients, reportInProductRunResponseRowFields.numberTotalRecipients) &&
        Objects.equals(this.periodEnd, reportInProductRunResponseRowFields.periodEnd) &&
        Objects.equals(this.periodStart, reportInProductRunResponseRowFields.periodStart) &&
        Objects.equals(this.phoneCallsAttempted, reportInProductRunResponseRowFields.phoneCallsAttempted) &&
        Objects.equals(this.phoneCallsFailed, reportInProductRunResponseRowFields.phoneCallsFailed) &&
        Objects.equals(this.piiRedacted, reportInProductRunResponseRowFields.piiRedacted) &&
        Objects.equals(this.purgeDate, reportInProductRunResponseRowFields.purgeDate) &&
        Objects.equals(this.reasonForDeclining, reportInProductRunResponseRowFields.reasonForDeclining) &&
        Objects.equals(this.reasonForVoiding, reportInProductRunResponseRowFields.reasonForVoiding) &&
        Objects.equals(this.reassignReason, reportInProductRunResponseRowFields.reassignReason) &&
        Objects.equals(this.received, reportInProductRunResponseRowFields.received) &&
        Objects.equals(this.recipient, reportInProductRunResponseRowFields.recipient) &&
        Objects.equals(this.recipientAction, reportInProductRunResponseRowFields.recipientAction) &&
        Objects.equals(this.recipientCompanyName, reportInProductRunResponseRowFields.recipientCompanyName) &&
        Objects.equals(this.recipientCountry, reportInProductRunResponseRowFields.recipientCountry) &&
        Objects.equals(this.recipientEmail, reportInProductRunResponseRowFields.recipientEmail) &&
        Objects.equals(this.recipientId, reportInProductRunResponseRowFields.recipientId) &&
        Objects.equals(this.recipientName, reportInProductRunResponseRowFields.recipientName) &&
        Objects.equals(this.recipientTemplateRoleName, reportInProductRunResponseRowFields.recipientTemplateRoleName) &&
        Objects.equals(this.recipientTitle, reportInProductRunResponseRowFields.recipientTitle) &&
        Objects.equals(this.recipientType, reportInProductRunResponseRowFields.recipientType) &&
        Objects.equals(this.recipientUserId, reportInProductRunResponseRowFields.recipientUserId) &&
        Objects.equals(this.remainingSignatures, reportInProductRunResponseRowFields.remainingSignatures) &&
        Objects.equals(this.routingOrder, reportInProductRunResponseRowFields.routingOrder) &&
        Objects.equals(this.senderAccountId, reportInProductRunResponseRowFields.senderAccountId) &&
        Objects.equals(this.senderCompanyName, reportInProductRunResponseRowFields.senderCompanyName) &&
        Objects.equals(this.senderCountry, reportInProductRunResponseRowFields.senderCountry) &&
        Objects.equals(this.senderEmail, reportInProductRunResponseRowFields.senderEmail) &&
        Objects.equals(this.senderIPAddress, reportInProductRunResponseRowFields.senderIPAddress) &&
        Objects.equals(this.senderJobTitle, reportInProductRunResponseRowFields.senderJobTitle) &&
        Objects.equals(this.senderName, reportInProductRunResponseRowFields.senderName) &&
        Objects.equals(this.senderUserId, reportInProductRunResponseRowFields.senderUserId) &&
        Objects.equals(this.signDate, reportInProductRunResponseRowFields.signDate) &&
        Objects.equals(this.signed, reportInProductRunResponseRowFields.signed) &&
        Objects.equals(this.signedDate, reportInProductRunResponseRowFields.signedDate) &&
        Objects.equals(this.signedOnMobile, reportInProductRunResponseRowFields.signedOnMobile) &&
        Objects.equals(this.signedOnPaper, reportInProductRunResponseRowFields.signedOnPaper) &&
        Objects.equals(this.signerList, reportInProductRunResponseRowFields.signerList) &&
        Objects.equals(this.status, reportInProductRunResponseRowFields.status) &&
        Objects.equals(this.statusChangedDate, reportInProductRunResponseRowFields.statusChangedDate) &&
        Objects.equals(this.statusChangedTs, reportInProductRunResponseRowFields.statusChangedTs) &&
        Objects.equals(this.statusComment, reportInProductRunResponseRowFields.statusComment) &&
        Objects.equals(this.subject, reportInProductRunResponseRowFields.subject) &&
        Objects.equals(this.successes, reportInProductRunResponseRowFields.successes) &&
        Objects.equals(this.templatesCreated, reportInProductRunResponseRowFields.templatesCreated) &&
        Objects.equals(this.templatesCreatedCount, reportInProductRunResponseRowFields.templatesCreatedCount) &&
        Objects.equals(this.terminalStatusDate, reportInProductRunResponseRowFields.terminalStatusDate) &&
        Objects.equals(this.timeToCompleteSeconds, reportInProductRunResponseRowFields.timeToCompleteSeconds) &&
        Objects.equals(this.timeToDeliver, reportInProductRunResponseRowFields.timeToDeliver) &&
        Objects.equals(this.totalDocuments, reportInProductRunResponseRowFields.totalDocuments) &&
        Objects.equals(this.totalEnvelopes, reportInProductRunResponseRowFields.totalEnvelopes) &&
        Objects.equals(this.totalPages, reportInProductRunResponseRowFields.totalPages) &&
        Objects.equals(this.totalRecipients, reportInProductRunResponseRowFields.totalRecipients) &&
        Objects.equals(this.totalSigners, reportInProductRunResponseRowFields.totalSigners) &&
        Objects.equals(this.uniqueSenders, reportInProductRunResponseRowFields.uniqueSenders) &&
        Objects.equals(this.userAccountEmail, reportInProductRunResponseRowFields.userAccountEmail) &&
        Objects.equals(this.userAccountName, reportInProductRunResponseRowFields.userAccountName) &&
        Objects.equals(this.userAccountStatus, reportInProductRunResponseRowFields.userAccountStatus) &&
        Objects.equals(this.userCount, reportInProductRunResponseRowFields.userCount) &&
        Objects.equals(this.userId, reportInProductRunResponseRowFields.userId) &&
        Objects.equals(this.verificationStatus, reportInProductRunResponseRowFields.verificationStatus) &&
        Objects.equals(this.verificationType, reportInProductRunResponseRowFields.verificationType) &&
        Objects.equals(this.viewDate, reportInProductRunResponseRowFields.viewDate) &&
        Objects.equals(this.voidedTs, reportInProductRunResponseRowFields.voidedTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCodeRequired, accessCodesAttempted, accessCodesFailed, accountId, authenticationCategory, authenticationSuccess, authenticationType, averageTimeToCompleteSeconds, avgCompleteSeconds, captureMethod, completed, completedTs, createdDate, customField, declinedDate, declinedReason, deliveredDate, envelopeCount, envelopeCreator, envelopeId, envelopeInitialSendTs, envelopesBilled, envelopesCompleted, envelopesCompletedCount, envelopesDeclined, envelopesSent, envelopesSentCount, envelopesVoided, envelopeVoidedReason, eodDocumentDescription, eodDocumentName, eodDocumentProfileId, eodTransactionId, eodTransactionName, eventDate, expirationDate, expiredTs, failureReason, failures, failureVendorCode, failureVendorReason, firstSendTs, groupId, groupName, hoursToCompleteEnd, hoursToCompleteStart, idChecksAttempted, idChecksFailed, idCountry, idMethod, initialSendTs, ipAddress, lastActivity, lastActivityDate, lastSentDate, metadataRemoved, notSigned, numberOfAuthenticatedRecipients, numberOfCompletedSignatures, numberOfDocuments, numberOfPages, numberOfRecipients, numberOfSends, numberOfSigners, numberOfTotalDocuments, numberOfTotalPages, numberOfTotalSigners, numberOfUniqueSenders, numberTotalRecipients, periodEnd, periodStart, phoneCallsAttempted, phoneCallsFailed, piiRedacted, purgeDate, reasonForDeclining, reasonForVoiding, reassignReason, received, recipient, recipientAction, recipientCompanyName, recipientCountry, recipientEmail, recipientId, recipientName, recipientTemplateRoleName, recipientTitle, recipientType, recipientUserId, remainingSignatures, routingOrder, senderAccountId, senderCompanyName, senderCountry, senderEmail, senderIPAddress, senderJobTitle, senderName, senderUserId, signDate, signed, signedDate, signedOnMobile, signedOnPaper, signerList, status, statusChangedDate, statusChangedTs, statusComment, subject, successes, templatesCreated, templatesCreatedCount, terminalStatusDate, timeToCompleteSeconds, timeToDeliver, totalDocuments, totalEnvelopes, totalPages, totalRecipients, totalSigners, uniqueSenders, userAccountEmail, userAccountName, userAccountStatus, userCount, userId, verificationStatus, verificationType, viewDate, voidedTs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductRunResponseRowFields {\n");
    
    sb.append("    accessCodeRequired: ").append(toIndentedString(accessCodeRequired)).append("\n");
    sb.append("    accessCodesAttempted: ").append(toIndentedString(accessCodesAttempted)).append("\n");
    sb.append("    accessCodesFailed: ").append(toIndentedString(accessCodesFailed)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    authenticationCategory: ").append(toIndentedString(authenticationCategory)).append("\n");
    sb.append("    authenticationSuccess: ").append(toIndentedString(authenticationSuccess)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    averageTimeToCompleteSeconds: ").append(toIndentedString(averageTimeToCompleteSeconds)).append("\n");
    sb.append("    avgCompleteSeconds: ").append(toIndentedString(avgCompleteSeconds)).append("\n");
    sb.append("    captureMethod: ").append(toIndentedString(captureMethod)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedTs: ").append(toIndentedString(completedTs)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    declinedDate: ").append(toIndentedString(declinedDate)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    envelopeCount: ").append(toIndentedString(envelopeCount)).append("\n");
    sb.append("    envelopeCreator: ").append(toIndentedString(envelopeCreator)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeInitialSendTs: ").append(toIndentedString(envelopeInitialSendTs)).append("\n");
    sb.append("    envelopesBilled: ").append(toIndentedString(envelopesBilled)).append("\n");
    sb.append("    envelopesCompleted: ").append(toIndentedString(envelopesCompleted)).append("\n");
    sb.append("    envelopesCompletedCount: ").append(toIndentedString(envelopesCompletedCount)).append("\n");
    sb.append("    envelopesDeclined: ").append(toIndentedString(envelopesDeclined)).append("\n");
    sb.append("    envelopesSent: ").append(toIndentedString(envelopesSent)).append("\n");
    sb.append("    envelopesSentCount: ").append(toIndentedString(envelopesSentCount)).append("\n");
    sb.append("    envelopesVoided: ").append(toIndentedString(envelopesVoided)).append("\n");
    sb.append("    envelopeVoidedReason: ").append(toIndentedString(envelopeVoidedReason)).append("\n");
    sb.append("    eodDocumentDescription: ").append(toIndentedString(eodDocumentDescription)).append("\n");
    sb.append("    eodDocumentName: ").append(toIndentedString(eodDocumentName)).append("\n");
    sb.append("    eodDocumentProfileId: ").append(toIndentedString(eodDocumentProfileId)).append("\n");
    sb.append("    eodTransactionId: ").append(toIndentedString(eodTransactionId)).append("\n");
    sb.append("    eodTransactionName: ").append(toIndentedString(eodTransactionName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expiredTs: ").append(toIndentedString(expiredTs)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    failureVendorCode: ").append(toIndentedString(failureVendorCode)).append("\n");
    sb.append("    failureVendorReason: ").append(toIndentedString(failureVendorReason)).append("\n");
    sb.append("    firstSendTs: ").append(toIndentedString(firstSendTs)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    hoursToCompleteEnd: ").append(toIndentedString(hoursToCompleteEnd)).append("\n");
    sb.append("    hoursToCompleteStart: ").append(toIndentedString(hoursToCompleteStart)).append("\n");
    sb.append("    idChecksAttempted: ").append(toIndentedString(idChecksAttempted)).append("\n");
    sb.append("    idChecksFailed: ").append(toIndentedString(idChecksFailed)).append("\n");
    sb.append("    idCountry: ").append(toIndentedString(idCountry)).append("\n");
    sb.append("    idMethod: ").append(toIndentedString(idMethod)).append("\n");
    sb.append("    initialSendTs: ").append(toIndentedString(initialSendTs)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    lastSentDate: ").append(toIndentedString(lastSentDate)).append("\n");
    sb.append("    metadataRemoved: ").append(toIndentedString(metadataRemoved)).append("\n");
    sb.append("    notSigned: ").append(toIndentedString(notSigned)).append("\n");
    sb.append("    numberOfAuthenticatedRecipients: ").append(toIndentedString(numberOfAuthenticatedRecipients)).append("\n");
    sb.append("    numberOfCompletedSignatures: ").append(toIndentedString(numberOfCompletedSignatures)).append("\n");
    sb.append("    numberOfDocuments: ").append(toIndentedString(numberOfDocuments)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    numberOfRecipients: ").append(toIndentedString(numberOfRecipients)).append("\n");
    sb.append("    numberOfSends: ").append(toIndentedString(numberOfSends)).append("\n");
    sb.append("    numberOfSigners: ").append(toIndentedString(numberOfSigners)).append("\n");
    sb.append("    numberOfTotalDocuments: ").append(toIndentedString(numberOfTotalDocuments)).append("\n");
    sb.append("    numberOfTotalPages: ").append(toIndentedString(numberOfTotalPages)).append("\n");
    sb.append("    numberOfTotalSigners: ").append(toIndentedString(numberOfTotalSigners)).append("\n");
    sb.append("    numberOfUniqueSenders: ").append(toIndentedString(numberOfUniqueSenders)).append("\n");
    sb.append("    numberTotalRecipients: ").append(toIndentedString(numberTotalRecipients)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    phoneCallsAttempted: ").append(toIndentedString(phoneCallsAttempted)).append("\n");
    sb.append("    phoneCallsFailed: ").append(toIndentedString(phoneCallsFailed)).append("\n");
    sb.append("    piiRedacted: ").append(toIndentedString(piiRedacted)).append("\n");
    sb.append("    purgeDate: ").append(toIndentedString(purgeDate)).append("\n");
    sb.append("    reasonForDeclining: ").append(toIndentedString(reasonForDeclining)).append("\n");
    sb.append("    reasonForVoiding: ").append(toIndentedString(reasonForVoiding)).append("\n");
    sb.append("    reassignReason: ").append(toIndentedString(reassignReason)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientAction: ").append(toIndentedString(recipientAction)).append("\n");
    sb.append("    recipientCompanyName: ").append(toIndentedString(recipientCompanyName)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientEmail: ").append(toIndentedString(recipientEmail)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientTemplateRoleName: ").append(toIndentedString(recipientTemplateRoleName)).append("\n");
    sb.append("    recipientTitle: ").append(toIndentedString(recipientTitle)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    recipientUserId: ").append(toIndentedString(recipientUserId)).append("\n");
    sb.append("    remainingSignatures: ").append(toIndentedString(remainingSignatures)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    senderAccountId: ").append(toIndentedString(senderAccountId)).append("\n");
    sb.append("    senderCompanyName: ").append(toIndentedString(senderCompanyName)).append("\n");
    sb.append("    senderCountry: ").append(toIndentedString(senderCountry)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderIPAddress: ").append(toIndentedString(senderIPAddress)).append("\n");
    sb.append("    senderJobTitle: ").append(toIndentedString(senderJobTitle)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    signedDate: ").append(toIndentedString(signedDate)).append("\n");
    sb.append("    signedOnMobile: ").append(toIndentedString(signedOnMobile)).append("\n");
    sb.append("    signedOnPaper: ").append(toIndentedString(signedOnPaper)).append("\n");
    sb.append("    signerList: ").append(toIndentedString(signerList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedDate: ").append(toIndentedString(statusChangedDate)).append("\n");
    sb.append("    statusChangedTs: ").append(toIndentedString(statusChangedTs)).append("\n");
    sb.append("    statusComment: ").append(toIndentedString(statusComment)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    successes: ").append(toIndentedString(successes)).append("\n");
    sb.append("    templatesCreated: ").append(toIndentedString(templatesCreated)).append("\n");
    sb.append("    templatesCreatedCount: ").append(toIndentedString(templatesCreatedCount)).append("\n");
    sb.append("    terminalStatusDate: ").append(toIndentedString(terminalStatusDate)).append("\n");
    sb.append("    timeToCompleteSeconds: ").append(toIndentedString(timeToCompleteSeconds)).append("\n");
    sb.append("    timeToDeliver: ").append(toIndentedString(timeToDeliver)).append("\n");
    sb.append("    totalDocuments: ").append(toIndentedString(totalDocuments)).append("\n");
    sb.append("    totalEnvelopes: ").append(toIndentedString(totalEnvelopes)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalRecipients: ").append(toIndentedString(totalRecipients)).append("\n");
    sb.append("    totalSigners: ").append(toIndentedString(totalSigners)).append("\n");
    sb.append("    uniqueSenders: ").append(toIndentedString(uniqueSenders)).append("\n");
    sb.append("    userAccountEmail: ").append(toIndentedString(userAccountEmail)).append("\n");
    sb.append("    userAccountName: ").append(toIndentedString(userAccountName)).append("\n");
    sb.append("    userAccountStatus: ").append(toIndentedString(userAccountStatus)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    verificationType: ").append(toIndentedString(verificationType)).append("\n");
    sb.append("    viewDate: ").append(toIndentedString(viewDate)).append("\n");
    sb.append("    voidedTs: ").append(toIndentedString(voidedTs)).append("\n");
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

