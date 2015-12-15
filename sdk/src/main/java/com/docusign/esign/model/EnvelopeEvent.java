package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EnvelopeEvent   {
  
  private String envelopeEventStatusCode = null;
  private String includeDocuments = null;

  
  /**
   * he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.
   **/
  @ApiModelProperty(value = "he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.")
  @JsonProperty("envelopeEventStatusCode")
  public String getEnvelopeEventStatusCode() {
    return envelopeEventStatusCode;
  }
  public void setEnvelopeEventStatusCode(String envelopeEventStatusCode) {
    this.envelopeEventStatusCode = envelopeEventStatusCode;
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
    EnvelopeEvent envelopeEvent = (EnvelopeEvent) o;
    return Objects.equals(envelopeEventStatusCode, envelopeEvent.envelopeEventStatusCode) &&
        Objects.equals(includeDocuments, envelopeEvent.includeDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeEventStatusCode, includeDocuments);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeEvent {\n");
    
    sb.append("    envelopeEventStatusCode: ").append(StringUtil.toIndentedString(envelopeEventStatusCode)).append("\n");
    sb.append("    includeDocuments: ").append(StringUtil.toIndentedString(includeDocuments)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
