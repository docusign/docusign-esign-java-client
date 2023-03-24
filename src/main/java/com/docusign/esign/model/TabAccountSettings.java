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
 * TabAccountSettings.
 *
 */

public class TabAccountSettings {
  @JsonProperty("allowTabOrder")
  private String allowTabOrder = null;

  @JsonProperty("allowTabOrderMetadata")
  private SettingsMetadata allowTabOrderMetadata = null;

  @JsonProperty("approveDeclineTabsEnabled")
  private String approveDeclineTabsEnabled = null;

  @JsonProperty("approveDeclineTabsMetadata")
  private SettingsMetadata approveDeclineTabsMetadata = null;

  @JsonProperty("calculatedFieldsEnabled")
  private String calculatedFieldsEnabled = null;

  @JsonProperty("calculatedFieldsMetadata")
  private SettingsMetadata calculatedFieldsMetadata = null;

  @JsonProperty("checkboxTabsEnabled")
  private String checkboxTabsEnabled = null;

  @JsonProperty("checkBoxTabsMetadata")
  private SettingsMetadata checkBoxTabsMetadata = null;

  @JsonProperty("dataFieldRegexEnabled")
  private String dataFieldRegexEnabled = null;

  @JsonProperty("dataFieldRegexMetadata")
  private SettingsMetadata dataFieldRegexMetadata = null;

  @JsonProperty("dataFieldSizeEnabled")
  private String dataFieldSizeEnabled = null;

  @JsonProperty("dataFieldSizeMetadata")
  private SettingsMetadata dataFieldSizeMetadata = null;

  @JsonProperty("drawTabsEnabled")
  private String drawTabsEnabled = null;

  @JsonProperty("drawTabsMetadata")
  private SettingsMetadata drawTabsMetadata = null;

  @JsonProperty("firstLastEmailTabsEnabled")
  private String firstLastEmailTabsEnabled = null;

  @JsonProperty("firstLastEmailTabsMetadata")
  private SettingsMetadata firstLastEmailTabsMetadata = null;

  @JsonProperty("listTabsEnabled")
  private String listTabsEnabled = null;

  @JsonProperty("listTabsMetadata")
  private SettingsMetadata listTabsMetadata = null;

  @JsonProperty("noteTabsEnabled")
  private String noteTabsEnabled = null;

  @JsonProperty("noteTabsMetadata")
  private SettingsMetadata noteTabsMetadata = null;

  @JsonProperty("numericalTabsEnabled")
  private String numericalTabsEnabled = null;

  @JsonProperty("numericalTabsMetadata")
  private SettingsMetadata numericalTabsMetadata = null;

  @JsonProperty("prefillTabsEnabled")
  private String prefillTabsEnabled = null;

  @JsonProperty("prefillTabsMetadata")
  private SettingsMetadata prefillTabsMetadata = null;

  @JsonProperty("radioTabsEnabled")
  private String radioTabsEnabled = null;

  @JsonProperty("radioTabsMetadata")
  private SettingsMetadata radioTabsMetadata = null;

  @JsonProperty("savingCustomTabsEnabled")
  private String savingCustomTabsEnabled = null;

  @JsonProperty("savingCustomTabsMetadata")
  private SettingsMetadata savingCustomTabsMetadata = null;

  @JsonProperty("senderToChangeTabAssignmentsEnabled")
  private String senderToChangeTabAssignmentsEnabled = null;

  @JsonProperty("senderToChangeTabAssignmentsMetadata")
  private SettingsMetadata senderToChangeTabAssignmentsMetadata = null;

  @JsonProperty("sharedCustomTabsEnabled")
  private String sharedCustomTabsEnabled = null;

  @JsonProperty("sharedCustomTabsMetadata")
  private SettingsMetadata sharedCustomTabsMetadata = null;

  @JsonProperty("tabDataLabelEnabled")
  private String tabDataLabelEnabled = null;

  @JsonProperty("tabDataLabelMetadata")
  private SettingsMetadata tabDataLabelMetadata = null;

  @JsonProperty("tabLocationEnabled")
  private String tabLocationEnabled = null;

  @JsonProperty("tabLocationMetadata")
  private SettingsMetadata tabLocationMetadata = null;

  @JsonProperty("tabLockingEnabled")
  private String tabLockingEnabled = null;

  @JsonProperty("tabLockingMetadata")
  private SettingsMetadata tabLockingMetadata = null;

  @JsonProperty("tabScaleEnabled")
  private String tabScaleEnabled = null;

  @JsonProperty("tabScaleMetadata")
  private SettingsMetadata tabScaleMetadata = null;

  @JsonProperty("tabTextFormattingEnabled")
  private String tabTextFormattingEnabled = null;

  @JsonProperty("tabTextFormattingMetadata")
  private SettingsMetadata tabTextFormattingMetadata = null;

  @JsonProperty("textTabsEnabled")
  private String textTabsEnabled = null;

  @JsonProperty("textTabsMetadata")
  private SettingsMetadata textTabsMetadata = null;


  /**
   * allowTabOrder.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings allowTabOrder(String allowTabOrder) {
    this.allowTabOrder = allowTabOrder;
    return this;
  }

  /**
   * .
   * @return allowTabOrder
   **/
  @Schema(description = "")
  public String getAllowTabOrder() {
    return allowTabOrder;
  }

