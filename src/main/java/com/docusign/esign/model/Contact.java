package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ContactPhoneNumber;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contact
 */

public class Contact {
  @JsonProperty("contactId")
  private String contactId = null;

  @JsonProperty("contactPhoneNumbers")
  private java.util.List<ContactPhoneNumber> contactPhoneNumbers = null;

  @JsonProperty("contactUri")
  private String contactUri = null;

  @JsonProperty("emails")
  private java.util.List<String> emails = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("signingGroup")
  private String signingGroup = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  public Contact contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * 
   * @return contactId
  **/
  @ApiModelProperty(value = "")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public Contact contactPhoneNumbers(java.util.List<ContactPhoneNumber> contactPhoneNumbers) {
    this.contactPhoneNumbers = contactPhoneNumbers;
    return this;
  }

  public Contact addContactPhoneNumbersItem(ContactPhoneNumber contactPhoneNumbersItem) {
    if (this.contactPhoneNumbers == null) {
      this.contactPhoneNumbers = new java.util.ArrayList<ContactPhoneNumber>();
    }
    this.contactPhoneNumbers.add(contactPhoneNumbersItem);
    return this;
  }

   /**
   * 
   * @return contactPhoneNumbers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ContactPhoneNumber> getContactPhoneNumbers() {
    return contactPhoneNumbers;
  }

  public void setContactPhoneNumbers(java.util.List<ContactPhoneNumber> contactPhoneNumbers) {
    this.contactPhoneNumbers = contactPhoneNumbers;
  }

  public Contact contactUri(String contactUri) {
    this.contactUri = contactUri;
    return this;
  }

   /**
   * 
   * @return contactUri
  **/
  @ApiModelProperty(value = "")
  public String getContactUri() {
    return contactUri;
  }

  public void setContactUri(String contactUri) {
    this.contactUri = contactUri;
  }

  public Contact emails(java.util.List<String> emails) {
    this.emails = emails;
    return this;
  }

  public Contact addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new java.util.ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * 
   * @return emails
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getEmails() {
    return emails;
  }

  public void setEmails(java.util.List<String> emails) {
    this.emails = emails;
  }

  public Contact errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Contact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contact organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * 
   * @return organization
  **/
  @ApiModelProperty(value = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public Contact shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public Contact signingGroup(String signingGroup) {
    this.signingGroup = signingGroup;
    return this;
  }

   /**
   * 
   * @return signingGroup
  **/
  @ApiModelProperty(value = "")
  public String getSigningGroup() {
    return signingGroup;
  }

  public void setSigningGroup(String signingGroup) {
    this.signingGroup = signingGroup;
  }

  public Contact signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

   /**
   * The display name for the signing group.   Maximum Length: 100 characters. 
   * @return signingGroupName
  **/
  @ApiModelProperty(value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactId, contact.contactId) &&
        Objects.equals(this.contactPhoneNumbers, contact.contactPhoneNumbers) &&
        Objects.equals(this.contactUri, contact.contactUri) &&
        Objects.equals(this.emails, contact.emails) &&
        Objects.equals(this.errorDetails, contact.errorDetails) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.organization, contact.organization) &&
        Objects.equals(this.shared, contact.shared) &&
        Objects.equals(this.signingGroup, contact.signingGroup) &&
        Objects.equals(this.signingGroupName, contact.signingGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactPhoneNumbers, contactUri, emails, errorDetails, name, organization, shared, signingGroup, signingGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactPhoneNumbers: ").append(toIndentedString(contactPhoneNumbers)).append("\n");
    sb.append("    contactUri: ").append(toIndentedString(contactUri)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    signingGroup: ").append(toIndentedString(signingGroup)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
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

