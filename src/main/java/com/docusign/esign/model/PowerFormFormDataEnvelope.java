package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PowerFormFormDataRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PowerFormFormDataEnvelope.
 *
 */

public class PowerFormFormDataEnvelope {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("recipients")
  private java.util.List<PowerFormFormDataRecipient> recipients = null;


  /**
   * envelopeId.
   *
   * @return PowerFormFormDataEnvelope
   **/
  public PowerFormFormDataEnvelope envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * recipients.
   *
   * @return PowerFormFormDataEnvelope
   **/
  public PowerFormFormDataEnvelope recipients(java.util.List<PowerFormFormDataRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }
  
  /**
   * addRecipientsItem.
   *
   * @return PowerFormFormDataEnvelope
   **/
  public PowerFormFormDataEnvelope addRecipientsItem(PowerFormFormDataRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * An array of powerform recipients..
   * @return recipients
   **/
  @ApiModelProperty(value = "An array of powerform recipients.")
  public java.util.List<PowerFormFormDataRecipient> getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(java.util.List<PowerFormFormDataRecipient> recipients) {
    this.recipients = recipients;
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
    PowerFormFormDataEnvelope powerFormFormDataEnvelope = (PowerFormFormDataEnvelope) o;
    return Objects.equals(this.envelopeId, powerFormFormDataEnvelope.envelopeId) &&
        Objects.equals(this.recipients, powerFormFormDataEnvelope.recipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, recipients);
  }


  /**
   * Converts the given object to string.
   */
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

