package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SenderCompletionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * TemplateCompletionRateResponse.
 *
 */

public class TemplateCompletionRateResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bottomSenders")
  private java.util.List<SenderCompletionInfo> bottomSenders = null;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("completionRate")
  private String completionRate = null;

  @JsonProperty("expired")
  private String expired = null;

  @JsonProperty("expiredRate")
  private String expiredRate = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("topSenders")
  private java.util.List<SenderCompletionInfo> topSenders = null;

  @JsonProperty("voided")
  private String voided = null;

  @JsonProperty("voidedRate")
  private String voidedRate = null;


  /**
   * bottomSenders.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse bottomSenders(java.util.List<SenderCompletionInfo> bottomSenders) {
    this.bottomSenders = bottomSenders;
    return this;
  }
  
  /**
   * addBottomSendersItem.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse addBottomSendersItem(SenderCompletionInfo bottomSendersItem) {
    if (this.bottomSenders == null) {
      this.bottomSenders = new java.util.ArrayList<>();
    }
    this.bottomSenders.add(bottomSendersItem);
    return this;
  }

  /**
   * .
   * @return bottomSenders
   **/
  @Schema(description = "")
  public java.util.List<SenderCompletionInfo> getBottomSenders() {
    return bottomSenders;
  }

  /**
   * setBottomSenders.
   **/
  public void setBottomSenders(java.util.List<SenderCompletionInfo> bottomSenders) {
    this.bottomSenders = bottomSenders;
  }


  /**
   * completed.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse completed(String completed) {
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
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse completionRate(String completionRate) {
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
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse expired(String expired) {
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
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse expiredRate(String expiredRate) {
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
   * sent.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse sent(String sent) {
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
   * topSenders.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse topSenders(java.util.List<SenderCompletionInfo> topSenders) {
    this.topSenders = topSenders;
    return this;
  }
  
  /**
   * addTopSendersItem.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse addTopSendersItem(SenderCompletionInfo topSendersItem) {
    if (this.topSenders == null) {
      this.topSenders = new java.util.ArrayList<>();
    }
    this.topSenders.add(topSendersItem);
    return this;
  }

  /**
   * .
   * @return topSenders
   **/
  @Schema(description = "")
  public java.util.List<SenderCompletionInfo> getTopSenders() {
    return topSenders;
  }

  /**
   * setTopSenders.
   **/
  public void setTopSenders(java.util.List<SenderCompletionInfo> topSenders) {
    this.topSenders = topSenders;
  }


  /**
   * voided.
   *
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse voided(String voided) {
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
   * @return TemplateCompletionRateResponse
   **/
  public TemplateCompletionRateResponse voidedRate(String voidedRate) {
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
    TemplateCompletionRateResponse templateCompletionRateResponse = (TemplateCompletionRateResponse) o;
    return Objects.equals(this.bottomSenders, templateCompletionRateResponse.bottomSenders) &&
        Objects.equals(this.completed, templateCompletionRateResponse.completed) &&
        Objects.equals(this.completionRate, templateCompletionRateResponse.completionRate) &&
        Objects.equals(this.expired, templateCompletionRateResponse.expired) &&
        Objects.equals(this.expiredRate, templateCompletionRateResponse.expiredRate) &&
        Objects.equals(this.sent, templateCompletionRateResponse.sent) &&
        Objects.equals(this.topSenders, templateCompletionRateResponse.topSenders) &&
        Objects.equals(this.voided, templateCompletionRateResponse.voided) &&
        Objects.equals(this.voidedRate, templateCompletionRateResponse.voidedRate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bottomSenders, completed, completionRate, expired, expiredRate, sent, topSenders, voided, voidedRate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCompletionRateResponse {\n");
    
    sb.append("    bottomSenders: ").append(toIndentedString(bottomSenders)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completionRate: ").append(toIndentedString(completionRate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiredRate: ").append(toIndentedString(expiredRate)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    topSenders: ").append(toIndentedString(topSenders)).append("\n");
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

