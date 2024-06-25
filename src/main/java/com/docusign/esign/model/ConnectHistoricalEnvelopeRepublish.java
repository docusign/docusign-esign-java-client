package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectCustomConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectHistoricalEnvelopeRepublish.
 *
 */

public class ConnectHistoricalEnvelopeRepublish implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("config")
  private ConnectCustomConfiguration config = null;

  @JsonProperty("envelopes")
  private java.util.List<String> envelopes = null;


  /**
   * config.
   *
   * @return ConnectHistoricalEnvelopeRepublish
   **/
  public ConnectHistoricalEnvelopeRepublish config(ConnectCustomConfiguration config) {
    this.config = config;
    return this;
  }

  /**
   * .
   * @return config
   **/
  @Schema(description = "")
  public ConnectCustomConfiguration getConfig() {
    return config;
  }

  /**
   * setConfig.
   **/
  public void setConfig(ConnectCustomConfiguration config) {
    this.config = config;
  }


  /**
   * envelopes.
   *
   * @return ConnectHistoricalEnvelopeRepublish
   **/
  public ConnectHistoricalEnvelopeRepublish envelopes(java.util.List<String> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  /**
   * addEnvelopesItem.
   *
   * @return ConnectHistoricalEnvelopeRepublish
   **/
  public ConnectHistoricalEnvelopeRepublish addEnvelopesItem(String envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new java.util.ArrayList<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * .
   * @return envelopes
   **/
  @Schema(description = "")
  public java.util.List<String> getEnvelopes() {
    return envelopes;
  }

  /**
   * setEnvelopes.
   **/
  public void setEnvelopes(java.util.List<String> envelopes) {
    this.envelopes = envelopes;
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
    ConnectHistoricalEnvelopeRepublish connectHistoricalEnvelopeRepublish = (ConnectHistoricalEnvelopeRepublish) o;
    return Objects.equals(this.config, connectHistoricalEnvelopeRepublish.config) &&
        Objects.equals(this.envelopes, connectHistoricalEnvelopeRepublish.envelopes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(config, envelopes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectHistoricalEnvelopeRepublish {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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

