package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CreditCardInformation   {
  
  private AddressInformation address = null;
  private String cardNumber = null;
  private String cardType = null;
  private String expirationMonth = null;
  private String expirationYear = null;
  private String nameOnCard = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public AddressInformation getAddress() {
    return address;
  }
  public void setAddress(AddressInformation address) {
    this.address = address;
  }

  
  /**
   * The number on the credit card.
   **/
  
  @ApiModelProperty(value = "The number on the credit card.")
  @JsonProperty("cardNumber")
  public String getCardNumber() {
    return cardNumber;
  }
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  
  /**
   * The credit card type. Valid values are: visa, mastercard, or amex.
   **/
  
  @ApiModelProperty(value = "The credit card type. Valid values are: visa, mastercard, or amex.")
  @JsonProperty("cardType")
  public String getCardType() {
    return cardType;
  }
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  
  /**
   * The month that the credit card expires (1-12).
   **/
  
  @ApiModelProperty(value = "The month that the credit card expires (1-12).")
  @JsonProperty("expirationMonth")
  public String getExpirationMonth() {
    return expirationMonth;
  }
  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  
  /**
   * The year 4 digit year in which the credit card expires.
   **/
  
  @ApiModelProperty(value = "The year 4 digit year in which the credit card expires.")
  @JsonProperty("expirationYear")
  public String getExpirationYear() {
    return expirationYear;
  }
  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  
  /**
   * The exact name printed on the credit card.
   **/
  
  @ApiModelProperty(value = "The exact name printed on the credit card.")
  @JsonProperty("nameOnCard")
  public String getNameOnCard() {
    return nameOnCard;
  }
  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInformation creditCardInformation = (CreditCardInformation) o;

    return true && Objects.equals(address, creditCardInformation.address) &&
        Objects.equals(cardNumber, creditCardInformation.cardNumber) &&
        Objects.equals(cardType, creditCardInformation.cardType) &&
        Objects.equals(expirationMonth, creditCardInformation.expirationMonth) &&
        Objects.equals(expirationYear, creditCardInformation.expirationYear) &&
        Objects.equals(nameOnCard, creditCardInformation.nameOnCard)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cardNumber, cardType, expirationMonth, expirationYear, nameOnCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInformation {\n");
    
    if (address != null)
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
    if (cardNumber != null)
      sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    if (cardType != null)
      sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    if (expirationMonth != null)
      sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    if (expirationYear != null)
      sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    if (nameOnCard != null)
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

