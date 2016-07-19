package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class UserSharedItem   {
  
  private UserInfo user = null;
  private ErrorDetails errorDetails = null;
  private String shared = null;

  
  /**
   **/
  public UserSharedItem user(UserInfo user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public UserInfo getUser() {
    return user;
  }
  public void setUser(UserInfo user) {
    this.user = user;
  }

  
  /**
   **/
  public UserSharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  public UserSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSharedItem userSharedItem = (UserSharedItem) o;
    return Objects.equals(this.user, userSharedItem.user) &&
        Objects.equals(this.errorDetails, userSharedItem.errorDetails) &&
        Objects.equals(this.shared, userSharedItem.shared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, errorDetails, shared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSharedItem {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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