  /**
   * setAllowTabOrder.
   **/
  public void setAllowTabOrder(String allowTabOrder) {
    this.allowTabOrder = allowTabOrder;
  }


  /**
   * allowTabOrderMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings allowTabOrderMetadata(SettingsMetadata allowTabOrderMetadata) {
    this.allowTabOrderMetadata = allowTabOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowTabOrder` property is editable. .
   * @return allowTabOrderMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowTabOrder` property is editable. ")
  public SettingsMetadata getAllowTabOrderMetadata() {
    return allowTabOrderMetadata;
  }

  /**
   * setAllowTabOrderMetadata.
   **/
  public void setAllowTabOrderMetadata(SettingsMetadata allowTabOrderMetadata) {
    this.allowTabOrderMetadata = allowTabOrderMetadata;
  }


  /**
   * approveDeclineTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings approveDeclineTabsEnabled(String approveDeclineTabsEnabled) {
    this.approveDeclineTabsEnabled = approveDeclineTabsEnabled;
    return this;
  }

  /**
   * .
   * @return approveDeclineTabsEnabled
   **/
  @Schema(description = "")
  public String getApproveDeclineTabsEnabled() {
    return approveDeclineTabsEnabled;
  }

  /**
   * setApproveDeclineTabsEnabled.
   **/
  public void setApproveDeclineTabsEnabled(String approveDeclineTabsEnabled) {
    this.approveDeclineTabsEnabled = approveDeclineTabsEnabled;
  }


  /**
   * approveDeclineTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings approveDeclineTabsMetadata(SettingsMetadata approveDeclineTabsMetadata) {
    this.approveDeclineTabsMetadata = approveDeclineTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `approveDeclineTabs` property is editable. .
   * @return approveDeclineTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `approveDeclineTabs` property is editable. ")
  public SettingsMetadata getApproveDeclineTabsMetadata() {
    return approveDeclineTabsMetadata;
  }

  /**
   * setApproveDeclineTabsMetadata.
   **/
  public void setApproveDeclineTabsMetadata(SettingsMetadata approveDeclineTabsMetadata) {
    this.approveDeclineTabsMetadata = approveDeclineTabsMetadata;
  }


  /**
   * calculatedFieldsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings calculatedFieldsEnabled(String calculatedFieldsEnabled) {
    this.calculatedFieldsEnabled = calculatedFieldsEnabled;
    return this;
  }

  /**
   * .
   * @return calculatedFieldsEnabled
   **/
  @Schema(description = "")
  public String getCalculatedFieldsEnabled() {
    return calculatedFieldsEnabled;
  }

  /**
   * setCalculatedFieldsEnabled.
   **/
  public void setCalculatedFieldsEnabled(String calculatedFieldsEnabled) {
    this.calculatedFieldsEnabled = calculatedFieldsEnabled;
  }


  /**
   * calculatedFieldsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings calculatedFieldsMetadata(SettingsMetadata calculatedFieldsMetadata) {
    this.calculatedFieldsMetadata = calculatedFieldsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `calculatedFields` property is editable. .
   * @return calculatedFieldsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `calculatedFields` property is editable. ")
  public SettingsMetadata getCalculatedFieldsMetadata() {
    return calculatedFieldsMetadata;
  }

  /**
   * setCalculatedFieldsMetadata.
   **/
  public void setCalculatedFieldsMetadata(SettingsMetadata calculatedFieldsMetadata) {
    this.calculatedFieldsMetadata = calculatedFieldsMetadata;
  }


  /**
   * checkboxTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings checkboxTabsEnabled(String checkboxTabsEnabled) {
    this.checkboxTabsEnabled = checkboxTabsEnabled;
    return this;
  }

  /**
   * .
   * @return checkboxTabsEnabled
   **/
  @Schema(description = "")
  public String getCheckboxTabsEnabled() {
    return checkboxTabsEnabled;
  }

  /**
   * setCheckboxTabsEnabled.
   **/
  public void setCheckboxTabsEnabled(String checkboxTabsEnabled) {
    this.checkboxTabsEnabled = checkboxTabsEnabled;
  }


  /**
   * checkBoxTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings checkBoxTabsMetadata(SettingsMetadata checkBoxTabsMetadata) {
    this.checkBoxTabsMetadata = checkBoxTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `checkBoxTabs` property is editable..
   * @return checkBoxTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `checkBoxTabs` property is editable.")
  public SettingsMetadata getCheckBoxTabsMetadata() {
    return checkBoxTabsMetadata;
  }

  /**
   * setCheckBoxTabsMetadata.
   **/
  public void setCheckBoxTabsMetadata(SettingsMetadata checkBoxTabsMetadata) {
    this.checkBoxTabsMetadata = checkBoxTabsMetadata;
  }


  /**
   * dataFieldRegexEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings dataFieldRegexEnabled(String dataFieldRegexEnabled) {
    this.dataFieldRegexEnabled = dataFieldRegexEnabled;
    return this;
  }

  /**
   * .
   * @return dataFieldRegexEnabled
   **/
  @Schema(description = "")
  public String getDataFieldRegexEnabled() {
    return dataFieldRegexEnabled;
  }

  /**
   * setDataFieldRegexEnabled.
   **/
  public void setDataFieldRegexEnabled(String dataFieldRegexEnabled) {
    this.dataFieldRegexEnabled = dataFieldRegexEnabled;
  }


