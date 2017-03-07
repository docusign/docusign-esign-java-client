package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TabAccountSettings   {
  
  private String allowTabOrder = null;
  private SettingsMetadata allowTabOrderMetadata = null;
  private String approveDeclineTabsEnabled = null;
  private SettingsMetadata approveDeclineTabsMetadata = null;
  private String calculatedFieldsEnabled = null;
  private SettingsMetadata calculatedFieldsMetadata = null;
  private String checkboxTabsEnabled = null;
  private SettingsMetadata checkboxTabsMetadata = null;
  private String dataFieldRegexEnabled = null;
  private SettingsMetadata dataFieldRegexMetadata = null;
  private String dataFieldSizeEnabled = null;
  private SettingsMetadata dataFieldSizeMetadata = null;
  private String firstLastEmailTabsEnabled = null;
  private SettingsMetadata firstLastEmailTabsMetadata = null;
  private String listTabsEnabled = null;
  private SettingsMetadata listTabsMetadata = null;
  private String noteTabsEnabled = null;
  private SettingsMetadata noteTabsMetadata = null;
  private String radioTabsEnabled = null;
  private SettingsMetadata radioTabsMetadata = null;
  private String savingCustomTabsEnabled = null;
  private SettingsMetadata savingCustomTabsMetadata = null;
  private String senderToChangeTabAssignmentsEnabled = null;
  private SettingsMetadata senderToChangeTabAssignmentsMetadata = null;
  private String sharedCustomTabsEnabled = null;
  private SettingsMetadata sharedCustomTabsMetadata = null;
  private String tabDataLabelEnabled = null;
  private SettingsMetadata tabDataLabelMetadata = null;
  private String tabLocationEnabled = null;
  private SettingsMetadata tabLocationMetadata = null;
  private String tabLockingEnabled = null;
  private SettingsMetadata tabLockingMetadata = null;
  private String tabScaleEnabled = null;
  private SettingsMetadata tabScaleMetadata = null;
  private String tabTextFormattingEnabled = null;
  private SettingsMetadata tabTextFormattingMetadata = null;
  private String textTabsEnabled = null;
  private SettingsMetadata textTabsMetadata = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowTabOrder")
  public String getAllowTabOrder() {
    return allowTabOrder;
  }
  public void setAllowTabOrder(String allowTabOrder) {
    this.allowTabOrder = allowTabOrder;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowTabOrderMetadata")
  public SettingsMetadata getAllowTabOrderMetadata() {
    return allowTabOrderMetadata;
  }
  public void setAllowTabOrderMetadata(SettingsMetadata allowTabOrderMetadata) {
    this.allowTabOrderMetadata = allowTabOrderMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approveDeclineTabsEnabled")
  public String getApproveDeclineTabsEnabled() {
    return approveDeclineTabsEnabled;
  }
  public void setApproveDeclineTabsEnabled(String approveDeclineTabsEnabled) {
    this.approveDeclineTabsEnabled = approveDeclineTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approveDeclineTabsMetadata")
  public SettingsMetadata getApproveDeclineTabsMetadata() {
    return approveDeclineTabsMetadata;
  }
  public void setApproveDeclineTabsMetadata(SettingsMetadata approveDeclineTabsMetadata) {
    this.approveDeclineTabsMetadata = approveDeclineTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("calculatedFieldsEnabled")
  public String getCalculatedFieldsEnabled() {
    return calculatedFieldsEnabled;
  }
  public void setCalculatedFieldsEnabled(String calculatedFieldsEnabled) {
    this.calculatedFieldsEnabled = calculatedFieldsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("calculatedFieldsMetadata")
  public SettingsMetadata getCalculatedFieldsMetadata() {
    return calculatedFieldsMetadata;
  }
  public void setCalculatedFieldsMetadata(SettingsMetadata calculatedFieldsMetadata) {
    this.calculatedFieldsMetadata = calculatedFieldsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("checkboxTabsEnabled")
  public String getCheckboxTabsEnabled() {
    return checkboxTabsEnabled;
  }
  public void setCheckboxTabsEnabled(String checkboxTabsEnabled) {
    this.checkboxTabsEnabled = checkboxTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("checkboxTabsMetadata")
  public SettingsMetadata getCheckboxTabsMetadata() {
    return checkboxTabsMetadata;
  }
  public void setCheckboxTabsMetadata(SettingsMetadata checkboxTabsMetadata) {
    this.checkboxTabsMetadata = checkboxTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataFieldRegexEnabled")
  public String getDataFieldRegexEnabled() {
    return dataFieldRegexEnabled;
  }
  public void setDataFieldRegexEnabled(String dataFieldRegexEnabled) {
    this.dataFieldRegexEnabled = dataFieldRegexEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataFieldRegexMetadata")
  public SettingsMetadata getDataFieldRegexMetadata() {
    return dataFieldRegexMetadata;
  }
  public void setDataFieldRegexMetadata(SettingsMetadata dataFieldRegexMetadata) {
    this.dataFieldRegexMetadata = dataFieldRegexMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataFieldSizeEnabled")
  public String getDataFieldSizeEnabled() {
    return dataFieldSizeEnabled;
  }
  public void setDataFieldSizeEnabled(String dataFieldSizeEnabled) {
    this.dataFieldSizeEnabled = dataFieldSizeEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataFieldSizeMetadata")
  public SettingsMetadata getDataFieldSizeMetadata() {
    return dataFieldSizeMetadata;
  }
  public void setDataFieldSizeMetadata(SettingsMetadata dataFieldSizeMetadata) {
    this.dataFieldSizeMetadata = dataFieldSizeMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstLastEmailTabsEnabled")
  public String getFirstLastEmailTabsEnabled() {
    return firstLastEmailTabsEnabled;
  }
  public void setFirstLastEmailTabsEnabled(String firstLastEmailTabsEnabled) {
    this.firstLastEmailTabsEnabled = firstLastEmailTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstLastEmailTabsMetadata")
  public SettingsMetadata getFirstLastEmailTabsMetadata() {
    return firstLastEmailTabsMetadata;
  }
  public void setFirstLastEmailTabsMetadata(SettingsMetadata firstLastEmailTabsMetadata) {
    this.firstLastEmailTabsMetadata = firstLastEmailTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listTabsEnabled")
  public String getListTabsEnabled() {
    return listTabsEnabled;
  }
  public void setListTabsEnabled(String listTabsEnabled) {
    this.listTabsEnabled = listTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listTabsMetadata")
  public SettingsMetadata getListTabsMetadata() {
    return listTabsMetadata;
  }
  public void setListTabsMetadata(SettingsMetadata listTabsMetadata) {
    this.listTabsMetadata = listTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteTabsEnabled")
  public String getNoteTabsEnabled() {
    return noteTabsEnabled;
  }
  public void setNoteTabsEnabled(String noteTabsEnabled) {
    this.noteTabsEnabled = noteTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteTabsMetadata")
  public SettingsMetadata getNoteTabsMetadata() {
    return noteTabsMetadata;
  }
  public void setNoteTabsMetadata(SettingsMetadata noteTabsMetadata) {
    this.noteTabsMetadata = noteTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("radioTabsEnabled")
  public String getRadioTabsEnabled() {
    return radioTabsEnabled;
  }
  public void setRadioTabsEnabled(String radioTabsEnabled) {
    this.radioTabsEnabled = radioTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("radioTabsMetadata")
  public SettingsMetadata getRadioTabsMetadata() {
    return radioTabsMetadata;
  }
  public void setRadioTabsMetadata(SettingsMetadata radioTabsMetadata) {
    this.radioTabsMetadata = radioTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("savingCustomTabsEnabled")
  public String getSavingCustomTabsEnabled() {
    return savingCustomTabsEnabled;
  }
  public void setSavingCustomTabsEnabled(String savingCustomTabsEnabled) {
    this.savingCustomTabsEnabled = savingCustomTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("savingCustomTabsMetadata")
  public SettingsMetadata getSavingCustomTabsMetadata() {
    return savingCustomTabsMetadata;
  }
  public void setSavingCustomTabsMetadata(SettingsMetadata savingCustomTabsMetadata) {
    this.savingCustomTabsMetadata = savingCustomTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderToChangeTabAssignmentsEnabled")
  public String getSenderToChangeTabAssignmentsEnabled() {
    return senderToChangeTabAssignmentsEnabled;
  }
  public void setSenderToChangeTabAssignmentsEnabled(String senderToChangeTabAssignmentsEnabled) {
    this.senderToChangeTabAssignmentsEnabled = senderToChangeTabAssignmentsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderToChangeTabAssignmentsMetadata")
  public SettingsMetadata getSenderToChangeTabAssignmentsMetadata() {
    return senderToChangeTabAssignmentsMetadata;
  }
  public void setSenderToChangeTabAssignmentsMetadata(SettingsMetadata senderToChangeTabAssignmentsMetadata) {
    this.senderToChangeTabAssignmentsMetadata = senderToChangeTabAssignmentsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedCustomTabsEnabled")
  public String getSharedCustomTabsEnabled() {
    return sharedCustomTabsEnabled;
  }
  public void setSharedCustomTabsEnabled(String sharedCustomTabsEnabled) {
    this.sharedCustomTabsEnabled = sharedCustomTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedCustomTabsMetadata")
  public SettingsMetadata getSharedCustomTabsMetadata() {
    return sharedCustomTabsMetadata;
  }
  public void setSharedCustomTabsMetadata(SettingsMetadata sharedCustomTabsMetadata) {
    this.sharedCustomTabsMetadata = sharedCustomTabsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabDataLabelEnabled")
  public String getTabDataLabelEnabled() {
    return tabDataLabelEnabled;
  }
  public void setTabDataLabelEnabled(String tabDataLabelEnabled) {
    this.tabDataLabelEnabled = tabDataLabelEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabDataLabelMetadata")
  public SettingsMetadata getTabDataLabelMetadata() {
    return tabDataLabelMetadata;
  }
  public void setTabDataLabelMetadata(SettingsMetadata tabDataLabelMetadata) {
    this.tabDataLabelMetadata = tabDataLabelMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabLocationEnabled")
  public String getTabLocationEnabled() {
    return tabLocationEnabled;
  }
  public void setTabLocationEnabled(String tabLocationEnabled) {
    this.tabLocationEnabled = tabLocationEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabLocationMetadata")
  public SettingsMetadata getTabLocationMetadata() {
    return tabLocationMetadata;
  }
  public void setTabLocationMetadata(SettingsMetadata tabLocationMetadata) {
    this.tabLocationMetadata = tabLocationMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabLockingEnabled")
  public String getTabLockingEnabled() {
    return tabLockingEnabled;
  }
  public void setTabLockingEnabled(String tabLockingEnabled) {
    this.tabLockingEnabled = tabLockingEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabLockingMetadata")
  public SettingsMetadata getTabLockingMetadata() {
    return tabLockingMetadata;
  }
  public void setTabLockingMetadata(SettingsMetadata tabLockingMetadata) {
    this.tabLockingMetadata = tabLockingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabScaleEnabled")
  public String getTabScaleEnabled() {
    return tabScaleEnabled;
  }
  public void setTabScaleEnabled(String tabScaleEnabled) {
    this.tabScaleEnabled = tabScaleEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabScaleMetadata")
  public SettingsMetadata getTabScaleMetadata() {
    return tabScaleMetadata;
  }
  public void setTabScaleMetadata(SettingsMetadata tabScaleMetadata) {
    this.tabScaleMetadata = tabScaleMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabTextFormattingEnabled")
  public String getTabTextFormattingEnabled() {
    return tabTextFormattingEnabled;
  }
  public void setTabTextFormattingEnabled(String tabTextFormattingEnabled) {
    this.tabTextFormattingEnabled = tabTextFormattingEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabTextFormattingMetadata")
  public SettingsMetadata getTabTextFormattingMetadata() {
    return tabTextFormattingMetadata;
  }
  public void setTabTextFormattingMetadata(SettingsMetadata tabTextFormattingMetadata) {
    this.tabTextFormattingMetadata = tabTextFormattingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("textTabsEnabled")
  public String getTextTabsEnabled() {
    return textTabsEnabled;
  }
  public void setTextTabsEnabled(String textTabsEnabled) {
    this.textTabsEnabled = textTabsEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("textTabsMetadata")
  public SettingsMetadata getTextTabsMetadata() {
    return textTabsMetadata;
  }
  public void setTextTabsMetadata(SettingsMetadata textTabsMetadata) {
    this.textTabsMetadata = textTabsMetadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabAccountSettings tabAccountSettings = (TabAccountSettings) o;

    return true && Objects.equals(allowTabOrder, tabAccountSettings.allowTabOrder) &&
        Objects.equals(allowTabOrderMetadata, tabAccountSettings.allowTabOrderMetadata) &&
        Objects.equals(approveDeclineTabsEnabled, tabAccountSettings.approveDeclineTabsEnabled) &&
        Objects.equals(approveDeclineTabsMetadata, tabAccountSettings.approveDeclineTabsMetadata) &&
        Objects.equals(calculatedFieldsEnabled, tabAccountSettings.calculatedFieldsEnabled) &&
        Objects.equals(calculatedFieldsMetadata, tabAccountSettings.calculatedFieldsMetadata) &&
        Objects.equals(checkboxTabsEnabled, tabAccountSettings.checkboxTabsEnabled) &&
        Objects.equals(checkboxTabsMetadata, tabAccountSettings.checkboxTabsMetadata) &&
        Objects.equals(dataFieldRegexEnabled, tabAccountSettings.dataFieldRegexEnabled) &&
        Objects.equals(dataFieldRegexMetadata, tabAccountSettings.dataFieldRegexMetadata) &&
        Objects.equals(dataFieldSizeEnabled, tabAccountSettings.dataFieldSizeEnabled) &&
        Objects.equals(dataFieldSizeMetadata, tabAccountSettings.dataFieldSizeMetadata) &&
        Objects.equals(firstLastEmailTabsEnabled, tabAccountSettings.firstLastEmailTabsEnabled) &&
        Objects.equals(firstLastEmailTabsMetadata, tabAccountSettings.firstLastEmailTabsMetadata) &&
        Objects.equals(listTabsEnabled, tabAccountSettings.listTabsEnabled) &&
        Objects.equals(listTabsMetadata, tabAccountSettings.listTabsMetadata) &&
        Objects.equals(noteTabsEnabled, tabAccountSettings.noteTabsEnabled) &&
        Objects.equals(noteTabsMetadata, tabAccountSettings.noteTabsMetadata) &&
        Objects.equals(radioTabsEnabled, tabAccountSettings.radioTabsEnabled) &&
        Objects.equals(radioTabsMetadata, tabAccountSettings.radioTabsMetadata) &&
        Objects.equals(savingCustomTabsEnabled, tabAccountSettings.savingCustomTabsEnabled) &&
        Objects.equals(savingCustomTabsMetadata, tabAccountSettings.savingCustomTabsMetadata) &&
        Objects.equals(senderToChangeTabAssignmentsEnabled, tabAccountSettings.senderToChangeTabAssignmentsEnabled) &&
        Objects.equals(senderToChangeTabAssignmentsMetadata, tabAccountSettings.senderToChangeTabAssignmentsMetadata) &&
        Objects.equals(sharedCustomTabsEnabled, tabAccountSettings.sharedCustomTabsEnabled) &&
        Objects.equals(sharedCustomTabsMetadata, tabAccountSettings.sharedCustomTabsMetadata) &&
        Objects.equals(tabDataLabelEnabled, tabAccountSettings.tabDataLabelEnabled) &&
        Objects.equals(tabDataLabelMetadata, tabAccountSettings.tabDataLabelMetadata) &&
        Objects.equals(tabLocationEnabled, tabAccountSettings.tabLocationEnabled) &&
        Objects.equals(tabLocationMetadata, tabAccountSettings.tabLocationMetadata) &&
        Objects.equals(tabLockingEnabled, tabAccountSettings.tabLockingEnabled) &&
        Objects.equals(tabLockingMetadata, tabAccountSettings.tabLockingMetadata) &&
        Objects.equals(tabScaleEnabled, tabAccountSettings.tabScaleEnabled) &&
        Objects.equals(tabScaleMetadata, tabAccountSettings.tabScaleMetadata) &&
        Objects.equals(tabTextFormattingEnabled, tabAccountSettings.tabTextFormattingEnabled) &&
        Objects.equals(tabTextFormattingMetadata, tabAccountSettings.tabTextFormattingMetadata) &&
        Objects.equals(textTabsEnabled, tabAccountSettings.textTabsEnabled) &&
        Objects.equals(textTabsMetadata, tabAccountSettings.textTabsMetadata)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowTabOrder, allowTabOrderMetadata, approveDeclineTabsEnabled, approveDeclineTabsMetadata, calculatedFieldsEnabled, calculatedFieldsMetadata, checkboxTabsEnabled, checkboxTabsMetadata, dataFieldRegexEnabled, dataFieldRegexMetadata, dataFieldSizeEnabled, dataFieldSizeMetadata, firstLastEmailTabsEnabled, firstLastEmailTabsMetadata, listTabsEnabled, listTabsMetadata, noteTabsEnabled, noteTabsMetadata, radioTabsEnabled, radioTabsMetadata, savingCustomTabsEnabled, savingCustomTabsMetadata, senderToChangeTabAssignmentsEnabled, senderToChangeTabAssignmentsMetadata, sharedCustomTabsEnabled, sharedCustomTabsMetadata, tabDataLabelEnabled, tabDataLabelMetadata, tabLocationEnabled, tabLocationMetadata, tabLockingEnabled, tabLockingMetadata, tabScaleEnabled, tabScaleMetadata, tabTextFormattingEnabled, tabTextFormattingMetadata, textTabsEnabled, textTabsMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabAccountSettings {\n");
    
    if (allowTabOrder != null)
      sb.append("    allowTabOrder: ").append(toIndentedString(allowTabOrder)).append("\n");
    if (allowTabOrderMetadata != null)
      sb.append("    allowTabOrderMetadata: ").append(toIndentedString(allowTabOrderMetadata)).append("\n");
    if (approveDeclineTabsEnabled != null)
      sb.append("    approveDeclineTabsEnabled: ").append(toIndentedString(approveDeclineTabsEnabled)).append("\n");
    if (approveDeclineTabsMetadata != null)
      sb.append("    approveDeclineTabsMetadata: ").append(toIndentedString(approveDeclineTabsMetadata)).append("\n");
    if (calculatedFieldsEnabled != null)
      sb.append("    calculatedFieldsEnabled: ").append(toIndentedString(calculatedFieldsEnabled)).append("\n");
    if (calculatedFieldsMetadata != null)
      sb.append("    calculatedFieldsMetadata: ").append(toIndentedString(calculatedFieldsMetadata)).append("\n");
    if (checkboxTabsEnabled != null)
      sb.append("    checkboxTabsEnabled: ").append(toIndentedString(checkboxTabsEnabled)).append("\n");
    if (checkboxTabsMetadata != null)
      sb.append("    checkboxTabsMetadata: ").append(toIndentedString(checkboxTabsMetadata)).append("\n");
    if (dataFieldRegexEnabled != null)
      sb.append("    dataFieldRegexEnabled: ").append(toIndentedString(dataFieldRegexEnabled)).append("\n");
    if (dataFieldRegexMetadata != null)
      sb.append("    dataFieldRegexMetadata: ").append(toIndentedString(dataFieldRegexMetadata)).append("\n");
    if (dataFieldSizeEnabled != null)
      sb.append("    dataFieldSizeEnabled: ").append(toIndentedString(dataFieldSizeEnabled)).append("\n");
    if (dataFieldSizeMetadata != null)
      sb.append("    dataFieldSizeMetadata: ").append(toIndentedString(dataFieldSizeMetadata)).append("\n");
    if (firstLastEmailTabsEnabled != null)
      sb.append("    firstLastEmailTabsEnabled: ").append(toIndentedString(firstLastEmailTabsEnabled)).append("\n");
    if (firstLastEmailTabsMetadata != null)
      sb.append("    firstLastEmailTabsMetadata: ").append(toIndentedString(firstLastEmailTabsMetadata)).append("\n");
    if (listTabsEnabled != null)
      sb.append("    listTabsEnabled: ").append(toIndentedString(listTabsEnabled)).append("\n");
    if (listTabsMetadata != null)
      sb.append("    listTabsMetadata: ").append(toIndentedString(listTabsMetadata)).append("\n");
    if (noteTabsEnabled != null)
      sb.append("    noteTabsEnabled: ").append(toIndentedString(noteTabsEnabled)).append("\n");
    if (noteTabsMetadata != null)
      sb.append("    noteTabsMetadata: ").append(toIndentedString(noteTabsMetadata)).append("\n");
    if (radioTabsEnabled != null)
      sb.append("    radioTabsEnabled: ").append(toIndentedString(radioTabsEnabled)).append("\n");
    if (radioTabsMetadata != null)
      sb.append("    radioTabsMetadata: ").append(toIndentedString(radioTabsMetadata)).append("\n");
    if (savingCustomTabsEnabled != null)
      sb.append("    savingCustomTabsEnabled: ").append(toIndentedString(savingCustomTabsEnabled)).append("\n");
    if (savingCustomTabsMetadata != null)
      sb.append("    savingCustomTabsMetadata: ").append(toIndentedString(savingCustomTabsMetadata)).append("\n");
    if (senderToChangeTabAssignmentsEnabled != null)
      sb.append("    senderToChangeTabAssignmentsEnabled: ").append(toIndentedString(senderToChangeTabAssignmentsEnabled)).append("\n");
    if (senderToChangeTabAssignmentsMetadata != null)
      sb.append("    senderToChangeTabAssignmentsMetadata: ").append(toIndentedString(senderToChangeTabAssignmentsMetadata)).append("\n");
    if (sharedCustomTabsEnabled != null)
      sb.append("    sharedCustomTabsEnabled: ").append(toIndentedString(sharedCustomTabsEnabled)).append("\n");
    if (sharedCustomTabsMetadata != null)
      sb.append("    sharedCustomTabsMetadata: ").append(toIndentedString(sharedCustomTabsMetadata)).append("\n");
    if (tabDataLabelEnabled != null)
      sb.append("    tabDataLabelEnabled: ").append(toIndentedString(tabDataLabelEnabled)).append("\n");
    if (tabDataLabelMetadata != null)
      sb.append("    tabDataLabelMetadata: ").append(toIndentedString(tabDataLabelMetadata)).append("\n");
    if (tabLocationEnabled != null)
      sb.append("    tabLocationEnabled: ").append(toIndentedString(tabLocationEnabled)).append("\n");
    if (tabLocationMetadata != null)
      sb.append("    tabLocationMetadata: ").append(toIndentedString(tabLocationMetadata)).append("\n");
    if (tabLockingEnabled != null)
      sb.append("    tabLockingEnabled: ").append(toIndentedString(tabLockingEnabled)).append("\n");
    if (tabLockingMetadata != null)
      sb.append("    tabLockingMetadata: ").append(toIndentedString(tabLockingMetadata)).append("\n");
    if (tabScaleEnabled != null)
      sb.append("    tabScaleEnabled: ").append(toIndentedString(tabScaleEnabled)).append("\n");
    if (tabScaleMetadata != null)
      sb.append("    tabScaleMetadata: ").append(toIndentedString(tabScaleMetadata)).append("\n");
    if (tabTextFormattingEnabled != null)
      sb.append("    tabTextFormattingEnabled: ").append(toIndentedString(tabTextFormattingEnabled)).append("\n");
    if (tabTextFormattingMetadata != null)
      sb.append("    tabTextFormattingMetadata: ").append(toIndentedString(tabTextFormattingMetadata)).append("\n");
    if (textTabsEnabled != null)
      sb.append("    textTabsEnabled: ").append(toIndentedString(textTabsEnabled)).append("\n");
    if (textTabsMetadata != null)
      sb.append("    textTabsMetadata: ").append(toIndentedString(textTabsMetadata)).append("\n");
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

