package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Country. */
public class Country {
  @JsonProperty("isoCode")
  private String isoCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("provinces")
  private java.util.List<Province> provinces = null;

  @JsonProperty("provinceValidated")
  private String provinceValidated = null;

  /**
   * isoCode.
   *
   * @return Country
   */
  public Country isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

  /**
   * .
   *
   * @return isoCode
   */
  @ApiModelProperty(value = "")
  public String getIsoCode() {
    return isoCode;
  }

  /** setIsoCode. */
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  /**
   * name.
   *
   * @return Country
   */
  public Country name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * provinces.
   *
   * @return Country
   */
  public Country provinces(java.util.List<Province> provinces) {
    this.provinces = provinces;
    return this;
  }

  /**
   * addProvincesItem.
   *
   * @return Country
   */
  public Country addProvincesItem(Province provincesItem) {
    if (this.provinces == null) {
      this.provinces = new java.util.ArrayList<>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

  /**
   * .
   *
   * @return provinces
   */
  @ApiModelProperty(value = "")
  public java.util.List<Province> getProvinces() {
    return provinces;
  }

  /** setProvinces. */
  public void setProvinces(java.util.List<Province> provinces) {
    this.provinces = provinces;
  }

  /**
   * provinceValidated.
   *
   * @return Country
   */
  public Country provinceValidated(String provinceValidated) {
    this.provinceValidated = provinceValidated;
    return this;
  }

  /**
   * .
   *
   * @return provinceValidated
   */
  @ApiModelProperty(value = "")
  public String getProvinceValidated() {
    return provinceValidated;
  }

  /** setProvinceValidated. */
  public void setProvinceValidated(String provinceValidated) {
    this.provinceValidated = provinceValidated;
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
    Country country = (Country) o;
    return Objects.equals(this.isoCode, country.isoCode)
        && Objects.equals(this.name, country.name)
        && Objects.equals(this.provinces, country.provinces)
        && Objects.equals(this.provinceValidated, country.provinceValidated);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(isoCode, name, provinces, provinceValidated);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
