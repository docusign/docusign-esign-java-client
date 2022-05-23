package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReportInProductSaveResponse. */
public class ReportInProductSaveResponse {
  @JsonProperty("reportCustomizedId")
  private String reportCustomizedId = null;

  /**
   * reportCustomizedId.
   *
   * @return ReportInProductSaveResponse
   */
  public ReportInProductSaveResponse reportCustomizedId(String reportCustomizedId) {
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
    ReportInProductSaveResponse reportInProductSaveResponse = (ReportInProductSaveResponse) o;
    return Objects.equals(this.reportCustomizedId, reportInProductSaveResponse.reportCustomizedId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(reportCustomizedId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductSaveResponse {\n");

    sb.append("    reportCustomizedId: ").append(toIndentedString(reportCustomizedId)).append("\n");
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
