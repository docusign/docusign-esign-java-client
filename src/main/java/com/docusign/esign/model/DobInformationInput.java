package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Complex type containing:  * dateOfBirth * displayLevelCode * receiveInResponse
 */
@ApiModel(description = "Complex type containing:  * dateOfBirth * displayLevelCode * receiveInResponse")

public class DobInformationInput {
  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("displayLevelCode")
  private String displayLevelCode = null;

  @JsonProperty("receiveInResponse")
  private String receiveInResponse = null;

  public DobInformationInput dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Specifies the recipient's date, month, and year of birth.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Specifies the recipient's date, month, and year of birth.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public DobInformationInput displayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
    return this;
  }

   /**
   * Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay
   * @return displayLevelCode
  **/
  @ApiModelProperty(value = "Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay")
  public String getDisplayLevelCode() {
    return displayLevelCode;
  }

  public void setDisplayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
  }

  public DobInformationInput receiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
    return this;
  }

   /**
   * When set to **true**, the information needs to be returned in the response.
   * @return receiveInResponse
  **/
  @ApiModelProperty(value = "When set to **true**, the information needs to be returned in the response.")
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
    DobInformationInput dobInformationInput = (DobInformationInput) o;
    return Objects.equals(this.dateOfBirth, dobInformationInput.dateOfBirth) &&
        Objects.equals(this.displayLevelCode, dobInformationInput.displayLevelCode) &&
        Objects.equals(this.receiveInResponse, dobInformationInput.receiveInResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, displayLevelCode, receiveInResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DobInformationInput {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

