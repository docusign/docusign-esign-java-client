package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReportInProductCsvRunRequest. */
public class ReportInProductCsvRunRequest {
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

  @JsonProperty("verificationStatusFilter")
  private String verificationStatusFilter = null;

  /**
   * authenticationSuccessFilter.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest authenticationSuccessFilter(
      String authenticationSuccessFilter) {
    this.authenticationSuccessFilter = authenticationSuccessFilter;
    return this;
  }

  /**
   * .
   *
   * @return authenticationSuccessFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest customFieldFilter(String customFieldFilter) {
    this.customFieldFilter = customFieldFilter;
    return this;
  }

  /**
   * .
   *
   * @return customFieldFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest dateRangeCustomFromDate(String dateRangeCustomFromDate) {
    this.dateRangeCustomFromDate = dateRangeCustomFromDate;
    return this;
  }

  /**
   * .
   *
   * @return dateRangeCustomFromDate
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest dateRangeCustomToDate(String dateRangeCustomToDate) {
    this.dateRangeCustomToDate = dateRangeCustomToDate;
    return this;
  }

  /**
   * .
   *
   * @return dateRangeCustomToDate
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest dateRangeFilter(String dateRangeFilter) {
    this.dateRangeFilter = dateRangeFilter;
    return this;
  }

  /**
   * .
   *
   * @return dateRangeFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest envelopeDateTypeFilter(String envelopeDateTypeFilter) {
    this.envelopeDateTypeFilter = envelopeDateTypeFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeDateTypeFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest envelopeRecipientNameContainsFilter(
      String envelopeRecipientNameContainsFilter) {
    this.envelopeRecipientNameContainsFilter = envelopeRecipientNameContainsFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeRecipientNameContainsFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest envelopeStatusFilter(String envelopeStatusFilter) {
    this.envelopeStatusFilter = envelopeStatusFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeStatusFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest envelopeSubjectContainsFilter(
      String envelopeSubjectContainsFilter) {
    this.envelopeSubjectContainsFilter = envelopeSubjectContainsFilter;
    return this;
  }

  /**
   * .
   *
   * @return envelopeSubjectContainsFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest fields(java.util.List<ReportInProductField> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * addFieldsItem.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest addFieldsItem(ReportInProductField fieldsItem) {
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
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest forDownload(String forDownload) {
    this.forDownload = forDownload;
    return this;
  }

  /**
   * .
   *
   * @return forDownload
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest isDashboard(String isDashboard) {
    this.isDashboard = isDashboard;
    return this;
  }

  /**
   * .
   *
   * @return isDashboard
   */
  @ApiModelProperty(value = "")
  public String getIsDashboard() {
    return isDashboard;
  }

  /** setIsDashboard. */
  public void setIsDashboard(String isDashboard) {
    this.isDashboard = isDashboard;
  }

  /**
   * newLine.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest newLine(String newLine) {
    this.newLine = newLine;
    return this;
  }

  /**
   * .
   *
   * @return newLine
   */
  @ApiModelProperty(value = "")
  public String getNewLine() {
    return newLine;
  }

  /** setNewLine. */
  public void setNewLine(String newLine) {
    this.newLine = newLine;
  }

  /**
   * overrideTimezoneKey.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest overrideTimezoneKey(String overrideTimezoneKey) {
    this.overrideTimezoneKey = overrideTimezoneKey;
    return this;
  }

  /**
   * .
   *
   * @return overrideTimezoneKey
   */
  @ApiModelProperty(value = "")
  public String getOverrideTimezoneKey() {
    return overrideTimezoneKey;
  }

  /** setOverrideTimezoneKey. */
  public void setOverrideTimezoneKey(String overrideTimezoneKey) {
    this.overrideTimezoneKey = overrideTimezoneKey;
  }

  /**
   * periodLengthFilter.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest periodLengthFilter(String periodLengthFilter) {
    this.periodLengthFilter = periodLengthFilter;
    return this;
  }

  /**
   * .
   *
   * @return periodLengthFilter
   */
  @ApiModelProperty(value = "")
  public String getPeriodLengthFilter() {
    return periodLengthFilter;
  }

  /** setPeriodLengthFilter. */
  public void setPeriodLengthFilter(String periodLengthFilter) {
    this.periodLengthFilter = periodLengthFilter;
  }

  /**
   * quote.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest quote(String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * .
   *
   * @return quote
   */
  @ApiModelProperty(value = "")
  public String getQuote() {
    return quote;
  }

  /** setQuote. */
  public void setQuote(String quote) {
    this.quote = quote;
  }

  /**
   * reportCustomizedId.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest reportCustomizedId(String reportCustomizedId) {
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest reportDescription(String reportDescription) {
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest reportId(String reportId) {
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
   * reportInvocationType.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest reportInvocationType(String reportInvocationType) {
    this.reportInvocationType = reportInvocationType;
    return this;
  }

  /**
   * .
   *
   * @return reportInvocationType
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest reportName(String reportName) {
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
   * sentByFilter.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest sentByFilter(String sentByFilter) {
    this.sentByFilter = sentByFilter;
    return this;
  }

  /**
   * .
   *
   * @return sentByFilter
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest sentByIds(String sentByIds) {
    this.sentByIds = sentByIds;
    return this;
  }

  /**
   * .
   *
   * @return sentByIds
   */
  @ApiModelProperty(value = "")
  public String getSentByIds() {
    return sentByIds;
  }

