package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeDocumentsResult
 */

public class EnvelopeDocumentsResult {
  @JsonProperty("envelopeDocuments")
  private java.util.List<EnvelopeDocument> envelopeDocuments = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  public EnvelopeDocumentsResult envelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
    this.envelopeDocuments = envelopeDocuments;
    return this;
  }

  public EnvelopeDocumentsResult addEnvelopeDocumentsItem(EnvelopeDocument envelopeDocumentsItem) {
    if (this.envelopeDocuments == null) {
      this.envelopeDocuments = new java.util.ArrayList<EnvelopeDocument>();
    }
    this.envelopeDocuments.add(envelopeDocumentsItem);
    return this;
  }

   /**
   * 
   * @return envelopeDocuments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeDocument> getEnvelopeDocuments() {
    return envelopeDocuments;
  }

  public void setEnvelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
    this.envelopeDocuments = envelopeDocuments;
  }

  public EnvelopeDocumentsResult envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
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
    return Objects.equals(this.envelopeDocuments, envelopeDocumentsResult.envelopeDocuments) &&
        Objects.equals(this.envelopeId, envelopeDocumentsResult.envelopeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeDocuments, envelopeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentsResult {\n");
    
    sb.append("    envelopeDocuments: ").append(toIndentedString(envelopeDocuments)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
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

