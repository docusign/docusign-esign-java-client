package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * TemplateCompletionInfo.
 *
 */

public class TemplateCompletionInfo implements Serializable {
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

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("voided")
  private String voided = null;

  @JsonProperty("voidedRate")
  private String voidedRate = null;


  /**
   * completed.
   *
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo completed(String completed) {
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
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo completionRate(String completionRate) {
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
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo expired(String expired) {
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
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo expiredRate(String expiredRate) {
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
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo name(String name) {
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
   * sent.
   *
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo sent(String sent) {
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
   * templateId.
   *
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @Schema(description = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * voided.
   *
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo voided(String voided) {
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
   * @return TemplateCompletionInfo
   **/
  public TemplateCompletionInfo voidedRate(String voidedRate) {
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
    TemplateCompletionInfo templateCompletionInfo = (TemplateCompletionInfo) o;
    return Objects.equals(this.completed, templateCompletionInfo.completed) &&
        Objects.equals(this.completionRate, templateCompletionInfo.completionRate) &&
        Objects.equals(this.expired, templateCompletionInfo.expired) &&
        Objects.equals(this.expiredRate, templateCompletionInfo.expiredRate) &&
        Objects.equals(this.name, templateCompletionInfo.name) &&
        Objects.equals(this.sent, templateCompletionInfo.sent) &&
        Objects.equals(this.templateId, templateCompletionInfo.templateId) &&
        Objects.equals(this.voided, templateCompletionInfo.voided) &&
        Objects.equals(this.voidedRate, templateCompletionInfo.voidedRate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(completed, completionRate, expired, expiredRate, name, sent, templateId, voided, voidedRate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCompletionInfo {\n");
    
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completionRate: ").append(toIndentedString(completionRate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiredRate: ").append(toIndentedString(expiredRate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

