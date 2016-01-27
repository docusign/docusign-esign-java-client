package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.EnvelopeDocument;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocumentsResult envelopeDocumentsResult = (EnvelopeDocumentsResult) o;
    return Objects.equals(envelopeId, envelopeDocumentsResult.envelopeId) &&
        Objects.equals(envelopeDocuments, envelopeDocumentsResult.envelopeDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, envelopeDocuments);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentsResult {\n");
    
    sb.append("    envelopeId: ").append(StringUtil.toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeDocuments: ").append(StringUtil.toIndentedString(envelopeDocuments)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
