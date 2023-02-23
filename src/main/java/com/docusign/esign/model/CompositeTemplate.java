package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.InlineTemplate;
import com.docusign.esign.model.ServerTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains information about a [composite template][composite],
 * which you can use to to apply multiple templates to a single envelope,
 * combine templates with PDF forms, and combine templates with documents from
 * cloud sources. [composite]:
 * /docs/esign-rest-api/esign101/concepts/templates/composite/.
 *
 */
@Schema(description = "This object contains information about a [composite template][composite], which you can use to to apply multiple templates to a single envelope, combine templates with PDF forms, and combine templates with documents from cloud sources.  [composite]: /docs/esign-rest-api/esign101/concepts/templates/composite/")

public class CompositeTemplate {
  @JsonProperty("compositeTemplateId")
  private String compositeTemplateId = null;

  @JsonProperty("document")
  private Document document = null;

  @JsonProperty("inlineTemplates")
  private java.util.List<InlineTemplate> inlineTemplates = null;

  @JsonProperty("pdfMetaDataTemplateSequence")
  private String pdfMetaDataTemplateSequence = null;

  @JsonProperty("serverTemplates")
  private java.util.List<ServerTemplate> serverTemplates = null;

  /**
   * compositeTemplateId.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate compositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
    return this;
  }

  /**
   * The identify of this composite template. It is used as a reference when
   * adding document object information. If used, the document's
   * `content-disposition` must include the composite template ID to which the
   * document should be added. If a composite template ID is not specified in the
   * content-disposition, the document is applied based on the value of the
   * `documentId` property only. If no document object is specified, the composite
   * template inherits the first document..
   * 
   * @return compositeTemplateId
   **/
  @Schema(description = "The identify of this composite template. It is used as a reference when adding document object information. If used, the document's `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.")
  public String getCompositeTemplateId() {
    return compositeTemplateId;
  }

  /**
   * setCompositeTemplateId.
   **/
  public void setCompositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
  }

  /**
   * document.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * An optional document object that will act as the primary document in the
   * composite template object. If the document node is present, it will take
   * precedence over any server template or inline template documents. It always
   * comes first. Only use this when you want to supply the document dynamically..
   * 
   * @return document
   **/
  @Schema(description = "An optional document object that will act as the primary document in the composite template object. If the document node is present, it will take precedence over any server template or inline template documents. It always comes first. Only use this when you want to supply the document dynamically.")
  public Document getDocument() {
    return document;
  }

  /**
   * setDocument.
   **/
  public void setDocument(Document document) {
    this.document = document;
  }

  /**
   * inlineTemplates.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate inlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
    this.inlineTemplates = inlineTemplates;
    return this;
  }

  /**
   * addInlineTemplatesItem.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate addInlineTemplatesItem(InlineTemplate inlineTemplatesItem) {
    if (this.inlineTemplates == null) {
      this.inlineTemplates = new java.util.ArrayList<>();
    }
    this.inlineTemplates.add(inlineTemplatesItem);
    return this;
  }

  /**
   * Zero or more inline templates and their position in the overlay. If supplied,
   * they are overlaid into the envelope in the order of their Sequence value..
   * 
   * @return inlineTemplates
   **/
  @Schema(description = " Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.")
  public java.util.List<InlineTemplate> getInlineTemplates() {
    return inlineTemplates;
  }

  /**
   * setInlineTemplates.
   **/
  public void setInlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
    this.inlineTemplates = inlineTemplates;
  }

  /**
   * pdfMetaDataTemplateSequence.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate pdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
    return this;
  }

  /**
   * .
   * 
   * @return pdfMetaDataTemplateSequence
   **/
  @Schema(description = "")
  public String getPdfMetaDataTemplateSequence() {
    return pdfMetaDataTemplateSequence;
  }

  /**
   * setPdfMetaDataTemplateSequence.
   **/
  public void setPdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
  }

  /**
   * serverTemplates.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate serverTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
    return this;
  }

  /**
   * addServerTemplatesItem.
   *
   * @return CompositeTemplate
   **/
  public CompositeTemplate addServerTemplatesItem(ServerTemplate serverTemplatesItem) {
    if (this.serverTemplates == null) {
      this.serverTemplates = new java.util.ArrayList<>();
    }
    this.serverTemplates.add(serverTemplatesItem);
    return this;
  }

  /**
   * 0 or more server-side templates and their position in the overlay. If
   * supplied, they are overlaid into the envelope in the order of their Sequence
   * value.
   * 
   * @return serverTemplates
   **/
  @Schema(description = "0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value")
  public java.util.List<ServerTemplate> getServerTemplates() {
    return serverTemplates;
  }

  /**
   * setServerTemplates.
   **/
  public void setServerTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
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
    CompositeTemplate compositeTemplate = (CompositeTemplate) o;
    return Objects.equals(this.compositeTemplateId, compositeTemplate.compositeTemplateId) &&
        Objects.equals(this.document, compositeTemplate.document) &&
        Objects.equals(this.inlineTemplates, compositeTemplate.inlineTemplates) &&
        Objects.equals(this.pdfMetaDataTemplateSequence, compositeTemplate.pdfMetaDataTemplateSequence) &&
        Objects.equals(this.serverTemplates, compositeTemplate.serverTemplates);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(compositeTemplateId, document, inlineTemplates, pdfMetaDataTemplateSequence, serverTemplates);
  }

  /**
   * Converts the given object to string.
   */
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
