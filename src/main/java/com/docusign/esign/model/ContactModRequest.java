package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Contact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ContactModRequest
 */

public class ContactModRequest {
  @JsonProperty("contactList")
  private java.util.List<Contact> contactList = new java.util.ArrayList<Contact>();

  public ContactModRequest contactList(java.util.List<Contact> contactList) {
    this.contactList = contactList;
    return this;
  }

  public ContactModRequest addContactListItem(Contact contactListItem) {
    this.contactList.add(contactListItem);
    return this;
  }

   /**
   * 
   * @return contactList
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Contact> getContactList() {
    return contactList;
  }

  public void setContactList(java.util.List<Contact> contactList) {
    this.contactList = contactList;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(contactList);
  }


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

