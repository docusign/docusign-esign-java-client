package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopePublishTransactionErrorRollup;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopePublishTransaction
 */

public class EnvelopePublishTransaction {
  @JsonProperty("applyConnectSettings")
  private String applyConnectSettings = null;

  @JsonProperty("envelopeCount")
  private String envelopeCount = null;

  @JsonProperty("envelopeLevelErrorRollups")
  private java.util.List<EnvelopePublishTransactionErrorRollup> envelopeLevelErrorRollups = new java.util.ArrayList<EnvelopePublishTransactionErrorRollup>();

  @JsonProperty("envelopePublishTransactionId")
  private String envelopePublishTransactionId = null;

  @JsonProperty("errorCount")
  private String errorCount = null;

  @JsonProperty("fileLevelErrors")
  private java.util.List<String> fileLevelErrors = new java.util.ArrayList<String>();

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

  public EnvelopePublishTransaction applyConnectSettings(String applyConnectSettings) {
    this.applyConnectSettings = applyConnectSettings;
    return this;
  }

   /**
   * 
   * @return applyConnectSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getApplyConnectSettings() {
    return applyConnectSettings;
  }

  public void setApplyConnectSettings(String applyConnectSettings) {
    this.applyConnectSettings = applyConnectSettings;
  }

  public EnvelopePublishTransaction envelopeCount(String envelopeCount) {
    this.envelopeCount = envelopeCount;
    return this;
  }

   /**
   * 
   * @return envelopeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopeCount() {
    return envelopeCount;
  }

  public void setEnvelopeCount(String envelopeCount) {
    this.envelopeCount = envelopeCount;
  }

  public EnvelopePublishTransaction envelopeLevelErrorRollups(java.util.List<EnvelopePublishTransactionErrorRollup> envelopeLevelErrorRollups) {
    this.envelopeLevelErrorRollups = envelopeLevelErrorRollups;
    return this;
  }

  public EnvelopePublishTransaction addEnvelopeLevelErrorRollupsItem(EnvelopePublishTransactionErrorRollup envelopeLevelErrorRollupsItem) {
    this.envelopeLevelErrorRollups.add(envelopeLevelErrorRollupsItem);
    return this;
  }

   /**
   * 
   * @return envelopeLevelErrorRollups
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<EnvelopePublishTransactionErrorRollup> getEnvelopeLevelErrorRollups() {
    return envelopeLevelErrorRollups;
  }

  public void setEnvelopeLevelErrorRollups(java.util.List<EnvelopePublishTransactionErrorRollup> envelopeLevelErrorRollups) {
    this.envelopeLevelErrorRollups = envelopeLevelErrorRollups;
  }

  public EnvelopePublishTransaction envelopePublishTransactionId(String envelopePublishTransactionId) {
    this.envelopePublishTransactionId = envelopePublishTransactionId;
    return this;
  }

   /**
   * 
   * @return envelopePublishTransactionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopePublishTransactionId() {
    return envelopePublishTransactionId;
  }

  public void setEnvelopePublishTransactionId(String envelopePublishTransactionId) {
    this.envelopePublishTransactionId = envelopePublishTransactionId;
  }

  public EnvelopePublishTransaction errorCount(String errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * 
   * @return errorCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(String errorCount) {
    this.errorCount = errorCount;
  }

  public EnvelopePublishTransaction fileLevelErrors(java.util.List<String> fileLevelErrors) {
    this.fileLevelErrors = fileLevelErrors;
    return this;
  }

  public EnvelopePublishTransaction addFileLevelErrorsItem(String fileLevelErrorsItem) {
    this.fileLevelErrors.add(fileLevelErrorsItem);
    return this;
  }

   /**
   * 
   * @return fileLevelErrors
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getFileLevelErrors() {
    return fileLevelErrors;
  }

  public void setFileLevelErrors(java.util.List<String> fileLevelErrors) {
    this.fileLevelErrors = fileLevelErrors;
  }

  public EnvelopePublishTransaction noActionRequiredEnvelopeCount(String noActionRequiredEnvelopeCount) {
    this.noActionRequiredEnvelopeCount = noActionRequiredEnvelopeCount;
    return this;
  }

   /**
   * 
   * @return noActionRequiredEnvelopeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNoActionRequiredEnvelopeCount() {
    return noActionRequiredEnvelopeCount;
  }

  public void setNoActionRequiredEnvelopeCount(String noActionRequiredEnvelopeCount) {
    this.noActionRequiredEnvelopeCount = noActionRequiredEnvelopeCount;
  }

  public EnvelopePublishTransaction processedEnvelopeCount(String processedEnvelopeCount) {
    this.processedEnvelopeCount = processedEnvelopeCount;
    return this;
  }

   /**
   * 
   * @return processedEnvelopeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProcessedEnvelopeCount() {
    return processedEnvelopeCount;
  }

  public void setProcessedEnvelopeCount(String processedEnvelopeCount) {
    this.processedEnvelopeCount = processedEnvelopeCount;
  }

  public EnvelopePublishTransaction processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * 
   * @return processingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

  public EnvelopePublishTransaction resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }

   /**
   * 
   * @return resultsUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResultsUri() {
    return resultsUri;
  }

  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
  }

  public EnvelopePublishTransaction submissionDate(String submissionDate) {
    this.submissionDate = submissionDate;
    return this;
  }

   /**
   * 
   * @return submissionDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubmissionDate() {
    return submissionDate;
  }

  public void setSubmissionDate(String submissionDate) {
    this.submissionDate = submissionDate;
  }

  public EnvelopePublishTransaction submittedByUserInfo(UserInfo submittedByUserInfo) {
    this.submittedByUserInfo = submittedByUserInfo;
    return this;
  }

   /**
   * Get submittedByUserInfo
   * @return submittedByUserInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInfo getSubmittedByUserInfo() {
    return submittedByUserInfo;
  }

  public void setSubmittedByUserInfo(UserInfo submittedByUserInfo) {
    this.submittedByUserInfo = submittedByUserInfo;
  }

  public EnvelopePublishTransaction submittedForPublishingEnvelopeCount(String submittedForPublishingEnvelopeCount) {
    this.submittedForPublishingEnvelopeCount = submittedForPublishingEnvelopeCount;
    return this;
  }

   /**
   * 
   * @return submittedForPublishingEnvelopeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubmittedForPublishingEnvelopeCount() {
    return submittedForPublishingEnvelopeCount;
  }

  public void setSubmittedForPublishingEnvelopeCount(String submittedForPublishingEnvelopeCount) {
    this.submittedForPublishingEnvelopeCount = submittedForPublishingEnvelopeCount;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(applyConnectSettings, envelopeCount, envelopeLevelErrorRollups, envelopePublishTransactionId, errorCount, fileLevelErrors, noActionRequiredEnvelopeCount, processedEnvelopeCount, processingStatus, resultsUri, submissionDate, submittedByUserInfo, submittedForPublishingEnvelopeCount);
  }


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

