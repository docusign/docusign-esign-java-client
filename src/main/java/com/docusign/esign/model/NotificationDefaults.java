package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NotificationDefaultSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationDefaults
 */

public class NotificationDefaults {
  @JsonProperty("apiEmailNotifications")
  private NotificationDefaultSettings apiEmailNotifications = null;

  @JsonProperty("emailNotifications")
  private NotificationDefaultSettings emailNotifications = null;

  public NotificationDefaults apiEmailNotifications(NotificationDefaultSettings apiEmailNotifications) {
    this.apiEmailNotifications = apiEmailNotifications;
    return this;
  }

   /**
   * Get apiEmailNotifications
   * @return apiEmailNotifications
  **/
  @ApiModelProperty(example = "null", value = "")
  public NotificationDefaultSettings getApiEmailNotifications() {
    return apiEmailNotifications;
  }

  public void setApiEmailNotifications(NotificationDefaultSettings apiEmailNotifications) {
    this.apiEmailNotifications = apiEmailNotifications;
  }

  public NotificationDefaults emailNotifications(NotificationDefaultSettings emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

   /**
   * Get emailNotifications
   * @return emailNotifications
  **/
  @ApiModelProperty(example = "null", value = "")
  public NotificationDefaultSettings getEmailNotifications() {
    return emailNotifications;
  }

  public void setEmailNotifications(NotificationDefaultSettings emailNotifications) {
    this.emailNotifications = emailNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDefaults notificationDefaults = (NotificationDefaults) o;
    return Objects.equals(this.apiEmailNotifications, notificationDefaults.apiEmailNotifications) &&
        Objects.equals(this.emailNotifications, notificationDefaults.emailNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiEmailNotifications, emailNotifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDefaults {\n");
    
    sb.append("    apiEmailNotifications: ").append(toIndentedString(apiEmailNotifications)).append("\n");
    sb.append("    emailNotifications: ").append(toIndentedString(emailNotifications)).append("\n");
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

