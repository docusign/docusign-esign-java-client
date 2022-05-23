package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BulkProcessingListSummaries. */
public class BulkProcessingListSummaries {
  @JsonProperty("bulkListSummaries")
  private java.util.List<BulkProcessingListSummary> bulkListSummaries = null;

  /**
   * bulkListSummaries.
   *
   * @return BulkProcessingListSummaries
   */
  public BulkProcessingListSummaries bulkListSummaries(
      java.util.List<BulkProcessingListSummary> bulkListSummaries) {
    this.bulkListSummaries = bulkListSummaries;
    return this;
  }

  /**
   * addBulkListSummariesItem.
   *
   * @return BulkProcessingListSummaries
   */
  public BulkProcessingListSummaries addBulkListSummariesItem(
      BulkProcessingListSummary bulkListSummariesItem) {
    if (this.bulkListSummaries == null) {
      this.bulkListSummaries = new java.util.ArrayList<>();
    }
    this.bulkListSummaries.add(bulkListSummariesItem);
    return this;
  }

  /**
   * .
   *
   * @return bulkListSummaries
   */
  @ApiModelProperty(value = "")
  public java.util.List<BulkProcessingListSummary> getBulkListSummaries() {
    return bulkListSummaries;
  }

  /** setBulkListSummaries. */
  public void setBulkListSummaries(java.util.List<BulkProcessingListSummary> bulkListSummaries) {
    this.bulkListSummaries = bulkListSummaries;
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
    BulkProcessingListSummaries bulkProcessingListSummaries = (BulkProcessingListSummaries) o;
    return Objects.equals(this.bulkListSummaries, bulkProcessingListSummaries.bulkListSummaries);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(bulkListSummaries);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProcessingListSummaries {\n");

    sb.append("    bulkListSummaries: ").append(toIndentedString(bulkListSummaries)).append("\n");
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
