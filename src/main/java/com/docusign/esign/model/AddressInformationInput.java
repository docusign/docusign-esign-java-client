package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains address input information.
 **/

@ApiModel(description = "Contains address input information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInformationInput addressInformationInput = (AddressInformationInput) o;

    return true && Objects.equals(addressInformation, addressInformationInput.addressInformation) &&
        Objects.equals(displayLevelCode, addressInformationInput.displayLevelCode) &&
        Objects.equals(receiveInResponse, addressInformationInput.receiveInResponse)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformation, displayLevelCode, receiveInResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformationInput {\n");
    
    if (addressInformation != null)
      sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    if (displayLevelCode != null)
      sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
    if (receiveInResponse != null)
      sb.append("    receiveInResponse: ").append(toIndentedString(receiveInResponse)).append("\n");
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

