package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.InlineTemplate;
import com.docusign.esign.model.ServerTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CompositeTemplate   {
  
  private String compositeTemplateId = null;
  private Document document = null;
  private java.util.List<InlineTemplate> inlineTemplates = new java.util.ArrayList<InlineTemplate>();
  private String pdfMetaDataTemplateSequence = null;
  private java.util.List<ServerTemplate> serverTemplates = new java.util.ArrayList<ServerTemplate>();

  
  /**
   * The identify of this composite template. It is used as a reference when adding document object information. If used, the document’s `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
   **/
  
  @ApiModelProperty(value = "The identify of this composite template. It is used as a reference when adding document object information. If used, the document’s `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.")
  @JsonProperty("compositeTemplateId")
  public String getCompositeTemplateId() {
    return compositeTemplateId;
  }
  public void setCompositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("document")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  
  /**
   * Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.
   **/
  
  @ApiModelProperty(value = "Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.")
  @JsonProperty("inlineTemplates")
  public java.util.List<InlineTemplate> getInlineTemplates() {
    return inlineTemplates;
  }
  public void setInlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
    this.inlineTemplates = inlineTemplates;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pdfMetaDataTemplateSequence")
  public String getPdfMetaDataTemplateSequence() {
    return pdfMetaDataTemplateSequence;
  }
  public void setPdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
  }

  
  /**
   * 0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value
   **/
  
  @ApiModelProperty(value = "0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value")
  @JsonProperty("serverTemplates")
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

    return true && Objects.equals(compositeTemplateId, compositeTemplate.compositeTemplateId) &&
        Objects.equals(document, compositeTemplate.document) &&
        Objects.equals(inlineTemplates, compositeTemplate.inlineTemplates) &&
        Objects.equals(pdfMetaDataTemplateSequence, compositeTemplate.pdfMetaDataTemplateSequence) &&
        Objects.equals(serverTemplates, compositeTemplate.serverTemplates)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeTemplateId, document, inlineTemplates, pdfMetaDataTemplateSequence, serverTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeTemplate {\n");
    
    if (compositeTemplateId != null)
      sb.append("    compositeTemplateId: ").append(toIndentedString(compositeTemplateId)).append("\n");
    if (document != null)
      sb.append("    document: ").append(toIndentedString(document)).append("\n");
    if (inlineTemplates != null)
      sb.append("    inlineTemplates: ").append(toIndentedString(inlineTemplates)).append("\n");
    if (pdfMetaDataTemplateSequence != null)
      sb.append("    pdfMetaDataTemplateSequence: ").append(toIndentedString(pdfMetaDataTemplateSequence)).append("\n");
    if (serverTemplates != null)
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

