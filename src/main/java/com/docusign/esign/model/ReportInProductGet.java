package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ReportInProductField;
import com.docusign.esign.model.ReportInProductSentByDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductGet
 */

public class ReportInProductGet {
  @JsonProperty("customFieldFilter")
  private String customFieldFilter = null;

  @JsonProperty("dateRangeCustomFromDate")
  private String dateRangeCustomFromDate = null;

  @JsonProperty("dateRangeCustomToDate")
  private String dateRangeCustomToDate = null;

  @JsonProperty("dateRangeFilter")
  private String dateRangeFilter = null;

  @JsonProperty("displayOrder")
  private String displayOrder = null;

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

  @JsonProperty("lastScheduledExecutionDate")
  private String lastScheduledExecutionDate = null;

  @JsonProperty("lastScheduledExecutionSuccessDate")
  private String lastScheduledExecutionSuccessDate = null;

  @JsonProperty("maxDownloadRows")
  private String maxDownloadRows = null;

  @JsonProperty("maxGridRows")
  private String maxGridRows = null;

  @JsonProperty("maxScheduledRows")
  private String maxScheduledRows = null;

  @JsonProperty("periodLengthFilter")
  private String periodLengthFilter = null;

  @JsonProperty("reportCustomizedId")
  private String reportCustomizedId = null;

  @JsonProperty("reportDescription")
  private String reportDescription = null;

  @JsonProperty("reportId")
  private String reportId = null;

  @JsonProperty("reportName")
  private String reportName = null;

  @JsonProperty("reportType")
  private String reportType = null;

  @JsonProperty("runUri")
  private String runUri = null;

  @JsonProperty("saveUri")
  private String saveUri = null;

  @JsonProperty("scheduleId")
  private String scheduleId = null;

  @JsonProperty("sentByDetails")
  private ReportInProductSentByDetails sentByDetails = null;

  @JsonProperty("sentByFilter")
  private String sentByFilter = null;

  @JsonProperty("sentByIds")
  private String sentByIds = null;

  @JsonProperty("sortFieldDirection")
  private String sortFieldDirection = null;

  @JsonProperty("sortFieldName")
  private String sortFieldName = null;

