package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CloudStorageProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CloudStorageProviders   {
  
  private java.util.List<CloudStorageProvider> storageProviders = new java.util.ArrayList<CloudStorageProvider>();

  
  /**
   * An Array containing the storage providers associated with the user.
   **/
  
  @ApiModelProperty(value = "An Array containing the storage providers associated with the user.")
  @JsonProperty("storageProviders")
  public java.util.List<CloudStorageProvider> getStorageProviders() {
    return storageProviders;
  }
  public void setStorageProviders(java.util.List<CloudStorageProvider> storageProviders) {
    this.storageProviders = storageProviders;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudStorageProviders cloudStorageProviders = (CloudStorageProviders) o;

    return true && Objects.equals(storageProviders, cloudStorageProviders.storageProviders)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageProviders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageProviders {\n");
    
    if (storageProviders != null)
      sb.append("    storageProviders: ").append(toIndentedString(storageProviders)).append("\n");
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

