package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkRecipient;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkRecipientsSummaryResponse
 */

public class BulkRecipientsSummaryResponse {
  @JsonProperty("bulkRecipients")
  private java.util.List<BulkRecipient> bulkRecipients = new java.util.ArrayList<BulkRecipient>();

  @JsonProperty("bulkRecipientsCount")
  private String bulkRecipientsCount = null;

  @JsonProperty("bulkRecipientsUri")
  private String bulkRecipientsUri = null;

  @JsonProperty("errorDetails")
  private java.util.List<ErrorDetails> errorDetails = new java.util.ArrayList<ErrorDetails>();

  public BulkRecipientsSummaryResponse bulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
    return this;
  }

  public BulkRecipientsSummaryResponse addBulkRecipientsItem(BulkRecipient bulkRecipientsItem) {
    this.bulkRecipients.add(bulkRecipientsItem);
    return this;
  }

   /**
   * A complex type containing information about the bulk recipients in the response.
   * @return bulkRecipients
  **/
  @ApiModelProperty(example = "null", value = "A complex type containing information about the bulk recipients in the response.")
  public java.util.List<BulkRecipient> getBulkRecipients() {
    return bulkRecipients;
  }

  public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
  }

  public BulkRecipientsSummaryResponse bulkRecipientsCount(String bulkRecipientsCount) {
    this.bulkRecipientsCount = bulkRecipientsCount;
    return this;
  }

   /**
   * The number of items returned in this response.
   * @return bulkRecipientsCount
  **/
  @ApiModelProperty(example = "null", value = "The number of items returned in this response.")
  public String getBulkRecipientsCount() {
    return bulkRecipientsCount;
  }

  public void setBulkRecipientsCount(String bulkRecipientsCount) {
    this.bulkRecipientsCount = bulkRecipientsCount;
  }

  public BulkRecipientsSummaryResponse bulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.
   * @return bulkRecipientsUri
  **/
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
  public String getBulkRecipientsUri() {
    return bulkRecipientsUri;
  }

  public void setBulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
  }

  public BulkRecipientsSummaryResponse errorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  public BulkRecipientsSummaryResponse addErrorDetailsItem(ErrorDetails errorDetailsItem) {
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

   /**
   * Array or errors.
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "Array or errors.")
  public java.util.List<ErrorDetails> getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRecipientsSummaryResponse bulkRecipientsSummaryResponse = (BulkRecipientsSummaryResponse) o;
    return Objects.equals(this.bulkRecipients, bulkRecipientsSummaryResponse.bulkRecipients) &&
        Objects.equals(this.bulkRecipientsCount, bulkRecipientsSummaryResponse.bulkRecipientsCount) &&
        Objects.equals(this.bulkRecipientsUri, bulkRecipientsSummaryResponse.bulkRecipientsUri) &&
        Objects.equals(this.errorDetails, bulkRecipientsSummaryResponse.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients, bulkRecipientsCount, bulkRecipientsUri, errorDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsSummaryResponse {\n");
    
    sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
    sb.append("    bulkRecipientsCount: ").append(toIndentedString(bulkRecipientsCount)).append("\n");
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

