package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CaptiveRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CaptiveRecipientInformation
 */

public class CaptiveRecipientInformation {
  @JsonProperty("captiveRecipients")
  private java.util.List<CaptiveRecipient> captiveRecipients = new java.util.ArrayList<CaptiveRecipient>();

  public CaptiveRecipientInformation captiveRecipients(java.util.List<CaptiveRecipient> captiveRecipients) {
    this.captiveRecipients = captiveRecipients;
    return this;
  }

  public CaptiveRecipientInformation addCaptiveRecipientsItem(CaptiveRecipient captiveRecipientsItem) {
    this.captiveRecipients.add(captiveRecipientsItem);
    return this;
  }

   /**
   * A complex type containing information about one or more captive recipients.
   * @return captiveRecipients
  **/
  @ApiModelProperty(example = "null", value = "A complex type containing information about one or more captive recipients.")
  public java.util.List<CaptiveRecipient> getCaptiveRecipients() {
    return captiveRecipients;
  }

  public void setCaptiveRecipients(java.util.List<CaptiveRecipient> captiveRecipients) {
    this.captiveRecipients = captiveRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptiveRecipientInformation captiveRecipientInformation = (CaptiveRecipientInformation) o;
    return Objects.equals(this.captiveRecipients, captiveRecipientInformation.captiveRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captiveRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptiveRecipientInformation {\n");
    
    sb.append("    captiveRecipients: ").append(toIndentedString(captiveRecipients)).append("\n");
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

