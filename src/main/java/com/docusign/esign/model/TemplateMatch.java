package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TemplateMatch   {
  
  private String documentEndPage = null;
  private String documentStartPage = null;
  private String matchPercentage = null;

  
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
  @JsonProperty("matchPercentage")
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

    return true && Objects.equals(documentEndPage, templateMatch.documentEndPage) &&
        Objects.equals(documentStartPage, templateMatch.documentStartPage) &&
        Objects.equals(matchPercentage, templateMatch.matchPercentage)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentEndPage, documentStartPage, matchPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMatch {\n");
    
    if (documentEndPage != null)
      sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
    if (documentStartPage != null)
      sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    if (matchPercentage != null)
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

