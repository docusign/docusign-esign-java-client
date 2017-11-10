package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateMatch
 */

public class TemplateMatch {
  @JsonProperty("documentEndPage")
  private String documentEndPage = null;

  @JsonProperty("documentStartPage")
  private String documentStartPage = null;

  @JsonProperty("matchPercentage")
  private String matchPercentage = null;

  public TemplateMatch documentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
    return this;
  }

   /**
   * 
   * @return documentEndPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentEndPage() {
    return documentEndPage;
  }

  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
  }

  public TemplateMatch documentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
    return this;
  }

   /**
   * 
   * @return documentStartPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentStartPage() {
    return documentStartPage;
  }

  public void setDocumentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
  }

  public TemplateMatch matchPercentage(String matchPercentage) {
    this.matchPercentage = matchPercentage;
    return this;
  }

   /**
   * 
   * @return matchPercentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchPercentage() {
    return matchPercentage;
  }

  public void setMatchPercentage(String matchPercentage) {
    this.matchPercentage = matchPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateMatch templateMatch = (TemplateMatch) o;
    return Objects.equals(this.documentEndPage, templateMatch.documentEndPage) &&
        Objects.equals(this.documentStartPage, templateMatch.documentStartPage) &&
        Objects.equals(this.matchPercentage, templateMatch.matchPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentEndPage, documentStartPage, matchPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMatch {\n");
    
    sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
    sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    sb.append("    matchPercentage: ").append(toIndentedString(matchPercentage)).append("\n");
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

