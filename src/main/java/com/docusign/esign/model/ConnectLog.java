package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectDebugLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectLog
 */

public class ConnectLog {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("configUrl")
  private String configUrl = null;

  @JsonProperty("connectDebugLog")
  private java.util.List<ConnectDebugLog> connectDebugLog = null;

  @JsonProperty("connectId")
  private String connectId = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("failureId")
  private String failureId = null;

  @JsonProperty("failureUri")
  private String failureUri = null;

  @JsonProperty("lastTry")
  private String lastTry = null;

  @JsonProperty("logId")
  private String logId = null;

  @JsonProperty("logUri")
  private String logUri = null;

  @JsonProperty("retryCount")
  private String retryCount = null;

  @JsonProperty("retryUri")
  private String retryUri = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("userName")
  private String userName = null;

  public ConnectLog accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ConnectLog configUrl(String configUrl) {
    this.configUrl = configUrl;
    return this;
  }

   /**
   * The web address of the listener or Retrieving Service end point for Connect.
   * @return configUrl
  **/
  @ApiModelProperty(value = "The web address of the listener or Retrieving Service end point for Connect.")
  public String getConfigUrl() {
    return configUrl;
  }

  public void setConfigUrl(String configUrl) {
    this.configUrl = configUrl;
  }

  public ConnectLog connectDebugLog(java.util.List<ConnectDebugLog> connectDebugLog) {
    this.connectDebugLog = connectDebugLog;
    return this;
  }

  public ConnectLog addConnectDebugLogItem(ConnectDebugLog connectDebugLogItem) {
    if (this.connectDebugLog == null) {
      this.connectDebugLog = new java.util.ArrayList<ConnectDebugLog>();
    }
    this.connectDebugLog.add(connectDebugLogItem);
    return this;
  }

   /**
   * A complex element containing information about the Connect configuration, error details, date/time, description and payload.  This is only included in the response if the query additional_info=true is used.
   * @return connectDebugLog
  **/
  @ApiModelProperty(value = "A complex element containing information about the Connect configuration, error details, date/time, description and payload.  This is only included in the response if the query additional_info=true is used.")
  public java.util.List<ConnectDebugLog> getConnectDebugLog() {
    return connectDebugLog;
  }

  public void setConnectDebugLog(java.util.List<ConnectDebugLog> connectDebugLog) {
    this.connectDebugLog = connectDebugLog;
  }

  public ConnectLog connectId(String connectId) {
    this.connectId = connectId;
    return this;
  }

