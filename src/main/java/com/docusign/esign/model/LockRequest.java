package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class LockRequest   {
  
  private String lockedByApp = null;
  private String lockDurationInSeconds = null;
  private String lockType = null;
  private String useScratchPad = null;
  private String templatePassword = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lockedByApp")
  public String getLockedByApp() {
    return lockedByApp;
  }
  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lockDurationInSeconds")
  public String getLockDurationInSeconds() {
    return lockDurationInSeconds;
  }
  public void setLockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lockType")
  public String getLockType() {
    return lockType;
  }
  public void setLockType(String lockType) {
    this.lockType = lockType;
  }

  
  /**
   * Reserved for future use.\n\nIndicates whether a scratchpad is used for editing information.
   **/
  
  @ApiModelProperty(value = "Reserved for future use.\n\nIndicates whether a scratchpad is used for editing information.")
  @JsonProperty("useScratchPad")
  public String getUseScratchPad() {
    return useScratchPad;
  }
  public void setUseScratchPad(String useScratchPad) {
    this.useScratchPad = useScratchPad;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templatePassword")
  public String getTemplatePassword() {
    return templatePassword;
  }
  public void setTemplatePassword(String templatePassword) {
    this.templatePassword = templatePassword;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockRequest lockRequest = (LockRequest) o;

    return true && Objects.equals(lockedByApp, lockRequest.lockedByApp) &&
        Objects.equals(lockDurationInSeconds, lockRequest.lockDurationInSeconds) &&
        Objects.equals(lockType, lockRequest.lockType) &&
        Objects.equals(useScratchPad, lockRequest.useScratchPad) &&
        Objects.equals(templatePassword, lockRequest.templatePassword)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockedByApp, lockDurationInSeconds, lockType, useScratchPad, templatePassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRequest {\n");
    
    sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
    sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
    sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
    sb.append("    useScratchPad: ").append(toIndentedString(useScratchPad)).append("\n");
    sb.append("    templatePassword: ").append(toIndentedString(templatePassword)).append("\n");
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

