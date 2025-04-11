package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectedData.
 *
 */

public class ConnectedData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("supportedOperation")
  private String supportedOperation = null;

  @JsonProperty("supportedUri")
  private String supportedUri = null;

  @JsonProperty("typeName")
  private String typeName = null;

  @JsonProperty("typeSystemNamespace")
  private String typeSystemNamespace = null;


  /**
   * propertyName.
   *
   * @return ConnectedData
   **/
  public ConnectedData propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * .
   * @return propertyName
   **/
  @Schema(description = "")
  public String getPropertyName() {
    return propertyName;
  }

  /**
   * setPropertyName.
   **/
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  /**
   * supportedOperation.
   *
   * @return ConnectedData
   **/
  public ConnectedData supportedOperation(String supportedOperation) {
    this.supportedOperation = supportedOperation;
    return this;
  }

  /**
   * .
   * @return supportedOperation
   **/
  @Schema(description = "")
  public String getSupportedOperation() {
    return supportedOperation;
  }

  /**
   * setSupportedOperation.
   **/
  public void setSupportedOperation(String supportedOperation) {
    this.supportedOperation = supportedOperation;
  }


  /**
   * supportedUri.
   *
   * @return ConnectedData
   **/
  public ConnectedData supportedUri(String supportedUri) {
    this.supportedUri = supportedUri;
    return this;
  }

  /**
   * .
   * @return supportedUri
   **/
  @Schema(description = "")
  public String getSupportedUri() {
    return supportedUri;
  }

  /**
   * setSupportedUri.
   **/
  public void setSupportedUri(String supportedUri) {
    this.supportedUri = supportedUri;
  }


  /**
   * typeName.
   *
   * @return ConnectedData
   **/
  public ConnectedData typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * .
   * @return typeName
   **/
  @Schema(description = "")
  public String getTypeName() {
    return typeName;
  }

  /**
   * setTypeName.
   **/
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  /**
   * typeSystemNamespace.
   *
   * @return ConnectedData
   **/
  public ConnectedData typeSystemNamespace(String typeSystemNamespace) {
    this.typeSystemNamespace = typeSystemNamespace;
    return this;
  }

  /**
   * .
   * @return typeSystemNamespace
   **/
  @Schema(description = "")
  public String getTypeSystemNamespace() {
    return typeSystemNamespace;
  }

  /**
   * setTypeSystemNamespace.
   **/
  public void setTypeSystemNamespace(String typeSystemNamespace) {
    this.typeSystemNamespace = typeSystemNamespace;
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
    ConnectedData connectedData = (ConnectedData) o;
    return Objects.equals(this.propertyName, connectedData.propertyName) &&
        Objects.equals(this.supportedOperation, connectedData.supportedOperation) &&
        Objects.equals(this.supportedUri, connectedData.supportedUri) &&
        Objects.equals(this.typeName, connectedData.typeName) &&
        Objects.equals(this.typeSystemNamespace, connectedData.typeSystemNamespace);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(propertyName, supportedOperation, supportedUri, typeName, typeSystemNamespace);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedData {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    supportedOperation: ").append(toIndentedString(supportedOperation)).append("\n");
    sb.append("    supportedUri: ").append(toIndentedString(supportedUri)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    typeSystemNamespace: ").append(toIndentedString(typeSystemNamespace)).append("\n");
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

