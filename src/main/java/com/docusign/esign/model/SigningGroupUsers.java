package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SigningGroupUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SigningGroupUsers   {
  
  private java.util.List<SigningGroupUser> users = new java.util.ArrayList<SigningGroupUser>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("users")
  public java.util.List<SigningGroupUser> getUsers() {
    return users;
  }
  public void setUsers(java.util.List<SigningGroupUser> users) {
    this.users = users;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningGroupUsers signingGroupUsers = (SigningGroupUsers) o;

    return true && Objects.equals(users, signingGroupUsers.users)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroupUsers {\n");
    
    if (users != null)
      sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