  public ReportInProductGet customFieldFilter(String customFieldFilter) {
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

  public ReportInProductGet dateRangeCustomFromDate(String dateRangeCustomFromDate) {
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

  public ReportInProductGet dateRangeCustomToDate(String dateRangeCustomToDate) {
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

  public ReportInProductGet dateRangeFilter(String dateRangeFilter) {
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

  public ReportInProductGet displayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * 
   * @return displayOrder
  **/
  @ApiModelProperty(value = "")
  public String getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
  }

  public ReportInProductGet envelopeDateTypeFilter(String envelopeDateTypeFilter) {
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

  public ReportInProductGet envelopeRecipientNameContainsFilter(String envelopeRecipientNameContainsFilter) {
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

  public ReportInProductGet envelopeStatusFilter(String envelopeStatusFilter) {
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

  public ReportInProductGet envelopeSubjectContainsFilter(String envelopeSubjectContainsFilter) {
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

  public ReportInProductGet fields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
    return this;
  }

  public ReportInProductGet addFieldsItem(ReportInProductField fieldsItem) {
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

  public ReportInProductGet lastScheduledExecutionDate(String lastScheduledExecutionDate) {
    this.lastScheduledExecutionDate = lastScheduledExecutionDate;
    return this;
  }

   /**
   * 
   * @return lastScheduledExecutionDate
  **/
  @ApiModelProperty(value = "")
  public String getLastScheduledExecutionDate() {
    return lastScheduledExecutionDate;
  }

  public void setLastScheduledExecutionDate(String lastScheduledExecutionDate) {
    this.lastScheduledExecutionDate = lastScheduledExecutionDate;
  }

  public ReportInProductGet lastScheduledExecutionSuccessDate(String lastScheduledExecutionSuccessDate) {
    this.lastScheduledExecutionSuccessDate = lastScheduledExecutionSuccessDate;
    return this;
  }

   /**
   * 
   * @return lastScheduledExecutionSuccessDate
  **/
  @ApiModelProperty(value = "")
  public String getLastScheduledExecutionSuccessDate() {
    return lastScheduledExecutionSuccessDate;
  }

  public void setLastScheduledExecutionSuccessDate(String lastScheduledExecutionSuccessDate) {
    this.lastScheduledExecutionSuccessDate = lastScheduledExecutionSuccessDate;
  }

  public ReportInProductGet maxDownloadRows(String maxDownloadRows) {
    this.maxDownloadRows = maxDownloadRows;
    return this;
  }

   /**
   * 
   * @return maxDownloadRows
  **/
  @ApiModelProperty(value = "")
  public String getMaxDownloadRows() {
    return maxDownloadRows;
  }

  public void setMaxDownloadRows(String maxDownloadRows) {
    this.maxDownloadRows = maxDownloadRows;
  }

  public ReportInProductGet maxGridRows(String maxGridRows) {
    this.maxGridRows = maxGridRows;
    return this;
  }

   /**
   * 
   * @return maxGridRows
  **/
  @ApiModelProperty(value = "")
  public String getMaxGridRows() {
    return maxGridRows;
  }

  public void setMaxGridRows(String maxGridRows) {
    this.maxGridRows = maxGridRows;
  }

  public ReportInProductGet maxScheduledRows(String maxScheduledRows) {
    this.maxScheduledRows = maxScheduledRows;
    return this;
  }

   /**
   * 
   * @return maxScheduledRows
  **/
  @ApiModelProperty(value = "")
  public String getMaxScheduledRows() {
    return maxScheduledRows;
  }

  public void setMaxScheduledRows(String maxScheduledRows) {
    this.maxScheduledRows = maxScheduledRows;
  }

  public ReportInProductGet periodLengthFilter(String periodLengthFilter) {
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

  public ReportInProductGet reportCustomizedId(String reportCustomizedId) {
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

  public ReportInProductGet reportDescription(String reportDescription) {
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

  public ReportInProductGet reportId(String reportId) {
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

  public ReportInProductGet reportName(String reportName) {
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

  public ReportInProductGet reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * 
   * @return reportType
  **/
  @ApiModelProperty(value = "")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public ReportInProductGet runUri(String runUri) {
    this.runUri = runUri;
    return this;
  }

   /**
   * 
   * @return runUri
  **/
  @ApiModelProperty(value = "")
  public String getRunUri() {
    return runUri;
  }

  public void setRunUri(String runUri) {
    this.runUri = runUri;
  }

  public ReportInProductGet saveUri(String saveUri) {
    this.saveUri = saveUri;
    return this;
  }

   /**
   * 
   * @return saveUri
  **/
  @ApiModelProperty(value = "")
  public String getSaveUri() {
    return saveUri;
  }

  public void setSaveUri(String saveUri) {
    this.saveUri = saveUri;
  }

  public ReportInProductGet scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * 
   * @return scheduleId
  **/
  @ApiModelProperty(value = "")
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public ReportInProductGet sentByDetails(ReportInProductSentByDetails sentByDetails) {
    this.sentByDetails = sentByDetails;
    return this;
  }

   /**
   * Get sentByDetails
   * @return sentByDetails
  **/
  @ApiModelProperty(value = "")
  public ReportInProductSentByDetails getSentByDetails() {
    return sentByDetails;
  }

  public void setSentByDetails(ReportInProductSentByDetails sentByDetails) {
    this.sentByDetails = sentByDetails;
  }

  public ReportInProductGet sentByFilter(String sentByFilter) {
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

  public ReportInProductGet sentByIds(String sentByIds) {
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

  public ReportInProductGet sortFieldDirection(String sortFieldDirection) {
    this.sortFieldDirection = sortFieldDirection;
    return this;
  }

   /**
   * 
   * @return sortFieldDirection
  **/
  @ApiModelProperty(value = "")
  public String getSortFieldDirection() {
    return sortFieldDirection;
  }

  public void setSortFieldDirection(String sortFieldDirection) {
    this.sortFieldDirection = sortFieldDirection;
  }

  public ReportInProductGet sortFieldName(String sortFieldName) {
    this.sortFieldName = sortFieldName;
    return this;
  }

   /**
   * 
   * @return sortFieldName
  **/
  @ApiModelProperty(value = "")
  public String getSortFieldName() {
    return sortFieldName;
  }

  public void setSortFieldName(String sortFieldName) {
    this.sortFieldName = sortFieldName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductGet reportInProductGet = (ReportInProductGet) o;
    return Objects.equals(this.customFieldFilter, reportInProductGet.customFieldFilter) &&
        Objects.equals(this.dateRangeCustomFromDate, reportInProductGet.dateRangeCustomFromDate) &&
        Objects.equals(this.dateRangeCustomToDate, reportInProductGet.dateRangeCustomToDate) &&
        Objects.equals(this.dateRangeFilter, reportInProductGet.dateRangeFilter) &&
        Objects.equals(this.displayOrder, reportInProductGet.displayOrder) &&
        Objects.equals(this.envelopeDateTypeFilter, reportInProductGet.envelopeDateTypeFilter) &&
        Objects.equals(this.envelopeRecipientNameContainsFilter, reportInProductGet.envelopeRecipientNameContainsFilter) &&
        Objects.equals(this.envelopeStatusFilter, reportInProductGet.envelopeStatusFilter) &&
        Objects.equals(this.envelopeSubjectContainsFilter, reportInProductGet.envelopeSubjectContainsFilter) &&
        Objects.equals(this.fields, reportInProductGet.fields) &&
        Objects.equals(this.lastScheduledExecutionDate, reportInProductGet.lastScheduledExecutionDate) &&
        Objects.equals(this.lastScheduledExecutionSuccessDate, reportInProductGet.lastScheduledExecutionSuccessDate) &&
        Objects.equals(this.maxDownloadRows, reportInProductGet.maxDownloadRows) &&
        Objects.equals(this.maxGridRows, reportInProductGet.maxGridRows) &&
        Objects.equals(this.maxScheduledRows, reportInProductGet.maxScheduledRows) &&
        Objects.equals(this.periodLengthFilter, reportInProductGet.periodLengthFilter) &&
        Objects.equals(this.reportCustomizedId, reportInProductGet.reportCustomizedId) &&
        Objects.equals(this.reportDescription, reportInProductGet.reportDescription) &&
        Objects.equals(this.reportId, reportInProductGet.reportId) &&
        Objects.equals(this.reportName, reportInProductGet.reportName) &&
        Objects.equals(this.reportType, reportInProductGet.reportType) &&
        Objects.equals(this.runUri, reportInProductGet.runUri) &&
        Objects.equals(this.saveUri, reportInProductGet.saveUri) &&
        Objects.equals(this.scheduleId, reportInProductGet.scheduleId) &&
        Objects.equals(this.sentByDetails, reportInProductGet.sentByDetails) &&
        Objects.equals(this.sentByFilter, reportInProductGet.sentByFilter) &&
        Objects.equals(this.sentByIds, reportInProductGet.sentByIds) &&
        Objects.equals(this.sortFieldDirection, reportInProductGet.sortFieldDirection) &&
        Objects.equals(this.sortFieldName, reportInProductGet.sortFieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldFilter, dateRangeCustomFromDate, dateRangeCustomToDate, dateRangeFilter, displayOrder, envelopeDateTypeFilter, envelopeRecipientNameContainsFilter, envelopeStatusFilter, envelopeSubjectContainsFilter, fields, lastScheduledExecutionDate, lastScheduledExecutionSuccessDate, maxDownloadRows, maxGridRows, maxScheduledRows, periodLengthFilter, reportCustomizedId, reportDescription, reportId, reportName, reportType, runUri, saveUri, scheduleId, sentByDetails, sentByFilter, sentByIds, sortFieldDirection, sortFieldName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductGet {\n");
    
    sb.append("    customFieldFilter: ").append(toIndentedString(customFieldFilter)).append("\n");
    sb.append("    dateRangeCustomFromDate: ").append(toIndentedString(dateRangeCustomFromDate)).append("\n");
    sb.append("    dateRangeCustomToDate: ").append(toIndentedString(dateRangeCustomToDate)).append("\n");
    sb.append("    dateRangeFilter: ").append(toIndentedString(dateRangeFilter)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    envelopeDateTypeFilter: ").append(toIndentedString(envelopeDateTypeFilter)).append("\n");
    sb.append("    envelopeRecipientNameContainsFilter: ").append(toIndentedString(envelopeRecipientNameContainsFilter)).append("\n");
    sb.append("    envelopeStatusFilter: ").append(toIndentedString(envelopeStatusFilter)).append("\n");
    sb.append("    envelopeSubjectContainsFilter: ").append(toIndentedString(envelopeSubjectContainsFilter)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    lastScheduledExecutionDate: ").append(toIndentedString(lastScheduledExecutionDate)).append("\n");
    sb.append("    lastScheduledExecutionSuccessDate: ").append(toIndentedString(lastScheduledExecutionSuccessDate)).append("\n");
    sb.append("    maxDownloadRows: ").append(toIndentedString(maxDownloadRows)).append("\n");
    sb.append("    maxGridRows: ").append(toIndentedString(maxGridRows)).append("\n");
    sb.append("    maxScheduledRows: ").append(toIndentedString(maxScheduledRows)).append("\n");
    sb.append("    periodLengthFilter: ").append(toIndentedString(periodLengthFilter)).append("\n");
    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    runUri: ").append(toIndentedString(runUri)).append("\n");
    sb.append("    saveUri: ").append(toIndentedString(saveUri)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    sentByDetails: ").append(toIndentedString(sentByDetails)).append("\n");
    sb.append("    sentByFilter: ").append(toIndentedString(sentByFilter)).append("\n");
    sb.append("    sentByIds: ").append(toIndentedString(sentByIds)).append("\n");
    sb.append("    sortFieldDirection: ").append(toIndentedString(sortFieldDirection)).append("\n");
    sb.append("    sortFieldName: ").append(toIndentedString(sortFieldName)).append("\n");
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

