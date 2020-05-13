package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CloudStorageProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CloudStorageProviders
 */

public class CloudStorageProviders {
  @JsonProperty("storageProviders")
  private java.util.List<CloudStorageProvider> storageProviders = null;

  public CloudStorageProviders storageProviders(java.util.List<CloudStorageProvider> storageProviders) {
    this.storageProviders = storageProviders;
    return this;
  }

  public CloudStorageProviders addStorageProvidersItem(CloudStorageProvider storageProvidersItem) {
    if (this.storageProviders == null) {
      this.storageProviders = new java.util.ArrayList<CloudStorageProvider>();
    }
    this.storageProviders.add(storageProvidersItem);
    return this;
  }

   /**
   * An Array containing the storage providers associated with the user.
   * @return storageProviders
  **/
  @ApiModelProperty(value = "An Array containing the storage providers associated with the user.")
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
    return Objects.equals(this.storageProviders, cloudStorageProviders.storageProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageProviders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageProviders {\n");
    
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

