package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExternalPrimaryAccountRecipientAuthRequirements.
 *
 */

public class ExternalPrimaryAccountRecipientAuthRequirements {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("idVerification")
  private String idVerification = null;

  @JsonProperty("kba")
  private String kba = null;

  @JsonProperty("phone")
  private String phone = null;


  /**
   * accessCode.
   *
   * @return ExternalPrimaryAccountRecipientAuthRequirements
   **/
  public ExternalPrimaryAccountRecipientAuthRequirements accessCode(String accessCode) {
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
   * idVerification.
   *
   * @return ExternalPrimaryAccountRecipientAuthRequirements
   **/
  public ExternalPrimaryAccountRecipientAuthRequirements idVerification(String idVerification) {
    this.idVerification = idVerification;
    return this;
  }

  /**
   * .
   * @return idVerification
   **/
  @Schema(description = "")
  public String getIdVerification() {
    return idVerification;
  }

  /**
   * setIdVerification.
   **/
  public void setIdVerification(String idVerification) {
    this.idVerification = idVerification;
  }


  /**
   * kba.
   *
   * @return ExternalPrimaryAccountRecipientAuthRequirements
   **/
  public ExternalPrimaryAccountRecipientAuthRequirements kba(String kba) {
    this.kba = kba;
    return this;
  }

  /**
   * .
   * @return kba
   **/
  @Schema(description = "")
  public String getKba() {
    return kba;
  }

  /**
   * setKba.
   **/
  public void setKba(String kba) {
    this.kba = kba;
  }


  /**
   * phone.
   *
   * @return ExternalPrimaryAccountRecipientAuthRequirements
   **/
  public ExternalPrimaryAccountRecipientAuthRequirements phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * .
   * @return phone
   **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  /**
   * setPhone.
   **/
  public void setPhone(String phone) {
    this.phone = phone;
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
    ExternalPrimaryAccountRecipientAuthRequirements externalPrimaryAccountRecipientAuthRequirements = (ExternalPrimaryAccountRecipientAuthRequirements) o;
    return Objects.equals(this.accessCode, externalPrimaryAccountRecipientAuthRequirements.accessCode) &&
        Objects.equals(this.idVerification, externalPrimaryAccountRecipientAuthRequirements.idVerification) &&
        Objects.equals(this.kba, externalPrimaryAccountRecipientAuthRequirements.kba) &&
        Objects.equals(this.phone, externalPrimaryAccountRecipientAuthRequirements.phone);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, idVerification, kba, phone);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPrimaryAccountRecipientAuthRequirements {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    idVerification: ").append(toIndentedString(idVerification)).append("\n");
    sb.append("    kba: ").append(toIndentedString(kba)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

