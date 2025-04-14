package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectionInstance.
 *
 */

public class ConnectionInstance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectionKey")
  private String connectionKey = null;

  @JsonProperty("connectionValue")
  private String connectionValue = null;


  /**
   * connectionKey.
   *
   * @return ConnectionInstance
   **/
  public ConnectionInstance connectionKey(String connectionKey) {
    this.connectionKey = connectionKey;
    return this;
  }

  /**
   * .
   * @return connectionKey
   **/
  @Schema(description = "")
  public String getConnectionKey() {
    return connectionKey;
  }

  /**
   * setConnectionKey.
   **/
  public void setConnectionKey(String connectionKey) {
    this.connectionKey = connectionKey;
  }


  /**
   * connectionValue.
   *
   * @return ConnectionInstance
   **/
  public ConnectionInstance connectionValue(String connectionValue) {
    this.connectionValue = connectionValue;
    return this;
  }

  /**
   * .
   * @return connectionValue
   **/
  @Schema(description = "")
  public String getConnectionValue() {
    return connectionValue;
  }

  /**
   * setConnectionValue.
   **/
  public void setConnectionValue(String connectionValue) {
    this.connectionValue = connectionValue;
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
    ConnectionInstance connectionInstance = (ConnectionInstance) o;
    return Objects.equals(this.connectionKey, connectionInstance.connectionKey) &&
        Objects.equals(this.connectionValue, connectionInstance.connectionValue);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(connectionKey, connectionValue);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInstance {\n");
    
    sb.append("    connectionKey: ").append(toIndentedString(connectionKey)).append("\n");
    sb.append("    connectionValue: ").append(toIndentedString(connectionValue)).append("\n");
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

