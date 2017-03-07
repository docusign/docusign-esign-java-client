package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Contact   {
  
  private String contactId = null;
  private String contactUri = null;
  private java.util.List<String> emails = new java.util.ArrayList<String>();
  private ErrorDetails errorDetails = null;
  private String name = null;
  private String organization = null;
  private String shared = null;
  private String signingGroup = null;
  private String signingGroupName = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contactId")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contactUri")
  public String getContactUri() {
    return contactUri;
  }
  public void setContactUri(String contactUri) {
    this.contactUri = contactUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emails")
  public java.util.List<String> getEmails() {
    return emails;
  }
  public void setEmails(java.util.List<String> emails) {
    this.emails = emails;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signingGroup")
  public String getSigningGroup() {
    return signingGroup;
  }
  public void setSigningGroup(String signingGroup) {
    this.signingGroup = signingGroup;
  }

  
  /**
   * The display name for the signing group. \n\nMaximum Length: 100 characters.
   **/
  
  @ApiModelProperty(value = "The display name for the signing group. \n\nMaximum Length: 100 characters.")
  @JsonProperty("signingGroupName")
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

    return true && Objects.equals(contactId, contact.contactId) &&
        Objects.equals(contactUri, contact.contactUri) &&
        Objects.equals(emails, contact.emails) &&
        Objects.equals(errorDetails, contact.errorDetails) &&
        Objects.equals(name, contact.name) &&
        Objects.equals(organization, contact.organization) &&
        Objects.equals(shared, contact.shared) &&
        Objects.equals(signingGroup, contact.signingGroup) &&
        Objects.equals(signingGroupName, contact.signingGroupName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactUri, emails, errorDetails, name, organization, shared, signingGroup, signingGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    if (contactId != null)
      sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    if (contactUri != null)
      sb.append("    contactUri: ").append(toIndentedString(contactUri)).append("\n");
    if (emails != null)
      sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (organization != null)
      sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    if (signingGroup != null)
      sb.append("    signingGroup: ").append(toIndentedString(signingGroup)).append("\n");
    if (signingGroupName != null)
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

