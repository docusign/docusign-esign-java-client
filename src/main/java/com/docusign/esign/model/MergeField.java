package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PathExtendedElement;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information for transfering values between Salesforce data fields and DocuSign Tabs..
 *
 */
@Schema(description = "Contains information for transfering values between Salesforce data fields and DocuSign Tabs.")

public class MergeField {
  @JsonProperty("allowSenderToEdit")
  private String allowSenderToEdit = null;

  @JsonProperty("allowSenderToEditMetadata")
  private PropertyMetadata allowSenderToEditMetadata = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("configurationTypeMetadata")
  private PropertyMetadata configurationTypeMetadata = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("pathExtended")
  private java.util.List<PathExtendedElement> pathExtended = null;

  @JsonProperty("pathExtendedMetadata")
  private PropertyMetadata pathExtendedMetadata = null;

  @JsonProperty("pathMetadata")
  private PropertyMetadata pathMetadata = null;

  @JsonProperty("row")
  private String row = null;

  @JsonProperty("rowMetadata")
  private PropertyMetadata rowMetadata = null;

  @JsonProperty("writeBack")
  private String writeBack = null;

  @JsonProperty("writeBackMetadata")
  private PropertyMetadata writeBackMetadata = null;


  /**
   * allowSenderToEdit.
   *
   * @return MergeField
   **/
  public MergeField allowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
    return this;
  }

  /**
   * When set to **true**, the sender can modify the value of the custom tab during the sending process..
   * @return allowSenderToEdit
   **/
  @Schema(description = "When set to **true**, the sender can modify the value of the custom tab during the sending process.")
  public String getAllowSenderToEdit() {
    return allowSenderToEdit;
  }

  /**
   * setAllowSenderToEdit.
   **/
  public void setAllowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
  }


  /**
   * allowSenderToEditMetadata.
   *
   * @return MergeField
   **/
  public MergeField allowSenderToEditMetadata(PropertyMetadata allowSenderToEditMetadata) {
    this.allowSenderToEditMetadata = allowSenderToEditMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `allowSenderToEdit` property..
   * @return allowSenderToEditMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `allowSenderToEdit` property.")
  public PropertyMetadata getAllowSenderToEditMetadata() {
    return allowSenderToEditMetadata;
  }

  /**
   * setAllowSenderToEditMetadata.
   **/
  public void setAllowSenderToEditMetadata(PropertyMetadata allowSenderToEditMetadata) {
    this.allowSenderToEditMetadata = allowSenderToEditMetadata;
  }


  /**
   * configurationType.
   *
   * @return MergeField
   **/
  public MergeField configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**..
   * @return configurationType
   **/
  @Schema(description = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  /**
   * setConfigurationType.
   **/
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }


  /**
   * configurationTypeMetadata.
   *
   * @return MergeField
   **/
  public MergeField configurationTypeMetadata(PropertyMetadata configurationTypeMetadata) {
    this.configurationTypeMetadata = configurationTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `configurationType` property..
   * @return configurationTypeMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `configurationType` property.")
  public PropertyMetadata getConfigurationTypeMetadata() {
    return configurationTypeMetadata;
  }

  /**
   * setConfigurationTypeMetadata.
   **/
  public void setConfigurationTypeMetadata(PropertyMetadata configurationTypeMetadata) {
    this.configurationTypeMetadata = configurationTypeMetadata;
  }


  /**
   * path.
   *
   * @return MergeField
   **/
  public MergeField path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Sets the object associated with the custom tab. Currently this is the Salesforce Object..
   * @return path
   **/
  @Schema(description = "Sets the object associated with the custom tab. Currently this is the Salesforce Object.")
  public String getPath() {
    return path;
  }

  /**
   * setPath.
   **/
  public void setPath(String path) {
    this.path = path;
  }


  /**
   * pathExtended.
   *
   * @return MergeField
   **/
  public MergeField pathExtended(java.util.List<PathExtendedElement> pathExtended) {
    this.pathExtended = pathExtended;
    return this;
  }
  
  /**
   * addPathExtendedItem.
   *
   * @return MergeField
   **/
  public MergeField addPathExtendedItem(PathExtendedElement pathExtendedItem) {
    if (this.pathExtended == null) {
      this.pathExtended = new java.util.ArrayList<>();
    }
    this.pathExtended.add(pathExtendedItem);
    return this;
  }

  /**
   * .
   * @return pathExtended
   **/
  @Schema(description = "")
  public java.util.List<PathExtendedElement> getPathExtended() {
    return pathExtended;
  }

  /**
   * setPathExtended.
   **/
  public void setPathExtended(java.util.List<PathExtendedElement> pathExtended) {
    this.pathExtended = pathExtended;
  }


  /**
   * pathExtendedMetadata.
   *
   * @return MergeField
   **/
  public MergeField pathExtendedMetadata(PropertyMetadata pathExtendedMetadata) {
    this.pathExtendedMetadata = pathExtendedMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return pathExtendedMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getPathExtendedMetadata() {
    return pathExtendedMetadata;
  }

  /**
   * setPathExtendedMetadata.
   **/
  public void setPathExtendedMetadata(PropertyMetadata pathExtendedMetadata) {
    this.pathExtendedMetadata = pathExtendedMetadata;
  }


  /**
   * pathMetadata.
   *
   * @return MergeField
   **/
  public MergeField pathMetadata(PropertyMetadata pathMetadata) {
    this.pathMetadata = pathMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `path` property is editable. .
   * @return pathMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `path` property is editable. ")
  public PropertyMetadata getPathMetadata() {
    return pathMetadata;
  }

  /**
   * setPathMetadata.
   **/
  public void setPathMetadata(PropertyMetadata pathMetadata) {
    this.pathMetadata = pathMetadata;
  }


  /**
   * row.
   *
   * @return MergeField
   **/
  public MergeField row(String row) {
    this.row = row;
    return this;
  }

  /**
   * Specifies the row number in a Salesforce table that the merge field value corresponds to..
   * @return row
   **/
  @Schema(description = "Specifies the row number in a Salesforce table that the merge field value corresponds to.")
  public String getRow() {
    return row;
  }

  /**
   * setRow.
   **/
  public void setRow(String row) {
    this.row = row;
  }


  /**
   * rowMetadata.
   *
   * @return MergeField
   **/
  public MergeField rowMetadata(PropertyMetadata rowMetadata) {
    this.rowMetadata = rowMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `row` property is editable. .
   * @return rowMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `row` property is editable. ")
  public PropertyMetadata getRowMetadata() {
    return rowMetadata;
  }

  /**
   * setRowMetadata.
   **/
  public void setRowMetadata(PropertyMetadata rowMetadata) {
    this.rowMetadata = rowMetadata;
  }


  /**
   * writeBack.
   *
   * @return MergeField
   **/
  public MergeField writeBack(String writeBack) {
    this.writeBack = writeBack;
    return this;
  }

  /**
   * When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed..
   * @return writeBack
   **/
  @Schema(description = "When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.")
  public String getWriteBack() {
    return writeBack;
  }

  /**
   * setWriteBack.
   **/
  public void setWriteBack(String writeBack) {
    this.writeBack = writeBack;
  }


  /**
   * writeBackMetadata.
   *
   * @return MergeField
   **/
  public MergeField writeBackMetadata(PropertyMetadata writeBackMetadata) {
    this.writeBackMetadata = writeBackMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `writeBack` property..
   * @return writeBackMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `writeBack` property.")
  public PropertyMetadata getWriteBackMetadata() {
    return writeBackMetadata;
  }

  /**
   * setWriteBackMetadata.
   **/
  public void setWriteBackMetadata(PropertyMetadata writeBackMetadata) {
    this.writeBackMetadata = writeBackMetadata;
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
    MergeField mergeField = (MergeField) o;
    return Objects.equals(this.allowSenderToEdit, mergeField.allowSenderToEdit) &&
        Objects.equals(this.allowSenderToEditMetadata, mergeField.allowSenderToEditMetadata) &&
        Objects.equals(this.configurationType, mergeField.configurationType) &&
        Objects.equals(this.configurationTypeMetadata, mergeField.configurationTypeMetadata) &&
        Objects.equals(this.path, mergeField.path) &&
        Objects.equals(this.pathExtended, mergeField.pathExtended) &&
        Objects.equals(this.pathExtendedMetadata, mergeField.pathExtendedMetadata) &&
        Objects.equals(this.pathMetadata, mergeField.pathMetadata) &&
        Objects.equals(this.row, mergeField.row) &&
        Objects.equals(this.rowMetadata, mergeField.rowMetadata) &&
        Objects.equals(this.writeBack, mergeField.writeBack) &&
        Objects.equals(this.writeBackMetadata, mergeField.writeBackMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowSenderToEdit, allowSenderToEditMetadata, configurationType, configurationTypeMetadata, path, pathExtended, pathExtendedMetadata, pathMetadata, row, rowMetadata, writeBack, writeBackMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    sb.append("    allowSenderToEdit: ").append(toIndentedString(allowSenderToEdit)).append("\n");
    sb.append("    allowSenderToEditMetadata: ").append(toIndentedString(allowSenderToEditMetadata)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    configurationTypeMetadata: ").append(toIndentedString(configurationTypeMetadata)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathExtended: ").append(toIndentedString(pathExtended)).append("\n");
    sb.append("    pathExtendedMetadata: ").append(toIndentedString(pathExtendedMetadata)).append("\n");
    sb.append("    pathMetadata: ").append(toIndentedString(pathMetadata)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    rowMetadata: ").append(toIndentedString(rowMetadata)).append("\n");
    sb.append("    writeBack: ").append(toIndentedString(writeBack)).append("\n");
    sb.append("    writeBackMetadata: ").append(toIndentedString(writeBackMetadata)).append("\n");
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

