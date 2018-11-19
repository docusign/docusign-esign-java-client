package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentHtmlDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDefinitionOriginal
 */

public class DocumentHtmlDefinitionOriginal {
  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdGuid")
  private String documentIdGuid = null;

  @JsonProperty("htmlDefinition")
  private DocumentHtmlDefinition htmlDefinition = null;

  public DocumentHtmlDefinitionOriginal documentId(String documentId) {
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

  public DocumentHtmlDefinitionOriginal documentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
    return this;
  }

   /**
   * 
   * @return documentIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentIdGuid() {
    return documentIdGuid;
  }

  public void setDocumentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
  }

  public DocumentHtmlDefinitionOriginal htmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
    return this;
  }

   /**
   * Get htmlDefinition
   * @return htmlDefinition
  **/
  @ApiModelProperty(example = "null", value = "")
  public DocumentHtmlDefinition getHtmlDefinition() {
    return htmlDefinition;
  }

  public void setHtmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentHtmlDefinitionOriginal documentHtmlDefinitionOriginal = (DocumentHtmlDefinitionOriginal) o;
    return Objects.equals(this.documentId, documentHtmlDefinitionOriginal.documentId) &&
        Objects.equals(this.documentIdGuid, documentHtmlDefinitionOriginal.documentIdGuid) &&
        Objects.equals(this.htmlDefinition, documentHtmlDefinitionOriginal.htmlDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentIdGuid, htmlDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDefinitionOriginal {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdGuid: ").append(toIndentedString(documentIdGuid)).append("\n");
    sb.append("    htmlDefinition: ").append(toIndentedString(htmlDefinition)).append("\n");
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

