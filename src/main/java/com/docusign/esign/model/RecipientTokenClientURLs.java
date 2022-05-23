package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RecipientTokenClientURLs. */
public class RecipientTokenClientURLs {
  @JsonProperty("OnAccessCodeFailed")
  private String onAccessCodeFailed = null;

  @JsonProperty("OnCancel")
  private String onCancel = null;

  @JsonProperty("OnDecline")
  private String onDecline = null;

  @JsonProperty("OnException")
  private String onException = null;

  @JsonProperty("OnFaxPending")
  private String onFaxPending = null;

  @JsonProperty("OnIdCheckFailed")
  private String onIdCheckFailed = null;

  @JsonProperty("OnSessionTimeout")
  private String onSessionTimeout = null;

  @JsonProperty("OnSigningComplete")
  private String onSigningComplete = null;

  @JsonProperty("OnTTLExpired")
  private String onTTLExpired = null;

  @JsonProperty("OnViewingComplete")
  private String onViewingComplete = null;

  /**
   * onAccessCodeFailed.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onAccessCodeFailed(String onAccessCodeFailed) {
    this.onAccessCodeFailed = onAccessCodeFailed;
    return this;
  }

  /**
   * .
   *
   * @return onAccessCodeFailed
   */
  @ApiModelProperty(value = "")
  public String getOnAccessCodeFailed() {
    return onAccessCodeFailed;
  }

  /** setOnAccessCodeFailed. */
  public void setOnAccessCodeFailed(String onAccessCodeFailed) {
    this.onAccessCodeFailed = onAccessCodeFailed;
  }

  /**
   * onCancel.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onCancel(String onCancel) {
    this.onCancel = onCancel;
    return this;
  }

  /**
   * .
   *
   * @return onCancel
   */
  @ApiModelProperty(value = "")
  public String getOnCancel() {
    return onCancel;
  }

  /** setOnCancel. */
  public void setOnCancel(String onCancel) {
    this.onCancel = onCancel;
  }

  /**
   * onDecline.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onDecline(String onDecline) {
    this.onDecline = onDecline;
    return this;
  }

  /**
   * .
   *
   * @return onDecline
   */
  @ApiModelProperty(value = "")
  public String getOnDecline() {
    return onDecline;
  }

  /** setOnDecline. */
  public void setOnDecline(String onDecline) {
    this.onDecline = onDecline;
  }

  /**
   * onException.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onException(String onException) {
    this.onException = onException;
    return this;
  }

  /**
   * .
   *
   * @return onException
   */
  @ApiModelProperty(value = "")
  public String getOnException() {
    return onException;
  }

  /** setOnException. */
  public void setOnException(String onException) {
    this.onException = onException;
  }

  /**
   * onFaxPending.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onFaxPending(String onFaxPending) {
    this.onFaxPending = onFaxPending;
    return this;
  }

  /**
   * .
   *
   * @return onFaxPending
   */
  @ApiModelProperty(value = "")
  public String getOnFaxPending() {
    return onFaxPending;
  }

  /** setOnFaxPending. */
  public void setOnFaxPending(String onFaxPending) {
    this.onFaxPending = onFaxPending;
  }

  /**
   * onIdCheckFailed.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onIdCheckFailed(String onIdCheckFailed) {
    this.onIdCheckFailed = onIdCheckFailed;
    return this;
  }

  /**
   * .
   *
   * @return onIdCheckFailed
   */
  @ApiModelProperty(value = "")
  public String getOnIdCheckFailed() {
    return onIdCheckFailed;
  }

  /** setOnIdCheckFailed. */
  public void setOnIdCheckFailed(String onIdCheckFailed) {
    this.onIdCheckFailed = onIdCheckFailed;
  }

  /**
   * onSessionTimeout.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onSessionTimeout(String onSessionTimeout) {
    this.onSessionTimeout = onSessionTimeout;
    return this;
  }

  /**
   * .
   *
   * @return onSessionTimeout
   */
  @ApiModelProperty(value = "")
  public String getOnSessionTimeout() {
    return onSessionTimeout;
  }

  /** setOnSessionTimeout. */
  public void setOnSessionTimeout(String onSessionTimeout) {
    this.onSessionTimeout = onSessionTimeout;
  }

  /**
   * onSigningComplete.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onSigningComplete(String onSigningComplete) {
    this.onSigningComplete = onSigningComplete;
    return this;
  }

  /**
   * .
   *
   * @return onSigningComplete
   */
  @ApiModelProperty(value = "")
  public String getOnSigningComplete() {
    return onSigningComplete;
  }

  /** setOnSigningComplete. */
  public void setOnSigningComplete(String onSigningComplete) {
    this.onSigningComplete = onSigningComplete;
  }

  /**
   * onTTLExpired.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onTTLExpired(String onTTLExpired) {
    this.onTTLExpired = onTTLExpired;
    return this;
  }

  /**
   * .
   *
   * @return onTTLExpired
   */
  @ApiModelProperty(value = "")
  public String getOnTTLExpired() {
    return onTTLExpired;
  }

  /** setOnTTLExpired. */
  public void setOnTTLExpired(String onTTLExpired) {
    this.onTTLExpired = onTTLExpired;
  }

  /**
   * onViewingComplete.
   *
   * @return RecipientTokenClientURLs
   */
  public RecipientTokenClientURLs onViewingComplete(String onViewingComplete) {
    this.onViewingComplete = onViewingComplete;
    return this;
  }

  /**
   * .
   *
   * @return onViewingComplete
   */
  @ApiModelProperty(value = "")
  public String getOnViewingComplete() {
    return onViewingComplete;
  }

  /** setOnViewingComplete. */
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
    return Objects.equals(this.onAccessCodeFailed, recipientTokenClientURLs.onAccessCodeFailed)
        && Objects.equals(this.onCancel, recipientTokenClientURLs.onCancel)
        && Objects.equals(this.onDecline, recipientTokenClientURLs.onDecline)
        && Objects.equals(this.onException, recipientTokenClientURLs.onException)
        && Objects.equals(this.onFaxPending, recipientTokenClientURLs.onFaxPending)
        && Objects.equals(this.onIdCheckFailed, recipientTokenClientURLs.onIdCheckFailed)
        && Objects.equals(this.onSessionTimeout, recipientTokenClientURLs.onSessionTimeout)
        && Objects.equals(this.onSigningComplete, recipientTokenClientURLs.onSigningComplete)
        && Objects.equals(this.onTTLExpired, recipientTokenClientURLs.onTTLExpired)
        && Objects.equals(this.onViewingComplete, recipientTokenClientURLs.onViewingComplete);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        onAccessCodeFailed,
        onCancel,
        onDecline,
        onException,
        onFaxPending,
        onIdCheckFailed,
        onSessionTimeout,
        onSigningComplete,
        onTTLExpired,
        onViewingComplete);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
