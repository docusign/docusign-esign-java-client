package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentHtmlDisplaySettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDisplayAnchor
 */

public class DocumentHtmlDisplayAnchor {
  @JsonProperty("caseSensitive")
  private Boolean caseSensitive = null;

  @JsonProperty("displaySettings")
  private DocumentHtmlDisplaySettings displaySettings = null;

  @JsonProperty("endAnchor")
  private String endAnchor = null;

  @JsonProperty("removeEndAnchor")
  private Boolean removeEndAnchor = null;

  @JsonProperty("removeStartAnchor")
  private Boolean removeStartAnchor = null;

  @JsonProperty("startAnchor")
  private String startAnchor = null;

  public DocumentHtmlDisplayAnchor caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * 
   * @return caseSensitive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public DocumentHtmlDisplayAnchor displaySettings(DocumentHtmlDisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
    return this;
  }

   /**
   * Get displaySettings
   * @return displaySettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public DocumentHtmlDisplaySettings getDisplaySettings() {
    return displaySettings;
  }

  public void setDisplaySettings(DocumentHtmlDisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }

  public DocumentHtmlDisplayAnchor endAnchor(String endAnchor) {
    this.endAnchor = endAnchor;
    return this;
  }

   /**
   * 
   * @return endAnchor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndAnchor() {
    return endAnchor;
  }

  public void setEndAnchor(String endAnchor) {
    this.endAnchor = endAnchor;
  }

  public DocumentHtmlDisplayAnchor removeEndAnchor(Boolean removeEndAnchor) {
    this.removeEndAnchor = removeEndAnchor;
    return this;
  }

   /**
   * 
   * @return removeEndAnchor
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRemoveEndAnchor() {
    return removeEndAnchor;
  }

  public void setRemoveEndAnchor(Boolean removeEndAnchor) {
    this.removeEndAnchor = removeEndAnchor;
  }

  public DocumentHtmlDisplayAnchor removeStartAnchor(Boolean removeStartAnchor) {
    this.removeStartAnchor = removeStartAnchor;
    return this;
  }

   /**
   * 
   * @return removeStartAnchor
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRemoveStartAnchor() {
    return removeStartAnchor;
  }

  public void setRemoveStartAnchor(Boolean removeStartAnchor) {
    this.removeStartAnchor = removeStartAnchor;
  }

  public DocumentHtmlDisplayAnchor startAnchor(String startAnchor) {
    this.startAnchor = startAnchor;
    return this;
  }

   /**
   * 
   * @return startAnchor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartAnchor() {
    return startAnchor;
  }

  public void setStartAnchor(String startAnchor) {
    this.startAnchor = startAnchor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentHtmlDisplayAnchor documentHtmlDisplayAnchor = (DocumentHtmlDisplayAnchor) o;
    return Objects.equals(this.caseSensitive, documentHtmlDisplayAnchor.caseSensitive) &&
        Objects.equals(this.displaySettings, documentHtmlDisplayAnchor.displaySettings) &&
        Objects.equals(this.endAnchor, documentHtmlDisplayAnchor.endAnchor) &&
        Objects.equals(this.removeEndAnchor, documentHtmlDisplayAnchor.removeEndAnchor) &&
        Objects.equals(this.removeStartAnchor, documentHtmlDisplayAnchor.removeStartAnchor) &&
        Objects.equals(this.startAnchor, documentHtmlDisplayAnchor.startAnchor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, displaySettings, endAnchor, removeEndAnchor, removeStartAnchor, startAnchor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDisplayAnchor {\n");
    
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    endAnchor: ").append(toIndentedString(endAnchor)).append("\n");
    sb.append("    removeEndAnchor: ").append(toIndentedString(removeEndAnchor)).append("\n");
    sb.append("    removeStartAnchor: ").append(toIndentedString(removeStartAnchor)).append("\n");
    sb.append("    startAnchor: ").append(toIndentedString(startAnchor)).append("\n");
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

