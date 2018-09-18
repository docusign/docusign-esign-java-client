package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element that specifies the notification options for the envelope. It consists of:  * useAccountDefaults - When set to **true**, the account default notification settings are used for the envelope.  * reminders - A complex element that specifies reminder settings for the envelope. It consists of:      * reminderEnabled - When set to **true**, a reminder message is sent to the recipient.    * reminderDelay - An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.     * reminderFrequency - An interger that sets the interval, in days, between reminder emails.   * expirations - A complex element that specifies the expiration settings for the envelope. It consists of:     * expireEnabled - When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.     * expireAfter - An integer that sets the number of days the envelope is active.    * expireWarn - An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.
 */
@ApiModel(description = "A complex element that specifies the notification options for the envelope. It consists of:  * useAccountDefaults - When set to **true**, the account default notification settings are used for the envelope.  * reminders - A complex element that specifies reminder settings for the envelope. It consists of:      * reminderEnabled - When set to **true**, a reminder message is sent to the recipient.    * reminderDelay - An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.     * reminderFrequency - An interger that sets the interval, in days, between reminder emails.   * expirations - A complex element that specifies the expiration settings for the envelope. It consists of:     * expireEnabled - When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.     * expireAfter - An integer that sets the number of days the envelope is active.    * expireWarn - An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")

public class Notification {
  @JsonProperty("expirations")
  private Expirations expirations = null;

  @JsonProperty("reminders")
  private Reminders reminders = null;

  @JsonProperty("useAccountDefaults")
  private String useAccountDefaults = null;

  public Notification expirations(Expirations expirations) {
    this.expirations = expirations;
    return this;
  }

   /**
   * Get expirations
   * @return expirations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Expirations getExpirations() {
    return expirations;
  }

  public void setExpirations(Expirations expirations) {
    this.expirations = expirations;
  }

  public Notification reminders(Reminders reminders) {
    this.reminders = reminders;
    return this;
  }

   /**
   * Get reminders
   * @return reminders
  **/
  @ApiModelProperty(example = "null", value = "")
  public Reminders getReminders() {
    return reminders;
  }

  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }

  public Notification useAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
    return this;
  }

   /**
   * When set to **true**, the account default notification settings are used for the envelope.
   * @return useAccountDefaults
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the account default notification settings are used for the envelope.")
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
    Notification notification = (Notification) o;
    return Objects.equals(this.expirations, notification.expirations) &&
        Objects.equals(this.reminders, notification.reminders) &&
        Objects.equals(this.useAccountDefaults, notification.useAccountDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirations, reminders, useAccountDefaults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
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

