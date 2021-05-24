package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ReportInProductField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductRunRequest
 */

public class ReportInProductRunRequest {
  @JsonProperty("authenticationSuccessFilter")
  private String authenticationSuccessFilter = null;

  @JsonProperty("customFieldFilter")
  private String customFieldFilter = null;

  @JsonProperty("dateRangeCustomFromDate")
  private String dateRangeCustomFromDate = null;

  @JsonProperty("dateRangeCustomToDate")
  private String dateRangeCustomToDate = null;

  @JsonProperty("dateRangeFilter")
  private String dateRangeFilter = null;

  @JsonProperty("envelopeDateTypeFilter")
  private String envelopeDateTypeFilter = null;

  @JsonProperty("envelopeRecipientNameContainsFilter")
  private String envelopeRecipientNameContainsFilter = null;

  @JsonProperty("envelopeStatusFilter")
  private String envelopeStatusFilter = null;

  @JsonProperty("envelopeSubjectContainsFilter")
  private String envelopeSubjectContainsFilter = null;

  @JsonProperty("fields")
  private java.util.List<ReportInProductField> fields = null;

  @JsonProperty("forDownload")
  private String forDownload = null;

  @JsonProperty("isDashboard")
  private String isDashboard = null;

  @JsonProperty("periodLengthFilter")
  private String periodLengthFilter = null;

  @JsonProperty("reportCustomizedId")
  private String reportCustomizedId = null;

  @JsonProperty("reportDescription")
  private String reportDescription = null;

  @JsonProperty("reportId")
  private String reportId = null;

  @JsonProperty("reportInvocationType")
  private String reportInvocationType = null;

  @JsonProperty("reportName")
  private String reportName = null;

  @JsonProperty("sentByFilter")
  private String sentByFilter = null;

  @JsonProperty("sentByIds")
  private String sentByIds = null;

  @JsonProperty("sortDirection")
  private String sortDirection = null;

  @JsonProperty("sortField")
  private String sortField = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("verificationStatusFilter")
  private String verificationStatusFilter = null;

  public ReportInProductRunRequest authenticationSuccessFilter(String authenticationSuccessFilter) {
    this.authenticationSuccessFilter = authenticationSuccessFilter;
    return this;
  }

   /**
   * 
   * @return authenticationSuccessFilter
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationSuccessFilter() {
    return authenticationSuccessFilter;
  }

  public void setAuthenticationSuccessFilter(String authenticationSuccessFilter) {
    this.authenticationSuccessFilter = authenticationSuccessFilter;
  }

  public ReportInProductRunRequest customFieldFilter(String customFieldFilter) {
    this.customFieldFilter = customFieldFilter;
    return this;
  }

   /**
   * 
   * @return customFieldFilter
  **/
  @ApiModelProperty(value = "")
  public String getCustomFieldFilter() {
    return customFieldFilter;
  }

  public void setCustomFieldFilter(String customFieldFilter) {
    this.customFieldFilter = customFieldFilter;
  }

  public ReportInProductRunRequest dateRangeCustomFromDate(String dateRangeCustomFromDate) {
    this.dateRangeCustomFromDate = dateRangeCustomFromDate;
    return this;
  }

   /**
   * 
   * @return dateRangeCustomFromDate
  **/
  @ApiModelProperty(value = "")
  public String getDateRangeCustomFromDate() {
    return dateRangeCustomFromDate;
  }

  public void setDateRangeCustomFromDate(String dateRangeCustomFromDate) {
    this.dateRangeCustomFromDate = dateRangeCustomFromDate;
  }

  public ReportInProductRunRequest dateRangeCustomToDate(String dateRangeCustomToDate) {
    this.dateRangeCustomToDate = dateRangeCustomToDate;
    return this;
  }

   /**
   * 
   * @return dateRangeCustomToDate
  **/
  @ApiModelProperty(value = "")
  public String getDateRangeCustomToDate() {
    return dateRangeCustomToDate;
  }

