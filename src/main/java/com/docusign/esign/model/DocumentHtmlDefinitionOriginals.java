package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentHtmlDefinitionOriginal;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDefinitionOriginals
 */

public class DocumentHtmlDefinitionOriginals {
  @JsonProperty("htmlDefinitions")
  private java.util.List<DocumentHtmlDefinitionOriginal> htmlDefinitions = new java.util.ArrayList<DocumentHtmlDefinitionOriginal>();

  public DocumentHtmlDefinitionOriginals htmlDefinitions(java.util.List<DocumentHtmlDefinitionOriginal> htmlDefinitions) {
    this.htmlDefinitions = htmlDefinitions;
    return this;
  }

  public DocumentHtmlDefinitionOriginals addHtmlDefinitionsItem(DocumentHtmlDefinitionOriginal htmlDefinitionsItem) {
    this.htmlDefinitions.add(htmlDefinitionsItem);
    return this;
  }

   /**
   * 
   * @return htmlDefinitions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DocumentHtmlDefinitionOriginal> getHtmlDefinitions() {
    return htmlDefinitions;
  }

  public void setHtmlDefinitions(java.util.List<DocumentHtmlDefinitionOriginal> htmlDefinitions) {
    this.htmlDefinitions = htmlDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentHtmlDefinitionOriginals documentHtmlDefinitionOriginals = (DocumentHtmlDefinitionOriginals) o;
    return Objects.equals(this.htmlDefinitions, documentHtmlDefinitionOriginals.htmlDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlDefinitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDefinitionOriginals {\n");
    
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

