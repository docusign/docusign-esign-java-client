package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class Ssn4InformationInput   {
  
  private String ssn4 = null;
  private String displayLevelCode = null;
  private String receiveInResponse = null;

  
  /**
   * The last four digits of the recipient's Social Security Number (SSN).
   **/
  public Ssn4InformationInput ssn4(String ssn4) {
    this.ssn4 = ssn4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last four digits of the recipient's Social Security Number (SSN).")
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
  public Ssn4InformationInput displayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay")
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
  public Ssn4InformationInput receiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the information needs to be returned in the response.")
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
    Ssn4InformationInput ssn4InformationInput = (Ssn4InformationInput) o;
    return Objects.equals(this.ssn4, ssn4InformationInput.ssn4) &&
        Objects.equals(this.displayLevelCode, ssn4InformationInput.displayLevelCode) &&
        Objects.equals(this.receiveInResponse, ssn4InformationInput.receiveInResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssn4, displayLevelCode, receiveInResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssn4InformationInput {\n");
    
    sb.append("    ssn4: ").append(toIndentedString(ssn4)).append("\n");
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

