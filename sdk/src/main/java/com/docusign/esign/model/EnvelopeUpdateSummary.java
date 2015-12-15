package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EnvelopeUpdateSummary   {
  
  private String envelopeId = null;
  private BulkEnvelopeStatus bulkEnvelopeStatus = null;
  private LockInformation lockInformation = null;
  private ErrorDetails errorDetails = null;

  
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bulkEnvelopeStatus")
  public BulkEnvelopeStatus getBulkEnvelopeStatus() {
    return bulkEnvelopeStatus;
  }
  public void setBulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lockInformation")
  public LockInformation getLockInformation() {
    return lockInformation;
  }
  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeUpdateSummary envelopeUpdateSummary = (EnvelopeUpdateSummary) o;
    return Objects.equals(envelopeId, envelopeUpdateSummary.envelopeId) &&
        Objects.equals(bulkEnvelopeStatus, envelopeUpdateSummary.bulkEnvelopeStatus) &&
        Objects.equals(lockInformation, envelopeUpdateSummary.lockInformation) &&
        Objects.equals(errorDetails, envelopeUpdateSummary.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, bulkEnvelopeStatus, lockInformation, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeUpdateSummary {\n");
    
    sb.append("    envelopeId: ").append(StringUtil.toIndentedString(envelopeId)).append("\n");
    sb.append("    bulkEnvelopeStatus: ").append(StringUtil.toIndentedString(bulkEnvelopeStatus)).append("\n");
    sb.append("    lockInformation: ").append(StringUtil.toIndentedString(lockInformation)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
