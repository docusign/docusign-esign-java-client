package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * The recipient details that are returned after you update the recipient..
 *
 */
@Schema(description = "The recipient details that are returned after you update the recipient.")

public class RecipientUpdateResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("combined")
  private String combined = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;


  /**
   * combined.
   *
   * @return RecipientUpdateResponse
   **/
  public RecipientUpdateResponse combined(String combined) {
    this.combined = combined;
    return this;
  }

  /**
   * .
   * @return combined
   **/
  @Schema(description = "")
  public String getCombined() {
    return combined;
  }

  /**
   * setCombined.
   **/
  public void setCombined(String combined) {
    this.combined = combined;
  }


  /**
   * errorDetails.
   *
   * @return RecipientUpdateResponse
   **/
  public RecipientUpdateResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * recipientId.
   *
   * @return RecipientUpdateResponse
   **/
  public RecipientUpdateResponse recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @Schema(description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * recipientIdGuid.
   *
   * @return RecipientUpdateResponse
   **/
  public RecipientUpdateResponse recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   * @return recipientIdGuid
   **/
  @Schema(description = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /**
   * setRecipientIdGuid.
   **/
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }


  /**
   * tabs.
   *
   * @return RecipientUpdateResponse
   **/
  public RecipientUpdateResponse tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * All of the tabs associated with the recipient..
   * @return tabs
   **/
  @Schema(description = "All of the tabs associated with the recipient.")
  public Tabs getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
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
    RecipientUpdateResponse recipientUpdateResponse = (RecipientUpdateResponse) o;
    return Objects.equals(this.combined, recipientUpdateResponse.combined) &&
        Objects.equals(this.errorDetails, recipientUpdateResponse.errorDetails) &&
        Objects.equals(this.recipientId, recipientUpdateResponse.recipientId) &&
        Objects.equals(this.recipientIdGuid, recipientUpdateResponse.recipientIdGuid) &&
        Objects.equals(this.tabs, recipientUpdateResponse.tabs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(combined, errorDetails, recipientId, recipientIdGuid, tabs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientUpdateResponse {\n");
    
    sb.append("    combined: ").append(toIndentedString(combined)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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

