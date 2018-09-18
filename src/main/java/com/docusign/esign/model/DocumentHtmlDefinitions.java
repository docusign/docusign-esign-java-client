package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDefinitions
 */

public class DocumentHtmlDefinitions {
  @JsonProperty("htmlDefinitions")
  private java.util.List<String> htmlDefinitions = new java.util.ArrayList<String>();

  public DocumentHtmlDefinitions htmlDefinitions(java.util.List<String> htmlDefinitions) {
    this.htmlDefinitions = htmlDefinitions;
    return this;
  }

  public DocumentHtmlDefinitions addHtmlDefinitionsItem(String htmlDefinitionsItem) {
    this.htmlDefinitions.add(htmlDefinitionsItem);
    return this;
  }

   /**
   * 
   * @return htmlDefinitions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getHtmlDefinitions() {
    return htmlDefinitions;
  }

  public void setHtmlDefinitions(java.util.List<String> htmlDefinitions) {
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
    DocumentHtmlDefinitions documentHtmlDefinitions = (DocumentHtmlDefinitions) o;
    return Objects.equals(this.htmlDefinitions, documentHtmlDefinitions.htmlDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlDefinitions);
  }


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

