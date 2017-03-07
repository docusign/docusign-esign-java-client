package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandResources   {
  
  private UserInfo createdByUserInfo = null;
  private String createdDate = null;
  private UserInfo modifiedByUserInfo = null;
  private String modifiedDate = null;
  private java.util.List<String> modifiedTemplates = new java.util.ArrayList<String>();
  private String resourcesContentType = null;
  private String resourcesContentUri = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdByUserInfo")
  public UserInfo getCreatedByUserInfo() {
    return createdByUserInfo;
  }
  public void setCreatedByUserInfo(UserInfo createdByUserInfo) {
    this.createdByUserInfo = createdByUserInfo;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdDate")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedByUserInfo")
  public UserInfo getModifiedByUserInfo() {
    return modifiedByUserInfo;
  }
  public void setModifiedByUserInfo(UserInfo modifiedByUserInfo) {
    this.modifiedByUserInfo = modifiedByUserInfo;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedDate")
  public String getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedTemplates")
  public java.util.List<String> getModifiedTemplates() {
    return modifiedTemplates;
  }
  public void setModifiedTemplates(java.util.List<String> modifiedTemplates) {
    this.modifiedTemplates = modifiedTemplates;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resourcesContentType")
  public String getResourcesContentType() {
    return resourcesContentType;
  }
  public void setResourcesContentType(String resourcesContentType) {
    this.resourcesContentType = resourcesContentType;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resourcesContentUri")
  public String getResourcesContentUri() {
    return resourcesContentUri;
  }
  public void setResourcesContentUri(String resourcesContentUri) {
    this.resourcesContentUri = resourcesContentUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandResources brandResources = (BrandResources) o;

    return true && Objects.equals(createdByUserInfo, brandResources.createdByUserInfo) &&
        Objects.equals(createdDate, brandResources.createdDate) &&
        Objects.equals(modifiedByUserInfo, brandResources.modifiedByUserInfo) &&
        Objects.equals(modifiedDate, brandResources.modifiedDate) &&
        Objects.equals(modifiedTemplates, brandResources.modifiedTemplates) &&
        Objects.equals(resourcesContentType, brandResources.resourcesContentType) &&
        Objects.equals(resourcesContentUri, brandResources.resourcesContentUri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByUserInfo, createdDate, modifiedByUserInfo, modifiedDate, modifiedTemplates, resourcesContentType, resourcesContentUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResources {\n");
    
    if (createdByUserInfo != null)
      sb.append("    createdByUserInfo: ").append(toIndentedString(createdByUserInfo)).append("\n");
    if (createdDate != null)
      sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    if (modifiedByUserInfo != null)
      sb.append("    modifiedByUserInfo: ").append(toIndentedString(modifiedByUserInfo)).append("\n");
    if (modifiedDate != null)
      sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    if (modifiedTemplates != null)
      sb.append("    modifiedTemplates: ").append(toIndentedString(modifiedTemplates)).append("\n");
    if (resourcesContentType != null)
      sb.append("    resourcesContentType: ").append(toIndentedString(resourcesContentType)).append("\n");
    if (resourcesContentUri != null)
      sb.append("    resourcesContentUri: ").append(toIndentedString(resourcesContentUri)).append("\n");
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

