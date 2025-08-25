package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeViewDocumentSettings;
import com.docusign.esign.model.EnvelopeViewEnvelopeCustomFieldSettings;
import com.docusign.esign.model.EnvelopeViewTaggerSettings;
import com.docusign.esign.model.TemplateViewRecipientSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * TemplateViewSettings.
 *
 */

public class TemplateViewSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("backButtonAction")
  private String backButtonAction = null;

  @JsonProperty("documentSettings")
  private EnvelopeViewDocumentSettings documentSettings = null;

  @JsonProperty("envelopeCustomFieldSettings")
  private EnvelopeViewEnvelopeCustomFieldSettings envelopeCustomFieldSettings = null;

  @JsonProperty("lockToken")
  private String lockToken = null;

  @JsonProperty("recipientSettings")
  private TemplateViewRecipientSettings recipientSettings = null;

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


  /**
   * backButtonAction.
   *
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings backButtonAction(String backButtonAction) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings documentSettings(EnvelopeViewDocumentSettings documentSettings) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings envelopeCustomFieldSettings(EnvelopeViewEnvelopeCustomFieldSettings envelopeCustomFieldSettings) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings lockToken(String lockToken) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings recipientSettings(TemplateViewRecipientSettings recipientSettings) {
    this.recipientSettings = recipientSettings;
    return this;
  }

  /**
   * .
   * @return recipientSettings
   **/
  @Schema(description = "")
  public TemplateViewRecipientSettings getRecipientSettings() {
    return recipientSettings;
  }

  /**
   * setRecipientSettings.
   **/
  public void setRecipientSettings(TemplateViewRecipientSettings recipientSettings) {
    this.recipientSettings = recipientSettings;
  }


  /**
   * showAdvancedOptions.
   *
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings showAdvancedOptions(String showAdvancedOptions) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings showBackButton(String showBackButton) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings showDiscardAction(String showDiscardAction) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings showHeaderActions(String showHeaderActions) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings startingScreen(String startingScreen) {
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
   * @return TemplateViewSettings
   **/
  public TemplateViewSettings taggerSettings(EnvelopeViewTaggerSettings taggerSettings) {
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
    TemplateViewSettings templateViewSettings = (TemplateViewSettings) o;
    return Objects.equals(this.backButtonAction, templateViewSettings.backButtonAction) &&
        Objects.equals(this.documentSettings, templateViewSettings.documentSettings) &&
        Objects.equals(this.envelopeCustomFieldSettings, templateViewSettings.envelopeCustomFieldSettings) &&
        Objects.equals(this.lockToken, templateViewSettings.lockToken) &&
        Objects.equals(this.recipientSettings, templateViewSettings.recipientSettings) &&
        Objects.equals(this.showAdvancedOptions, templateViewSettings.showAdvancedOptions) &&
        Objects.equals(this.showBackButton, templateViewSettings.showBackButton) &&
        Objects.equals(this.showDiscardAction, templateViewSettings.showDiscardAction) &&
        Objects.equals(this.showHeaderActions, templateViewSettings.showHeaderActions) &&
        Objects.equals(this.startingScreen, templateViewSettings.startingScreen) &&
        Objects.equals(this.taggerSettings, templateViewSettings.taggerSettings);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(backButtonAction, documentSettings, envelopeCustomFieldSettings, lockToken, recipientSettings, showAdvancedOptions, showBackButton, showDiscardAction, showHeaderActions, startingScreen, taggerSettings);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateViewSettings {\n");
    
    sb.append("    backButtonAction: ").append(toIndentedString(backButtonAction)).append("\n");
    sb.append("    documentSettings: ").append(toIndentedString(documentSettings)).append("\n");
    sb.append("    envelopeCustomFieldSettings: ").append(toIndentedString(envelopeCustomFieldSettings)).append("\n");
    sb.append("    lockToken: ").append(toIndentedString(lockToken)).append("\n");
    sb.append("    recipientSettings: ").append(toIndentedString(recipientSettings)).append("\n");
    sb.append("    showAdvancedOptions: ").append(toIndentedString(showAdvancedOptions)).append("\n");
    sb.append("    showBackButton: ").append(toIndentedString(showBackButton)).append("\n");
    sb.append("    showDiscardAction: ").append(toIndentedString(showDiscardAction)).append("\n");
    sb.append("    showHeaderActions: ").append(toIndentedString(showHeaderActions)).append("\n");
    sb.append("    startingScreen: ").append(toIndentedString(startingScreen)).append("\n");
    sb.append("    taggerSettings: ").append(toIndentedString(taggerSettings)).append("\n");
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

