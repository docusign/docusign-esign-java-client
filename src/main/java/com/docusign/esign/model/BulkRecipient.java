package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkRecipientSignatureProvider;
import com.docusign.esign.model.BulkRecipientTabLabel;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkRecipient
 */

public class BulkRecipient {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private java.util.List<ErrorDetails> errorDetails = new java.util.ArrayList<ErrorDetails>();

  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("recipientSignatureProviderInfo")
  private java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo = new java.util.ArrayList<BulkRecipientSignatureProvider>();

  @JsonProperty("rowNumber")
  private String rowNumber = null;

  @JsonProperty("tabLabels")
  private java.util.List<BulkRecipientTabLabel> tabLabels = new java.util.ArrayList<BulkRecipientTabLabel>();

  public BulkRecipient accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account’s access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.
   * @return accessCode
  **/
  @ApiModelProperty(example = "null", value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account’s access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public BulkRecipient email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Specifies the recipient's email address.   Maximum length: 100 characters.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Specifies the recipient's email address.   Maximum length: 100 characters.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BulkRecipient errorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  public BulkRecipient addErrorDetailsItem(ErrorDetails errorDetailsItem) {
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

   /**
   * Array or errors.
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "Array or errors.")
  public java.util.List<ErrorDetails> getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
  }

  public BulkRecipient identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.  The acceptable values are:  * KBA: Enables the normal ID check authentication set up for your account. * Phone: Enables phone authentication. * SMS: Enables SMS authentication.
   * @return identification
  **/
  @ApiModelProperty(example = "null", value = "Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.  The acceptable values are:  * KBA: Enables the normal ID check authentication set up for your account. * Phone: Enables phone authentication. * SMS: Enables SMS authentication.")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BulkRecipient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the recipient's name.   Maximum length: 50 characters.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Specifies the recipient's name.   Maximum length: 50 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkRecipient note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public BulkRecipient phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone, usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.  If `usersupplied` is used, the signer supplies his or her own telephone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone, usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.  If `usersupplied` is used, the signer supplies his or her own telephone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public BulkRecipient recipientSignatureProviderInfo(java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo) {
    this.recipientSignatureProviderInfo = recipientSignatureProviderInfo;
    return this;
  }

  public BulkRecipient addRecipientSignatureProviderInfoItem(BulkRecipientSignatureProvider recipientSignatureProviderInfoItem) {
    this.recipientSignatureProviderInfo.add(recipientSignatureProviderInfoItem);
    return this;
  }

   /**
   * 
   * @return recipientSignatureProviderInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<BulkRecipientSignatureProvider> getRecipientSignatureProviderInfo() {
    return recipientSignatureProviderInfo;
  }

  public void setRecipientSignatureProviderInfo(java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo) {
    this.recipientSignatureProviderInfo = recipientSignatureProviderInfo;
  }

  public BulkRecipient rowNumber(String rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

   /**
   * 
   * @return rowNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(String rowNumber) {
    this.rowNumber = rowNumber;
  }

  public BulkRecipient tabLabels(java.util.List<BulkRecipientTabLabel> tabLabels) {
    this.tabLabels = tabLabels;
    return this;
  }

  public BulkRecipient addTabLabelsItem(BulkRecipientTabLabel tabLabelsItem) {
    this.tabLabels.add(tabLabelsItem);
    return this;
  }

   /**
   * Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.  The information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.  The values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.  Note that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature, Full Name, Email Address, Company, Title, and Date Signed tabs.
   * @return tabLabels
  **/
  @ApiModelProperty(example = "null", value = "Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.  The information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.  The values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.  Note that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature, Full Name, Email Address, Company, Title, and Date Signed tabs.")
  public java.util.List<BulkRecipientTabLabel> getTabLabels() {
    return tabLabels;
  }

  public void setTabLabels(java.util.List<BulkRecipientTabLabel> tabLabels) {
    this.tabLabels = tabLabels;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, email, errorDetails, identification, name, note, phoneNumber, recipientSignatureProviderInfo, rowNumber, tabLabels);
  }


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

