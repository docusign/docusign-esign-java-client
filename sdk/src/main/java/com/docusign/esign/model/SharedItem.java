package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class SharedItem   {
  
  private UserInfo user = null;
  private String shared = null;
  private ErrorDetails errorDetails = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedItem sharedItem = (SharedItem) o;
    return Objects.equals(user, sharedItem.user) &&
        Objects.equals(shared, sharedItem.shared) &&
        Objects.equals(errorDetails, sharedItem.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shared, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedItem {\n");
    
    sb.append("    user: ").append(StringUtil.toIndentedString(user)).append("\n");
    sb.append("    shared: ").append(StringUtil.toIndentedString(shared)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
