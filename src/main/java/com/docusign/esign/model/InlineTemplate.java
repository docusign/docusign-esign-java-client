package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineTemplate
 */

public class InlineTemplate {
  @JsonProperty("customFields")
  private CustomFields customFields = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();

  @JsonProperty("envelope")
  private Envelope envelope = null;

  @JsonProperty("recipients")
  private Recipients recipients = null;

  @JsonProperty("sequence")
  private String sequence = null;

  public InlineTemplate customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public CustomFields getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  public InlineTemplate documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public InlineTemplate addDocumentsItem(Document documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Complex element contains the details on the documents in the envelope.
   * @return documents
  **/
  @ApiModelProperty(example = "null", value = "Complex element contains the details on the documents in the envelope.")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  public InlineTemplate envelope(Envelope envelope) {
    this.envelope = envelope;
    return this;
  }

   /**
   * Get envelope
   * @return envelope
  **/
  @ApiModelProperty(example = "null", value = "")
  public Envelope getEnvelope() {
    return envelope;
  }

  public void setEnvelope(Envelope envelope) {
    this.envelope = envelope;
  }

  public InlineTemplate recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "")
  public Recipients getRecipients() {
    return recipients;
  }

  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  public InlineTemplate sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Specifies the order in which templates are overlaid.
   * @return sequence
  **/
  @ApiModelProperty(example = "null", value = "Specifies the order in which templates are overlaid.")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineTemplate inlineTemplate = (InlineTemplate) o;
    return Objects.equals(this.customFields, inlineTemplate.customFields) &&
        Objects.equals(this.documents, inlineTemplate.documents) &&
        Objects.equals(this.envelope, inlineTemplate.envelope) &&
        Objects.equals(this.recipients, inlineTemplate.recipients) &&
        Objects.equals(this.sequence, inlineTemplate.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, documents, envelope, recipients, sequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineTemplate {\n");
    
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

