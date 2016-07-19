package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EnvelopeAuditEvent   {
  
  private java.util.List<NameValue> eventFields = new java.util.ArrayList<NameValue>();

  
  /**
   * 
   **/
  public EnvelopeAuditEvent eventFields(java.util.List<NameValue> eventFields) {
    this.eventFields = eventFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventFields")
  public java.util.List<NameValue> getEventFields() {
    return eventFields;
  }
  public void setEventFields(java.util.List<NameValue> eventFields) {
    this.eventFields = eventFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAuditEvent envelopeAuditEvent = (EnvelopeAuditEvent) o;
    return Objects.equals(this.eventFields, envelopeAuditEvent.eventFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEvent {\n");
    
    sb.append("    eventFields: ").append(toIndentedString(eventFields)).append("\n");
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

