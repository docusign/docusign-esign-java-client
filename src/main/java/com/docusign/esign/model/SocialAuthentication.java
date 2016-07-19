package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class SocialAuthentication   {
  
  private String authentication = null;

  
  /**
   * Reserved: TBD
   **/
  public SocialAuthentication authentication(String authentication) {
    this.authentication = authentication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("authentication")
  public String getAuthentication() {
    return authentication;
  }
  public void setAuthentication(String authentication) {
    this.authentication = authentication;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialAuthentication socialAuthentication = (SocialAuthentication) o;
    return Objects.equals(this.authentication, socialAuthentication.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAuthentication {\n");
    
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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

