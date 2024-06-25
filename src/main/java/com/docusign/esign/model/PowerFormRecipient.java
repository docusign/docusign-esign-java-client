package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * **Note:** For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use &#x60;Member&#x60; as the &#x60;Name&#x60;), and omit personal details such as &#x60;email&#x60;..
 *
 */
@Schema(description = "**Note:** For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`), and omit personal details such as `email`.")

public class PowerFormRecipient implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeLocked")
  private String accessCodeLocked = null;

  @JsonProperty("accessCodeRequired")
  private String accessCodeRequired = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailLocked")
  private String emailLocked = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckRequired")
  private String idCheckRequired = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("templateRequiresIdLookup")
  private String templateRequiresIdLookup = null;

  @JsonProperty("userNameLocked")
  private String userNameLocked = null;


  /**
   * accessCode.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient accessCode(String accessCode) {
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
   * accessCodeLocked.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient accessCodeLocked(String accessCodeLocked) {
    this.accessCodeLocked = accessCodeLocked;
    return this;
  }

  /**
   * .
   * @return accessCodeLocked
   **/
  @Schema(description = "")
  public String getAccessCodeLocked() {
    return accessCodeLocked;
  }

  /**
   * setAccessCodeLocked.
   **/
  public void setAccessCodeLocked(String accessCodeLocked) {
    this.accessCodeLocked = accessCodeLocked;
  }


  /**
   * accessCodeRequired.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient accessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
    return this;
  }

  /**
   * .
   * @return accessCodeRequired
   **/
  @Schema(description = "")
  public String getAccessCodeRequired() {
    return accessCodeRequired;
  }

  /**
   * setAccessCodeRequired.
   **/
  public void setAccessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
  }


  /**
   * email.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
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
   * emailLocked.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient emailLocked(String emailLocked) {
    this.emailLocked = emailLocked;
    return this;
  }

  /**
   * .
   * @return emailLocked
   **/
  @Schema(description = "")
  public String getEmailLocked() {
    return emailLocked;
  }

  /**
   * setEmailLocked.
   **/
  public void setEmailLocked(String emailLocked) {
    this.emailLocked = emailLocked;
  }


  /**
   * idCheckConfigurationName.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node..
   * @return idCheckConfigurationName
   **/
  @Schema(description = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  /**
   * setIdCheckConfigurationName.
   **/
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }


  /**
   * idCheckRequired.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient idCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
    return this;
  }

  /**
   * .
   * @return idCheckRequired
   **/
  @Schema(description = "")
  public String getIdCheckRequired() {
    return idCheckRequired;
  }

  /**
   * setIdCheckRequired.
   **/
  public void setIdCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
  }


  /**
   * name.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
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
   * recipientType.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /**
   * .
   * @return recipientType
   **/
  @Schema(description = "")
  public String getRecipientType() {
    return recipientType;
  }

  /**
   * setRecipientType.
   **/
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }


  /**
   * roleName.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient roleName(String roleName) {
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
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient routingOrder(String routingOrder) {
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
   * templateRequiresIdLookup.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient templateRequiresIdLookup(String templateRequiresIdLookup) {
    this.templateRequiresIdLookup = templateRequiresIdLookup;
    return this;
  }

  /**
   * .
   * @return templateRequiresIdLookup
   **/
  @Schema(description = "")
  public String getTemplateRequiresIdLookup() {
    return templateRequiresIdLookup;
  }

  /**
   * setTemplateRequiresIdLookup.
   **/
  public void setTemplateRequiresIdLookup(String templateRequiresIdLookup) {
    this.templateRequiresIdLookup = templateRequiresIdLookup;
  }


  /**
   * userNameLocked.
   *
   * @return PowerFormRecipient
   **/
  public PowerFormRecipient userNameLocked(String userNameLocked) {
    this.userNameLocked = userNameLocked;
    return this;
  }

  /**
   * .
   * @return userNameLocked
   **/
  @Schema(description = "")
  public String getUserNameLocked() {
    return userNameLocked;
  }

  /**
   * setUserNameLocked.
   **/
  public void setUserNameLocked(String userNameLocked) {
    this.userNameLocked = userNameLocked;
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
    PowerFormRecipient powerFormRecipient = (PowerFormRecipient) o;
    return Objects.equals(this.accessCode, powerFormRecipient.accessCode) &&
        Objects.equals(this.accessCodeLocked, powerFormRecipient.accessCodeLocked) &&
        Objects.equals(this.accessCodeRequired, powerFormRecipient.accessCodeRequired) &&
        Objects.equals(this.email, powerFormRecipient.email) &&
        Objects.equals(this.emailLocked, powerFormRecipient.emailLocked) &&
        Objects.equals(this.idCheckConfigurationName, powerFormRecipient.idCheckConfigurationName) &&
        Objects.equals(this.idCheckRequired, powerFormRecipient.idCheckRequired) &&
        Objects.equals(this.name, powerFormRecipient.name) &&
        Objects.equals(this.recipientType, powerFormRecipient.recipientType) &&
        Objects.equals(this.roleName, powerFormRecipient.roleName) &&
        Objects.equals(this.routingOrder, powerFormRecipient.routingOrder) &&
        Objects.equals(this.templateRequiresIdLookup, powerFormRecipient.templateRequiresIdLookup) &&
        Objects.equals(this.userNameLocked, powerFormRecipient.userNameLocked);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeLocked, accessCodeRequired, email, emailLocked, idCheckConfigurationName, idCheckRequired, name, recipientType, roleName, routingOrder, templateRequiresIdLookup, userNameLocked);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormRecipient {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeLocked: ").append(toIndentedString(accessCodeLocked)).append("\n");
    sb.append("    accessCodeRequired: ").append(toIndentedString(accessCodeRequired)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailLocked: ").append(toIndentedString(emailLocked)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckRequired: ").append(toIndentedString(idCheckRequired)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    templateRequiresIdLookup: ").append(toIndentedString(templateRequiresIdLookup)).append("\n");
    sb.append("    userNameLocked: ").append(toIndentedString(userNameLocked)).append("\n");
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

