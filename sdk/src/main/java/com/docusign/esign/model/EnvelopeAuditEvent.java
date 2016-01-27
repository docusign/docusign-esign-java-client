package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.NameValue;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EnvelopeAuditEvent   {
  
  private java.util.List<NameValue> eventFields = new java.util.ArrayList<NameValue>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("eventFields")
  public java.util.List<NameValue> getEventFields() {
    return eventFields;
  }
  public void setEventFields(java.util.List<NameValue> eventFields) {
    this.eventFields = eventFields;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAuditEvent envelopeAuditEvent = (EnvelopeAuditEvent) o;
    return Objects.equals(eventFields, envelopeAuditEvent.eventFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFields);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEvent {\n");
    
    sb.append("    eventFields: ").append(StringUtil.toIndentedString(eventFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
