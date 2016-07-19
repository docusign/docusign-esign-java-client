package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class ReturnUrlRequest   {
  
  private String returnUrl = null;

  
  /**
   * Identifies the return point after sending the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are: \n\n* send (user sends the envelope)\n* save (user saves the envelope)\n* cancel (user cancels the sending transaction. No envelopeId is returned in this case.)\n* error (there is an error when performing the send)\n* sessionEnd (the sending session ends before the user completes another action).
   **/
  public ReturnUrlRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the return point after sending the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are: \n\n* send (user sends the envelope)\n* save (user saves the envelope)\n* cancel (user cancels the sending transaction. No envelopeId is returned in this case.)\n* error (there is an error when performing the send)\n* sessionEnd (the sending session ends before the user completes another action).")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnUrlRequest returnUrlRequest = (ReturnUrlRequest) o;
    return Objects.equals(this.returnUrl, returnUrlRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnUrlRequest {\n");
    
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

