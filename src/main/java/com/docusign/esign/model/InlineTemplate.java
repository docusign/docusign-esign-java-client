package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class InlineTemplate   {
  
  private String sequence = null;
  private Envelope envelope = null;
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();
  private Recipients recipients = null;
  private CustomFields customFields = null;

  
  /**
   * Specifies the order in which templates are overlaid.
   **/
  public InlineTemplate sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the order in which templates are overlaid.")
  @JsonProperty("sequence")
  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  
  /**
   **/
  public InlineTemplate envelope(Envelope envelope) {
    this.envelope = envelope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelope")
  public Envelope getEnvelope() {
    return envelope;
  }
  public void setEnvelope(Envelope envelope) {
    this.envelope = envelope;
  }

  
  /**
   * Complex element contains the details on the documents in the envelope.
   **/
  public InlineTemplate documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complex element contains the details on the documents in the envelope.")
  @JsonProperty("documents")
  public java.util.List<Document> getDocuments() {
    return documents;
  }
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  
  /**
   **/
  public InlineTemplate recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipients")
  public Recipients getRecipients() {
    return recipients;
  }
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  
  /**
   **/
  public InlineTemplate customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public CustomFields getCustomFields() {
    return customFields;
  }
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
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
    return Objects.equals(this.sequence, inlineTemplate.sequence) &&
        Objects.equals(this.envelope, inlineTemplate.envelope) &&
        Objects.equals(this.documents, inlineTemplate.documents) &&
        Objects.equals(this.recipients, inlineTemplate.recipients) &&
        Objects.equals(this.customFields, inlineTemplate.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, envelope, documents, recipients, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineTemplate {\n");
    
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

