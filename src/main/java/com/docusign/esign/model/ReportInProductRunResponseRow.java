package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReportInProductRunResponseRow. */
public class ReportInProductRunResponseRow {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("fields")
  private ReportInProductRunResponseRowFields fields = null;

  /**
   * envelopeId.
   *
   * @return ReportInProductRunResponseRow
   */
  public ReportInProductRunResponseRow envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   *
   * @return envelopeId
   */
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /** setEnvelopeId. */
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  /**
   * fields.
   *
   * @return ReportInProductRunResponseRow
   */
  public ReportInProductRunResponseRow fields(ReportInProductRunResponseRowFields fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields.
   *
   * @return fields
   */
  @ApiModelProperty(value = "")
  public ReportInProductRunResponseRowFields getFields() {
    return fields;
  }

  /** setFields. */
  public void setFields(ReportInProductRunResponseRowFields fields) {
    this.fields = fields;
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
    ReportInProductRunResponseRow reportInProductRunResponseRow = (ReportInProductRunResponseRow) o;
    return Objects.equals(this.envelopeId, reportInProductRunResponseRow.envelopeId)
        && Objects.equals(this.fields, reportInProductRunResponseRow.fields);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, fields);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductRunResponseRow {\n");

    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
