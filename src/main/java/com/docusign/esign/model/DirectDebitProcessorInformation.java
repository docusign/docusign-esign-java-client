package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DirectDebitProcessorInformation
 */

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

  public DirectDebitProcessorInformation bankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
    return this;
  }

   /**
   * 
   * @return bankBranchCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankBranchCode() {
    return bankBranchCode;
  }

  public void setBankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
  }

  public DirectDebitProcessorInformation bankCheckDigit(String bankCheckDigit) {
    this.bankCheckDigit = bankCheckDigit;
    return this;
  }

   /**
   * 
   * @return bankCheckDigit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankCheckDigit() {
    return bankCheckDigit;
  }

  public void setBankCheckDigit(String bankCheckDigit) {
    this.bankCheckDigit = bankCheckDigit;
  }

  public DirectDebitProcessorInformation bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * 
   * @return bankCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public DirectDebitProcessorInformation bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * 
   * @return bankName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public DirectDebitProcessorInformation bankTransferAccountName(String bankTransferAccountName) {
    this.bankTransferAccountName = bankTransferAccountName;
    return this;
  }

   /**
   * 
   * @return bankTransferAccountName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankTransferAccountName() {
    return bankTransferAccountName;
  }

  public void setBankTransferAccountName(String bankTransferAccountName) {
    this.bankTransferAccountName = bankTransferAccountName;
  }

  public DirectDebitProcessorInformation bankTransferAccountNumber(String bankTransferAccountNumber) {
    this.bankTransferAccountNumber = bankTransferAccountNumber;
    return this;
  }

   /**
   * 
   * @return bankTransferAccountNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankTransferAccountNumber() {
    return bankTransferAccountNumber;
  }

  public void setBankTransferAccountNumber(String bankTransferAccountNumber) {
    this.bankTransferAccountNumber = bankTransferAccountNumber;
  }

  public DirectDebitProcessorInformation bankTransferType(String bankTransferType) {
    this.bankTransferType = bankTransferType;
    return this;
  }

   /**
   * 
   * @return bankTransferType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBankTransferType() {
    return bankTransferType;
  }

  public void setBankTransferType(String bankTransferType) {
    this.bankTransferType = bankTransferType;
  }

  public DirectDebitProcessorInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Specifies the country associated with the address.
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Specifies the country associated with the address.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public DirectDebitProcessorInformation email(String email) {
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

  public DirectDebitProcessorInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user's first name.  Maximum Length: 50 characters.
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public DirectDebitProcessorInformation iBAN(String iBAN) {
    this.iBAN = iBAN;
    return this;
  }

   /**
   * 
   * @return iBAN
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIBAN() {
    return iBAN;
  }

  public void setIBAN(String iBAN) {
    this.iBAN = iBAN;
  }

  public DirectDebitProcessorInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * 
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(bankBranchCode, bankCheckDigit, bankCode, bankName, bankTransferAccountName, bankTransferAccountNumber, bankTransferType, country, email, firstName, iBAN, lastName);
  }


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

