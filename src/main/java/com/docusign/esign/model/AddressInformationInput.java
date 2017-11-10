package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains address input information.
 */
@ApiModel(description = "Contains address input information.")

public class AddressInformationInput {
  @JsonProperty("addressInformation")
  private AddressInformation addressInformation = null;

  @JsonProperty("displayLevelCode")
  private String displayLevelCode = null;

  @JsonProperty("receiveInResponse")
  private String receiveInResponse = null;

  public AddressInformationInput addressInformation(AddressInformation addressInformation) {
    this.addressInformation = addressInformation;
    return this;
  }

   /**
   * Get addressInformation
   * @return addressInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressInformation getAddressInformation() {
    return addressInformation;
  }

  public void setAddressInformation(AddressInformation addressInformation) {
    this.addressInformation = addressInformation;
  }

  public AddressInformationInput displayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
    return this;
  }

   /**
   * Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay
   * @return displayLevelCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay")
  public String getDisplayLevelCode() {
    return displayLevelCode;
  }

  public void setDisplayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
  }

  public AddressInformationInput receiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
    return this;
  }

   /**
   * When set to **true**, the information needs to be returned in the response.
   * @return receiveInResponse
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the information needs to be returned in the response.")
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
    return Objects.equals(this.addressInformation, addressInformationInput.addressInformation) &&
        Objects.equals(this.displayLevelCode, addressInformationInput.displayLevelCode) &&
        Objects.equals(this.receiveInResponse, addressInformationInput.receiveInResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformation, displayLevelCode, receiveInResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformationInput {\n");
    
    sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
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

