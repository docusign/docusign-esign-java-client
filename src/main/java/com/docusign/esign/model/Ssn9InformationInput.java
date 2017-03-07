package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Ssn9InformationInput   {
  
  private String displayLevelCode = null;
  private String ssn9 = null;

  
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
   * The recipient's Social Security Number(SSN).
   **/
  
  @ApiModelProperty(value = "The recipient's Social Security Number(SSN).")
  @JsonProperty("ssn9")
  public String getSsn9() {
    return ssn9;
  }
  public void setSsn9(String ssn9) {
    this.ssn9 = ssn9;
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

    return true && Objects.equals(displayLevelCode, ssn9InformationInput.displayLevelCode) &&
        Objects.equals(ssn9, ssn9InformationInput.ssn9)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayLevelCode, ssn9);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssn9InformationInput {\n");
    
    if (displayLevelCode != null)
      sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
    if (ssn9 != null)
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

