package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Credential */
public class Credential {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private String value = null;

  public Credential accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign
   * the envelope. Maximum Length: 50 characters and it must conform to the account's access code
   * format setting. If blank, but the signer `accessCode` property is set in the envelope, then
   * that value is used. If blank and the signer `accessCode` property is not set, then the access
   * code is not required.
   *
   * @return accessCode
   */
  @ApiModelProperty(
      value =
          "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public Credential type(String type) {
    this.type = type;
    return this;
  }

  /** @return type */
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Credential value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab.
   *
   * @return value
   */
  @ApiModelProperty(value = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.accessCode, credential.accessCode)
        && Objects.equals(this.type, credential.type)
        && Objects.equals(this.value, credential.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");

    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
