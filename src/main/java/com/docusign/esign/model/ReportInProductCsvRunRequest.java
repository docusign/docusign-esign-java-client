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
 * ReportInProductCsvRunRequest
 */

public class ReportInProductCsvRunRequest {
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

  @JsonProperty("newLine")
  private String newLine = null;

  @JsonProperty("overrideTimezoneKey")
  private String overrideTimezoneKey = null;

  @JsonProperty("periodLengthFilter")
  private String periodLengthFilter = null;

  @JsonProperty("quote")
  private String quote = null;

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

  @JsonProperty("separator")
  private String separator = null;

  @JsonProperty("sortDirection")
  private String sortDirection = null;

  @JsonProperty("sortField")
  private String sortField = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  public ReportInProductCsvRunRequest customFieldFilter(String customFieldFilter) {
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

  public ReportInProductCsvRunRequest dateRangeCustomFromDate(String dateRangeCustomFromDate) {
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

  public ReportInProductCsvRunRequest dateRangeCustomToDate(String dateRangeCustomToDate) {
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

  public ReportInProductCsvRunRequest dateRangeFilter(String dateRangeFilter) {
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

  public ReportInProductCsvRunRequest envelopeDateTypeFilter(String envelopeDateTypeFilter) {
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

  public ReportInProductCsvRunRequest envelopeRecipientNameContainsFilter(String envelopeRecipientNameContainsFilter) {
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

  public ReportInProductCsvRunRequest envelopeStatusFilter(String envelopeStatusFilter) {
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

  public ReportInProductCsvRunRequest envelopeSubjectContainsFilter(String envelopeSubjectContainsFilter) {
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

  public ReportInProductCsvRunRequest fields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
    return this;
  }

  public ReportInProductCsvRunRequest addFieldsItem(ReportInProductField fieldsItem) {
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

  public ReportInProductCsvRunRequest forDownload(String forDownload) {
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

  public ReportInProductCsvRunRequest isDashboard(String isDashboard) {
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

  public ReportInProductCsvRunRequest newLine(String newLine) {
    this.newLine = newLine;
    return this;
  }

   /**
   * 
   * @return newLine
  **/
  @ApiModelProperty(value = "")
  public String getNewLine() {
    return newLine;
  }

  public void setNewLine(String newLine) {
    this.newLine = newLine;
  }

  public ReportInProductCsvRunRequest overrideTimezoneKey(String overrideTimezoneKey) {
    this.overrideTimezoneKey = overrideTimezoneKey;
    return this;
  }

   /**
   * 
   * @return overrideTimezoneKey
  **/
  @ApiModelProperty(value = "")
  public String getOverrideTimezoneKey() {
    return overrideTimezoneKey;
  }

  public void setOverrideTimezoneKey(String overrideTimezoneKey) {
    this.overrideTimezoneKey = overrideTimezoneKey;
  }

  public ReportInProductCsvRunRequest periodLengthFilter(String periodLengthFilter) {
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

  public ReportInProductCsvRunRequest quote(String quote) {
    this.quote = quote;
    return this;
  }

   /**
   * 
   * @return quote
  **/
  @ApiModelProperty(value = "")
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public ReportInProductCsvRunRequest reportCustomizedId(String reportCustomizedId) {
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

  public ReportInProductCsvRunRequest reportDescription(String reportDescription) {
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

  public ReportInProductCsvRunRequest reportId(String reportId) {
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

  public ReportInProductCsvRunRequest reportInvocationType(String reportInvocationType) {
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

  public ReportInProductCsvRunRequest reportName(String reportName) {
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

  public ReportInProductCsvRunRequest sentByFilter(String sentByFilter) {
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

  public ReportInProductCsvRunRequest sentByIds(String sentByIds) {
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

  public ReportInProductCsvRunRequest separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * 
   * @return separator
  **/
  @ApiModelProperty(value = "")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public ReportInProductCsvRunRequest sortDirection(String sortDirection) {
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

  public ReportInProductCsvRunRequest sortField(String sortField) {
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

  public ReportInProductCsvRunRequest startPosition(String startPosition) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductCsvRunRequest reportInProductCsvRunRequest = (ReportInProductCsvRunRequest) o;
    return Objects.equals(this.customFieldFilter, reportInProductCsvRunRequest.customFieldFilter) &&
        Objects.equals(this.dateRangeCustomFromDate, reportInProductCsvRunRequest.dateRangeCustomFromDate) &&
        Objects.equals(this.dateRangeCustomToDate, reportInProductCsvRunRequest.dateRangeCustomToDate) &&
        Objects.equals(this.dateRangeFilter, reportInProductCsvRunRequest.dateRangeFilter) &&
        Objects.equals(this.envelopeDateTypeFilter, reportInProductCsvRunRequest.envelopeDateTypeFilter) &&
        Objects.equals(this.envelopeRecipientNameContainsFilter, reportInProductCsvRunRequest.envelopeRecipientNameContainsFilter) &&
        Objects.equals(this.envelopeStatusFilter, reportInProductCsvRunRequest.envelopeStatusFilter) &&
        Objects.equals(this.envelopeSubjectContainsFilter, reportInProductCsvRunRequest.envelopeSubjectContainsFilter) &&
        Objects.equals(this.fields, reportInProductCsvRunRequest.fields) &&
        Objects.equals(this.forDownload, reportInProductCsvRunRequest.forDownload) &&
        Objects.equals(this.isDashboard, reportInProductCsvRunRequest.isDashboard) &&
        Objects.equals(this.newLine, reportInProductCsvRunRequest.newLine) &&
        Objects.equals(this.overrideTimezoneKey, reportInProductCsvRunRequest.overrideTimezoneKey) &&
        Objects.equals(this.periodLengthFilter, reportInProductCsvRunRequest.periodLengthFilter) &&
        Objects.equals(this.quote, reportInProductCsvRunRequest.quote) &&
        Objects.equals(this.reportCustomizedId, reportInProductCsvRunRequest.reportCustomizedId) &&
        Objects.equals(this.reportDescription, reportInProductCsvRunRequest.reportDescription) &&
        Objects.equals(this.reportId, reportInProductCsvRunRequest.reportId) &&
        Objects.equals(this.reportInvocationType, reportInProductCsvRunRequest.reportInvocationType) &&
        Objects.equals(this.reportName, reportInProductCsvRunRequest.reportName) &&
        Objects.equals(this.sentByFilter, reportInProductCsvRunRequest.sentByFilter) &&
        Objects.equals(this.sentByIds, reportInProductCsvRunRequest.sentByIds) &&
        Objects.equals(this.separator, reportInProductCsvRunRequest.separator) &&
        Objects.equals(this.sortDirection, reportInProductCsvRunRequest.sortDirection) &&
        Objects.equals(this.sortField, reportInProductCsvRunRequest.sortField) &&
        Objects.equals(this.startPosition, reportInProductCsvRunRequest.startPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldFilter, dateRangeCustomFromDate, dateRangeCustomToDate, dateRangeFilter, envelopeDateTypeFilter, envelopeRecipientNameContainsFilter, envelopeStatusFilter, envelopeSubjectContainsFilter, fields, forDownload, isDashboard, newLine, overrideTimezoneKey, periodLengthFilter, quote, reportCustomizedId, reportDescription, reportId, reportInvocationType, reportName, sentByFilter, sentByIds, separator, sortDirection, sortField, startPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductCsvRunRequest {\n");
    
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
    sb.append("    newLine: ").append(toIndentedString(newLine)).append("\n");
    sb.append("    overrideTimezoneKey: ").append(toIndentedString(overrideTimezoneKey)).append("\n");
    sb.append("    periodLengthFilter: ").append(toIndentedString(periodLengthFilter)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportInvocationType: ").append(toIndentedString(reportInvocationType)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    sentByFilter: ").append(toIndentedString(sentByFilter)).append("\n");
    sb.append("    sentByIds: ").append(toIndentedString(sentByIds)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
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

