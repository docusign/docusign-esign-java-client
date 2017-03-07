package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandLogos   {
  
  private String email = null;
  private String primary = null;
  private String secondary = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("primary")
  public String getPrimary() {
    return primary;
  }
  public void setPrimary(String primary) {
    this.primary = primary;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondary")
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

    return true && Objects.equals(email, brandLogos.email) &&
        Objects.equals(primary, brandLogos.primary) &&
        Objects.equals(secondary, brandLogos.secondary)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, primary, secondary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLogos {\n");
    
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (primary != null)
      sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    if (secondary != null)
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

