package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeNotificationRequest
 */

public class EnvelopeNotificationRequest {
  @JsonProperty("expirations")
  private Expirations expirations = null;

  @JsonProperty("reminders")
  private Reminders reminders = null;

  @JsonProperty("useAccountDefaults")
  private String useAccountDefaults = null;

  public EnvelopeNotificationRequest expirations(Expirations expirations) {
    this.expirations = expirations;
    return this;
  }

   /**
   * Get expirations
   * @return expirations
  **/
  @ApiModelProperty(value = "")
  public Expirations getExpirations() {
    return expirations;
  }

  public void setExpirations(Expirations expirations) {
    this.expirations = expirations;
  }

  public EnvelopeNotificationRequest reminders(Reminders reminders) {
    this.reminders = reminders;
    return this;
  }

   /**
   * Get reminders
   * @return reminders
  **/
  @ApiModelProperty(value = "")
  public Reminders getReminders() {
    return reminders;
  }

  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }

  public EnvelopeNotificationRequest useAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
    return this;
  }

   /**
   * 
   * @return useAccountDefaults
  **/
  @ApiModelProperty(value = "")
  public String getUseAccountDefaults() {
    return useAccountDefaults;
  }

  public void setUseAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeNotificationRequest envelopeNotificationRequest = (EnvelopeNotificationRequest) o;
    return Objects.equals(this.expirations, envelopeNotificationRequest.expirations) &&
        Objects.equals(this.reminders, envelopeNotificationRequest.reminders) &&
        Objects.equals(this.useAccountDefaults, envelopeNotificationRequest.useAccountDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirations, reminders, useAccountDefaults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeNotificationRequest {\n");
    
    sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
    sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
    sb.append("    useAccountDefaults: ").append(toIndentedString(useAccountDefaults)).append("\n");
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

