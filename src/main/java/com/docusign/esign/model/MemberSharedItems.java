package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SharedItem;
import com.docusign.esign.model.TemplateSharedItem;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class MemberSharedItems   {
  
  private UserInfo user = null;
  private java.util.List<SharedItem> envelopes = new java.util.ArrayList<SharedItem>();
  private java.util.List<TemplateSharedItem> templates = new java.util.ArrayList<TemplateSharedItem>();
  private ErrorDetails errorDetails = null;

  
  /**
   **/
  public MemberSharedItems user(UserInfo user) {
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
   * 
   **/
  public MemberSharedItems envelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelopes")
  public java.util.List<SharedItem> getEnvelopes() {
    return envelopes;
  }
  public void setEnvelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
  }

  
  /**
   * 
   **/
  public MemberSharedItems templates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("templates")
  public java.util.List<TemplateSharedItem> getTemplates() {
    return templates;
  }
  public void setTemplates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
  }

  
  /**
   **/
  public MemberSharedItems errorDetails(ErrorDetails errorDetails) {
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
    MemberSharedItems memberSharedItems = (MemberSharedItems) o;
    return Objects.equals(this.user, memberSharedItems.user) &&
        Objects.equals(this.envelopes, memberSharedItems.envelopes) &&
        Objects.equals(this.templates, memberSharedItems.templates) &&
        Objects.equals(this.errorDetails, memberSharedItems.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, envelopes, templates, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSharedItems {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

