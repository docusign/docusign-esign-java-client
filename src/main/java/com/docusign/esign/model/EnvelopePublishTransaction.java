package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopePublishTransactionErrorRollup;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopePublishTransaction.
 *
 */

public class EnvelopePublishTransaction implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("applyConnectSettings")
  private String applyConnectSettings = null;

  @JsonProperty("envelopeCount")
  private String envelopeCount = null;

  @JsonProperty("envelopeLevelErrorRollups")
  private java.util.List<EnvelopePublishTransactionErrorRollup> envelopeLevelErrorRollups = null;

  @JsonProperty("envelopePublishTransactionId")
  private String envelopePublishTransactionId = null;

  @JsonProperty("errorCount")
  private String errorCount = null;

  @JsonProperty("fileLevelErrors")
  private java.util.List<String> fileLevelErrors = null;

  @JsonProperty("noActionRequiredEnvelopeCount")
  private String noActionRequiredEnvelopeCount = null;

  @JsonProperty("processedEnvelopeCount")
  private String processedEnvelopeCount = null;

  @JsonProperty("processingStatus")
  private String processingStatus = null;

  @JsonProperty("resultsUri")
  private String resultsUri = null;

  @JsonProperty("submissionDate")
  private String submissionDate = null;

  @JsonProperty("submittedByUserInfo")
  private UserInfo submittedByUserInfo = null;

  @JsonProperty("submittedForPublishingEnvelopeCount")
  private String submittedForPublishingEnvelopeCount = null;


  /**
   * applyConnectSettings.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction applyConnectSettings(String applyConnectSettings) {
    this.applyConnectSettings = applyConnectSettings;
    return this;
  }

  /**
   * .
   * @return applyConnectSettings
   **/
  @Schema(description = "")
  public String getApplyConnectSettings() {
    return applyConnectSettings;
  }

  /**
   * setApplyConnectSettings.
   **/
  public void setApplyConnectSettings(String applyConnectSettings) {
    this.applyConnectSettings = applyConnectSettings;
  }


  /**
   * envelopeCount.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction envelopeCount(String envelopeCount) {
    this.envelopeCount = envelopeCount;
    return this;
  }

  /**
   * .
   * @return envelopeCount
   **/
  @Schema(description = "")
  public String getEnvelopeCount() {
    return envelopeCount;
  }

  /**
   * setEnvelopeCount.
   **/
  public void setEnvelopeCount(String envelopeCount) {
    this.envelopeCount = envelopeCount;
  }


  /**
   * envelopeLevelErrorRollups.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction envelopeLevelErrorRollups(java.util.List<EnvelopePublishTransactionErrorRollup> envelopeLevelErrorRollups) {
    this.envelopeLevelErrorRollups = envelopeLevelErrorRollups;
    return this;
  }
  
  /**
   * addEnvelopeLevelErrorRollupsItem.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction addEnvelopeLevelErrorRollupsItem(EnvelopePublishTransactionErrorRollup envelopeLevelErrorRollupsItem) {
    if (this.envelopeLevelErrorRollups == null) {
      this.envelopeLevelErrorRollups = new java.util.ArrayList<>();
    }
    this.envelopeLevelErrorRollups.add(envelopeLevelErrorRollupsItem);
    return this;
  }

  /**
   * .
   * @return envelopeLevelErrorRollups
   **/
  @Schema(description = "")
  public java.util.List<EnvelopePublishTransactionErrorRollup> getEnvelopeLevelErrorRollups() {
    return envelopeLevelErrorRollups;
  }

  /**
   * setEnvelopeLevelErrorRollups.
   **/
  public void setEnvelopeLevelErrorRollups(java.util.List<EnvelopePublishTransactionErrorRollup> envelopeLevelErrorRollups) {
    this.envelopeLevelErrorRollups = envelopeLevelErrorRollups;
  }


  /**
   * envelopePublishTransactionId.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction envelopePublishTransactionId(String envelopePublishTransactionId) {
    this.envelopePublishTransactionId = envelopePublishTransactionId;
    return this;
  }

  /**
   * .
   * @return envelopePublishTransactionId
   **/
  @Schema(description = "")
  public String getEnvelopePublishTransactionId() {
    return envelopePublishTransactionId;
  }

  /**
   * setEnvelopePublishTransactionId.
   **/
  public void setEnvelopePublishTransactionId(String envelopePublishTransactionId) {
    this.envelopePublishTransactionId = envelopePublishTransactionId;
  }


  /**
   * errorCount.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction errorCount(String errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * .
   * @return errorCount
   **/
  @Schema(description = "")
  public String getErrorCount() {
    return errorCount;
  }

  /**
   * setErrorCount.
   **/
  public void setErrorCount(String errorCount) {
    this.errorCount = errorCount;
  }


  /**
   * fileLevelErrors.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction fileLevelErrors(java.util.List<String> fileLevelErrors) {
    this.fileLevelErrors = fileLevelErrors;
    return this;
  }
  
  /**
   * addFileLevelErrorsItem.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction addFileLevelErrorsItem(String fileLevelErrorsItem) {
    if (this.fileLevelErrors == null) {
      this.fileLevelErrors = new java.util.ArrayList<>();
    }
    this.fileLevelErrors.add(fileLevelErrorsItem);
    return this;
  }

  /**
   * .
   * @return fileLevelErrors
   **/
  @Schema(description = "")
  public java.util.List<String> getFileLevelErrors() {
    return fileLevelErrors;
  }

  /**
   * setFileLevelErrors.
   **/
  public void setFileLevelErrors(java.util.List<String> fileLevelErrors) {
    this.fileLevelErrors = fileLevelErrors;
  }


  /**
   * noActionRequiredEnvelopeCount.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction noActionRequiredEnvelopeCount(String noActionRequiredEnvelopeCount) {
    this.noActionRequiredEnvelopeCount = noActionRequiredEnvelopeCount;
    return this;
  }

  /**
   * .
   * @return noActionRequiredEnvelopeCount
   **/
  @Schema(description = "")
  public String getNoActionRequiredEnvelopeCount() {
    return noActionRequiredEnvelopeCount;
  }

  /**
   * setNoActionRequiredEnvelopeCount.
   **/
  public void setNoActionRequiredEnvelopeCount(String noActionRequiredEnvelopeCount) {
    this.noActionRequiredEnvelopeCount = noActionRequiredEnvelopeCount;
  }


  /**
   * processedEnvelopeCount.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction processedEnvelopeCount(String processedEnvelopeCount) {
    this.processedEnvelopeCount = processedEnvelopeCount;
    return this;
  }

  /**
   * .
   * @return processedEnvelopeCount
   **/
  @Schema(description = "")
  public String getProcessedEnvelopeCount() {
    return processedEnvelopeCount;
  }

  /**
   * setProcessedEnvelopeCount.
   **/
  public void setProcessedEnvelopeCount(String processedEnvelopeCount) {
    this.processedEnvelopeCount = processedEnvelopeCount;
  }


  /**
   * processingStatus.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * .
   * @return processingStatus
   **/
  @Schema(description = "")
  public String getProcessingStatus() {
    return processingStatus;
  }

  /**
   * setProcessingStatus.
   **/
  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }


  /**
   * resultsUri.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }

  /**
   * .
   * @return resultsUri
   **/
  @Schema(description = "")
  public String getResultsUri() {
    return resultsUri;
  }

  /**
   * setResultsUri.
   **/
  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
  }


  /**
   * submissionDate.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction submissionDate(String submissionDate) {
    this.submissionDate = submissionDate;
    return this;
  }

  /**
   * .
   * @return submissionDate
   **/
  @Schema(description = "")
  public String getSubmissionDate() {
    return submissionDate;
  }

  /**
   * setSubmissionDate.
   **/
  public void setSubmissionDate(String submissionDate) {
    this.submissionDate = submissionDate;
  }


  /**
   * submittedByUserInfo.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction submittedByUserInfo(UserInfo submittedByUserInfo) {
    this.submittedByUserInfo = submittedByUserInfo;
    return this;
  }

  /**
   * .
   * @return submittedByUserInfo
   **/
  @Schema(description = "")
  public UserInfo getSubmittedByUserInfo() {
    return submittedByUserInfo;
  }

  /**
   * setSubmittedByUserInfo.
   **/
  public void setSubmittedByUserInfo(UserInfo submittedByUserInfo) {
    this.submittedByUserInfo = submittedByUserInfo;
  }


  /**
   * submittedForPublishingEnvelopeCount.
   *
   * @return EnvelopePublishTransaction
   **/
  public EnvelopePublishTransaction submittedForPublishingEnvelopeCount(String submittedForPublishingEnvelopeCount) {
    this.submittedForPublishingEnvelopeCount = submittedForPublishingEnvelopeCount;
    return this;
  }

  /**
   * .
   * @return submittedForPublishingEnvelopeCount
   **/
  @Schema(description = "")
  public String getSubmittedForPublishingEnvelopeCount() {
    return submittedForPublishingEnvelopeCount;
  }

  /**
   * setSubmittedForPublishingEnvelopeCount.
   **/
  public void setSubmittedForPublishingEnvelopeCount(String submittedForPublishingEnvelopeCount) {
    this.submittedForPublishingEnvelopeCount = submittedForPublishingEnvelopeCount;
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
    EnvelopePublishTransaction envelopePublishTransaction = (EnvelopePublishTransaction) o;
    return Objects.equals(this.applyConnectSettings, envelopePublishTransaction.applyConnectSettings) &&
        Objects.equals(this.envelopeCount, envelopePublishTransaction.envelopeCount) &&
        Objects.equals(this.envelopeLevelErrorRollups, envelopePublishTransaction.envelopeLevelErrorRollups) &&
        Objects.equals(this.envelopePublishTransactionId, envelopePublishTransaction.envelopePublishTransactionId) &&
        Objects.equals(this.errorCount, envelopePublishTransaction.errorCount) &&
        Objects.equals(this.fileLevelErrors, envelopePublishTransaction.fileLevelErrors) &&
        Objects.equals(this.noActionRequiredEnvelopeCount, envelopePublishTransaction.noActionRequiredEnvelopeCount) &&
        Objects.equals(this.processedEnvelopeCount, envelopePublishTransaction.processedEnvelopeCount) &&
        Objects.equals(this.processingStatus, envelopePublishTransaction.processingStatus) &&
        Objects.equals(this.resultsUri, envelopePublishTransaction.resultsUri) &&
        Objects.equals(this.submissionDate, envelopePublishTransaction.submissionDate) &&
        Objects.equals(this.submittedByUserInfo, envelopePublishTransaction.submittedByUserInfo) &&
        Objects.equals(this.submittedForPublishingEnvelopeCount, envelopePublishTransaction.submittedForPublishingEnvelopeCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(applyConnectSettings, envelopeCount, envelopeLevelErrorRollups, envelopePublishTransactionId, errorCount, fileLevelErrors, noActionRequiredEnvelopeCount, processedEnvelopeCount, processingStatus, resultsUri, submissionDate, submittedByUserInfo, submittedForPublishingEnvelopeCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePublishTransaction {\n");
    
    sb.append("    applyConnectSettings: ").append(toIndentedString(applyConnectSettings)).append("\n");
    sb.append("    envelopeCount: ").append(toIndentedString(envelopeCount)).append("\n");
    sb.append("    envelopeLevelErrorRollups: ").append(toIndentedString(envelopeLevelErrorRollups)).append("\n");
    sb.append("    envelopePublishTransactionId: ").append(toIndentedString(envelopePublishTransactionId)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    fileLevelErrors: ").append(toIndentedString(fileLevelErrors)).append("\n");
    sb.append("    noActionRequiredEnvelopeCount: ").append(toIndentedString(noActionRequiredEnvelopeCount)).append("\n");
    sb.append("    processedEnvelopeCount: ").append(toIndentedString(processedEnvelopeCount)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
    sb.append("    submittedByUserInfo: ").append(toIndentedString(submittedByUserInfo)).append("\n");
    sb.append("    submittedForPublishingEnvelopeCount: ").append(toIndentedString(submittedForPublishingEnvelopeCount)).append("\n");
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

