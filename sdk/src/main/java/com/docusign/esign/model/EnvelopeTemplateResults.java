package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.EnvelopeTemplateResult;
import com.docusign.esign.model.Folder;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EnvelopeTemplateResults   {
  
  private java.util.List<EnvelopeTemplateResult> envelopeTemplates = new java.util.ArrayList<EnvelopeTemplateResult>();
  private String resultSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String totalSetSize = null;
  private String nextUri = null;
  private String previousUri = null;
  private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();

  
  /**
   * The list of requested templates.
   **/
  @ApiModelProperty(value = "The list of requested templates.")
  @JsonProperty("envelopeTemplates")
  public java.util.List<EnvelopeTemplateResult> getEnvelopeTemplates() {
    return envelopeTemplates;
  }
  public void setEnvelopeTemplates(java.util.List<EnvelopeTemplateResult> envelopeTemplates) {
    this.envelopeTemplates = envelopeTemplates;
  }

  
  /**
   * The number of results returned in this response.
   **/
  @ApiModelProperty(value = "The number of results returned in this response.")
  @JsonProperty("resultSetSize")
  public String getResultSetSize() {
    return resultSetSize;
  }
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  
  /**
   * Starting position of the current result set.
   **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  @JsonProperty("startPosition")
  public String getStartPosition() {
    return startPosition;
  }
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  
  /**
   * The last position in the result set.
   **/
  @ApiModelProperty(value = "The last position in the result set.")
  @JsonProperty("endPosition")
  public String getEndPosition() {
    return endPosition;
  }
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  
  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the `resultSetSize` property.
   **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the `resultSetSize` property.")
  @JsonProperty("totalSetSize")
  public String getTotalSetSize() {
    return totalSetSize;
  }
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  
  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
   **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  
  /**
   * The postal code for the billing address.
   **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("folders")
  public java.util.List<Folder> getFolders() {
    return folders;
  }
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTemplateResults envelopeTemplateResults = (EnvelopeTemplateResults) o;
    return Objects.equals(envelopeTemplates, envelopeTemplateResults.envelopeTemplates) &&
        Objects.equals(resultSetSize, envelopeTemplateResults.resultSetSize) &&
        Objects.equals(startPosition, envelopeTemplateResults.startPosition) &&
        Objects.equals(endPosition, envelopeTemplateResults.endPosition) &&
        Objects.equals(totalSetSize, envelopeTemplateResults.totalSetSize) &&
        Objects.equals(nextUri, envelopeTemplateResults.nextUri) &&
        Objects.equals(previousUri, envelopeTemplateResults.previousUri) &&
        Objects.equals(folders, envelopeTemplateResults.folders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeTemplates, resultSetSize, startPosition, endPosition, totalSetSize, nextUri, previousUri, folders);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateResults {\n");
    
    sb.append("    envelopeTemplates: ").append(StringUtil.toIndentedString(envelopeTemplates)).append("\n");
    sb.append("    resultSetSize: ").append(StringUtil.toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(StringUtil.toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(StringUtil.toIndentedString(endPosition)).append("\n");
    sb.append("    totalSetSize: ").append(StringUtil.toIndentedString(totalSetSize)).append("\n");
    sb.append("    nextUri: ").append(StringUtil.toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(StringUtil.toIndentedString(previousUri)).append("\n");
    sb.append("    folders: ").append(StringUtil.toIndentedString(folders)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
