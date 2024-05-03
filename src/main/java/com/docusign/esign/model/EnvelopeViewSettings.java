package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeViewDocumentSettings;
import com.docusign.esign.model.EnvelopeViewEnvelopeCustomFieldSettings;
import com.docusign.esign.model.EnvelopeViewRecipientSettings;
import com.docusign.esign.model.EnvelopeViewTaggerSettings;
import com.docusign.esign.model.EnvelopeViewTemplateSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeViewSettings.
 *
 */

public class EnvelopeViewSettings {
  @JsonProperty("backButtonAction")
  private String backButtonAction = null;

  @JsonProperty("documentSettings")
  private EnvelopeViewDocumentSettings documentSettings = null;

  @JsonProperty("envelopeCustomFieldSettings")
  private EnvelopeViewEnvelopeCustomFieldSettings envelopeCustomFieldSettings = null;

  @JsonProperty("lockToken")
  private String lockToken = null;

  @JsonProperty("recipientSettings")
  private EnvelopeViewRecipientSettings recipientSettings = null;

  @JsonProperty("sendButtonAction")
  private String sendButtonAction = null;

  @JsonProperty("showAdvancedOptions")
  private String showAdvancedOptions = null;

  @JsonProperty("showBackButton")
  private String showBackButton = null;

  @JsonProperty("showDiscardAction")
  private String showDiscardAction = null;

  @JsonProperty("showHeaderActions")
  private String showHeaderActions = null;

  @JsonProperty("startingScreen")
  private String startingScreen = null;

  @JsonProperty("taggerSettings")
  private EnvelopeViewTaggerSettings taggerSettings = null;

  @JsonProperty("templateSettings")
  private EnvelopeViewTemplateSettings templateSettings = null;


  /**
   * backButtonAction.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings backButtonAction(String backButtonAction) {
    this.backButtonAction = backButtonAction;
    return this;
  }

  /**
   * .
   * @return backButtonAction
   **/
  @Schema(description = "")
  public String getBackButtonAction() {
    return backButtonAction;
  }

  /**
   * setBackButtonAction.
   **/
  public void setBackButtonAction(String backButtonAction) {
    this.backButtonAction = backButtonAction;
  }


  /**
   * documentSettings.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings documentSettings(EnvelopeViewDocumentSettings documentSettings) {
    this.documentSettings = documentSettings;
    return this;
  }

  /**
   * .
   * @return documentSettings
   **/
  @Schema(description = "")
  public EnvelopeViewDocumentSettings getDocumentSettings() {
    return documentSettings;
  }

  /**
   * setDocumentSettings.
   **/
  public void setDocumentSettings(EnvelopeViewDocumentSettings documentSettings) {
    this.documentSettings = documentSettings;
  }


  /**
   * envelopeCustomFieldSettings.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings envelopeCustomFieldSettings(EnvelopeViewEnvelopeCustomFieldSettings envelopeCustomFieldSettings) {
    this.envelopeCustomFieldSettings = envelopeCustomFieldSettings;
    return this;
  }

  /**
   * .
   * @return envelopeCustomFieldSettings
   **/
  @Schema(description = "")
  public EnvelopeViewEnvelopeCustomFieldSettings getEnvelopeCustomFieldSettings() {
    return envelopeCustomFieldSettings;
  }

  /**
   * setEnvelopeCustomFieldSettings.
   **/
  public void setEnvelopeCustomFieldSettings(EnvelopeViewEnvelopeCustomFieldSettings envelopeCustomFieldSettings) {
    this.envelopeCustomFieldSettings = envelopeCustomFieldSettings;
  }


  /**
   * lockToken.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings lockToken(String lockToken) {
    this.lockToken = lockToken;
    return this;
  }

  /**
   * .
   * @return lockToken
   **/
  @Schema(description = "")
  public String getLockToken() {
    return lockToken;
  }

  /**
   * setLockToken.
   **/
  public void setLockToken(String lockToken) {
    this.lockToken = lockToken;
  }


  /**
   * recipientSettings.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings recipientSettings(EnvelopeViewRecipientSettings recipientSettings) {
    this.recipientSettings = recipientSettings;
    return this;
  }

  /**
   * .
   * @return recipientSettings
   **/
  @Schema(description = "")
  public EnvelopeViewRecipientSettings getRecipientSettings() {
    return recipientSettings;
  }

  /**
   * setRecipientSettings.
   **/
  public void setRecipientSettings(EnvelopeViewRecipientSettings recipientSettings) {
    this.recipientSettings = recipientSettings;
  }


  /**
   * sendButtonAction.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings sendButtonAction(String sendButtonAction) {
    this.sendButtonAction = sendButtonAction;
    return this;
  }

  /**
   * .
   * @return sendButtonAction
   **/
  @Schema(description = "")
  public String getSendButtonAction() {
    return sendButtonAction;
  }

  /**
   * setSendButtonAction.
   **/
  public void setSendButtonAction(String sendButtonAction) {
    this.sendButtonAction = sendButtonAction;
  }


  /**
   * showAdvancedOptions.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings showAdvancedOptions(String showAdvancedOptions) {
    this.showAdvancedOptions = showAdvancedOptions;
    return this;
  }

  /**
   * .
   * @return showAdvancedOptions
   **/
  @Schema(description = "")
  public String getShowAdvancedOptions() {
    return showAdvancedOptions;
  }

  /**
   * setShowAdvancedOptions.
   **/
  public void setShowAdvancedOptions(String showAdvancedOptions) {
    this.showAdvancedOptions = showAdvancedOptions;
  }


  /**
   * showBackButton.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings showBackButton(String showBackButton) {
    this.showBackButton = showBackButton;
    return this;
  }

  /**
   * .
   * @return showBackButton
   **/
  @Schema(description = "")
  public String getShowBackButton() {
    return showBackButton;
  }

