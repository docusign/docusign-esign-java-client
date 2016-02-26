package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class EnvelopeDocumentsResult   {
  
  private String envelopeId = null;
  private java.util.List<EnvelopeDocument> envelopeDocuments = new java.util.ArrayList<EnvelopeDocument>();

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeDocuments")
  public java.util.List<EnvelopeDocument> getEnvelopeDocuments() {
    return envelopeDocuments;
  }
  public void setEnvelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
    this.envelopeDocuments = envelopeDocuments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocumentsResult envelopeDocumentsResult = (EnvelopeDocumentsResult) o;

    return true && Objects.equals(envelopeId, envelopeDocumentsResult.envelopeId) &&
        Objects.equals(envelopeDocuments, envelopeDocumentsResult.envelopeDocuments)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, envelopeDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentsResult {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeDocuments: ").append(toIndentedString(envelopeDocuments)).append("\n");
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

