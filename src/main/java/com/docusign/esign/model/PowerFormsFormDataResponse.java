package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** PowerFormsFormDataResponse. */
public class PowerFormsFormDataResponse {
  @JsonProperty("envelopes")
  private java.util.List<PowerFormFormDataEnvelope> envelopes = null;

  /**
   * envelopes.
   *
   * @return PowerFormsFormDataResponse
   */
  public PowerFormsFormDataResponse envelopes(java.util.List<PowerFormFormDataEnvelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  /**
   * addEnvelopesItem.
   *
   * @return PowerFormsFormDataResponse
   */
  public PowerFormsFormDataResponse addEnvelopesItem(PowerFormFormDataEnvelope envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new java.util.ArrayList<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * .
   *
   * @return envelopes
   */
  @ApiModelProperty(value = "")
  public java.util.List<PowerFormFormDataEnvelope> getEnvelopes() {
    return envelopes;
  }

  /** setEnvelopes. */
  public void setEnvelopes(java.util.List<PowerFormFormDataEnvelope> envelopes) {
    this.envelopes = envelopes;
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
    PowerFormsFormDataResponse powerFormsFormDataResponse = (PowerFormsFormDataResponse) o;
    return Objects.equals(this.envelopes, powerFormsFormDataResponse.envelopes);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(envelopes);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormsFormDataResponse {\n");

    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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
