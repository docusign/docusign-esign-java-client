package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class DocumentFieldsInformation   {
  
  private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();

  
  /**
   * The array of name/value custom data strings to be added to a document. Custom document field information is returned in the status, but otherwise is not used by DocuSign. The array contains the elements: \n\n* name – A string that can be a maximum of 50 characters. \n* value – A string that can be a maximum of 200 characters.\n\n*IMPORTANT*: If you are using xml, the name/value pair is contained in a nameValue element.
   **/
  
  @ApiModelProperty(value = "The array of name/value custom data strings to be added to a document. Custom document field information is returned in the status, but otherwise is not used by DocuSign. The array contains the elements: \n\n* name – A string that can be a maximum of 50 characters. \n* value – A string that can be a maximum of 200 characters.\n\n*IMPORTANT*: If you are using xml, the name/value pair is contained in a nameValue element.")
  @JsonProperty("documentFields")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }
  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentFieldsInformation documentFieldsInformation = (DocumentFieldsInformation) o;

    return true && Objects.equals(documentFields, documentFieldsInformation.documentFields)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFieldsInformation {\n");
    
    if (documentFields != null)
      sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
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

