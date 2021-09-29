package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkRecipientSignatureProvider;
import com.docusign.esign.model.BulkRecipientTabLabel;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkRecipient.
 *
 */

public class BulkRecipient {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private java.util.List<ErrorDetails> errorDetails = null;

  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("recipientSignatureProviderInfo")
  private java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo = null;

  @JsonProperty("rowNumber")
  private String rowNumber = null;

  @JsonProperty("tabLabels")
  private java.util.List<BulkRecipientTabLabel> tabLabels = null;


  /**
   * accessCode.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required..
   * @return accessCode
   **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  /**
   * setAccessCode.
   **/
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  /**
   * email.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Specifies the recipient's email address.   Maximum length: 100 characters..
   * @return email
   **/
  @ApiModelProperty(value = "Specifies the recipient's email address.   Maximum length: 100 characters.")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * errorDetails.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient errorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  /**
   * addErrorDetailsItem.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient addErrorDetailsItem(ErrorDetails errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new java.util.ArrayList<ErrorDetails>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @ApiModelProperty(value = "Array or errors.")
  public java.util.List<ErrorDetails> getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * identification.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.  The acceptable values are:  * KBA: Enables the normal ID check authentication set up for your account. * Phone: Enables phone authentication. * SMS: Enables SMS authentication..
   * @return identification
   **/
  @ApiModelProperty(value = "Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.  The acceptable values are:  * KBA: Enables the normal ID check authentication set up for your account. * Phone: Enables phone authentication. * SMS: Enables SMS authentication.")
  public String getIdentification() {
    return identification;
  }

  /**
   * setIdentification.
   **/
  public void setIdentification(String identification) {
    this.identification = identification;
  }


  /**
   * name.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the recipient's name.   Maximum length: 50 characters..
   * @return name
   **/
  @ApiModelProperty(value = "Specifies the recipient's name.   Maximum length: 50 characters.")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * note.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters..
   * @return note
   **/
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  /**
   * setNote.
   **/
  public void setNote(String note) {
    this.note = note;
  }


  /**
   * phoneNumber.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone, usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.  If `usersupplied` is used, the signer supplies his or her own telephone number..
   * @return phoneNumber
   **/
  @ApiModelProperty(value = "This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone, usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.  If `usersupplied` is used, the signer supplies his or her own telephone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * setPhoneNumber.
   **/
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * recipientSignatureProviderInfo.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient recipientSignatureProviderInfo(java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo) {
    this.recipientSignatureProviderInfo = recipientSignatureProviderInfo;
    return this;
  }
  
  /**
   * addRecipientSignatureProviderInfoItem.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient addRecipientSignatureProviderInfoItem(BulkRecipientSignatureProvider recipientSignatureProviderInfoItem) {
    if (this.recipientSignatureProviderInfo == null) {
      this.recipientSignatureProviderInfo = new java.util.ArrayList<BulkRecipientSignatureProvider>();
    }
    this.recipientSignatureProviderInfo.add(recipientSignatureProviderInfoItem);
    return this;
  }

  /**
   * .
   * @return recipientSignatureProviderInfo
   **/
  @ApiModelProperty(value = "")
  public java.util.List<BulkRecipientSignatureProvider> getRecipientSignatureProviderInfo() {
    return recipientSignatureProviderInfo;
  }

  /**
   * setRecipientSignatureProviderInfo.
   **/
  public void setRecipientSignatureProviderInfo(java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo) {
    this.recipientSignatureProviderInfo = recipientSignatureProviderInfo;
  }


  /**
   * rowNumber.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient rowNumber(String rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

  /**
   * .
   * @return rowNumber
   **/
  @ApiModelProperty(value = "")
  public String getRowNumber() {
    return rowNumber;
  }

  /**
   * setRowNumber.
   **/
  public void setRowNumber(String rowNumber) {
    this.rowNumber = rowNumber;
  }


  /**
   * tabLabels.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient tabLabels(java.util.List<BulkRecipientTabLabel> tabLabels) {
    this.tabLabels = tabLabels;
    return this;
  }
  
  /**
   * addTabLabelsItem.
   *
   * @return BulkRecipient
   **/
  public BulkRecipient addTabLabelsItem(BulkRecipientTabLabel tabLabelsItem) {
    if (this.tabLabels == null) {
      this.tabLabels = new java.util.ArrayList<BulkRecipientTabLabel>();
    }
    this.tabLabels.add(tabLabelsItem);
    return this;
  }

  /**
   * Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.  The information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.  The values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.  Note that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature, Full Name, Email Address, Company, Title, and Date Signed tabs..
   * @return tabLabels
   **/
  @ApiModelProperty(value = "Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.  The information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.  The values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.  Note that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature, Full Name, Email Address, Company, Title, and Date Signed tabs.")
  public java.util.List<BulkRecipientTabLabel> getTabLabels() {
    return tabLabels;
  }

  /**
   * setTabLabels.
   **/
  public void setTabLabels(java.util.List<BulkRecipientTabLabel> tabLabels) {
    this.tabLabels = tabLabels;
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
    BulkRecipient bulkRecipient = (BulkRecipient) o;
    return Objects.equals(this.accessCode, bulkRecipient.accessCode) &&
        Objects.equals(this.email, bulkRecipient.email) &&
        Objects.equals(this.errorDetails, bulkRecipient.errorDetails) &&
        Objects.equals(this.identification, bulkRecipient.identification) &&
        Objects.equals(this.name, bulkRecipient.name) &&
        Objects.equals(this.note, bulkRecipient.note) &&
        Objects.equals(this.phoneNumber, bulkRecipient.phoneNumber) &&
        Objects.equals(this.recipientSignatureProviderInfo, bulkRecipient.recipientSignatureProviderInfo) &&
        Objects.equals(this.rowNumber, bulkRecipient.rowNumber) &&
        Objects.equals(this.tabLabels, bulkRecipient.tabLabels);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, email, errorDetails, identification, name, note, phoneNumber, recipientSignatureProviderInfo, rowNumber, tabLabels);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipient {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    recipientSignatureProviderInfo: ").append(toIndentedString(recipientSignatureProviderInfo)).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
    sb.append("    tabLabels: ").append(toIndentedString(tabLabels)).append("\n");
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

