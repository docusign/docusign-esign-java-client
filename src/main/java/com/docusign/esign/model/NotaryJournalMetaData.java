package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NotaryJournalCredibleWitness;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotaryJournalMetaData
 */

public class NotaryJournalMetaData {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("credibleWitnesses")
  private java.util.List<NotaryJournalCredibleWitness> credibleWitnesses = null;

  @JsonProperty("signatureImage")
  private String signatureImage = null;

  @JsonProperty("signerIdType")
  private String signerIdType = null;

  public NotaryJournalMetaData comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * 
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public NotaryJournalMetaData credibleWitnesses(java.util.List<NotaryJournalCredibleWitness> credibleWitnesses) {
    this.credibleWitnesses = credibleWitnesses;
    return this;
  }

  public NotaryJournalMetaData addCredibleWitnessesItem(NotaryJournalCredibleWitness credibleWitnessesItem) {
    if (this.credibleWitnesses == null) {
      this.credibleWitnesses = new java.util.ArrayList<NotaryJournalCredibleWitness>();
    }
    this.credibleWitnesses.add(credibleWitnessesItem);
    return this;
  }

   /**
   * 
   * @return credibleWitnesses
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NotaryJournalCredibleWitness> getCredibleWitnesses() {
    return credibleWitnesses;
  }

  public void setCredibleWitnesses(java.util.List<NotaryJournalCredibleWitness> credibleWitnesses) {
    this.credibleWitnesses = credibleWitnesses;
  }

  public NotaryJournalMetaData signatureImage(String signatureImage) {
    this.signatureImage = signatureImage;
    return this;
  }

   /**
   * 
   * @return signatureImage
  **/
  @ApiModelProperty(value = "")
  public String getSignatureImage() {
    return signatureImage;
  }

  public void setSignatureImage(String signatureImage) {
    this.signatureImage = signatureImage;
  }

  public NotaryJournalMetaData signerIdType(String signerIdType) {
    this.signerIdType = signerIdType;
    return this;
  }

   /**
   * 
   * @return signerIdType
  **/
  @ApiModelProperty(value = "")
  public String getSignerIdType() {
    return signerIdType;
  }

  public void setSignerIdType(String signerIdType) {
    this.signerIdType = signerIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotaryJournalMetaData notaryJournalMetaData = (NotaryJournalMetaData) o;
    return Objects.equals(this.comment, notaryJournalMetaData.comment) &&
        Objects.equals(this.credibleWitnesses, notaryJournalMetaData.credibleWitnesses) &&
        Objects.equals(this.signatureImage, notaryJournalMetaData.signatureImage) &&
        Objects.equals(this.signerIdType, notaryJournalMetaData.signerIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, credibleWitnesses, signatureImage, signerIdType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryJournalMetaData {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    credibleWitnesses: ").append(toIndentedString(credibleWitnesses)).append("\n");
    sb.append("    signatureImage: ").append(toIndentedString(signatureImage)).append("\n");
    sb.append("    signerIdType: ").append(toIndentedString(signerIdType)).append("\n");
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

