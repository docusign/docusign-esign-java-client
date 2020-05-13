package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalDocumentSources
 */

public class ExternalDocumentSources {
  @JsonProperty("boxnetEnabled")
  private String boxnetEnabled = null;

  @JsonProperty("boxnetMetadata")
  private SettingsMetadata boxnetMetadata = null;

  @JsonProperty("dropboxEnabled")
  private String dropboxEnabled = null;

  @JsonProperty("dropboxMetadata")
  private SettingsMetadata dropboxMetadata = null;

  @JsonProperty("googleDriveEnabled")
  private String googleDriveEnabled = null;

  @JsonProperty("googleDriveMetadata")
  private SettingsMetadata googleDriveMetadata = null;

  @JsonProperty("oneDriveEnabled")
  private String oneDriveEnabled = null;

  @JsonProperty("oneDriveMetadata")
  private SettingsMetadata oneDriveMetadata = null;

  @JsonProperty("salesforceEnabled")
  private String salesforceEnabled = null;

  @JsonProperty("salesforceMetadata")
  private SettingsMetadata salesforceMetadata = null;

  public ExternalDocumentSources boxnetEnabled(String boxnetEnabled) {
    this.boxnetEnabled = boxnetEnabled;
    return this;
  }

   /**
   * 
   * @return boxnetEnabled
  **/
  @ApiModelProperty(value = "")
  public String getBoxnetEnabled() {
    return boxnetEnabled;
  }

  public void setBoxnetEnabled(String boxnetEnabled) {
    this.boxnetEnabled = boxnetEnabled;
  }

  public ExternalDocumentSources boxnetMetadata(SettingsMetadata boxnetMetadata) {
    this.boxnetMetadata = boxnetMetadata;
    return this;
  }

   /**
   * Get boxnetMetadata
   * @return boxnetMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getBoxnetMetadata() {
    return boxnetMetadata;
  }

  public void setBoxnetMetadata(SettingsMetadata boxnetMetadata) {
    this.boxnetMetadata = boxnetMetadata;
  }

  public ExternalDocumentSources dropboxEnabled(String dropboxEnabled) {
    this.dropboxEnabled = dropboxEnabled;
    return this;
  }

   /**
   * 
   * @return dropboxEnabled
  **/
  @ApiModelProperty(value = "")
  public String getDropboxEnabled() {
    return dropboxEnabled;
  }

  public void setDropboxEnabled(String dropboxEnabled) {
    this.dropboxEnabled = dropboxEnabled;
  }

  public ExternalDocumentSources dropboxMetadata(SettingsMetadata dropboxMetadata) {
    this.dropboxMetadata = dropboxMetadata;
    return this;
  }

   /**
   * Get dropboxMetadata
   * @return dropboxMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDropboxMetadata() {
    return dropboxMetadata;
  }

  public void setDropboxMetadata(SettingsMetadata dropboxMetadata) {
    this.dropboxMetadata = dropboxMetadata;
  }

  public ExternalDocumentSources googleDriveEnabled(String googleDriveEnabled) {
    this.googleDriveEnabled = googleDriveEnabled;
    return this;
  }

   /**
   * 
   * @return googleDriveEnabled
  **/
  @ApiModelProperty(value = "")
  public String getGoogleDriveEnabled() {
    return googleDriveEnabled;
  }

  public void setGoogleDriveEnabled(String googleDriveEnabled) {
    this.googleDriveEnabled = googleDriveEnabled;
  }

  public ExternalDocumentSources googleDriveMetadata(SettingsMetadata googleDriveMetadata) {
    this.googleDriveMetadata = googleDriveMetadata;
    return this;
  }

   /**
   * Get googleDriveMetadata
   * @return googleDriveMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getGoogleDriveMetadata() {
    return googleDriveMetadata;
  }

  public void setGoogleDriveMetadata(SettingsMetadata googleDriveMetadata) {
    this.googleDriveMetadata = googleDriveMetadata;
  }

  public ExternalDocumentSources oneDriveEnabled(String oneDriveEnabled) {
    this.oneDriveEnabled = oneDriveEnabled;
    return this;
  }

   /**
   * 
   * @return oneDriveEnabled
  **/
  @ApiModelProperty(value = "")
  public String getOneDriveEnabled() {
    return oneDriveEnabled;
  }

