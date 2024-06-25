package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingListSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * This complex type contains summaries that provide basic information about the bulk send lists that belong to the current user..
 *
 */
@Schema(description = "This complex type contains summaries that provide basic information about the bulk send lists that belong to the current user.")

public class BulkSendingListSummaries implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bulkListSummaries")
  private java.util.List<BulkSendingListSummary> bulkListSummaries = null;


  /**
   * bulkListSummaries.
   *
   * @return BulkSendingListSummaries
   **/
  public BulkSendingListSummaries bulkListSummaries(java.util.List<BulkSendingListSummary> bulkListSummaries) {
    this.bulkListSummaries = bulkListSummaries;
    return this;
  }
  
  /**
   * addBulkListSummariesItem.
   *
   * @return BulkSendingListSummaries
   **/
  public BulkSendingListSummaries addBulkListSummariesItem(BulkSendingListSummary bulkListSummariesItem) {
    if (this.bulkListSummaries == null) {
      this.bulkListSummaries = new java.util.ArrayList<>();
    }
    this.bulkListSummaries.add(bulkListSummariesItem);
    return this;
  }

  /**
   * .
   * @return bulkListSummaries
   **/
  @Schema(description = "")
  public java.util.List<BulkSendingListSummary> getBulkListSummaries() {
    return bulkListSummaries;
  }

  /**
   * setBulkListSummaries.
   **/
  public void setBulkListSummaries(java.util.List<BulkSendingListSummary> bulkListSummaries) {
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
    BulkSendingListSummaries bulkSendingListSummaries = (BulkSendingListSummaries) o;
    return Objects.equals(this.bulkListSummaries, bulkSendingListSummaries.bulkListSummaries);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkListSummaries);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingListSummaries {\n");
    
    sb.append("    bulkListSummaries: ").append(toIndentedString(bulkListSummaries)).append("\n");
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

