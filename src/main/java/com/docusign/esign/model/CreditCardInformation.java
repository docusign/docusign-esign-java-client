package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CreditCardInformation. */
public class CreditCardInformation {
  @JsonProperty("address")
  private AddressInformation address = null;

  @JsonProperty("cardLastDigits")
  private String cardLastDigits = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("cardType")
  private String cardType = null;

  @JsonProperty("cvNumber")
  private String cvNumber = null;

  @JsonProperty("expirationMonth")
  private String expirationMonth = null;

  @JsonProperty("expirationYear")
  private String expirationYear = null;

  @JsonProperty("nameOnCard")
  private String nameOnCard = null;

  @JsonProperty("tokenizedCard")
  private String tokenizedCard = null;

  /**
   * address.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation address(AddressInformation address) {
    this.address = address;
    return this;
  }

  /**
   * Get address.
   *
   * @return address
   */
  @ApiModelProperty(value = "")
  public AddressInformation getAddress() {
    return address;
  }

  /** setAddress. */
  public void setAddress(AddressInformation address) {
    this.address = address;
  }

  /**
   * cardLastDigits.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation cardLastDigits(String cardLastDigits) {
    this.cardLastDigits = cardLastDigits;
    return this;
  }

  /**
   * .
   *
   * @return cardLastDigits
   */
  @ApiModelProperty(value = "")
  public String getCardLastDigits() {
    return cardLastDigits;
  }

  /** setCardLastDigits. */
  public void setCardLastDigits(String cardLastDigits) {
    this.cardLastDigits = cardLastDigits;
  }

  /**
   * cardNumber.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * The number on the credit card..
   *
   * @return cardNumber
   */
  @ApiModelProperty(value = "The number on the credit card.")
  public String getCardNumber() {
    return cardNumber;
  }

  /** setCardNumber. */
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  /**
   * cardType.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * The credit card type. Valid values are: visa, mastercard, or amex..
   *
   * @return cardType
   */
  @ApiModelProperty(value = "The credit card type. Valid values are: visa, mastercard, or amex.")
  public String getCardType() {
    return cardType;
  }

  /** setCardType. */
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  /**
   * cvNumber.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation cvNumber(String cvNumber) {
    this.cvNumber = cvNumber;
    return this;
  }

  /**
   * .
   *
   * @return cvNumber
   */
  @ApiModelProperty(value = "")
  public String getCvNumber() {
    return cvNumber;
  }

  /** setCvNumber. */
  public void setCvNumber(String cvNumber) {
    this.cvNumber = cvNumber;
  }

  /**
   * expirationMonth.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * The month that the credit card expires (1-12)..
   *
   * @return expirationMonth
   */
  @ApiModelProperty(value = "The month that the credit card expires (1-12).")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  /** setExpirationMonth. */
  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  /**
   * expirationYear.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * The year 4 digit year in which the credit card expires..
   *
   * @return expirationYear
   */
  @ApiModelProperty(value = "The year 4 digit year in which the credit card expires.")
  public String getExpirationYear() {
    return expirationYear;
  }

  /** setExpirationYear. */
  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  /**
   * nameOnCard.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation nameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
    return this;
  }

  /**
   * The exact name printed on the credit card..
   *
   * @return nameOnCard
   */
  @ApiModelProperty(value = "The exact name printed on the credit card.")
  public String getNameOnCard() {
    return nameOnCard;
  }

  /** setNameOnCard. */
  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  /**
   * tokenizedCard.
   *
   * @return CreditCardInformation
   */
  public CreditCardInformation tokenizedCard(String tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

  /**
   * .
   *
   * @return tokenizedCard
   */
  @ApiModelProperty(value = "")
  public String getTokenizedCard() {
    return tokenizedCard;
  }

  /** setTokenizedCard. */
  public void setTokenizedCard(String tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
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
    CreditCardInformation creditCardInformation = (CreditCardInformation) o;
    return Objects.equals(this.address, creditCardInformation.address)
        && Objects.equals(this.cardLastDigits, creditCardInformation.cardLastDigits)
        && Objects.equals(this.cardNumber, creditCardInformation.cardNumber)
        && Objects.equals(this.cardType, creditCardInformation.cardType)
        && Objects.equals(this.cvNumber, creditCardInformation.cvNumber)
        && Objects.equals(this.expirationMonth, creditCardInformation.expirationMonth)
        && Objects.equals(this.expirationYear, creditCardInformation.expirationYear)
        && Objects.equals(this.nameOnCard, creditCardInformation.nameOnCard)
        && Objects.equals(this.tokenizedCard, creditCardInformation.tokenizedCard);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        address,
        cardLastDigits,
        cardNumber,
        cardType,
        cvNumber,
        expirationMonth,
        expirationYear,
        nameOnCard,
        tokenizedCard);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInformation {\n");

    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cardLastDigits: ").append(toIndentedString(cardLastDigits)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cvNumber: ").append(toIndentedString(cvNumber)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
