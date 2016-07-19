package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RecipientUpdateResponse   {
  
  private String recipientId = null;
  private Tabs tabs = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  public RecipientUpdateResponse recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   **/
  public RecipientUpdateResponse tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tabs")
  public Tabs getTabs() {
    return tabs;
  }
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  
  /**
   **/
  public RecipientUpdateResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientUpdateResponse recipientUpdateResponse = (RecipientUpdateResponse) o;
    return Objects.equals(this.recipientId, recipientUpdateResponse.recipientId) &&
        Objects.equals(this.tabs, recipientUpdateResponse.tabs) &&
        Objects.equals(this.errorDetails, recipientUpdateResponse.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, tabs, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientUpdateResponse {\n");
    
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

