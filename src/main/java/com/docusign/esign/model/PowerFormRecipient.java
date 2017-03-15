package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PowerFormRecipient   {
  
  private String accessCode = null;
  private String accessCodeLocked = null;
  private String accessCodeRequired = null;
  private String email = null;
  private String emailLocked = null;
  private String idCheckConfigurationName = null;
  private String idCheckRequired = null;
  private String name = null;
  private String recipientType = null;
  private String roleName = null;
  private String routingOrder = null;
  private String templateRequiresIdLookup = null;
  private String userNameLocked = null;

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessCodeLocked")
  public String getAccessCodeLocked() {
    return accessCodeLocked;
  }
  public void setAccessCodeLocked(String accessCodeLocked) {
    this.accessCodeLocked = accessCodeLocked;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessCodeRequired")
  public String getAccessCodeRequired() {
    return accessCodeRequired;
  }
  public void setAccessCodeRequired(String accessCodeRequired) {
    this.accessCodeRequired = accessCodeRequired;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailLocked")
  public String getEmailLocked() {
    return emailLocked;
  }
  public void setEmailLocked(String emailLocked) {
    this.emailLocked = emailLocked;
  }

  
  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   **/
  
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  @JsonProperty("idCheckConfigurationName")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idCheckRequired")
  public String getIdCheckRequired() {
    return idCheckRequired;
  }
  public void setIdCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
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
  @JsonProperty("recipientType")
  public String getRecipientType() {
    return recipientType;
  }
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  
  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   **/
  
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  @JsonProperty("roleName")
  public String getRoleName() {
    return roleName;
  }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  
  /**
   * Specifies the routing order of the recipient in the envelope.
   **/
  
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope.")
  @JsonProperty("routingOrder")
  public String getRoutingOrder() {
    return routingOrder;
  }
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templateRequiresIdLookup")
  public String getTemplateRequiresIdLookup() {
    return templateRequiresIdLookup;
  }
  public void setTemplateRequiresIdLookup(String templateRequiresIdLookup) {
    this.templateRequiresIdLookup = templateRequiresIdLookup;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userNameLocked")
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

    return true && Objects.equals(accessCode, powerFormRecipient.accessCode) &&
        Objects.equals(accessCodeLocked, powerFormRecipient.accessCodeLocked) &&
        Objects.equals(accessCodeRequired, powerFormRecipient.accessCodeRequired) &&
        Objects.equals(email, powerFormRecipient.email) &&
        Objects.equals(emailLocked, powerFormRecipient.emailLocked) &&
        Objects.equals(idCheckConfigurationName, powerFormRecipient.idCheckConfigurationName) &&
        Objects.equals(idCheckRequired, powerFormRecipient.idCheckRequired) &&
        Objects.equals(name, powerFormRecipient.name) &&
        Objects.equals(recipientType, powerFormRecipient.recipientType) &&
        Objects.equals(roleName, powerFormRecipient.roleName) &&
        Objects.equals(routingOrder, powerFormRecipient.routingOrder) &&
        Objects.equals(templateRequiresIdLookup, powerFormRecipient.templateRequiresIdLookup) &&
        Objects.equals(userNameLocked, powerFormRecipient.userNameLocked)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeLocked, accessCodeRequired, email, emailLocked, idCheckConfigurationName, idCheckRequired, name, recipientType, roleName, routingOrder, templateRequiresIdLookup, userNameLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormRecipient {\n");
    
    if (accessCode != null)
      sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    if (accessCodeLocked != null)
      sb.append("    accessCodeLocked: ").append(toIndentedString(accessCodeLocked)).append("\n");
    if (accessCodeRequired != null)
      sb.append("    accessCodeRequired: ").append(toIndentedString(accessCodeRequired)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (emailLocked != null)
      sb.append("    emailLocked: ").append(toIndentedString(emailLocked)).append("\n");
    if (idCheckConfigurationName != null)
      sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    if (idCheckRequired != null)
      sb.append("    idCheckRequired: ").append(toIndentedString(idCheckRequired)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (recipientType != null)
      sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    if (roleName != null)
      sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    if (routingOrder != null)
      sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    if (templateRequiresIdLookup != null)
      sb.append("    templateRequiresIdLookup: ").append(toIndentedString(templateRequiresIdLookup)).append("\n");
    if (userNameLocked != null)
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

