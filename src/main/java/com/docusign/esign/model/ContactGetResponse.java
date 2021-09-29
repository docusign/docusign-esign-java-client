package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Contact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ContactGetResponse.
 *
 */

public class ContactGetResponse {
  @JsonProperty("contacts")
  private java.util.List<Contact> contacts = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;


  /**
   * contacts.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse contacts(java.util.List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  /**
   * addContactsItem.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new java.util.ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * .
   * @return contacts
   **/
  @ApiModelProperty(value = "")
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
   * endPosition.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * nextUri.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. .
   * @return nextUri
   **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * previousUri.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   * @return previousUri
   **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /**
   * setPreviousUri.
   **/
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * resultSetSize.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * totalSetSize.
   *
   * @return ContactGetResponse
   **/
  public ContactGetResponse totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
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
    ContactGetResponse contactGetResponse = (ContactGetResponse) o;
    return Objects.equals(this.contacts, contactGetResponse.contacts) &&
        Objects.equals(this.endPosition, contactGetResponse.endPosition) &&
        Objects.equals(this.nextUri, contactGetResponse.nextUri) &&
        Objects.equals(this.previousUri, contactGetResponse.previousUri) &&
        Objects.equals(this.resultSetSize, contactGetResponse.resultSetSize) &&
        Objects.equals(this.startPosition, contactGetResponse.startPosition) &&
        Objects.equals(this.totalSetSize, contactGetResponse.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(contacts, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactGetResponse {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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

