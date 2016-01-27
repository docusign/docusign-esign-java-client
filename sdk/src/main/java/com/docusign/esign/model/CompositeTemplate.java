package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.ServerTemplate;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.InlineTemplate;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class CompositeTemplate   {
  
  private String compositeTemplateId = null;
  private java.util.List<ServerTemplate> serverTemplates = new java.util.ArrayList<ServerTemplate>();
  private java.util.List<InlineTemplate> inlineTemplates = new java.util.ArrayList<InlineTemplate>();
  private String pdfMetaDataTemplateSequence = null;
  private Document document = null;

  
  /**
   * Specifies the identify the composite template. It is used as a reference when adding document object information. If used, the document content-disposition must include the composite template ID to which the document should be added. If composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
   **/
  @ApiModelProperty(value = "Specifies the identify the composite template. It is used as a reference when adding document object information. If used, the document content-disposition must include the composite template ID to which the document should be added. If composite template ID is not specified in the content-disposition, the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.")
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
  @ApiModelProperty(value = "0 or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value")
  @JsonProperty("serverTemplates")
  public java.util.List<ServerTemplate> getServerTemplates() {
    return serverTemplates;
  }
  public void setServerTemplates(java.util.List<ServerTemplate> serverTemplates) {
    this.serverTemplates = serverTemplates;
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("document")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeTemplate compositeTemplate = (CompositeTemplate) o;
    return Objects.equals(compositeTemplateId, compositeTemplate.compositeTemplateId) &&
        Objects.equals(serverTemplates, compositeTemplate.serverTemplates) &&
        Objects.equals(inlineTemplates, compositeTemplate.inlineTemplates) &&
        Objects.equals(pdfMetaDataTemplateSequence, compositeTemplate.pdfMetaDataTemplateSequence) &&
        Objects.equals(document, compositeTemplate.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeTemplateId, serverTemplates, inlineTemplates, pdfMetaDataTemplateSequence, document);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeTemplate {\n");
    
    sb.append("    compositeTemplateId: ").append(StringUtil.toIndentedString(compositeTemplateId)).append("\n");
    sb.append("    serverTemplates: ").append(StringUtil.toIndentedString(serverTemplates)).append("\n");
    sb.append("    inlineTemplates: ").append(StringUtil.toIndentedString(inlineTemplates)).append("\n");
    sb.append("    pdfMetaDataTemplateSequence: ").append(StringUtil.toIndentedString(pdfMetaDataTemplateSequence)).append("\n");
    sb.append("    document: ").append(StringUtil.toIndentedString(document)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
