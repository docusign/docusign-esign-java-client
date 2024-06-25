package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BulkProcessingLists.
 *
 */

public class BulkProcessingLists implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bulkProcessListIds")
  private java.util.List<String> bulkProcessListIds = null;


  /**
   * bulkProcessListIds.
   *
   * @return BulkProcessingLists
   **/
  public BulkProcessingLists bulkProcessListIds(java.util.List<String> bulkProcessListIds) {
    this.bulkProcessListIds = bulkProcessListIds;
    return this;
  }
  
  /**
   * addBulkProcessListIdsItem.
   *
   * @return BulkProcessingLists
   **/
  public BulkProcessingLists addBulkProcessListIdsItem(String bulkProcessListIdsItem) {
    if (this.bulkProcessListIds == null) {
      this.bulkProcessListIds = new java.util.ArrayList<>();
    }
    this.bulkProcessListIds.add(bulkProcessListIdsItem);
    return this;
  }

  /**
   * .
   * @return bulkProcessListIds
   **/
  @Schema(description = "")
  public java.util.List<String> getBulkProcessListIds() {
    return bulkProcessListIds;
  }

  /**
   * setBulkProcessListIds.
   **/
  public void setBulkProcessListIds(java.util.List<String> bulkProcessListIds) {
    this.bulkProcessListIds = bulkProcessListIds;
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
    BulkProcessingLists bulkProcessingLists = (BulkProcessingLists) o;
    return Objects.equals(this.bulkProcessListIds, bulkProcessingLists.bulkProcessListIds);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkProcessListIds);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProcessingLists {\n");
    
    sb.append("    bulkProcessListIds: ").append(toIndentedString(bulkProcessListIds)).append("\n");
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

