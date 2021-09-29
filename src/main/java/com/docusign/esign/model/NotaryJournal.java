package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Jurisdiction;
import com.docusign.esign.model.NotaryJournalMetaData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotaryJournal.
 *
 */

public class NotaryJournal {
  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("jurisdiction")
  private Jurisdiction jurisdiction = null;

  @JsonProperty("notaryJournalId")
  private String notaryJournalId = null;

  @JsonProperty("notaryJournalMetaData")
  private NotaryJournalMetaData notaryJournalMetaData = null;

  @JsonProperty("signerName")
  private String signerName = null;


  /**
   * createdDate.
   *
   * @return NotaryJournal
   **/
  public NotaryJournal createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * .
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * documentName.
   *
   * @return NotaryJournal
   **/
  public NotaryJournal documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * .
   * @return documentName
   **/
  @ApiModelProperty(value = "")
  public String getDocumentName() {
    return documentName;
  }

  /**
   * setDocumentName.
   **/
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  /**
   * jurisdiction.
   *
   * @return NotaryJournal
   **/
  public NotaryJournal jurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Get jurisdiction.
   * @return jurisdiction
   **/
  @ApiModelProperty(value = "")
  public Jurisdiction getJurisdiction() {
    return jurisdiction;
  }

  /**
   * setJurisdiction.
   **/
  public void setJurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * notaryJournalId.
   *
   * @return NotaryJournal
   **/
  public NotaryJournal notaryJournalId(String notaryJournalId) {
    this.notaryJournalId = notaryJournalId;
    return this;
  }

  /**
   * .
   * @return notaryJournalId
   **/
  @ApiModelProperty(value = "")
  public String getNotaryJournalId() {
    return notaryJournalId;
  }

  /**
   * setNotaryJournalId.
   **/
  public void setNotaryJournalId(String notaryJournalId) {
    this.notaryJournalId = notaryJournalId;
  }


  /**
   * notaryJournalMetaData.
   *
   * @return NotaryJournal
   **/
  public NotaryJournal notaryJournalMetaData(NotaryJournalMetaData notaryJournalMetaData) {
    this.notaryJournalMetaData = notaryJournalMetaData;
    return this;
  }

  /**
   * Get notaryJournalMetaData.
   * @return notaryJournalMetaData
   **/
  @ApiModelProperty(value = "")
  public NotaryJournalMetaData getNotaryJournalMetaData() {
    return notaryJournalMetaData;
  }

  /**
   * setNotaryJournalMetaData.
   **/
  public void setNotaryJournalMetaData(NotaryJournalMetaData notaryJournalMetaData) {
    this.notaryJournalMetaData = notaryJournalMetaData;
  }


  /**
   * signerName.
   *
   * @return NotaryJournal
   **/
  public NotaryJournal signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * .
   * @return signerName
   **/
  @ApiModelProperty(value = "")
  public String getSignerName() {
    return signerName;
  }

  /**
   * setSignerName.
   **/
  public void setSignerName(String signerName) {
    this.signerName = signerName;
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
    NotaryJournal notaryJournal = (NotaryJournal) o;
    return Objects.equals(this.createdDate, notaryJournal.createdDate) &&
        Objects.equals(this.documentName, notaryJournal.documentName) &&
        Objects.equals(this.jurisdiction, notaryJournal.jurisdiction) &&
        Objects.equals(this.notaryJournalId, notaryJournal.notaryJournalId) &&
        Objects.equals(this.notaryJournalMetaData, notaryJournal.notaryJournalMetaData) &&
        Objects.equals(this.signerName, notaryJournal.signerName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(createdDate, documentName, jurisdiction, notaryJournalId, notaryJournalMetaData, signerName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryJournal {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    notaryJournalId: ").append(toIndentedString(notaryJournalId)).append("\n");
    sb.append("    notaryJournalMetaData: ").append(toIndentedString(notaryJournalMetaData)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
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

