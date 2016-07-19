package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class LockInformation   {
  
  private UserInfo lockedByUser = null;
  private String lockedByApp = null;
  private String lockedUntilDateTime = null;
  private String lockDurationInSeconds = null;
  private String lockType = null;
  private String useScratchPad = null;
  private String lockToken = null;
  private ErrorDetails errorDetails = null;

  
  /**
   **/
  public LockInformation lockedByUser(UserInfo lockedByUser) {
    this.lockedByUser = lockedByUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockedByUser")
  public UserInfo getLockedByUser() {
    return lockedByUser;
  }
  public void setLockedByUser(UserInfo lockedByUser) {
    this.lockedByUser = lockedByUser;
  }

  
  /**
   * Specifies the friendly name of  the application that is locking the envelope.
   **/
  public LockInformation lockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the friendly name of  the application that is locking the envelope.")
  @JsonProperty("lockedByApp")
  public String getLockedByApp() {
    return lockedByApp;
  }
  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }

  
  /**
   * The datetime until the envelope lock expires.
   **/
  public LockInformation lockedUntilDateTime(String lockedUntilDateTime) {
    this.lockedUntilDateTime = lockedUntilDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The datetime until the envelope lock expires.")
  @JsonProperty("lockedUntilDateTime")
  public String getLockedUntilDateTime() {
    return lockedUntilDateTime;
  }
  public void setLockedUntilDateTime(String lockedUntilDateTime) {
    this.lockedUntilDateTime = lockedUntilDateTime;
  }

  
  /**
   * Sets the time, in seconds, until the lock expires when there is no activity on the envelope.\n\nIf no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.\n\nThe lock duration can be extended.\n
   **/
  public LockInformation lockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the time, in seconds, until the lock expires when there is no activity on the envelope.\n\nIf no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.\n\nThe lock duration can be extended.\n")
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
  public LockInformation lockType(String lockType) {
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
  public LockInformation useScratchPad(String useScratchPad) {
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
   * A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.
   **/
  public LockInformation lockToken(String lockToken) {
    this.lockToken = lockToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.")
  @JsonProperty("lockToken")
  public String getLockToken() {
    return lockToken;
  }
  public void setLockToken(String lockToken) {
    this.lockToken = lockToken;
  }

  
  /**
   **/
  public LockInformation errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
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
    return Objects.equals(this.lockedByUser, lockInformation.lockedByUser) &&
        Objects.equals(this.lockedByApp, lockInformation.lockedByApp) &&
        Objects.equals(this.lockedUntilDateTime, lockInformation.lockedUntilDateTime) &&
        Objects.equals(this.lockDurationInSeconds, lockInformation.lockDurationInSeconds) &&
        Objects.equals(this.lockType, lockInformation.lockType) &&
        Objects.equals(this.useScratchPad, lockInformation.useScratchPad) &&
        Objects.equals(this.lockToken, lockInformation.lockToken) &&
        Objects.equals(this.errorDetails, lockInformation.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockedByUser, lockedByApp, lockedUntilDateTime, lockDurationInSeconds, lockType, useScratchPad, lockToken, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockInformation {\n");
    
    sb.append("    lockedByUser: ").append(toIndentedString(lockedByUser)).append("\n");
    sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
    sb.append("    lockedUntilDateTime: ").append(toIndentedString(lockedUntilDateTime)).append("\n");
    sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
    sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
    sb.append("    useScratchPad: ").append(toIndentedString(useScratchPad)).append("\n");
    sb.append("    lockToken: ").append(toIndentedString(lockToken)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

