package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DocumentTemplateList. */
public class DocumentTemplateList {
  @JsonProperty("documentTemplates")
  private java.util.List<DocumentTemplate> documentTemplates = null;

  /**
   * documentTemplates.
   *
   * @return DocumentTemplateList
   */
  public DocumentTemplateList documentTemplates(
      java.util.List<DocumentTemplate> documentTemplates) {
    this.documentTemplates = documentTemplates;
    return this;
  }

  /**
   * addDocumentTemplatesItem.
   *
   * @return DocumentTemplateList
   */
  public DocumentTemplateList addDocumentTemplatesItem(DocumentTemplate documentTemplatesItem) {
    if (this.documentTemplates == null) {
      this.documentTemplates = new java.util.ArrayList<>();
    }
    this.documentTemplates.add(documentTemplatesItem);
    return this;
  }

  /**
   * .
   *
   * @return documentTemplates
   */
  @ApiModelProperty(value = "")
  public java.util.List<DocumentTemplate> getDocumentTemplates() {
    return documentTemplates;
  }

  /** setDocumentTemplates. */
  public void setDocumentTemplates(java.util.List<DocumentTemplate> documentTemplates) {
    this.documentTemplates = documentTemplates;
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
    DocumentTemplateList documentTemplateList = (DocumentTemplateList) o;
    return Objects.equals(this.documentTemplates, documentTemplateList.documentTemplates);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(documentTemplates);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplateList {\n");

    sb.append("    documentTemplates: ").append(toIndentedString(documentTemplates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
