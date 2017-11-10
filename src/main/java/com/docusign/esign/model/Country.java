package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Province;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Country
 */

public class Country {
  @JsonProperty("isoCode")
  private String isoCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("provinces")
  private java.util.List<Province> provinces = new java.util.ArrayList<Province>();

  @JsonProperty("provinceValidated")
  private String provinceValidated = null;

  public Country isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * 
   * @return isoCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public Country name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country provinces(java.util.List<Province> provinces) {
    this.provinces = provinces;
    return this;
  }

  public Country addProvincesItem(Province provincesItem) {
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * 
   * @return provinces
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Province> getProvinces() {
    return provinces;
  }

  public void setProvinces(java.util.List<Province> provinces) {
    this.provinces = provinces;
  }

  public Country provinceValidated(String provinceValidated) {
    this.provinceValidated = provinceValidated;
    return this;
  }

   /**
   * 
   * @return provinceValidated
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProvinceValidated() {
    return provinceValidated;
  }

  public void setProvinceValidated(String provinceValidated) {
    this.provinceValidated = provinceValidated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.isoCode, country.isoCode) &&
        Objects.equals(this.name, country.name) &&
        Objects.equals(this.provinces, country.provinces) &&
        Objects.equals(this.provinceValidated, country.provinceValidated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode, name, provinces, provinceValidated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
    sb.append("    provinceValidated: ").append(toIndentedString(provinceValidated)).append("\n");
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

