package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Reminders   {
  
  private String reminderEnabled = null;
  private String reminderDelay = null;
  private String reminderFrequency = null;

  
  /**
   * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
   **/
  @ApiModelProperty(value = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
  @JsonProperty("reminderEnabled")
  public String getReminderEnabled() {
    return reminderEnabled;
  }
  public void setReminderEnabled(String reminderEnabled) {
    this.reminderEnabled = reminderEnabled;
  }

  
  /**
   * An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.
   **/
  @ApiModelProperty(value = "An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.")
  @JsonProperty("reminderDelay")
  public String getReminderDelay() {
    return reminderDelay;
  }
  public void setReminderDelay(String reminderDelay) {
    this.reminderDelay = reminderDelay;
  }

  
  /**
   * An interger that sets the interval, in days, between reminder emails.
   **/
  @ApiModelProperty(value = "An interger that sets the interval, in days, between reminder emails.")
  @JsonProperty("reminderFrequency")
  public String getReminderFrequency() {
    return reminderFrequency;
  }
  public void setReminderFrequency(String reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reminders reminders = (Reminders) o;
    return Objects.equals(reminderEnabled, reminders.reminderEnabled) &&
        Objects.equals(reminderDelay, reminders.reminderDelay) &&
        Objects.equals(reminderFrequency, reminders.reminderFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reminderEnabled, reminderDelay, reminderFrequency);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reminders {\n");
    
    sb.append("    reminderEnabled: ").append(StringUtil.toIndentedString(reminderEnabled)).append("\n");
    sb.append("    reminderDelay: ").append(StringUtil.toIndentedString(reminderDelay)).append("\n");
    sb.append("    reminderFrequency: ").append(StringUtil.toIndentedString(reminderFrequency)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
