package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class DocumentTemplate   {
  
  private String documentId = null;
  private String templateId = null;
  private String documentStartPage = null;
  private String documentEndPage = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("documentStartPage")
  public String getDocumentStartPage() {
    return documentStartPage;
  }
  public void setDocumentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("documentEndPage")
  public String getDocumentEndPage() {
    return documentEndPage;
  }
  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplate documentTemplate = (DocumentTemplate) o;
    return Objects.equals(documentId, documentTemplate.documentId) &&
        Objects.equals(templateId, documentTemplate.templateId) &&
        Objects.equals(documentStartPage, documentTemplate.documentStartPage) &&
        Objects.equals(documentEndPage, documentTemplate.documentEndPage) &&
        Objects.equals(errorDetails, documentTemplate.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, templateId, documentStartPage, documentEndPage, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplate {\n");
    
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    templateId: ").append(StringUtil.toIndentedString(templateId)).append("\n");
    sb.append("    documentStartPage: ").append(StringUtil.toIndentedString(documentStartPage)).append("\n");
    sb.append("    documentEndPage: ").append(StringUtil.toIndentedString(documentEndPage)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
