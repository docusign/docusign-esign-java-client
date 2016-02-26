package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class Notification   {
  
  private String useAccountDefaults = null;
  private Reminders reminders = null;
  private Expirations expirations = null;

  
  /**
   * When set to **true**, the account default notification settings are used for the envelope.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the account default notification settings are used for the envelope.")
  @JsonProperty("useAccountDefaults")
  public String getUseAccountDefaults() {
    return useAccountDefaults;
  }
  public void setUseAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reminders")
  public Reminders getReminders() {
    return reminders;
  }
  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
    Notification notification = (Notification) o;

    return true && Objects.equals(useAccountDefaults, notification.useAccountDefaults) &&
        Objects.equals(reminders, notification.reminders) &&
        Objects.equals(expirations, notification.expirations)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAccountDefaults, reminders, expirations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
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

