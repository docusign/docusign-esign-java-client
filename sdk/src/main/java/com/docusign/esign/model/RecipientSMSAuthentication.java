package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSMSAuthentication recipientSMSAuthentication = (RecipientSMSAuthentication) o;
    return Objects.equals(senderProvidedNumbers, recipientSMSAuthentication.senderProvidedNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderProvidedNumbers);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSMSAuthentication {\n");
    
    sb.append("    senderProvidedNumbers: ").append(StringUtil.toIndentedString(senderProvidedNumbers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
