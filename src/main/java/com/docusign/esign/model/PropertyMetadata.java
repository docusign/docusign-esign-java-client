package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PropertyMetadata   {
  
  private java.util.List<String> options = new java.util.ArrayList<String>();
  private String rights = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  public java.util.List<String> getOptions() {
    return options;
  }
  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rights")
  public String getRights() {
    return rights;
  }
  public void setRights(String rights) {
    this.rights = rights;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMetadata propertyMetadata = (PropertyMetadata) o;

    return true && Objects.equals(options, propertyMetadata.options) &&
        Objects.equals(rights, propertyMetadata.rights)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMetadata {\n");
    
    if (options != null)
      sb.append("    options: ").append(toIndentedString(options)).append("\n");
    if (rights != null)
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

