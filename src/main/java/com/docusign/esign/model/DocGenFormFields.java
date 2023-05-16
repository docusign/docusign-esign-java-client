package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocGenFormField;
import com.docusign.esign.model.DocGenSyntaxError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocGenFormFields.
 *
 */

public class DocGenFormFields {
  @JsonProperty("docGenDocumentStatus")
  private String docGenDocumentStatus = null;

  @JsonProperty("docGenErrors")
  private java.util.List<DocGenSyntaxError> docGenErrors = null;

  @JsonProperty("docGenFormFieldList")
  private java.util.List<DocGenFormField> docGenFormFieldList = null;

  @JsonProperty("documentId")
  private String documentId = null;


  /**
   * docGenDocumentStatus.
   *
   * @return DocGenFormFields
   **/
  public DocGenFormFields docGenDocumentStatus(String docGenDocumentStatus) {
    this.docGenDocumentStatus = docGenDocumentStatus;
    return this;
  }

  /**
   * .
   * @return docGenDocumentStatus
   **/
  @Schema(description = "")
  public String getDocGenDocumentStatus() {
    return docGenDocumentStatus;
  }

  /**
   * setDocGenDocumentStatus.
   **/
  public void setDocGenDocumentStatus(String docGenDocumentStatus) {
    this.docGenDocumentStatus = docGenDocumentStatus;
  }


  /**
   * docGenErrors.
   *
   * @return DocGenFormFields
   **/
  public DocGenFormFields docGenErrors(java.util.List<DocGenSyntaxError> docGenErrors) {
    this.docGenErrors = docGenErrors;
    return this;
  }
  
  /**
   * addDocGenErrorsItem.
   *
   * @return DocGenFormFields
   **/
  public DocGenFormFields addDocGenErrorsItem(DocGenSyntaxError docGenErrorsItem) {
    if (this.docGenErrors == null) {
      this.docGenErrors = new java.util.ArrayList<>();
    }
    this.docGenErrors.add(docGenErrorsItem);
    return this;
  }

  /**
   * .
   * @return docGenErrors
   **/
  @Schema(description = "")
  public java.util.List<DocGenSyntaxError> getDocGenErrors() {
    return docGenErrors;
  }

  /**
   * setDocGenErrors.
   **/
  public void setDocGenErrors(java.util.List<DocGenSyntaxError> docGenErrors) {
    this.docGenErrors = docGenErrors;
  }


  /**
   * docGenFormFieldList.
   *
   * @return DocGenFormFields
   **/
  public DocGenFormFields docGenFormFieldList(java.util.List<DocGenFormField> docGenFormFieldList) {
    this.docGenFormFieldList = docGenFormFieldList;
    return this;
  }
  
  /**
   * addDocGenFormFieldListItem.
   *
   * @return DocGenFormFields
   **/
  public DocGenFormFields addDocGenFormFieldListItem(DocGenFormField docGenFormFieldListItem) {
    if (this.docGenFormFieldList == null) {
      this.docGenFormFieldList = new java.util.ArrayList<>();
    }
    this.docGenFormFieldList.add(docGenFormFieldListItem);
    return this;
  }

  /**
   * .
   * @return docGenFormFieldList
   **/
  @Schema(description = "")
  public java.util.List<DocGenFormField> getDocGenFormFieldList() {
    return docGenFormFieldList;
  }

  /**
   * setDocGenFormFieldList.
   **/
  public void setDocGenFormFieldList(java.util.List<DocGenFormField> docGenFormFieldList) {
    this.docGenFormFieldList = docGenFormFieldList;
  }


  /**
   * documentId.
   *
   * @return DocGenFormFields
   **/
  public DocGenFormFields documentId(String documentId) {
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
    DocGenFormFields docGenFormFields = (DocGenFormFields) o;
    return Objects.equals(this.docGenDocumentStatus, docGenFormFields.docGenDocumentStatus) &&
        Objects.equals(this.docGenErrors, docGenFormFields.docGenErrors) &&
        Objects.equals(this.docGenFormFieldList, docGenFormFields.docGenFormFieldList) &&
        Objects.equals(this.documentId, docGenFormFields.documentId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(docGenDocumentStatus, docGenErrors, docGenFormFieldList, documentId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenFormFields {\n");
    
    sb.append("    docGenDocumentStatus: ").append(toIndentedString(docGenDocumentStatus)).append("\n");
    sb.append("    docGenErrors: ").append(toIndentedString(docGenErrors)).append("\n");
    sb.append("    docGenFormFieldList: ").append(toIndentedString(docGenFormFieldList)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

