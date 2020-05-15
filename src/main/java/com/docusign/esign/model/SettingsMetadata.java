package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SettingsMetadata
 */

public class SettingsMetadata {
  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("options")
  private java.util.List<String> options = null;

  @JsonProperty("rights")
  private String rights = null;

  @JsonProperty("uiHint")
  private String uiHint = null;

  @JsonProperty("uiOrder")
  private String uiOrder = null;

  @JsonProperty("uiType")
  private String uiType = null;

  public SettingsMetadata is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

   /**
   * When set to **true**, indicates that this module is enabled on the account.
   * @return is21CFRPart11
  **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  public SettingsMetadata options(java.util.List<String> options) {
    this.options = options;
    return this;
  }

  public SettingsMetadata addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new java.util.ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 
   * @return options
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getOptions() {
    return options;
  }

  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }

  public SettingsMetadata rights(String rights) {
    this.rights = rights;
    return this;
  }

   /**
   * 
   * @return rights
  **/
  @ApiModelProperty(value = "")
  public String getRights() {
    return rights;
  }

  public void setRights(String rights) {
    this.rights = rights;
  }

  public SettingsMetadata uiHint(String uiHint) {
    this.uiHint = uiHint;
    return this;
  }

   /**
   * 
   * @return uiHint
  **/
  @ApiModelProperty(value = "")
  public String getUiHint() {
    return uiHint;
  }

  public void setUiHint(String uiHint) {
    this.uiHint = uiHint;
  }

  public SettingsMetadata uiOrder(String uiOrder) {
    this.uiOrder = uiOrder;
    return this;
  }

   /**
   * 
   * @return uiOrder
  **/
  @ApiModelProperty(value = "")
  public String getUiOrder() {
    return uiOrder;
  }

  public void setUiOrder(String uiOrder) {
    this.uiOrder = uiOrder;
  }

  public SettingsMetadata uiType(String uiType) {
    this.uiType = uiType;
    return this;
  }

   /**
   * 
   * @return uiType
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.is21CFRPart11, settingsMetadata.is21CFRPart11) &&
        Objects.equals(this.options, settingsMetadata.options) &&
        Objects.equals(this.rights, settingsMetadata.rights) &&
        Objects.equals(this.uiHint, settingsMetadata.uiHint) &&
        Objects.equals(this.uiOrder, settingsMetadata.uiOrder) &&
        Objects.equals(this.uiType, settingsMetadata.uiType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(is21CFRPart11, options, rights, uiHint, uiOrder, uiType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsMetadata {\n");
    
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    uiHint: ").append(toIndentedString(uiHint)).append("\n");
    sb.append("    uiOrder: ").append(toIndentedString(uiOrder)).append("\n");
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

