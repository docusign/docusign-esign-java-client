package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendBatchRequest
 */

public class BulkSendBatchRequest {
  @JsonProperty("batchName")
  private String batchName = null;

  public BulkSendBatchRequest batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

   /**
   * 
   * @return batchName
  **/
  @ApiModelProperty(value = "")
  public String getBatchName() {
    return batchName;
  }

  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(batchName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchRequest {\n");
    
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
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

