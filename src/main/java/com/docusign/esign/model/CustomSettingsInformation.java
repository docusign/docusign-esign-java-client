package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CustomSettingsInformation   {
  
  private java.util.List<NameValue> customSettings = new java.util.ArrayList<NameValue>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customSettings")
  public java.util.List<NameValue> getCustomSettings() {
    return customSettings;
  }
  public void setCustomSettings(java.util.List<NameValue> customSettings) {
    this.customSettings = customSettings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSettingsInformation customSettingsInformation = (CustomSettingsInformation) o;

    return true && Objects.equals(customSettings, customSettingsInformation.customSettings)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSettingsInformation {\n");
    
    if (customSettings != null)
      sb.append("    customSettings: ").append(toIndentedString(customSettings)).append("\n");
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

