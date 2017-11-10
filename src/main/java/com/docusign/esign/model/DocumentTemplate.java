package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentTemplate
 */

public class DocumentTemplate {
  @JsonProperty("documentEndPage")
  private String documentEndPage = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentStartPage")
  private String documentStartPage = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("templateId")
  private String templateId = null;

  public DocumentTemplate documentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
    return this;
  }

   /**
   * 
   * @return documentEndPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentEndPage() {
    return documentEndPage;
  }

  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
  }

  public DocumentTemplate documentId(String documentId) {
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

  public DocumentTemplate documentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
    return this;
  }

   /**
   * 
   * @return documentStartPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentStartPage() {
    return documentStartPage;
  }

  public void setDocumentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
  }

  public DocumentTemplate errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public DocumentTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
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
    return Objects.equals(this.documentEndPage, documentTemplate.documentEndPage) &&
        Objects.equals(this.documentId, documentTemplate.documentId) &&
        Objects.equals(this.documentStartPage, documentTemplate.documentStartPage) &&
        Objects.equals(this.errorDetails, documentTemplate.errorDetails) &&
        Objects.equals(this.templateId, documentTemplate.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentEndPage, documentId, documentStartPage, errorDetails, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplate {\n");
    
    sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

