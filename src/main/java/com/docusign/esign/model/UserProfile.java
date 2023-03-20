package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AddressInformation;
import com.docusign.esign.model.AuthenticationMethod;
import com.docusign.esign.model.UsageHistory;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserProfile.
 *
 */

public class UserProfile {
  @JsonProperty("address")
  private AddressInformation address = null;

  @JsonProperty("authenticationMethods")
  private java.util.List<AuthenticationMethod> authenticationMethods = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("displayOrganizationInfo")
  private String displayOrganizationInfo = null;

  @JsonProperty("displayPersonalInfo")
  private String displayPersonalInfo = null;

  @JsonProperty("displayProfile")
  private String displayProfile = null;

  @JsonProperty("displayUsageHistory")
  private String displayUsageHistory = null;

  @JsonProperty("profileImageUri")
  private String profileImageUri = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("usageHistory")
  private UsageHistory usageHistory = null;

  @JsonProperty("userDetails")
  private UserInformation userDetails = null;

  @JsonProperty("userProfileLastModifiedDate")
  private String userProfileLastModifiedDate = null;


  /**
   * address.
   *
   * @return UserProfile
   **/
  public UserProfile address(AddressInformation address) {
    this.address = address;
    return this;
  }

  /**
   * The user's address..
   * @return address
   **/
  @Schema(description = "The user's address.")
  public AddressInformation getAddress() {
    return address;
  }

  /**
   * setAddress.
   **/
  public void setAddress(AddressInformation address) {
    this.address = address;
  }


  /**
   * authenticationMethods.
   *
   * @return UserProfile
   **/
  public UserProfile authenticationMethods(java.util.List<AuthenticationMethod> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
    return this;
  }
  
  /**
   * addAuthenticationMethodsItem.
   *
   * @return UserProfile
   **/
  public UserProfile addAuthenticationMethodsItem(AuthenticationMethod authenticationMethodsItem) {
    if (this.authenticationMethods == null) {
      this.authenticationMethods = new java.util.ArrayList<>();
    }
    this.authenticationMethods.add(authenticationMethodsItem);
    return this;
  }

  /**
   * These properties cannot be modified in the PUT.   Indicates the authentication methods used by the user..
   * @return authenticationMethods
   **/
  @Schema(description = "These properties cannot be modified in the PUT.   Indicates the authentication methods used by the user.")
  public java.util.List<AuthenticationMethod> getAuthenticationMethods() {
    return authenticationMethods;
  }

  /**
   * setAuthenticationMethods.
   **/
  public void setAuthenticationMethods(java.util.List<AuthenticationMethod> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }


  /**
   * companyName.
   *
   * @return UserProfile
   **/
  public UserProfile companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The name of the user's Company..
   * @return companyName
   **/
  @Schema(description = "The name of the user's Company.")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * setCompanyName.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  /**
   * displayOrganizationInfo.
   *
   * @return UserProfile
   **/
  public UserProfile displayOrganizationInfo(String displayOrganizationInfo) {
    this.displayOrganizationInfo = displayOrganizationInfo;
    return this;
  }

  /**
   *  When set to **true**, the user's company and title information are shown on the ID card. .
   * @return displayOrganizationInfo
   **/
  @Schema(description = " When set to **true**, the user's company and title information are shown on the ID card. ")
  public String getDisplayOrganizationInfo() {
    return displayOrganizationInfo;
  }

  /**
   * setDisplayOrganizationInfo.
   **/
  public void setDisplayOrganizationInfo(String displayOrganizationInfo) {
    this.displayOrganizationInfo = displayOrganizationInfo;
  }


  /**
   * displayPersonalInfo.
   *
   * @return UserProfile
   **/
  public UserProfile displayPersonalInfo(String displayPersonalInfo) {
    this.displayPersonalInfo = displayPersonalInfo;
    return this;
  }

  /**
   * When set to **true**, the user's Address and Phone number are shown on the ID card..
   * @return displayPersonalInfo
   **/
  @Schema(description = "When set to **true**, the user's Address and Phone number are shown on the ID card.")
  public String getDisplayPersonalInfo() {
    return displayPersonalInfo;
  }

  /**
   * setDisplayPersonalInfo.
   **/
  public void setDisplayPersonalInfo(String displayPersonalInfo) {
    this.displayPersonalInfo = displayPersonalInfo;
  }


  /**
   * displayProfile.
   *
   * @return UserProfile
   **/
  public UserProfile displayProfile(String displayProfile) {
    this.displayProfile = displayProfile;
    return this;
  }

  /**
   * When set to **true**, the user's ID card can be viewed from signed documents and envelope history..
   * @return displayProfile
   **/
  @Schema(description = "When set to **true**, the user's ID card can be viewed from signed documents and envelope history.")
  public String getDisplayProfile() {
    return displayProfile;
  }

  /**
   * setDisplayProfile.
   **/
  public void setDisplayProfile(String displayProfile) {
    this.displayProfile = displayProfile;
  }


  /**
   * displayUsageHistory.
   *
   * @return UserProfile
   **/
  public UserProfile displayUsageHistory(String displayUsageHistory) {
    this.displayUsageHistory = displayUsageHistory;
    return this;
  }

