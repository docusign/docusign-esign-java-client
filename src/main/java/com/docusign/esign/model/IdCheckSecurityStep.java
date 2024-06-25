package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * IdCheckSecurityStep.
 *
 */

public class IdCheckSecurityStep implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("authType")
  private String authType = null;


  /**
   * authType.
   *
   * @return IdCheckSecurityStep
   **/
  public IdCheckSecurityStep authType(String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * .
   * @return authType
   **/
  @Schema(description = "")
  public String getAuthType() {
    return authType;
  }

  /**
   * setAuthType.
   **/
  public void setAuthType(String authType) {
    this.authType = authType;
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
    IdCheckSecurityStep idCheckSecurityStep = (IdCheckSecurityStep) o;
    return Objects.equals(this.authType, idCheckSecurityStep.authType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCheckSecurityStep {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

