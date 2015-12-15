package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Ssn4InformationInput   {
  
  private String ssn4 = null;
  private String displayLevelCode = null;
  private String receiveInResponse = null;

  
  /**
   * The last four digits of the recipient's Social Security Number (SSN).
   **/
  @ApiModelProperty(value = "The last four digits of the recipient's Social Security Number (SSN).")
  @JsonProperty("ssn4")
  public String getSsn4() {
    return ssn4;
  }
  public void setSsn4(String ssn4) {
    this.ssn4 = ssn4;
  }

  
  /**
   * Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay
   **/
  @ApiModelProperty(value = "Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay")
  @JsonProperty("displayLevelCode")
  public String getDisplayLevelCode() {
    return displayLevelCode;
  }
  public void setDisplayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
  }

  
  /**
   * When set to **true**, the information needs to be returned in the response.
   **/
  @ApiModelProperty(value = "When set to **true**, the information needs to be returned in the response.")
  @JsonProperty("receiveInResponse")
  public String getReceiveInResponse() {
    return receiveInResponse;
  }
  public void setReceiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ssn4InformationInput ssn4InformationInput = (Ssn4InformationInput) o;
    return Objects.equals(ssn4, ssn4InformationInput.ssn4) &&
        Objects.equals(displayLevelCode, ssn4InformationInput.displayLevelCode) &&
        Objects.equals(receiveInResponse, ssn4InformationInput.receiveInResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssn4, displayLevelCode, receiveInResponse);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssn4InformationInput {\n");
    
    sb.append("    ssn4: ").append(StringUtil.toIndentedString(ssn4)).append("\n");
    sb.append("    displayLevelCode: ").append(StringUtil.toIndentedString(displayLevelCode)).append("\n");
    sb.append("    receiveInResponse: ").append(StringUtil.toIndentedString(receiveInResponse)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
