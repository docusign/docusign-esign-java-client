package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.RecipientUpdateResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientsUpdateSummary   {
  
  private java.util.List<RecipientUpdateResponse> recipientUpdateResults = new java.util.ArrayList<RecipientUpdateResponse>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientUpdateResults")
  public java.util.List<RecipientUpdateResponse> getRecipientUpdateResults() {
    return recipientUpdateResults;
  }
  public void setRecipientUpdateResults(java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientsUpdateSummary recipientsUpdateSummary = (RecipientsUpdateSummary) o;

    return true && Objects.equals(recipientUpdateResults, recipientsUpdateSummary.recipientUpdateResults)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientUpdateResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientsUpdateSummary {\n");
    
    if (recipientUpdateResults != null)
      sb.append("    recipientUpdateResults: ").append(toIndentedString(recipientUpdateResults)).append("\n");
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

