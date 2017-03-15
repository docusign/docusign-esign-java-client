package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CaptiveRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CaptiveRecipientInformation   {
  
  private java.util.List<CaptiveRecipient> captiveRecipients = new java.util.ArrayList<CaptiveRecipient>();

  
  /**
   * A complex type containing information about one or more captive recipients.
   **/
  
  @ApiModelProperty(value = "A complex type containing information about one or more captive recipients.")
  @JsonProperty("captiveRecipients")
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

    return true && Objects.equals(captiveRecipients, captiveRecipientInformation.captiveRecipients)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(captiveRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptiveRecipientInformation {\n");
    
    if (captiveRecipients != null)
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

