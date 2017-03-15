package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ENoteConfiguration   {
  
  private String connectConfigured = null;
  private String eNoteConfigured = null;
  private String organization = null;
  private String password = null;
  private String userName = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectConfigured")
  public String getConnectConfigured() {
    return connectConfigured;
  }
  public void setConnectConfigured(String connectConfigured) {
    this.connectConfigured = connectConfigured;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eNoteConfigured")
  public String getENoteConfigured() {
    return eNoteConfigured;
  }
  public void setENoteConfigured(String eNoteConfigured) {
    this.eNoteConfigured = eNoteConfigured;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
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

    return true && Objects.equals(connectConfigured, eNoteConfiguration.connectConfigured) &&
        Objects.equals(eNoteConfigured, eNoteConfiguration.eNoteConfigured) &&
        Objects.equals(organization, eNoteConfiguration.organization) &&
        Objects.equals(password, eNoteConfiguration.password) &&
        Objects.equals(userName, eNoteConfiguration.userName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectConfigured, eNoteConfigured, organization, password, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ENoteConfiguration {\n");
    
    if (connectConfigured != null)
      sb.append("    connectConfigured: ").append(toIndentedString(connectConfigured)).append("\n");
    if (eNoteConfigured != null)
      sb.append("    eNoteConfigured: ").append(toIndentedString(eNoteConfigured)).append("\n");
    if (organization != null)
      sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    if (password != null)
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
    if (userName != null)
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

