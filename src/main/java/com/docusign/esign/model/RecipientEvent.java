package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RecipientEvent   {
  
  private String recipientEventStatusCode = null;
  private String includeDocuments = null;

  
  /**
   * The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
   **/
  public RecipientEvent recipientEventStatusCode(String recipientEventStatusCode) {
    this.recipientEventStatusCode = recipientEventStatusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  @JsonProperty("recipientEventStatusCode")
  public String getRecipientEventStatusCode() {
    return recipientEventStatusCode;
  }
  public void setRecipientEventStatusCode(String recipientEventStatusCode) {
    this.recipientEventStatusCode = recipientEventStatusCode;
  }

  
  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. 
   **/
  public RecipientEvent includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
  @JsonProperty("includeDocuments")
  public String getIncludeDocuments() {
    return includeDocuments;
  }
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
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
    return Objects.equals(this.recipientEventStatusCode, recipientEvent.recipientEventStatusCode) &&
        Objects.equals(this.includeDocuments, recipientEvent.includeDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientEventStatusCode, includeDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEvent {\n");
    
    sb.append("    recipientEventStatusCode: ").append(toIndentedString(recipientEventStatusCode)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
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

