package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class EnvelopeTemplateDefinition   {
  
  private String templateId = null;
  private String name = null;
  private String shared = null;
  private String password = null;
  private String newPassword = null;
  private String description = null;
  private String lastModified = null;
  private UserInfo lastModifiedBy = null;
  private Integer pageCount = null;
  private String uri = null;
  private String folderName = null;
  private String folderId = null;
  private String folderUri = null;
  private String parentFolderUri = null;
  private UserInfo owner = null;

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("newPassword")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModifiedBy")
  public UserInfo getLastModifiedBy() {
    return lastModifiedBy;
  }
  public void setLastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  
  /**
   * An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.
   **/
  
  @ApiModelProperty(value = "An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * The name of the folder in which the template is located.
   **/
  
  @ApiModelProperty(value = "The name of the folder in which the template is located.")
  @JsonProperty("folderName")
  public String getFolderName() {
    return folderName;
  }
  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  
  /**
   * The ID for the folder.
   **/
  
  @ApiModelProperty(value = "The ID for the folder.")
  @JsonProperty("folderId")
  public String getFolderId() {
    return folderId;
  }
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  /**
   * The URI of the folder.
   **/
  
  @ApiModelProperty(value = "The URI of the folder.")
  @JsonProperty("folderUri")
  public String getFolderUri() {
    return folderUri;
  }
  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentFolderUri")
  public String getParentFolderUri() {
    return parentFolderUri;
  }
  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public UserInfo getOwner() {
    return owner;
  }
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTemplateDefinition envelopeTemplateDefinition = (EnvelopeTemplateDefinition) o;

    return true && Objects.equals(templateId, envelopeTemplateDefinition.templateId) &&
        Objects.equals(name, envelopeTemplateDefinition.name) &&
        Objects.equals(shared, envelopeTemplateDefinition.shared) &&
        Objects.equals(password, envelopeTemplateDefinition.password) &&
        Objects.equals(newPassword, envelopeTemplateDefinition.newPassword) &&
        Objects.equals(description, envelopeTemplateDefinition.description) &&
        Objects.equals(lastModified, envelopeTemplateDefinition.lastModified) &&
        Objects.equals(lastModifiedBy, envelopeTemplateDefinition.lastModifiedBy) &&
        Objects.equals(pageCount, envelopeTemplateDefinition.pageCount) &&
        Objects.equals(uri, envelopeTemplateDefinition.uri) &&
        Objects.equals(folderName, envelopeTemplateDefinition.folderName) &&
        Objects.equals(folderId, envelopeTemplateDefinition.folderId) &&
        Objects.equals(folderUri, envelopeTemplateDefinition.folderUri) &&
        Objects.equals(parentFolderUri, envelopeTemplateDefinition.parentFolderUri) &&
        Objects.equals(owner, envelopeTemplateDefinition.owner)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, shared, password, newPassword, description, lastModified, lastModifiedBy, pageCount, uri, folderName, folderId, folderUri, parentFolderUri, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateDefinition {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

