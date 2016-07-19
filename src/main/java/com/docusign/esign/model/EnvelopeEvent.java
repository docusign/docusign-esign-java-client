package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EnvelopeEvent   {
  
  private String envelopeEventStatusCode = null;
  private String includeDocuments = null;

  
  /**
   * he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.
   **/
  public EnvelopeEvent envelopeEventStatusCode(String envelopeEventStatusCode) {
    this.envelopeEventStatusCode = envelopeEventStatusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.")
  @JsonProperty("envelopeEventStatusCode")
  public String getEnvelopeEventStatusCode() {
    return envelopeEventStatusCode;
  }
  public void setEnvelopeEventStatusCode(String envelopeEventStatusCode) {
    this.envelopeEventStatusCode = envelopeEventStatusCode;
  }

  
  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. 
   **/
  public EnvelopeEvent includeDocuments(String includeDocuments) {
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
    EnvelopeEvent envelopeEvent = (EnvelopeEvent) o;
    return Objects.equals(this.envelopeEventStatusCode, envelopeEvent.envelopeEventStatusCode) &&
        Objects.equals(this.includeDocuments, envelopeEvent.includeDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeEventStatusCode, includeDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeEvent {\n");
    
    sb.append("    envelopeEventStatusCode: ").append(toIndentedString(envelopeEventStatusCode)).append("\n");
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

