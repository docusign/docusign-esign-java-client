package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingListSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendingListSummaries
 */

public class BulkSendingListSummaries {
  @JsonProperty("bulkListSummaries")
  private java.util.List<BulkSendingListSummary> bulkListSummaries = null;

  public BulkSendingListSummaries bulkListSummaries(java.util.List<BulkSendingListSummary> bulkListSummaries) {
    this.bulkListSummaries = bulkListSummaries;
    return this;
  }

  public BulkSendingListSummaries addBulkListSummariesItem(BulkSendingListSummary bulkListSummariesItem) {
    if (this.bulkListSummaries == null) {
      this.bulkListSummaries = new java.util.ArrayList<BulkSendingListSummary>();
    }
    this.bulkListSummaries.add(bulkListSummariesItem);
    return this;
  }

   /**
   * 
   * @return bulkListSummaries
  **/
  @ApiModelProperty(value = "")
  public java.util.List<BulkSendingListSummary> getBulkListSummaries() {
    return bulkListSummaries;
  }

  public void setBulkListSummaries(java.util.List<BulkSendingListSummary> bulkListSummaries) {
    this.bulkListSummaries = bulkListSummaries;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(bulkListSummaries);
  }


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

