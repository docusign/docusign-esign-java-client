package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TabAccountSettings. */
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

  @JsonProperty("currencyTabsEnabled")
  private String currencyTabsEnabled = null;

  @JsonProperty("currencyTabsMetadata")
  private SettingsMetadata currencyTabsMetadata = null;

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
   */
  public TabAccountSettings allowTabOrder(String allowTabOrder) {
    this.allowTabOrder = allowTabOrder;
    return this;
  }

  /**
   * .
   *
   * @return allowTabOrder
   */
  @ApiModelProperty(value = "")
  public String getAllowTabOrder() {
    return allowTabOrder;
  }

  /** setAllowTabOrder. */
  public void setAllowTabOrder(String allowTabOrder) {
    this.allowTabOrder = allowTabOrder;
  }

  /**
   * allowTabOrderMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings allowTabOrderMetadata(SettingsMetadata allowTabOrderMetadata) {
    this.allowTabOrderMetadata = allowTabOrderMetadata;
    return this;
  }

  /**
   * Get allowTabOrderMetadata.
   *
   * @return allowTabOrderMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowTabOrderMetadata() {
    return allowTabOrderMetadata;
  }

  /** setAllowTabOrderMetadata. */
  public void setAllowTabOrderMetadata(SettingsMetadata allowTabOrderMetadata) {
    this.allowTabOrderMetadata = allowTabOrderMetadata;
  }

  /**
   * approveDeclineTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings approveDeclineTabsEnabled(String approveDeclineTabsEnabled) {
    this.approveDeclineTabsEnabled = approveDeclineTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return approveDeclineTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getApproveDeclineTabsEnabled() {
    return approveDeclineTabsEnabled;
  }

  /** setApproveDeclineTabsEnabled. */
  public void setApproveDeclineTabsEnabled(String approveDeclineTabsEnabled) {
    this.approveDeclineTabsEnabled = approveDeclineTabsEnabled;
  }

  /**
   * approveDeclineTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings approveDeclineTabsMetadata(
      SettingsMetadata approveDeclineTabsMetadata) {
    this.approveDeclineTabsMetadata = approveDeclineTabsMetadata;
    return this;
  }

  /**
   * Get approveDeclineTabsMetadata.
   *
   * @return approveDeclineTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getApproveDeclineTabsMetadata() {
    return approveDeclineTabsMetadata;
  }

  /** setApproveDeclineTabsMetadata. */
  public void setApproveDeclineTabsMetadata(SettingsMetadata approveDeclineTabsMetadata) {
    this.approveDeclineTabsMetadata = approveDeclineTabsMetadata;
  }

  /**
   * calculatedFieldsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings calculatedFieldsEnabled(String calculatedFieldsEnabled) {
    this.calculatedFieldsEnabled = calculatedFieldsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return calculatedFieldsEnabled
   */
  @ApiModelProperty(value = "")
  public String getCalculatedFieldsEnabled() {
    return calculatedFieldsEnabled;
  }

  /** setCalculatedFieldsEnabled. */
  public void setCalculatedFieldsEnabled(String calculatedFieldsEnabled) {
    this.calculatedFieldsEnabled = calculatedFieldsEnabled;
  }

  /**
   * calculatedFieldsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings calculatedFieldsMetadata(SettingsMetadata calculatedFieldsMetadata) {
    this.calculatedFieldsMetadata = calculatedFieldsMetadata;
    return this;
  }

  /**
   * Get calculatedFieldsMetadata.
   *
   * @return calculatedFieldsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getCalculatedFieldsMetadata() {
    return calculatedFieldsMetadata;
  }

  /** setCalculatedFieldsMetadata. */
  public void setCalculatedFieldsMetadata(SettingsMetadata calculatedFieldsMetadata) {
    this.calculatedFieldsMetadata = calculatedFieldsMetadata;
  }

  /**
   * checkboxTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings checkboxTabsEnabled(String checkboxTabsEnabled) {
    this.checkboxTabsEnabled = checkboxTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return checkboxTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getCheckboxTabsEnabled() {
    return checkboxTabsEnabled;
  }

  /** setCheckboxTabsEnabled. */
  public void setCheckboxTabsEnabled(String checkboxTabsEnabled) {
    this.checkboxTabsEnabled = checkboxTabsEnabled;
  }

  /**
   * checkBoxTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings checkBoxTabsMetadata(SettingsMetadata checkBoxTabsMetadata) {
    this.checkBoxTabsMetadata = checkBoxTabsMetadata;
    return this;
  }

  /**
   * Get checkBoxTabsMetadata.
   *
   * @return checkBoxTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getCheckBoxTabsMetadata() {
    return checkBoxTabsMetadata;
  }

  /** setCheckBoxTabsMetadata. */
  public void setCheckBoxTabsMetadata(SettingsMetadata checkBoxTabsMetadata) {
    this.checkBoxTabsMetadata = checkBoxTabsMetadata;
  }

  /**
   * currencyTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings currencyTabsEnabled(String currencyTabsEnabled) {
    this.currencyTabsEnabled = currencyTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return currencyTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getCurrencyTabsEnabled() {
    return currencyTabsEnabled;
  }

  /** setCurrencyTabsEnabled. */
  public void setCurrencyTabsEnabled(String currencyTabsEnabled) {
    this.currencyTabsEnabled = currencyTabsEnabled;
  }

  /**
   * currencyTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings currencyTabsMetadata(SettingsMetadata currencyTabsMetadata) {
    this.currencyTabsMetadata = currencyTabsMetadata;
    return this;
  }

  /**
   * Get currencyTabsMetadata.
   *
   * @return currencyTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getCurrencyTabsMetadata() {
    return currencyTabsMetadata;
  }

  /** setCurrencyTabsMetadata. */
  public void setCurrencyTabsMetadata(SettingsMetadata currencyTabsMetadata) {
    this.currencyTabsMetadata = currencyTabsMetadata;
  }

  /**
   * dataFieldRegexEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings dataFieldRegexEnabled(String dataFieldRegexEnabled) {
    this.dataFieldRegexEnabled = dataFieldRegexEnabled;
    return this;
  }

  /**
   * .
   *
   * @return dataFieldRegexEnabled
   */
  @ApiModelProperty(value = "")
  public String getDataFieldRegexEnabled() {
    return dataFieldRegexEnabled;
  }

  /** setDataFieldRegexEnabled. */
  public void setDataFieldRegexEnabled(String dataFieldRegexEnabled) {
    this.dataFieldRegexEnabled = dataFieldRegexEnabled;
  }

  /**
   * dataFieldRegexMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings dataFieldRegexMetadata(SettingsMetadata dataFieldRegexMetadata) {
    this.dataFieldRegexMetadata = dataFieldRegexMetadata;
    return this;
  }

  /**
   * Get dataFieldRegexMetadata.
   *
   * @return dataFieldRegexMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getDataFieldRegexMetadata() {
    return dataFieldRegexMetadata;
  }

  /** setDataFieldRegexMetadata. */
  public void setDataFieldRegexMetadata(SettingsMetadata dataFieldRegexMetadata) {
    this.dataFieldRegexMetadata = dataFieldRegexMetadata;
  }

  /**
   * dataFieldSizeEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings dataFieldSizeEnabled(String dataFieldSizeEnabled) {
    this.dataFieldSizeEnabled = dataFieldSizeEnabled;
    return this;
  }

  /**
   * .
   *
   * @return dataFieldSizeEnabled
   */
  @ApiModelProperty(value = "")
  public String getDataFieldSizeEnabled() {
    return dataFieldSizeEnabled;
  }

  /** setDataFieldSizeEnabled. */
  public void setDataFieldSizeEnabled(String dataFieldSizeEnabled) {
    this.dataFieldSizeEnabled = dataFieldSizeEnabled;
  }

  /**
   * dataFieldSizeMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings dataFieldSizeMetadata(SettingsMetadata dataFieldSizeMetadata) {
    this.dataFieldSizeMetadata = dataFieldSizeMetadata;
    return this;
  }

  /**
   * Get dataFieldSizeMetadata.
   *
   * @return dataFieldSizeMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getDataFieldSizeMetadata() {
    return dataFieldSizeMetadata;
  }

  /** setDataFieldSizeMetadata. */
  public void setDataFieldSizeMetadata(SettingsMetadata dataFieldSizeMetadata) {
    this.dataFieldSizeMetadata = dataFieldSizeMetadata;
  }

  /**
   * drawTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings drawTabsEnabled(String drawTabsEnabled) {
    this.drawTabsEnabled = drawTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return drawTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getDrawTabsEnabled() {
    return drawTabsEnabled;
  }

  /** setDrawTabsEnabled. */
  public void setDrawTabsEnabled(String drawTabsEnabled) {
    this.drawTabsEnabled = drawTabsEnabled;
  }

  /**
   * drawTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings drawTabsMetadata(SettingsMetadata drawTabsMetadata) {
    this.drawTabsMetadata = drawTabsMetadata;
    return this;
  }

  /**
   * Get drawTabsMetadata.
   *
   * @return drawTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getDrawTabsMetadata() {
    return drawTabsMetadata;
  }

  /** setDrawTabsMetadata. */
  public void setDrawTabsMetadata(SettingsMetadata drawTabsMetadata) {
    this.drawTabsMetadata = drawTabsMetadata;
  }

  /**
   * firstLastEmailTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings firstLastEmailTabsEnabled(String firstLastEmailTabsEnabled) {
    this.firstLastEmailTabsEnabled = firstLastEmailTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return firstLastEmailTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getFirstLastEmailTabsEnabled() {
    return firstLastEmailTabsEnabled;
  }

  /** setFirstLastEmailTabsEnabled. */
  public void setFirstLastEmailTabsEnabled(String firstLastEmailTabsEnabled) {
    this.firstLastEmailTabsEnabled = firstLastEmailTabsEnabled;
  }

  /**
   * firstLastEmailTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings firstLastEmailTabsMetadata(
      SettingsMetadata firstLastEmailTabsMetadata) {
    this.firstLastEmailTabsMetadata = firstLastEmailTabsMetadata;
    return this;
  }

  /**
   * Get firstLastEmailTabsMetadata.
   *
   * @return firstLastEmailTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getFirstLastEmailTabsMetadata() {
    return firstLastEmailTabsMetadata;
  }

  /** setFirstLastEmailTabsMetadata. */
  public void setFirstLastEmailTabsMetadata(SettingsMetadata firstLastEmailTabsMetadata) {
    this.firstLastEmailTabsMetadata = firstLastEmailTabsMetadata;
  }

  /**
   * listTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings listTabsEnabled(String listTabsEnabled) {
    this.listTabsEnabled = listTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return listTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getListTabsEnabled() {
    return listTabsEnabled;
  }

  /** setListTabsEnabled. */
  public void setListTabsEnabled(String listTabsEnabled) {
    this.listTabsEnabled = listTabsEnabled;
  }

  /**
   * listTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings listTabsMetadata(SettingsMetadata listTabsMetadata) {
    this.listTabsMetadata = listTabsMetadata;
    return this;
  }

  /**
   * Get listTabsMetadata.
   *
   * @return listTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getListTabsMetadata() {
    return listTabsMetadata;
  }

  /** setListTabsMetadata. */
  public void setListTabsMetadata(SettingsMetadata listTabsMetadata) {
    this.listTabsMetadata = listTabsMetadata;
  }

  /**
   * noteTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings noteTabsEnabled(String noteTabsEnabled) {
    this.noteTabsEnabled = noteTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return noteTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getNoteTabsEnabled() {
    return noteTabsEnabled;
  }

  /** setNoteTabsEnabled. */
  public void setNoteTabsEnabled(String noteTabsEnabled) {
    this.noteTabsEnabled = noteTabsEnabled;
  }

  /**
   * noteTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings noteTabsMetadata(SettingsMetadata noteTabsMetadata) {
    this.noteTabsMetadata = noteTabsMetadata;
    return this;
  }

  /**
   * Get noteTabsMetadata.
   *
   * @return noteTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getNoteTabsMetadata() {
    return noteTabsMetadata;
  }

  /** setNoteTabsMetadata. */
  public void setNoteTabsMetadata(SettingsMetadata noteTabsMetadata) {
    this.noteTabsMetadata = noteTabsMetadata;
  }

  /**
   * prefillTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings prefillTabsEnabled(String prefillTabsEnabled) {
    this.prefillTabsEnabled = prefillTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return prefillTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getPrefillTabsEnabled() {
    return prefillTabsEnabled;
  }

  /** setPrefillTabsEnabled. */
  public void setPrefillTabsEnabled(String prefillTabsEnabled) {
    this.prefillTabsEnabled = prefillTabsEnabled;
  }

  /**
   * prefillTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings prefillTabsMetadata(SettingsMetadata prefillTabsMetadata) {
    this.prefillTabsMetadata = prefillTabsMetadata;
    return this;
  }

  /**
   * Get prefillTabsMetadata.
   *
   * @return prefillTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getPrefillTabsMetadata() {
    return prefillTabsMetadata;
  }

  /** setPrefillTabsMetadata. */
  public void setPrefillTabsMetadata(SettingsMetadata prefillTabsMetadata) {
    this.prefillTabsMetadata = prefillTabsMetadata;
  }

  /**
   * radioTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings radioTabsEnabled(String radioTabsEnabled) {
    this.radioTabsEnabled = radioTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return radioTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getRadioTabsEnabled() {
    return radioTabsEnabled;
  }

  /** setRadioTabsEnabled. */
  public void setRadioTabsEnabled(String radioTabsEnabled) {
    this.radioTabsEnabled = radioTabsEnabled;
  }

  /**
   * radioTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings radioTabsMetadata(SettingsMetadata radioTabsMetadata) {
    this.radioTabsMetadata = radioTabsMetadata;
    return this;
  }

  /**
   * Get radioTabsMetadata.
   *
   * @return radioTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getRadioTabsMetadata() {
    return radioTabsMetadata;
  }

  /** setRadioTabsMetadata. */
  public void setRadioTabsMetadata(SettingsMetadata radioTabsMetadata) {
    this.radioTabsMetadata = radioTabsMetadata;
  }

  /**
   * savingCustomTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings savingCustomTabsEnabled(String savingCustomTabsEnabled) {
    this.savingCustomTabsEnabled = savingCustomTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return savingCustomTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getSavingCustomTabsEnabled() {
    return savingCustomTabsEnabled;
  }

  /** setSavingCustomTabsEnabled. */
  public void setSavingCustomTabsEnabled(String savingCustomTabsEnabled) {
    this.savingCustomTabsEnabled = savingCustomTabsEnabled;
  }

  /**
   * savingCustomTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings savingCustomTabsMetadata(SettingsMetadata savingCustomTabsMetadata) {
    this.savingCustomTabsMetadata = savingCustomTabsMetadata;
    return this;
  }

  /**
   * Get savingCustomTabsMetadata.
   *
   * @return savingCustomTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getSavingCustomTabsMetadata() {
    return savingCustomTabsMetadata;
  }

  /** setSavingCustomTabsMetadata. */
  public void setSavingCustomTabsMetadata(SettingsMetadata savingCustomTabsMetadata) {
    this.savingCustomTabsMetadata = savingCustomTabsMetadata;
  }

  /**
   * senderToChangeTabAssignmentsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings senderToChangeTabAssignmentsEnabled(
      String senderToChangeTabAssignmentsEnabled) {
    this.senderToChangeTabAssignmentsEnabled = senderToChangeTabAssignmentsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return senderToChangeTabAssignmentsEnabled
   */
  @ApiModelProperty(value = "")
  public String getSenderToChangeTabAssignmentsEnabled() {
    return senderToChangeTabAssignmentsEnabled;
  }

  /** setSenderToChangeTabAssignmentsEnabled. */
  public void setSenderToChangeTabAssignmentsEnabled(String senderToChangeTabAssignmentsEnabled) {
    this.senderToChangeTabAssignmentsEnabled = senderToChangeTabAssignmentsEnabled;
  }

  /**
   * senderToChangeTabAssignmentsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings senderToChangeTabAssignmentsMetadata(
      SettingsMetadata senderToChangeTabAssignmentsMetadata) {
    this.senderToChangeTabAssignmentsMetadata = senderToChangeTabAssignmentsMetadata;
    return this;
  }

  /**
   * Get senderToChangeTabAssignmentsMetadata.
   *
   * @return senderToChangeTabAssignmentsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getSenderToChangeTabAssignmentsMetadata() {
    return senderToChangeTabAssignmentsMetadata;
  }

  /** setSenderToChangeTabAssignmentsMetadata. */
  public void setSenderToChangeTabAssignmentsMetadata(
      SettingsMetadata senderToChangeTabAssignmentsMetadata) {
    this.senderToChangeTabAssignmentsMetadata = senderToChangeTabAssignmentsMetadata;
  }

  /**
   * sharedCustomTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings sharedCustomTabsEnabled(String sharedCustomTabsEnabled) {
    this.sharedCustomTabsEnabled = sharedCustomTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return sharedCustomTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getSharedCustomTabsEnabled() {
    return sharedCustomTabsEnabled;
  }

  /** setSharedCustomTabsEnabled. */
  public void setSharedCustomTabsEnabled(String sharedCustomTabsEnabled) {
    this.sharedCustomTabsEnabled = sharedCustomTabsEnabled;
  }

  /**
   * sharedCustomTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings sharedCustomTabsMetadata(SettingsMetadata sharedCustomTabsMetadata) {
    this.sharedCustomTabsMetadata = sharedCustomTabsMetadata;
    return this;
  }

  /**
   * Get sharedCustomTabsMetadata.
   *
   * @return sharedCustomTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getSharedCustomTabsMetadata() {
    return sharedCustomTabsMetadata;
  }

  /** setSharedCustomTabsMetadata. */
  public void setSharedCustomTabsMetadata(SettingsMetadata sharedCustomTabsMetadata) {
    this.sharedCustomTabsMetadata = sharedCustomTabsMetadata;
  }

  /**
   * tabDataLabelEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabDataLabelEnabled(String tabDataLabelEnabled) {
    this.tabDataLabelEnabled = tabDataLabelEnabled;
    return this;
  }

  /**
   * .
   *
   * @return tabDataLabelEnabled
   */
  @ApiModelProperty(value = "")
  public String getTabDataLabelEnabled() {
    return tabDataLabelEnabled;
  }

  /** setTabDataLabelEnabled. */
  public void setTabDataLabelEnabled(String tabDataLabelEnabled) {
    this.tabDataLabelEnabled = tabDataLabelEnabled;
  }

  /**
   * tabDataLabelMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabDataLabelMetadata(SettingsMetadata tabDataLabelMetadata) {
    this.tabDataLabelMetadata = tabDataLabelMetadata;
    return this;
  }

  /**
   * Get tabDataLabelMetadata.
   *
   * @return tabDataLabelMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getTabDataLabelMetadata() {
    return tabDataLabelMetadata;
  }

  /** setTabDataLabelMetadata. */
  public void setTabDataLabelMetadata(SettingsMetadata tabDataLabelMetadata) {
    this.tabDataLabelMetadata = tabDataLabelMetadata;
  }

  /**
   * tabLocationEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabLocationEnabled(String tabLocationEnabled) {
    this.tabLocationEnabled = tabLocationEnabled;
    return this;
  }

  /**
   * .
   *
   * @return tabLocationEnabled
   */
  @ApiModelProperty(value = "")
  public String getTabLocationEnabled() {
    return tabLocationEnabled;
  }

  /** setTabLocationEnabled. */
  public void setTabLocationEnabled(String tabLocationEnabled) {
    this.tabLocationEnabled = tabLocationEnabled;
  }

  /**
   * tabLocationMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabLocationMetadata(SettingsMetadata tabLocationMetadata) {
    this.tabLocationMetadata = tabLocationMetadata;
    return this;
  }

  /**
   * Get tabLocationMetadata.
   *
   * @return tabLocationMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getTabLocationMetadata() {
    return tabLocationMetadata;
  }

  /** setTabLocationMetadata. */
  public void setTabLocationMetadata(SettingsMetadata tabLocationMetadata) {
    this.tabLocationMetadata = tabLocationMetadata;
  }

  /**
   * tabLockingEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabLockingEnabled(String tabLockingEnabled) {
    this.tabLockingEnabled = tabLockingEnabled;
    return this;
  }

  /**
   * .
   *
   * @return tabLockingEnabled
   */
  @ApiModelProperty(value = "")
  public String getTabLockingEnabled() {
    return tabLockingEnabled;
  }

  /** setTabLockingEnabled. */
  public void setTabLockingEnabled(String tabLockingEnabled) {
    this.tabLockingEnabled = tabLockingEnabled;
  }

  /**
   * tabLockingMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabLockingMetadata(SettingsMetadata tabLockingMetadata) {
    this.tabLockingMetadata = tabLockingMetadata;
    return this;
  }

  /**
   * Get tabLockingMetadata.
   *
   * @return tabLockingMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getTabLockingMetadata() {
    return tabLockingMetadata;
  }

  /** setTabLockingMetadata. */
  public void setTabLockingMetadata(SettingsMetadata tabLockingMetadata) {
    this.tabLockingMetadata = tabLockingMetadata;
  }

  /**
   * tabScaleEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabScaleEnabled(String tabScaleEnabled) {
    this.tabScaleEnabled = tabScaleEnabled;
    return this;
  }

  /**
   * .
   *
   * @return tabScaleEnabled
   */
  @ApiModelProperty(value = "")
  public String getTabScaleEnabled() {
    return tabScaleEnabled;
  }

  /** setTabScaleEnabled. */
  public void setTabScaleEnabled(String tabScaleEnabled) {
    this.tabScaleEnabled = tabScaleEnabled;
  }

  /**
   * tabScaleMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabScaleMetadata(SettingsMetadata tabScaleMetadata) {
    this.tabScaleMetadata = tabScaleMetadata;
    return this;
  }

  /**
   * Get tabScaleMetadata.
   *
   * @return tabScaleMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getTabScaleMetadata() {
    return tabScaleMetadata;
  }

  /** setTabScaleMetadata. */
  public void setTabScaleMetadata(SettingsMetadata tabScaleMetadata) {
    this.tabScaleMetadata = tabScaleMetadata;
  }

  /**
   * tabTextFormattingEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabTextFormattingEnabled(String tabTextFormattingEnabled) {
    this.tabTextFormattingEnabled = tabTextFormattingEnabled;
    return this;
  }

  /**
   * .
   *
   * @return tabTextFormattingEnabled
   */
  @ApiModelProperty(value = "")
  public String getTabTextFormattingEnabled() {
    return tabTextFormattingEnabled;
  }

  /** setTabTextFormattingEnabled. */
  public void setTabTextFormattingEnabled(String tabTextFormattingEnabled) {
    this.tabTextFormattingEnabled = tabTextFormattingEnabled;
  }

  /**
   * tabTextFormattingMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings tabTextFormattingMetadata(SettingsMetadata tabTextFormattingMetadata) {
    this.tabTextFormattingMetadata = tabTextFormattingMetadata;
    return this;
  }

  /**
   * Get tabTextFormattingMetadata.
   *
   * @return tabTextFormattingMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getTabTextFormattingMetadata() {
    return tabTextFormattingMetadata;
  }

  /** setTabTextFormattingMetadata. */
  public void setTabTextFormattingMetadata(SettingsMetadata tabTextFormattingMetadata) {
    this.tabTextFormattingMetadata = tabTextFormattingMetadata;
  }

  /**
   * textTabsEnabled.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings textTabsEnabled(String textTabsEnabled) {
    this.textTabsEnabled = textTabsEnabled;
    return this;
  }

  /**
   * .
   *
   * @return textTabsEnabled
   */
  @ApiModelProperty(value = "")
  public String getTextTabsEnabled() {
    return textTabsEnabled;
  }

  /** setTextTabsEnabled. */
  public void setTextTabsEnabled(String textTabsEnabled) {
    this.textTabsEnabled = textTabsEnabled;
  }

  /**
   * textTabsMetadata.
   *
   * @return TabAccountSettings
   */
  public TabAccountSettings textTabsMetadata(SettingsMetadata textTabsMetadata) {
    this.textTabsMetadata = textTabsMetadata;
    return this;
  }

  /**
   * Get textTabsMetadata.
   *
   * @return textTabsMetadata
   */
  @ApiModelProperty(value = "")
  public SettingsMetadata getTextTabsMetadata() {
    return textTabsMetadata;
  }

  /** setTextTabsMetadata. */
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
    return Objects.equals(this.allowTabOrder, tabAccountSettings.allowTabOrder)
        && Objects.equals(this.allowTabOrderMetadata, tabAccountSettings.allowTabOrderMetadata)
        && Objects.equals(
            this.approveDeclineTabsEnabled, tabAccountSettings.approveDeclineTabsEnabled)
        && Objects.equals(
            this.approveDeclineTabsMetadata, tabAccountSettings.approveDeclineTabsMetadata)
        && Objects.equals(this.calculatedFieldsEnabled, tabAccountSettings.calculatedFieldsEnabled)
        && Objects.equals(
            this.calculatedFieldsMetadata, tabAccountSettings.calculatedFieldsMetadata)
        && Objects.equals(this.checkboxTabsEnabled, tabAccountSettings.checkboxTabsEnabled)
        && Objects.equals(this.checkBoxTabsMetadata, tabAccountSettings.checkBoxTabsMetadata)
        && Objects.equals(this.currencyTabsEnabled, tabAccountSettings.currencyTabsEnabled)
        && Objects.equals(this.currencyTabsMetadata, tabAccountSettings.currencyTabsMetadata)
        && Objects.equals(this.dataFieldRegexEnabled, tabAccountSettings.dataFieldRegexEnabled)
        && Objects.equals(this.dataFieldRegexMetadata, tabAccountSettings.dataFieldRegexMetadata)
        && Objects.equals(this.dataFieldSizeEnabled, tabAccountSettings.dataFieldSizeEnabled)
        && Objects.equals(this.dataFieldSizeMetadata, tabAccountSettings.dataFieldSizeMetadata)
        && Objects.equals(this.drawTabsEnabled, tabAccountSettings.drawTabsEnabled)
        && Objects.equals(this.drawTabsMetadata, tabAccountSettings.drawTabsMetadata)
        && Objects.equals(
            this.firstLastEmailTabsEnabled, tabAccountSettings.firstLastEmailTabsEnabled)
        && Objects.equals(
            this.firstLastEmailTabsMetadata, tabAccountSettings.firstLastEmailTabsMetadata)
        && Objects.equals(this.listTabsEnabled, tabAccountSettings.listTabsEnabled)
        && Objects.equals(this.listTabsMetadata, tabAccountSettings.listTabsMetadata)
        && Objects.equals(this.noteTabsEnabled, tabAccountSettings.noteTabsEnabled)
        && Objects.equals(this.noteTabsMetadata, tabAccountSettings.noteTabsMetadata)
        && Objects.equals(this.prefillTabsEnabled, tabAccountSettings.prefillTabsEnabled)
        && Objects.equals(this.prefillTabsMetadata, tabAccountSettings.prefillTabsMetadata)
        && Objects.equals(this.radioTabsEnabled, tabAccountSettings.radioTabsEnabled)
        && Objects.equals(this.radioTabsMetadata, tabAccountSettings.radioTabsMetadata)
        && Objects.equals(this.savingCustomTabsEnabled, tabAccountSettings.savingCustomTabsEnabled)
        && Objects.equals(
            this.savingCustomTabsMetadata, tabAccountSettings.savingCustomTabsMetadata)
        && Objects.equals(
            this.senderToChangeTabAssignmentsEnabled,
            tabAccountSettings.senderToChangeTabAssignmentsEnabled)
        && Objects.equals(
            this.senderToChangeTabAssignmentsMetadata,
            tabAccountSettings.senderToChangeTabAssignmentsMetadata)
        && Objects.equals(this.sharedCustomTabsEnabled, tabAccountSettings.sharedCustomTabsEnabled)
        && Objects.equals(
            this.sharedCustomTabsMetadata, tabAccountSettings.sharedCustomTabsMetadata)
        && Objects.equals(this.tabDataLabelEnabled, tabAccountSettings.tabDataLabelEnabled)
        && Objects.equals(this.tabDataLabelMetadata, tabAccountSettings.tabDataLabelMetadata)
        && Objects.equals(this.tabLocationEnabled, tabAccountSettings.tabLocationEnabled)
        && Objects.equals(this.tabLocationMetadata, tabAccountSettings.tabLocationMetadata)
        && Objects.equals(this.tabLockingEnabled, tabAccountSettings.tabLockingEnabled)
        && Objects.equals(this.tabLockingMetadata, tabAccountSettings.tabLockingMetadata)
        && Objects.equals(this.tabScaleEnabled, tabAccountSettings.tabScaleEnabled)
        && Objects.equals(this.tabScaleMetadata, tabAccountSettings.tabScaleMetadata)
        && Objects.equals(
            this.tabTextFormattingEnabled, tabAccountSettings.tabTextFormattingEnabled)
        && Objects.equals(
            this.tabTextFormattingMetadata, tabAccountSettings.tabTextFormattingMetadata)
        && Objects.equals(this.textTabsEnabled, tabAccountSettings.textTabsEnabled)
        && Objects.equals(this.textTabsMetadata, tabAccountSettings.textTabsMetadata);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        allowTabOrder,
        allowTabOrderMetadata,
        approveDeclineTabsEnabled,
        approveDeclineTabsMetadata,
        calculatedFieldsEnabled,
        calculatedFieldsMetadata,
        checkboxTabsEnabled,
        checkBoxTabsMetadata,
        currencyTabsEnabled,
        currencyTabsMetadata,
        dataFieldRegexEnabled,
        dataFieldRegexMetadata,
        dataFieldSizeEnabled,
        dataFieldSizeMetadata,
        drawTabsEnabled,
        drawTabsMetadata,
        firstLastEmailTabsEnabled,
        firstLastEmailTabsMetadata,
        listTabsEnabled,
        listTabsMetadata,
        noteTabsEnabled,
        noteTabsMetadata,
        prefillTabsEnabled,
        prefillTabsMetadata,
        radioTabsEnabled,
        radioTabsMetadata,
        savingCustomTabsEnabled,
        savingCustomTabsMetadata,
        senderToChangeTabAssignmentsEnabled,
        senderToChangeTabAssignmentsMetadata,
        sharedCustomTabsEnabled,
        sharedCustomTabsMetadata,
        tabDataLabelEnabled,
        tabDataLabelMetadata,
        tabLocationEnabled,
        tabLocationMetadata,
        tabLockingEnabled,
        tabLockingMetadata,
        tabScaleEnabled,
        tabScaleMetadata,
        tabTextFormattingEnabled,
        tabTextFormattingMetadata,
        textTabsEnabled,
        textTabsMetadata);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabAccountSettings {\n");

    sb.append("    allowTabOrder: ").append(toIndentedString(allowTabOrder)).append("\n");
    sb.append("    allowTabOrderMetadata: ")
        .append(toIndentedString(allowTabOrderMetadata))
        .append("\n");
    sb.append("    approveDeclineTabsEnabled: ")
        .append(toIndentedString(approveDeclineTabsEnabled))
        .append("\n");
    sb.append("    approveDeclineTabsMetadata: ")
        .append(toIndentedString(approveDeclineTabsMetadata))
        .append("\n");
    sb.append("    calculatedFieldsEnabled: ")
        .append(toIndentedString(calculatedFieldsEnabled))
        .append("\n");
    sb.append("    calculatedFieldsMetadata: ")
        .append(toIndentedString(calculatedFieldsMetadata))
        .append("\n");
    sb.append("    checkboxTabsEnabled: ")
        .append(toIndentedString(checkboxTabsEnabled))
        .append("\n");
    sb.append("    checkBoxTabsMetadata: ")
        .append(toIndentedString(checkBoxTabsMetadata))
        .append("\n");
    sb.append("    currencyTabsEnabled: ")
        .append(toIndentedString(currencyTabsEnabled))
        .append("\n");
    sb.append("    currencyTabsMetadata: ")
        .append(toIndentedString(currencyTabsMetadata))
        .append("\n");
    sb.append("    dataFieldRegexEnabled: ")
        .append(toIndentedString(dataFieldRegexEnabled))
        .append("\n");
    sb.append("    dataFieldRegexMetadata: ")
        .append(toIndentedString(dataFieldRegexMetadata))
        .append("\n");
    sb.append("    dataFieldSizeEnabled: ")
        .append(toIndentedString(dataFieldSizeEnabled))
        .append("\n");
    sb.append("    dataFieldSizeMetadata: ")
        .append(toIndentedString(dataFieldSizeMetadata))
        .append("\n");
    sb.append("    drawTabsEnabled: ").append(toIndentedString(drawTabsEnabled)).append("\n");
    sb.append("    drawTabsMetadata: ").append(toIndentedString(drawTabsMetadata)).append("\n");
    sb.append("    firstLastEmailTabsEnabled: ")
        .append(toIndentedString(firstLastEmailTabsEnabled))
        .append("\n");
    sb.append("    firstLastEmailTabsMetadata: ")
        .append(toIndentedString(firstLastEmailTabsMetadata))
        .append("\n");
    sb.append("    listTabsEnabled: ").append(toIndentedString(listTabsEnabled)).append("\n");
    sb.append("    listTabsMetadata: ").append(toIndentedString(listTabsMetadata)).append("\n");
    sb.append("    noteTabsEnabled: ").append(toIndentedString(noteTabsEnabled)).append("\n");
    sb.append("    noteTabsMetadata: ").append(toIndentedString(noteTabsMetadata)).append("\n");
    sb.append("    prefillTabsEnabled: ").append(toIndentedString(prefillTabsEnabled)).append("\n");
    sb.append("    prefillTabsMetadata: ")
        .append(toIndentedString(prefillTabsMetadata))
        .append("\n");
    sb.append("    radioTabsEnabled: ").append(toIndentedString(radioTabsEnabled)).append("\n");
    sb.append("    radioTabsMetadata: ").append(toIndentedString(radioTabsMetadata)).append("\n");
    sb.append("    savingCustomTabsEnabled: ")
        .append(toIndentedString(savingCustomTabsEnabled))
        .append("\n");
    sb.append("    savingCustomTabsMetadata: ")
        .append(toIndentedString(savingCustomTabsMetadata))
        .append("\n");
    sb.append("    senderToChangeTabAssignmentsEnabled: ")
        .append(toIndentedString(senderToChangeTabAssignmentsEnabled))
        .append("\n");
    sb.append("    senderToChangeTabAssignmentsMetadata: ")
        .append(toIndentedString(senderToChangeTabAssignmentsMetadata))
        .append("\n");
    sb.append("    sharedCustomTabsEnabled: ")
        .append(toIndentedString(sharedCustomTabsEnabled))
        .append("\n");
    sb.append("    sharedCustomTabsMetadata: ")
        .append(toIndentedString(sharedCustomTabsMetadata))
        .append("\n");
    sb.append("    tabDataLabelEnabled: ")
        .append(toIndentedString(tabDataLabelEnabled))
        .append("\n");
    sb.append("    tabDataLabelMetadata: ")
        .append(toIndentedString(tabDataLabelMetadata))
        .append("\n");
    sb.append("    tabLocationEnabled: ").append(toIndentedString(tabLocationEnabled)).append("\n");
    sb.append("    tabLocationMetadata: ")
        .append(toIndentedString(tabLocationMetadata))
        .append("\n");
    sb.append("    tabLockingEnabled: ").append(toIndentedString(tabLockingEnabled)).append("\n");
    sb.append("    tabLockingMetadata: ").append(toIndentedString(tabLockingMetadata)).append("\n");
    sb.append("    tabScaleEnabled: ").append(toIndentedString(tabScaleEnabled)).append("\n");
    sb.append("    tabScaleMetadata: ").append(toIndentedString(tabScaleMetadata)).append("\n");
    sb.append("    tabTextFormattingEnabled: ")
        .append(toIndentedString(tabTextFormattingEnabled))
        .append("\n");
    sb.append("    tabTextFormattingMetadata: ")
        .append(toIndentedString(tabTextFormattingMetadata))
        .append("\n");
    sb.append("    textTabsEnabled: ").append(toIndentedString(textTabsEnabled)).append("\n");
    sb.append("    textTabsMetadata: ").append(toIndentedString(textTabsMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
