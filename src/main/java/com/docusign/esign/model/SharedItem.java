package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class SharedItem   {
  
  private UserInfo user = null;
  private String shared = null;
  private ErrorDetails errorDetails = null;

  
  /**
   **/
  public SharedItem user(UserInfo user) {
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
   * When set to **true**, this custom tab is shared.
   **/
  public SharedItem shared(String shared) {
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

  
  /**
   **/
  public SharedItem errorDetails(ErrorDetails errorDetails) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedItem sharedItem = (SharedItem) o;
    return Objects.equals(this.user, sharedItem.user) &&
        Objects.equals(this.shared, sharedItem.shared) &&
        Objects.equals(this.errorDetails, sharedItem.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shared, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedItem {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

