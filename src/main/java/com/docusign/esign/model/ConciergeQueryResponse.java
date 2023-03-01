package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ConciergeQueryResponse */
public class ConciergeQueryResponse {
  @JsonProperty("entityLocale")
  private String entityLocale = null;

  @JsonProperty("entityTimeZone")
  private String entityTimeZone = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("zuoraEntityName")
  private String zuoraEntityName = null;

  public ConciergeQueryResponse entityLocale(String entityLocale) {
    this.entityLocale = entityLocale;
    return this;
  }

  /** @return entityLocale */
  @Schema(example = "null", description = "")
  public String getEntityLocale() {
    return entityLocale;
  }

  public void setEntityLocale(String entityLocale) {
    this.entityLocale = entityLocale;
  }

  public ConciergeQueryResponse entityTimeZone(String entityTimeZone) {
    this.entityTimeZone = entityTimeZone;
    return this;
  }

  /** @return entityTimeZone */
  @Schema(example = "null", description = "")
  public String getEntityTimeZone() {
    return entityTimeZone;
  }

  public void setEntityTimeZone(String entityTimeZone) {
    this.entityTimeZone = entityTimeZone;
  }

  public ConciergeQueryResponse message(String message) {
    this.message = message;
    return this;
  }

  /** @return message */
  @Schema(example = "null", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConciergeQueryResponse zuoraEntityName(String zuoraEntityName) {
    this.zuoraEntityName = zuoraEntityName;
    return this;
  }

  /** @return zuoraEntityName */
  @Schema(example = "null", description = "")
  public String getZuoraEntityName() {
    return zuoraEntityName;
  }

  public void setZuoraEntityName(String zuoraEntityName) {
    this.zuoraEntityName = zuoraEntityName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConciergeQueryResponse conciergeQueryResponse = (ConciergeQueryResponse) o;
    return Objects.equals(this.entityLocale, conciergeQueryResponse.entityLocale)
        && Objects.equals(this.entityTimeZone, conciergeQueryResponse.entityTimeZone)
        && Objects.equals(this.message, conciergeQueryResponse.message)
        && Objects.equals(this.zuoraEntityName, conciergeQueryResponse.zuoraEntityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityLocale, entityTimeZone, message, zuoraEntityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConciergeQueryResponse {\n");

    sb.append("    entityLocale: ").append(toIndentedString(entityLocale)).append("\n");
    sb.append("    entityTimeZone: ").append(toIndentedString(entityTimeZone)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    zuoraEntityName: ").append(toIndentedString(zuoraEntityName)).append("\n");
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
