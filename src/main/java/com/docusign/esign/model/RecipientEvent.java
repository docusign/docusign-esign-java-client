package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientEvent   {
  
  private String includeDocuments = null;
  private String recipientEventStatusCode = null;

  
  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the PDF documents are included in the message along with the updated XML.")
  @JsonProperty("includeDocuments")
  public String getIncludeDocuments() {
    return includeDocuments;
  }
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  
  /**
   * The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
   **/
  
  @ApiModelProperty(value = "The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  @JsonProperty("recipientEventStatusCode")
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

    return true && Objects.equals(includeDocuments, recipientEvent.includeDocuments) &&
        Objects.equals(recipientEventStatusCode, recipientEvent.recipientEventStatusCode)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDocuments, recipientEventStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEvent {\n");
    
    if (includeDocuments != null)
      sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    if (recipientEventStatusCode != null)
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

