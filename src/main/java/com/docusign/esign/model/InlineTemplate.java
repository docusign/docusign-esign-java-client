package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineTemplate.
 *
 */

public class InlineTemplate {
  @JsonProperty("customFields")
  private CustomFields customFields = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = null;

  @JsonProperty("envelope")
  private Envelope envelope = null;

  @JsonProperty("recipients")
  private Recipients recipients = null;

  @JsonProperty("sequence")
  private String sequence = null;

  /**
   * customFields.
   *
   * @return InlineTemplate
   **/
  public InlineTemplate customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * An optional array of strings that enables the sender to provide custom data
   * about the recipient. This information is returned in the envelope status but
   * otherwise not used by DocuSign. Each `customField` string can be a maximum of
   * 100 characters..
   * 
   * @return customFields
   **/
  @Schema(description = "An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each `customField` string can be a maximum of 100 characters.")
  public CustomFields getCustomFields() {
    return customFields;
  }

  /**
   * setCustomFields.
   **/
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  /**
   * documents.
   *
   * @return InlineTemplate
   **/
  public InlineTemplate documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }

  /**
   * addDocumentsItem.
   *
   * @return InlineTemplate
   **/
  public InlineTemplate addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Complex element contains the details on the documents in the envelope..
   * 
   * @return documents
   **/
  @Schema(description = "Complex element contains the details on the documents in the envelope.")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  /**
   * setDocuments.
   **/
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  /**
   * envelope.
   *
   * @return InlineTemplate
   **/
  public InlineTemplate envelope(Envelope envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * A container used to send documents to recipients. The envelope carries
   * information about the sender and timestamps to indicate the progress of the
   * delivery procedure. It can contain collections of Documents, Tabs and
   * Recipients..
   * 
   * @return envelope
   **/
  @Schema(description = "A container used to send documents to recipients. The envelope carries information about the sender and timestamps to indicate the progress of the delivery procedure. It can contain collections of Documents, Tabs and Recipients.")
  public Envelope getEnvelope() {
    return envelope;
  }

  /**
   * setEnvelope.
   **/
  public void setEnvelope(Envelope envelope) {
    this.envelope = envelope;
  }

  /**
   * recipients.
   *
   * @return InlineTemplate
   **/
  public InlineTemplate recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * An array of recipient objects that provides details about the recipients of
   * the envelope..
   * 
   * @return recipients
   **/
  @Schema(description = "An array of recipient objects that provides details about the recipients of the envelope.")
  public Recipients getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  /**
   * sequence.
   *
   * @return InlineTemplate
   **/
  public InlineTemplate sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Specifies the order in which templates are overlaid..
   * 
   * @return sequence
   **/
  @Schema(description = "Specifies the order in which templates are overlaid.")
  public String getSequence() {
    return sequence;
  }

  /**
   * setSequence.
   **/
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(customFields, documents, envelope, recipients, sequence);
  }

  /**
   * Converts the given object to string.
   */
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
