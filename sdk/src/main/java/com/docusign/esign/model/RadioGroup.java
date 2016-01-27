package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Radio;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
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
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
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
  @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  @JsonProperty("conditionalParentLabel")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  
  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.
   **/
  @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.")
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
  @ApiModelProperty(value = "The name of the group.")
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
  @ApiModelProperty(value = "Specifies the locations and status for radio buttons that are grouped together.")
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
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
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
  @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
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
  @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope.")
  @JsonProperty("requireAll")
  public String getRequireAll() {
    return requireAll;
  }
  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioGroup radioGroup = (RadioGroup) o;
    return Objects.equals(documentId, radioGroup.documentId) &&
        Objects.equals(recipientId, radioGroup.recipientId) &&
        Objects.equals(conditionalParentLabel, radioGroup.conditionalParentLabel) &&
        Objects.equals(conditionalParentValue, radioGroup.conditionalParentValue) &&
        Objects.equals(groupName, radioGroup.groupName) &&
        Objects.equals(radios, radioGroup.radios) &&
        Objects.equals(shared, radioGroup.shared) &&
        Objects.equals(requireInitialOnSharedChange, radioGroup.requireInitialOnSharedChange) &&
        Objects.equals(requireAll, radioGroup.requireAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, recipientId, conditionalParentLabel, conditionalParentValue, groupName, radios, shared, requireInitialOnSharedChange, requireAll);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioGroup {\n");
    
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    recipientId: ").append(StringUtil.toIndentedString(recipientId)).append("\n");
    sb.append("    conditionalParentLabel: ").append(StringUtil.toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(StringUtil.toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    groupName: ").append(StringUtil.toIndentedString(groupName)).append("\n");
    sb.append("    radios: ").append(StringUtil.toIndentedString(radios)).append("\n");
    sb.append("    shared: ").append(StringUtil.toIndentedString(shared)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(StringUtil.toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    requireAll: ").append(StringUtil.toIndentedString(requireAll)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
