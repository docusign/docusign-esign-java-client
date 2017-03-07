package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BulkRecipientsRequest   {
  
  private java.util.List<BulkRecipient> bulkRecipients = new java.util.ArrayList<BulkRecipient>();

  
  /**
   * A complex type containing information about the bulk recipients in the request.
   **/
  
  @ApiModelProperty(value = "A complex type containing information about the bulk recipients in the request.")
  @JsonProperty("bulkRecipients")
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

    return true && Objects.equals(bulkRecipients, bulkRecipientsRequest.bulkRecipients)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsRequest {\n");
    
    if (bulkRecipients != null)
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

