package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeEvent envelopeEvent = (EnvelopeEvent) o;

    return true && Objects.equals(envelopeEventStatusCode, envelopeEvent.envelopeEventStatusCode) &&
        Objects.equals(includeDocuments, envelopeEvent.includeDocuments)
    ;
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

