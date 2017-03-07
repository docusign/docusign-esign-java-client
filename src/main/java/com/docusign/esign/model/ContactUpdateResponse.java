package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Contact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ContactUpdateResponse   {
  
  private java.util.List<Contact> contacts = new java.util.ArrayList<Contact>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contacts")
  public java.util.List<Contact> getContacts() {
    return contacts;
  }
  public void setContacts(java.util.List<Contact> contacts) {
    this.contacts = contacts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactUpdateResponse contactUpdateResponse = (ContactUpdateResponse) o;

    return true && Objects.equals(contacts, contactUpdateResponse.contacts)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactUpdateResponse {\n");
    
    if (contacts != null)
      sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

