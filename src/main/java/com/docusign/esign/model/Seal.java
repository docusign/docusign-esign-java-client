package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** Seal */
public class Seal {
  @JsonProperty("configuration")
  private java.util.Map<String, String> _configuration = null;

  @JsonProperty("sealIdentifier")
  private String sealIdentifier = null;

  public Seal _configuration(java.util.Map<String, String> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public Seal putConfigurationItem(String key, String _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new java.util.HashMap<String, String>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /** @return _configuration */
  @Schema(description = "")
  public java.util.Map<String, String> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(java.util.Map<String, String> _configuration) {
    this._configuration = _configuration;
  }

  public Seal sealIdentifier(String sealIdentifier) {
    this.sealIdentifier = sealIdentifier;
    return this;
  }

  /** @return sealIdentifier */
  @Schema(description = "")
  public String getSealIdentifier() {
    return sealIdentifier;
  }

  public void setSealIdentifier(String sealIdentifier) {
    this.sealIdentifier = sealIdentifier;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seal seal = (Seal) o;
    return Objects.equals(this._configuration, seal._configuration)
        && Objects.equals(this.sealIdentifier, seal.sealIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, sealIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seal {\n");

    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    sealIdentifier: ").append(toIndentedString(sealIdentifier)).append("\n");
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
