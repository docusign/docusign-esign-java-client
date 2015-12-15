package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Ssn9InformationInput   {
  
  private String ssn9 = null;
  private String displayLevelCode = null;

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ssn9InformationInput ssn9InformationInput = (Ssn9InformationInput) o;
    return Objects.equals(ssn9, ssn9InformationInput.ssn9) &&
        Objects.equals(displayLevelCode, ssn9InformationInput.displayLevelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssn9, displayLevelCode);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssn9InformationInput {\n");
    
    sb.append("    ssn9: ").append(StringUtil.toIndentedString(ssn9)).append("\n");
    sb.append("    displayLevelCode: ").append(StringUtil.toIndentedString(displayLevelCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
