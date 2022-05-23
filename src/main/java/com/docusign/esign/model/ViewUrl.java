package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ViewUrl. */
public class ViewUrl {
  @JsonProperty("url")
  private String url = null;

  /**
   * url.
   *
   * @return ViewUrl
   */
  public ViewUrl url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The view URL to be navigated to..
   *
   * @return url
   */
  @ApiModelProperty(value = "The view URL to be navigated to.")
  public String getUrl() {
    return url;
  }

  /** setUrl. */
  public void setUrl(String url) {
    this.url = url;
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
    ViewUrl viewUrl = (ViewUrl) o;
    return Objects.equals(this.url, viewUrl.url);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewUrl {\n");

    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
