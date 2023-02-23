package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** BulkRecipientsSummaryResponse. */
public class BulkRecipientsSummaryResponse {
  @JsonProperty("bulkRecipients")
  private java.util.List<BulkRecipient> bulkRecipients = null;

  @JsonProperty("bulkRecipientsCount")
  private String bulkRecipientsCount = null;

  @JsonProperty("bulkRecipientsUri")
  private String bulkRecipientsUri = null;

  @JsonProperty("errorDetails")
  private java.util.List<ErrorDetails> errorDetails = null;

  /**
   * bulkRecipients.
   *
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse bulkRecipients(
      java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
    return this;
  }

  /**
   * addBulkRecipientsItem.
   *
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse addBulkRecipientsItem(BulkRecipient bulkRecipientsItem) {
    if (this.bulkRecipients == null) {
      this.bulkRecipients = new java.util.ArrayList<BulkRecipient>();
    }
    this.bulkRecipients.add(bulkRecipientsItem);
    return this;
  }

  /**
   * A complex type containing information about the bulk recipients in the
   * response..
   *
   * @return bulkRecipients
   */
  @Schema(description = "A complex type containing information about the bulk recipients in the response.")
  public java.util.List<BulkRecipient> getBulkRecipients() {
    return bulkRecipients;
  }

  /** setBulkRecipients. */
  public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
  }

  /**
   * bulkRecipientsCount.
   *
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse bulkRecipientsCount(String bulkRecipientsCount) {
    this.bulkRecipientsCount = bulkRecipientsCount;
    return this;
  }

  /**
   * The number of items returned in this response..
   *
   * @return bulkRecipientsCount
   */
  @Schema(description = "The number of items returned in this response.")
  public String getBulkRecipientsCount() {
    return bulkRecipientsCount;
  }

  /** setBulkRecipientsCount. */
  public void setBulkRecipientsCount(String bulkRecipientsCount) {
    this.bulkRecipientsCount = bulkRecipientsCount;
  }

  /**
   * bulkRecipientsUri.
   *
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse bulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that allows you to easily retrieve bulk
   * recipient information..
   *
   * @return bulkRecipientsUri
   */
  @Schema(description = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
  public String getBulkRecipientsUri() {
    return bulkRecipientsUri;
  }

  /** setBulkRecipientsUri. */
  public void setBulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
  }

  /**
   * errorDetails.
   *
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse errorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * addErrorDetailsItem.
   *
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse addErrorDetailsItem(ErrorDetails errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new java.util.ArrayList<ErrorDetails>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

  /**
   * Array or errors..
   *
   * @return errorDetails
   */
  @Schema(description = "Array or errors.")
  public java.util.List<ErrorDetails> getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
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
    BulkRecipientsSummaryResponse bulkRecipientsSummaryResponse = (BulkRecipientsSummaryResponse) o;
    return Objects.equals(this.bulkRecipients, bulkRecipientsSummaryResponse.bulkRecipients)
        && Objects.equals(
            this.bulkRecipientsCount, bulkRecipientsSummaryResponse.bulkRecipientsCount)
        && Objects.equals(this.bulkRecipientsUri, bulkRecipientsSummaryResponse.bulkRecipientsUri)
        && Objects.equals(this.errorDetails, bulkRecipientsSummaryResponse.errorDetails);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients, bulkRecipientsCount, bulkRecipientsUri, errorDetails);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsSummaryResponse {\n");

    sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
    sb.append("    bulkRecipientsCount: ")
        .append(toIndentedString(bulkRecipientsCount))
        .append("\n");
    sb.append("    bulkRecipientsUri: ").append(toIndentedString(bulkRecipientsUri)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
