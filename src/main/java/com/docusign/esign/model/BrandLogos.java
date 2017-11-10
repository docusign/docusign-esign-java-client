package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandLogos
 */

public class BrandLogos {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("primary")
  private String primary = null;

  @JsonProperty("secondary")
  private String secondary = null;

  public BrandLogos email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BrandLogos primary(String primary) {
    this.primary = primary;
    return this;
  }

   /**
   * 
   * @return primary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public BrandLogos secondary(String secondary) {
    this.secondary = secondary;
    return this;
  }

   /**
   * 
   * @return secondary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSecondary() {
    return secondary;
  }

  public void setSecondary(String secondary) {
    this.secondary = secondary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandLogos brandLogos = (BrandLogos) o;
    return Objects.equals(this.email, brandLogos.email) &&
        Objects.equals(this.primary, brandLogos.primary) &&
        Objects.equals(this.secondary, brandLogos.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, primary, secondary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLogos {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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