  /**
   * When set to **true**, the user's usage information is shown on the ID card..
   * @return displayUsageHistory
   **/
  @Schema(description = "When set to **true**, the user's usage information is shown on the ID card.")
  public String getDisplayUsageHistory() {
    return displayUsageHistory;
  }

  /**
   * setDisplayUsageHistory.
   **/
  public void setDisplayUsageHistory(String displayUsageHistory) {
    this.displayUsageHistory = displayUsageHistory;
  }


  /**
   * profileImageUri.
   *
   * @return UserProfile
   **/
  public UserProfile profileImageUri(String profileImageUri) {
    this.profileImageUri = profileImageUri;
    return this;
  }

  /**
   * .
   * @return profileImageUri
   **/
  @Schema(description = "")
  public String getProfileImageUri() {
    return profileImageUri;
  }

  /**
   * setProfileImageUri.
   **/
  public void setProfileImageUri(String profileImageUri) {
    this.profileImageUri = profileImageUri;
  }


  /**
   * title.
   *
   * @return UserProfile
   **/
  public UserProfile title(String title) {
    this.title = title;
    return this;
  }

  /**
   * .
   * @return title
   **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  /**
   * setTitle.
   **/
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * usageHistory.
   *
   * @return UserProfile
   **/
  public UserProfile usageHistory(UsageHistory usageHistory) {
    this.usageHistory = usageHistory;
    return this;
  }

  /**
   * A complex element consisting of:   - `lastSentDateTime`: The date and time the user last sent an envelope.  - `lastSignedDateTime`: The date and time the user last signed an envelope. - `sentCount`: The number of envelopes the user has sent. - `signedCount`: The number of envelopes the user has signed.  .
   * @return usageHistory
   **/
  @Schema(description = "A complex element consisting of:   - `lastSentDateTime`: The date and time the user last sent an envelope.  - `lastSignedDateTime`: The date and time the user last signed an envelope. - `sentCount`: The number of envelopes the user has sent. - `signedCount`: The number of envelopes the user has signed.  ")
  public UsageHistory getUsageHistory() {
    return usageHistory;
  }

  /**
   * setUsageHistory.
   **/
  public void setUsageHistory(UsageHistory usageHistory) {
    this.usageHistory = usageHistory;
  }


  /**
   * userDetails.
   *
   * @return UserProfile
   **/
  public UserProfile userDetails(UserInformation userDetails) {
    this.userDetails = userDetails;
    return this;
  }

  /**
   * .
   * @return userDetails
   **/
  @Schema(description = "")
  public UserInformation getUserDetails() {
    return userDetails;
  }

  /**
   * setUserDetails.
   **/
  public void setUserDetails(UserInformation userDetails) {
    this.userDetails = userDetails;
  }


  /**
   * userProfileLastModifiedDate.
   *
   * @return UserProfile
   **/
  public UserProfile userProfileLastModifiedDate(String userProfileLastModifiedDate) {
    this.userProfileLastModifiedDate = userProfileLastModifiedDate;
    return this;
  }

  /**
   * .
   * @return userProfileLastModifiedDate
   **/
  @Schema(description = "")
  public String getUserProfileLastModifiedDate() {
    return userProfileLastModifiedDate;
  }

  /**
   * setUserProfileLastModifiedDate.
   **/
  public void setUserProfileLastModifiedDate(String userProfileLastModifiedDate) {
    this.userProfileLastModifiedDate = userProfileLastModifiedDate;
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
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.address, userProfile.address) &&
        Objects.equals(this.authenticationMethods, userProfile.authenticationMethods) &&
        Objects.equals(this.companyName, userProfile.companyName) &&
        Objects.equals(this.displayOrganizationInfo, userProfile.displayOrganizationInfo) &&
        Objects.equals(this.displayPersonalInfo, userProfile.displayPersonalInfo) &&
        Objects.equals(this.displayProfile, userProfile.displayProfile) &&
        Objects.equals(this.displayUsageHistory, userProfile.displayUsageHistory) &&
        Objects.equals(this.profileImageUri, userProfile.profileImageUri) &&
        Objects.equals(this.title, userProfile.title) &&
        Objects.equals(this.usageHistory, userProfile.usageHistory) &&
        Objects.equals(this.userDetails, userProfile.userDetails) &&
        Objects.equals(this.userProfileLastModifiedDate, userProfile.userProfileLastModifiedDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(address, authenticationMethods, companyName, displayOrganizationInfo, displayPersonalInfo, displayProfile, displayUsageHistory, profileImageUri, title, usageHistory, userDetails, userProfileLastModifiedDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    displayOrganizationInfo: ").append(toIndentedString(displayOrganizationInfo)).append("\n");
    sb.append("    displayPersonalInfo: ").append(toIndentedString(displayPersonalInfo)).append("\n");
    sb.append("    displayProfile: ").append(toIndentedString(displayProfile)).append("\n");
    sb.append("    displayUsageHistory: ").append(toIndentedString(displayUsageHistory)).append("\n");
    sb.append("    profileImageUri: ").append(toIndentedString(profileImageUri)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    usageHistory: ").append(toIndentedString(usageHistory)).append("\n");
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
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

