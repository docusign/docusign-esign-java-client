package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SharedItem;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSharedItems memberSharedItems = (MemberSharedItems) o;

    return true && Objects.equals(user, memberSharedItems.user) &&
        Objects.equals(envelopes, memberSharedItems.envelopes) &&
        Objects.equals(errorDetails, memberSharedItems.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, envelopes, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSharedItems {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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

