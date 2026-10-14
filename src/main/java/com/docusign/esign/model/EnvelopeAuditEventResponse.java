package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeAuditEvent;
import com.docusign.esign.model.PaymentAuditEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopeAuditEventResponse.
 *
 */

public class EnvelopeAuditEventResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("auditEvents")
  private java.util.List<EnvelopeAuditEvent> auditEvents = null;

  @JsonProperty("paymentEvents")
  private java.util.List<PaymentAuditEvent> paymentEvents = null;


  /**
   * auditEvents.
   *
   * @return EnvelopeAuditEventResponse
   **/
  public EnvelopeAuditEventResponse auditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
    return this;
  }
  
  /**
   * addAuditEventsItem.
   *
   * @return EnvelopeAuditEventResponse
   **/
  public EnvelopeAuditEventResponse addAuditEventsItem(EnvelopeAuditEvent auditEventsItem) {
    if (this.auditEvents == null) {
      this.auditEvents = new java.util.ArrayList<>();
    }
    this.auditEvents.add(auditEventsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return auditEvents
   **/
  @Schema(description = "Reserved: TBD")
  public java.util.List<EnvelopeAuditEvent> getAuditEvents() {
    return auditEvents;
  }

  /**
   * setAuditEvents.
   **/
  public void setAuditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
  }


  /**
   * paymentEvents.
   *
   * @return EnvelopeAuditEventResponse
   **/
  public EnvelopeAuditEventResponse paymentEvents(java.util.List<PaymentAuditEvent> paymentEvents) {
    this.paymentEvents = paymentEvents;
    return this;
  }
  
  /**
   * addPaymentEventsItem.
   *
   * @return EnvelopeAuditEventResponse
   **/
  public EnvelopeAuditEventResponse addPaymentEventsItem(PaymentAuditEvent paymentEventsItem) {
    if (this.paymentEvents == null) {
      this.paymentEvents = new java.util.ArrayList<>();
    }
    this.paymentEvents.add(paymentEventsItem);
    return this;
  }

  /**
   * .
   * @return paymentEvents
   **/
  @Schema(description = "")
  public java.util.List<PaymentAuditEvent> getPaymentEvents() {
    return paymentEvents;
  }

  /**
   * setPaymentEvents.
   **/
  public void setPaymentEvents(java.util.List<PaymentAuditEvent> paymentEvents) {
    this.paymentEvents = paymentEvents;
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
    EnvelopeAuditEventResponse envelopeAuditEventResponse = (EnvelopeAuditEventResponse) o;
    return Objects.equals(this.auditEvents, envelopeAuditEventResponse.auditEvents) &&
        Objects.equals(this.paymentEvents, envelopeAuditEventResponse.paymentEvents);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(auditEvents, paymentEvents);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEventResponse {\n");
    
    sb.append("    auditEvents: ").append(toIndentedString(auditEvents)).append("\n");
    sb.append("    paymentEvents: ").append(toIndentedString(paymentEvents)).append("\n");
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

