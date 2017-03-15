package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SharedItem;
import com.docusign.esign.model.TemplateSharedItem;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class MemberSharedItems   {
  
  private java.util.List<SharedItem> envelopes = new java.util.ArrayList<SharedItem>();
  private ErrorDetails errorDetails = null;
  private java.util.List<TemplateSharedItem> templates = new java.util.ArrayList<TemplateSharedItem>();
  private UserInfo user = null;

  
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templates")
  public java.util.List<TemplateSharedItem> getTemplates() {
    return templates;
  }
  public void setTemplates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
  }

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSharedItems memberSharedItems = (MemberSharedItems) o;

    return true && Objects.equals(envelopes, memberSharedItems.envelopes) &&
        Objects.equals(errorDetails, memberSharedItems.errorDetails) &&
        Objects.equals(templates, memberSharedItems.templates) &&
        Objects.equals(user, memberSharedItems.user)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopes, errorDetails, templates, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSharedItems {\n");
    
    if (envelopes != null)
      sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (templates != null)
      sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    if (user != null)
      sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

