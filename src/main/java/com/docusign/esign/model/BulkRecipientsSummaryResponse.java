package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkRecipient;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BulkRecipientsSummaryResponse   {
  
  private java.util.List<BulkRecipient> bulkRecipients = new java.util.ArrayList<BulkRecipient>();
  private String bulkRecipientsCount = null;
  private String bulkRecipientsUri = null;
  private java.util.List<ErrorDetails> errorDetails = new java.util.ArrayList<ErrorDetails>();

  
  /**
   * A complex type containing information about the bulk recipients in the response.
   **/
  
  @ApiModelProperty(value = "A complex type containing information about the bulk recipients in the response.")
  @JsonProperty("bulkRecipients")
  public java.util.List<BulkRecipient> getBulkRecipients() {
    return bulkRecipients;
  }
  public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
  }

  
  /**
   * The number of items returned in this response.
   **/
  
  @ApiModelProperty(value = "The number of items returned in this response.")
  @JsonProperty("bulkRecipientsCount")
  public String getBulkRecipientsCount() {
    return bulkRecipientsCount;
  }
  public void setBulkRecipientsCount(String bulkRecipientsCount) {
    this.bulkRecipientsCount = bulkRecipientsCount;
  }

  
  /**
   * Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
  @JsonProperty("bulkRecipientsUri")
  public String getBulkRecipientsUri() {
    return bulkRecipientsUri;
  }
  public void setBulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
  }

  
  /**
   * Array or errors.
   **/
  
  @ApiModelProperty(value = "Array or errors.")
  @JsonProperty("errorDetails")
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

    return true && Objects.equals(bulkRecipients, bulkRecipientsSummaryResponse.bulkRecipients) &&
        Objects.equals(bulkRecipientsCount, bulkRecipientsSummaryResponse.bulkRecipientsCount) &&
        Objects.equals(bulkRecipientsUri, bulkRecipientsSummaryResponse.bulkRecipientsUri) &&
        Objects.equals(errorDetails, bulkRecipientsSummaryResponse.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients, bulkRecipientsCount, bulkRecipientsUri, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsSummaryResponse {\n");
    
    if (bulkRecipients != null)
      sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
    if (bulkRecipientsCount != null)
      sb.append("    bulkRecipientsCount: ").append(toIndentedString(bulkRecipientsCount)).append("\n");
    if (bulkRecipientsUri != null)
      sb.append("    bulkRecipientsUri: ").append(toIndentedString(bulkRecipientsUri)).append("\n");
    if (errorDetails != null)
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

