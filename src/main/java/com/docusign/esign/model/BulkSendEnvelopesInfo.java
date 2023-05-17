package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BulkSendEnvelopesInfo.
 *
 */

public class BulkSendEnvelopesInfo {
  @JsonProperty("authoritativeCopy")
  private String authoritativeCopy = null;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("correct")
  private String correct = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("declined")
  private String declined = null;

  @JsonProperty("deleted")
  private String deleted = null;

  @JsonProperty("delivered")
  private String delivered = null;

  @JsonProperty("digitalSignaturesPending")
  private String digitalSignaturesPending = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("signed")
  private String signed = null;

  @JsonProperty("timedOut")
  private String timedOut = null;

  @JsonProperty("transferCompleted")
  private String transferCompleted = null;

  @JsonProperty("voided")
  private String voided = null;


  /**
   * authoritativeCopy.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

  /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled..
   * @return authoritativeCopy
   **/
  @Schema(description = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  /**
   * setAuthoritativeCopy.
   **/
  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }


  /**
   * completed.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo completed(String completed) {
    this.completed = completed;
    return this;
  }

  /**
   * .
   * @return completed
   **/
  @Schema(description = "")
  public String getCompleted() {
    return completed;
  }

  /**
   * setCompleted.
   **/
  public void setCompleted(String completed) {
    this.completed = completed;
  }


  /**
   * correct.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo correct(String correct) {
    this.correct = correct;
    return this;
  }

  /**
   * .
   * @return correct
   **/
  @Schema(description = "")
  public String getCorrect() {
    return correct;
  }

  /**
   * setCorrect.
   **/
  public void setCorrect(String correct) {
    this.correct = correct;
  }


  /**
   * created.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo created(String created) {
    this.created = created;
    return this;
  }

  /**
   * .
   * @return created
   **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  /**
   * setCreated.
   **/
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   * declined.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo declined(String declined) {
    this.declined = declined;
    return this;
  }

  /**
   * .
   * @return declined
   **/
  @Schema(description = "")
  public String getDeclined() {
    return declined;
  }

  /**
   * setDeclined.
   **/
  public void setDeclined(String declined) {
    this.declined = declined;
  }


  /**
   * deleted.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo deleted(String deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * .
   * @return deleted
   **/
  @Schema(description = "")
  public String getDeleted() {
    return deleted;
  }

  /**
   * setDeleted.
   **/
  public void setDeleted(String deleted) {
    this.deleted = deleted;
  }


  /**
   * delivered.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo delivered(String delivered) {
    this.delivered = delivered;
    return this;
  }

  /**
   * .
   * @return delivered
   **/
  @Schema(description = "")
  public String getDelivered() {
    return delivered;
  }

  /**
   * setDelivered.
   **/
  public void setDelivered(String delivered) {
    this.delivered = delivered;
  }


  /**
   * digitalSignaturesPending.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo digitalSignaturesPending(String digitalSignaturesPending) {
    this.digitalSignaturesPending = digitalSignaturesPending;
    return this;
  }

  /**
   * .
   * @return digitalSignaturesPending
   **/
  @Schema(description = "")
  public String getDigitalSignaturesPending() {
    return digitalSignaturesPending;
  }

  /**
   * setDigitalSignaturesPending.
   **/
  public void setDigitalSignaturesPending(String digitalSignaturesPending) {
    this.digitalSignaturesPending = digitalSignaturesPending;
  }


  /**
   * sent.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo sent(String sent) {
    this.sent = sent;
    return this;
  }

  /**
   * .
   * @return sent
   **/
  @Schema(description = "")
  public String getSent() {
    return sent;
  }

  /**
   * setSent.
   **/
  public void setSent(String sent) {
    this.sent = sent;
  }


  /**
   * signed.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo signed(String signed) {
    this.signed = signed;
    return this;
  }

  /**
   * .
   * @return signed
   **/
  @Schema(description = "")
  public String getSigned() {
    return signed;
  }

  /**
   * setSigned.
   **/
  public void setSigned(String signed) {
    this.signed = signed;
  }


  /**
   * timedOut.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo timedOut(String timedOut) {
    this.timedOut = timedOut;
    return this;
  }

  /**
   * .
   * @return timedOut
   **/
  @Schema(description = "")
  public String getTimedOut() {
    return timedOut;
  }

  /**
   * setTimedOut.
   **/
  public void setTimedOut(String timedOut) {
    this.timedOut = timedOut;
  }


  /**
   * transferCompleted.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo transferCompleted(String transferCompleted) {
    this.transferCompleted = transferCompleted;
    return this;
  }

  /**
   * .
   * @return transferCompleted
   **/
  @Schema(description = "")
  public String getTransferCompleted() {
    return transferCompleted;
  }

  /**
   * setTransferCompleted.
   **/
  public void setTransferCompleted(String transferCompleted) {
    this.transferCompleted = transferCompleted;
  }


  /**
   * voided.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo voided(String voided) {
    this.voided = voided;
    return this;
  }

  /**
   * .
   * @return voided
   **/
  @Schema(description = "")
  public String getVoided() {
    return voided;
  }

  /**
   * setVoided.
   **/
  public void setVoided(String voided) {
    this.voided = voided;
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
    BulkSendEnvelopesInfo bulkSendEnvelopesInfo = (BulkSendEnvelopesInfo) o;
    return Objects.equals(this.authoritativeCopy, bulkSendEnvelopesInfo.authoritativeCopy) &&
        Objects.equals(this.completed, bulkSendEnvelopesInfo.completed) &&
        Objects.equals(this.correct, bulkSendEnvelopesInfo.correct) &&
        Objects.equals(this.created, bulkSendEnvelopesInfo.created) &&
        Objects.equals(this.declined, bulkSendEnvelopesInfo.declined) &&
        Objects.equals(this.deleted, bulkSendEnvelopesInfo.deleted) &&
        Objects.equals(this.delivered, bulkSendEnvelopesInfo.delivered) &&
        Objects.equals(this.digitalSignaturesPending, bulkSendEnvelopesInfo.digitalSignaturesPending) &&
        Objects.equals(this.sent, bulkSendEnvelopesInfo.sent) &&
        Objects.equals(this.signed, bulkSendEnvelopesInfo.signed) &&
        Objects.equals(this.timedOut, bulkSendEnvelopesInfo.timedOut) &&
        Objects.equals(this.transferCompleted, bulkSendEnvelopesInfo.transferCompleted) &&
        Objects.equals(this.voided, bulkSendEnvelopesInfo.voided);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authoritativeCopy, completed, correct, created, declined, deleted, delivered, digitalSignaturesPending, sent, signed, timedOut, transferCompleted, voided);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendEnvelopesInfo {\n");
    
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    declined: ").append(toIndentedString(declined)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    digitalSignaturesPending: ").append(toIndentedString(digitalSignaturesPending)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
    sb.append("    transferCompleted: ").append(toIndentedString(transferCompleted)).append("\n");
    sb.append("    voided: ").append(toIndentedString(voided)).append("\n");
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