  /**
   * setShowBackButton.
   **/
  public void setShowBackButton(String showBackButton) {
    this.showBackButton = showBackButton;
  }


  /**
   * showDiscardAction.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings showDiscardAction(String showDiscardAction) {
    this.showDiscardAction = showDiscardAction;
    return this;
  }

  /**
   * .
   * @return showDiscardAction
   **/
  @Schema(description = "")
  public String getShowDiscardAction() {
    return showDiscardAction;
  }

  /**
   * setShowDiscardAction.
   **/
  public void setShowDiscardAction(String showDiscardAction) {
    this.showDiscardAction = showDiscardAction;
  }


  /**
   * showHeaderActions.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings showHeaderActions(String showHeaderActions) {
    this.showHeaderActions = showHeaderActions;
    return this;
  }

  /**
   * .
   * @return showHeaderActions
   **/
  @Schema(description = "")
  public String getShowHeaderActions() {
    return showHeaderActions;
  }

  /**
   * setShowHeaderActions.
   **/
  public void setShowHeaderActions(String showHeaderActions) {
    this.showHeaderActions = showHeaderActions;
  }


  /**
   * startingScreen.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings startingScreen(String startingScreen) {
    this.startingScreen = startingScreen;
    return this;
  }

  /**
   * .
   * @return startingScreen
   **/
  @Schema(description = "")
  public String getStartingScreen() {
    return startingScreen;
  }

  /**
   * setStartingScreen.
   **/
  public void setStartingScreen(String startingScreen) {
    this.startingScreen = startingScreen;
  }


  /**
   * taggerSettings.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings taggerSettings(EnvelopeViewTaggerSettings taggerSettings) {
    this.taggerSettings = taggerSettings;
    return this;
  }

  /**
   * .
   * @return taggerSettings
   **/
  @Schema(description = "")
  public EnvelopeViewTaggerSettings getTaggerSettings() {
    return taggerSettings;
  }

  /**
   * setTaggerSettings.
   **/
  public void setTaggerSettings(EnvelopeViewTaggerSettings taggerSettings) {
    this.taggerSettings = taggerSettings;
  }


  /**
   * templateSettings.
   *
   * @return EnvelopeViewSettings
   **/
  public EnvelopeViewSettings templateSettings(EnvelopeViewTemplateSettings templateSettings) {
    this.templateSettings = templateSettings;
    return this;
  }

  /**
   * .
   * @return templateSettings
   **/
  @Schema(description = "")
  public EnvelopeViewTemplateSettings getTemplateSettings() {
    return templateSettings;
  }

  /**
   * setTemplateSettings.
   **/
  public void setTemplateSettings(EnvelopeViewTemplateSettings templateSettings) {
    this.templateSettings = templateSettings;
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
    EnvelopeViewSettings envelopeViewSettings = (EnvelopeViewSettings) o;
    return Objects.equals(this.backButtonAction, envelopeViewSettings.backButtonAction) &&
        Objects.equals(this.documentSettings, envelopeViewSettings.documentSettings) &&
        Objects.equals(this.envelopeCustomFieldSettings, envelopeViewSettings.envelopeCustomFieldSettings) &&
        Objects.equals(this.lockToken, envelopeViewSettings.lockToken) &&
        Objects.equals(this.recipientSettings, envelopeViewSettings.recipientSettings) &&
        Objects.equals(this.sendButtonAction, envelopeViewSettings.sendButtonAction) &&
        Objects.equals(this.showAdvancedOptions, envelopeViewSettings.showAdvancedOptions) &&
        Objects.equals(this.showBackButton, envelopeViewSettings.showBackButton) &&
        Objects.equals(this.showDiscardAction, envelopeViewSettings.showDiscardAction) &&
        Objects.equals(this.showHeaderActions, envelopeViewSettings.showHeaderActions) &&
        Objects.equals(this.startingScreen, envelopeViewSettings.startingScreen) &&
        Objects.equals(this.taggerSettings, envelopeViewSettings.taggerSettings) &&
        Objects.equals(this.templateSettings, envelopeViewSettings.templateSettings);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(backButtonAction, documentSettings, envelopeCustomFieldSettings, lockToken, recipientSettings, sendButtonAction, showAdvancedOptions, showBackButton, showDiscardAction, showHeaderActions, startingScreen, taggerSettings, templateSettings);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewSettings {\n");
    
    sb.append("    backButtonAction: ").append(toIndentedString(backButtonAction)).append("\n");
    sb.append("    documentSettings: ").append(toIndentedString(documentSettings)).append("\n");
    sb.append("    envelopeCustomFieldSettings: ").append(toIndentedString(envelopeCustomFieldSettings)).append("\n");
    sb.append("    lockToken: ").append(toIndentedString(lockToken)).append("\n");
    sb.append("    recipientSettings: ").append(toIndentedString(recipientSettings)).append("\n");
    sb.append("    sendButtonAction: ").append(toIndentedString(sendButtonAction)).append("\n");
    sb.append("    showAdvancedOptions: ").append(toIndentedString(showAdvancedOptions)).append("\n");
    sb.append("    showBackButton: ").append(toIndentedString(showBackButton)).append("\n");
    sb.append("    showDiscardAction: ").append(toIndentedString(showDiscardAction)).append("\n");
    sb.append("    showHeaderActions: ").append(toIndentedString(showHeaderActions)).append("\n");
    sb.append("    startingScreen: ").append(toIndentedString(startingScreen)).append("\n");
    sb.append("    taggerSettings: ").append(toIndentedString(taggerSettings)).append("\n");
    sb.append("    templateSettings: ").append(toIndentedString(templateSettings)).append("\n");
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

