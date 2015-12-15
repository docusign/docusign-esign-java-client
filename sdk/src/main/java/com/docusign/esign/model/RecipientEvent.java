package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class RecipientEvent   {
  
  private String recipientEventStatusCode = null;
  private String includeDocuments = null;

  
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

  
  /**
   * When set to **true**, the envelope time zone information is included in the message.
   **/
  @ApiModelProperty(value = "When set to **true**, the envelope time zone information is included in the message.")
  @JsonProperty("includeDocuments")
  public String getIncludeDocuments() {
    return includeDocuments;
  }
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientEvent recipientEvent = (RecipientEvent) o;
    return Objects.equals(recipientEventStatusCode, recipientEvent.recipientEventStatusCode) &&
        Objects.equals(includeDocuments, recipientEvent.includeDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientEventStatusCode, includeDocuments);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEvent {\n");
    
    sb.append("    recipientEventStatusCode: ").append(StringUtil.toIndentedString(recipientEventStatusCode)).append("\n");
    sb.append("    includeDocuments: ").append(StringUtil.toIndentedString(includeDocuments)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
