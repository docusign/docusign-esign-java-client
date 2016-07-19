package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.InlineTemplate;
import com.docusign.esign.model.ServerTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class CompositeTemplate   {
  
  private String compositeTemplateId = null;
  private java.util.List<ServerTemplate> serverTemplates = new java.util.ArrayList<ServerTemplate>();
  private java.util.List<InlineTemplate> inlineTemplates = new java.util.ArrayList<InlineTemplate>();
  private String pdfMetaDataTemplateSequence = null;
  private Document document = null;

  
  /**
   * The identify of this composite template. It is used as a reference when adding document object information. If used, the document\u2019s `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
   **/
  public CompositeTemplate compositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identify of this composite template. It is used as a reference when adding document object information. If used, the document\u2019s `content-disposition` must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.")
  @JsonProperty("compositeTemplateId")
  public String getCompositeTemplateId() {
    return compositeTemplateId;
  }
  public void setCompositeTemplateId(String compositeTemplateId) {
    this.compositeTemplateId = compositeTemplateId;
  }

  
  /**
   * 0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value
   **/
  public CompositeTemplate serverTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value")
  @JsonProperty("serverTemplates")
  public java.util.List<ServerTemplate> getServerTemplates() {
    return serverTemplates;
  }
  public void setServerTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
  }

  
  /**
   *  Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.
   **/
  public CompositeTemplate inlineTemplates(java.util.List<InlineTemplate> inlineTemplates) {
    this.inlineTemplates = inlineTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.")
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
  public CompositeTemplate pdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pdfMetaDataTemplateSequence")
  public String getPdfMetaDataTemplateSequence() {
    return pdfMetaDataTemplateSequence;
  }
  public void setPdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
    this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
  }

  
  /**
   **/
  public CompositeTemplate document(Document document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("document")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
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
        Objects.equals(this.serverTemplates, compositeTemplate.serverTemplates) &&
        Objects.equals(this.inlineTemplates, compositeTemplate.inlineTemplates) &&
        Objects.equals(this.pdfMetaDataTemplateSequence, compositeTemplate.pdfMetaDataTemplateSequence) &&
        Objects.equals(this.document, compositeTemplate.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeTemplateId, serverTemplates, inlineTemplates, pdfMetaDataTemplateSequence, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeTemplate {\n");
    
    sb.append("    compositeTemplateId: ").append(toIndentedString(compositeTemplateId)).append("\n");
    sb.append("    serverTemplates: ").append(toIndentedString(serverTemplates)).append("\n");
    sb.append("    inlineTemplates: ").append(toIndentedString(inlineTemplates)).append("\n");
    sb.append("    pdfMetaDataTemplateSequence: ").append(toIndentedString(pdfMetaDataTemplateSequence)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