  public void setDateRangeCustomToDate(String dateRangeCustomToDate) {
    this.dateRangeCustomToDate = dateRangeCustomToDate;
  }

  public ReportInProductRunRequest dateRangeFilter(String dateRangeFilter) {
    this.dateRangeFilter = dateRangeFilter;
    return this;
  }

   /**
   * 
   * @return dateRangeFilter
  **/
  @ApiModelProperty(value = "")
  public String getDateRangeFilter() {
    return dateRangeFilter;
  }

  public void setDateRangeFilter(String dateRangeFilter) {
    this.dateRangeFilter = dateRangeFilter;
  }

  public ReportInProductRunRequest envelopeDateTypeFilter(String envelopeDateTypeFilter) {
    this.envelopeDateTypeFilter = envelopeDateTypeFilter;
    return this;
  }

   /**
   * 
   * @return envelopeDateTypeFilter
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeDateTypeFilter() {
    return envelopeDateTypeFilter;
  }

  public void setEnvelopeDateTypeFilter(String envelopeDateTypeFilter) {
    this.envelopeDateTypeFilter = envelopeDateTypeFilter;
  }

  public ReportInProductRunRequest envelopeRecipientNameContainsFilter(String envelopeRecipientNameContainsFilter) {
    this.envelopeRecipientNameContainsFilter = envelopeRecipientNameContainsFilter;
    return this;
  }

   /**
   * 
   * @return envelopeRecipientNameContainsFilter
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeRecipientNameContainsFilter() {
    return envelopeRecipientNameContainsFilter;
  }

  public void setEnvelopeRecipientNameContainsFilter(String envelopeRecipientNameContainsFilter) {
    this.envelopeRecipientNameContainsFilter = envelopeRecipientNameContainsFilter;
  }

  public ReportInProductRunRequest envelopeStatusFilter(String envelopeStatusFilter) {
    this.envelopeStatusFilter = envelopeStatusFilter;
    return this;
  }

   /**
   * 
   * @return envelopeStatusFilter
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeStatusFilter() {
    return envelopeStatusFilter;
  }

  public void setEnvelopeStatusFilter(String envelopeStatusFilter) {
    this.envelopeStatusFilter = envelopeStatusFilter;
  }

  public ReportInProductRunRequest envelopeSubjectContainsFilter(String envelopeSubjectContainsFilter) {
    this.envelopeSubjectContainsFilter = envelopeSubjectContainsFilter;
    return this;
  }

   /**
   * 
   * @return envelopeSubjectContainsFilter
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeSubjectContainsFilter() {
    return envelopeSubjectContainsFilter;
  }

  public void setEnvelopeSubjectContainsFilter(String envelopeSubjectContainsFilter) {
    this.envelopeSubjectContainsFilter = envelopeSubjectContainsFilter;
  }

  public ReportInProductRunRequest fields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
    return this;
  }

  public ReportInProductRunRequest addFieldsItem(ReportInProductField fieldsItem) {
    if (this.fields == null) {
      this.fields = new java.util.ArrayList<ReportInProductField>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ReportInProductField> getFields() {
    return fields;
  }

  public void setFields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
  }

  public ReportInProductRunRequest forDownload(String forDownload) {
    this.forDownload = forDownload;
    return this;
  }

   /**
   * 
   * @return forDownload
  **/
  @ApiModelProperty(value = "")
  public String getForDownload() {
    return forDownload;
  }

  public void setForDownload(String forDownload) {
    this.forDownload = forDownload;
  }

  public ReportInProductRunRequest isDashboard(String isDashboard) {
    this.isDashboard = isDashboard;
    return this;
  }

   /**
   * 
   * @return isDashboard
  **/
  @ApiModelProperty(value = "")
  public String getIsDashboard() {
    return isDashboard;
  }

  public void setIsDashboard(String isDashboard) {
    this.isDashboard = isDashboard;
  }

  public ReportInProductRunRequest periodLengthFilter(String periodLengthFilter) {
    this.periodLengthFilter = periodLengthFilter;
    return this;
  }

