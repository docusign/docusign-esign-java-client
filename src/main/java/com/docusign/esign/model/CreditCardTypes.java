package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreditCardTypes
 */

public class CreditCardTypes {
  @JsonProperty("cardTypes")
  private java.util.List<String> cardTypes = new java.util.ArrayList<String>();

  public CreditCardTypes cardTypes(java.util.List<String> cardTypes) {
    this.cardTypes = cardTypes;
    return this;
  }

  public CreditCardTypes addCardTypesItem(String cardTypesItem) {
    this.cardTypes.add(cardTypesItem);
    return this;
  }

   /**
   * An array containing supported credit card types.
   * @return cardTypes
  **/
  @ApiModelProperty(example = "null", value = "An array containing supported credit card types.")
  public java.util.List<String> getCardTypes() {
    return cardTypes;
  }

  public void setCardTypes(java.util.List<String> cardTypes) {
    this.cardTypes = cardTypes;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(cardTypes);
  }


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