  /** setSentByIds. */
  public void setSentByIds(String sentByIds) {
    this.sentByIds = sentByIds;
  }

  /**
   * separator.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest separator(String separator) {
    this.separator = separator;
    return this;
  }

  /**
   * .
   *
   * @return separator
   */
  @ApiModelProperty(value = "")
  public String getSeparator() {
    return separator;
  }

  /** setSeparator. */
  public void setSeparator(String separator) {
    this.separator = separator;
  }

  /**
   * sortDirection.
   *
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest sortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

  /**
   * .
   *
   * @return sortDirection
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * .
   *
   * @return sortField
   */
  @ApiModelProperty(value = "")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   *
   * @return startPosition
   */
  @ApiModelProperty(value = "Starting position of the current result set.")
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
   * @return ReportInProductCsvRunRequest
   */
  public ReportInProductCsvRunRequest verificationStatusFilter(String verificationStatusFilter) {
    this.verificationStatusFilter = verificationStatusFilter;
    return this;
  }

  /**
   * .
   *
   * @return verificationStatusFilter
   */
  @ApiModelProperty(value = "")
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
    ReportInProductCsvRunRequest reportInProductCsvRunRequest = (ReportInProductCsvRunRequest) o;
    return Objects.equals(
            this.authenticationSuccessFilter,
            reportInProductCsvRunRequest.authenticationSuccessFilter)
        && Objects.equals(this.customFieldFilter, reportInProductCsvRunRequest.customFieldFilter)
        && Objects.equals(
            this.dateRangeCustomFromDate, reportInProductCsvRunRequest.dateRangeCustomFromDate)
        && Objects.equals(
            this.dateRangeCustomToDate, reportInProductCsvRunRequest.dateRangeCustomToDate)
        && Objects.equals(this.dateRangeFilter, reportInProductCsvRunRequest.dateRangeFilter)
        && Objects.equals(
            this.envelopeDateTypeFilter, reportInProductCsvRunRequest.envelopeDateTypeFilter)
        && Objects.equals(
            this.envelopeRecipientNameContainsFilter,
            reportInProductCsvRunRequest.envelopeRecipientNameContainsFilter)
        && Objects.equals(
            this.envelopeStatusFilter, reportInProductCsvRunRequest.envelopeStatusFilter)
        && Objects.equals(
            this.envelopeSubjectContainsFilter,
            reportInProductCsvRunRequest.envelopeSubjectContainsFilter)
        && Objects.equals(this.fields, reportInProductCsvRunRequest.fields)
        && Objects.equals(this.forDownload, reportInProductCsvRunRequest.forDownload)
        && Objects.equals(this.isDashboard, reportInProductCsvRunRequest.isDashboard)
        && Objects.equals(this.newLine, reportInProductCsvRunRequest.newLine)
        && Objects.equals(
            this.overrideTimezoneKey, reportInProductCsvRunRequest.overrideTimezoneKey)
        && Objects.equals(this.periodLengthFilter, reportInProductCsvRunRequest.periodLengthFilter)
        && Objects.equals(this.quote, reportInProductCsvRunRequest.quote)
        && Objects.equals(this.reportCustomizedId, reportInProductCsvRunRequest.reportCustomizedId)
        && Objects.equals(this.reportDescription, reportInProductCsvRunRequest.reportDescription)
        && Objects.equals(this.reportId, reportInProductCsvRunRequest.reportId)
        && Objects.equals(
            this.reportInvocationType, reportInProductCsvRunRequest.reportInvocationType)
        && Objects.equals(this.reportName, reportInProductCsvRunRequest.reportName)
        && Objects.equals(this.sentByFilter, reportInProductCsvRunRequest.sentByFilter)
        && Objects.equals(this.sentByIds, reportInProductCsvRunRequest.sentByIds)
        && Objects.equals(this.separator, reportInProductCsvRunRequest.separator)
        && Objects.equals(this.sortDirection, reportInProductCsvRunRequest.sortDirection)
        && Objects.equals(this.sortField, reportInProductCsvRunRequest.sortField)
        && Objects.equals(this.startPosition, reportInProductCsvRunRequest.startPosition)
        && Objects.equals(
            this.verificationStatusFilter, reportInProductCsvRunRequest.verificationStatusFilter);
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
        newLine,
        overrideTimezoneKey,
        periodLengthFilter,
        quote,
        reportCustomizedId,
        reportDescription,
        reportId,
        reportInvocationType,
        reportName,
        sentByFilter,
        sentByIds,
        separator,
        sortDirection,
        sortField,
        startPosition,
        verificationStatusFilter);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductCsvRunRequest {\n");

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
    sb.append("    newLine: ").append(toIndentedString(newLine)).append("\n");
    sb.append("    overrideTimezoneKey: ")
        .append(toIndentedString(overrideTimezoneKey))
        .append("\n");
    sb.append("    periodLengthFilter: ").append(toIndentedString(periodLengthFilter)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportInvocationType: ")
        .append(toIndentedString(reportInvocationType))
        .append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    sentByFilter: ").append(toIndentedString(sentByFilter)).append("\n");
    sb.append("    sentByIds: ").append(toIndentedString(sentByIds)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
