package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformationV2;
import com.docusign.esign.model.AuthenticationMethod;
import com.docusign.esign.model.UsageHistory;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserProfile   {
  
  private AddressInformationV2 address = null;
  private java.util.List<AuthenticationMethod> authenticationMethods = new java.util.ArrayList<AuthenticationMethod>();
  private String companyName = null;
  private String displayOrganizationInfo = null;
  private String displayPersonalInfo = null;
  private String displayProfile = null;
  private String displayUsageHistory = null;
  private String profileImageUri = null;
  private String title = null;
  private UsageHistory usageHistory = null;
  private UserInformation userDetails = null;
  private String userProfileLastModifiedDate = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public AddressInformationV2 getAddress() {
    return address;
  }
  public void setAddress(AddressInformationV2 address) {
    this.address = address;
  }

  
  /**
   * These properties cannot be modified in the PUT. \n\nIndicates the authentication methods used by the user.
   **/
  
  @ApiModelProperty(value = "These properties cannot be modified in the PUT. \n\nIndicates the authentication methods used by the user.")
  @JsonProperty("authenticationMethods")
  public java.util.List<AuthenticationMethod> getAuthenticationMethods() {
    return authenticationMethods;
  }
  public void setAuthenticationMethods(java.util.List<AuthenticationMethod> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }

  
  /**
   * The name of the user's Company.
   **/
  
  @ApiModelProperty(value = "The name of the user's Company.")
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  /**
   * When set to **true**, the user's company and title information are shown on the ID card.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the user's company and title information are shown on the ID card.")
  @JsonProperty("displayOrganizationInfo")
  public String getDisplayOrganizationInfo() {
    return displayOrganizationInfo;
  }
  public void setDisplayOrganizationInfo(String displayOrganizationInfo) {
    this.displayOrganizationInfo = displayOrganizationInfo;
  }

  
  /**
   * When set to **true**, the user's Address and Phone number are shown on the ID card.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the user's Address and Phone number are shown on the ID card.")
  @JsonProperty("displayPersonalInfo")
  public String getDisplayPersonalInfo() {
    return displayPersonalInfo;
  }
  public void setDisplayPersonalInfo(String displayPersonalInfo) {
    this.displayPersonalInfo = displayPersonalInfo;
  }

  
  /**
   * When set to **true**, the user's ID card can be viewed from signed documents and envelope history.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the user's ID card can be viewed from signed documents and envelope history.")
  @JsonProperty("displayProfile")
  public String getDisplayProfile() {
    return displayProfile;
  }
  public void setDisplayProfile(String displayProfile) {
    this.displayProfile = displayProfile;
  }

  
  /**
   * When set to **true**, the user's usage information is shown on the ID card.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the user's usage information is shown on the ID card.")
  @JsonProperty("displayUsageHistory")
  public String getDisplayUsageHistory() {
    return displayUsageHistory;
  }
  public void setDisplayUsageHistory(String displayUsageHistory) {
    this.displayUsageHistory = displayUsageHistory;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileImageUri")
  public String getProfileImageUri() {
    return profileImageUri;
  }
  public void setProfileImageUri(String profileImageUri) {
    this.profileImageUri = profileImageUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usageHistory")
  public UsageHistory getUsageHistory() {
    return usageHistory;
  }
  public void setUsageHistory(UsageHistory usageHistory) {
    this.usageHistory = usageHistory;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userDetails")
  public UserInformation getUserDetails() {
    return userDetails;
  }
  public void setUserDetails(UserInformation userDetails) {
    this.userDetails = userDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userProfileLastModifiedDate")
  public String getUserProfileLastModifiedDate() {
    return userProfileLastModifiedDate;
  }
  public void setUserProfileLastModifiedDate(String userProfileLastModifiedDate) {
    this.userProfileLastModifiedDate = userProfileLastModifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;

    return true && Objects.equals(address, userProfile.address) &&
        Objects.equals(authenticationMethods, userProfile.authenticationMethods) &&
        Objects.equals(companyName, userProfile.companyName) &&
        Objects.equals(displayOrganizationInfo, userProfile.displayOrganizationInfo) &&
        Objects.equals(displayPersonalInfo, userProfile.displayPersonalInfo) &&
        Objects.equals(displayProfile, userProfile.displayProfile) &&
        Objects.equals(displayUsageHistory, userProfile.displayUsageHistory) &&
        Objects.equals(profileImageUri, userProfile.profileImageUri) &&
        Objects.equals(title, userProfile.title) &&
        Objects.equals(usageHistory, userProfile.usageHistory) &&
        Objects.equals(userDetails, userProfile.userDetails) &&
        Objects.equals(userProfileLastModifiedDate, userProfile.userProfileLastModifiedDate)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, authenticationMethods, companyName, displayOrganizationInfo, displayPersonalInfo, displayProfile, displayUsageHistory, profileImageUri, title, usageHistory, userDetails, userProfileLastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    if (address != null)
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
    if (authenticationMethods != null)
      sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    if (companyName != null)
      sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    if (displayOrganizationInfo != null)
      sb.append("    displayOrganizationInfo: ").append(toIndentedString(displayOrganizationInfo)).append("\n");
    if (displayPersonalInfo != null)
      sb.append("    displayPersonalInfo: ").append(toIndentedString(displayPersonalInfo)).append("\n");
    if (displayProfile != null)
      sb.append("    displayProfile: ").append(toIndentedString(displayProfile)).append("\n");
    if (displayUsageHistory != null)
      sb.append("    displayUsageHistory: ").append(toIndentedString(displayUsageHistory)).append("\n");
    if (profileImageUri != null)
      sb.append("    profileImageUri: ").append(toIndentedString(profileImageUri)).append("\n");
    if (title != null)
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
    if (usageHistory != null)
      sb.append("    usageHistory: ").append(toIndentedString(usageHistory)).append("\n");
    if (userDetails != null)
      sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
    if (userProfileLastModifiedDate != null)
      sb.append("    userProfileLastModifiedDate: ").append(toIndentedString(userProfileLastModifiedDate)).append("\n");
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

