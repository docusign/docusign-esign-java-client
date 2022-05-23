package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DocumentHtmlDefinitions. */
public class DocumentHtmlDefinitions {
  @JsonProperty("htmlDefinitions")
  private java.util.List<String> htmlDefinitions = null;

  /**
   * htmlDefinitions.
   *
   * @return DocumentHtmlDefinitions
   */
  public DocumentHtmlDefinitions htmlDefinitions(java.util.List<String> htmlDefinitions) {
    this.htmlDefinitions = htmlDefinitions;
    return this;
  }

  /**
   * addHtmlDefinitionsItem.
   *
   * @return DocumentHtmlDefinitions
   */
  public DocumentHtmlDefinitions addHtmlDefinitionsItem(String htmlDefinitionsItem) {
    if (this.htmlDefinitions == null) {
      this.htmlDefinitions = new java.util.ArrayList<>();
    }
    this.htmlDefinitions.add(htmlDefinitionsItem);
    return this;
  }

  /**
   * .
   *
   * @return htmlDefinitions
   */
  @ApiModelProperty(value = "")
  public java.util.List<String> getHtmlDefinitions() {
    return htmlDefinitions;
  }

  /** setHtmlDefinitions. */
  public void setHtmlDefinitions(java.util.List<String> htmlDefinitions) {
    this.htmlDefinitions = htmlDefinitions;
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
    DocumentHtmlDefinitions documentHtmlDefinitions = (DocumentHtmlDefinitions) o;
    return Objects.equals(this.htmlDefinitions, documentHtmlDefinitions.htmlDefinitions);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(htmlDefinitions);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDefinitions {\n");

    sb.append("    htmlDefinitions: ").append(toIndentedString(htmlDefinitions)).append("\n");
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
