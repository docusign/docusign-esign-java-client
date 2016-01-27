package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.SharedItem;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class MemberSharedItems   {
  
  private UserInfo user = null;
  private java.util.List<SharedItem> envelopes = new java.util.ArrayList<SharedItem>();
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
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("envelopes")
  public java.util.List<SharedItem> getEnvelopes() {
    return envelopes;
  }
  public void setEnvelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
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
    MemberSharedItems memberSharedItems = (MemberSharedItems) o;
    return Objects.equals(user, memberSharedItems.user) &&
        Objects.equals(envelopes, memberSharedItems.envelopes) &&
        Objects.equals(errorDetails, memberSharedItems.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, envelopes, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSharedItems {\n");
    
    sb.append("    user: ").append(StringUtil.toIndentedString(user)).append("\n");
    sb.append("    envelopes: ").append(StringUtil.toIndentedString(envelopes)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
