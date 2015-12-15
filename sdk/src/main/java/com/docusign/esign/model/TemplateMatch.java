package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class TemplateMatch   {
  
  private String matchPercentage = null;
  private String documentStartPage = null;
  private String documentEndPage = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  @JsonProperty("documentEndPage")
  public String getDocumentEndPage() {
    return documentEndPage;
  }
  public void setDocumentEndPage(String documentEndPage) {
    this.documentEndPage = documentEndPage;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateMatch templateMatch = (TemplateMatch) o;
    return Objects.equals(matchPercentage, templateMatch.matchPercentage) &&
        Objects.equals(documentStartPage, templateMatch.documentStartPage) &&
        Objects.equals(documentEndPage, templateMatch.documentEndPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchPercentage, documentStartPage, documentEndPage);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMatch {\n");
    
    sb.append("    matchPercentage: ").append(StringUtil.toIndentedString(matchPercentage)).append("\n");
    sb.append("    documentStartPage: ").append(StringUtil.toIndentedString(documentStartPage)).append("\n");
    sb.append("    documentEndPage: ").append(StringUtil.toIndentedString(documentEndPage)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
