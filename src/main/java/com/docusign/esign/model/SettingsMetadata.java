package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SettingsMetadata   {
  
  private String is21CFRPart11 = null;
  private java.util.List<String> options = new java.util.ArrayList<String>();
  private String rights = null;
  private String uiHint = null;
  private String uiOrder = null;
  private String uiType = null;

  
  /**
   * When set to **true**, indicates that this module is enabled on the account.
   **/
  
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  @JsonProperty("is21CFRPart11")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  public java.util.List<String> getOptions() {
    return options;
  }
  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rights")
  public String getRights() {
    return rights;
  }
  public void setRights(String rights) {
    this.rights = rights;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uiHint")
  public String getUiHint() {
    return uiHint;
  }
  public void setUiHint(String uiHint) {
    this.uiHint = uiHint;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uiOrder")
  public String getUiOrder() {
    return uiOrder;
  }
  public void setUiOrder(String uiOrder) {
    this.uiOrder = uiOrder;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uiType")
  public String getUiType() {
    return uiType;
  }
  public void setUiType(String uiType) {
    this.uiType = uiType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsMetadata settingsMetadata = (SettingsMetadata) o;

    return true && Objects.equals(is21CFRPart11, settingsMetadata.is21CFRPart11) &&
        Objects.equals(options, settingsMetadata.options) &&
        Objects.equals(rights, settingsMetadata.rights) &&
        Objects.equals(uiHint, settingsMetadata.uiHint) &&
        Objects.equals(uiOrder, settingsMetadata.uiOrder) &&
        Objects.equals(uiType, settingsMetadata.uiType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(is21CFRPart11, options, rights, uiHint, uiOrder, uiType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsMetadata {\n");
    
    if (is21CFRPart11 != null)
      sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    if (options != null)
      sb.append("    options: ").append(toIndentedString(options)).append("\n");
    if (rights != null)
      sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    if (uiHint != null)
      sb.append("    uiHint: ").append(toIndentedString(uiHint)).append("\n");
    if (uiOrder != null)
      sb.append("    uiOrder: ").append(toIndentedString(uiOrder)).append("\n");
    if (uiType != null)
      sb.append("    uiType: ").append(toIndentedString(uiType)).append("\n");
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

