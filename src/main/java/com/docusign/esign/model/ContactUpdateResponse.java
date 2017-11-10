package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Contact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ContactUpdateResponse
 */

public class ContactUpdateResponse {
  @JsonProperty("contacts")
  private java.util.List<Contact> contacts = new java.util.ArrayList<Contact>();

  public ContactUpdateResponse contacts(java.util.List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ContactUpdateResponse addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * 
   * @return contacts
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.contacts, contactUpdateResponse.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactUpdateResponse {\n");
    
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

