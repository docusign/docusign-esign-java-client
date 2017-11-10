package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeAuditEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeAuditEventResponse
 */

public class EnvelopeAuditEventResponse {
  @JsonProperty("auditEvents")
  private java.util.List<EnvelopeAuditEvent> auditEvents = new java.util.ArrayList<EnvelopeAuditEvent>();

  public EnvelopeAuditEventResponse auditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
    return this;
  }

  public EnvelopeAuditEventResponse addAuditEventsItem(EnvelopeAuditEvent auditEventsItem) {
    this.auditEvents.add(auditEventsItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return auditEvents
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public java.util.List<EnvelopeAuditEvent> getAuditEvents() {
    return auditEvents;
  }

  public void setAuditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(auditEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEventResponse {\n");
    
    sb.append("    auditEvents: ").append(toIndentedString(auditEvents)).append("\n");
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

