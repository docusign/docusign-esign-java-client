package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ENoteConfiguration
 */

public class ENoteConfiguration {
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

  public ENoteConfiguration connectConfigured(String connectConfigured) {
    this.connectConfigured = connectConfigured;
    return this;
  }

   /**
   * 
   * @return connectConfigured
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectConfigured() {
    return connectConfigured;
  }

  public void setConnectConfigured(String connectConfigured) {
    this.connectConfigured = connectConfigured;
  }

  public ENoteConfiguration eNoteConfigured(String eNoteConfigured) {
    this.eNoteConfigured = eNoteConfigured;
    return this;
  }

   /**
   * 
   * @return eNoteConfigured
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getENoteConfigured() {
    return eNoteConfigured;
  }

  public void setENoteConfigured(String eNoteConfigured) {
    this.eNoteConfigured = eNoteConfigured;
  }

  public ENoteConfiguration organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * 
   * @return organization
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ENoteConfiguration password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ENoteConfiguration userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ENoteConfiguration eNoteConfiguration = (ENoteConfiguration) o;
    return Objects.equals(this.connectConfigured, eNoteConfiguration.connectConfigured) &&
        Objects.equals(this.eNoteConfigured, eNoteConfiguration.eNoteConfigured) &&
        Objects.equals(this.organization, eNoteConfiguration.organization) &&
        Objects.equals(this.password, eNoteConfiguration.password) &&
        Objects.equals(this.userName, eNoteConfiguration.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectConfigured, eNoteConfigured, organization, password, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ENoteConfiguration {\n");
    
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

