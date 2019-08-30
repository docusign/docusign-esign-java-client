package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DisplayApplianceSignerAttachment
 */

public class DisplayApplianceSignerAttachment {
  @JsonProperty("attachmentDescription")
  private String attachmentDescription = null;

  @JsonProperty("attachmentTabId")
  private String attachmentTabId = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("pageId")
  private String pageId = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  public DisplayApplianceSignerAttachment attachmentDescription(String attachmentDescription) {
    this.attachmentDescription = attachmentDescription;
    return this;
  }

   /**
   * 
   * @return attachmentDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentDescription() {
    return attachmentDescription;
  }

  public void setAttachmentDescription(String attachmentDescription) {
    this.attachmentDescription = attachmentDescription;
  }

  public DisplayApplianceSignerAttachment attachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
    return this;
  }

   /**
   * 
   * @return attachmentTabId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentTabId() {
    return attachmentTabId;
  }

  public void setAttachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
  }

  public DisplayApplianceSignerAttachment documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DisplayApplianceSignerAttachment envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public DisplayApplianceSignerAttachment pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * 
   * @return pageCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public DisplayApplianceSignerAttachment pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * 
   * @return pageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public DisplayApplianceSignerAttachment recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceSignerAttachment displayApplianceSignerAttachment = (DisplayApplianceSignerAttachment) o;
    return Objects.equals(this.attachmentDescription, displayApplianceSignerAttachment.attachmentDescription) &&
        Objects.equals(this.attachmentTabId, displayApplianceSignerAttachment.attachmentTabId) &&
        Objects.equals(this.documentId, displayApplianceSignerAttachment.documentId) &&
        Objects.equals(this.envelopeId, displayApplianceSignerAttachment.envelopeId) &&
        Objects.equals(this.pageCount, displayApplianceSignerAttachment.pageCount) &&
        Objects.equals(this.pageId, displayApplianceSignerAttachment.pageId) &&
        Objects.equals(this.recipientId, displayApplianceSignerAttachment.recipientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentDescription, attachmentTabId, documentId, envelopeId, pageCount, pageId, recipientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceSignerAttachment {\n");
    
    sb.append("    attachmentDescription: ").append(toIndentedString(attachmentDescription)).append("\n");
    sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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

