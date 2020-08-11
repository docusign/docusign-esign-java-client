package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductListItem
 */

public class ReportInProductListItem {
  @JsonProperty("getUri")
  private String getUri = null;

  @JsonProperty("lastScheduledExecutionDate")
  private String lastScheduledExecutionDate = null;

  @JsonProperty("lastScheduledExecutionSuccessDate")
  private String lastScheduledExecutionSuccessDate = null;

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

  @JsonProperty("scheduleCreateDate")
  private String scheduleCreateDate = null;

  @JsonProperty("scheduleEndDate")
  private String scheduleEndDate = null;

  @JsonProperty("scheduleId")
  private String scheduleId = null;

  @JsonProperty("scheduleRenewDurationDays")
  private String scheduleRenewDurationDays = null;

  public ReportInProductListItem getUri(String getUri) {
    this.getUri = getUri;
    return this;
  }

   /**
   * 
   * @return getUri
  **/
  @ApiModelProperty(value = "")
  public String getGetUri() {
    return getUri;
  }

  public void setGetUri(String getUri) {
    this.getUri = getUri;
  }

  public ReportInProductListItem lastScheduledExecutionDate(String lastScheduledExecutionDate) {
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

  public ReportInProductListItem lastScheduledExecutionSuccessDate(String lastScheduledExecutionSuccessDate) {
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

  public ReportInProductListItem reportCustomizedId(String reportCustomizedId) {
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

  public ReportInProductListItem reportDescription(String reportDescription) {
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

  public ReportInProductListItem reportId(String reportId) {
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

  public ReportInProductListItem reportName(String reportName) {
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

  public ReportInProductListItem reportType(String reportType) {
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

  public ReportInProductListItem runUri(String runUri) {
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

  public ReportInProductListItem saveUri(String saveUri) {
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

  public ReportInProductListItem scheduleCreateDate(String scheduleCreateDate) {
    this.scheduleCreateDate = scheduleCreateDate;
    return this;
  }

   /**
   * 
   * @return scheduleCreateDate
  **/
  @ApiModelProperty(value = "")
  public String getScheduleCreateDate() {
    return scheduleCreateDate;
  }

  public void setScheduleCreateDate(String scheduleCreateDate) {
    this.scheduleCreateDate = scheduleCreateDate;
  }

  public ReportInProductListItem scheduleEndDate(String scheduleEndDate) {
    this.scheduleEndDate = scheduleEndDate;
    return this;
  }

   /**
   * 
   * @return scheduleEndDate
  **/
  @ApiModelProperty(value = "")
  public String getScheduleEndDate() {
    return scheduleEndDate;
  }

  public void setScheduleEndDate(String scheduleEndDate) {
    this.scheduleEndDate = scheduleEndDate;
  }

  public ReportInProductListItem scheduleId(String scheduleId) {
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

  public ReportInProductListItem scheduleRenewDurationDays(String scheduleRenewDurationDays) {
    this.scheduleRenewDurationDays = scheduleRenewDurationDays;
    return this;
  }

   /**
   * 
   * @return scheduleRenewDurationDays
  **/
  @ApiModelProperty(value = "")
  public String getScheduleRenewDurationDays() {
    return scheduleRenewDurationDays;
  }

  public void setScheduleRenewDurationDays(String scheduleRenewDurationDays) {
    this.scheduleRenewDurationDays = scheduleRenewDurationDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductListItem reportInProductListItem = (ReportInProductListItem) o;
    return Objects.equals(this.getUri, reportInProductListItem.getUri) &&
        Objects.equals(this.lastScheduledExecutionDate, reportInProductListItem.lastScheduledExecutionDate) &&
        Objects.equals(this.lastScheduledExecutionSuccessDate, reportInProductListItem.lastScheduledExecutionSuccessDate) &&
        Objects.equals(this.reportCustomizedId, reportInProductListItem.reportCustomizedId) &&
        Objects.equals(this.reportDescription, reportInProductListItem.reportDescription) &&
        Objects.equals(this.reportId, reportInProductListItem.reportId) &&
        Objects.equals(this.reportName, reportInProductListItem.reportName) &&
        Objects.equals(this.reportType, reportInProductListItem.reportType) &&
        Objects.equals(this.runUri, reportInProductListItem.runUri) &&
        Objects.equals(this.saveUri, reportInProductListItem.saveUri) &&
        Objects.equals(this.scheduleCreateDate, reportInProductListItem.scheduleCreateDate) &&
        Objects.equals(this.scheduleEndDate, reportInProductListItem.scheduleEndDate) &&
        Objects.equals(this.scheduleId, reportInProductListItem.scheduleId) &&
        Objects.equals(this.scheduleRenewDurationDays, reportInProductListItem.scheduleRenewDurationDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUri, lastScheduledExecutionDate, lastScheduledExecutionSuccessDate, reportCustomizedId, reportDescription, reportId, reportName, reportType, runUri, saveUri, scheduleCreateDate, scheduleEndDate, scheduleId, scheduleRenewDurationDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductListItem {\n");
    
    sb.append("    getUri: ").append(toIndentedString(getUri)).append("\n");
    sb.append("    lastScheduledExecutionDate: ").append(toIndentedString(lastScheduledExecutionDate)).append("\n");
    sb.append("    lastScheduledExecutionSuccessDate: ").append(toIndentedString(lastScheduledExecutionSuccessDate)).append("\n");
    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    runUri: ").append(toIndentedString(runUri)).append("\n");
    sb.append("    saveUri: ").append(toIndentedString(saveUri)).append("\n");
    sb.append("    scheduleCreateDate: ").append(toIndentedString(scheduleCreateDate)).append("\n");
    sb.append("    scheduleEndDate: ").append(toIndentedString(scheduleEndDate)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    scheduleRenewDurationDays: ").append(toIndentedString(scheduleRenewDurationDays)).append("\n");
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