   /**
   * The identifier for the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.
   * @return connectId
  **/
  @ApiModelProperty(value = "The identifier for the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.")
  public String getConnectId() {
    return connectId;
  }

  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }

  public ConnectLog created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the entry was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the entry was created.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ConnectLog email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email that sent the envelope.
   * @return email
  **/
  @ApiModelProperty(value = "The email that sent the envelope.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ConnectLog envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public ConnectLog error(String error) {
    this.error = error;
    return this;
  }

   /**
   * The error that caused the Connect post to fail.
   * @return error
  **/
  @ApiModelProperty(value = "The error that caused the Connect post to fail.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ConnectLog failureId(String failureId) {
    this.failureId = failureId;
    return this;
  }

   /**
   * The failure log ID for the failure.
   * @return failureId
  **/
  @ApiModelProperty(value = "The failure log ID for the failure.")
  public String getFailureId() {
    return failureId;
  }

  public void setFailureId(String failureId) {
    this.failureId = failureId;
  }

  public ConnectLog failureUri(String failureUri) {
    this.failureUri = failureUri;
    return this;
  }

   /**
   * The URI for the failure.
   * @return failureUri
  **/
  @ApiModelProperty(value = "The URI for the failure.")
  public String getFailureUri() {
    return failureUri;
  }

  public void setFailureUri(String failureUri) {
    this.failureUri = failureUri;
  }

  public ConnectLog lastTry(String lastTry) {
    this.lastTry = lastTry;
    return this;
  }

   /**
   * The date and time the last attempt to post.
   * @return lastTry
  **/
  @ApiModelProperty(value = "The date and time the last attempt to post.")
  public String getLastTry() {
    return lastTry;
  }

  public void setLastTry(String lastTry) {
    this.lastTry = lastTry;
  }

  public ConnectLog logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * The Connect log ID for the entry.
   * @return logId
  **/
  @ApiModelProperty(value = "The Connect log ID for the entry.")
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public ConnectLog logUri(String logUri) {
    this.logUri = logUri;
    return this;
  }

   /**
   * The URI for the log item.
   * @return logUri
  **/
  @ApiModelProperty(value = "The URI for the log item.")
  public String getLogUri() {
    return logUri;
  }

  public void setLogUri(String logUri) {
    this.logUri = logUri;
  }

  public ConnectLog retryCount(String retryCount) {
    this.retryCount = retryCount;
    return this;
  }

   /**
   * The number of times the Connect post has been retried.
   * @return retryCount
  **/
  @ApiModelProperty(value = "The number of times the Connect post has been retried.")
  public String getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(String retryCount) {
    this.retryCount = retryCount;
  }

  public ConnectLog retryUri(String retryUri) {
    this.retryUri = retryUri;
    return this;
  }

   /**
   * The UEI to retry to publish the Connect failure.
   * @return retryUri
  **/
  @ApiModelProperty(value = "The UEI to retry to publish the Connect failure.")
  public String getRetryUri() {
    return retryUri;
  }

  public void setRetryUri(String retryUri) {
    this.retryUri = retryUri;
  }

  public ConnectLog status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The new envelope status for the failed Connect post. The possible values are: Any, Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut, Template, or Processing.
   * @return status
  **/
  @ApiModelProperty(value = "The new envelope status for the failed Connect post. The possible values are: Any, Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut, Template, or Processing.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConnectLog subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The envelope subject.
   * @return subject
  **/
  @ApiModelProperty(value = "The envelope subject.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ConnectLog userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The name of the envelope sender.
   * @return userName
  **/
  @ApiModelProperty(value = "The name of the envelope sender.")
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
    ConnectLog connectLog = (ConnectLog) o;
    return Objects.equals(this.accountId, connectLog.accountId) &&
        Objects.equals(this.configUrl, connectLog.configUrl) &&
        Objects.equals(this.connectDebugLog, connectLog.connectDebugLog) &&
        Objects.equals(this.connectId, connectLog.connectId) &&
        Objects.equals(this.created, connectLog.created) &&
        Objects.equals(this.email, connectLog.email) &&
        Objects.equals(this.envelopeId, connectLog.envelopeId) &&
        Objects.equals(this.error, connectLog.error) &&
        Objects.equals(this.failureId, connectLog.failureId) &&
        Objects.equals(this.failureUri, connectLog.failureUri) &&
        Objects.equals(this.lastTry, connectLog.lastTry) &&
        Objects.equals(this.logId, connectLog.logId) &&
        Objects.equals(this.logUri, connectLog.logUri) &&
        Objects.equals(this.retryCount, connectLog.retryCount) &&
        Objects.equals(this.retryUri, connectLog.retryUri) &&
        Objects.equals(this.status, connectLog.status) &&
        Objects.equals(this.subject, connectLog.subject) &&
        Objects.equals(this.userName, connectLog.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, configUrl, connectDebugLog, connectId, created, email, envelopeId, error, failureId, failureUri, lastTry, logId, logUri, retryCount, retryUri, status, subject, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectLog {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
    sb.append("    connectDebugLog: ").append(toIndentedString(connectDebugLog)).append("\n");
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    failureId: ").append(toIndentedString(failureId)).append("\n");
    sb.append("    failureUri: ").append(toIndentedString(failureUri)).append("\n");
    sb.append("    lastTry: ").append(toIndentedString(lastTry)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    logUri: ").append(toIndentedString(logUri)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    retryUri: ").append(toIndentedString(retryUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

