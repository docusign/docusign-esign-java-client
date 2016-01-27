package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.AddressInformation;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class AddressInformationInput   {
  
  private AddressInformation addressInformation = null;
  private String displayLevelCode = null;
  private String receiveInResponse = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("addressInformation")
  public AddressInformation getAddressInformation() {
    return addressInformation;
  }
  public void setAddressInformation(AddressInformation addressInformation) {
    this.addressInformation = addressInformation;
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
    AddressInformationInput addressInformationInput = (AddressInformationInput) o;
    return Objects.equals(addressInformation, addressInformationInput.addressInformation) &&
        Objects.equals(displayLevelCode, addressInformationInput.displayLevelCode) &&
        Objects.equals(receiveInResponse, addressInformationInput.receiveInResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformation, displayLevelCode, receiveInResponse);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformationInput {\n");
    
    sb.append("    addressInformation: ").append(StringUtil.toIndentedString(addressInformation)).append("\n");
    sb.append("    displayLevelCode: ").append(StringUtil.toIndentedString(displayLevelCode)).append("\n");
    sb.append("    receiveInResponse: ").append(StringUtil.toIndentedString(receiveInResponse)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
