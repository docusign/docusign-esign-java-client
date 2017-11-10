package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Jurisdiction;
import com.docusign.esign.model.NotaryJournalMetaData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotaryJournal
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

  public NotaryJournal createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public NotaryJournal documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

   /**
   * 
   * @return documentName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public NotaryJournal jurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(example = "null", value = "")
  public Jurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(Jurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public NotaryJournal notaryJournalId(String notaryJournalId) {
    this.notaryJournalId = notaryJournalId;
    return this;
  }

   /**
   * 
   * @return notaryJournalId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNotaryJournalId() {
    return notaryJournalId;
  }

  public void setNotaryJournalId(String notaryJournalId) {
    this.notaryJournalId = notaryJournalId;
  }

  public NotaryJournal notaryJournalMetaData(NotaryJournalMetaData notaryJournalMetaData) {
    this.notaryJournalMetaData = notaryJournalMetaData;
    return this;
  }

   /**
   * Get notaryJournalMetaData
   * @return notaryJournalMetaData
  **/
  @ApiModelProperty(example = "null", value = "")
  public NotaryJournalMetaData getNotaryJournalMetaData() {
    return notaryJournalMetaData;
  }

  public void setNotaryJournalMetaData(NotaryJournalMetaData notaryJournalMetaData) {
    this.notaryJournalMetaData = notaryJournalMetaData;
  }

  public NotaryJournal signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

   /**
   * 
   * @return signerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, documentName, jurisdiction, notaryJournalId, notaryJournalMetaData, signerName);
  }


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

