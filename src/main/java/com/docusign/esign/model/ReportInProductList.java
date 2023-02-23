package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ReportInProductList. */
public class ReportInProductList {
  @JsonProperty("reports")
  private java.util.List<ReportInProductListItem> reports = null;

  /**
   * reports.
   *
   * @return ReportInProductList
   */
  public ReportInProductList reports(java.util.List<ReportInProductListItem> reports) {
    this.reports = reports;
    return this;
  }

  /**
   * addReportsItem.
   *
   * @return ReportInProductList
   */
  public ReportInProductList addReportsItem(ReportInProductListItem reportsItem) {
    if (this.reports == null) {
      this.reports = new java.util.ArrayList<ReportInProductListItem>();
    }
    this.reports.add(reportsItem);
    return this;
  }

  /**
   * .
   *
   * @return reports
   */
  @Schema(description = "")
  public java.util.List<ReportInProductListItem> getReports() {
    return reports;
  }

  /** setReports. */
  public void setReports(java.util.List<ReportInProductListItem> reports) {
    this.reports = reports;
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
    ReportInProductList reportInProductList = (ReportInProductList) o;
    return Objects.equals(this.reports, reportInProductList.reports);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductList {\n");

    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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
