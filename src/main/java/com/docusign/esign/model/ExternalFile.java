package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ExternalFile   {
  
  private String date = null;
  private String id = null;
  private String img = null;
  private String name = null;
  private String size = null;
  private String supported = null;
  private String type = null;
  private String uri = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("img")
  public String getImg() {
    return img;
  }
  public void setImg(String img) {
    this.img = img;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supported")
  public String getSupported() {
    return supported;
  }
  public void setSupported(String supported) {
    this.supported = supported;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
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

    return true && Objects.equals(date, externalFile.date) &&
        Objects.equals(id, externalFile.id) &&
        Objects.equals(img, externalFile.img) &&
        Objects.equals(name, externalFile.name) &&
        Objects.equals(size, externalFile.size) &&
        Objects.equals(supported, externalFile.supported) &&
        Objects.equals(type, externalFile.type) &&
        Objects.equals(uri, externalFile.uri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, img, name, size, supported, type, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFile {\n");
    
    if (date != null)
      sb.append("    date: ").append(toIndentedString(date)).append("\n");
    if (id != null)
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (img != null)
      sb.append("    img: ").append(toIndentedString(img)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (size != null)
      sb.append("    size: ").append(toIndentedString(size)).append("\n");
    if (supported != null)
      sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    if (type != null)
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (uri != null)
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

