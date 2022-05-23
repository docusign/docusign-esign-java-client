package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Revision */
public class Revision {
  @JsonProperty("endData")
  private String endData = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("maxSignatureLength")
  private String maxSignatureLength = null;

  @JsonProperty("signatureProperties")
  private SignatureProperties signatureProperties = null;

  @JsonProperty("signatureType")
  private String signatureType = null;

  @JsonProperty("startData")
  private String startData = null;

  public Revision endData(String endData) {
    this.endData = endData;
    return this;
  }

  /** @return endData */
  @ApiModelProperty(value = "")
  public String getEndData() {
    return endData;
  }

  public void setEndData(String endData) {
    this.endData = endData;
  }

  public Revision fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /** @return fieldName */
  @ApiModelProperty(value = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public Revision maxSignatureLength(String maxSignatureLength) {
    this.maxSignatureLength = maxSignatureLength;
    return this;
  }

  /** @return maxSignatureLength */
  @ApiModelProperty(value = "")
  public String getMaxSignatureLength() {
    return maxSignatureLength;
  }

  public void setMaxSignatureLength(String maxSignatureLength) {
    this.maxSignatureLength = maxSignatureLength;
  }

  public Revision signatureProperties(SignatureProperties signatureProperties) {
    this.signatureProperties = signatureProperties;
    return this;
  }

  /**
   * Get signatureProperties
   *
   * @return signatureProperties
   */
  @ApiModelProperty(value = "")
  public SignatureProperties getSignatureProperties() {
    return signatureProperties;
  }

  public void setSignatureProperties(SignatureProperties signatureProperties) {
    this.signatureProperties = signatureProperties;
  }

  public Revision signatureType(String signatureType) {
    this.signatureType = signatureType;
    return this;
  }

  /** @return signatureType */
  @ApiModelProperty(value = "")
  public String getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(String signatureType) {
    this.signatureType = signatureType;
  }

  public Revision startData(String startData) {
    this.startData = startData;
    return this;
  }

  /** @return startData */
  @ApiModelProperty(value = "")
  public String getStartData() {
    return startData;
  }

  public void setStartData(String startData) {
    this.startData = startData;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revision revision = (Revision) o;
    return Objects.equals(this.endData, revision.endData)
        && Objects.equals(this.fieldName, revision.fieldName)
        && Objects.equals(this.maxSignatureLength, revision.maxSignatureLength)
        && Objects.equals(this.signatureProperties, revision.signatureProperties)
        && Objects.equals(this.signatureType, revision.signatureType)
        && Objects.equals(this.startData, revision.startData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endData, fieldName, maxSignatureLength, signatureProperties, signatureType, startData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revision {\n");

    sb.append("    endData: ").append(toIndentedString(endData)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    maxSignatureLength: ").append(toIndentedString(maxSignatureLength)).append("\n");
    sb.append("    signatureProperties: ")
        .append(toIndentedString(signatureProperties))
        .append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    startData: ").append(toIndentedString(startData)).append("\n");
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