  public void setOneDriveEnabled(String oneDriveEnabled) {
    this.oneDriveEnabled = oneDriveEnabled;
  }

  public ExternalDocumentSources oneDriveMetadata(SettingsMetadata oneDriveMetadata) {
    this.oneDriveMetadata = oneDriveMetadata;
    return this;
  }

   /**
   * Get oneDriveMetadata
   * @return oneDriveMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getOneDriveMetadata() {
    return oneDriveMetadata;
  }

  public void setOneDriveMetadata(SettingsMetadata oneDriveMetadata) {
    this.oneDriveMetadata = oneDriveMetadata;
  }

  public ExternalDocumentSources salesforceEnabled(String salesforceEnabled) {
    this.salesforceEnabled = salesforceEnabled;
    return this;
  }

   /**
   * 
   * @return salesforceEnabled
  **/
  @ApiModelProperty(value = "")
  public String getSalesforceEnabled() {
    return salesforceEnabled;
  }

  public void setSalesforceEnabled(String salesforceEnabled) {
    this.salesforceEnabled = salesforceEnabled;
  }

  public ExternalDocumentSources salesforceMetadata(SettingsMetadata salesforceMetadata) {
    this.salesforceMetadata = salesforceMetadata;
    return this;
  }

   /**
   * Get salesforceMetadata
   * @return salesforceMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSalesforceMetadata() {
    return salesforceMetadata;
  }

  public void setSalesforceMetadata(SettingsMetadata salesforceMetadata) {
    this.salesforceMetadata = salesforceMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDocumentSources externalDocumentSources = (ExternalDocumentSources) o;
    return Objects.equals(this.boxnetEnabled, externalDocumentSources.boxnetEnabled) &&
        Objects.equals(this.boxnetMetadata, externalDocumentSources.boxnetMetadata) &&
        Objects.equals(this.dropboxEnabled, externalDocumentSources.dropboxEnabled) &&
        Objects.equals(this.dropboxMetadata, externalDocumentSources.dropboxMetadata) &&
        Objects.equals(this.googleDriveEnabled, externalDocumentSources.googleDriveEnabled) &&
        Objects.equals(this.googleDriveMetadata, externalDocumentSources.googleDriveMetadata) &&
        Objects.equals(this.oneDriveEnabled, externalDocumentSources.oneDriveEnabled) &&
        Objects.equals(this.oneDriveMetadata, externalDocumentSources.oneDriveMetadata) &&
        Objects.equals(this.salesforceEnabled, externalDocumentSources.salesforceEnabled) &&
        Objects.equals(this.salesforceMetadata, externalDocumentSources.salesforceMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxnetEnabled, boxnetMetadata, dropboxEnabled, dropboxMetadata, googleDriveEnabled, googleDriveMetadata, oneDriveEnabled, oneDriveMetadata, salesforceEnabled, salesforceMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDocumentSources {\n");
    
    sb.append("    boxnetEnabled: ").append(toIndentedString(boxnetEnabled)).append("\n");
    sb.append("    boxnetMetadata: ").append(toIndentedString(boxnetMetadata)).append("\n");
    sb.append("    dropboxEnabled: ").append(toIndentedString(dropboxEnabled)).append("\n");
    sb.append("    dropboxMetadata: ").append(toIndentedString(dropboxMetadata)).append("\n");
    sb.append("    googleDriveEnabled: ").append(toIndentedString(googleDriveEnabled)).append("\n");
    sb.append("    googleDriveMetadata: ").append(toIndentedString(googleDriveMetadata)).append("\n");
    sb.append("    oneDriveEnabled: ").append(toIndentedString(oneDriveEnabled)).append("\n");
    sb.append("    oneDriveMetadata: ").append(toIndentedString(oneDriveMetadata)).append("\n");
    sb.append("    salesforceEnabled: ").append(toIndentedString(salesforceEnabled)).append("\n");
    sb.append("    salesforceMetadata: ").append(toIndentedString(salesforceMetadata)).append("\n");
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

