package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CreditCardTypes   {
  
  private java.util.List<String> cardTypes = new java.util.ArrayList<String>();

  
  /**
   * An array containing supported credit card types.
   **/
  
  @ApiModelProperty(value = "An array containing supported credit card types.")
  @JsonProperty("cardTypes")
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

    return true && Objects.equals(cardTypes, creditCardTypes.cardTypes)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardTypes {\n");
    
    if (cardTypes != null)
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

