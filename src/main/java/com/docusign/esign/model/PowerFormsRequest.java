package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PowerForm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PowerFormsRequest   {
  
  private java.util.List<PowerForm> powerForms = new java.util.ArrayList<PowerForm>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("powerForms")
  public java.util.List<PowerForm> getPowerForms() {
    return powerForms;
  }
  public void setPowerForms(java.util.List<PowerForm> powerForms) {
    this.powerForms = powerForms;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerFormsRequest powerFormsRequest = (PowerFormsRequest) o;

    return true && Objects.equals(powerForms, powerFormsRequest.powerForms)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormsRequest {\n");
    
    if (powerForms != null)
      sb.append("    powerForms: ").append(toIndentedString(powerForms)).append("\n");
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

