package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.LockInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
public class TemplateUpdateSummary   {
  
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateUpdateSummary templateUpdateSummary = (TemplateUpdateSummary) o;

    return true && Objects.equals(envelopeId, templateUpdateSummary.envelopeId) &&
        Objects.equals(bulkEnvelopeStatus, templateUpdateSummary.bulkEnvelopeStatus) &&
        Objects.equals(lockInformation, templateUpdateSummary.lockInformation) &&
        Objects.equals(errorDetails, templateUpdateSummary.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, bulkEnvelopeStatus, lockInformation, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateUpdateSummary {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    bulkEnvelopeStatus: ").append(toIndentedString(bulkEnvelopeStatus)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
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

