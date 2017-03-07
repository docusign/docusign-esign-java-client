package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A complex element that has up to four Question/Answer pairs for forgotten password information.
 **/

@ApiModel(description = "A complex element that has up to four Question/Answer pairs for forgotten password information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ForgottenPasswordInformation   {
  
  private String forgottenPasswordAnswer1 = null;
  private String forgottenPasswordAnswer2 = null;
  private String forgottenPasswordAnswer3 = null;
  private String forgottenPasswordAnswer4 = null;
  private String forgottenPasswordQuestion1 = null;
  private String forgottenPasswordQuestion2 = null;
  private String forgottenPasswordQuestion3 = null;
  private String forgottenPasswordQuestion4 = null;

  
  /**
   * The answer to the first forgotten password challenge question.
   **/
  
  @ApiModelProperty(value = "The answer to the first forgotten password challenge question.")
  @JsonProperty("forgottenPasswordAnswer1")
  public String getForgottenPasswordAnswer1() {
    return forgottenPasswordAnswer1;
  }
  public void setForgottenPasswordAnswer1(String forgottenPasswordAnswer1) {
    this.forgottenPasswordAnswer1 = forgottenPasswordAnswer1;
  }

  
  /**
   * The answer to the second forgotten password challenge question.
   **/
  
  @ApiModelProperty(value = "The answer to the second forgotten password challenge question.")
  @JsonProperty("forgottenPasswordAnswer2")
  public String getForgottenPasswordAnswer2() {
    return forgottenPasswordAnswer2;
  }
  public void setForgottenPasswordAnswer2(String forgottenPasswordAnswer2) {
    this.forgottenPasswordAnswer2 = forgottenPasswordAnswer2;
  }

  
  /**
   * The answer to the third forgotten password challenge question.
   **/
  
  @ApiModelProperty(value = "The answer to the third forgotten password challenge question.")
  @JsonProperty("forgottenPasswordAnswer3")
  public String getForgottenPasswordAnswer3() {
    return forgottenPasswordAnswer3;
  }
  public void setForgottenPasswordAnswer3(String forgottenPasswordAnswer3) {
    this.forgottenPasswordAnswer3 = forgottenPasswordAnswer3;
  }

  
  /**
   * The answer to the fourth forgotten password challenge question.
   **/
  
  @ApiModelProperty(value = "The answer to the fourth forgotten password challenge question.")
  @JsonProperty("forgottenPasswordAnswer4")
  public String getForgottenPasswordAnswer4() {
    return forgottenPasswordAnswer4;
  }
  public void setForgottenPasswordAnswer4(String forgottenPasswordAnswer4) {
    this.forgottenPasswordAnswer4 = forgottenPasswordAnswer4;
  }

  
  /**
   * The first challenge question presented to a user who has forgotten their password.
   **/
  
  @ApiModelProperty(value = "The first challenge question presented to a user who has forgotten their password.")
  @JsonProperty("forgottenPasswordQuestion1")
  public String getForgottenPasswordQuestion1() {
    return forgottenPasswordQuestion1;
  }
  public void setForgottenPasswordQuestion1(String forgottenPasswordQuestion1) {
    this.forgottenPasswordQuestion1 = forgottenPasswordQuestion1;
  }

  
  /**
   * The second challenge question presented to a user who has forgotten their password.
   **/
  
  @ApiModelProperty(value = "The second challenge question presented to a user who has forgotten their password.")
  @JsonProperty("forgottenPasswordQuestion2")
  public String getForgottenPasswordQuestion2() {
    return forgottenPasswordQuestion2;
  }
  public void setForgottenPasswordQuestion2(String forgottenPasswordQuestion2) {
    this.forgottenPasswordQuestion2 = forgottenPasswordQuestion2;
  }

  
  /**
   * The third challenge question presented to a user who has forgotten their password.
   **/
  
  @ApiModelProperty(value = "The third challenge question presented to a user who has forgotten their password.")
  @JsonProperty("forgottenPasswordQuestion3")
  public String getForgottenPasswordQuestion3() {
    return forgottenPasswordQuestion3;
  }
  public void setForgottenPasswordQuestion3(String forgottenPasswordQuestion3) {
    this.forgottenPasswordQuestion3 = forgottenPasswordQuestion3;
  }

  
  /**
   * The fourth challenge question presented to a user who has forgotten their password.
   **/
  
  @ApiModelProperty(value = "The fourth challenge question presented to a user who has forgotten their password.")
  @JsonProperty("forgottenPasswordQuestion4")
  public String getForgottenPasswordQuestion4() {
    return forgottenPasswordQuestion4;
  }
  public void setForgottenPasswordQuestion4(String forgottenPasswordQuestion4) {
    this.forgottenPasswordQuestion4 = forgottenPasswordQuestion4;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgottenPasswordInformation forgottenPasswordInformation = (ForgottenPasswordInformation) o;

    return true && Objects.equals(forgottenPasswordAnswer1, forgottenPasswordInformation.forgottenPasswordAnswer1) &&
        Objects.equals(forgottenPasswordAnswer2, forgottenPasswordInformation.forgottenPasswordAnswer2) &&
        Objects.equals(forgottenPasswordAnswer3, forgottenPasswordInformation.forgottenPasswordAnswer3) &&
        Objects.equals(forgottenPasswordAnswer4, forgottenPasswordInformation.forgottenPasswordAnswer4) &&
        Objects.equals(forgottenPasswordQuestion1, forgottenPasswordInformation.forgottenPasswordQuestion1) &&
        Objects.equals(forgottenPasswordQuestion2, forgottenPasswordInformation.forgottenPasswordQuestion2) &&
        Objects.equals(forgottenPasswordQuestion3, forgottenPasswordInformation.forgottenPasswordQuestion3) &&
        Objects.equals(forgottenPasswordQuestion4, forgottenPasswordInformation.forgottenPasswordQuestion4)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(forgottenPasswordAnswer1, forgottenPasswordAnswer2, forgottenPasswordAnswer3, forgottenPasswordAnswer4, forgottenPasswordQuestion1, forgottenPasswordQuestion2, forgottenPasswordQuestion3, forgottenPasswordQuestion4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgottenPasswordInformation {\n");
    
    if (forgottenPasswordAnswer1 != null)
      sb.append("    forgottenPasswordAnswer1: ").append(toIndentedString(forgottenPasswordAnswer1)).append("\n");
    if (forgottenPasswordAnswer2 != null)
      sb.append("    forgottenPasswordAnswer2: ").append(toIndentedString(forgottenPasswordAnswer2)).append("\n");
    if (forgottenPasswordAnswer3 != null)
      sb.append("    forgottenPasswordAnswer3: ").append(toIndentedString(forgottenPasswordAnswer3)).append("\n");
    if (forgottenPasswordAnswer4 != null)
      sb.append("    forgottenPasswordAnswer4: ").append(toIndentedString(forgottenPasswordAnswer4)).append("\n");
    if (forgottenPasswordQuestion1 != null)
      sb.append("    forgottenPasswordQuestion1: ").append(toIndentedString(forgottenPasswordQuestion1)).append("\n");
    if (forgottenPasswordQuestion2 != null)
      sb.append("    forgottenPasswordQuestion2: ").append(toIndentedString(forgottenPasswordQuestion2)).append("\n");
    if (forgottenPasswordQuestion3 != null)
      sb.append("    forgottenPasswordQuestion3: ").append(toIndentedString(forgottenPasswordQuestion3)).append("\n");
    if (forgottenPasswordQuestion4 != null)
      sb.append("    forgottenPasswordQuestion4: ").append(toIndentedString(forgottenPasswordQuestion4)).append("\n");
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

