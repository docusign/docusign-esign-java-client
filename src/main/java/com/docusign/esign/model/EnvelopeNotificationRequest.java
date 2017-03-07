package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeNotificationRequest   {
  
  private Expirations expirations = null;
  private Reminders reminders = null;
  private String useAccountDefaults = null;

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useAccountDefaults")
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

    return true && Objects.equals(expirations, envelopeNotificationRequest.expirations) &&
        Objects.equals(reminders, envelopeNotificationRequest.reminders) &&
        Objects.equals(useAccountDefaults, envelopeNotificationRequest.useAccountDefaults)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirations, reminders, useAccountDefaults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeNotificationRequest {\n");
    
    if (expirations != null)
      sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
    if (reminders != null)
      sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
    if (useAccountDefaults != null)
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

