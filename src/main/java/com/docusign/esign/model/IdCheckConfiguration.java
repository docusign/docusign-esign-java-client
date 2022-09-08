package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.IdCheckSecurityStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex object specifying ID check configuration..
 *
 */
@ApiModel(description = "A complex object specifying ID check configuration.")

public class IdCheckConfiguration {
  @JsonProperty("authSteps")
  private java.util.List<IdCheckSecurityStep> authSteps = null;

  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * authSteps.
   *
   * @return IdCheckConfiguration
   **/
  public IdCheckConfiguration authSteps(java.util.List<IdCheckSecurityStep> authSteps) {
    this.authSteps = authSteps;
    return this;
  }
  
  /**
   * addAuthStepsItem.
   *
   * @return IdCheckConfiguration
   **/
  public IdCheckConfiguration addAuthStepsItem(IdCheckSecurityStep authStepsItem) {
    if (this.authSteps == null) {
      this.authSteps = new java.util.ArrayList<>();
    }
    this.authSteps.add(authStepsItem);
    return this;
  }

  /**
   * .
   * @return authSteps
   **/
  @ApiModelProperty(value = "")
  public java.util.List<IdCheckSecurityStep> getAuthSteps() {
    return authSteps;
  }

  /**
   * setAuthSteps.
   **/
  public void setAuthSteps(java.util.List<IdCheckSecurityStep> authSteps) {
    this.authSteps = authSteps;
  }


  /**
   * isDefault.
   *
   * @return IdCheckConfiguration
   **/
  public IdCheckConfiguration isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * .
   * @return isDefault
   **/
  @ApiModelProperty(value = "")
  public String getIsDefault() {
    return isDefault;
  }

  /**
   * setIsDefault.
   **/
  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }


  /**
   * name.
   *
   * @return IdCheckConfiguration
   **/
  public IdCheckConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
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
    IdCheckConfiguration idCheckConfiguration = (IdCheckConfiguration) o;
    return Objects.equals(this.authSteps, idCheckConfiguration.authSteps) &&
        Objects.equals(this.isDefault, idCheckConfiguration.isDefault) &&
        Objects.equals(this.name, idCheckConfiguration.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authSteps, isDefault, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCheckConfiguration {\n");
    
    sb.append("    authSteps: ").append(toIndentedString(authSteps)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

