package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.EnvelopeTransactionStatus;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Result set for the Envelopes: listStatusChanges method.
 *
 */
@Schema(description = "Result set for the Envelopes: listStatusChanges method")

public class EnvelopesInformation {
  @JsonProperty("continuationToken")
  private String continuationToken = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("envelopes")
  private java.util.List<Envelope> envelopes = null;

  @JsonProperty("envelopeSearchSource")
  private String envelopeSearchSource = null;

  @JsonProperty("envelopeTransactionStatuses")
  private java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses = null;

  @JsonProperty("folders")
  private java.util.List<Folder> folders = null;

  @JsonProperty("lastQueriedDateTime")
  private String lastQueriedDateTime = null;

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
   * continuationToken.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation continuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
    return this;
  }

  /**
   * .
   * @return continuationToken
   **/
  @Schema(description = "")
  public String getContinuationToken() {
    return continuationToken;
  }

  /**
   * setContinuationToken.
   **/
  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }


  /**
   * endPosition.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @Schema(description = "The last position in the result set. ")
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
   * envelopes.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation envelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  /**
   * addEnvelopesItem.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation addEnvelopesItem(Envelope envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new java.util.ArrayList<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * .
   * @return envelopes
   **/
  @Schema(description = "")
  public java.util.List<Envelope> getEnvelopes() {
    return envelopes;
  }

  /**
   * setEnvelopes.
   **/
  public void setEnvelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
  }


  /**
   * envelopeSearchSource.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation envelopeSearchSource(String envelopeSearchSource) {
    this.envelopeSearchSource = envelopeSearchSource;
    return this;
  }

  /**
   * .
   * @return envelopeSearchSource
   **/
  @Schema(description = "")
  public String getEnvelopeSearchSource() {
    return envelopeSearchSource;
  }

  /**
   * setEnvelopeSearchSource.
   **/
  public void setEnvelopeSearchSource(String envelopeSearchSource) {
    this.envelopeSearchSource = envelopeSearchSource;
  }


  /**
   * envelopeTransactionStatuses.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation envelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
    return this;
  }
  
  /**
   * addEnvelopeTransactionStatusesItem.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation addEnvelopeTransactionStatusesItem(EnvelopeTransactionStatus envelopeTransactionStatusesItem) {
    if (this.envelopeTransactionStatuses == null) {
      this.envelopeTransactionStatuses = new java.util.ArrayList<>();
    }
    this.envelopeTransactionStatuses.add(envelopeTransactionStatusesItem);
    return this;
  }

  /**
   * .
   * @return envelopeTransactionStatuses
   **/
  @Schema(description = "")
  public java.util.List<EnvelopeTransactionStatus> getEnvelopeTransactionStatuses() {
    return envelopeTransactionStatuses;
  }

  /**
   * setEnvelopeTransactionStatuses.
   **/
  public void setEnvelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
  }


  /**
   * folders.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }
  
  /**
   * addFoldersItem.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation addFoldersItem(Folder foldersItem) {
    if (this.folders == null) {
      this.folders = new java.util.ArrayList<>();
    }
    this.folders.add(foldersItem);
    return this;
  }

  /**
   * .
   * @return folders
   **/
  @Schema(description = "")
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
   * lastQueriedDateTime.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation lastQueriedDateTime(String lastQueriedDateTime) {
    this.lastQueriedDateTime = lastQueriedDateTime;
    return this;
  }

  /**
   * .
   * @return lastQueriedDateTime
   **/
  @Schema(description = "")
  public String getLastQueriedDateTime() {
    return lastQueriedDateTime;
  }

  /**
   * setLastQueriedDateTime.
   **/
  public void setLastQueriedDateTime(String lastQueriedDateTime) {
    this.lastQueriedDateTime = lastQueriedDateTime;
  }


  /**
   * nextUri.
   *
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. .
   * @return nextUri
   **/
  @Schema(description = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
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
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   * @return previousUri
   **/
  @Schema(description = "The postal code for the billing address.")
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
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @Schema(description = "The number of results returned in this response. ")
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
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @Schema(description = "Starting position of the current result set.")
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
   * @return EnvelopesInformation
   **/
  public EnvelopesInformation totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @Schema(description = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
    EnvelopesInformation envelopesInformation = (EnvelopesInformation) o;
    return Objects.equals(this.continuationToken, envelopesInformation.continuationToken) &&
        Objects.equals(this.endPosition, envelopesInformation.endPosition) &&
        Objects.equals(this.envelopes, envelopesInformation.envelopes) &&
        Objects.equals(this.envelopeSearchSource, envelopesInformation.envelopeSearchSource) &&
        Objects.equals(this.envelopeTransactionStatuses, envelopesInformation.envelopeTransactionStatuses) &&
        Objects.equals(this.folders, envelopesInformation.folders) &&
        Objects.equals(this.lastQueriedDateTime, envelopesInformation.lastQueriedDateTime) &&
        Objects.equals(this.nextUri, envelopesInformation.nextUri) &&
        Objects.equals(this.previousUri, envelopesInformation.previousUri) &&
        Objects.equals(this.resultSetSize, envelopesInformation.resultSetSize) &&
        Objects.equals(this.startPosition, envelopesInformation.startPosition) &&
        Objects.equals(this.totalSetSize, envelopesInformation.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(continuationToken, endPosition, envelopes, envelopeSearchSource, envelopeTransactionStatuses, folders, lastQueriedDateTime, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesInformation {\n");
    
    sb.append("    continuationToken: ").append(toIndentedString(continuationToken)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    envelopeSearchSource: ").append(toIndentedString(envelopeSearchSource)).append("\n");
    sb.append("    envelopeTransactionStatuses: ").append(toIndentedString(envelopeTransactionStatuses)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    lastQueriedDateTime: ").append(toIndentedString(lastQueriedDateTime)).append("\n");
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

