package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignatureProperties
 */

public class SignatureProperties {
  @JsonProperty("filter")
  private String filter = null;

  @JsonProperty("subFilter")
  private String subFilter = null;

  public SignatureProperties filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * 
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public SignatureProperties subFilter(String subFilter) {
    this.subFilter = subFilter;
    return this;
  }

   /**
   * 
   * @return subFilter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubFilter() {
    return subFilter;
  }

  public void setSubFilter(String subFilter) {
    this.subFilter = subFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureProperties signatureProperties = (SignatureProperties) o;
    return Objects.equals(this.filter, signatureProperties.filter) &&
        Objects.equals(this.subFilter, signatureProperties.subFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, subFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureProperties {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    subFilter: ").append(toIndentedString(subFilter)).append("\n");
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

