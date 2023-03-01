package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AskAnAdmin.
 *
 */

public class AskAnAdmin {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phone")
  private String phone = null;

  /**
   * email.
   *
   * @return AskAnAdmin
   **/
  public AskAnAdmin email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * 
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * message.
   *
   * @return AskAnAdmin
   **/
  public AskAnAdmin message(String message) {
    this.message = message;
    return this;
  }

  /**
   * .
   * 
   * @return message
   **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * name.
   *
   * @return AskAnAdmin
   **/
  public AskAnAdmin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * 
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * phone.
   *
   * @return AskAnAdmin
   **/
  public AskAnAdmin phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * .
   * 
   * @return phone
   **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  /**
   * setPhone.
   **/
  public void setPhone(String phone) {
    this.phone = phone;
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
    AskAnAdmin askAnAdmin = (AskAnAdmin) o;
    return Objects.equals(this.email, askAnAdmin.email) &&
        Objects.equals(this.message, askAnAdmin.message) &&
        Objects.equals(this.name, askAnAdmin.name) &&
        Objects.equals(this.phone, askAnAdmin.phone);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, message, name, phone);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AskAnAdmin {\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
