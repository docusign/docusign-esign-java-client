package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReportInProductListItem. */
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

  /**
   * getUri.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem getUri(String getUri) {
    this.getUri = getUri;
    return this;
  }

  /**
   * .
   *
   * @return getUri
   */
  @ApiModelProperty(value = "")
  public String getGetUri() {
    return getUri;
  }

  /** setGetUri. */
  public void setGetUri(String getUri) {
    this.getUri = getUri;
  }

  /**
   * lastScheduledExecutionDate.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem lastScheduledExecutionDate(String lastScheduledExecutionDate) {
    this.lastScheduledExecutionDate = lastScheduledExecutionDate;
    return this;
  }

  /**
   * .
   *
   * @return lastScheduledExecutionDate
   */
  @ApiModelProperty(value = "")
  public String getLastScheduledExecutionDate() {
    return lastScheduledExecutionDate;
  }

  /** setLastScheduledExecutionDate. */
  public void setLastScheduledExecutionDate(String lastScheduledExecutionDate) {
    this.lastScheduledExecutionDate = lastScheduledExecutionDate;
  }

  /**
   * lastScheduledExecutionSuccessDate.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem lastScheduledExecutionSuccessDate(
      String lastScheduledExecutionSuccessDate) {
    this.lastScheduledExecutionSuccessDate = lastScheduledExecutionSuccessDate;
    return this;
  }

  /**
   * .
   *
   * @return lastScheduledExecutionSuccessDate
   */
  @ApiModelProperty(value = "")
  public String getLastScheduledExecutionSuccessDate() {
    return lastScheduledExecutionSuccessDate;
  }

  /** setLastScheduledExecutionSuccessDate. */
  public void setLastScheduledExecutionSuccessDate(String lastScheduledExecutionSuccessDate) {
    this.lastScheduledExecutionSuccessDate = lastScheduledExecutionSuccessDate;
  }

  /**
   * reportCustomizedId.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem reportCustomizedId(String reportCustomizedId) {
    this.reportCustomizedId = reportCustomizedId;
    return this;
  }

  /**
   * .
   *
   * @return reportCustomizedId
   */
  @ApiModelProperty(value = "")
  public String getReportCustomizedId() {
    return reportCustomizedId;
  }

  /** setReportCustomizedId. */
  public void setReportCustomizedId(String reportCustomizedId) {
    this.reportCustomizedId = reportCustomizedId;
  }

  /**
   * reportDescription.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

  /**
   * .
   *
   * @return reportDescription
   */
  @ApiModelProperty(value = "")
  public String getReportDescription() {
    return reportDescription;
  }

  /** setReportDescription. */
  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }

  /**
   * reportId.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * .
   *
   * @return reportId
   */
  @ApiModelProperty(value = "")
  public String getReportId() {
    return reportId;
  }

  /** setReportId. */
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   * reportName.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * .
   *
   * @return reportName
   */
  @ApiModelProperty(value = "")
  public String getReportName() {
    return reportName;
  }

  /** setReportName. */
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * reportType.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * .
   *
   * @return reportType
   */
  @ApiModelProperty(value = "")
  public String getReportType() {
    return reportType;
  }

  /** setReportType. */
  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  /**
   * runUri.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem runUri(String runUri) {
    this.runUri = runUri;
    return this;
  }

  /**
   * .
   *
   * @return runUri
   */
  @ApiModelProperty(value = "")
  public String getRunUri() {
    return runUri;
  }

  /** setRunUri. */
  public void setRunUri(String runUri) {
    this.runUri = runUri;
  }

  /**
   * saveUri.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem saveUri(String saveUri) {
    this.saveUri = saveUri;
    return this;
  }

  /**
   * .
   *
   * @return saveUri
   */
  @ApiModelProperty(value = "")
  public String getSaveUri() {
    return saveUri;
  }

  /** setSaveUri. */
  public void setSaveUri(String saveUri) {
    this.saveUri = saveUri;
  }

  /**
   * scheduleCreateDate.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem scheduleCreateDate(String scheduleCreateDate) {
    this.scheduleCreateDate = scheduleCreateDate;
    return this;
  }

  /**
   * .
   *
   * @return scheduleCreateDate
   */
  @ApiModelProperty(value = "")
  public String getScheduleCreateDate() {
    return scheduleCreateDate;
  }

  /** setScheduleCreateDate. */
  public void setScheduleCreateDate(String scheduleCreateDate) {
    this.scheduleCreateDate = scheduleCreateDate;
  }

  /**
   * scheduleEndDate.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem scheduleEndDate(String scheduleEndDate) {
    this.scheduleEndDate = scheduleEndDate;
    return this;
  }

  /**
   * .
   *
   * @return scheduleEndDate
   */
  @ApiModelProperty(value = "")
  public String getScheduleEndDate() {
    return scheduleEndDate;
  }

  /** setScheduleEndDate. */
  public void setScheduleEndDate(String scheduleEndDate) {
    this.scheduleEndDate = scheduleEndDate;
  }

  /**
   * scheduleId.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * .
   *
   * @return scheduleId
   */
  @ApiModelProperty(value = "")
  public String getScheduleId() {
    return scheduleId;
  }

  /** setScheduleId. */
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   * scheduleRenewDurationDays.
   *
   * @return ReportInProductListItem
   */
  public ReportInProductListItem scheduleRenewDurationDays(String scheduleRenewDurationDays) {
    this.scheduleRenewDurationDays = scheduleRenewDurationDays;
    return this;
  }

  /**
   * .
   *
   * @return scheduleRenewDurationDays
   */
  @ApiModelProperty(value = "")
  public String getScheduleRenewDurationDays() {
    return scheduleRenewDurationDays;
  }

  /** setScheduleRenewDurationDays. */
  public void setScheduleRenewDurationDays(String scheduleRenewDurationDays) {
    this.scheduleRenewDurationDays = scheduleRenewDurationDays;
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
    ReportInProductListItem reportInProductListItem = (ReportInProductListItem) o;
    return Objects.equals(this.getUri, reportInProductListItem.getUri)
        && Objects.equals(
            this.lastScheduledExecutionDate, reportInProductListItem.lastScheduledExecutionDate)
        && Objects.equals(
            this.lastScheduledExecutionSuccessDate,
            reportInProductListItem.lastScheduledExecutionSuccessDate)
        && Objects.equals(this.reportCustomizedId, reportInProductListItem.reportCustomizedId)
        && Objects.equals(this.reportDescription, reportInProductListItem.reportDescription)
        && Objects.equals(this.reportId, reportInProductListItem.reportId)
        && Objects.equals(this.reportName, reportInProductListItem.reportName)
        && Objects.equals(this.reportType, reportInProductListItem.reportType)
        && Objects.equals(this.runUri, reportInProductListItem.runUri)
        && Objects.equals(this.saveUri, reportInProductListItem.saveUri)
        && Objects.equals(this.scheduleCreateDate, reportInProductListItem.scheduleCreateDate)
        && Objects.equals(this.scheduleEndDate, reportInProductListItem.scheduleEndDate)
        && Objects.equals(this.scheduleId, reportInProductListItem.scheduleId)
        && Objects.equals(
            this.scheduleRenewDurationDays, reportInProductListItem.scheduleRenewDurationDays);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        getUri,
        lastScheduledExecutionDate,
        lastScheduledExecutionSuccessDate,
        reportCustomizedId,
        reportDescription,
        reportId,
        reportName,
        reportType,
        runUri,
        saveUri,
        scheduleCreateDate,
        scheduleEndDate,
        scheduleId,
        scheduleRenewDurationDays);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductListItem {\n");

    sb.append("    getUri: ").append(toIndentedString(getUri)).append("\n");
    sb.append("    lastScheduledExecutionDate: ")
        .append(toIndentedString(lastScheduledExecutionDate))
        .append("\n");
    sb.append("    lastScheduledExecutionSuccessDate: ")
        .append(toIndentedString(lastScheduledExecutionSuccessDate))
        .append("\n");
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
    sb.append("    scheduleRenewDurationDays: ")
        .append(toIndentedString(scheduleRenewDurationDays))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
