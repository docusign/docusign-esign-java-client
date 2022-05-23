package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BulkSendBatchRequest. */
public class BulkSendBatchRequest {
  @JsonProperty("batchName")
  private String batchName = null;

  /**
   * batchName.
   *
   * @return BulkSendBatchRequest
   */
  public BulkSendBatchRequest batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * .
   *
   * @return batchName
   */
  @ApiModelProperty(value = "")
  public String getBatchName() {
    return batchName;
  }

  /** setBatchName. */
  public void setBatchName(String batchName) {
    this.batchName = batchName;
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
    BulkSendBatchRequest bulkSendBatchRequest = (BulkSendBatchRequest) o;
    return Objects.equals(this.batchName, bulkSendBatchRequest.batchName);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(batchName);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchRequest {\n");

    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
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
