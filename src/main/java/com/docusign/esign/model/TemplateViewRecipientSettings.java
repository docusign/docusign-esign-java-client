package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * TemplateViewRecipientSettings.
 *
 */

public class TemplateViewRecipientSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("showContactsList")
  private String showContactsList = null;

  @JsonProperty("showEditMessage")
  private String showEditMessage = null;

  @JsonProperty("showEditRecipients")
  private String showEditRecipients = null;


  /**
   * showContactsList.
   *
   * @return TemplateViewRecipientSettings
   **/
  public TemplateViewRecipientSettings showContactsList(String showContactsList) {
    this.showContactsList = showContactsList;
    return this;
  }

  /**
   * .
   * @return showContactsList
   **/
  @Schema(description = "")
  public String getShowContactsList() {
    return showContactsList;
  }

  /**
   * setShowContactsList.
   **/
  public void setShowContactsList(String showContactsList) {
    this.showContactsList = showContactsList;
  }


  /**
   * showEditMessage.
   *
   * @return TemplateViewRecipientSettings
   **/
  public TemplateViewRecipientSettings showEditMessage(String showEditMessage) {
    this.showEditMessage = showEditMessage;
    return this;
  }

  /**
   * .
   * @return showEditMessage
   **/
  @Schema(description = "")
  public String getShowEditMessage() {
    return showEditMessage;
  }

  /**
   * setShowEditMessage.
   **/
  public void setShowEditMessage(String showEditMessage) {
    this.showEditMessage = showEditMessage;
  }


  /**
   * showEditRecipients.
   *
   * @return TemplateViewRecipientSettings
   **/
  public TemplateViewRecipientSettings showEditRecipients(String showEditRecipients) {
    this.showEditRecipients = showEditRecipients;
    return this;
  }

  /**
   * .
   * @return showEditRecipients
   **/
  @Schema(description = "")
  public String getShowEditRecipients() {
    return showEditRecipients;
  }

  /**
   * setShowEditRecipients.
   **/
  public void setShowEditRecipients(String showEditRecipients) {
    this.showEditRecipients = showEditRecipients;
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
    TemplateViewRecipientSettings templateViewRecipientSettings = (TemplateViewRecipientSettings) o;
    return Objects.equals(this.showContactsList, templateViewRecipientSettings.showContactsList) &&
        Objects.equals(this.showEditMessage, templateViewRecipientSettings.showEditMessage) &&
        Objects.equals(this.showEditRecipients, templateViewRecipientSettings.showEditRecipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(showContactsList, showEditMessage, showEditRecipients);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateViewRecipientSettings {\n");
    
    sb.append("    showContactsList: ").append(toIndentedString(showContactsList)).append("\n");
    sb.append("    showEditMessage: ").append(toIndentedString(showEditMessage)).append("\n");
    sb.append("    showEditRecipients: ").append(toIndentedString(showEditRecipients)).append("\n");
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