  /**
   * dataFieldRegexMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings dataFieldRegexMetadata(SettingsMetadata dataFieldRegexMetadata) {
    this.dataFieldRegexMetadata = dataFieldRegexMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `dataFieldRegex` property is editable. .
   * @return dataFieldRegexMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `dataFieldRegex` property is editable. ")
  public SettingsMetadata getDataFieldRegexMetadata() {
    return dataFieldRegexMetadata;
  }

  /**
   * setDataFieldRegexMetadata.
   **/
  public void setDataFieldRegexMetadata(SettingsMetadata dataFieldRegexMetadata) {
    this.dataFieldRegexMetadata = dataFieldRegexMetadata;
  }


  /**
   * dataFieldSizeEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings dataFieldSizeEnabled(String dataFieldSizeEnabled) {
    this.dataFieldSizeEnabled = dataFieldSizeEnabled;
    return this;
  }

  /**
   * .
   * @return dataFieldSizeEnabled
   **/
  @Schema(description = "")
  public String getDataFieldSizeEnabled() {
    return dataFieldSizeEnabled;
  }

  /**
   * setDataFieldSizeEnabled.
   **/
  public void setDataFieldSizeEnabled(String dataFieldSizeEnabled) {
    this.dataFieldSizeEnabled = dataFieldSizeEnabled;
  }


  /**
   * dataFieldSizeMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings dataFieldSizeMetadata(SettingsMetadata dataFieldSizeMetadata) {
    this.dataFieldSizeMetadata = dataFieldSizeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `dataFieldSize` property is editable. .
   * @return dataFieldSizeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `dataFieldSize` property is editable. ")
  public SettingsMetadata getDataFieldSizeMetadata() {
    return dataFieldSizeMetadata;
  }

  /**
   * setDataFieldSizeMetadata.
   **/
  public void setDataFieldSizeMetadata(SettingsMetadata dataFieldSizeMetadata) {
    this.dataFieldSizeMetadata = dataFieldSizeMetadata;
  }


  /**
   * drawTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings drawTabsEnabled(String drawTabsEnabled) {
    this.drawTabsEnabled = drawTabsEnabled;
    return this;
  }

  /**
   * .
   * @return drawTabsEnabled
   **/
  @Schema(description = "")
  public String getDrawTabsEnabled() {
    return drawTabsEnabled;
  }

  /**
   * setDrawTabsEnabled.
   **/
  public void setDrawTabsEnabled(String drawTabsEnabled) {
    this.drawTabsEnabled = drawTabsEnabled;
  }


  /**
   * drawTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings drawTabsMetadata(SettingsMetadata drawTabsMetadata) {
    this.drawTabsMetadata = drawTabsMetadata;
    return this;
  }

  /**
   * .
   * @return drawTabsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getDrawTabsMetadata() {
    return drawTabsMetadata;
  }

  /**
   * setDrawTabsMetadata.
   **/
  public void setDrawTabsMetadata(SettingsMetadata drawTabsMetadata) {
    this.drawTabsMetadata = drawTabsMetadata;
  }


  /**
   * firstLastEmailTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings firstLastEmailTabsEnabled(String firstLastEmailTabsEnabled) {
    this.firstLastEmailTabsEnabled = firstLastEmailTabsEnabled;
    return this;
  }

  /**
   * .
   * @return firstLastEmailTabsEnabled
   **/
  @Schema(description = "")
  public String getFirstLastEmailTabsEnabled() {
    return firstLastEmailTabsEnabled;
  }

  /**
   * setFirstLastEmailTabsEnabled.
   **/
  public void setFirstLastEmailTabsEnabled(String firstLastEmailTabsEnabled) {
    this.firstLastEmailTabsEnabled = firstLastEmailTabsEnabled;
  }


  /**
   * firstLastEmailTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings firstLastEmailTabsMetadata(SettingsMetadata firstLastEmailTabsMetadata) {
    this.firstLastEmailTabsMetadata = firstLastEmailTabsMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return firstLastEmailTabsMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getFirstLastEmailTabsMetadata() {
    return firstLastEmailTabsMetadata;
  }

  /**
   * setFirstLastEmailTabsMetadata.
   **/
  public void setFirstLastEmailTabsMetadata(SettingsMetadata firstLastEmailTabsMetadata) {
    this.firstLastEmailTabsMetadata = firstLastEmailTabsMetadata;
  }


  /**
   * listTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings listTabsEnabled(String listTabsEnabled) {
    this.listTabsEnabled = listTabsEnabled;
    return this;
  }

  /**
   * .
   * @return listTabsEnabled
   **/
  @Schema(description = "")
  public String getListTabsEnabled() {
    return listTabsEnabled;
  }

  /**
   * setListTabsEnabled.
   **/
  public void setListTabsEnabled(String listTabsEnabled) {
    this.listTabsEnabled = listTabsEnabled;
  }


  /**
   * listTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings listTabsMetadata(SettingsMetadata listTabsMetadata) {
    this.listTabsMetadata = listTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `listTabs` property is editable. .
   * @return listTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `listTabs` property is editable. ")
  public SettingsMetadata getListTabsMetadata() {
    return listTabsMetadata;
  }

  /**
   * setListTabsMetadata.
   **/
  public void setListTabsMetadata(SettingsMetadata listTabsMetadata) {
    this.listTabsMetadata = listTabsMetadata;
  }


