package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * RecipientTokenClientURLs.
 *
 */

public class RecipientTokenClientURLs implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("onAccessCodeFailed")
  private String onAccessCodeFailed = null;

  @JsonProperty("onCancel")
  private String onCancel = null;

  @JsonProperty("onDecline")
  private String onDecline = null;

  @JsonProperty("onException")
  private String onException = null;

  @JsonProperty("onFaxPending")
  private String onFaxPending = null;

  @JsonProperty("onIdCheckFailed")
  private String onIdCheckFailed = null;

  @JsonProperty("onSessionTimeout")
  private String onSessionTimeout = null;

  @JsonProperty("onSigningComplete")
  private String onSigningComplete = null;

  @JsonProperty("onTTLExpired")
  private String onTTLExpired = null;

  @JsonProperty("onViewingComplete")
  private String onViewingComplete = null;


  /**
   * onAccessCodeFailed.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onAccessCodeFailed(String onAccessCodeFailed) {
    this.onAccessCodeFailed = onAccessCodeFailed;
    return this;
  }

  /**
   * .
   * @return onAccessCodeFailed
   **/
  @Schema(description = "")
  public String getOnAccessCodeFailed() {
    return onAccessCodeFailed;
  }

  /**
   * setOnAccessCodeFailed.
   **/
  public void setOnAccessCodeFailed(String onAccessCodeFailed) {
    this.onAccessCodeFailed = onAccessCodeFailed;
  }


  /**
   * onCancel.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onCancel(String onCancel) {
    this.onCancel = onCancel;
    return this;
  }

  /**
   * .
   * @return onCancel
   **/
  @Schema(description = "")
  public String getOnCancel() {
    return onCancel;
  }

  /**
   * setOnCancel.
   **/
  public void setOnCancel(String onCancel) {
    this.onCancel = onCancel;
  }


  /**
   * onDecline.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onDecline(String onDecline) {
    this.onDecline = onDecline;
    return this;
  }

  /**
   * .
   * @return onDecline
   **/
  @Schema(description = "")
  public String getOnDecline() {
    return onDecline;
  }

  /**
   * setOnDecline.
   **/
  public void setOnDecline(String onDecline) {
    this.onDecline = onDecline;
  }


  /**
   * onException.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onException(String onException) {
    this.onException = onException;
    return this;
  }

  /**
   * .
   * @return onException
   **/
  @Schema(description = "")
  public String getOnException() {
    return onException;
  }

  /**
   * setOnException.
   **/
  public void setOnException(String onException) {
    this.onException = onException;
  }


  /**
   * onFaxPending.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onFaxPending(String onFaxPending) {
    this.onFaxPending = onFaxPending;
    return this;
  }

  /**
   * .
   * @return onFaxPending
   **/
  @Schema(description = "")
  public String getOnFaxPending() {
    return onFaxPending;
  }

  /**
   * setOnFaxPending.
   **/
  public void setOnFaxPending(String onFaxPending) {
    this.onFaxPending = onFaxPending;
  }


  /**
   * onIdCheckFailed.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onIdCheckFailed(String onIdCheckFailed) {
    this.onIdCheckFailed = onIdCheckFailed;
    return this;
  }

  /**
   * .
   * @return onIdCheckFailed
   **/
  @Schema(description = "")
  public String getOnIdCheckFailed() {
    return onIdCheckFailed;
  }

  /**
   * setOnIdCheckFailed.
   **/
  public void setOnIdCheckFailed(String onIdCheckFailed) {
    this.onIdCheckFailed = onIdCheckFailed;
  }


  /**
   * onSessionTimeout.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onSessionTimeout(String onSessionTimeout) {
    this.onSessionTimeout = onSessionTimeout;
    return this;
  }

  /**
   * .
   * @return onSessionTimeout
   **/
  @Schema(description = "")
  public String getOnSessionTimeout() {
    return onSessionTimeout;
  }

  /**
   * setOnSessionTimeout.
   **/
  public void setOnSessionTimeout(String onSessionTimeout) {
    this.onSessionTimeout = onSessionTimeout;
  }


  /**
   * onSigningComplete.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onSigningComplete(String onSigningComplete) {
    this.onSigningComplete = onSigningComplete;
    return this;
  }

  /**
   * .
   * @return onSigningComplete
   **/
  @Schema(description = "")
  public String getOnSigningComplete() {
    return onSigningComplete;
  }

  /**
   * setOnSigningComplete.
   **/
  public void setOnSigningComplete(String onSigningComplete) {
    this.onSigningComplete = onSigningComplete;
  }


  /**
   * onTTLExpired.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onTTLExpired(String onTTLExpired) {
    this.onTTLExpired = onTTLExpired;
    return this;
  }

  /**
   * .
   * @return onTTLExpired
   **/
  @Schema(description = "")
  public String getOnTTLExpired() {
    return onTTLExpired;
  }

  /**
   * setOnTTLExpired.
   **/
  public void setOnTTLExpired(String onTTLExpired) {
    this.onTTLExpired = onTTLExpired;
  }


  /**
   * onViewingComplete.
   *
   * @return RecipientTokenClientURLs
   **/
  public RecipientTokenClientURLs onViewingComplete(String onViewingComplete) {
    this.onViewingComplete = onViewingComplete;
    return this;
  }

  /**
   * .
   * @return onViewingComplete
   **/
  @Schema(description = "")
  public String getOnViewingComplete() {
    return onViewingComplete;
  }

  /**
   * setOnViewingComplete.
   **/
  public void setOnViewingComplete(String onViewingComplete) {
    this.onViewingComplete = onViewingComplete;
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
    RecipientTokenClientURLs recipientTokenClientURLs = (RecipientTokenClientURLs) o;
    return Objects.equals(this.onAccessCodeFailed, recipientTokenClientURLs.onAccessCodeFailed) &&
        Objects.equals(this.onCancel, recipientTokenClientURLs.onCancel) &&
        Objects.equals(this.onDecline, recipientTokenClientURLs.onDecline) &&
        Objects.equals(this.onException, recipientTokenClientURLs.onException) &&
        Objects.equals(this.onFaxPending, recipientTokenClientURLs.onFaxPending) &&
        Objects.equals(this.onIdCheckFailed, recipientTokenClientURLs.onIdCheckFailed) &&
        Objects.equals(this.onSessionTimeout, recipientTokenClientURLs.onSessionTimeout) &&
        Objects.equals(this.onSigningComplete, recipientTokenClientURLs.onSigningComplete) &&
        Objects.equals(this.onTTLExpired, recipientTokenClientURLs.onTTLExpired) &&
        Objects.equals(this.onViewingComplete, recipientTokenClientURLs.onViewingComplete);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(onAccessCodeFailed, onCancel, onDecline, onException, onFaxPending, onIdCheckFailed, onSessionTimeout, onSigningComplete, onTTLExpired, onViewingComplete);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientTokenClientURLs {\n");
    
    sb.append("    onAccessCodeFailed: ").append(toIndentedString(onAccessCodeFailed)).append("\n");
    sb.append("    onCancel: ").append(toIndentedString(onCancel)).append("\n");
    sb.append("    onDecline: ").append(toIndentedString(onDecline)).append("\n");
    sb.append("    onException: ").append(toIndentedString(onException)).append("\n");
    sb.append("    onFaxPending: ").append(toIndentedString(onFaxPending)).append("\n");
    sb.append("    onIdCheckFailed: ").append(toIndentedString(onIdCheckFailed)).append("\n");
    sb.append("    onSessionTimeout: ").append(toIndentedString(onSessionTimeout)).append("\n");
    sb.append("    onSigningComplete: ").append(toIndentedString(onSigningComplete)).append("\n");
    sb.append("    onTTLExpired: ").append(toIndentedString(onTTLExpired)).append("\n");
    sb.append("    onViewingComplete: ").append(toIndentedString(onViewingComplete)).append("\n");
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

