package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateMatch   {
  
  private String matchPercentage = null;
  private String documentStartPage = null;
  private String documentEndPage = null;

  
  /**
   * 
   **/
  public TemplateMatch matchPercentage(String matchPercentage) {
    this.matchPercentage = matchPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchPercentage")
  public String getMatchPercentage() {
    return matchPercentage;
  }
  public void setMatchPercentage(String matchPercentage) {
    this.matchPercentage = matchPercentage;
  }

  
  /**
   * 
   **/
  public TemplateMatch documentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentStartPage")
  public String getDocumentStartPage() {
    return documentStartPage;
  }
  public void setDocumentStartPage(String documentStartPage) {
    this.documentStartPage = documentStartPage;
  }

  
  /**
   * 
   **/
  public TemplateMatch documentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentEndPage")
  public String getDocumentEndPage() {
    return documentEndPage;
  }
  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
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
    return Objects.equals(this.matchPercentage, templateMatch.matchPercentage) &&
        Objects.equals(this.documentStartPage, templateMatch.documentStartPage) &&
        Objects.equals(this.documentEndPage, templateMatch.documentEndPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchPercentage, documentStartPage, documentEndPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMatch {\n");
    
    sb.append("    matchPercentage: ").append(toIndentedString(matchPercentage)).append("\n");
    sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
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