  /**
   * noteTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings noteTabsEnabled(String noteTabsEnabled) {
    this.noteTabsEnabled = noteTabsEnabled;
    return this;
  }

  /**
   * .
   * @return noteTabsEnabled
   **/
  @Schema(description = "")
  public String getNoteTabsEnabled() {
    return noteTabsEnabled;
  }

  /**
   * setNoteTabsEnabled.
   **/
  public void setNoteTabsEnabled(String noteTabsEnabled) {
    this.noteTabsEnabled = noteTabsEnabled;
  }


  /**
   * noteTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings noteTabsMetadata(SettingsMetadata noteTabsMetadata) {
    this.noteTabsMetadata = noteTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `noteTabs` property is editable. .
   * @return noteTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `noteTabs` property is editable. ")
  public SettingsMetadata getNoteTabsMetadata() {
    return noteTabsMetadata;
  }

  /**
   * setNoteTabsMetadata.
   **/
  public void setNoteTabsMetadata(SettingsMetadata noteTabsMetadata) {
    this.noteTabsMetadata = noteTabsMetadata;
  }


  /**
   * numericalTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings numericalTabsEnabled(String numericalTabsEnabled) {
    this.numericalTabsEnabled = numericalTabsEnabled;
    return this;
  }

  /**
   * .
   * @return numericalTabsEnabled
   **/
  @Schema(description = "")
  public String getNumericalTabsEnabled() {
    return numericalTabsEnabled;
  }

  /**
   * setNumericalTabsEnabled.
   **/
  public void setNumericalTabsEnabled(String numericalTabsEnabled) {
    this.numericalTabsEnabled = numericalTabsEnabled;
  }


  /**
   * numericalTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings numericalTabsMetadata(SettingsMetadata numericalTabsMetadata) {
    this.numericalTabsMetadata = numericalTabsMetadata;
    return this;
  }

  /**
   * .
   * @return numericalTabsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getNumericalTabsMetadata() {
    return numericalTabsMetadata;
  }

  /**
   * setNumericalTabsMetadata.
   **/
  public void setNumericalTabsMetadata(SettingsMetadata numericalTabsMetadata) {
    this.numericalTabsMetadata = numericalTabsMetadata;
  }


  /**
   * prefillTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings prefillTabsEnabled(String prefillTabsEnabled) {
    this.prefillTabsEnabled = prefillTabsEnabled;
    return this;
  }

  /**
   * .
   * @return prefillTabsEnabled
   **/
  @Schema(description = "")
  public String getPrefillTabsEnabled() {
    return prefillTabsEnabled;
  }

  /**
   * setPrefillTabsEnabled.
   **/
  public void setPrefillTabsEnabled(String prefillTabsEnabled) {
    this.prefillTabsEnabled = prefillTabsEnabled;
  }


  /**
   * prefillTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings prefillTabsMetadata(SettingsMetadata prefillTabsMetadata) {
    this.prefillTabsMetadata = prefillTabsMetadata;
    return this;
  }

  /**
   * .
   * @return prefillTabsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getPrefillTabsMetadata() {
    return prefillTabsMetadata;
  }

  /**
   * setPrefillTabsMetadata.
   **/
  public void setPrefillTabsMetadata(SettingsMetadata prefillTabsMetadata) {
    this.prefillTabsMetadata = prefillTabsMetadata;
  }


  /**
   * radioTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings radioTabsEnabled(String radioTabsEnabled) {
    this.radioTabsEnabled = radioTabsEnabled;
    return this;
  }

  /**
   * .
   * @return radioTabsEnabled
   **/
  @Schema(description = "")
  public String getRadioTabsEnabled() {
    return radioTabsEnabled;
  }

  /**
   * setRadioTabsEnabled.
   **/
  public void setRadioTabsEnabled(String radioTabsEnabled) {
    this.radioTabsEnabled = radioTabsEnabled;
  }


  /**
   * radioTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings radioTabsMetadata(SettingsMetadata radioTabsMetadata) {
    this.radioTabsMetadata = radioTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `radioTabs` property is editable. .
   * @return radioTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `radioTabs` property is editable. ")
  public SettingsMetadata getRadioTabsMetadata() {
    return radioTabsMetadata;
  }

  /**
   * setRadioTabsMetadata.
   **/
  public void setRadioTabsMetadata(SettingsMetadata radioTabsMetadata) {
    this.radioTabsMetadata = radioTabsMetadata;
  }


  /**
   * savingCustomTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings savingCustomTabsEnabled(String savingCustomTabsEnabled) {
    this.savingCustomTabsEnabled = savingCustomTabsEnabled;
    return this;
  }

  /**
   * .
   * @return savingCustomTabsEnabled
   **/
  @Schema(description = "")
  public String getSavingCustomTabsEnabled() {
    return savingCustomTabsEnabled;
  }

  /**
   * setSavingCustomTabsEnabled.
   **/
  public void setSavingCustomTabsEnabled(String savingCustomTabsEnabled) {
    this.savingCustomTabsEnabled = savingCustomTabsEnabled;
  }


  /**
   * savingCustomTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings savingCustomTabsMetadata(SettingsMetadata savingCustomTabsMetadata) {
    this.savingCustomTabsMetadata = savingCustomTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `savingCustomTabs` property is editable. .
   * @return savingCustomTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `savingCustomTabs` property is editable. ")
  public SettingsMetadata getSavingCustomTabsMetadata() {
    return savingCustomTabsMetadata;
  }

  /**
   * setSavingCustomTabsMetadata.
   **/
  public void setSavingCustomTabsMetadata(SettingsMetadata savingCustomTabsMetadata) {
    this.savingCustomTabsMetadata = savingCustomTabsMetadata;
  }


