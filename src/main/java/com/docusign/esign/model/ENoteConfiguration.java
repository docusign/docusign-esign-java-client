package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * This object contains information used to configure [eNote](https://www.docusign.com/products/enote) functionality. To use eNote, the Allow eNote for eOriginal account plan item must be on, and the Connect configuration for eOriginal must be set correctly..
 *
 */
@Schema(description = "This object contains information used to configure [eNote](https://www.docusign.com/products/enote) functionality. To use eNote, the Allow eNote for eOriginal account plan item must be on, and the Connect configuration for eOriginal must be set correctly.")

public class ENoteConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiKey")
  private String apiKey = null;

  @JsonProperty("connectConfigured")
  private String connectConfigured = null;

  @JsonProperty("eNoteConfigured")
  private String eNoteConfigured = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("userName")
  private String userName = null;


  /**
   * apiKey.
   *
   * @return ENoteConfiguration
   **/
  public ENoteConfiguration apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * .
   * @return apiKey
   **/
  @Schema(description = "")
  public String getApiKey() {
    return apiKey;
  }

  /**
   * setApiKey.
   **/
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  /**
   * connectConfigured.
   *
   * @return ENoteConfiguration
   **/
  public ENoteConfiguration connectConfigured(String connectConfigured) {
    this.connectConfigured = connectConfigured;
    return this;
  }

  /**
   * .
   * @return connectConfigured
   **/
  @Schema(description = "")
  public String getConnectConfigured() {
    return connectConfigured;
  }

  /**
   * setConnectConfigured.
   **/
  public void setConnectConfigured(String connectConfigured) {
    this.connectConfigured = connectConfigured;
  }


  /**
   * eNoteConfigured.
   *
   * @return ENoteConfiguration
   **/
  public ENoteConfiguration eNoteConfigured(String eNoteConfigured) {
    this.eNoteConfigured = eNoteConfigured;
    return this;
  }

  /**
   * .
   * @return eNoteConfigured
   **/
  @Schema(description = "")
  public String getENoteConfigured() {
    return eNoteConfigured;
  }

  /**
   * setENoteConfigured.
   **/
  public void setENoteConfigured(String eNoteConfigured) {
    this.eNoteConfigured = eNoteConfigured;
  }


  /**
   * organization.
   *
   * @return ENoteConfiguration
   **/
  public ENoteConfiguration organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * .
   * @return organization
   **/
  @Schema(description = "")
  public String getOrganization() {
    return organization;
  }

  /**
   * setOrganization.
   **/
  public void setOrganization(String organization) {
    this.organization = organization;
  }


  /**
   * password.
   *
   * @return ENoteConfiguration
   **/
  public ENoteConfiguration password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * userName.
   *
   * @return ENoteConfiguration
   **/
  public ENoteConfiguration userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * .
   * @return userName
   **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
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
    ENoteConfiguration eNoteConfiguration = (ENoteConfiguration) o;
    return Objects.equals(this.apiKey, eNoteConfiguration.apiKey) &&
        Objects.equals(this.connectConfigured, eNoteConfiguration.connectConfigured) &&
        Objects.equals(this.eNoteConfigured, eNoteConfiguration.eNoteConfigured) &&
        Objects.equals(this.organization, eNoteConfiguration.organization) &&
        Objects.equals(this.password, eNoteConfiguration.password) &&
        Objects.equals(this.userName, eNoteConfiguration.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(apiKey, connectConfigured, eNoteConfigured, organization, password, userName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ENoteConfiguration {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    connectConfigured: ").append(toIndentedString(connectConfigured)).append("\n");
    sb.append("    eNoteConfigured: ").append(toIndentedString(eNoteConfigured)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

