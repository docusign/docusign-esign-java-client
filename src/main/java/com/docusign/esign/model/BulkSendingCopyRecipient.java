package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingCopyTab;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.RecipientSignatureProvider;
import com.docusign.esign.model.SocialAuthentication;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendingCopyRecipient
 */

public class BulkSendingCopyRecipient {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = null;

  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailNotification")
  private RecipientEmailNotification emailNotification = null;

  @JsonProperty("embeddedRecipientStartURL")
  private String embeddedRecipientStartURL = null;

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  @JsonProperty("hostEmail")
  private String hostEmail = null;

  @JsonProperty("hostName")
  private String hostName = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckInformationInput")
  private IdCheckInformationInput idCheckInformationInput = null;

  @JsonProperty("identificationMethod")
  private String identificationMethod = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientSignatureProviders")
  private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("signerName")
  private String signerName = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("smsAuthentication")
  private RecipientSMSAuthentication smsAuthentication = null;

  @JsonProperty("socialAuthentications")
  private java.util.List<SocialAuthentication> socialAuthentications = null;

  @JsonProperty("tabs")
  private java.util.List<BulkSendingCopyTab> tabs = null;

  public BulkSendingCopyRecipient accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.
   * @return accessCode
  **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public BulkSendingCopyRecipient clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. 
   * @return clientUserId
  **/
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public BulkSendingCopyRecipient customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public BulkSendingCopyRecipient addCustomFieldsItem(String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<String>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   * @return customFields
  **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  public BulkSendingCopyRecipient deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public BulkSendingCopyRecipient email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BulkSendingCopyRecipient emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

   /**
   * Get emailNotification
   * @return emailNotification
  **/
  @ApiModelProperty(value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  public BulkSendingCopyRecipient embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

   /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` 
   * @return embeddedRecipientStartURL
  **/
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  public BulkSendingCopyRecipient faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Reserved:
   * @return faxNumber
  **/
  @ApiModelProperty(value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public BulkSendingCopyRecipient hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }

   /**
   * 
   * @return hostEmail
  **/
  @ApiModelProperty(value = "")
  public String getHostEmail() {
    return hostEmail;
  }

  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }

  public BulkSendingCopyRecipient hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * 
   * @return hostName
  **/
  @ApiModelProperty(value = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public BulkSendingCopyRecipient idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

   /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   * @return idCheckConfigurationName
  **/
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  public BulkSendingCopyRecipient idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

   /**
   * Get idCheckInformationInput
   * @return idCheckInformationInput
  **/
  @ApiModelProperty(value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  public BulkSendingCopyRecipient identificationMethod(String identificationMethod) {
    this.identificationMethod = identificationMethod;
    return this;
  }

   /**
   * 
   * @return identificationMethod
  **/
  @ApiModelProperty(value = "")
  public String getIdentificationMethod() {
    return identificationMethod;
  }

  public void setIdentificationMethod(String identificationMethod) {
    this.identificationMethod = identificationMethod;
  }

  public BulkSendingCopyRecipient name(String name) {
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

  public BulkSendingCopyRecipient note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.
   * @return note
  **/
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public BulkSendingCopyRecipient phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

   /**
   * Get phoneAuthentication
   * @return phoneAuthentication
  **/
  @ApiModelProperty(value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  public BulkSendingCopyRecipient recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public BulkSendingCopyRecipient recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }

  public BulkSendingCopyRecipient addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
    if (this.recipientSignatureProviders == null) {
      this.recipientSignatureProviders = new java.util.ArrayList<RecipientSignatureProvider>();
    }
    this.recipientSignatureProviders.add(recipientSignatureProvidersItem);
    return this;
  }

   /**
   * 
   * @return recipientSignatureProviders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
    return recipientSignatureProviders;
  }

  public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
  }

  public BulkSendingCopyRecipient roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   * @return roleName
  **/
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public BulkSendingCopyRecipient signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

   /**
   * 
   * @return signerName
  **/
  @ApiModelProperty(value = "")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }

  public BulkSendingCopyRecipient signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public BulkSendingCopyRecipient smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

   /**
   * Get smsAuthentication
   * @return smsAuthentication
  **/
  @ApiModelProperty(value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  public BulkSendingCopyRecipient socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }

  public BulkSendingCopyRecipient addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    if (this.socialAuthentications == null) {
      this.socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
    }
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

   /**
   *  Lists the social ID type that can be used for recipient authentication.
   * @return socialAuthentications
  **/
  @ApiModelProperty(value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  public BulkSendingCopyRecipient tabs(java.util.List<BulkSendingCopyTab> tabs) {
    this.tabs = tabs;
    return this;
  }

  public BulkSendingCopyRecipient addTabsItem(BulkSendingCopyTab tabsItem) {
    if (this.tabs == null) {
      this.tabs = new java.util.ArrayList<BulkSendingCopyTab>();
    }
    this.tabs.add(tabsItem);
    return this;
  }

   /**
   * 
   * @return tabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<BulkSendingCopyTab> getTabs() {
    return tabs;
  }

  public void setTabs(java.util.List<BulkSendingCopyTab> tabs) {
    this.tabs = tabs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendingCopyRecipient bulkSendingCopyRecipient = (BulkSendingCopyRecipient) o;
    return Objects.equals(this.accessCode, bulkSendingCopyRecipient.accessCode) &&
        Objects.equals(this.clientUserId, bulkSendingCopyRecipient.clientUserId) &&
        Objects.equals(this.customFields, bulkSendingCopyRecipient.customFields) &&
        Objects.equals(this.deliveryMethod, bulkSendingCopyRecipient.deliveryMethod) &&
        Objects.equals(this.email, bulkSendingCopyRecipient.email) &&
        Objects.equals(this.emailNotification, bulkSendingCopyRecipient.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, bulkSendingCopyRecipient.embeddedRecipientStartURL) &&
        Objects.equals(this.faxNumber, bulkSendingCopyRecipient.faxNumber) &&
        Objects.equals(this.hostEmail, bulkSendingCopyRecipient.hostEmail) &&
        Objects.equals(this.hostName, bulkSendingCopyRecipient.hostName) &&
        Objects.equals(this.idCheckConfigurationName, bulkSendingCopyRecipient.idCheckConfigurationName) &&
        Objects.equals(this.idCheckInformationInput, bulkSendingCopyRecipient.idCheckInformationInput) &&
        Objects.equals(this.identificationMethod, bulkSendingCopyRecipient.identificationMethod) &&
        Objects.equals(this.name, bulkSendingCopyRecipient.name) &&
        Objects.equals(this.note, bulkSendingCopyRecipient.note) &&
        Objects.equals(this.phoneAuthentication, bulkSendingCopyRecipient.phoneAuthentication) &&
        Objects.equals(this.recipientId, bulkSendingCopyRecipient.recipientId) &&
        Objects.equals(this.recipientSignatureProviders, bulkSendingCopyRecipient.recipientSignatureProviders) &&
        Objects.equals(this.roleName, bulkSendingCopyRecipient.roleName) &&
        Objects.equals(this.signerName, bulkSendingCopyRecipient.signerName) &&
        Objects.equals(this.signingGroupId, bulkSendingCopyRecipient.signingGroupId) &&
        Objects.equals(this.smsAuthentication, bulkSendingCopyRecipient.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, bulkSendingCopyRecipient.socialAuthentications) &&
        Objects.equals(this.tabs, bulkSendingCopyRecipient.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, clientUserId, customFields, deliveryMethod, email, emailNotification, embeddedRecipientStartURL, faxNumber, hostEmail, hostName, idCheckConfigurationName, idCheckInformationInput, identificationMethod, name, note, phoneAuthentication, recipientId, recipientSignatureProviders, roleName, signerName, signingGroupId, smsAuthentication, socialAuthentications, tabs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingCopyRecipient {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    identificationMethod: ").append(toIndentedString(identificationMethod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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

