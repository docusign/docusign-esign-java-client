package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ReportInProductRunRequest. */
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

  /**
   * authenticationSuccessFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest authenticationSuccessFilter(String authenticationSuccessFilter) {
    this.authenticationSuccessFilter = authenticationSuccessFilter;
    return this;
  }

  /**
   * .
   *
   * @return authenticationSuccessFilter
   */
  @Schema(description = "")
  public String getAuthenticationSuccessFilter() {
    return authenticationSuccessFilter;
  }

  /** setAuthenticationSuccessFilter. */
  public void setAuthenticationSuccessFilter(String authenticationSuccessFilter) {
    this.authenticationSuccessFilter = authenticationSuccessFilter;
  }

  /**
   * customFieldFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest customFieldFilter(String customFieldFilter) {
    this.customFieldFilter = customFieldFilter;
    return this;
  }

  /**
   * .
   *
   * @return customFieldFilter
   */
  @Schema(description = "")
  public String getCustomFieldFilter() {
    return customFieldFilter;
  }

  /** setCustomFieldFilter. */
  public void setCustomFieldFilter(String customFieldFilter) {
    this.customFieldFilter = customFieldFilter;
  }

  /**
   * dateRangeCustomFromDate.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest dateRangeCustomFromDate(String dateRangeCustomFromDate) {
    this.dateRangeCustomFromDate = dateRangeCustomFromDate;
    return this;
  }

  /**
   * .
   *
   * @return dateRangeCustomFromDate
   */
  @Schema(description = "")
  public String getDateRangeCustomFromDate() {
    return dateRangeCustomFromDate;
  }

  /** setDateRangeCustomFromDate. */
  public void setDateRangeCustomFromDate(String dateRangeCustomFromDate) {
    this.dateRangeCustomFromDate = dateRangeCustomFromDate;
  }

  /**
   * dateRangeCustomToDate.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest dateRangeCustomToDate(String dateRangeCustomToDate) {
    this.dateRangeCustomToDate = dateRangeCustomToDate;
    return this;
  }

  /**
   * .
   *
   * @return dateRangeCustomToDate
   */
  @Schema(description = "")
  public String getDateRangeCustomToDate() {
    return dateRangeCustomToDate;
  }

  /** setDateRangeCustomToDate. */
  public void setDateRangeCustomToDate(String dateRangeCustomToDate) {
    this.dateRangeCustomToDate = dateRangeCustomToDate;
  }

  /**
   * dateRangeFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest dateRangeFilter(String dateRangeFilter) {
    this.dateRangeFilter = dateRangeFilter;
    return this;
  }

  /**
   * .
   *
   * @return dateRangeFilter
   */
  @Schema(description = "")
  public String getDateRangeFilter() {
    return dateRangeFilter;
  }

  /** setDateRangeFilter. */
  public void setDateRangeFilter(String dateRangeFilter) {
    this.dateRangeFilter = dateRangeFilter;
  }

  /**
   * envelopeDateTypeFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest envelopeDateTypeFilter(String envelopeDateTypeFilter) {
    this.envelopeDateTypeFilter = envelopeDateTypeFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeDateTypeFilter
   */
  @Schema(description = "")
  public String getEnvelopeDateTypeFilter() {
    return envelopeDateTypeFilter;
  }

  /** setEnvelopeDateTypeFilter. */
  public void setEnvelopeDateTypeFilter(String envelopeDateTypeFilter) {
    this.envelopeDateTypeFilter = envelopeDateTypeFilter;
  }

  /**
   * envelopeRecipientNameContainsFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest envelopeRecipientNameContainsFilter(
      String envelopeRecipientNameContainsFilter) {
    this.envelopeRecipientNameContainsFilter = envelopeRecipientNameContainsFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeRecipientNameContainsFilter
   */
  @Schema(description = "")
  public String getEnvelopeRecipientNameContainsFilter() {
    return envelopeRecipientNameContainsFilter;
  }

  /** setEnvelopeRecipientNameContainsFilter. */
  public void setEnvelopeRecipientNameContainsFilter(String envelopeRecipientNameContainsFilter) {
    this.envelopeRecipientNameContainsFilter = envelopeRecipientNameContainsFilter;
  }

  /**
   * envelopeStatusFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest envelopeStatusFilter(String envelopeStatusFilter) {
    this.envelopeStatusFilter = envelopeStatusFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeStatusFilter
   */
  @Schema(description = "")
  public String getEnvelopeStatusFilter() {
    return envelopeStatusFilter;
  }

  /** setEnvelopeStatusFilter. */
  public void setEnvelopeStatusFilter(String envelopeStatusFilter) {
    this.envelopeStatusFilter = envelopeStatusFilter;
  }

  /**
   * envelopeSubjectContainsFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest envelopeSubjectContainsFilter(
      String envelopeSubjectContainsFilter) {
    this.envelopeSubjectContainsFilter = envelopeSubjectContainsFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeSubjectContainsFilter
   */
  @Schema(description = "")
  public String getEnvelopeSubjectContainsFilter() {
    return envelopeSubjectContainsFilter;
  }

  /** setEnvelopeSubjectContainsFilter. */
  public void setEnvelopeSubjectContainsFilter(String envelopeSubjectContainsFilter) {
    this.envelopeSubjectContainsFilter = envelopeSubjectContainsFilter;
  }

  /**
   * fields.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest fields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * addFieldsItem.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest addFieldsItem(ReportInProductField fieldsItem) {
    if (this.fields == null) {
      this.fields = new java.util.ArrayList<ReportInProductField>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * .
   *
   * @return fields
   */
  @Schema(description = "")
  public java.util.List<ReportInProductField> getFields() {
    return fields;
  }

  /** setFields. */
  public void setFields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
  }

  /**
   * forDownload.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest forDownload(String forDownload) {
    this.forDownload = forDownload;
    return this;
  }

  /**
   * .
   *
   * @return forDownload
   */
  @Schema(description = "")
  public String getForDownload() {
    return forDownload;
  }

  /** setForDownload. */
  public void setForDownload(String forDownload) {
    this.forDownload = forDownload;
  }

  /**
   * isDashboard.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest isDashboard(String isDashboard) {
    this.isDashboard = isDashboard;
    return this;
  }

  /**
   * .
   *
   * @return isDashboard
   */
  @Schema(description = "")
  public String getIsDashboard() {
    return isDashboard;
  }

  /** setIsDashboard. */
  public void setIsDashboard(String isDashboard) {
    this.isDashboard = isDashboard;
  }

  /**
   * periodLengthFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest periodLengthFilter(String periodLengthFilter) {
    this.periodLengthFilter = periodLengthFilter;
    return this;
  }

  /**
   * .
   *
   * @return periodLengthFilter
   */
  @Schema(description = "")
  public String getPeriodLengthFilter() {
    return periodLengthFilter;
  }

  /** setPeriodLengthFilter. */
  public void setPeriodLengthFilter(String periodLengthFilter) {
    this.periodLengthFilter = periodLengthFilter;
  }

  /**
   * reportCustomizedId.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest reportCustomizedId(String reportCustomizedId) {
    this.reportCustomizedId = reportCustomizedId;
    return this;
  }

  /**
   * .
   *
   * @return reportCustomizedId
   */
  @Schema(description = "")
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
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

  /**
   * .
   *
   * @return reportDescription
   */
  @Schema(description = "")
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
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * .
   *
   * @return reportId
   */
  @Schema(description = "")
  public String getReportId() {
    return reportId;
  }

  /** setReportId. */
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   * reportInvocationType.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest reportInvocationType(String reportInvocationType) {
    this.reportInvocationType = reportInvocationType;
    return this;
  }

  /**
   * .
   *
   * @return reportInvocationType
   */
  @Schema(description = "")
  public String getReportInvocationType() {
    return reportInvocationType;
  }

  /** setReportInvocationType. */
  public void setReportInvocationType(String reportInvocationType) {
    this.reportInvocationType = reportInvocationType;
  }

  /**
   * reportName.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * .
   *
   * @return reportName
   */
  @Schema(description = "")
  public String getReportName() {
    return reportName;
  }

  /** setReportName. */
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * sentByFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest sentByFilter(String sentByFilter) {
    this.sentByFilter = sentByFilter;
    return this;
  }

  /**
   * .
   *
   * @return sentByFilter
   */
  @Schema(description = "")
  public String getSentByFilter() {
    return sentByFilter;
  }

  /** setSentByFilter. */
  public void setSentByFilter(String sentByFilter) {
    this.sentByFilter = sentByFilter;
  }

  /**
   * sentByIds.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest sentByIds(String sentByIds) {
    this.sentByIds = sentByIds;
    return this;
  }

  /**
   * .
   *
   * @return sentByIds
   */
  @Schema(description = "")
  public String getSentByIds() {
    return sentByIds;
  }

  /** setSentByIds. */
  public void setSentByIds(String sentByIds) {
    this.sentByIds = sentByIds;
  }

  /**
   * sortDirection.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest sortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

  /**
   * .
   *
   * @return sortDirection
   */
  @Schema(description = "")
  public String getSortDirection() {
    return sortDirection;
  }

  /** setSortDirection. */
  public void setSortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
  }

  /**
   * sortField.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * .
   *
   * @return sortField
   */
  @Schema(description = "")
  public String getSortField() {
    return sortField;
  }

  /** setSortField. */
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  /**
   * startPosition.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   *
   * @return startPosition
   */
  @Schema(description = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /** setStartPosition. */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * verificationStatusFilter.
   *
   * @return ReportInProductRunRequest
   */
  public ReportInProductRunRequest verificationStatusFilter(String verificationStatusFilter) {
    this.verificationStatusFilter = verificationStatusFilter;
    return this;
  }

  /**
   * .
   *
   * @return verificationStatusFilter
   */
  @Schema(description = "")
  public String getVerificationStatusFilter() {
    return verificationStatusFilter;
  }

  /** setVerificationStatusFilter. */
  public void setVerificationStatusFilter(String verificationStatusFilter) {
    this.verificationStatusFilter = verificationStatusFilter;
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
    ReportInProductRunRequest reportInProductRunRequest = (ReportInProductRunRequest) o;
    return Objects.equals(
        this.authenticationSuccessFilter, reportInProductRunRequest.authenticationSuccessFilter)
        && Objects.equals(this.customFieldFilter, reportInProductRunRequest.customFieldFilter)
        && Objects.equals(
            this.dateRangeCustomFromDate, reportInProductRunRequest.dateRangeCustomFromDate)
        && Objects.equals(
            this.dateRangeCustomToDate, reportInProductRunRequest.dateRangeCustomToDate)
        && Objects.equals(this.dateRangeFilter, reportInProductRunRequest.dateRangeFilter)
        && Objects.equals(
            this.envelopeDateTypeFilter, reportInProductRunRequest.envelopeDateTypeFilter)
        && Objects.equals(
            this.envelopeRecipientNameContainsFilter,
            reportInProductRunRequest.envelopeRecipientNameContainsFilter)
        && Objects.equals(this.envelopeStatusFilter, reportInProductRunRequest.envelopeStatusFilter)
        && Objects.equals(
            this.envelopeSubjectContainsFilter,
            reportInProductRunRequest.envelopeSubjectContainsFilter)
        && Objects.equals(this.fields, reportInProductRunRequest.fields)
        && Objects.equals(this.forDownload, reportInProductRunRequest.forDownload)
        && Objects.equals(this.isDashboard, reportInProductRunRequest.isDashboard)
        && Objects.equals(this.periodLengthFilter, reportInProductRunRequest.periodLengthFilter)
        && Objects.equals(this.reportCustomizedId, reportInProductRunRequest.reportCustomizedId)
        && Objects.equals(this.reportDescription, reportInProductRunRequest.reportDescription)
        && Objects.equals(this.reportId, reportInProductRunRequest.reportId)
        && Objects.equals(this.reportInvocationType, reportInProductRunRequest.reportInvocationType)
        && Objects.equals(this.reportName, reportInProductRunRequest.reportName)
        && Objects.equals(this.sentByFilter, reportInProductRunRequest.sentByFilter)
        && Objects.equals(this.sentByIds, reportInProductRunRequest.sentByIds)
        && Objects.equals(this.sortDirection, reportInProductRunRequest.sortDirection)
        && Objects.equals(this.sortField, reportInProductRunRequest.sortField)
        && Objects.equals(this.startPosition, reportInProductRunRequest.startPosition)
        && Objects.equals(
            this.verificationStatusFilter, reportInProductRunRequest.verificationStatusFilter);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        authenticationSuccessFilter,
        customFieldFilter,
        dateRangeCustomFromDate,
        dateRangeCustomToDate,
        dateRangeFilter,
        envelopeDateTypeFilter,
        envelopeRecipientNameContainsFilter,
        envelopeStatusFilter,
        envelopeSubjectContainsFilter,
        fields,
        forDownload,
        isDashboard,
        periodLengthFilter,
        reportCustomizedId,
        reportDescription,
        reportId,
        reportInvocationType,
        reportName,
        sentByFilter,
        sentByIds,
        sortDirection,
        sortField,
        startPosition,
        verificationStatusFilter);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductRunRequest {\n");

    sb.append("    authenticationSuccessFilter: ")
        .append(toIndentedString(authenticationSuccessFilter))
        .append("\n");
    sb.append("    customFieldFilter: ").append(toIndentedString(customFieldFilter)).append("\n");
    sb.append("    dateRangeCustomFromDate: ")
        .append(toIndentedString(dateRangeCustomFromDate))
        .append("\n");
    sb.append("    dateRangeCustomToDate: ")
        .append(toIndentedString(dateRangeCustomToDate))
        .append("\n");
    sb.append("    dateRangeFilter: ").append(toIndentedString(dateRangeFilter)).append("\n");
    sb.append("    envelopeDateTypeFilter: ")
        .append(toIndentedString(envelopeDateTypeFilter))
        .append("\n");
    sb.append("    envelopeRecipientNameContainsFilter: ")
        .append(toIndentedString(envelopeRecipientNameContainsFilter))
        .append("\n");
    sb.append("    envelopeStatusFilter: ")
        .append(toIndentedString(envelopeStatusFilter))
        .append("\n");
    sb.append("    envelopeSubjectContainsFilter: ")
        .append(toIndentedString(envelopeSubjectContainsFilter))
        .append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    forDownload: ").append(toIndentedString(forDownload)).append("\n");
    sb.append("    isDashboard: ").append(toIndentedString(isDashboard)).append("\n");
    sb.append("    periodLengthFilter: ").append(toIndentedString(periodLengthFilter)).append("\n");
    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportInvocationType: ")
        .append(toIndentedString(reportInvocationType))
        .append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    sentByFilter: ").append(toIndentedString(sentByFilter)).append("\n");
    sb.append("    sentByIds: ").append(toIndentedString(sentByIds)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    verificationStatusFilter: ")
        .append(toIndentedString(verificationStatusFilter))
        .append("\n");
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
