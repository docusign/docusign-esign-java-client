package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeAuditEventResponse. */
public class EnvelopeAuditEventResponse {
  @JsonProperty("auditEvents")
  private java.util.List<EnvelopeAuditEvent> auditEvents = null;

  /**
   * auditEvents.
   *
   * @return EnvelopeAuditEventResponse
   */
  public EnvelopeAuditEventResponse auditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
    return this;
  }

  /**
   * addAuditEventsItem.
   *
   * @return EnvelopeAuditEventResponse
   */
  public EnvelopeAuditEventResponse addAuditEventsItem(EnvelopeAuditEvent auditEventsItem) {
    if (this.auditEvents == null) {
      this.auditEvents = new java.util.ArrayList<>();
    }
    this.auditEvents.add(auditEventsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return auditEvents
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<EnvelopeAuditEvent> getAuditEvents() {
    return auditEvents;
  }

  /** setAuditEvents. */
  public void setAuditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
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
    return Objects.equals(this.auditEvents, envelopeAuditEventResponse.auditEvents);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(auditEvents);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEventResponse {\n");

    sb.append("    auditEvents: ").append(toIndentedString(auditEvents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
