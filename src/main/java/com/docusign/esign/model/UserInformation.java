package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformationV2;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ForgottenPasswordInformation;
import com.docusign.esign.model.Group;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.UserAccountManagementGranularInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserInformation
 */

public class UserInformation {
  @JsonProperty("accountManagementGranular")
  private UserAccountManagementGranularInformation accountManagementGranular = null;

  @JsonProperty("activationAccessCode")
  private String activationAccessCode = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("customSettings")
  private java.util.List<NameValue> customSettings = new java.util.ArrayList<NameValue>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("enableConnectForUser")
  private String enableConnectForUser = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("forgottenPasswordInfo")
  private ForgottenPasswordInformation forgottenPasswordInfo = null;

  @JsonProperty("groupList")
  private java.util.List<Group> groupList = new java.util.ArrayList<Group>();

  @JsonProperty("homeAddress")
  private AddressInformationV2 homeAddress = null;

  @JsonProperty("initialsImageUri")
  private String initialsImageUri = null;

  @JsonProperty("isAdmin")
  private String isAdmin = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("lastLogin")
  private String lastLogin = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("loginStatus")
  private String loginStatus = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("passwordExpiration")
  private String passwordExpiration = null;

  @JsonProperty("permissionProfileId")
  private String permissionProfileId = null;

  @JsonProperty("permissionProfileName")
  private String permissionProfileName = null;

  @JsonProperty("profileImageUri")
  private String profileImageUri = null;

  @JsonProperty("sendActivationEmail")
  private String sendActivationEmail = null;

  @JsonProperty("sendActivationOnInvalidLogin")
  private String sendActivationOnInvalidLogin = null;

  @JsonProperty("signatureImageUri")
  private String signatureImageUri = null;

  @JsonProperty("subscribe")
  private String subscribe = null;

  @JsonProperty("suffixName")
  private String suffixName = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userProfileLastModifiedDate")
  private String userProfileLastModifiedDate = null;

  @JsonProperty("userSettings")
  private java.util.List<NameValue> userSettings = new java.util.ArrayList<NameValue>();

  @JsonProperty("userStatus")
  private String userStatus = null;

  @JsonProperty("userType")
  private String userType = null;

  @JsonProperty("workAddress")
  private AddressInformationV2 workAddress = null;

