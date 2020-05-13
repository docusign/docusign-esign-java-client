package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopePurgeConfiguration
 */

public class EnvelopePurgeConfiguration {
  @JsonProperty("purgeEnvelopes")
  private String purgeEnvelopes = null;

  @JsonProperty("redactPII")
  private String redactPII = null;

  @JsonProperty("removeTabsAndEnvelopeAttachments")
  private String removeTabsAndEnvelopeAttachments = null;

  @JsonProperty("retentionDays")
  private String retentionDays = null;

  public EnvelopePurgeConfiguration purgeEnvelopes(String purgeEnvelopes) {
    this.purgeEnvelopes = purgeEnvelopes;
    return this;
  }

   /**
   * 
   * @return purgeEnvelopes
  **/
  @ApiModelProperty(value = "")
  public String getPurgeEnvelopes() {
    return purgeEnvelopes;
  }

  public void setPurgeEnvelopes(String purgeEnvelopes) {
    this.purgeEnvelopes = purgeEnvelopes;
  }

  public EnvelopePurgeConfiguration redactPII(String redactPII) {
    this.redactPII = redactPII;
    return this;
  }

   /**
   * 
   * @return redactPII
  **/
  @ApiModelProperty(value = "")
  public String getRedactPII() {
    return redactPII;
  }

  public void setRedactPII(String redactPII) {
    this.redactPII = redactPII;
  }

  public EnvelopePurgeConfiguration removeTabsAndEnvelopeAttachments(String removeTabsAndEnvelopeAttachments) {
    this.removeTabsAndEnvelopeAttachments = removeTabsAndEnvelopeAttachments;
    return this;
  }

   /**
   * 
   * @return removeTabsAndEnvelopeAttachments
  **/
  @ApiModelProperty(value = "")
  public String getRemoveTabsAndEnvelopeAttachments() {
    return removeTabsAndEnvelopeAttachments;
  }

  public void setRemoveTabsAndEnvelopeAttachments(String removeTabsAndEnvelopeAttachments) {
    this.removeTabsAndEnvelopeAttachments = removeTabsAndEnvelopeAttachments;
  }

  public EnvelopePurgeConfiguration retentionDays(String retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * 
   * @return retentionDays
  **/
  @ApiModelProperty(value = "")
  public String getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(String retentionDays) {
    this.retentionDays = retentionDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopePurgeConfiguration envelopePurgeConfiguration = (EnvelopePurgeConfiguration) o;
    return Objects.equals(this.purgeEnvelopes, envelopePurgeConfiguration.purgeEnvelopes) &&
        Objects.equals(this.redactPII, envelopePurgeConfiguration.redactPII) &&
        Objects.equals(this.removeTabsAndEnvelopeAttachments, envelopePurgeConfiguration.removeTabsAndEnvelopeAttachments) &&
        Objects.equals(this.retentionDays, envelopePurgeConfiguration.retentionDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purgeEnvelopes, redactPII, removeTabsAndEnvelopeAttachments, retentionDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePurgeConfiguration {\n");
    
    sb.append("    purgeEnvelopes: ").append(toIndentedString(purgeEnvelopes)).append("\n");
    sb.append("    redactPII: ").append(toIndentedString(redactPII)).append("\n");
    sb.append("    removeTabsAndEnvelopeAttachments: ").append(toIndentedString(removeTabsAndEnvelopeAttachments)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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

