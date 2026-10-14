package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains information about the current envelope purge configuration for an account, which enables account administrators to purge documents from completed and voided envelopes after a set number of days (&#x60;retentionDays&#x60;). .
 *
 */
@Schema(description = "Contains information about the current envelope purge configuration for an account, which enables account administrators to purge documents from completed and voided envelopes after a set number of days (`retentionDays`). ")

public class EnvelopePurgeConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("applyPurgePolicyForUnaccountedRecipients")
  private String applyPurgePolicyForUnaccountedRecipients = null;

  @JsonProperty("purgeEnvelopes")
  private String purgeEnvelopes = null;

  @JsonProperty("purgeEnvelopesReceived")
  private String purgeEnvelopesReceived = null;

  @JsonProperty("redactPII")
  private String redactPII = null;

  @JsonProperty("redactPIIReceived")
  private String redactPIIReceived = null;

  @JsonProperty("removeTabsAndEnvelopeAttachments")
  private String removeTabsAndEnvelopeAttachments = null;

  @JsonProperty("retentionDays")
  private String retentionDays = null;


  /**
   * applyPurgePolicyForUnaccountedRecipients.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration applyPurgePolicyForUnaccountedRecipients(String applyPurgePolicyForUnaccountedRecipients) {
    this.applyPurgePolicyForUnaccountedRecipients = applyPurgePolicyForUnaccountedRecipients;
    return this;
  }

  /**
   * .
   * @return applyPurgePolicyForUnaccountedRecipients
   **/
  @Schema(description = "")
  public String getApplyPurgePolicyForUnaccountedRecipients() {
    return applyPurgePolicyForUnaccountedRecipients;
  }

  /**
   * setApplyPurgePolicyForUnaccountedRecipients.
   **/
  public void setApplyPurgePolicyForUnaccountedRecipients(String applyPurgePolicyForUnaccountedRecipients) {
    this.applyPurgePolicyForUnaccountedRecipients = applyPurgePolicyForUnaccountedRecipients;
  }


  /**
   * purgeEnvelopes.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration purgeEnvelopes(String purgeEnvelopes) {
    this.purgeEnvelopes = purgeEnvelopes;
    return this;
  }

  /**
   * .
   * @return purgeEnvelopes
   **/
  @Schema(description = "")
  public String getPurgeEnvelopes() {
    return purgeEnvelopes;
  }

  /**
   * setPurgeEnvelopes.
   **/
  public void setPurgeEnvelopes(String purgeEnvelopes) {
    this.purgeEnvelopes = purgeEnvelopes;
  }


  /**
   * purgeEnvelopesReceived.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration purgeEnvelopesReceived(String purgeEnvelopesReceived) {
    this.purgeEnvelopesReceived = purgeEnvelopesReceived;
    return this;
  }

  /**
   * .
   * @return purgeEnvelopesReceived
   **/
  @Schema(description = "")
  public String getPurgeEnvelopesReceived() {
    return purgeEnvelopesReceived;
  }

  /**
   * setPurgeEnvelopesReceived.
   **/
  public void setPurgeEnvelopesReceived(String purgeEnvelopesReceived) {
    this.purgeEnvelopesReceived = purgeEnvelopesReceived;
  }


  /**
   * redactPII.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration redactPII(String redactPII) {
    this.redactPII = redactPII;
    return this;
  }

  /**
   * .
   * @return redactPII
   **/
  @Schema(description = "")
  public String getRedactPII() {
    return redactPII;
  }

  /**
   * setRedactPII.
   **/
  public void setRedactPII(String redactPII) {
    this.redactPII = redactPII;
  }


  /**
   * redactPIIReceived.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration redactPIIReceived(String redactPIIReceived) {
    this.redactPIIReceived = redactPIIReceived;
    return this;
  }

  /**
   * .
   * @return redactPIIReceived
   **/
  @Schema(description = "")
  public String getRedactPIIReceived() {
    return redactPIIReceived;
  }

  /**
   * setRedactPIIReceived.
   **/
  public void setRedactPIIReceived(String redactPIIReceived) {
    this.redactPIIReceived = redactPIIReceived;
  }


  /**
   * removeTabsAndEnvelopeAttachments.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration removeTabsAndEnvelopeAttachments(String removeTabsAndEnvelopeAttachments) {
    this.removeTabsAndEnvelopeAttachments = removeTabsAndEnvelopeAttachments;
    return this;
  }

  /**
   * .
   * @return removeTabsAndEnvelopeAttachments
   **/
  @Schema(description = "")
  public String getRemoveTabsAndEnvelopeAttachments() {
    return removeTabsAndEnvelopeAttachments;
  }

  /**
   * setRemoveTabsAndEnvelopeAttachments.
   **/
  public void setRemoveTabsAndEnvelopeAttachments(String removeTabsAndEnvelopeAttachments) {
    this.removeTabsAndEnvelopeAttachments = removeTabsAndEnvelopeAttachments;
  }


  /**
   * retentionDays.
   *
   * @return EnvelopePurgeConfiguration
   **/
  public EnvelopePurgeConfiguration retentionDays(String retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * .
   * @return retentionDays
   **/
  @Schema(description = "")
  public String getRetentionDays() {
    return retentionDays;
  }

  /**
   * setRetentionDays.
   **/
  public void setRetentionDays(String retentionDays) {
    this.retentionDays = retentionDays;
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
    EnvelopePurgeConfiguration envelopePurgeConfiguration = (EnvelopePurgeConfiguration) o;
    return Objects.equals(this.applyPurgePolicyForUnaccountedRecipients, envelopePurgeConfiguration.applyPurgePolicyForUnaccountedRecipients) &&
        Objects.equals(this.purgeEnvelopes, envelopePurgeConfiguration.purgeEnvelopes) &&
        Objects.equals(this.purgeEnvelopesReceived, envelopePurgeConfiguration.purgeEnvelopesReceived) &&
        Objects.equals(this.redactPII, envelopePurgeConfiguration.redactPII) &&
        Objects.equals(this.redactPIIReceived, envelopePurgeConfiguration.redactPIIReceived) &&
        Objects.equals(this.removeTabsAndEnvelopeAttachments, envelopePurgeConfiguration.removeTabsAndEnvelopeAttachments) &&
        Objects.equals(this.retentionDays, envelopePurgeConfiguration.retentionDays);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(applyPurgePolicyForUnaccountedRecipients, purgeEnvelopes, purgeEnvelopesReceived, redactPII, redactPIIReceived, removeTabsAndEnvelopeAttachments, retentionDays);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePurgeConfiguration {\n");
    
    sb.append("    applyPurgePolicyForUnaccountedRecipients: ").append(toIndentedString(applyPurgePolicyForUnaccountedRecipients)).append("\n");
    sb.append("    purgeEnvelopes: ").append(toIndentedString(purgeEnvelopes)).append("\n");
    sb.append("    purgeEnvelopesReceived: ").append(toIndentedString(purgeEnvelopesReceived)).append("\n");
    sb.append("    redactPII: ").append(toIndentedString(redactPII)).append("\n");
    sb.append("    redactPIIReceived: ").append(toIndentedString(redactPIIReceived)).append("\n");
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

