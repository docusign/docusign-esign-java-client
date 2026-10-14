package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * PaymentAuditEvent.
 *
 */

public class PaymentAuditEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("actorDisplayName")
  private String actorDisplayName = null;

  @JsonProperty("eventDescription")
  private String eventDescription = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("responsibleActor")
  private String responsibleActor = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("timestamp")
  private String timestamp = null;


  /**
   * accountId.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope..
   * @return accountId
   **/
  @Schema(description = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * action.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent action(String action) {
    this.action = action;
    return this;
  }

  /**
   * .
   * @return action
   **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * actorDisplayName.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent actorDisplayName(String actorDisplayName) {
    this.actorDisplayName = actorDisplayName;
    return this;
  }

  /**
   * .
   * @return actorDisplayName
   **/
  @Schema(description = "")
  public String getActorDisplayName() {
    return actorDisplayName;
  }

  /**
   * setActorDisplayName.
   **/
  public void setActorDisplayName(String actorDisplayName) {
    this.actorDisplayName = actorDisplayName;
  }


  /**
   * eventDescription.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * .
   * @return eventDescription
   **/
  @Schema(description = "")
  public String getEventDescription() {
    return eventDescription;
  }

  /**
   * setEventDescription.
   **/
  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }


  /**
   * eventType.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * .
   * @return eventType
   **/
  @Schema(description = "")
  public String getEventType() {
    return eventType;
  }

  /**
   * setEventType.
   **/
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  /**
   * responsibleActor.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent responsibleActor(String responsibleActor) {
    this.responsibleActor = responsibleActor;
    return this;
  }

  /**
   * .
   * @return responsibleActor
   **/
  @Schema(description = "")
  public String getResponsibleActor() {
    return responsibleActor;
  }

  /**
   * setResponsibleActor.
   **/
  public void setResponsibleActor(String responsibleActor) {
    this.responsibleActor = responsibleActor;
  }


  /**
   * status.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * timestamp.
   *
   * @return PaymentAuditEvent
   **/
  public PaymentAuditEvent timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * .
   * @return timestamp
   **/
  @Schema(description = "")
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * setTimestamp.
   **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
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
    PaymentAuditEvent paymentAuditEvent = (PaymentAuditEvent) o;
    return Objects.equals(this.accountId, paymentAuditEvent.accountId) &&
        Objects.equals(this.action, paymentAuditEvent.action) &&
        Objects.equals(this.actorDisplayName, paymentAuditEvent.actorDisplayName) &&
        Objects.equals(this.eventDescription, paymentAuditEvent.eventDescription) &&
        Objects.equals(this.eventType, paymentAuditEvent.eventType) &&
        Objects.equals(this.responsibleActor, paymentAuditEvent.responsibleActor) &&
        Objects.equals(this.status, paymentAuditEvent.status) &&
        Objects.equals(this.timestamp, paymentAuditEvent.timestamp);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, actorDisplayName, eventDescription, eventType, responsibleActor, status, timestamp);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAuditEvent {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actorDisplayName: ").append(toIndentedString(actorDisplayName)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    responsibleActor: ").append(toIndentedString(responsibleActor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

