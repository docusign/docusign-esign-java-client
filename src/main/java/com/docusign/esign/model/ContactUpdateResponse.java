package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Contact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This response objects shows the updated details for the contacts..
 *
 */
@Schema(description = "This response objects shows the updated details for the contacts.")

public class ContactUpdateResponse {
  @JsonProperty("contacts")
  private java.util.List<Contact> contacts = null;

  /**
   * contacts.
   *
   * @return ContactUpdateResponse
   **/
  public ContactUpdateResponse contacts(java.util.List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * addContactsItem.
   *
   * @return ContactUpdateResponse
   **/
  public ContactUpdateResponse addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new java.util.ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * .
   * 
   * @return contacts
   **/
  @Schema(description = "")
  public java.util.List<Contact> getContacts() {
    return contacts;
  }

  /**
   * setContacts.
   **/
  public void setContacts(java.util.List<Contact> contacts) {
    this.contacts = contacts;
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
    ContactUpdateResponse contactUpdateResponse = (ContactUpdateResponse) o;
    return Objects.equals(this.contacts, contactUpdateResponse.contacts);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }

  /**
   * Converts the given object to string.
   */
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
