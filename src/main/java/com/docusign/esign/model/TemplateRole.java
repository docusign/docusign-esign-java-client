package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientAdditionalNotification;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneNumber;
import com.docusign.esign.model.RecipientSignatureProvider;
import com.docusign.esign.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Information about a specific role..
 *
 */
@Schema(description = "Information about a specific role.")

public class TemplateRole implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("additionalNotifications")
  private java.util.List<RecipientAdditionalNotification> additionalNotifications = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("defaultRecipient")
  private String defaultRecipient = null;

  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailNotification")
  private RecipientEmailNotification emailNotification = null;

  @JsonProperty("embeddedRecipientStartURL")
  private String embeddedRecipientStartURL = null;

  @JsonProperty("inPersonSignerName")
  private String inPersonSignerName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNumber")
  private RecipientPhoneNumber phoneNumber = null;

  @JsonProperty("recipientSignatureProviders")
  private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;


  /**
   * accessCode.
   *
   * @return TemplateRole
   **/
  public TemplateRole accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required..
   * @return accessCode
   **/
  @Schema(description = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
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
   * additionalNotifications.
   *
   * @return TemplateRole
   **/
  public TemplateRole additionalNotifications(java.util.List<RecipientAdditionalNotification> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
    return this;
  }
  
  /**
   * addAdditionalNotificationsItem.
   *
   * @return TemplateRole
   **/
  public TemplateRole addAdditionalNotificationsItem(RecipientAdditionalNotification additionalNotificationsItem) {
    if (this.additionalNotifications == null) {
      this.additionalNotifications = new java.util.ArrayList<>();
    }
    this.additionalNotifications.add(additionalNotificationsItem);
    return this;
  }

  /**
   * .
   * @return additionalNotifications
   **/
  @Schema(description = "")
  public java.util.List<RecipientAdditionalNotification> getAdditionalNotifications() {
    return additionalNotifications;
  }

  /**
   * setAdditionalNotifications.
   **/
  public void setAdditionalNotifications(java.util.List<RecipientAdditionalNotification> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
  }


  /**
   * clientUserId.
   *
   * @return TemplateRole
   **/
  public TemplateRole clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. .
   * @return clientUserId
   **/
  @Schema(description = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  /**
   * setClientUserId.
   **/
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  /**
   * defaultRecipient.
   *
   * @return TemplateRole
   **/
  public TemplateRole defaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }

  /**
   * When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient..
   * @return defaultRecipient
   **/
  @Schema(description = "When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }

  /**
   * setDefaultRecipient.
   **/
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }


  /**
   * deliveryMethod.
   *
   * @return TemplateRole
   **/
  public TemplateRole deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveryMethod
   **/
  @Schema(description = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  /**
   * setDeliveryMethod.
   **/
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  /**
   * email.
   *
   * @return TemplateRole
   **/
  public TemplateRole email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Specifies the email associated with a role name..
   * @return email
   **/
  @Schema(description = "Specifies the email associated with a role name.")
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
   * emailNotification.
   *
   * @return TemplateRole
   **/
  public TemplateRole emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

  /**
   * A complex type that contains information sets the language of the recipient's email information.   **IMPORTANT**: If you enable email notification for one recipient, you must enable email notification for all recipients as it overrides the Envelope Subject and `EmailBlurb` property settings. .
   * @return emailNotification
   **/
  @Schema(description = "A complex type that contains information sets the language of the recipient's email information.   **IMPORTANT**: If you enable email notification for one recipient, you must enable email notification for all recipients as it overrides the Envelope Subject and `EmailBlurb` property settings. ")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  /**
   * setEmailNotification.
   **/
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }


  /**
   * embeddedRecipientStartURL.
   *
   * @return TemplateRole
   **/
  public TemplateRole embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` .
   * @return embeddedRecipientStartURL
   **/
  @Schema(description = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  /**
   * setEmbeddedRecipientStartURL.
   **/
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }


  /**
   * inPersonSignerName.
   *
   * @return TemplateRole
   **/
  public TemplateRole inPersonSignerName(String inPersonSignerName) {
    this.inPersonSignerName = inPersonSignerName;
    return this;
  }

  /**
   * Specifies the full legal name of the signer in person signer template roles.  Maximum Length: 100 characters..
   * @return inPersonSignerName
   **/
  @Schema(description = "Specifies the full legal name of the signer in person signer template roles.  Maximum Length: 100 characters.")
  public String getInPersonSignerName() {
    return inPersonSignerName;
  }

  /**
   * setInPersonSignerName.
   **/
  public void setInPersonSignerName(String inPersonSignerName) {
    this.inPersonSignerName = inPersonSignerName;
  }


  /**
   * name.
   *
   * @return TemplateRole
   **/
  public TemplateRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the recipient's name..
   * @return name
   **/
  @Schema(description = "Specifies the recipient's name.")
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
   * phoneNumber.
   *
   * @return TemplateRole
   **/
  public TemplateRole phoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Describes the recipient phone number..
   * @return phoneNumber
   **/
  @Schema(description = "Describes the recipient phone number.")
  public RecipientPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * setPhoneNumber.
   **/
  public void setPhoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * recipientSignatureProviders.
   *
   * @return TemplateRole
   **/
  public TemplateRole recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }
  
  /**
   * addRecipientSignatureProvidersItem.
   *
   * @return TemplateRole
   **/
  public TemplateRole addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
    if (this.recipientSignatureProviders == null) {
      this.recipientSignatureProviders = new java.util.ArrayList<>();
    }
    this.recipientSignatureProviders.add(recipientSignatureProvidersItem);
    return this;
  }

  /**
   * .
   * @return recipientSignatureProviders
   **/
  @Schema(description = "")
  public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
    return recipientSignatureProviders;
  }

  /**
   * setRecipientSignatureProviders.
   **/
  public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
  }


  /**
   * roleName.
   *
   * @return TemplateRole
   **/
  public TemplateRole roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients..
   * @return roleName
   **/
  @Schema(description = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  /**
   * setRoleName.
   **/
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  /**
   * routingOrder.
   *
   * @return TemplateRole
   **/
  public TemplateRole routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

  /**
   * Specifies the routing order of the recipient in the envelope. .
   * @return routingOrder
   **/
  @Schema(description = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  /**
   * setRoutingOrder.
   **/
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }


  /**
   * signingGroupId.
   *
   * @return TemplateRole
   **/
  public TemplateRole signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @Schema(description = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  /**
   * setSigningGroupId.
   **/
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }


  /**
   * tabs.
   *
   * @return TemplateRole
   **/
  public TemplateRole tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data. They may also display data to the recipients..
   * @return tabs
   **/
  @Schema(description = "A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data. They may also display data to the recipients.")
  public Tabs getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
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
    TemplateRole templateRole = (TemplateRole) o;
    return Objects.equals(this.accessCode, templateRole.accessCode) &&
        Objects.equals(this.additionalNotifications, templateRole.additionalNotifications) &&
        Objects.equals(this.clientUserId, templateRole.clientUserId) &&
        Objects.equals(this.defaultRecipient, templateRole.defaultRecipient) &&
        Objects.equals(this.deliveryMethod, templateRole.deliveryMethod) &&
        Objects.equals(this.email, templateRole.email) &&
        Objects.equals(this.emailNotification, templateRole.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, templateRole.embeddedRecipientStartURL) &&
        Objects.equals(this.inPersonSignerName, templateRole.inPersonSignerName) &&
        Objects.equals(this.name, templateRole.name) &&
        Objects.equals(this.phoneNumber, templateRole.phoneNumber) &&
        Objects.equals(this.recipientSignatureProviders, templateRole.recipientSignatureProviders) &&
        Objects.equals(this.roleName, templateRole.roleName) &&
        Objects.equals(this.routingOrder, templateRole.routingOrder) &&
        Objects.equals(this.signingGroupId, templateRole.signingGroupId) &&
        Objects.equals(this.tabs, templateRole.tabs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, additionalNotifications, clientUserId, defaultRecipient, deliveryMethod, email, emailNotification, embeddedRecipientStartURL, inPersonSignerName, name, phoneNumber, recipientSignatureProviders, roleName, routingOrder, signingGroupId, tabs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRole {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    additionalNotifications: ").append(toIndentedString(additionalNotifications)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    inPersonSignerName: ").append(toIndentedString(inPersonSignerName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
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