   /**
   * 
   * @return periodLengthFilter
  **/
  @ApiModelProperty(value = "")
  public String getPeriodLengthFilter() {
    return periodLengthFilter;
  }

  public void setPeriodLengthFilter(String periodLengthFilter) {
    this.periodLengthFilter = periodLengthFilter;
  }

  public ReportInProductRunRequest reportCustomizedId(String reportCustomizedId) {
    this.reportCustomizedId = reportCustomizedId;
    return this;
  }

   /**
   * 
   * @return reportCustomizedId
  **/
  @ApiModelProperty(value = "")
  public String getReportCustomizedId() {
    return reportCustomizedId;
  }

  public void setReportCustomizedId(String reportCustomizedId) {
    this.reportCustomizedId = reportCustomizedId;
  }

  public ReportInProductRunRequest reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * 
   * @return reportDescription
  **/
  @ApiModelProperty(value = "")
  public String getReportDescription() {
    return reportDescription;
  }

  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }

  public ReportInProductRunRequest reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * 
   * @return reportId
  **/
  @ApiModelProperty(value = "")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public ReportInProductRunRequest reportInvocationType(String reportInvocationType) {
    this.reportInvocationType = reportInvocationType;
    return this;
  }

   /**
   * 
   * @return reportInvocationType
  **/
  @ApiModelProperty(value = "")
  public String getReportInvocationType() {
    return reportInvocationType;
  }

  public void setReportInvocationType(String reportInvocationType) {
    this.reportInvocationType = reportInvocationType;
  }

  public ReportInProductRunRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * 
   * @return reportName
  **/
  @ApiModelProperty(value = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportInProductRunRequest sentByFilter(String sentByFilter) {
    this.sentByFilter = sentByFilter;
    return this;
  }

   /**
   * 
   * @return sentByFilter
  **/
  @ApiModelProperty(value = "")
  public String getSentByFilter() {
    return sentByFilter;
  }

  public void setSentByFilter(String sentByFilter) {
    this.sentByFilter = sentByFilter;
  }

  public ReportInProductRunRequest sentByIds(String sentByIds) {
    this.sentByIds = sentByIds;
    return this;
  }

   /**
   * 
   * @return sentByIds
  **/
  @ApiModelProperty(value = "")
  public String getSentByIds() {
    return sentByIds;
  }

  public void setSentByIds(String sentByIds) {
    this.sentByIds = sentByIds;
  }

  public ReportInProductRunRequest sortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * 
   * @return sortDirection
  **/
  @ApiModelProperty(value = "")
  public String getSortDirection() {
    return sortDirection;
  }

  public void setSortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
  }

  public ReportInProductRunRequest sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

   /**
   * 
   * @return sortField
  **/
  @ApiModelProperty(value = "")
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public ReportInProductRunRequest startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public ReportInProductRunRequest verificationStatusFilter(String verificationStatusFilter) {
    this.verificationStatusFilter = verificationStatusFilter;
    return this;
  }

   /**
   * 
   * @return verificationStatusFilter
  **/
  @ApiModelProperty(value = "")
  public String getVerificationStatusFilter() {
    return verificationStatusFilter;
  }

  public void setVerificationStatusFilter(String verificationStatusFilter) {
    this.verificationStatusFilter = verificationStatusFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductRunRequest reportInProductRunRequest = (ReportInProductRunRequest) o;
    return Objects.equals(this.authenticationSuccessFilter, reportInProductRunRequest.authenticationSuccessFilter) &&
        Objects.equals(this.customFieldFilter, reportInProductRunRequest.customFieldFilter) &&
        Objects.equals(this.dateRangeCustomFromDate, reportInProductRunRequest.dateRangeCustomFromDate) &&
        Objects.equals(this.dateRangeCustomToDate, reportInProductRunRequest.dateRangeCustomToDate) &&
        Objects.equals(this.dateRangeFilter, reportInProductRunRequest.dateRangeFilter) &&
        Objects.equals(this.envelopeDateTypeFilter, reportInProductRunRequest.envelopeDateTypeFilter) &&
        Objects.equals(this.envelopeRecipientNameContainsFilter, reportInProductRunRequest.envelopeRecipientNameContainsFilter) &&
        Objects.equals(this.envelopeStatusFilter, reportInProductRunRequest.envelopeStatusFilter) &&
        Objects.equals(this.envelopeSubjectContainsFilter, reportInProductRunRequest.envelopeSubjectContainsFilter) &&
        Objects.equals(this.fields, reportInProductRunRequest.fields) &&
        Objects.equals(this.forDownload, reportInProductRunRequest.forDownload) &&
        Objects.equals(this.isDashboard, reportInProductRunRequest.isDashboard) &&
        Objects.equals(this.periodLengthFilter, reportInProductRunRequest.periodLengthFilter) &&
        Objects.equals(this.reportCustomizedId, reportInProductRunRequest.reportCustomizedId) &&
        Objects.equals(this.reportDescription, reportInProductRunRequest.reportDescription) &&
        Objects.equals(this.reportId, reportInProductRunRequest.reportId) &&
        Objects.equals(this.reportInvocationType, reportInProductRunRequest.reportInvocationType) &&
        Objects.equals(this.reportName, reportInProductRunRequest.reportName) &&
        Objects.equals(this.sentByFilter, reportInProductRunRequest.sentByFilter) &&
        Objects.equals(this.sentByIds, reportInProductRunRequest.sentByIds) &&
        Objects.equals(this.sortDirection, reportInProductRunRequest.sortDirection) &&
        Objects.equals(this.sortField, reportInProductRunRequest.sortField) &&
        Objects.equals(this.startPosition, reportInProductRunRequest.startPosition) &&
        Objects.equals(this.verificationStatusFilter, reportInProductRunRequest.verificationStatusFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationSuccessFilter, customFieldFilter, dateRangeCustomFromDate, dateRangeCustomToDate, dateRangeFilter, envelopeDateTypeFilter, envelopeRecipientNameContainsFilter, envelopeStatusFilter, envelopeSubjectContainsFilter, fields, forDownload, isDashboard, periodLengthFilter, reportCustomizedId, reportDescription, reportId, reportInvocationType, reportName, sentByFilter, sentByIds, sortDirection, sortField, startPosition, verificationStatusFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductRunRequest {\n");
    
    sb.append("    authenticationSuccessFilter: ").append(toIndentedString(authenticationSuccessFilter)).append("\n");
    sb.append("    customFieldFilter: ").append(toIndentedString(customFieldFilter)).append("\n");
    sb.append("    dateRangeCustomFromDate: ").append(toIndentedString(dateRangeCustomFromDate)).append("\n");
    sb.append("    dateRangeCustomToDate: ").append(toIndentedString(dateRangeCustomToDate)).append("\n");
    sb.append("    dateRangeFilter: ").append(toIndentedString(dateRangeFilter)).append("\n");
    sb.append("    envelopeDateTypeFilter: ").append(toIndentedString(envelopeDateTypeFilter)).append("\n");
    sb.append("    envelopeRecipientNameContainsFilter: ").append(toIndentedString(envelopeRecipientNameContainsFilter)).append("\n");
    sb.append("    envelopeStatusFilter: ").append(toIndentedString(envelopeStatusFilter)).append("\n");
    sb.append("    envelopeSubjectContainsFilter: ").append(toIndentedString(envelopeSubjectContainsFilter)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    forDownload: ").append(toIndentedString(forDownload)).append("\n");
    sb.append("    isDashboard: ").append(toIndentedString(isDashboard)).append("\n");
    sb.append("    periodLengthFilter: ").append(toIndentedString(periodLengthFilter)).append("\n");
    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportInvocationType: ").append(toIndentedString(reportInvocationType)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    sentByFilter: ").append(toIndentedString(sentByFilter)).append("\n");
    sb.append("    sentByIds: ").append(toIndentedString(sentByIds)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    verificationStatusFilter: ").append(toIndentedString(verificationStatusFilter)).append("\n");
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

