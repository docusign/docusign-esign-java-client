package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopeViewRecipientSettings.
 *
 */

public class EnvelopeViewRecipientSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("showBulkSend")
  private String showBulkSend = null;

  @JsonProperty("showContactsList")
  private String showContactsList = null;

  @JsonProperty("showEditMessage")
  private String showEditMessage = null;

  @JsonProperty("showEditRecipients")
  private String showEditRecipients = null;


  /**
   * showBulkSend.
   *
   * @return EnvelopeViewRecipientSettings
   **/
  public EnvelopeViewRecipientSettings showBulkSend(String showBulkSend) {
    this.showBulkSend = showBulkSend;
    return this;
  }

  /**
   * .
   * @return showBulkSend
   **/
  @Schema(description = "")
  public String getShowBulkSend() {
    return showBulkSend;
  }

  /**
   * setShowBulkSend.
   **/
  public void setShowBulkSend(String showBulkSend) {
    this.showBulkSend = showBulkSend;
  }


  /**
   * showContactsList.
   *
   * @return EnvelopeViewRecipientSettings
   **/
  public EnvelopeViewRecipientSettings showContactsList(String showContactsList) {
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
   * @return EnvelopeViewRecipientSettings
   **/
  public EnvelopeViewRecipientSettings showEditMessage(String showEditMessage) {
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
   * @return EnvelopeViewRecipientSettings
   **/
  public EnvelopeViewRecipientSettings showEditRecipients(String showEditRecipients) {
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
    EnvelopeViewRecipientSettings envelopeViewRecipientSettings = (EnvelopeViewRecipientSettings) o;
    return Objects.equals(this.showBulkSend, envelopeViewRecipientSettings.showBulkSend) &&
        Objects.equals(this.showContactsList, envelopeViewRecipientSettings.showContactsList) &&
        Objects.equals(this.showEditMessage, envelopeViewRecipientSettings.showEditMessage) &&
        Objects.equals(this.showEditRecipients, envelopeViewRecipientSettings.showEditRecipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(showBulkSend, showContactsList, showEditMessage, showEditRecipients);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewRecipientSettings {\n");
    
    sb.append("    showBulkSend: ").append(toIndentedString(showBulkSend)).append("\n");
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

