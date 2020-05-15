package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientEvent
 */

public class RecipientEvent {
  @JsonProperty("includeDocuments")
  private String includeDocuments = null;

  @JsonProperty("recipientEventStatusCode")
  private String recipientEventStatusCode = null;

  public RecipientEvent includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }

   /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. 
   * @return includeDocuments
  **/
  @ApiModelProperty(value = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
  public String getIncludeDocuments() {
    return includeDocuments;
  }

  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  public RecipientEvent recipientEventStatusCode(String recipientEventStatusCode) {
    this.recipientEventStatusCode = recipientEventStatusCode;
    return this;
  }

   /**
   * The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
   * @return recipientEventStatusCode
  **/
  @ApiModelProperty(value = "The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  public String getRecipientEventStatusCode() {
    return recipientEventStatusCode;
  }

  public void setRecipientEventStatusCode(String recipientEventStatusCode) {
    this.recipientEventStatusCode = recipientEventStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientEvent recipientEvent = (RecipientEvent) o;
    return Objects.equals(this.includeDocuments, recipientEvent.includeDocuments) &&
        Objects.equals(this.recipientEventStatusCode, recipientEvent.recipientEventStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDocuments, recipientEventStatusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEvent {\n");
    
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    recipientEventStatusCode: ").append(toIndentedString(recipientEventStatusCode)).append("\n");
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

