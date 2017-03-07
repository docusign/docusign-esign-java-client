package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class LockRequest   {
  
  private String lockDurationInSeconds = null;
  private String lockedByApp = null;
  private String lockType = null;
  private String templatePassword = null;
  private String useScratchPad = null;

  
  /**
   * The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.
   **/
  
  @ApiModelProperty(value = "The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.")
  @JsonProperty("lockDurationInSeconds")
  public String getLockDurationInSeconds() {
    return lockDurationInSeconds;
  }
  public void setLockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
  }

  
  /**
   * A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.
   **/
  
  @ApiModelProperty(value = "A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.")
  @JsonProperty("lockedByApp")
  public String getLockedByApp() {
    return lockedByApp;
  }
  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }

  
  /**
   * The type of envelope lock.  Currently \"edit\" is the only supported type.
   **/
  
  @ApiModelProperty(value = "The type of envelope lock.  Currently \"edit\" is the only supported type.")
  @JsonProperty("lockType")
  public String getLockType() {
    return lockType;
  }
  public void setLockType(String lockType) {
    this.lockType = lockType;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockRequest lockRequest = (LockRequest) o;

    return true && Objects.equals(lockDurationInSeconds, lockRequest.lockDurationInSeconds) &&
        Objects.equals(lockedByApp, lockRequest.lockedByApp) &&
        Objects.equals(lockType, lockRequest.lockType) &&
        Objects.equals(templatePassword, lockRequest.templatePassword) &&
        Objects.equals(useScratchPad, lockRequest.useScratchPad)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockDurationInSeconds, lockedByApp, lockType, templatePassword, useScratchPad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRequest {\n");
    
    if (lockDurationInSeconds != null)
      sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
    if (lockedByApp != null)
      sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
    if (lockType != null)
      sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
    if (templatePassword != null)
      sb.append("    templatePassword: ").append(toIndentedString(templatePassword)).append("\n");
    if (useScratchPad != null)
      sb.append("    useScratchPad: ").append(toIndentedString(useScratchPad)).append("\n");
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

