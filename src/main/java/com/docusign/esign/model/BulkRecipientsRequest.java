package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** BulkRecipientsRequest. */
public class BulkRecipientsRequest {
  @JsonProperty("bulkRecipients")
  private java.util.List<BulkRecipient> bulkRecipients = null;

  /**
   * bulkRecipients.
   *
   * @return BulkRecipientsRequest
   */
  public BulkRecipientsRequest bulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
    return this;
  }

  /**
   * addBulkRecipientsItem.
   *
   * @return BulkRecipientsRequest
   */
  public BulkRecipientsRequest addBulkRecipientsItem(BulkRecipient bulkRecipientsItem) {
    if (this.bulkRecipients == null) {
      this.bulkRecipients = new java.util.ArrayList<BulkRecipient>();
    }
    this.bulkRecipients.add(bulkRecipientsItem);
    return this;
  }

  /**
   * A complex type containing information about the bulk recipients in the
   * request..
   *
   * @return bulkRecipients
   */
  @Schema(description = "A complex type containing information about the bulk recipients in the request.")
  public java.util.List<BulkRecipient> getBulkRecipients() {
    return bulkRecipients;
  }

  /** setBulkRecipients. */
  public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
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
    BulkRecipientsRequest bulkRecipientsRequest = (BulkRecipientsRequest) o;
    return Objects.equals(this.bulkRecipients, bulkRecipientsRequest.bulkRecipients);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients);
  }

  /** Converts the given object to string. */
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
