package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class LockRequest   {
  
  private String lockedByApp = null;
  private String lockDurationInSeconds = null;
  private String lockType = null;
  private String useScratchPad = null;
  private String templatePassword = null;

  
  /**
   * A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.
   **/
  public LockRequest lockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.")
  @JsonProperty("lockedByApp")
  public String getLockedByApp() {
    return lockedByApp;
  }
  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }

  
  /**
   * The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.
   **/
  public LockRequest lockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.")
  @JsonProperty("lockDurationInSeconds")
  public String getLockDurationInSeconds() {
    return lockDurationInSeconds;
  }
  public void setLockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
  }

  
  /**
   * The type of envelope lock.  Currently \"edit\" is the only supported type.
   **/
  public LockRequest lockType(String lockType) {
    this.lockType = lockType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of envelope lock.  Currently \"edit\" is the only supported type.")
  @JsonProperty("lockType")
  public String getLockType() {
    return lockType;
  }
  public void setLockType(String lockType) {
    this.lockType = lockType;
  }

  
  /**
   * Reserved for future use.\n\nIndicates whether a scratchpad is used for editing information.\n 
   **/
  public LockRequest useScratchPad(String useScratchPad) {
    this.useScratchPad = useScratchPad;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved for future use.\n\nIndicates whether a scratchpad is used for editing information.\n ")
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
  public LockRequest templatePassword(String templatePassword) {
    this.templatePassword = templatePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.lockedByApp, lockRequest.lockedByApp) &&
        Objects.equals(this.lockDurationInSeconds, lockRequest.lockDurationInSeconds) &&
        Objects.equals(this.lockType, lockRequest.lockType) &&
        Objects.equals(this.useScratchPad, lockRequest.useScratchPad) &&
        Objects.equals(this.templatePassword, lockRequest.templatePassword);
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