  /**
   * senderToChangeTabAssignmentsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings senderToChangeTabAssignmentsEnabled(String senderToChangeTabAssignmentsEnabled) {
    this.senderToChangeTabAssignmentsEnabled = senderToChangeTabAssignmentsEnabled;
    return this;
  }

  /**
   * .
   * @return senderToChangeTabAssignmentsEnabled
   **/
  @Schema(description = "")
  public String getSenderToChangeTabAssignmentsEnabled() {
    return senderToChangeTabAssignmentsEnabled;
  }

  /**
   * setSenderToChangeTabAssignmentsEnabled.
   **/
  public void setSenderToChangeTabAssignmentsEnabled(String senderToChangeTabAssignmentsEnabled) {
    this.senderToChangeTabAssignmentsEnabled = senderToChangeTabAssignmentsEnabled;
  }


  /**
   * senderToChangeTabAssignmentsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings senderToChangeTabAssignmentsMetadata(SettingsMetadata senderToChangeTabAssignmentsMetadata) {
    this.senderToChangeTabAssignmentsMetadata = senderToChangeTabAssignmentsMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return senderToChangeTabAssignmentsMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getSenderToChangeTabAssignmentsMetadata() {
    return senderToChangeTabAssignmentsMetadata;
  }

  /**
   * setSenderToChangeTabAssignmentsMetadata.
   **/
  public void setSenderToChangeTabAssignmentsMetadata(SettingsMetadata senderToChangeTabAssignmentsMetadata) {
    this.senderToChangeTabAssignmentsMetadata = senderToChangeTabAssignmentsMetadata;
  }


  /**
   * sharedCustomTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings sharedCustomTabsEnabled(String sharedCustomTabsEnabled) {
    this.sharedCustomTabsEnabled = sharedCustomTabsEnabled;
    return this;
  }

  /**
   * .
   * @return sharedCustomTabsEnabled
   **/
  @Schema(description = "")
  public String getSharedCustomTabsEnabled() {
    return sharedCustomTabsEnabled;
  }

  /**
   * setSharedCustomTabsEnabled.
   **/
  public void setSharedCustomTabsEnabled(String sharedCustomTabsEnabled) {
    this.sharedCustomTabsEnabled = sharedCustomTabsEnabled;
  }


  /**
   * sharedCustomTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings sharedCustomTabsMetadata(SettingsMetadata sharedCustomTabsMetadata) {
    this.sharedCustomTabsMetadata = sharedCustomTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `sharedCustomTabs` property is editable. .
   * @return sharedCustomTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `sharedCustomTabs` property is editable. ")
  public SettingsMetadata getSharedCustomTabsMetadata() {
    return sharedCustomTabsMetadata;
  }

  /**
   * setSharedCustomTabsMetadata.
   **/
  public void setSharedCustomTabsMetadata(SettingsMetadata sharedCustomTabsMetadata) {
    this.sharedCustomTabsMetadata = sharedCustomTabsMetadata;
  }


  /**
   * tabDataLabelEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabDataLabelEnabled(String tabDataLabelEnabled) {
    this.tabDataLabelEnabled = tabDataLabelEnabled;
    return this;
  }

  /**
   * .
   * @return tabDataLabelEnabled
   **/
  @Schema(description = "")
  public String getTabDataLabelEnabled() {
    return tabDataLabelEnabled;
  }

  /**
   * setTabDataLabelEnabled.
   **/
  public void setTabDataLabelEnabled(String tabDataLabelEnabled) {
    this.tabDataLabelEnabled = tabDataLabelEnabled;
  }


  /**
   * tabDataLabelMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabDataLabelMetadata(SettingsMetadata tabDataLabelMetadata) {
    this.tabDataLabelMetadata = tabDataLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabDataLabel` property is editable. .
   * @return tabDataLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabDataLabel` property is editable. ")
  public SettingsMetadata getTabDataLabelMetadata() {
    return tabDataLabelMetadata;
  }

  /**
   * setTabDataLabelMetadata.
   **/
  public void setTabDataLabelMetadata(SettingsMetadata tabDataLabelMetadata) {
    this.tabDataLabelMetadata = tabDataLabelMetadata;
  }


  /**
   * tabLocationEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabLocationEnabled(String tabLocationEnabled) {
    this.tabLocationEnabled = tabLocationEnabled;
    return this;
  }

  /**
   * .
   * @return tabLocationEnabled
   **/
  @Schema(description = "")
  public String getTabLocationEnabled() {
    return tabLocationEnabled;
  }

  /**
   * setTabLocationEnabled.
   **/
  public void setTabLocationEnabled(String tabLocationEnabled) {
    this.tabLocationEnabled = tabLocationEnabled;
  }


  /**
   * tabLocationMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabLocationMetadata(SettingsMetadata tabLocationMetadata) {
    this.tabLocationMetadata = tabLocationMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return tabLocationMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getTabLocationMetadata() {
    return tabLocationMetadata;
  }

  /**
   * setTabLocationMetadata.
   **/
  public void setTabLocationMetadata(SettingsMetadata tabLocationMetadata) {
    this.tabLocationMetadata = tabLocationMetadata;
  }


