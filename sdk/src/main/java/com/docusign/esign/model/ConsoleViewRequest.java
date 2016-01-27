package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ConsoleViewRequest   {
  
  private String envelopeId = null;
  private String returnUrl = null;

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * The URL to be redirected to after the console view session has ended.
   **/
  @ApiModelProperty(value = "The URL to be redirected to after the console view session has ended.")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleViewRequest consoleViewRequest = (ConsoleViewRequest) o;
    return Objects.equals(envelopeId, consoleViewRequest.envelopeId) &&
        Objects.equals(returnUrl, consoleViewRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, returnUrl);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleViewRequest {\n");
    
    sb.append("    envelopeId: ").append(StringUtil.toIndentedString(envelopeId)).append("\n");
    sb.append("    returnUrl: ").append(StringUtil.toIndentedString(returnUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
