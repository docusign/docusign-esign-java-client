package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkRecipientsRequest
 */

public class BulkRecipientsRequest {
  @JsonProperty("bulkRecipients")
  private java.util.List<BulkRecipient> bulkRecipients = null;

  public BulkRecipientsRequest bulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
    return this;
  }

  public BulkRecipientsRequest addBulkRecipientsItem(BulkRecipient bulkRecipientsItem) {
    if (this.bulkRecipients == null) {
      this.bulkRecipients = new java.util.ArrayList<BulkRecipient>();
    }
    this.bulkRecipients.add(bulkRecipientsItem);
    return this;
  }

   /**
   * A complex type containing information about the bulk recipients in the request.
   * @return bulkRecipients
  **/
  @ApiModelProperty(value = "A complex type containing information about the bulk recipients in the request.")
  public java.util.List<BulkRecipient> getBulkRecipients() {
    return bulkRecipients;
  }

  public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRecipientsRequest bulkRecipientsRequest = (BulkRecipientsRequest) o;
    return Objects.equals(this.bulkRecipients, bulkRecipientsRequest.bulkRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsRequest {\n");
    
    sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
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

