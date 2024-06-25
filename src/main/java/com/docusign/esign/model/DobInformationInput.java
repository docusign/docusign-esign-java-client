package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Complex type containing:  * dateOfBirth * displayLevelCode * receiveInResponse.
 *
 */
@Schema(description = "Complex type containing:  * dateOfBirth * displayLevelCode * receiveInResponse")

public class DobInformationInput implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("displayLevelCode")
  private String displayLevelCode = null;

  @JsonProperty("receiveInResponse")
  private String receiveInResponse = null;


  /**
   * dateOfBirth.
   *
   * @return DobInformationInput
   **/
  public DobInformationInput dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Specifies the recipient's date, month, and year of birth..
   * @return dateOfBirth
   **/
  @Schema(description = "Specifies the recipient's date, month, and year of birth.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * setDateOfBirth.
   **/
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  /**
   * displayLevelCode.
   *
   * @return DobInformationInput
   **/
  public DobInformationInput displayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
    return this;
  }

  /**
   * Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay.
   * @return displayLevelCode
   **/
  @Schema(description = "Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay")
  public String getDisplayLevelCode() {
    return displayLevelCode;
  }

  /**
   * setDisplayLevelCode.
   **/
  public void setDisplayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
  }


  /**
   * receiveInResponse.
   *
   * @return DobInformationInput
   **/
  public DobInformationInput receiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
    return this;
  }

  /**
   * When set to **true**, the information needs to be returned in the response..
   * @return receiveInResponse
   **/
  @Schema(description = "When set to **true**, the information needs to be returned in the response.")
  public String getReceiveInResponse() {
    return receiveInResponse;
  }

  /**
   * setReceiveInResponse.
   **/
  public void setReceiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, displayLevelCode, receiveInResponse);
  }


  /**
   * Converts the given object to string.
   */
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

