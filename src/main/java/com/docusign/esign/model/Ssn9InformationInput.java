package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class Ssn9InformationInput   {
  
  private String ssn9 = null;
  private String displayLevelCode = null;

  
  /**
   *  The recipient's Social Security Number(SSN).
   **/
  public Ssn9InformationInput ssn9(String ssn9) {
    this.ssn9 = ssn9;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " The recipient's Social Security Number(SSN).")
  @JsonProperty("ssn9")
  public String getSsn9() {
    return ssn9;
  }
  public void setSsn9(String ssn9) {
    this.ssn9 = ssn9;
  }

  
  /**
   * Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay
   **/
  public Ssn9InformationInput displayLevelCode(String displayLevelCode) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ssn9InformationInput ssn9InformationInput = (Ssn9InformationInput) o;
    return Objects.equals(this.ssn9, ssn9InformationInput.ssn9) &&
        Objects.equals(this.displayLevelCode, ssn9InformationInput.displayLevelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssn9, displayLevelCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssn9InformationInput {\n");
    
    sb.append("    ssn9: ").append(toIndentedString(ssn9)).append("\n");
    sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
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

