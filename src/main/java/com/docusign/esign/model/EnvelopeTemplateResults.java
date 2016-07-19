package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeTemplateResult;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public EnvelopeTemplateResults envelopeTemplates(java.util.List<EnvelopeTemplateResult> envelopeTemplates) {
    this.envelopeTemplates = envelopeTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of requested templates.")
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
  public EnvelopeTemplateResults resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results returned in this response. ")
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
  public EnvelopeTemplateResults startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Starting position of the current result set.")
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
  public EnvelopeTemplateResults endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last position in the result set. ")
  @JsonProperty("endPosition")
  public String getEndPosition() {
    return endPosition;
  }
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  
  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  public EnvelopeTemplateResults totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
  public EnvelopeTemplateResults nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
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
  public EnvelopeTemplateResults previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The postal code for the billing address.")
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
  public EnvelopeTemplateResults folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("folders")
  public java.util.List<Folder> getFolders() {
    return folders;
  }
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTemplateResults envelopeTemplateResults = (EnvelopeTemplateResults) o;
    return Objects.equals(this.envelopeTemplates, envelopeTemplateResults.envelopeTemplates) &&
        Objects.equals(this.resultSetSize, envelopeTemplateResults.resultSetSize) &&
        Objects.equals(this.startPosition, envelopeTemplateResults.startPosition) &&
        Objects.equals(this.endPosition, envelopeTemplateResults.endPosition) &&
        Objects.equals(this.totalSetSize, envelopeTemplateResults.totalSetSize) &&
        Objects.equals(this.nextUri, envelopeTemplateResults.nextUri) &&
        Objects.equals(this.previousUri, envelopeTemplateResults.previousUri) &&
        Objects.equals(this.folders, envelopeTemplateResults.folders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeTemplates, resultSetSize, startPosition, endPosition, totalSetSize, nextUri, previousUri, folders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateResults {\n");
    
    sb.append("    envelopeTemplates: ").append(toIndentedString(envelopeTemplates)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
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

