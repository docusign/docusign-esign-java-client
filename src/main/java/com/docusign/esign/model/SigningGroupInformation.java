package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SigningGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SigningGroupInformation   {
  
  private java.util.List<SigningGroup> groups = new java.util.ArrayList<SigningGroup>();

  
  /**
   * A collection group objects containing information about the groups returned.
   **/
  
  @ApiModelProperty(value = "A collection group objects containing information about the groups returned.")
  @JsonProperty("groups")
  public java.util.List<SigningGroup> getGroups() {
    return groups;
  }
  public void setGroups(java.util.List<SigningGroup> groups) {
    this.groups = groups;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningGroupInformation signingGroupInformation = (SigningGroupInformation) o;

    return true && Objects.equals(groups, signingGroupInformation.groups)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroupInformation {\n");
    
    if (groups != null)
      sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