  /**
   * tabLockingEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabLockingEnabled(String tabLockingEnabled) {
    this.tabLockingEnabled = tabLockingEnabled;
    return this;
  }

  /**
   * .
   * @return tabLockingEnabled
   **/
  @Schema(description = "")
  public String getTabLockingEnabled() {
    return tabLockingEnabled;
  }

  /**
   * setTabLockingEnabled.
   **/
  public void setTabLockingEnabled(String tabLockingEnabled) {
    this.tabLockingEnabled = tabLockingEnabled;
  }


  /**
   * tabLockingMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabLockingMetadata(SettingsMetadata tabLockingMetadata) {
    this.tabLockingMetadata = tabLockingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabLocking` property is editable. .
   * @return tabLockingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabLocking` property is editable. ")
  public SettingsMetadata getTabLockingMetadata() {
    return tabLockingMetadata;
  }

  /**
   * setTabLockingMetadata.
   **/
  public void setTabLockingMetadata(SettingsMetadata tabLockingMetadata) {
    this.tabLockingMetadata = tabLockingMetadata;
  }


  /**
   * tabScaleEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabScaleEnabled(String tabScaleEnabled) {
    this.tabScaleEnabled = tabScaleEnabled;
    return this;
  }

  /**
   * .
   * @return tabScaleEnabled
   **/
  @Schema(description = "")
  public String getTabScaleEnabled() {
    return tabScaleEnabled;
  }

  /**
   * setTabScaleEnabled.
   **/
  public void setTabScaleEnabled(String tabScaleEnabled) {
    this.tabScaleEnabled = tabScaleEnabled;
  }


  /**
   * tabScaleMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabScaleMetadata(SettingsMetadata tabScaleMetadata) {
    this.tabScaleMetadata = tabScaleMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return tabScaleMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getTabScaleMetadata() {
    return tabScaleMetadata;
  }

  /**
   * setTabScaleMetadata.
   **/
  public void setTabScaleMetadata(SettingsMetadata tabScaleMetadata) {
    this.tabScaleMetadata = tabScaleMetadata;
  }


  /**
   * tabTextFormattingEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabTextFormattingEnabled(String tabTextFormattingEnabled) {
    this.tabTextFormattingEnabled = tabTextFormattingEnabled;
    return this;
  }

  /**
   * .
   * @return tabTextFormattingEnabled
   **/
  @Schema(description = "")
  public String getTabTextFormattingEnabled() {
    return tabTextFormattingEnabled;
  }

  /**
   * setTabTextFormattingEnabled.
   **/
  public void setTabTextFormattingEnabled(String tabTextFormattingEnabled) {
    this.tabTextFormattingEnabled = tabTextFormattingEnabled;
  }


  /**
   * tabTextFormattingMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings tabTextFormattingMetadata(SettingsMetadata tabTextFormattingMetadata) {
    this.tabTextFormattingMetadata = tabTextFormattingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabTextFormatting` property is editable. .
   * @return tabTextFormattingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabTextFormatting` property is editable. ")
  public SettingsMetadata getTabTextFormattingMetadata() {
    return tabTextFormattingMetadata;
  }

  /**
   * setTabTextFormattingMetadata.
   **/
  public void setTabTextFormattingMetadata(SettingsMetadata tabTextFormattingMetadata) {
    this.tabTextFormattingMetadata = tabTextFormattingMetadata;
  }


  /**
   * textTabsEnabled.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings textTabsEnabled(String textTabsEnabled) {
    this.textTabsEnabled = textTabsEnabled;
    return this;
  }

  /**
   * .
   * @return textTabsEnabled
   **/
  @Schema(description = "")
  public String getTextTabsEnabled() {
    return textTabsEnabled;
  }

  /**
   * setTextTabsEnabled.
   **/
  public void setTextTabsEnabled(String textTabsEnabled) {
    this.textTabsEnabled = textTabsEnabled;
  }


