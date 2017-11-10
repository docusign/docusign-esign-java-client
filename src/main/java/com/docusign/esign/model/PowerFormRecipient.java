package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PowerFormRecipient
 */

public class PowerFormRecipient {
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

  public PowerFormRecipient accessCode(String accessCode) {
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

  public PowerFormRecipient accessCodeLocked(String accessCodeLocked) {
    this.accessCodeLocked = accessCodeLocked;
    return this;
  }

   /**
   * 
   * @return accessCodeLocked
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccessCodeLocked() {
    return accessCodeLocked;
  }

  public void setAccessCodeLocked(String accessCodeLocked) {
    this.accessCodeLocked = accessCodeLocked;
  }

  public PowerFormRecipient accessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
    return this;
  }

   /**
   * 
   * @return accessCodeRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccessCodeRequired() {
    return accessCodeRequired;
  }

  public void setAccessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
  }

  public PowerFormRecipient email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PowerFormRecipient emailLocked(String emailLocked) {
    this.emailLocked = emailLocked;
    return this;
  }

   /**
   * 
   * @return emailLocked
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmailLocked() {
    return emailLocked;
  }

  public void setEmailLocked(String emailLocked) {
    this.emailLocked = emailLocked;
  }

  public PowerFormRecipient idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

   /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   * @return idCheckConfigurationName
  **/
  @ApiModelProperty(example = "null", value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  public PowerFormRecipient idCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
    return this;
  }

   /**
   * 
   * @return idCheckRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdCheckRequired() {
    return idCheckRequired;
  }

  public void setIdCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
  }

  public PowerFormRecipient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PowerFormRecipient recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * 
   * @return recipientType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public PowerFormRecipient roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   * @return roleName
  **/
  @ApiModelProperty(example = "null", value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public PowerFormRecipient routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

   /**
   * Specifies the routing order of the recipient in the envelope. 
   * @return routingOrder
  **/
  @ApiModelProperty(example = "null", value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  public PowerFormRecipient templateRequiresIdLookup(String templateRequiresIdLookup) {
    this.templateRequiresIdLookup = templateRequiresIdLookup;
    return this;
  }

   /**
   * 
   * @return templateRequiresIdLookup
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplateRequiresIdLookup() {
    return templateRequiresIdLookup;
  }

  public void setTemplateRequiresIdLookup(String templateRequiresIdLookup) {
    this.templateRequiresIdLookup = templateRequiresIdLookup;
  }

  public PowerFormRecipient userNameLocked(String userNameLocked) {
    this.userNameLocked = userNameLocked;
    return this;
  }

   /**
   * 
   * @return userNameLocked
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserNameLocked() {
    return userNameLocked;
  }

  public void setUserNameLocked(String userNameLocked) {
    this.userNameLocked = userNameLocked;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeLocked, accessCodeRequired, email, emailLocked, idCheckConfigurationName, idCheckRequired, name, recipientType, roleName, routingOrder, templateRequiresIdLookup, userNameLocked);
  }


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

