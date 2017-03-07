package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Radio;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RadioGroup   {
  
  private String conditionalParentLabel = null;
  private String conditionalParentValue = null;
  private String documentId = null;
  private String groupName = null;
  private java.util.List<Radio> radios = new java.util.ArrayList<Radio>();
  private String recipientId = null;
  private String requireAll = null;
  private String requireInitialOnSharedChange = null;
  private String shared = null;

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioGroup radioGroup = (RadioGroup) o;

    return true && Objects.equals(conditionalParentLabel, radioGroup.conditionalParentLabel) &&
        Objects.equals(conditionalParentValue, radioGroup.conditionalParentValue) &&
        Objects.equals(documentId, radioGroup.documentId) &&
        Objects.equals(groupName, radioGroup.groupName) &&
        Objects.equals(radios, radioGroup.radios) &&
        Objects.equals(recipientId, radioGroup.recipientId) &&
        Objects.equals(requireAll, radioGroup.requireAll) &&
        Objects.equals(requireInitialOnSharedChange, radioGroup.requireInitialOnSharedChange) &&
        Objects.equals(shared, radioGroup.shared)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalParentLabel, conditionalParentValue, documentId, groupName, radios, recipientId, requireAll, requireInitialOnSharedChange, shared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioGroup {\n");
    
    if (conditionalParentLabel != null)
      sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    if (conditionalParentValue != null)
      sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    if (documentId != null)
      sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    if (groupName != null)
      sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    if (radios != null)
      sb.append("    radios: ").append(toIndentedString(radios)).append("\n");
    if (recipientId != null)
      sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    if (requireAll != null)
      sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    if (requireInitialOnSharedChange != null)
      sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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