  public UserInformation accountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
    return this;
  }

   /**
   * Get accountManagementGranular
   * @return accountManagementGranular
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserAccountManagementGranularInformation getAccountManagementGranular() {
    return accountManagementGranular;
  }

  public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
  }

  public UserInformation activationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
    return this;
  }

   /**
   * The activation code the new user must enter when activating their account.
   * @return activationAccessCode
  **/
  @ApiModelProperty(example = "null", value = "The activation code the new user must enter when activating their account.")
  public String getActivationAccessCode() {
    return activationAccessCode;
  }

  public void setActivationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
  }

  public UserInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public UserInformation createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Indicates the date and time the item was created.
   * @return createdDateTime
  **/
  @ApiModelProperty(example = "null", value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public UserInformation customSettings(java.util.List<NameValue> customSettings) {
    this.customSettings = customSettings;
    return this;
  }

  public UserInformation addCustomSettingsItem(NameValue customSettingsItem) {
    this.customSettings.add(customSettingsItem);
    return this;
  }

   /**
   * The name/value pair information for the user custom setting.
   * @return customSettings
  **/
  @ApiModelProperty(example = "null", value = "The name/value pair information for the user custom setting.")
  public java.util.List<NameValue> getCustomSettings() {
    return customSettings;
  }

  public void setCustomSettings(java.util.List<NameValue> customSettings) {
    this.customSettings = customSettings;
  }

  public UserInformation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInformation enableConnectForUser(String enableConnectForUser) {
    this.enableConnectForUser = enableConnectForUser;
    return this;
  }

   /**
   * Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.
   * @return enableConnectForUser
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.")
  public String getEnableConnectForUser() {
    return enableConnectForUser;
  }

  public void setEnableConnectForUser(String enableConnectForUser) {
    this.enableConnectForUser = enableConnectForUser;
  }

  public UserInformation errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public UserInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user's first name.  Maximum Length: 50 characters.
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserInformation forgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
    return this;
  }

   /**
   * Get forgottenPasswordInfo
   * @return forgottenPasswordInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public ForgottenPasswordInformation getForgottenPasswordInfo() {
    return forgottenPasswordInfo;
  }

  public void setForgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
  }

  public UserInformation groupList(java.util.List<Group> groupList) {
    this.groupList = groupList;
    return this;
  }

  public UserInformation addGroupListItem(Group groupListItem) {
    this.groupList.add(groupListItem);
    return this;
  }

   /**
   * A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId.   The parameters are:  * groupId - The DocuSign group ID for the group. * groupName - The name of the group * permissionProfileId - The ID of the permission profile associated with the group. * groupType - The group type. 
   * @return groupList
  **/
  @ApiModelProperty(example = "null", value = "A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId.   The parameters are:  * groupId - The DocuSign group ID for the group. * groupName - The name of the group * permissionProfileId - The ID of the permission profile associated with the group. * groupType - The group type. ")
  public java.util.List<Group> getGroupList() {
    return groupList;
  }

  public void setGroupList(java.util.List<Group> groupList) {
    this.groupList = groupList;
  }

  public UserInformation homeAddress(AddressInformationV2 homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

   /**
   * Get homeAddress
   * @return homeAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressInformationV2 getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(AddressInformationV2 homeAddress) {
    this.homeAddress = homeAddress;
  }

  public UserInformation initialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
    return this;
  }

   /**
   * Contains the URI for an endpoint that you can use to retrieve the initials image.
   * @return initialsImageUri
  **/
  @ApiModelProperty(example = "null", value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
  public String getInitialsImageUri() {
    return initialsImageUri;
  }

  public void setInitialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
  }

  public UserInformation isAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Determines if the feature set is actively set as part of the plan.
   * @return isAdmin
  **/
  @ApiModelProperty(example = "null", value = "Determines if the feature set is actively set as part of the plan.")
  public String getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }

  public UserInformation jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * 
   * @return jobTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public UserInformation lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Shows the date-time when the user last logged on to the system.
   * @return lastLogin
  **/
  @ApiModelProperty(example = "null", value = "Shows the date-time when the user last logged on to the system.")
  public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public UserInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The user's last name.  Maximum Length: 50 characters.
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "The user's last name.  Maximum Length: 50 characters.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserInformation loginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
    return this;
  }

   /**
   * Shows the current status of the user's password. Possible values are:   * password_reset * password_active * password_expired * password_locked * password_reset_failed  
   * @return loginStatus
  **/
  @ApiModelProperty(example = "null", value = "Shows the current status of the user's password. Possible values are:   * password_reset * password_active * password_expired * password_locked * password_reset_failed  ")
  public String getLoginStatus() {
    return loginStatus;
  }

  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }

  public UserInformation middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The user's middle name.  Maximum Length: 50 characters.
   * @return middleName
  **/
  @ApiModelProperty(example = "null", value = "The user's middle name.  Maximum Length: 50 characters.")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public UserInformation password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserInformation passwordExpiration(String passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
    return this;
  }

   /**
   * 
   * @return passwordExpiration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPasswordExpiration() {
    return passwordExpiration;
  }

  public void setPasswordExpiration(String passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
  }

  public UserInformation permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

   /**
   * 
   * @return permissionProfileId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  public UserInformation permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

   /**
   * 
   * @return permissionProfileName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }

  public UserInformation profileImageUri(String profileImageUri) {
    this.profileImageUri = profileImageUri;
    return this;
  }

   /**
   * 
   * @return profileImageUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProfileImageUri() {
    return profileImageUri;
  }

  public void setProfileImageUri(String profileImageUri) {
    this.profileImageUri = profileImageUri;
  }

  public UserInformation sendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
    return this;
  }

   /**
   * 
   * @return sendActivationEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSendActivationEmail() {
    return sendActivationEmail;
  }

  public void setSendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
  }

  public UserInformation sendActivationOnInvalidLogin(String sendActivationOnInvalidLogin) {
    this.sendActivationOnInvalidLogin = sendActivationOnInvalidLogin;
    return this;
  }

   /**
   * When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account. 
   * @return sendActivationOnInvalidLogin
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account. ")
  public String getSendActivationOnInvalidLogin() {
    return sendActivationOnInvalidLogin;
  }

  public void setSendActivationOnInvalidLogin(String sendActivationOnInvalidLogin) {
    this.sendActivationOnInvalidLogin = sendActivationOnInvalidLogin;
  }

  public UserInformation signatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
    return this;
  }

   /**
   * Contains the URI for an endpoint that you can use to retrieve the signature image.
   * @return signatureImageUri
  **/
  @ApiModelProperty(example = "null", value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
  public String getSignatureImageUri() {
    return signatureImageUri;
  }

  public void setSignatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
  }

  public UserInformation subscribe(String subscribe) {
    this.subscribe = subscribe;
    return this;
  }

   /**
   * 
   * @return subscribe
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubscribe() {
    return subscribe;
  }

  public void setSubscribe(String subscribe) {
    this.subscribe = subscribe;
  }

  public UserInformation suffixName(String suffixName) {
    this.suffixName = suffixName;
    return this;
  }

   /**
   * The suffix for the user's name.   Maximum Length: 50 characters. 
   * @return suffixName
  **/
  @ApiModelProperty(example = "null", value = "The suffix for the user's name.   Maximum Length: 50 characters. ")
  public String getSuffixName() {
    return suffixName;
  }

  public void setSuffixName(String suffixName) {
    this.suffixName = suffixName;
  }

  public UserInformation title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the user.
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "The title of the user.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserInformation uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public UserInformation userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserInformation userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserInformation userProfileLastModifiedDate(String userProfileLastModifiedDate) {
    this.userProfileLastModifiedDate = userProfileLastModifiedDate;
    return this;
  }

   /**
   * 
   * @return userProfileLastModifiedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserProfileLastModifiedDate() {
    return userProfileLastModifiedDate;
  }

  public void setUserProfileLastModifiedDate(String userProfileLastModifiedDate) {
    this.userProfileLastModifiedDate = userProfileLastModifiedDate;
  }

  public UserInformation userSettings(java.util.List<NameValue> userSettings) {
    this.userSettings = userSettings;
    return this;
  }

  public UserInformation addUserSettingsItem(NameValue userSettingsItem) {
    this.userSettings.add(userSettingsItem);
    return this;
  }

   /**
   *  The name/value pair information for user settings. These determine the actions that a user can take in the account. The `[ML:userSettings]` are listed and described below.
   * @return userSettings
  **/
  @ApiModelProperty(example = "null", value = " The name/value pair information for user settings. These determine the actions that a user can take in the account. The `[ML:userSettings]` are listed and described below.")
  public java.util.List<NameValue> getUserSettings() {
    return userSettings;
  }

  public void setUserSettings(java.util.List<NameValue> userSettings) {
    this.userSettings = userSettings;
  }

  public UserInformation userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

   /**
   * 
   * @return userStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  public UserInformation userType(String userType) {
    this.userType = userType;
    return this;
  }

   /**
   * 
   * @return userType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public UserInformation workAddress(AddressInformationV2 workAddress) {
    this.workAddress = workAddress;
    return this;
  }

   /**
   * Get workAddress
   * @return workAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressInformationV2 getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(AddressInformationV2 workAddress) {
    this.workAddress = workAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInformation userInformation = (UserInformation) o;
    return Objects.equals(this.accountManagementGranular, userInformation.accountManagementGranular) &&
        Objects.equals(this.activationAccessCode, userInformation.activationAccessCode) &&
        Objects.equals(this.countryCode, userInformation.countryCode) &&
        Objects.equals(this.createdDateTime, userInformation.createdDateTime) &&
        Objects.equals(this.customSettings, userInformation.customSettings) &&
        Objects.equals(this.email, userInformation.email) &&
        Objects.equals(this.enableConnectForUser, userInformation.enableConnectForUser) &&
        Objects.equals(this.errorDetails, userInformation.errorDetails) &&
        Objects.equals(this.firstName, userInformation.firstName) &&
        Objects.equals(this.forgottenPasswordInfo, userInformation.forgottenPasswordInfo) &&
        Objects.equals(this.groupList, userInformation.groupList) &&
        Objects.equals(this.homeAddress, userInformation.homeAddress) &&
        Objects.equals(this.initialsImageUri, userInformation.initialsImageUri) &&
        Objects.equals(this.isAdmin, userInformation.isAdmin) &&
        Objects.equals(this.jobTitle, userInformation.jobTitle) &&
        Objects.equals(this.lastLogin, userInformation.lastLogin) &&
        Objects.equals(this.lastName, userInformation.lastName) &&
        Objects.equals(this.loginStatus, userInformation.loginStatus) &&
        Objects.equals(this.middleName, userInformation.middleName) &&
        Objects.equals(this.password, userInformation.password) &&
        Objects.equals(this.passwordExpiration, userInformation.passwordExpiration) &&
        Objects.equals(this.permissionProfileId, userInformation.permissionProfileId) &&
        Objects.equals(this.permissionProfileName, userInformation.permissionProfileName) &&
        Objects.equals(this.profileImageUri, userInformation.profileImageUri) &&
        Objects.equals(this.sendActivationEmail, userInformation.sendActivationEmail) &&
        Objects.equals(this.sendActivationOnInvalidLogin, userInformation.sendActivationOnInvalidLogin) &&
        Objects.equals(this.signatureImageUri, userInformation.signatureImageUri) &&
        Objects.equals(this.subscribe, userInformation.subscribe) &&
        Objects.equals(this.suffixName, userInformation.suffixName) &&
        Objects.equals(this.title, userInformation.title) &&
        Objects.equals(this.uri, userInformation.uri) &&
        Objects.equals(this.userId, userInformation.userId) &&
        Objects.equals(this.userName, userInformation.userName) &&
        Objects.equals(this.userProfileLastModifiedDate, userInformation.userProfileLastModifiedDate) &&
        Objects.equals(this.userSettings, userInformation.userSettings) &&
        Objects.equals(this.userStatus, userInformation.userStatus) &&
        Objects.equals(this.userType, userInformation.userType) &&
        Objects.equals(this.workAddress, userInformation.workAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagementGranular, activationAccessCode, countryCode, createdDateTime, customSettings, email, enableConnectForUser, errorDetails, firstName, forgottenPasswordInfo, groupList, homeAddress, initialsImageUri, isAdmin, jobTitle, lastLogin, lastName, loginStatus, middleName, password, passwordExpiration, permissionProfileId, permissionProfileName, profileImageUri, sendActivationEmail, sendActivationOnInvalidLogin, signatureImageUri, subscribe, suffixName, title, uri, userId, userName, userProfileLastModifiedDate, userSettings, userStatus, userType, workAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInformation {\n");
    
    sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
    sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customSettings: ").append(toIndentedString(customSettings)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enableConnectForUser: ").append(toIndentedString(enableConnectForUser)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordExpiration: ").append(toIndentedString(passwordExpiration)).append("\n");
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
    sb.append("    profileImageUri: ").append(toIndentedString(profileImageUri)).append("\n");
    sb.append("    sendActivationEmail: ").append(toIndentedString(sendActivationEmail)).append("\n");
    sb.append("    sendActivationOnInvalidLogin: ").append(toIndentedString(sendActivationOnInvalidLogin)).append("\n");
    sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
    sb.append("    subscribe: ").append(toIndentedString(subscribe)).append("\n");
    sb.append("    suffixName: ").append(toIndentedString(suffixName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userProfileLastModifiedDate: ").append(toIndentedString(userProfileLastModifiedDate)).append("\n");
    sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    workAddress: ").append(toIndentedString(workAddress)).append("\n");
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

