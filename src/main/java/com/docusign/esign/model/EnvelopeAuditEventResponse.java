package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeAuditEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeAuditEventResponse   {
  
  private java.util.List<EnvelopeAuditEvent> auditEvents = new java.util.ArrayList<EnvelopeAuditEvent>();

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("auditEvents")
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

    return true && Objects.equals(auditEvents, envelopeAuditEventResponse.auditEvents)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEventResponse {\n");
    
    if (auditEvents != null)
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

