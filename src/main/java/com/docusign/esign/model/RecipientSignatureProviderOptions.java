package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Option settings for the signature provider. Different providers require or use different options. [The current provider list and the options they require.](/docs/esign-rest-api/esign101/concepts/standards-based-signatures/).
 *
 */
@Schema(description = "Option settings for the signature provider. Different providers require or use different options. [The current provider list and the options they require.](/docs/esign-rest-api/esign101/concepts/standards-based-signatures/)")

public class RecipientSignatureProviderOptions {
  @JsonProperty("cpfNumber")
  private String cpfNumber = null;

  @JsonProperty("cpfNumberMetadata")
  private PropertyMetadata cpfNumberMetadata = null;

  @JsonProperty("oneTimePassword")
  private String oneTimePassword = null;

  @JsonProperty("oneTimePasswordMetadata")
  private PropertyMetadata oneTimePasswordMetadata = null;

  @JsonProperty("signerRole")
  private String signerRole = null;

  @JsonProperty("signerRoleMetadata")
  private PropertyMetadata signerRoleMetadata = null;

  @JsonProperty("sms")
  private String sms = null;

  @JsonProperty("smsMetadata")
  private PropertyMetadata smsMetadata = null;


  /**
   * cpfNumber.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions cpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
    return this;
  }

  /**
   * .
   * @return cpfNumber
   **/
  @Schema(description = "")
  public String getCpfNumber() {
    return cpfNumber;
  }

  /**
   * setCpfNumber.
   **/
  public void setCpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
  }


  /**
   * cpfNumberMetadata.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions cpfNumberMetadata(PropertyMetadata cpfNumberMetadata) {
    this.cpfNumberMetadata = cpfNumberMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return cpfNumberMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getCpfNumberMetadata() {
    return cpfNumberMetadata;
  }

  /**
   * setCpfNumberMetadata.
   **/
  public void setCpfNumberMetadata(PropertyMetadata cpfNumberMetadata) {
    this.cpfNumberMetadata = cpfNumberMetadata;
  }


  /**
   * oneTimePassword.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions oneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
    return this;
  }

  /**
   * .
   * @return oneTimePassword
   **/
  @Schema(description = "")
  public String getOneTimePassword() {
    return oneTimePassword;
  }

  /**
   * setOneTimePassword.
   **/
  public void setOneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
  }


  /**
   * oneTimePasswordMetadata.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions oneTimePasswordMetadata(PropertyMetadata oneTimePasswordMetadata) {
    this.oneTimePasswordMetadata = oneTimePasswordMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `oneTimePassword` property is editable..
   * @return oneTimePasswordMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `oneTimePassword` property is editable.")
  public PropertyMetadata getOneTimePasswordMetadata() {
    return oneTimePasswordMetadata;
  }

  /**
   * setOneTimePasswordMetadata.
   **/
  public void setOneTimePasswordMetadata(PropertyMetadata oneTimePasswordMetadata) {
    this.oneTimePasswordMetadata = oneTimePasswordMetadata;
  }


  /**
   * signerRole.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions signerRole(String signerRole) {
    this.signerRole = signerRole;
    return this;
  }

  /**
   * .
   * @return signerRole
   **/
  @Schema(description = "")
  public String getSignerRole() {
    return signerRole;
  }

  /**
   * setSignerRole.
   **/
  public void setSignerRole(String signerRole) {
    this.signerRole = signerRole;
  }


  /**
   * signerRoleMetadata.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions signerRoleMetadata(PropertyMetadata signerRoleMetadata) {
    this.signerRoleMetadata = signerRoleMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signerRole` property is editable..
   * @return signerRoleMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signerRole` property is editable.")
  public PropertyMetadata getSignerRoleMetadata() {
    return signerRoleMetadata;
  }

  /**
   * setSignerRoleMetadata.
   **/
  public void setSignerRoleMetadata(PropertyMetadata signerRoleMetadata) {
    this.signerRoleMetadata = signerRoleMetadata;
  }


  /**
   * sms.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions sms(String sms) {
    this.sms = sms;
    return this;
  }

  /**
   * .
   * @return sms
   **/
  @Schema(description = "")
  public String getSms() {
    return sms;
  }

  /**
   * setSms.
   **/
  public void setSms(String sms) {
    this.sms = sms;
  }


  /**
   * smsMetadata.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions smsMetadata(PropertyMetadata smsMetadata) {
    this.smsMetadata = smsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `sms` property is editable..
   * @return smsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `sms` property is editable.")
  public PropertyMetadata getSmsMetadata() {
    return smsMetadata;
  }

  /**
   * setSmsMetadata.
   **/
  public void setSmsMetadata(PropertyMetadata smsMetadata) {
    this.smsMetadata = smsMetadata;
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
    RecipientSignatureProviderOptions recipientSignatureProviderOptions = (RecipientSignatureProviderOptions) o;
    return Objects.equals(this.cpfNumber, recipientSignatureProviderOptions.cpfNumber) &&
        Objects.equals(this.cpfNumberMetadata, recipientSignatureProviderOptions.cpfNumberMetadata) &&
        Objects.equals(this.oneTimePassword, recipientSignatureProviderOptions.oneTimePassword) &&
        Objects.equals(this.oneTimePasswordMetadata, recipientSignatureProviderOptions.oneTimePasswordMetadata) &&
        Objects.equals(this.signerRole, recipientSignatureProviderOptions.signerRole) &&
        Objects.equals(this.signerRoleMetadata, recipientSignatureProviderOptions.signerRoleMetadata) &&
        Objects.equals(this.sms, recipientSignatureProviderOptions.sms) &&
        Objects.equals(this.smsMetadata, recipientSignatureProviderOptions.smsMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(cpfNumber, cpfNumberMetadata, oneTimePassword, oneTimePasswordMetadata, signerRole, signerRoleMetadata, sms, smsMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureProviderOptions {\n");
    
    sb.append("    cpfNumber: ").append(toIndentedString(cpfNumber)).append("\n");
    sb.append("    cpfNumberMetadata: ").append(toIndentedString(cpfNumberMetadata)).append("\n");
    sb.append("    oneTimePassword: ").append(toIndentedString(oneTimePassword)).append("\n");
    sb.append("    oneTimePasswordMetadata: ").append(toIndentedString(oneTimePasswordMetadata)).append("\n");
    sb.append("    signerRole: ").append(toIndentedString(signerRole)).append("\n");
    sb.append("    signerRoleMetadata: ").append(toIndentedString(signerRoleMetadata)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    smsMetadata: ").append(toIndentedString(smsMetadata)).append("\n");
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

