package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about a bank that processes a customer&#39;s direct debit payments..
 *
 */
@Schema(description = "Contains information about a bank that processes a customer's direct debit payments.")

public class DirectDebitProcessorInformation {
  @JsonProperty("bankBranchCode")
  private String bankBranchCode = null;

  @JsonProperty("bankCheckDigit")
  private String bankCheckDigit = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("bankTransferAccountName")
  private String bankTransferAccountName = null;

  @JsonProperty("bankTransferAccountNumber")
  private String bankTransferAccountNumber = null;

  @JsonProperty("bankTransferType")
  private String bankTransferType = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("iBAN")
  private String iBAN = null;

  @JsonProperty("lastName")
  private String lastName = null;


  /**
   * bankBranchCode.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
    return this;
  }

  /**
   * .
   * @return bankBranchCode
   **/
  @Schema(description = "")
  public String getBankBranchCode() {
    return bankBranchCode;
  }

  /**
   * setBankBranchCode.
   **/
  public void setBankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
  }


  /**
   * bankCheckDigit.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankCheckDigit(String bankCheckDigit) {
    this.bankCheckDigit = bankCheckDigit;
    return this;
  }

  /**
   * .
   * @return bankCheckDigit
   **/
  @Schema(description = "")
  public String getBankCheckDigit() {
    return bankCheckDigit;
  }

  /**
   * setBankCheckDigit.
   **/
  public void setBankCheckDigit(String bankCheckDigit) {
    this.bankCheckDigit = bankCheckDigit;
  }


  /**
   * bankCode.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * .
   * @return bankCode
   **/
  @Schema(description = "")
  public String getBankCode() {
    return bankCode;
  }

  /**
   * setBankCode.
   **/
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  /**
   * bankName.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * .
   * @return bankName
   **/
  @Schema(description = "")
  public String getBankName() {
    return bankName;
  }

  /**
   * setBankName.
   **/
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  /**
   * bankTransferAccountName.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankTransferAccountName(String bankTransferAccountName) {
    this.bankTransferAccountName = bankTransferAccountName;
    return this;
  }

  /**
   * .
   * @return bankTransferAccountName
   **/
  @Schema(description = "")
  public String getBankTransferAccountName() {
    return bankTransferAccountName;
  }

  /**
   * setBankTransferAccountName.
   **/
  public void setBankTransferAccountName(String bankTransferAccountName) {
    this.bankTransferAccountName = bankTransferAccountName;
  }


  /**
   * bankTransferAccountNumber.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankTransferAccountNumber(String bankTransferAccountNumber) {
    this.bankTransferAccountNumber = bankTransferAccountNumber;
    return this;
  }

  /**
   * .
   * @return bankTransferAccountNumber
   **/
  @Schema(description = "")
  public String getBankTransferAccountNumber() {
    return bankTransferAccountNumber;
  }

  /**
   * setBankTransferAccountNumber.
   **/
  public void setBankTransferAccountNumber(String bankTransferAccountNumber) {
    this.bankTransferAccountNumber = bankTransferAccountNumber;
  }


  /**
   * bankTransferType.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation bankTransferType(String bankTransferType) {
    this.bankTransferType = bankTransferType;
    return this;
  }

  /**
   * .
   * @return bankTransferType
   **/
  @Schema(description = "")
  public String getBankTransferType() {
    return bankTransferType;
  }

  /**
   * setBankTransferType.
   **/
  public void setBankTransferType(String bankTransferType) {
    this.bankTransferType = bankTransferType;
  }


  /**
   * country.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Specifies the country associated with the address..
   * @return country
   **/
  @Schema(description = "Specifies the country associated with the address.")
  public String getCountry() {
    return country;
  }

  /**
   * setCountry.
   **/
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * email.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation email(String email) {
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
   * firstName.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.  Maximum Length: 50 characters..
   * @return firstName
   **/
  @Schema(description = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * iBAN.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation iBAN(String iBAN) {
    this.iBAN = iBAN;
    return this;
  }

  /**
   * .
   * @return iBAN
   **/
  @Schema(description = "")
  public String getIBAN() {
    return iBAN;
  }

  /**
   * setIBAN.
   **/
  public void setIBAN(String iBAN) {
    this.iBAN = iBAN;
  }


  /**
   * lastName.
   *
   * @return DirectDebitProcessorInformation
   **/
  public DirectDebitProcessorInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * .
   * @return lastName
   **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
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
    DirectDebitProcessorInformation directDebitProcessorInformation = (DirectDebitProcessorInformation) o;
    return Objects.equals(this.bankBranchCode, directDebitProcessorInformation.bankBranchCode) &&
        Objects.equals(this.bankCheckDigit, directDebitProcessorInformation.bankCheckDigit) &&
        Objects.equals(this.bankCode, directDebitProcessorInformation.bankCode) &&
        Objects.equals(this.bankName, directDebitProcessorInformation.bankName) &&
        Objects.equals(this.bankTransferAccountName, directDebitProcessorInformation.bankTransferAccountName) &&
        Objects.equals(this.bankTransferAccountNumber, directDebitProcessorInformation.bankTransferAccountNumber) &&
        Objects.equals(this.bankTransferType, directDebitProcessorInformation.bankTransferType) &&
        Objects.equals(this.country, directDebitProcessorInformation.country) &&
        Objects.equals(this.email, directDebitProcessorInformation.email) &&
        Objects.equals(this.firstName, directDebitProcessorInformation.firstName) &&
        Objects.equals(this.iBAN, directDebitProcessorInformation.iBAN) &&
        Objects.equals(this.lastName, directDebitProcessorInformation.lastName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bankBranchCode, bankCheckDigit, bankCode, bankName, bankTransferAccountName, bankTransferAccountNumber, bankTransferType, country, email, firstName, iBAN, lastName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitProcessorInformation {\n");
    
    sb.append("    bankBranchCode: ").append(toIndentedString(bankBranchCode)).append("\n");
    sb.append("    bankCheckDigit: ").append(toIndentedString(bankCheckDigit)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankTransferAccountName: ").append(toIndentedString(bankTransferAccountName)).append("\n");
    sb.append("    bankTransferAccountNumber: ").append(toIndentedString(bankTransferAccountNumber)).append("\n");
    sb.append("    bankTransferType: ").append(toIndentedString(bankTransferType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    iBAN: ").append(toIndentedString(iBAN)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

