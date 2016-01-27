package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.RecipientUpdateResponse;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientsUpdateSummary recipientsUpdateSummary = (RecipientsUpdateSummary) o;
    return Objects.equals(recipientUpdateResults, recipientsUpdateSummary.recipientUpdateResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientUpdateResults);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientsUpdateSummary {\n");
    
    sb.append("    recipientUpdateResults: ").append(StringUtil.toIndentedString(recipientUpdateResults)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
