package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreditCardTypes.
 *
 */

public class CreditCardTypes {
  @JsonProperty("cardTypes")
  private java.util.List<String> cardTypes = null;


  /**
   * cardTypes.
   *
   * @return CreditCardTypes
   **/
  public CreditCardTypes cardTypes(java.util.List<String> cardTypes) {
    this.cardTypes = cardTypes;
    return this;
  }
  
  /**
   * addCardTypesItem.
   *
   * @return CreditCardTypes
   **/
  public CreditCardTypes addCardTypesItem(String cardTypesItem) {
    if (this.cardTypes == null) {
      this.cardTypes = new java.util.ArrayList<>();
    }
    this.cardTypes.add(cardTypesItem);
    return this;
  }

  /**
   * An array containing supported credit card types..
   * @return cardTypes
   **/
  @Schema(description = "An array containing supported credit card types.")
  public java.util.List<String> getCardTypes() {
    return cardTypes;
  }

  /**
   * setCardTypes.
   **/
  public void setCardTypes(java.util.List<String> cardTypes) {
    this.cardTypes = cardTypes;
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
    CreditCardTypes creditCardTypes = (CreditCardTypes) o;
    return Objects.equals(this.cardTypes, creditCardTypes.cardTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(cardTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardTypes {\n");
    
    sb.append("    cardTypes: ").append(toIndentedString(cardTypes)).append("\n");
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

