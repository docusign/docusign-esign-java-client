package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TemplateDocumentsResult. */
public class TemplateDocumentsResult {
  @JsonProperty("templateDocuments")
  private java.util.List<EnvelopeDocument> templateDocuments = null;

  @JsonProperty("templateId")
  private String templateId = null;

  /**
   * templateDocuments.
   *
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult templateDocuments(
      java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
    return this;
  }

  /**
   * addTemplateDocumentsItem.
   *
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult addTemplateDocumentsItem(EnvelopeDocument templateDocumentsItem) {
    if (this.templateDocuments == null) {
      this.templateDocuments = new java.util.ArrayList<>();
    }
    this.templateDocuments.add(templateDocumentsItem);
    return this;
  }

  /**
   * .
   *
   * @return templateDocuments
   */
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeDocument> getTemplateDocuments() {
    return templateDocuments;
  }

  /** setTemplateDocuments. */
  public void setTemplateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
  }

  /**
   * templateId.
   *
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   * .
   *
   * @return templateId
   */
  @ApiModelProperty(
      value =
          "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /** setTemplateId. */
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
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
    TemplateDocumentsResult templateDocumentsResult = (TemplateDocumentsResult) o;
    return Objects.equals(this.templateDocuments, templateDocumentsResult.templateDocuments)
        && Objects.equals(this.templateId, templateDocumentsResult.templateId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(templateDocuments, templateId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDocumentsResult {\n");

    sb.append("    templateDocuments: ").append(toIndentedString(templateDocuments)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
