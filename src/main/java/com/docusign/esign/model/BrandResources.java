package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Information about the resource files that the brand uses for the email, signing, sending, and captive (embedded) signing experiences..
 *
 */
@Schema(description = "Information about the resource files that the brand uses for the email, signing, sending, and captive (embedded) signing experiences.")

public class BrandResources {
  @JsonProperty("createdByUserInfo")
  private UserInfo createdByUserInfo = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("dataNotSavedNotInMaster")
  private java.util.List<String> dataNotSavedNotInMaster = null;

  @JsonProperty("modifiedByUserInfo")
  private UserInfo modifiedByUserInfo = null;

  @JsonProperty("modifiedDate")
  private String modifiedDate = null;

  @JsonProperty("modifiedTemplates")
  private java.util.List<String> modifiedTemplates = null;

  @JsonProperty("resourcesContentType")
  private String resourcesContentType = null;

  @JsonProperty("resourcesContentUri")
  private String resourcesContentUri = null;


  /**
   * createdByUserInfo.
   *
   * @return BrandResources
   **/
  public BrandResources createdByUserInfo(UserInfo createdByUserInfo) {
    this.createdByUserInfo = createdByUserInfo;
    return this;
  }

  /**
   * The user ID of the user who created the brand resource..
   * @return createdByUserInfo
   **/
  @Schema(description = "The user ID of the user who created the brand resource.")
  public UserInfo getCreatedByUserInfo() {
    return createdByUserInfo;
  }

  /**
   * setCreatedByUserInfo.
   **/
  public void setCreatedByUserInfo(UserInfo createdByUserInfo) {
    this.createdByUserInfo = createdByUserInfo;
  }


  /**
   * createdDate.
   *
   * @return BrandResources
   **/
  public BrandResources createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * .
   * @return createdDate
   **/
  @Schema(description = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * dataNotSavedNotInMaster.
   *
   * @return BrandResources
   **/
  public BrandResources dataNotSavedNotInMaster(java.util.List<String> dataNotSavedNotInMaster) {
    this.dataNotSavedNotInMaster = dataNotSavedNotInMaster;
    return this;
  }
  
  /**
   * addDataNotSavedNotInMasterItem.
   *
   * @return BrandResources
   **/
  public BrandResources addDataNotSavedNotInMasterItem(String dataNotSavedNotInMasterItem) {
    if (this.dataNotSavedNotInMaster == null) {
      this.dataNotSavedNotInMaster = new java.util.ArrayList<>();
    }
    this.dataNotSavedNotInMaster.add(dataNotSavedNotInMasterItem);
    return this;
  }

  /**
   * .
   * @return dataNotSavedNotInMaster
   **/
  @Schema(description = "")
  public java.util.List<String> getDataNotSavedNotInMaster() {
    return dataNotSavedNotInMaster;
  }

  /**
   * setDataNotSavedNotInMaster.
   **/
  public void setDataNotSavedNotInMaster(java.util.List<String> dataNotSavedNotInMaster) {
    this.dataNotSavedNotInMaster = dataNotSavedNotInMaster;
  }


  /**
   * modifiedByUserInfo.
   *
   * @return BrandResources
   **/
  public BrandResources modifiedByUserInfo(UserInfo modifiedByUserInfo) {
    this.modifiedByUserInfo = modifiedByUserInfo;
    return this;
  }

  /**
   * Information about the user who last modified the brand resource..
   * @return modifiedByUserInfo
   **/
  @Schema(description = "Information about the user who last modified the brand resource.")
  public UserInfo getModifiedByUserInfo() {
    return modifiedByUserInfo;
  }

  /**
   * setModifiedByUserInfo.
   **/
  public void setModifiedByUserInfo(UserInfo modifiedByUserInfo) {
    this.modifiedByUserInfo = modifiedByUserInfo;
  }


  /**
   * modifiedDate.
   *
   * @return BrandResources
   **/
  public BrandResources modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * .
   * @return modifiedDate
   **/
  @Schema(description = "")
  public String getModifiedDate() {
    return modifiedDate;
  }

  /**
   * setModifiedDate.
   **/
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   * modifiedTemplates.
   *
   * @return BrandResources
   **/
  public BrandResources modifiedTemplates(java.util.List<String> modifiedTemplates) {
    this.modifiedTemplates = modifiedTemplates;
    return this;
  }
  
  /**
   * addModifiedTemplatesItem.
   *
   * @return BrandResources
   **/
  public BrandResources addModifiedTemplatesItem(String modifiedTemplatesItem) {
    if (this.modifiedTemplates == null) {
      this.modifiedTemplates = new java.util.ArrayList<>();
    }
    this.modifiedTemplates.add(modifiedTemplatesItem);
    return this;
  }

  /**
   * .
   * @return modifiedTemplates
   **/
  @Schema(description = "")
  public java.util.List<String> getModifiedTemplates() {
    return modifiedTemplates;
  }

  /**
   * setModifiedTemplates.
   **/
  public void setModifiedTemplates(java.util.List<String> modifiedTemplates) {
    this.modifiedTemplates = modifiedTemplates;
  }


  /**
   * resourcesContentType.
   *
   * @return BrandResources
   **/
  public BrandResources resourcesContentType(String resourcesContentType) {
    this.resourcesContentType = resourcesContentType;
    return this;
  }

  /**
   * .
   * @return resourcesContentType
   **/
  @Schema(description = "")
  public String getResourcesContentType() {
    return resourcesContentType;
  }

  /**
   * setResourcesContentType.
   **/
  public void setResourcesContentType(String resourcesContentType) {
    this.resourcesContentType = resourcesContentType;
  }


  /**
   * resourcesContentUri.
   *
   * @return BrandResources
   **/
  public BrandResources resourcesContentUri(String resourcesContentUri) {
    this.resourcesContentUri = resourcesContentUri;
    return this;
  }

  /**
   * .
   * @return resourcesContentUri
   **/
  @Schema(description = "")
  public String getResourcesContentUri() {
    return resourcesContentUri;
  }

  /**
   * setResourcesContentUri.
   **/
  public void setResourcesContentUri(String resourcesContentUri) {
    this.resourcesContentUri = resourcesContentUri;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandResources brandResources = (BrandResources) o;
    return Objects.equals(this.createdByUserInfo, brandResources.createdByUserInfo) &&
        Objects.equals(this.createdDate, brandResources.createdDate) &&
        Objects.equals(this.dataNotSavedNotInMaster, brandResources.dataNotSavedNotInMaster) &&
        Objects.equals(this.modifiedByUserInfo, brandResources.modifiedByUserInfo) &&
        Objects.equals(this.modifiedDate, brandResources.modifiedDate) &&
        Objects.equals(this.modifiedTemplates, brandResources.modifiedTemplates) &&
        Objects.equals(this.resourcesContentType, brandResources.resourcesContentType) &&
        Objects.equals(this.resourcesContentUri, brandResources.resourcesContentUri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(createdByUserInfo, createdDate, dataNotSavedNotInMaster, modifiedByUserInfo, modifiedDate, modifiedTemplates, resourcesContentType, resourcesContentUri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResources {\n");
    
    sb.append("    createdByUserInfo: ").append(toIndentedString(createdByUserInfo)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    dataNotSavedNotInMaster: ").append(toIndentedString(dataNotSavedNotInMaster)).append("\n");
    sb.append("    modifiedByUserInfo: ").append(toIndentedString(modifiedByUserInfo)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedTemplates: ").append(toIndentedString(modifiedTemplates)).append("\n");
    sb.append("    resourcesContentType: ").append(toIndentedString(resourcesContentType)).append("\n");
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

