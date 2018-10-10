package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopePublishRequest
 */

public class EnvelopePublishRequest {
  @JsonProperty("applyConnectSettings")
  private String applyConnectSettings = null;

  @JsonProperty("envelopeIds")
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

  @JsonProperty("envelopeIdsBase64")
  private String envelopeIdsBase64 = null;

  public EnvelopePublishRequest applyConnectSettings(String applyConnectSettings) {
    this.applyConnectSettings = applyConnectSettings;
    return this;
  }

   /**
   * 
   * @return applyConnectSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getApplyConnectSettings() {
    return applyConnectSettings;
  }

  public void setApplyConnectSettings(String applyConnectSettings) {
    this.applyConnectSettings = applyConnectSettings;
  }

  public EnvelopePublishRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }

  public EnvelopePublishRequest addEnvelopeIdsItem(String envelopeIdsItem) {
    this.envelopeIds.add(envelopeIdsItem);
    return this;
  }

   /**
   * 
   * @return envelopeIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }

  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  public EnvelopePublishRequest envelopeIdsBase64(String envelopeIdsBase64) {
    this.envelopeIdsBase64 = envelopeIdsBase64;
    return this;
  }

   /**
   * 
   * @return envelopeIdsBase64
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopeIdsBase64() {
    return envelopeIdsBase64;
  }

  public void setEnvelopeIdsBase64(String envelopeIdsBase64) {
    this.envelopeIdsBase64 = envelopeIdsBase64;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopePublishRequest envelopePublishRequest = (EnvelopePublishRequest) o;
    return Objects.equals(this.applyConnectSettings, envelopePublishRequest.applyConnectSettings) &&
        Objects.equals(this.envelopeIds, envelopePublishRequest.envelopeIds) &&
        Objects.equals(this.envelopeIdsBase64, envelopePublishRequest.envelopeIdsBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyConnectSettings, envelopeIds, envelopeIdsBase64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePublishRequest {\n");
    
    sb.append("    applyConnectSettings: ").append(toIndentedString(applyConnectSettings)).append("\n");
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    envelopeIdsBase64: ").append(toIndentedString(envelopeIdsBase64)).append("\n");
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

