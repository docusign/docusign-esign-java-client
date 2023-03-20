package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ExternalPrimaryAccountRecipientAuthRequirements;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LinkedExternalPrimaryAccount.
 *
 */

public class LinkedExternalPrimaryAccount {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("configurationId")
  private String configurationId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("linkId")
  private String linkId = null;

  @JsonProperty("pdfFieldHandlingOption")
  private String pdfFieldHandlingOption = null;

  @JsonProperty("recipientAuthRequirements")
  private ExternalPrimaryAccountRecipientAuthRequirements recipientAuthRequirements = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("userId")
  private String userId = null;


  /**
   * accountName.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * .
   * @return accountName
   **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  /**
   * setAccountName.
   **/
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  /**
   * configurationId.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * .
   * @return configurationId
   **/
  @Schema(description = "")
  public String getConfigurationId() {
    return configurationId;
  }

  /**
   * setConfigurationId.
   **/
  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }


  /**
   * email.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount email(String email) {
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
   * linkId.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * .
   * @return linkId
   **/
  @Schema(description = "")
  public String getLinkId() {
    return linkId;
  }

  /**
   * setLinkId.
   **/
  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  /**
   * pdfFieldHandlingOption.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount pdfFieldHandlingOption(String pdfFieldHandlingOption) {
    this.pdfFieldHandlingOption = pdfFieldHandlingOption;
    return this;
  }

  /**
   * .
   * @return pdfFieldHandlingOption
   **/
  @Schema(description = "")
  public String getPdfFieldHandlingOption() {
    return pdfFieldHandlingOption;
  }

  /**
   * setPdfFieldHandlingOption.
   **/
  public void setPdfFieldHandlingOption(String pdfFieldHandlingOption) {
    this.pdfFieldHandlingOption = pdfFieldHandlingOption;
  }


  /**
   * recipientAuthRequirements.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount recipientAuthRequirements(ExternalPrimaryAccountRecipientAuthRequirements recipientAuthRequirements) {
    this.recipientAuthRequirements = recipientAuthRequirements;
    return this;
  }

  /**
   * .
   * @return recipientAuthRequirements
   **/
  @Schema(description = "")
  public ExternalPrimaryAccountRecipientAuthRequirements getRecipientAuthRequirements() {
    return recipientAuthRequirements;
  }

  /**
   * setRecipientAuthRequirements.
   **/
  public void setRecipientAuthRequirements(ExternalPrimaryAccountRecipientAuthRequirements recipientAuthRequirements) {
    this.recipientAuthRequirements = recipientAuthRequirements;
  }


  /**
   * status.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * userId.
   *
   * @return LinkedExternalPrimaryAccount
   **/
  public LinkedExternalPrimaryAccount userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
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
    LinkedExternalPrimaryAccount linkedExternalPrimaryAccount = (LinkedExternalPrimaryAccount) o;
    return Objects.equals(this.accountName, linkedExternalPrimaryAccount.accountName) &&
        Objects.equals(this.configurationId, linkedExternalPrimaryAccount.configurationId) &&
        Objects.equals(this.email, linkedExternalPrimaryAccount.email) &&
        Objects.equals(this.linkId, linkedExternalPrimaryAccount.linkId) &&
        Objects.equals(this.pdfFieldHandlingOption, linkedExternalPrimaryAccount.pdfFieldHandlingOption) &&
        Objects.equals(this.recipientAuthRequirements, linkedExternalPrimaryAccount.recipientAuthRequirements) &&
        Objects.equals(this.status, linkedExternalPrimaryAccount.status) &&
        Objects.equals(this.userId, linkedExternalPrimaryAccount.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountName, configurationId, email, linkId, pdfFieldHandlingOption, recipientAuthRequirements, status, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedExternalPrimaryAccount {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    pdfFieldHandlingOption: ").append(toIndentedString(pdfFieldHandlingOption)).append("\n");
    sb.append("    recipientAuthRequirements: ").append(toIndentedString(recipientAuthRequirements)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

