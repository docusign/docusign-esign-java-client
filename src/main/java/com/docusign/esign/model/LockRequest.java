package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This request object contains information about the lock that you want to create or update..
 *
 */
@Schema(description = "This request object contains information about the lock that you want to create or update.")

public class LockRequest {
  @JsonProperty("lockDurationInSeconds")
  private String lockDurationInSeconds = null;

  @JsonProperty("lockedByApp")
  private String lockedByApp = null;

  @JsonProperty("lockType")
  private String lockType = null;

  @JsonProperty("templatePassword")
  private String templatePassword = null;

  @JsonProperty("useScratchPad")
  private String useScratchPad = null;


  /**
   * lockDurationInSeconds.
   *
   * @return LockRequest
   **/
  public LockRequest lockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
    return this;
  }

  /**
   * The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds..
   * @return lockDurationInSeconds
   **/
  @Schema(description = "The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.")
  public String getLockDurationInSeconds() {
    return lockDurationInSeconds;
  }

  /**
   * setLockDurationInSeconds.
   **/
  public void setLockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
  }


  /**
   * lockedByApp.
   *
   * @return LockRequest
   **/
  public LockRequest lockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
    return this;
  }

  /**
   * A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur..
   * @return lockedByApp
   **/
  @Schema(description = "A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.")
  public String getLockedByApp() {
    return lockedByApp;
  }

  /**
   * setLockedByApp.
   **/
  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }


  /**
   * lockType.
   *
   * @return LockRequest
   **/
  public LockRequest lockType(String lockType) {
    this.lockType = lockType;
    return this;
  }

  /**
   * The type of envelope lock.  Currently \"edit\" is the only supported type..
   * @return lockType
   **/
  @Schema(description = "The type of envelope lock.  Currently \"edit\" is the only supported type.")
  public String getLockType() {
    return lockType;
  }

  /**
   * setLockType.
   **/
  public void setLockType(String lockType) {
    this.lockType = lockType;
  }


  /**
   * templatePassword.
   *
   * @return LockRequest
   **/
  public LockRequest templatePassword(String templatePassword) {
    this.templatePassword = templatePassword;
    return this;
  }

  /**
   * .
   * @return templatePassword
   **/
  @Schema(description = "")
  public String getTemplatePassword() {
    return templatePassword;
  }

  /**
   * setTemplatePassword.
   **/
  public void setTemplatePassword(String templatePassword) {
    this.templatePassword = templatePassword;
  }


  /**
   * useScratchPad.
   *
   * @return LockRequest
   **/
  public LockRequest useScratchPad(String useScratchPad) {
    this.useScratchPad = useScratchPad;
    return this;
  }

  /**
   * Reserved for future use.  Indicates whether a scratchpad is used for editing information.  .
   * @return useScratchPad
   **/
  @Schema(description = "Reserved for future use.  Indicates whether a scratchpad is used for editing information.  ")
  public String getUseScratchPad() {
    return useScratchPad;
  }

  /**
   * setUseScratchPad.
   **/
  public void setUseScratchPad(String useScratchPad) {
    this.useScratchPad = useScratchPad;
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
    LockRequest lockRequest = (LockRequest) o;
    return Objects.equals(this.lockDurationInSeconds, lockRequest.lockDurationInSeconds) &&
        Objects.equals(this.lockedByApp, lockRequest.lockedByApp) &&
        Objects.equals(this.lockType, lockRequest.lockType) &&
        Objects.equals(this.templatePassword, lockRequest.templatePassword) &&
        Objects.equals(this.useScratchPad, lockRequest.useScratchPad);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(lockDurationInSeconds, lockedByApp, lockType, templatePassword, useScratchPad);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRequest {\n");
    
    sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
    sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
    sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
    sb.append("    templatePassword: ").append(toIndentedString(templatePassword)).append("\n");
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

