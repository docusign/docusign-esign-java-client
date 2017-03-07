package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about add ons.
 **/

@ApiModel(description = "Contains information about add ons.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AddOn   {
  
  private String active = null;
  private String addOnId = null;
  private String id = null;
  private String name = null;

  
  /**
   * Reserved:
   **/
  
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("active")
  public String getActive() {
    return active;
  }
  public void setActive(String active) {
    this.active = active;
  }

  
  /**
   * Reserved:
   **/
  
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("addOnId")
  public String getAddOnId() {
    return addOnId;
  }
  public void setAddOnId(String addOnId) {
    this.addOnId = addOnId;
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
   * Reserved:
   **/
  
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("name")
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

    return true && Objects.equals(active, addOn.active) &&
        Objects.equals(addOnId, addOn.addOnId) &&
        Objects.equals(id, addOn.id) &&
        Objects.equals(name, addOn.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, addOnId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOn {\n");
    
    if (active != null)
      sb.append("    active: ").append(toIndentedString(active)).append("\n");
    if (addOnId != null)
      sb.append("    addOnId: ").append(toIndentedString(addOnId)).append("\n");
    if (id != null)
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (name != null)
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

