package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TemplateNotificationRequest.
 *
 */

public class TemplateNotificationRequest {
  @JsonProperty("expirations")
  private Expirations expirations = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("reminders")
  private Reminders reminders = null;

  @JsonProperty("useAccountDefaults")
  private String useAccountDefaults = null;


  /**
   * expirations.
   *
   * @return TemplateNotificationRequest
   **/
  public TemplateNotificationRequest expirations(Expirations expirations) {
    this.expirations = expirations;
    return this;
  }

  /**
   * A complex element that specifies the expiration settings for the envelope..
   * @return expirations
   **/
  @Schema(description = "A complex element that specifies the expiration settings for the envelope.")
  public Expirations getExpirations() {
    return expirations;
  }

  /**
   * setExpirations.
   **/
  public void setExpirations(Expirations expirations) {
    this.expirations = expirations;
  }


  /**
   * password.
   *
   * @return TemplateNotificationRequest
   **/
  public TemplateNotificationRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * reminders.
   *
   * @return TemplateNotificationRequest
   **/
  public TemplateNotificationRequest reminders(Reminders reminders) {
    this.reminders = reminders;
    return this;
  }

  /**
   * A complex element that specifies reminder settings for the envelope..
   * @return reminders
   **/
  @Schema(description = "A complex element that specifies reminder settings for the envelope.")
  public Reminders getReminders() {
    return reminders;
  }

  /**
   * setReminders.
   **/
  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }


  /**
   * useAccountDefaults.
   *
   * @return TemplateNotificationRequest
   **/
  public TemplateNotificationRequest useAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
    return this;
  }

  /**
   * When set to **true**, the account default notification settings are used for the envelope..
   * @return useAccountDefaults
   **/
  @Schema(description = "When set to **true**, the account default notification settings are used for the envelope.")
  public String getUseAccountDefaults() {
    return useAccountDefaults;
  }

  /**
   * setUseAccountDefaults.
   **/
  public void setUseAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
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
    TemplateNotificationRequest templateNotificationRequest = (TemplateNotificationRequest) o;
    return Objects.equals(this.expirations, templateNotificationRequest.expirations) &&
        Objects.equals(this.password, templateNotificationRequest.password) &&
        Objects.equals(this.reminders, templateNotificationRequest.reminders) &&
        Objects.equals(this.useAccountDefaults, templateNotificationRequest.useAccountDefaults);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expirations, password, reminders, useAccountDefaults);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateNotificationRequest {\n");
    
    sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

