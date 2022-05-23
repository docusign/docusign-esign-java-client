package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TemplateDocumentVisibilityList. */
public class TemplateDocumentVisibilityList {
  @JsonProperty("documentVisibility")
  private java.util.List<DocumentVisibility> documentVisibility = null;

  /**
   * documentVisibility.
   *
   * @return TemplateDocumentVisibilityList
   */
  public TemplateDocumentVisibilityList documentVisibility(
      java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

  /**
   * addDocumentVisibilityItem.
   *
   * @return TemplateDocumentVisibilityList
   */
  public TemplateDocumentVisibilityList addDocumentVisibilityItem(
      DocumentVisibility documentVisibilityItem) {
    if (this.documentVisibility == null) {
      this.documentVisibility = new java.util.ArrayList<>();
    }
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

  /**
   * .
   *
   * @return documentVisibility
   */
  @ApiModelProperty(value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  /** setDocumentVisibility. */
  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
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
    TemplateDocumentVisibilityList templateDocumentVisibilityList =
        (TemplateDocumentVisibilityList) o;
    return Objects.equals(
        this.documentVisibility, templateDocumentVisibilityList.documentVisibility);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(documentVisibility);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDocumentVisibilityList {\n");

    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
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
