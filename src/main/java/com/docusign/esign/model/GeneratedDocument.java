package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * GeneratedDocument.
 *
 */

public class GeneratedDocument implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("documentAsBase64")
  private String documentAsBase64 = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("fileExtension")
  private String fileExtension = null;


  /**
   * documentAsBase64.
   *
   * @return GeneratedDocument
   **/
  public GeneratedDocument documentAsBase64(String documentAsBase64) {
    this.documentAsBase64 = documentAsBase64;
    return this;
  }

  /**
   * .
   * @return documentAsBase64
   **/
  @Schema(description = "")
  public String getDocumentAsBase64() {
    return documentAsBase64;
  }

  /**
   * setDocumentAsBase64.
   **/
  public void setDocumentAsBase64(String documentAsBase64) {
    this.documentAsBase64 = documentAsBase64;
  }


  /**
   * documentId.
   *
   * @return GeneratedDocument
   **/
  public GeneratedDocument documentId(String documentId) {
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
   * documentName.
   *
   * @return GeneratedDocument
   **/
  public GeneratedDocument documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * .
   * @return documentName
   **/
  @Schema(description = "")
  public String getDocumentName() {
    return documentName;
  }

  /**
   * setDocumentName.
   **/
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  /**
   * fileExtension.
   *
   * @return GeneratedDocument
   **/
  public GeneratedDocument fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * .
   * @return fileExtension
   **/
  @Schema(description = "")
  public String getFileExtension() {
    return fileExtension;
  }

  /**
   * setFileExtension.
   **/
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
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
    GeneratedDocument generatedDocument = (GeneratedDocument) o;
    return Objects.equals(this.documentAsBase64, generatedDocument.documentAsBase64) &&
        Objects.equals(this.documentId, generatedDocument.documentId) &&
        Objects.equals(this.documentName, generatedDocument.documentName) &&
        Objects.equals(this.fileExtension, generatedDocument.fileExtension);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentAsBase64, documentId, documentName, fileExtension);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratedDocument {\n");
    
    sb.append("    documentAsBase64: ").append(toIndentedString(documentAsBase64)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
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

