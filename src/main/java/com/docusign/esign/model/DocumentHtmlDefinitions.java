package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocumentHtmlDefinitions.
 *
 */

public class DocumentHtmlDefinitions implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("htmlDefinitions")
  private java.util.List<String> htmlDefinitions = null;


  /**
   * htmlDefinitions.
   *
   * @return DocumentHtmlDefinitions
   **/
  public DocumentHtmlDefinitions htmlDefinitions(java.util.List<String> htmlDefinitions) {
    this.htmlDefinitions = htmlDefinitions;
    return this;
  }
  
  /**
   * addHtmlDefinitionsItem.
   *
   * @return DocumentHtmlDefinitions
   **/
  public DocumentHtmlDefinitions addHtmlDefinitionsItem(String htmlDefinitionsItem) {
    if (this.htmlDefinitions == null) {
      this.htmlDefinitions = new java.util.ArrayList<>();
    }
    this.htmlDefinitions.add(htmlDefinitionsItem);
    return this;
  }

  /**
   * .
   * @return htmlDefinitions
   **/
  @Schema(description = "")
  public java.util.List<String> getHtmlDefinitions() {
    return htmlDefinitions;
  }

  /**
   * setHtmlDefinitions.
   **/
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(htmlDefinitions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDefinitions {\n");
    
    sb.append("    htmlDefinitions: ").append(toIndentedString(htmlDefinitions)).append("\n");
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

