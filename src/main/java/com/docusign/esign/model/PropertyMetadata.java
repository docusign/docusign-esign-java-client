package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Metadata about a property..
 *
 */
@ApiModel(description = "Metadata about a property.")

public class PropertyMetadata {
  @JsonProperty("options")
  private java.util.List<String> options = null;

  @JsonProperty("rights")
  private String rights = null;


  /**
   * options.
   *
   * @return PropertyMetadata
   **/
  public PropertyMetadata options(java.util.List<String> options) {
    this.options = options;
    return this;
  }
  
  /**
   * addOptionsItem.
   *
   * @return PropertyMetadata
   **/
  public PropertyMetadata addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new java.util.ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * .
   * @return options
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getOptions() {
    return options;
  }

  /**
   * setOptions.
   **/
  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }


  /**
   * rights.
   *
   * @return PropertyMetadata
   **/
  public PropertyMetadata rights(String rights) {
    this.rights = rights;
    return this;
  }

  /**
   * .
   * @return rights
   **/
  @ApiModelProperty(value = "")
  public String getRights() {
    return rights;
  }

  /**
   * setRights.
   **/
  public void setRights(String rights) {
    this.rights = rights;
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
    PropertyMetadata propertyMetadata = (PropertyMetadata) o;
    return Objects.equals(this.options, propertyMetadata.options) &&
        Objects.equals(this.rights, propertyMetadata.rights);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(options, rights);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMetadata {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

