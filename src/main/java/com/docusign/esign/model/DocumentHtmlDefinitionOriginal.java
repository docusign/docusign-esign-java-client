package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocumentHtmlDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocumentHtmlDefinitionOriginal.
 *
 */

public class DocumentHtmlDefinitionOriginal implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdGuid")
  private String documentIdGuid = null;

  @JsonProperty("htmlDefinition")
  private DocumentHtmlDefinition htmlDefinition = null;


  /**
   * documentId.
   *
   * @return DocumentHtmlDefinitionOriginal
   **/
  public DocumentHtmlDefinitionOriginal documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
   * @return documentId
   **/
  @Schema(description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * documentIdGuid.
   *
   * @return DocumentHtmlDefinitionOriginal
   **/
  public DocumentHtmlDefinitionOriginal documentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
    return this;
  }

  /**
   * .
   * @return documentIdGuid
   **/
  @Schema(description = "")
  public String getDocumentIdGuid() {
    return documentIdGuid;
  }

  /**
   * setDocumentIdGuid.
   **/
  public void setDocumentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
  }


  /**
   * htmlDefinition.
   *
   * @return DocumentHtmlDefinitionOriginal
   **/
  public DocumentHtmlDefinitionOriginal htmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
    return this;
  }

  /**
   * Defines how to generate the responsive-formatted HTML for the document..
   * @return htmlDefinition
   **/
  @Schema(description = "Defines how to generate the responsive-formatted HTML for the document.")
  public DocumentHtmlDefinition getHtmlDefinition() {
    return htmlDefinition;
  }

  /**
   * setHtmlDefinition.
   **/
  public void setHtmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
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
    DocumentHtmlDefinitionOriginal documentHtmlDefinitionOriginal = (DocumentHtmlDefinitionOriginal) o;
    return Objects.equals(this.documentId, documentHtmlDefinitionOriginal.documentId) &&
        Objects.equals(this.documentIdGuid, documentHtmlDefinitionOriginal.documentIdGuid) &&
        Objects.equals(this.htmlDefinition, documentHtmlDefinitionOriginal.htmlDefinition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentIdGuid, htmlDefinition);
  }


  /**
   * Converts the given object to string.
   */
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

