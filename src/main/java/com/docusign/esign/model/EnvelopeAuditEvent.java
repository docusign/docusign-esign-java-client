package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAuditEvent envelopeAuditEvent = (EnvelopeAuditEvent) o;

    return true && Objects.equals(eventFields, envelopeAuditEvent.eventFields)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAuditEvent {\n");
    
    if (eventFields != null)
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

