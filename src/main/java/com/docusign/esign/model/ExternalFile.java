package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalFile
 */

public class ExternalFile {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("img")
  private String img = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("supported")
  private String supported = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  public ExternalFile date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalFile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExternalFile img(String img) {
    this.img = img;
    return this;
  }

   /**
   * 
   * @return img
  **/
  @ApiModelProperty(value = "")
  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public ExternalFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalFile size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Reserved: TBD
   * @return size
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ExternalFile supported(String supported) {
    this.supported = supported;
    return this;
  }

   /**
   * 
   * @return supported
  **/
  @ApiModelProperty(value = "")
  public String getSupported() {
    return supported;
  }

  public void setSupported(String supported) {
    this.supported = supported;
  }

  public ExternalFile type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ExternalFile uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalFile externalFile = (ExternalFile) o;
    return Objects.equals(this.date, externalFile.date) &&
        Objects.equals(this.id, externalFile.id) &&
        Objects.equals(this.img, externalFile.img) &&
        Objects.equals(this.name, externalFile.name) &&
        Objects.equals(this.size, externalFile.size) &&
        Objects.equals(this.supported, externalFile.supported) &&
        Objects.equals(this.type, externalFile.type) &&
        Objects.equals(this.uri, externalFile.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, img, name, size, supported, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFile {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

