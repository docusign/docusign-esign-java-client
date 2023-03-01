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
 * The request object containing the new information for the contacts..
 *
 */
@Schema(description = "The request object containing the new information for the contacts.")

public class ContactModRequest {
  @JsonProperty("contactList")
  private java.util.List<Contact> contactList = null;

  /**
   * contactList.
   *
   * @return ContactModRequest
   **/
  public ContactModRequest contactList(java.util.List<Contact> contactList) {
    this.contactList = contactList;
    return this;
  }

  /**
   * addContactListItem.
   *
   * @return ContactModRequest
   **/
  public ContactModRequest addContactListItem(Contact contactListItem) {
    if (this.contactList == null) {
      this.contactList = new java.util.ArrayList<>();
    }
    this.contactList.add(contactListItem);
    return this;
  }

  /**
   * .
   * 
   * @return contactList
   **/
  @Schema(description = "")
  public java.util.List<Contact> getContactList() {
    return contactList;
  }

  /**
   * setContactList.
   **/
  public void setContactList(java.util.List<Contact> contactList) {
    this.contactList = contactList;
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
    ContactModRequest contactModRequest = (ContactModRequest) o;
    return Objects.equals(this.contactList, contactModRequest.contactList);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(contactList);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactModRequest {\n");

    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
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
