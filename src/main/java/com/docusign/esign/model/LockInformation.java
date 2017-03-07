package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class LockInformation   {
  
  private ErrorDetails errorDetails = null;
  private String lockDurationInSeconds = null;
  private String lockedByApp = null;
  private UserInfo lockedByUser = null;
  private String lockedUntilDateTime = null;
  private String lockToken = null;
  private String lockType = null;
  private String useScratchPad = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * Sets the time, in seconds, until the lock expires when there is no activity on the envelope.\n\nIf no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.\n\nThe lock duration can be extended.
   **/
  
  @ApiModelProperty(value = "Sets the time, in seconds, until the lock expires when there is no activity on the envelope.\n\nIf no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.\n\nThe lock duration can be extended.")
  @JsonProperty("lockDurationInSeconds")
  public String getLockDurationInSeconds() {
    return lockDurationInSeconds;
  }
  public void setLockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
  }

  
  /**
   * Specifies the friendly name of  the application that is locking the envelope.
   **/
  
  @ApiModelProperty(value = "Specifies the friendly name of  the application that is locking the envelope.")
  @JsonProperty("lockedByApp")
  public String getLockedByApp() {
    return lockedByApp;
  }
  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lockedByUser")
  public UserInfo getLockedByUser() {
    return lockedByUser;
  }
  public void setLockedByUser(UserInfo lockedByUser) {
    this.lockedByUser = lockedByUser;
  }

  
  /**
   * The datetime until the envelope lock expires.
   **/
  
  @ApiModelProperty(value = "The datetime until the envelope lock expires.")
  @JsonProperty("lockedUntilDateTime")
  public String getLockedUntilDateTime() {
    return lockedUntilDateTime;
  }
  public void setLockedUntilDateTime(String lockedUntilDateTime) {
    this.lockedUntilDateTime = lockedUntilDateTime;
  }

  
  /**
   * A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.
   **/
  
  @ApiModelProperty(value = "A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.")
  @JsonProperty("lockToken")
  public String getLockToken() {
    return lockToken;
  }
  public void setLockToken(String lockToken) {
    this.lockToken = lockToken;
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
    LockInformation lockInformation = (LockInformation) o;

    return true && Objects.equals(errorDetails, lockInformation.errorDetails) &&
        Objects.equals(lockDurationInSeconds, lockInformation.lockDurationInSeconds) &&
        Objects.equals(lockedByApp, lockInformation.lockedByApp) &&
        Objects.equals(lockedByUser, lockInformation.lockedByUser) &&
        Objects.equals(lockedUntilDateTime, lockInformation.lockedUntilDateTime) &&
        Objects.equals(lockToken, lockInformation.lockToken) &&
        Objects.equals(lockType, lockInformation.lockType) &&
        Objects.equals(useScratchPad, lockInformation.useScratchPad)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, lockDurationInSeconds, lockedByApp, lockedByUser, lockedUntilDateTime, lockToken, lockType, useScratchPad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockInformation {\n");
    
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (lockDurationInSeconds != null)
      sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
    if (lockedByApp != null)
      sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
    if (lockedByUser != null)
      sb.append("    lockedByUser: ").append(toIndentedString(lockedByUser)).append("\n");
    if (lockedUntilDateTime != null)
      sb.append("    lockedUntilDateTime: ").append(toIndentedString(lockedUntilDateTime)).append("\n");
    if (lockToken != null)
      sb.append("    lockToken: ").append(toIndentedString(lockToken)).append("\n");
    if (lockType != null)
      sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
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

