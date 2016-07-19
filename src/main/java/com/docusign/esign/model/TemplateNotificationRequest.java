package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateNotificationRequest   {
  
  private String password = null;
  private String useAccountDefaults = null;
  private Reminders reminders = null;
  private Expirations expirations = null;

  
  /**
   * 
   **/
  public TemplateNotificationRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * When set to **true**, the account default notification settings are used for the envelope.
   **/
  public TemplateNotificationRequest useAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the account default notification settings are used for the envelope.")
  @JsonProperty("useAccountDefaults")
  public String getUseAccountDefaults() {
    return useAccountDefaults;
  }
  public void setUseAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
  }

  
  /**
   **/
  public TemplateNotificationRequest reminders(Reminders reminders) {
    this.reminders = reminders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reminders")
  public Reminders getReminders() {
    return reminders;
  }
  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }

  
  /**
   **/
  public TemplateNotificationRequest expirations(Expirations expirations) {
    this.expirations = expirations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirations")
  public Expirations getExpirations() {
    return expirations;
  }
  public void setExpirations(Expirations expirations) {
    this.expirations = expirations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateNotificationRequest templateNotificationRequest = (TemplateNotificationRequest) o;
    return Objects.equals(this.password, templateNotificationRequest.password) &&
        Objects.equals(this.useAccountDefaults, templateNotificationRequest.useAccountDefaults) &&
        Objects.equals(this.reminders, templateNotificationRequest.reminders) &&
        Objects.equals(this.expirations, templateNotificationRequest.expirations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, useAccountDefaults, reminders, expirations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateNotificationRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    useAccountDefaults: ").append(toIndentedString(useAccountDefaults)).append("\n");
    sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
    sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
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

