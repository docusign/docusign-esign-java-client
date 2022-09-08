package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Province.
 *
 */

public class Province {
  @JsonProperty("isoCode")
  private String isoCode = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * isoCode.
   *
   * @return Province
   **/
  public Province isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

  /**
   * .
   * @return isoCode
   **/
  @ApiModelProperty(value = "")
  public String getIsoCode() {
    return isoCode;
  }

  /**
   * setIsoCode.
   **/
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }


  /**
   * name.
   *
   * @return Province
   **/
  public Province name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
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
    Province province = (Province) o;
    return Objects.equals(this.isoCode, province.isoCode) &&
        Objects.equals(this.name, province.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isoCode, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Province {\n");
    
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

