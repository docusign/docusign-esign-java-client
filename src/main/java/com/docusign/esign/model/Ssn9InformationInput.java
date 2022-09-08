package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Ssn9InformationInput.
 *
 */

public class Ssn9InformationInput {
  @JsonProperty("displayLevelCode")
  private String displayLevelCode = null;

  @JsonProperty("ssn9")
  private String ssn9 = null;


  /**
   * displayLevelCode.
   *
   * @return Ssn9InformationInput
   **/
  public Ssn9InformationInput displayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
    return this;
  }

  /**
   * Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay.
   * @return displayLevelCode
   **/
  @ApiModelProperty(value = "Specifies the display level for the recipient.  Valid values are:   * ReadOnly * Editable * DoNotDisplay")
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
   * ssn9.
   *
   * @return Ssn9InformationInput
   **/
  public Ssn9InformationInput ssn9(String ssn9) {
    this.ssn9 = ssn9;
    return this;
  }

  /**
   *  The recipient's Social Security Number(SSN)..
   * @return ssn9
   **/
  @ApiModelProperty(value = " The recipient's Social Security Number(SSN).")
  public String getSsn9() {
    return ssn9;
  }

  /**
   * setSsn9.
   **/
  public void setSsn9(String ssn9) {
    this.ssn9 = ssn9;
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
    Ssn9InformationInput ssn9InformationInput = (Ssn9InformationInput) o;
    return Objects.equals(this.displayLevelCode, ssn9InformationInput.displayLevelCode) &&
        Objects.equals(this.ssn9, ssn9InformationInput.ssn9);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(displayLevelCode, ssn9);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssn9InformationInput {\n");
    
    sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
    sb.append("    ssn9: ").append(toIndentedString(ssn9)).append("\n");
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

