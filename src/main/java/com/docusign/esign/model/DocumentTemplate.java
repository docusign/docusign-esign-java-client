package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class DocumentTemplate   {
  
  private String documentId = null;
  private String templateId = null;
  private String documentStartPage = null;
  private String documentEndPage = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  public DocumentTemplate documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
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
  public DocumentTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
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
  public DocumentTemplate documentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public DocumentTemplate documentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentEndPage")
  public String getDocumentEndPage() {
    return documentEndPage;
  }
  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
  }

  
  /**
   **/
  public DocumentTemplate errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplate documentTemplate = (DocumentTemplate) o;
    return Objects.equals(this.documentId, documentTemplate.documentId) &&
        Objects.equals(this.templateId, documentTemplate.templateId) &&
        Objects.equals(this.documentStartPage, documentTemplate.documentStartPage) &&
        Objects.equals(this.documentEndPage, documentTemplate.documentEndPage) &&
        Objects.equals(this.errorDetails, documentTemplate.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, templateId, documentStartPage, documentEndPage, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplate {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

