package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeTemplateResult;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeTemplateResults.
 *
 */

public class EnvelopeTemplateResults {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("envelopeTemplates")
  private java.util.List<EnvelopeTemplateResult> envelopeTemplates = null;

  @JsonProperty("folders")
  private java.util.List<Folder> folders = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;


  /**
   * endPosition.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * envelopeTemplates.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults envelopeTemplates(java.util.List<EnvelopeTemplateResult> envelopeTemplates) {
    this.envelopeTemplates = envelopeTemplates;
    return this;
  }
  
  /**
   * addEnvelopeTemplatesItem.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults addEnvelopeTemplatesItem(EnvelopeTemplateResult envelopeTemplatesItem) {
    if (this.envelopeTemplates == null) {
      this.envelopeTemplates = new java.util.ArrayList<EnvelopeTemplateResult>();
    }
    this.envelopeTemplates.add(envelopeTemplatesItem);
    return this;
  }

  /**
   * The list of requested templates..
   * @return envelopeTemplates
   **/
  @ApiModelProperty(value = "The list of requested templates.")
  public java.util.List<EnvelopeTemplateResult> getEnvelopeTemplates() {
    return envelopeTemplates;
  }

  /**
   * setEnvelopeTemplates.
   **/
  public void setEnvelopeTemplates(java.util.List<EnvelopeTemplateResult> envelopeTemplates) {
    this.envelopeTemplates = envelopeTemplates;
  }


  /**
   * folders.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }
  
  /**
   * addFoldersItem.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults addFoldersItem(Folder foldersItem) {
    if (this.folders == null) {
      this.folders = new java.util.ArrayList<Folder>();
    }
    this.folders.add(foldersItem);
    return this;
  }

  /**
   * .
   * @return folders
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  /**
   * setFolders.
   **/
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }


  /**
   * nextUri.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. .
   * @return nextUri
   **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * previousUri.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   * @return previousUri
   **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /**
   * setPreviousUri.
   **/
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * resultSetSize.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * totalSetSize.
   *
   * @return EnvelopeTemplateResults
   **/
  public EnvelopeTemplateResults totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
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
    EnvelopeTemplateResults envelopeTemplateResults = (EnvelopeTemplateResults) o;
    return Objects.equals(this.endPosition, envelopeTemplateResults.endPosition) &&
        Objects.equals(this.envelopeTemplates, envelopeTemplateResults.envelopeTemplates) &&
        Objects.equals(this.folders, envelopeTemplateResults.folders) &&
        Objects.equals(this.nextUri, envelopeTemplateResults.nextUri) &&
        Objects.equals(this.previousUri, envelopeTemplateResults.previousUri) &&
        Objects.equals(this.resultSetSize, envelopeTemplateResults.resultSetSize) &&
        Objects.equals(this.startPosition, envelopeTemplateResults.startPosition) &&
        Objects.equals(this.totalSetSize, envelopeTemplateResults.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endPosition, envelopeTemplates, folders, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateResults {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    envelopeTemplates: ").append(toIndentedString(envelopeTemplates)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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

