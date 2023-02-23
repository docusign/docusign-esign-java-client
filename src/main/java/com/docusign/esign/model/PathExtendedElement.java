package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PathExtendedElement.
 *
 */

public class PathExtendedElement {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("typeName")
  private String typeName = null;

  /**
   * name.
   *
   * @return PathExtendedElement
   **/
  public PathExtendedElement name(String name) {
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
   * type.
   *
   * @return PathExtendedElement
   **/
  public PathExtendedElement type(String type) {
    this.type = type;
    return this;
  }

  /**
   * .
   * 
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * typeName.
   *
   * @return PathExtendedElement
   **/
  public PathExtendedElement typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * .
   * 
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
    PathExtendedElement pathExtendedElement = (PathExtendedElement) o;
    return Objects.equals(this.name, pathExtendedElement.name) &&
        Objects.equals(this.type, pathExtendedElement.type) &&
        Objects.equals(this.typeName, pathExtendedElement.typeName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, type, typeName);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathExtendedElement {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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
