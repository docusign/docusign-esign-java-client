package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BulkSendBatchError. */
public class BulkSendBatchError {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("errorDetail")
  private String errorDetail = null;

  /**
   * error.
   *
   * @return BulkSendBatchError
   */
  public BulkSendBatchError error(String error) {
    this.error = error;
    return this;
  }

  /**
   * .
   *
   * @return error
   */
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  /** setError. */
  public void setError(String error) {
    this.error = error;
  }

  /**
   * errorDetail.
   *
   * @return BulkSendBatchError
   */
  public BulkSendBatchError errorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  /**
   * .
   *
   * @return errorDetail
   */
  @ApiModelProperty(value = "")
  public String getErrorDetail() {
    return errorDetail;
  }

  /** setErrorDetail. */
  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
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
    BulkSendBatchError bulkSendBatchError = (BulkSendBatchError) o;
    return Objects.equals(this.error, bulkSendBatchError.error)
        && Objects.equals(this.errorDetail, bulkSendBatchError.errorDetail);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(error, errorDetail);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchError {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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
