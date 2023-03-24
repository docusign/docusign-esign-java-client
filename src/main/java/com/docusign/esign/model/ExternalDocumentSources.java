package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A complex object specifying the external document sources..
 *
 */
@Schema(description = "A complex object specifying the external document sources.")

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


  /**
   * boxnetEnabled.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources boxnetEnabled(String boxnetEnabled) {
    this.boxnetEnabled = boxnetEnabled;
    return this;
  }

  /**
   * .
   * @return boxnetEnabled
   **/
  @Schema(description = "")
  public String getBoxnetEnabled() {
    return boxnetEnabled;
  }

  /**
   * setBoxnetEnabled.
   **/
  public void setBoxnetEnabled(String boxnetEnabled) {
    this.boxnetEnabled = boxnetEnabled;
  }


  /**
   * boxnetMetadata.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources boxnetMetadata(SettingsMetadata boxnetMetadata) {
    this.boxnetMetadata = boxnetMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `boxnetEnabled` property is editable..
   * @return boxnetMetadata
   **/
  @Schema(description = "Metadata indicating whether the `boxnetEnabled` property is editable.")
  public SettingsMetadata getBoxnetMetadata() {
    return boxnetMetadata;
  }

  /**
   * setBoxnetMetadata.
   **/
  public void setBoxnetMetadata(SettingsMetadata boxnetMetadata) {
    this.boxnetMetadata = boxnetMetadata;
  }


  /**
   * dropboxEnabled.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources dropboxEnabled(String dropboxEnabled) {
    this.dropboxEnabled = dropboxEnabled;
    return this;
  }

  /**
   * .
   * @return dropboxEnabled
   **/
  @Schema(description = "")
  public String getDropboxEnabled() {
    return dropboxEnabled;
  }

  /**
   * setDropboxEnabled.
   **/
  public void setDropboxEnabled(String dropboxEnabled) {
    this.dropboxEnabled = dropboxEnabled;
  }


  /**
   * dropboxMetadata.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources dropboxMetadata(SettingsMetadata dropboxMetadata) {
    this.dropboxMetadata = dropboxMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `dropboxEnabled` property is editable..
   * @return dropboxMetadata
   **/
  @Schema(description = "Metadata indicating whether the `dropboxEnabled` property is editable.")
  public SettingsMetadata getDropboxMetadata() {
    return dropboxMetadata;
  }

  /**
   * setDropboxMetadata.
   **/
  public void setDropboxMetadata(SettingsMetadata dropboxMetadata) {
    this.dropboxMetadata = dropboxMetadata;
  }


  /**
   * googleDriveEnabled.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources googleDriveEnabled(String googleDriveEnabled) {
    this.googleDriveEnabled = googleDriveEnabled;
    return this;
  }

  /**
   * .
   * @return googleDriveEnabled
   **/
  @Schema(description = "")
  public String getGoogleDriveEnabled() {
    return googleDriveEnabled;
  }

  /**
   * setGoogleDriveEnabled.
   **/
  public void setGoogleDriveEnabled(String googleDriveEnabled) {
    this.googleDriveEnabled = googleDriveEnabled;
  }


  /**
   * googleDriveMetadata.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources googleDriveMetadata(SettingsMetadata googleDriveMetadata) {
    this.googleDriveMetadata = googleDriveMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `googleDriveEnabled` property is editable..
   * @return googleDriveMetadata
   **/
  @Schema(description = "Metadata indicating whether the `googleDriveEnabled` property is editable.")
  public SettingsMetadata getGoogleDriveMetadata() {
    return googleDriveMetadata;
  }

  /**
   * setGoogleDriveMetadata.
   **/
  public void setGoogleDriveMetadata(SettingsMetadata googleDriveMetadata) {
    this.googleDriveMetadata = googleDriveMetadata;
  }


  /**
   * oneDriveEnabled.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources oneDriveEnabled(String oneDriveEnabled) {
    this.oneDriveEnabled = oneDriveEnabled;
    return this;
  }

  /**
   * .
   * @return oneDriveEnabled
   **/
  @Schema(description = "")
  public String getOneDriveEnabled() {
    return oneDriveEnabled;
  }

  /**
   * setOneDriveEnabled.
   **/
  public void setOneDriveEnabled(String oneDriveEnabled) {
    this.oneDriveEnabled = oneDriveEnabled;
  }


  /**
   * oneDriveMetadata.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources oneDriveMetadata(SettingsMetadata oneDriveMetadata) {
    this.oneDriveMetadata = oneDriveMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `oneDriveEnabled` property is editable..
   * @return oneDriveMetadata
   **/
  @Schema(description = "Metadata indicating whether the `oneDriveEnabled` property is editable.")
  public SettingsMetadata getOneDriveMetadata() {
    return oneDriveMetadata;
  }

  /**
   * setOneDriveMetadata.
   **/
  public void setOneDriveMetadata(SettingsMetadata oneDriveMetadata) {
    this.oneDriveMetadata = oneDriveMetadata;
  }


  /**
   * salesforceEnabled.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources salesforceEnabled(String salesforceEnabled) {
    this.salesforceEnabled = salesforceEnabled;
    return this;
  }

  /**
   * .
   * @return salesforceEnabled
   **/
  @Schema(description = "")
  public String getSalesforceEnabled() {
    return salesforceEnabled;
  }

  /**
   * setSalesforceEnabled.
   **/
  public void setSalesforceEnabled(String salesforceEnabled) {
    this.salesforceEnabled = salesforceEnabled;
  }


  /**
   * salesforceMetadata.
   *
   * @return ExternalDocumentSources
   **/
  public ExternalDocumentSources salesforceMetadata(SettingsMetadata salesforceMetadata) {
    this.salesforceMetadata = salesforceMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `salesforceEnabled` property is editable..
   * @return salesforceMetadata
   **/
  @Schema(description = "Metadata indicating whether the `salesforceEnabled` property is editable.")
  public SettingsMetadata getSalesforceMetadata() {
    return salesforceMetadata;
  }

  /**
   * setSalesforceMetadata.
   **/
  public void setSalesforceMetadata(SettingsMetadata salesforceMetadata) {
    this.salesforceMetadata = salesforceMetadata;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(boxnetEnabled, boxnetMetadata, dropboxEnabled, dropboxMetadata, googleDriveEnabled, googleDriveMetadata, oneDriveEnabled, oneDriveMetadata, salesforceEnabled, salesforceMetadata);
  }


  /**
   * Converts the given object to string.
   */
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

