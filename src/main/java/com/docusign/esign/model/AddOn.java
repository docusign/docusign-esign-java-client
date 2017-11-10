package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about add ons.
 */
@ApiModel(description = "Contains information about add ons.")

public class AddOn {
  @JsonProperty("active")
  private String active = null;

  @JsonProperty("addOnId")
  private String addOnId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public AddOn active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Reserved:
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public AddOn addOnId(String addOnId) {
    this.addOnId = addOnId;
    return this;
  }

   /**
   * Reserved:
   * @return addOnId
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getAddOnId() {
    return addOnId;
  }

  public void setAddOnId(String addOnId) {
    this.addOnId = addOnId;
  }

  public AddOn id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AddOn name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Reserved:
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOn addOn = (AddOn) o;
    return Objects.equals(this.active, addOn.active) &&
        Objects.equals(this.addOnId, addOn.addOnId) &&
        Objects.equals(this.id, addOn.id) &&
        Objects.equals(this.name, addOn.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, addOnId, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOn {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    addOnId: ").append(toIndentedString(addOnId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

