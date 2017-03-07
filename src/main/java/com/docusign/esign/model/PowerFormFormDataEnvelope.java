package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PowerFormFormDataRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PowerFormFormDataEnvelope   {
  
  private String envelopeId = null;
  private java.util.List<PowerFormFormDataRecipient> recipients = new java.util.ArrayList<PowerFormFormDataRecipient>();

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * An array of powerform recipients.
   **/
  
  @ApiModelProperty(value = "An array of powerform recipients.")
  @JsonProperty("recipients")
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

    return true && Objects.equals(envelopeId, powerFormFormDataEnvelope.envelopeId) &&
        Objects.equals(recipients, powerFormFormDataEnvelope.recipients)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormFormDataEnvelope {\n");
    
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (recipients != null)
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

