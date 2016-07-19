package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Radio;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RadioGroup   {
  
  private String documentId = null;
  private String recipientId = null;
  private String conditionalParentLabel = null;
  private String conditionalParentValue = null;
  private String groupName = null;
  private java.util.List<Radio> radios = new java.util.ArrayList<Radio>();
  private String shared = null;
  private String requireInitialOnSharedChange = null;
  private String requireAll = null;

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  public RadioGroup documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  public RadioGroup recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   **/
  public RadioGroup conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  @JsonProperty("conditionalParentLabel")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  
  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n
   **/
  public RadioGroup conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n")
  @JsonProperty("conditionalParentValue")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  
  /**
   * The name of the group.
   **/
  public RadioGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the group.")
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  
  /**
   * Specifies the locations and status for radio buttons that are grouped together.
   **/
  public RadioGroup radios(java.util.List<Radio> radios) {
    this.radios = radios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the locations and status for radio buttons that are grouped together.")
  @JsonProperty("radios")
  public java.util.List<Radio> getRadios() {
    return radios;
  }
  public void setRadios(java.util.List<Radio> radios) {
    this.radios = radios;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  public RadioGroup shared(String shared) {
    this.shared = shared;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
   **/
  public RadioGroup requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  @JsonProperty("requireInitialOnSharedChange")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }
  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }

  
  /**
   * When set to **true** and shared is true, information must be entered in this field to complete the envelope. 
   **/
  public RadioGroup requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  @JsonProperty("requireAll")
  public String getRequireAll() {
    return requireAll;
  }
  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioGroup radioGroup = (RadioGroup) o;
    return Objects.equals(this.documentId, radioGroup.documentId) &&
        Objects.equals(this.recipientId, radioGroup.recipientId) &&
        Objects.equals(this.conditionalParentLabel, radioGroup.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, radioGroup.conditionalParentValue) &&
        Objects.equals(this.groupName, radioGroup.groupName) &&
        Objects.equals(this.radios, radioGroup.radios) &&
        Objects.equals(this.shared, radioGroup.shared) &&
        Objects.equals(this.requireInitialOnSharedChange, radioGroup.requireInitialOnSharedChange) &&
        Objects.equals(this.requireAll, radioGroup.requireAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, recipientId, conditionalParentLabel, conditionalParentValue, groupName, radios, shared, requireInitialOnSharedChange, requireAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioGroup {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    radios: ").append(toIndentedString(radios)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
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

