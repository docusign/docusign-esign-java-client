package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SenderCompletionInfo.
 *
 */

public class SenderCompletionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("completionRate")
  private String completionRate = null;

  @JsonProperty("expired")
  private String expired = null;

  @JsonProperty("expiredRate")
  private String expiredRate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("senderId")
  private String senderId = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("voided")
  private String voided = null;

  @JsonProperty("voidedRate")
  private String voidedRate = null;


  /**
   * completed.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo completed(String completed) {
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
   * completionRate.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo completionRate(String completionRate) {
    this.completionRate = completionRate;
    return this;
  }

  /**
   * .
   * @return completionRate
   **/
  @Schema(description = "")
  public String getCompletionRate() {
    return completionRate;
  }

  /**
   * setCompletionRate.
   **/
  public void setCompletionRate(String completionRate) {
    this.completionRate = completionRate;
  }


  /**
   * expired.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo expired(String expired) {
    this.expired = expired;
    return this;
  }

  /**
   * .
   * @return expired
   **/
  @Schema(description = "")
  public String getExpired() {
    return expired;
  }

  /**
   * setExpired.
   **/
  public void setExpired(String expired) {
    this.expired = expired;
  }


  /**
   * expiredRate.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo expiredRate(String expiredRate) {
    this.expiredRate = expiredRate;
    return this;
  }

  /**
   * .
   * @return expiredRate
   **/
  @Schema(description = "")
  public String getExpiredRate() {
    return expiredRate;
  }

  /**
   * setExpiredRate.
   **/
  public void setExpiredRate(String expiredRate) {
    this.expiredRate = expiredRate;
  }


  /**
   * name.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * senderId.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * .
   * @return senderId
   **/
  @Schema(description = "")
  public String getSenderId() {
    return senderId;
  }

  /**
   * setSenderId.
   **/
  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  /**
   * sent.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo sent(String sent) {
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
   * voided.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo voided(String voided) {
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
   * voidedRate.
   *
   * @return SenderCompletionInfo
   **/
  public SenderCompletionInfo voidedRate(String voidedRate) {
    this.voidedRate = voidedRate;
    return this;
  }

  /**
   * .
   * @return voidedRate
   **/
  @Schema(description = "")
  public String getVoidedRate() {
    return voidedRate;
  }

  /**
   * setVoidedRate.
   **/
  public void setVoidedRate(String voidedRate) {
    this.voidedRate = voidedRate;
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
    SenderCompletionInfo senderCompletionInfo = (SenderCompletionInfo) o;
    return Objects.equals(this.completed, senderCompletionInfo.completed) &&
        Objects.equals(this.completionRate, senderCompletionInfo.completionRate) &&
        Objects.equals(this.expired, senderCompletionInfo.expired) &&
        Objects.equals(this.expiredRate, senderCompletionInfo.expiredRate) &&
        Objects.equals(this.name, senderCompletionInfo.name) &&
        Objects.equals(this.senderId, senderCompletionInfo.senderId) &&
        Objects.equals(this.sent, senderCompletionInfo.sent) &&
        Objects.equals(this.voided, senderCompletionInfo.voided) &&
        Objects.equals(this.voidedRate, senderCompletionInfo.voidedRate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(completed, completionRate, expired, expiredRate, name, senderId, sent, voided, voidedRate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderCompletionInfo {\n");
    
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completionRate: ").append(toIndentedString(completionRate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiredRate: ").append(toIndentedString(expiredRate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    voided: ").append(toIndentedString(voided)).append("\n");
    sb.append("    voidedRate: ").append(toIndentedString(voidedRate)).append("\n");
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

