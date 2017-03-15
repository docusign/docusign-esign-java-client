package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ConnectDebugLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectLog   {
  
  private String accountId = null;
  private String configUrl = null;
  private java.util.List<ConnectDebugLog> connectDebugLog = new java.util.ArrayList<ConnectDebugLog>();
  private String connectId = null;
  private String created = null;
  private String email = null;
  private String envelopeId = null;
  private String error = null;
  private String failureId = null;
  private String failureUri = null;
  private String lastTry = null;
  private String logId = null;
  private String logUri = null;
  private String retryCount = null;
  private String retryUri = null;
  private String status = null;
  private String subject = null;
  private String userName = null;

  
  /**
   * The account ID associated with the envelope.
   **/
  
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * The web address of the listener or Retrieving Service end point for Connect.
   **/
  
  @ApiModelProperty(value = "The web address of the listener or Retrieving Service end point for Connect.")
  @JsonProperty("configUrl")
  public String getConfigUrl() {
    return configUrl;
  }
  public void setConfigUrl(String configUrl) {
    this.configUrl = configUrl;
  }

  
  /**
   * A complex element containing information about the Connect configuration, error details, date/time, description and payload.\n\nThis is only included in the response if the query additional_info=true is used.
   **/
  
  @ApiModelProperty(value = "A complex element containing information about the Connect configuration, error details, date/time, description and payload.\n\nThis is only included in the response if the query additional_info=true is used.")
  @JsonProperty("connectDebugLog")
  public java.util.List<ConnectDebugLog> getConnectDebugLog() {
    return connectDebugLog;
  }
  public void setConnectDebugLog(java.util.List<ConnectDebugLog> connectDebugLog) {
    this.connectDebugLog = connectDebugLog;
  }

  
  /**
   * The identifier for the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.
   **/
  
  @ApiModelProperty(value = "The identifier for the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.")
  @JsonProperty("connectId")
  public String getConnectId() {
    return connectId;
  }
  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }

  
  /**
   * The date and time the entry was created.
   **/
  
  @ApiModelProperty(value = "The date and time the entry was created.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  
  /**
   * The email that sent the envelope.
   **/
  
  @ApiModelProperty(value = "The email that sent the envelope.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * The error that caused the Connect post to fail.
   **/
  
  @ApiModelProperty(value = "The error that caused the Connect post to fail.")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   * The failure log ID for the failure.
   **/
  
  @ApiModelProperty(value = "The failure log ID for the failure.")
  @JsonProperty("failureId")
  public String getFailureId() {
    return failureId;
  }
  public void setFailureId(String failureId) {
    this.failureId = failureId;
  }

  
  /**
   * The URI for the failure.
   **/
  
  @ApiModelProperty(value = "The URI for the failure.")
  @JsonProperty("failureUri")
  public String getFailureUri() {
    return failureUri;
  }
  public void setFailureUri(String failureUri) {
    this.failureUri = failureUri;
  }

  
  /**
   * The date and time the last attempt to post.
   **/
  
  @ApiModelProperty(value = "The date and time the last attempt to post.")
  @JsonProperty("lastTry")
  public String getLastTry() {
    return lastTry;
  }
  public void setLastTry(String lastTry) {
    this.lastTry = lastTry;
  }

  
  /**
   * The Connect log ID for the entry.
   **/
  
  @ApiModelProperty(value = "The Connect log ID for the entry.")
  @JsonProperty("logId")
  public String getLogId() {
    return logId;
  }
  public void setLogId(String logId) {
    this.logId = logId;
  }

  
  /**
   * The URI for the log item.
   **/
  
  @ApiModelProperty(value = "The URI for the log item.")
  @JsonProperty("logUri")
  public String getLogUri() {
    return logUri;
  }
  public void setLogUri(String logUri) {
    this.logUri = logUri;
  }

  
  /**
   * The number of times the Connect post has been retried.
   **/
  
  @ApiModelProperty(value = "The number of times the Connect post has been retried.")
  @JsonProperty("retryCount")
  public String getRetryCount() {
    return retryCount;
  }
  public void setRetryCount(String retryCount) {
    this.retryCount = retryCount;
  }

  
  /**
   * The UEI to retry to publish the Connect failure.
   **/
  
  @ApiModelProperty(value = "The UEI to retry to publish the Connect failure.")
  @JsonProperty("retryUri")
  public String getRetryUri() {
    return retryUri;
  }
  public void setRetryUri(String retryUri) {
    this.retryUri = retryUri;
  }

  
  /**
   * The new envelope status for the failed Connect post. The possible values are: Any, Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut, Template, or Processing.
   **/
  
  @ApiModelProperty(value = "The new envelope status for the failed Connect post. The possible values are: Any, Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut, Template, or Processing.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The envelope subject.
   **/
  
  @ApiModelProperty(value = "The envelope subject.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * The name of the envelope sender.
   **/
  
  @ApiModelProperty(value = "The name of the envelope sender.")
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
    ConnectLog connectLog = (ConnectLog) o;

    return true && Objects.equals(accountId, connectLog.accountId) &&
        Objects.equals(configUrl, connectLog.configUrl) &&
        Objects.equals(connectDebugLog, connectLog.connectDebugLog) &&
        Objects.equals(connectId, connectLog.connectId) &&
        Objects.equals(created, connectLog.created) &&
        Objects.equals(email, connectLog.email) &&
        Objects.equals(envelopeId, connectLog.envelopeId) &&
        Objects.equals(error, connectLog.error) &&
        Objects.equals(failureId, connectLog.failureId) &&
        Objects.equals(failureUri, connectLog.failureUri) &&
        Objects.equals(lastTry, connectLog.lastTry) &&
        Objects.equals(logId, connectLog.logId) &&
        Objects.equals(logUri, connectLog.logUri) &&
        Objects.equals(retryCount, connectLog.retryCount) &&
        Objects.equals(retryUri, connectLog.retryUri) &&
        Objects.equals(status, connectLog.status) &&
        Objects.equals(subject, connectLog.subject) &&
        Objects.equals(userName, connectLog.userName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, configUrl, connectDebugLog, connectId, created, email, envelopeId, error, failureId, failureUri, lastTry, logId, logUri, retryCount, retryUri, status, subject, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectLog {\n");
    
    if (accountId != null)
      sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    if (configUrl != null)
      sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
    if (connectDebugLog != null)
      sb.append("    connectDebugLog: ").append(toIndentedString(connectDebugLog)).append("\n");
    if (connectId != null)
      sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    if (created != null)
      sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (error != null)
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
    if (failureId != null)
      sb.append("    failureId: ").append(toIndentedString(failureId)).append("\n");
    if (failureUri != null)
      sb.append("    failureUri: ").append(toIndentedString(failureUri)).append("\n");
    if (lastTry != null)
      sb.append("    lastTry: ").append(toIndentedString(lastTry)).append("\n");
    if (logId != null)
      sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    if (logUri != null)
      sb.append("    logUri: ").append(toIndentedString(logUri)).append("\n");
    if (retryCount != null)
      sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    if (retryUri != null)
      sb.append("    retryUri: ").append(toIndentedString(retryUri)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (subject != null)
      sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

