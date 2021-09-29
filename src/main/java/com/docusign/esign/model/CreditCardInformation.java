package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AddressInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreditCardInformation.
 *
 */

public class CreditCardInformation {
  @JsonProperty("address")
  private AddressInformation address = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("cardType")
  private String cardType = null;

  @JsonProperty("expirationMonth")
  private String expirationMonth = null;

  @JsonProperty("expirationYear")
  private String expirationYear = null;

  @JsonProperty("nameOnCard")
  private String nameOnCard = null;


  /**
   * address.
   *
   * @return CreditCardInformation
   **/
  public CreditCardInformation address(AddressInformation address) {
    this.address = address;
    return this;
  }

  /**
   * Get address.
   * @return address
   **/
  @ApiModelProperty(value = "")
  public AddressInformation getAddress() {
    return address;
  }

  /**
   * setAddress.
   **/
  public void setAddress(AddressInformation address) {
    this.address = address;
  }


  /**
   * cardNumber.
   *
   * @return CreditCardInformation
   **/
  public CreditCardInformation cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * The number on the credit card..
   * @return cardNumber
   **/
  @ApiModelProperty(value = "The number on the credit card.")
  public String getCardNumber() {
    return cardNumber;
  }

  /**
   * setCardNumber.
   **/
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  /**
   * cardType.
   *
   * @return CreditCardInformation
   **/
  public CreditCardInformation cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * The credit card type. Valid values are: visa, mastercard, or amex..
   * @return cardType
   **/
  @ApiModelProperty(value = "The credit card type. Valid values are: visa, mastercard, or amex.")
  public String getCardType() {
    return cardType;
  }

  /**
   * setCardType.
   **/
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  /**
   * expirationMonth.
   *
   * @return CreditCardInformation
   **/
  public CreditCardInformation expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * The month that the credit card expires (1-12)..
   * @return expirationMonth
   **/
  @ApiModelProperty(value = "The month that the credit card expires (1-12).")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  /**
   * setExpirationMonth.
   **/
  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }


  /**
   * expirationYear.
   *
   * @return CreditCardInformation
   **/
  public CreditCardInformation expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * The year 4 digit year in which the credit card expires..
   * @return expirationYear
   **/
  @ApiModelProperty(value = "The year 4 digit year in which the credit card expires.")
  public String getExpirationYear() {
    return expirationYear;
  }

  /**
   * setExpirationYear.
   **/
  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }


  /**
   * nameOnCard.
   *
   * @return CreditCardInformation
   **/
  public CreditCardInformation nameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
    return this;
  }

  /**
   * The exact name printed on the credit card..
   * @return nameOnCard
   **/
  @ApiModelProperty(value = "The exact name printed on the credit card.")
  public String getNameOnCard() {
    return nameOnCard;
  }

  /**
   * setNameOnCard.
   **/
  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
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
    return Objects.equals(this.address, creditCardInformation.address) &&
        Objects.equals(this.cardNumber, creditCardInformation.cardNumber) &&
        Objects.equals(this.cardType, creditCardInformation.cardType) &&
        Objects.equals(this.expirationMonth, creditCardInformation.expirationMonth) &&
        Objects.equals(this.expirationYear, creditCardInformation.expirationYear) &&
        Objects.equals(this.nameOnCard, creditCardInformation.nameOnCard);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(address, cardNumber, cardType, expirationMonth, expirationYear, nameOnCard);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInformation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
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

