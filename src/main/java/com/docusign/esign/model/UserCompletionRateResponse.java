package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.TemplateCompletionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserCompletionRateResponse.
 *
 */

public class UserCompletionRateResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bottomTemplates")
  private java.util.List<TemplateCompletionInfo> bottomTemplates = null;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("completionRate")
  private String completionRate = null;

  @JsonProperty("expired")
  private String expired = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("topTemplates")
  private java.util.List<TemplateCompletionInfo> topTemplates = null;

  @JsonProperty("voided")
  private String voided = null;


  /**
   * bottomTemplates.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse bottomTemplates(java.util.List<TemplateCompletionInfo> bottomTemplates) {
    this.bottomTemplates = bottomTemplates;
    return this;
  }
  
  /**
   * addBottomTemplatesItem.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse addBottomTemplatesItem(TemplateCompletionInfo bottomTemplatesItem) {
    if (this.bottomTemplates == null) {
      this.bottomTemplates = new java.util.ArrayList<>();
    }
    this.bottomTemplates.add(bottomTemplatesItem);
    return this;
  }

  /**
   * .
   * @return bottomTemplates
   **/
  @Schema(description = "")
  public java.util.List<TemplateCompletionInfo> getBottomTemplates() {
    return bottomTemplates;
  }

  /**
   * setBottomTemplates.
   **/
  public void setBottomTemplates(java.util.List<TemplateCompletionInfo> bottomTemplates) {
    this.bottomTemplates = bottomTemplates;
  }


  /**
   * completed.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse completed(String completed) {
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
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse completionRate(String completionRate) {
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
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse expired(String expired) {
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
   * sent.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse sent(String sent) {
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
   * topTemplates.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse topTemplates(java.util.List<TemplateCompletionInfo> topTemplates) {
    this.topTemplates = topTemplates;
    return this;
  }
  
  /**
   * addTopTemplatesItem.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse addTopTemplatesItem(TemplateCompletionInfo topTemplatesItem) {
    if (this.topTemplates == null) {
      this.topTemplates = new java.util.ArrayList<>();
    }
    this.topTemplates.add(topTemplatesItem);
    return this;
  }

  /**
   * .
   * @return topTemplates
   **/
  @Schema(description = "")
  public java.util.List<TemplateCompletionInfo> getTopTemplates() {
    return topTemplates;
  }

  /**
   * setTopTemplates.
   **/
  public void setTopTemplates(java.util.List<TemplateCompletionInfo> topTemplates) {
    this.topTemplates = topTemplates;
  }


  /**
   * voided.
   *
   * @return UserCompletionRateResponse
   **/
  public UserCompletionRateResponse voided(String voided) {
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
    UserCompletionRateResponse userCompletionRateResponse = (UserCompletionRateResponse) o;
    return Objects.equals(this.bottomTemplates, userCompletionRateResponse.bottomTemplates) &&
        Objects.equals(this.completed, userCompletionRateResponse.completed) &&
        Objects.equals(this.completionRate, userCompletionRateResponse.completionRate) &&
        Objects.equals(this.expired, userCompletionRateResponse.expired) &&
        Objects.equals(this.sent, userCompletionRateResponse.sent) &&
        Objects.equals(this.topTemplates, userCompletionRateResponse.topTemplates) &&
        Objects.equals(this.voided, userCompletionRateResponse.voided);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bottomTemplates, completed, completionRate, expired, sent, topTemplates, voided);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompletionRateResponse {\n");
    
    sb.append("    bottomTemplates: ").append(toIndentedString(bottomTemplates)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completionRate: ").append(toIndentedString(completionRate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    topTemplates: ").append(toIndentedString(topTemplates)).append("\n");
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

