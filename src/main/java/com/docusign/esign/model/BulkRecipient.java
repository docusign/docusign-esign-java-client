package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkRecipientSignatureProvider;
import com.docusign.esign.model.BulkRecipientTabLabel;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BulkRecipient   {
  
  private String accessCode = null;
  private String email = null;
  private java.util.List<ErrorDetails> errorDetails = new java.util.ArrayList<ErrorDetails>();
  private String identification = null;
  private String name = null;
  private String note = null;
  private String phoneNumber = null;
  private java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo = new java.util.ArrayList<BulkRecipientSignatureProvider>();
  private String rowNumber = null;
  private java.util.List<BulkRecipientTabLabel> tabLabels = new java.util.ArrayList<BulkRecipientTabLabel>();

  
  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.
   **/
  
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.")
  @JsonProperty("accessCode")
  public String getAccessCode() {
    return accessCode;
  }
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  
  /**
   * Specifies the recipient's email address. \n\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Specifies the recipient's email address. \n\nMaximum length: 100 characters.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Array or errors.
   **/
  
  @ApiModelProperty(value = "Array or errors.")
  @JsonProperty("errorDetails")
  public java.util.List<ErrorDetails> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.\n\nThe acceptable values are:\n\n* KBA: Enables the normal ID check authentication set up for your account.\n* Phone: Enables phone authentication.\n* SMS: Enables SMS authentication.
   **/
  
  @ApiModelProperty(value = "Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.\n\nThe acceptable values are:\n\n* KBA: Enables the normal ID check authentication set up for your account.\n* Phone: Enables phone authentication.\n* SMS: Enables SMS authentication.")
  @JsonProperty("identification")
  public String getIdentification() {
    return identification;
  }
  public void setIdentification(String identification) {
    this.identification = identification;
  }

  
  /**
   * Specifies the recipient's name. \n\nMaximum length: 50 characters.
   **/
  
  @ApiModelProperty(value = "Specifies the recipient's name. \n\nMaximum length: 50 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.
   **/
  
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   * This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone, usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.\n\nIf `usersupplied` is used, the signer supplies his or her own telephone number.
   **/
  
  @ApiModelProperty(value = "This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone, usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.\n\nIf `usersupplied` is used, the signer supplies his or her own telephone number.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientSignatureProviderInfo")
  public java.util.List<BulkRecipientSignatureProvider> getRecipientSignatureProviderInfo() {
    return recipientSignatureProviderInfo;
  }
  public void setRecipientSignatureProviderInfo(java.util.List<BulkRecipientSignatureProvider> recipientSignatureProviderInfo) {
    this.recipientSignatureProviderInfo = recipientSignatureProviderInfo;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rowNumber")
  public String getRowNumber() {
    return rowNumber;
  }
  public void setRowNumber(String rowNumber) {
    this.rowNumber = rowNumber;
  }

  
  /**
   * Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.\n\nThe information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.\n\nThe values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.\n\nNote that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature, Full Name, Email Address, Company, Title, and Date Signed tabs.
   **/
  
  @ApiModelProperty(value = "Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.\n\nThe information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.\n\nThe values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.\n\nNote that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature, Full Name, Email Address, Company, Title, and Date Signed tabs.")
  @JsonProperty("tabLabels")
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

    return true && Objects.equals(accessCode, bulkRecipient.accessCode) &&
        Objects.equals(email, bulkRecipient.email) &&
        Objects.equals(errorDetails, bulkRecipient.errorDetails) &&
        Objects.equals(identification, bulkRecipient.identification) &&
        Objects.equals(name, bulkRecipient.name) &&
        Objects.equals(note, bulkRecipient.note) &&
        Objects.equals(phoneNumber, bulkRecipient.phoneNumber) &&
        Objects.equals(recipientSignatureProviderInfo, bulkRecipient.recipientSignatureProviderInfo) &&
        Objects.equals(rowNumber, bulkRecipient.rowNumber) &&
        Objects.equals(tabLabels, bulkRecipient.tabLabels)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, email, errorDetails, identification, name, note, phoneNumber, recipientSignatureProviderInfo, rowNumber, tabLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipient {\n");
    
    if (accessCode != null)
      sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (identification != null)
      sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (note != null)
      sb.append("    note: ").append(toIndentedString(note)).append("\n");
    if (phoneNumber != null)
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    if (recipientSignatureProviderInfo != null)
      sb.append("    recipientSignatureProviderInfo: ").append(toIndentedString(recipientSignatureProviderInfo)).append("\n");
    if (rowNumber != null)
      sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
    if (tabLabels != null)
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

