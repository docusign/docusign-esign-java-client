package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PowerFormFormDataRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PowerFormFormDataEnvelope
 */

public class PowerFormFormDataEnvelope {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("recipients")
  private java.util.List<PowerFormFormDataRecipient> recipients = new java.util.ArrayList<PowerFormFormDataRecipient>();

  public PowerFormFormDataEnvelope envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public PowerFormFormDataEnvelope recipients(java.util.List<PowerFormFormDataRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PowerFormFormDataEnvelope addRecipientsItem(PowerFormFormDataRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * An array of powerform recipients.
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "An array of powerform recipients.")
  public java.util.List<PowerFormFormDataRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(java.util.List<PowerFormFormDataRecipient> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerFormFormDataEnvelope powerFormFormDataEnvelope = (PowerFormFormDataEnvelope) o;
    return Objects.equals(this.envelopeId, powerFormFormDataEnvelope.envelopeId) &&
        Objects.equals(this.recipients, powerFormFormDataEnvelope.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormFormDataEnvelope {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

