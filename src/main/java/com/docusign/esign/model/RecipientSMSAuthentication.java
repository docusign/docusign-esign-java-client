package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains the element senderProvidedNumbers which is an Array  of phone numbers the recipient can use for SMS text authentication.
 **/

@ApiModel(description = "Contains the element senderProvidedNumbers which is an Array  of phone numbers the recipient can use for SMS text authentication.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientSMSAuthentication   {
  
  private java.util.List<String> senderProvidedNumbers = new java.util.ArrayList<String>();

  
  /**
   * An Array containing a list of phone numbers the recipient may use for SMS text authentication.
   **/
  
  @ApiModelProperty(value = "An Array containing a list of phone numbers the recipient may use for SMS text authentication.")
  @JsonProperty("senderProvidedNumbers")
  public java.util.List<String> getSenderProvidedNumbers() {
    return senderProvidedNumbers;
  }
  public void setSenderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSMSAuthentication recipientSMSAuthentication = (RecipientSMSAuthentication) o;

    return true && Objects.equals(senderProvidedNumbers, recipientSMSAuthentication.senderProvidedNumbers)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderProvidedNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSMSAuthentication {\n");
    
    if (senderProvidedNumbers != null)
      sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
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

