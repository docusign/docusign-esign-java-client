package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.EnvelopeAuditEvent;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAuditEventResponse envelopeAuditEventResponse = (EnvelopeAuditEventResponse) o;
    return Objects.equals(auditEvents, envelopeAuditEventResponse.auditEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditEvents);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEventResponse {\n");
    
    sb.append("    auditEvents: ").append(StringUtil.toIndentedString(auditEvents)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
