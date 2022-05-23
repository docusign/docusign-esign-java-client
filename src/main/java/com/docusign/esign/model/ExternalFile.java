package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ExternalFile. */
public class ExternalFile {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("hasCompositeTemplate")
  private String hasCompositeTemplate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("img")
  private String img = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("supported")
  private String supported = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  /**
   * date.
   *
   * @return ExternalFile
   */
  public ExternalFile date(String date) {
    this.date = date;
    return this;
  }

  /**
   * .
   *
   * @return date
   */
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  /** setDate. */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * hasCompositeTemplate.
   *
   * @return ExternalFile
   */
  public ExternalFile hasCompositeTemplate(String hasCompositeTemplate) {
    this.hasCompositeTemplate = hasCompositeTemplate;
    return this;
  }

  /**
   * .
   *
   * @return hasCompositeTemplate
   */
  @ApiModelProperty(value = "")
  public String getHasCompositeTemplate() {
    return hasCompositeTemplate;
  }

  /** setHasCompositeTemplate. */
  public void setHasCompositeTemplate(String hasCompositeTemplate) {
    this.hasCompositeTemplate = hasCompositeTemplate;
  }

  /**
   * id.
   *
   * @return ExternalFile
   */
  public ExternalFile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * .
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /** setId. */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * img.
   *
   * @return ExternalFile
   */
  public ExternalFile img(String img) {
    this.img = img;
    return this;
  }

  /**
   * .
   *
   * @return img
   */
  @ApiModelProperty(value = "")
  public String getImg() {
    return img;
  }

  /** setImg. */
  public void setImg(String img) {
    this.img = img;
  }

  /**
   * name.
   *
   * @return ExternalFile
   */
  public ExternalFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ownerName.
   *
   * @return ExternalFile
   */
  public ExternalFile ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * .
   *
   * @return ownerName
   */
  @ApiModelProperty(value = "")
  public String getOwnerName() {
    return ownerName;
  }

  /** setOwnerName. */
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  /**
   * size.
   *
   * @return ExternalFile
   */
  public ExternalFile size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return size
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getSize() {
    return size;
  }

  /** setSize. */
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * supported.
   *
   * @return ExternalFile
   */
  public ExternalFile supported(String supported) {
    this.supported = supported;
    return this;
  }

  /**
   * .
   *
   * @return supported
   */
  @ApiModelProperty(value = "")
  public String getSupported() {
    return supported;
  }

  /** setSupported. */
  public void setSupported(String supported) {
    this.supported = supported;
  }

  /**
   * type.
   *
   * @return ExternalFile
   */
  public ExternalFile type(String type) {
    this.type = type;
    return this;
  }

  /**
   * .
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  /** setType. */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * uri.
   *
   * @return ExternalFile
   */
  public ExternalFile uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   *
   * @return uri
   */
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  /** setUri. */
  public void setUri(String uri) {
    this.uri = uri;
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
    ExternalFile externalFile = (ExternalFile) o;
    return Objects.equals(this.date, externalFile.date)
        && Objects.equals(this.hasCompositeTemplate, externalFile.hasCompositeTemplate)
        && Objects.equals(this.id, externalFile.id)
        && Objects.equals(this.img, externalFile.img)
        && Objects.equals(this.name, externalFile.name)
        && Objects.equals(this.ownerName, externalFile.ownerName)
        && Objects.equals(this.size, externalFile.size)
        && Objects.equals(this.supported, externalFile.supported)
        && Objects.equals(this.type, externalFile.type)
        && Objects.equals(this.uri, externalFile.uri);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        date, hasCompositeTemplate, id, img, name, ownerName, size, supported, type, uri);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFile {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hasCompositeTemplate: ")
        .append(toIndentedString(hasCompositeTemplate))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
