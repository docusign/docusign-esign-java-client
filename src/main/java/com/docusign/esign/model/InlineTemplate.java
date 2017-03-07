package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class InlineTemplate   {
  
  private CustomFields customFields = null;
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();
  private Envelope envelope = null;
  private Recipients recipients = null;
  private String sequence = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customFields")
  public CustomFields getCustomFields() {
    return customFields;
  }
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  
  /**
   * Complex element contains the details on the documents in the envelope.
   **/
  
  @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
  @JsonProperty("documents")
  public java.util.List<Document> getDocuments() {
    return documents;
  }
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelope")
  public Envelope getEnvelope() {
    return envelope;
  }
  public void setEnvelope(Envelope envelope) {
    this.envelope = envelope;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipients")
  public Recipients getRecipients() {
    return recipients;
  }
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  
  /**
   * Specifies the order in which templates are overlaid.
   **/
  
  @ApiModelProperty(value = "Specifies the order in which templates are overlaid.")
  @JsonProperty("sequence")
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

    return true && Objects.equals(customFields, inlineTemplate.customFields) &&
        Objects.equals(documents, inlineTemplate.documents) &&
        Objects.equals(envelope, inlineTemplate.envelope) &&
        Objects.equals(recipients, inlineTemplate.recipients) &&
        Objects.equals(sequence, inlineTemplate.sequence)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, documents, envelope, recipients, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineTemplate {\n");
    
    if (customFields != null)
      sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    if (documents != null)
      sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    if (envelope != null)
      sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    if (recipients != null)
      sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    if (sequence != null)
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

