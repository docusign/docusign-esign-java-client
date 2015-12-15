package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.Document;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class InlineTemplate   {
  
  private String sequence = null;
  private Envelope envelope = null;
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();
  private Recipients recipients = null;
  private CustomFields customFields = null;

  
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
  @JsonProperty("recipients")
  public Recipients getRecipients() {
    return recipients;
  }
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineTemplate inlineTemplate = (InlineTemplate) o;
    return Objects.equals(sequence, inlineTemplate.sequence) &&
        Objects.equals(envelope, inlineTemplate.envelope) &&
        Objects.equals(documents, inlineTemplate.documents) &&
        Objects.equals(recipients, inlineTemplate.recipients) &&
        Objects.equals(customFields, inlineTemplate.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, envelope, documents, recipients, customFields);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineTemplate {\n");
    
    sb.append("    sequence: ").append(StringUtil.toIndentedString(sequence)).append("\n");
    sb.append("    envelope: ").append(StringUtil.toIndentedString(envelope)).append("\n");
    sb.append("    documents: ").append(StringUtil.toIndentedString(documents)).append("\n");
    sb.append("    recipients: ").append(StringUtil.toIndentedString(recipients)).append("\n");
    sb.append("    customFields: ").append(StringUtil.toIndentedString(customFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
