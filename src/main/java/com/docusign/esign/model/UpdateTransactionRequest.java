package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UpdateTransactionRequest */
public class UpdateTransactionRequest {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("state")
  private String state = null;

  public UpdateTransactionRequest code(String code) {
    this.code = code;
    return this;
  }

  /** @return code */
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public UpdateTransactionRequest message(String message) {
    this.message = message;
    return this;
  }

  /** @return message */
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UpdateTransactionRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state or province associated with the address.
   *
   * @return state
   */
  @ApiModelProperty(value = "The state or province associated with the address.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTransactionRequest updateTransactionRequest = (UpdateTransactionRequest) o;
    return Objects.equals(this.code, updateTransactionRequest.code)
        && Objects.equals(this.message, updateTransactionRequest.message)
        && Objects.equals(this.state, updateTransactionRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTransactionRequest {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
