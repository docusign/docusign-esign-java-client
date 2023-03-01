package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CloudStorageProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CloudStorageProviders.
 *
 */

public class CloudStorageProviders {
  @JsonProperty("storageProviders")
  private java.util.List<CloudStorageProvider> storageProviders = null;

  /**
   * storageProviders.
   *
   * @return CloudStorageProviders
   **/
  public CloudStorageProviders storageProviders(java.util.List<CloudStorageProvider> storageProviders) {
    this.storageProviders = storageProviders;
    return this;
  }

  /**
   * addStorageProvidersItem.
   *
   * @return CloudStorageProviders
   **/
  public CloudStorageProviders addStorageProvidersItem(CloudStorageProvider storageProvidersItem) {
    if (this.storageProviders == null) {
      this.storageProviders = new java.util.ArrayList<>();
    }
    this.storageProviders.add(storageProvidersItem);
    return this;
  }

  /**
   * An Array containing the storage providers associated with the user..
   * 
   * @return storageProviders
   **/
  @Schema(description = "An Array containing the storage providers associated with the user.")
  public java.util.List<CloudStorageProvider> getStorageProviders() {
    return storageProviders;
  }

  /**
   * setStorageProviders.
   **/
  public void setStorageProviders(java.util.List<CloudStorageProvider> storageProviders) {
    this.storageProviders = storageProviders;
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
    CloudStorageProviders cloudStorageProviders = (CloudStorageProviders) o;
    return Objects.equals(this.storageProviders, cloudStorageProviders.storageProviders);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(storageProviders);
  }

  /**
   * Converts the given object to string.
   */
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
