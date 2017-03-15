package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Province;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Country   {
  
  private String isoCode = null;
  private String name = null;
  private java.util.List<Province> provinces = new java.util.ArrayList<Province>();
  private String provinceValidated = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isoCode")
  public String getIsoCode() {
    return isoCode;
  }
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provinces")
  public java.util.List<Province> getProvinces() {
    return provinces;
  }
  public void setProvinces(java.util.List<Province> provinces) {
    this.provinces = provinces;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provinceValidated")
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

    return true && Objects.equals(isoCode, country.isoCode) &&
        Objects.equals(name, country.name) &&
        Objects.equals(provinces, country.provinces) &&
        Objects.equals(provinceValidated, country.provinceValidated)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode, name, provinces, provinceValidated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    if (isoCode != null)
      sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (provinces != null)
      sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
    if (provinceValidated != null)
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

