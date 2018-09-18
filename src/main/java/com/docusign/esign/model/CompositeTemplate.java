package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.InlineTemplate;
import com.docusign.esign.model.ServerTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CompositeTemplate
 */

public class CompositeTemplate {
  @JsonProperty("compositeTemplateId")
  private String compositeTemplateId = null;

  @JsonProperty("document")
  private Document document = null;

  @JsonProperty("inlineTemplates")
  private java.util.List<InlineTemplate> inlineTemplates = new java.util.ArrayList<InlineTemplate>();

  @JsonProperty("pdfMetaDataTemplateSequence")
  private String pdfMetaDataTemplateSequence = null;

  @JsonProperty("serverTemplates")
  private java.util.List<ServerTemplate> serverTemplates = new java.util.ArrayList<ServerTemplate>();

  public CompositeTemplate compositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
    return this;
  }

   /**
   * The identify of this composite template. It is used as a reference when adding document object information. If used, the document's `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
   * @return compositeTemplateId
  **/
  @ApiModelProperty(example = "null", value = "The identify of this composite template. It is used as a reference when adding document object information. If used, the document's `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.")
  public String getCompositeTemplateId() {
    return compositeTemplateId;
  }

  public void setCompositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
  }

  public CompositeTemplate document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(example = "null", value = "")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public CompositeTemplate inlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
    this.inlineTemplates = inlineTemplates;
    return this;
  }

  public CompositeTemplate addInlineTemplatesItem(InlineTemplate inlineTemplatesItem) {
    this.inlineTemplates.add(inlineTemplatesItem);
    return this;
  }

   /**
   *  Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.
   * @return inlineTemplates
  **/
  @ApiModelProperty(example = "null", value = " Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.")
  public java.util.List<InlineTemplate> getInlineTemplates() {
    return inlineTemplates;
  }

  public void setInlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
    this.inlineTemplates = inlineTemplates;
  }

  public CompositeTemplate pdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
    return this;
  }

   /**
   * 
   * @return pdfMetaDataTemplateSequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPdfMetaDataTemplateSequence() {
    return pdfMetaDataTemplateSequence;
  }

  public void setPdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
  }

  public CompositeTemplate serverTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
    return this;
  }

  public CompositeTemplate addServerTemplatesItem(ServerTemplate serverTemplatesItem) {
    this.serverTemplates.add(serverTemplatesItem);
    return this;
  }

   /**
   * 0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value
   * @return serverTemplates
  **/
  @ApiModelProperty(example = "null", value = "0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value")
  public java.util.List<ServerTemplate> getServerTemplates() {
    return serverTemplates;
  }

  public void setServerTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeTemplate compositeTemplate = (CompositeTemplate) o;
    return Objects.equals(this.compositeTemplateId, compositeTemplate.compositeTemplateId) &&
        Objects.equals(this.document, compositeTemplate.document) &&
        Objects.equals(this.inlineTemplates, compositeTemplate.inlineTemplates) &&
        Objects.equals(this.pdfMetaDataTemplateSequence, compositeTemplate.pdfMetaDataTemplateSequence) &&
        Objects.equals(this.serverTemplates, compositeTemplate.serverTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeTemplateId, document, inlineTemplates, pdfMetaDataTemplateSequence, serverTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeTemplate {\n");
    
    sb.append("    compositeTemplateId: ").append(toIndentedString(compositeTemplateId)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    inlineTemplates: ").append(toIndentedString(inlineTemplates)).append("\n");
    sb.append("    pdfMetaDataTemplateSequence: ").append(toIndentedString(pdfMetaDataTemplateSequence)).append("\n");
    sb.append("    serverTemplates: ").append(toIndentedString(serverTemplates)).append("\n");
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