  /**
   * textTabsMetadata.
   *
   * @return TabAccountSettings
   **/
  public TabAccountSettings textTabsMetadata(SettingsMetadata textTabsMetadata) {
    this.textTabsMetadata = textTabsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `textTabs` property is editable. .
   * @return textTabsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `textTabs` property is editable. ")
  public SettingsMetadata getTextTabsMetadata() {
    return textTabsMetadata;
  }

  /**
   * setTextTabsMetadata.
   **/
  public void setTextTabsMetadata(SettingsMetadata textTabsMetadata) {
    this.textTabsMetadata = textTabsMetadata;
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
    TabAccountSettings tabAccountSettings = (TabAccountSettings) o;
    return Objects.equals(this.allowTabOrder, tabAccountSettings.allowTabOrder) &&
        Objects.equals(this.allowTabOrderMetadata, tabAccountSettings.allowTabOrderMetadata) &&
        Objects.equals(this.approveDeclineTabsEnabled, tabAccountSettings.approveDeclineTabsEnabled) &&
        Objects.equals(this.approveDeclineTabsMetadata, tabAccountSettings.approveDeclineTabsMetadata) &&
        Objects.equals(this.calculatedFieldsEnabled, tabAccountSettings.calculatedFieldsEnabled) &&
        Objects.equals(this.calculatedFieldsMetadata, tabAccountSettings.calculatedFieldsMetadata) &&
        Objects.equals(this.checkboxTabsEnabled, tabAccountSettings.checkboxTabsEnabled) &&
        Objects.equals(this.checkBoxTabsMetadata, tabAccountSettings.checkBoxTabsMetadata) &&
        Objects.equals(this.dataFieldRegexEnabled, tabAccountSettings.dataFieldRegexEnabled) &&
        Objects.equals(this.dataFieldRegexMetadata, tabAccountSettings.dataFieldRegexMetadata) &&
        Objects.equals(this.dataFieldSizeEnabled, tabAccountSettings.dataFieldSizeEnabled) &&
        Objects.equals(this.dataFieldSizeMetadata, tabAccountSettings.dataFieldSizeMetadata) &&
        Objects.equals(this.drawTabsEnabled, tabAccountSettings.drawTabsEnabled) &&
        Objects.equals(this.drawTabsMetadata, tabAccountSettings.drawTabsMetadata) &&
        Objects.equals(this.firstLastEmailTabsEnabled, tabAccountSettings.firstLastEmailTabsEnabled) &&
        Objects.equals(this.firstLastEmailTabsMetadata, tabAccountSettings.firstLastEmailTabsMetadata) &&
        Objects.equals(this.listTabsEnabled, tabAccountSettings.listTabsEnabled) &&
        Objects.equals(this.listTabsMetadata, tabAccountSettings.listTabsMetadata) &&
        Objects.equals(this.noteTabsEnabled, tabAccountSettings.noteTabsEnabled) &&
        Objects.equals(this.noteTabsMetadata, tabAccountSettings.noteTabsMetadata) &&
        Objects.equals(this.numericalTabsEnabled, tabAccountSettings.numericalTabsEnabled) &&
        Objects.equals(this.numericalTabsMetadata, tabAccountSettings.numericalTabsMetadata) &&
        Objects.equals(this.prefillTabsEnabled, tabAccountSettings.prefillTabsEnabled) &&
        Objects.equals(this.prefillTabsMetadata, tabAccountSettings.prefillTabsMetadata) &&
        Objects.equals(this.radioTabsEnabled, tabAccountSettings.radioTabsEnabled) &&
        Objects.equals(this.radioTabsMetadata, tabAccountSettings.radioTabsMetadata) &&
        Objects.equals(this.savingCustomTabsEnabled, tabAccountSettings.savingCustomTabsEnabled) &&
        Objects.equals(this.savingCustomTabsMetadata, tabAccountSettings.savingCustomTabsMetadata) &&
        Objects.equals(this.senderToChangeTabAssignmentsEnabled, tabAccountSettings.senderToChangeTabAssignmentsEnabled) &&
        Objects.equals(this.senderToChangeTabAssignmentsMetadata, tabAccountSettings.senderToChangeTabAssignmentsMetadata) &&
        Objects.equals(this.sharedCustomTabsEnabled, tabAccountSettings.sharedCustomTabsEnabled) &&
        Objects.equals(this.sharedCustomTabsMetadata, tabAccountSettings.sharedCustomTabsMetadata) &&
        Objects.equals(this.tabDataLabelEnabled, tabAccountSettings.tabDataLabelEnabled) &&
        Objects.equals(this.tabDataLabelMetadata, tabAccountSettings.tabDataLabelMetadata) &&
        Objects.equals(this.tabLocationEnabled, tabAccountSettings.tabLocationEnabled) &&
        Objects.equals(this.tabLocationMetadata, tabAccountSettings.tabLocationMetadata) &&
        Objects.equals(this.tabLockingEnabled, tabAccountSettings.tabLockingEnabled) &&
        Objects.equals(this.tabLockingMetadata, tabAccountSettings.tabLockingMetadata) &&
        Objects.equals(this.tabScaleEnabled, tabAccountSettings.tabScaleEnabled) &&
        Objects.equals(this.tabScaleMetadata, tabAccountSettings.tabScaleMetadata) &&
        Objects.equals(this.tabTextFormattingEnabled, tabAccountSettings.tabTextFormattingEnabled) &&
        Objects.equals(this.tabTextFormattingMetadata, tabAccountSettings.tabTextFormattingMetadata) &&
        Objects.equals(this.textTabsEnabled, tabAccountSettings.textTabsEnabled) &&
        Objects.equals(this.textTabsMetadata, tabAccountSettings.textTabsMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowTabOrder, allowTabOrderMetadata, approveDeclineTabsEnabled, approveDeclineTabsMetadata, calculatedFieldsEnabled, calculatedFieldsMetadata, checkboxTabsEnabled, checkBoxTabsMetadata, dataFieldRegexEnabled, dataFieldRegexMetadata, dataFieldSizeEnabled, dataFieldSizeMetadata, drawTabsEnabled, drawTabsMetadata, firstLastEmailTabsEnabled, firstLastEmailTabsMetadata, listTabsEnabled, listTabsMetadata, noteTabsEnabled, noteTabsMetadata, numericalTabsEnabled, numericalTabsMetadata, prefillTabsEnabled, prefillTabsMetadata, radioTabsEnabled, radioTabsMetadata, savingCustomTabsEnabled, savingCustomTabsMetadata, senderToChangeTabAssignmentsEnabled, senderToChangeTabAssignmentsMetadata, sharedCustomTabsEnabled, sharedCustomTabsMetadata, tabDataLabelEnabled, tabDataLabelMetadata, tabLocationEnabled, tabLocationMetadata, tabLockingEnabled, tabLockingMetadata, tabScaleEnabled, tabScaleMetadata, tabTextFormattingEnabled, tabTextFormattingMetadata, textTabsEnabled, textTabsMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabAccountSettings {\n");
    
    sb.append("    allowTabOrder: ").append(toIndentedString(allowTabOrder)).append("\n");
    sb.append("    allowTabOrderMetadata: ").append(toIndentedString(allowTabOrderMetadata)).append("\n");
    sb.append("    approveDeclineTabsEnabled: ").append(toIndentedString(approveDeclineTabsEnabled)).append("\n");
    sb.append("    approveDeclineTabsMetadata: ").append(toIndentedString(approveDeclineTabsMetadata)).append("\n");
    sb.append("    calculatedFieldsEnabled: ").append(toIndentedString(calculatedFieldsEnabled)).append("\n");
    sb.append("    calculatedFieldsMetadata: ").append(toIndentedString(calculatedFieldsMetadata)).append("\n");
    sb.append("    checkboxTabsEnabled: ").append(toIndentedString(checkboxTabsEnabled)).append("\n");
    sb.append("    checkBoxTabsMetadata: ").append(toIndentedString(checkBoxTabsMetadata)).append("\n");
    sb.append("    dataFieldRegexEnabled: ").append(toIndentedString(dataFieldRegexEnabled)).append("\n");
    sb.append("    dataFieldRegexMetadata: ").append(toIndentedString(dataFieldRegexMetadata)).append("\n");
    sb.append("    dataFieldSizeEnabled: ").append(toIndentedString(dataFieldSizeEnabled)).append("\n");
    sb.append("    dataFieldSizeMetadata: ").append(toIndentedString(dataFieldSizeMetadata)).append("\n");
    sb.append("    drawTabsEnabled: ").append(toIndentedString(drawTabsEnabled)).append("\n");
    sb.append("    drawTabsMetadata: ").append(toIndentedString(drawTabsMetadata)).append("\n");
    sb.append("    firstLastEmailTabsEnabled: ").append(toIndentedString(firstLastEmailTabsEnabled)).append("\n");
    sb.append("    firstLastEmailTabsMetadata: ").append(toIndentedString(firstLastEmailTabsMetadata)).append("\n");
    sb.append("    listTabsEnabled: ").append(toIndentedString(listTabsEnabled)).append("\n");
    sb.append("    listTabsMetadata: ").append(toIndentedString(listTabsMetadata)).append("\n");
    sb.append("    noteTabsEnabled: ").append(toIndentedString(noteTabsEnabled)).append("\n");
    sb.append("    noteTabsMetadata: ").append(toIndentedString(noteTabsMetadata)).append("\n");
    sb.append("    numericalTabsEnabled: ").append(toIndentedString(numericalTabsEnabled)).append("\n");
    sb.append("    numericalTabsMetadata: ").append(toIndentedString(numericalTabsMetadata)).append("\n");
    sb.append("    prefillTabsEnabled: ").append(toIndentedString(prefillTabsEnabled)).append("\n");
    sb.append("    prefillTabsMetadata: ").append(toIndentedString(prefillTabsMetadata)).append("\n");
    sb.append("    radioTabsEnabled: ").append(toIndentedString(radioTabsEnabled)).append("\n");
    sb.append("    radioTabsMetadata: ").append(toIndentedString(radioTabsMetadata)).append("\n");
    sb.append("    savingCustomTabsEnabled: ").append(toIndentedString(savingCustomTabsEnabled)).append("\n");
    sb.append("    savingCustomTabsMetadata: ").append(toIndentedString(savingCustomTabsMetadata)).append("\n");
    sb.append("    senderToChangeTabAssignmentsEnabled: ").append(toIndentedString(senderToChangeTabAssignmentsEnabled)).append("\n");
    sb.append("    senderToChangeTabAssignmentsMetadata: ").append(toIndentedString(senderToChangeTabAssignmentsMetadata)).append("\n");
    sb.append("    sharedCustomTabsEnabled: ").append(toIndentedString(sharedCustomTabsEnabled)).append("\n");
    sb.append("    sharedCustomTabsMetadata: ").append(toIndentedString(sharedCustomTabsMetadata)).append("\n");
    sb.append("    tabDataLabelEnabled: ").append(toIndentedString(tabDataLabelEnabled)).append("\n");
    sb.append("    tabDataLabelMetadata: ").append(toIndentedString(tabDataLabelMetadata)).append("\n");
    sb.append("    tabLocationEnabled: ").append(toIndentedString(tabLocationEnabled)).append("\n");
    sb.append("    tabLocationMetadata: ").append(toIndentedString(tabLocationMetadata)).append("\n");
    sb.append("    tabLockingEnabled: ").append(toIndentedString(tabLockingEnabled)).append("\n");
    sb.append("    tabLockingMetadata: ").append(toIndentedString(tabLockingMetadata)).append("\n");
    sb.append("    tabScaleEnabled: ").append(toIndentedString(tabScaleEnabled)).append("\n");
    sb.append("    tabScaleMetadata: ").append(toIndentedString(tabScaleMetadata)).append("\n");
    sb.append("    tabTextFormattingEnabled: ").append(toIndentedString(tabTextFormattingEnabled)).append("\n");
    sb.append("    tabTextFormattingMetadata: ").append(toIndentedString(tabTextFormattingMetadata)).append("\n");
    sb.append("    textTabsEnabled: ").append(toIndentedString(textTabsEnabled)).append("\n");
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

