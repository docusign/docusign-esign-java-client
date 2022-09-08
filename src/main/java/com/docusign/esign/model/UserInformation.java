package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AddressInformation;
import com.docusign.esign.model.ConnectUserObject;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ForgottenPasswordInformation;
import com.docusign.esign.model.Group;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.UserSettingsInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User information..
 *
 */
@ApiModel(description = "User information.")

public class UserInformation {
  @JsonProperty("activationAccessCode")
  private String activationAccessCode = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("connectConfigurations")
  private java.util.List<ConnectUserObject> connectConfigurations = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("customSettings")
  private java.util.List<NameValue> customSettings = null;

  @JsonProperty("defaultAccountId")
  private String defaultAccountId = null;

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
  private java.util.List<Group> groupList = null;

  @JsonProperty("hasRemoteNotary")
  private Boolean hasRemoteNotary = null;

  @JsonProperty("homeAddress")
  private AddressInformation homeAddress = null;

  @JsonProperty("initialsImageUri")
  private String initialsImageUri = null;

  @JsonProperty("isAdmin")
  private String isAdmin = null;

  @JsonProperty("isAlternateAdmin")
  private String isAlternateAdmin = null;

  @JsonProperty("isNAREnabled")
  private String isNAREnabled = null;

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

  @JsonProperty("userAddedToAccountDateTime")
  private String userAddedToAccountDateTime = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userProfileLastModifiedDate")
  private String userProfileLastModifiedDate = null;

  @JsonProperty("userSettings")
  private UserSettingsInformation userSettings = null;

  @JsonProperty("userStatus")
  private String userStatus = null;

  @JsonProperty("userType")
  private String userType = null;

  @JsonProperty("workAddress")
  private AddressInformation workAddress = null;


  /**
   * activationAccessCode.
   *
   * @return UserInformation
   **/
  public UserInformation activationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
    return this;
  }

  /**
   * The activation code the new user must enter when activating their account..
   * @return activationAccessCode
   **/
  @ApiModelProperty(value = "The activation code the new user must enter when activating their account.")
  public String getActivationAccessCode() {
    return activationAccessCode;
  }

  /**
   * setActivationAccessCode.
   **/
  public void setActivationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
  }


  /**
   * company.
   *
   * @return UserInformation
   **/
  public UserInformation company(String company) {
    this.company = company;
    return this;
  }

  /**
   * .
   * @return company
   **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  /**
   * setCompany.
   **/
  public void setCompany(String company) {
    this.company = company;
  }


  /**
   * connectConfigurations.
   *
   * @return UserInformation
   **/
  public UserInformation connectConfigurations(java.util.List<ConnectUserObject> connectConfigurations) {
    this.connectConfigurations = connectConfigurations;
    return this;
  }
  
  /**
   * addConnectConfigurationsItem.
   *
   * @return UserInformation
   **/
  public UserInformation addConnectConfigurationsItem(ConnectUserObject connectConfigurationsItem) {
    if (this.connectConfigurations == null) {
      this.connectConfigurations = new java.util.ArrayList<>();
    }
    this.connectConfigurations.add(connectConfigurationsItem);
    return this;
  }

  /**
   * .
   * @return connectConfigurations
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ConnectUserObject> getConnectConfigurations() {
    return connectConfigurations;
  }

  /**
   * setConnectConfigurations.
   **/
  public void setConnectConfigurations(java.util.List<ConnectUserObject> connectConfigurations) {
    this.connectConfigurations = connectConfigurations;
  }


  /**
   * countryCode.
   *
   * @return UserInformation
   **/
  public UserInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * .
   * @return countryCode
   **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * setCountryCode.
   **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * createdDateTime.
   *
   * @return UserInformation
   **/
  public UserInformation createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * customSettings.
   *
   * @return UserInformation
   **/
  public UserInformation customSettings(java.util.List<NameValue> customSettings) {
    this.customSettings = customSettings;
    return this;
  }
  
  /**
   * addCustomSettingsItem.
   *
   * @return UserInformation
   **/
  public UserInformation addCustomSettingsItem(NameValue customSettingsItem) {
    if (this.customSettings == null) {
      this.customSettings = new java.util.ArrayList<>();
    }
    this.customSettings.add(customSettingsItem);
    return this;
  }

  /**
   * The name/value pair information for the user custom setting..
   * @return customSettings
   **/
  @ApiModelProperty(value = "The name/value pair information for the user custom setting.")
  public java.util.List<NameValue> getCustomSettings() {
    return customSettings;
  }

  /**
   * setCustomSettings.
   **/
  public void setCustomSettings(java.util.List<NameValue> customSettings) {
    this.customSettings = customSettings;
  }


  /**
   * defaultAccountId.
   *
   * @return UserInformation
   **/
  public UserInformation defaultAccountId(String defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

  /**
   * .
   * @return defaultAccountId
   **/
  @ApiModelProperty(value = "")
  public String getDefaultAccountId() {
    return defaultAccountId;
  }

  /**
   * setDefaultAccountId.
   **/
  public void setDefaultAccountId(String defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }


  /**
   * email.
   *
   * @return UserInformation
   **/
  public UserInformation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * enableConnectForUser.
   *
   * @return UserInformation
   **/
  public UserInformation enableConnectForUser(String enableConnectForUser) {
    this.enableConnectForUser = enableConnectForUser;
    return this;
  }

  /**
   * Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false..
   * @return enableConnectForUser
   **/
  @ApiModelProperty(value = "Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.")
  public String getEnableConnectForUser() {
    return enableConnectForUser;
  }

  /**
   * setEnableConnectForUser.
   **/
  public void setEnableConnectForUser(String enableConnectForUser) {
    this.enableConnectForUser = enableConnectForUser;
  }


  /**
   * errorDetails.
   *
   * @return UserInformation
   **/
  public UserInformation errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and ignored in requests..
   * @return errorDetails
   **/
  @ApiModelProperty(value = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
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
   * firstName.
   *
   * @return UserInformation
   **/
  public UserInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.  Maximum Length: 50 characters..
   * @return firstName
   **/
  @ApiModelProperty(value = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * forgottenPasswordInfo.
   *
   * @return UserInformation
   **/
  public UserInformation forgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
    return this;
  }

  /**
   * A complex element containing up to four Question/Answer pairs for forgotten password information..
   * @return forgottenPasswordInfo
   **/
  @ApiModelProperty(value = "A complex element containing up to four Question/Answer pairs for forgotten password information.")
  public ForgottenPasswordInformation getForgottenPasswordInfo() {
    return forgottenPasswordInfo;
  }

  /**
   * setForgottenPasswordInfo.
   **/
  public void setForgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
  }


  /**
   * groupList.
   *
   * @return UserInformation
   **/
  public UserInformation groupList(java.util.List<Group> groupList) {
    this.groupList = groupList;
    return this;
  }
  
  /**
   * addGroupListItem.
   *
   * @return UserInformation
   **/
  public UserInformation addGroupListItem(Group groupListItem) {
    if (this.groupList == null) {
      this.groupList = new java.util.ArrayList<>();
    }
    this.groupList.add(groupListItem);
    return this;
  }

  /**
   * A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId.   The parameters are:  * groupId - The DocuSign group ID for the group. * groupName - The name of the group * permissionProfileId - The ID of the permission profile associated with the group. * groupType - The group type. .
   * @return groupList
   **/
  @ApiModelProperty(value = "A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId.   The parameters are:  * groupId - The DocuSign group ID for the group. * groupName - The name of the group * permissionProfileId - The ID of the permission profile associated with the group. * groupType - The group type. ")
  public java.util.List<Group> getGroupList() {
    return groupList;
  }

  /**
   * setGroupList.
   **/
  public void setGroupList(java.util.List<Group> groupList) {
    this.groupList = groupList;
  }


  /**
   * hasRemoteNotary.
   *
   * @return UserInformation
   **/
  public UserInformation hasRemoteNotary(Boolean hasRemoteNotary) {
    this.hasRemoteNotary = hasRemoteNotary;
    return this;
  }

  /**
   * .
   * @return hasRemoteNotary
   **/
  @ApiModelProperty(value = "")
  public Boolean isHasRemoteNotary() {
    return hasRemoteNotary;
  }

  /**
   * setHasRemoteNotary.
   **/
  public void setHasRemoteNotary(Boolean hasRemoteNotary) {
    this.hasRemoteNotary = hasRemoteNotary;
  }


  /**
   * homeAddress.
   *
   * @return UserInformation
   **/
  public UserInformation homeAddress(AddressInformation homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

  /**
   * Specifies the email for the signing host. It is a Required element for In Person Signers recipient Type.  Maximum Length: 100 characters..
   * @return homeAddress
   **/
  @ApiModelProperty(value = "Specifies the email for the signing host. It is a Required element for In Person Signers recipient Type.  Maximum Length: 100 characters.")
  public AddressInformation getHomeAddress() {
    return homeAddress;
  }

  /**
   * setHomeAddress.
   **/
  public void setHomeAddress(AddressInformation homeAddress) {
    this.homeAddress = homeAddress;
  }


  /**
   * initialsImageUri.
   *
   * @return UserInformation
   **/
  public UserInformation initialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
    return this;
  }

  /**
   * Contains the URI for an endpoint that you can use to retrieve the initials image..
   * @return initialsImageUri
   **/
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
  public String getInitialsImageUri() {
    return initialsImageUri;
  }

  /**
   * setInitialsImageUri.
   **/
  public void setInitialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
  }


  /**
   * isAdmin.
   *
   * @return UserInformation
   **/
  public UserInformation isAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Determines if the feature set is actively set as part of the plan..
   * @return isAdmin
   **/
  @ApiModelProperty(value = "Determines if the feature set is actively set as part of the plan.")
  public String getIsAdmin() {
    return isAdmin;
  }

  /**
   * setIsAdmin.
   **/
  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }


  /**
   * isAlternateAdmin.
   *
   * @return UserInformation
   **/
  public UserInformation isAlternateAdmin(String isAlternateAdmin) {
    this.isAlternateAdmin = isAlternateAdmin;
    return this;
  }

  /**
   * .
   * @return isAlternateAdmin
   **/
  @ApiModelProperty(value = "")
  public String getIsAlternateAdmin() {
    return isAlternateAdmin;
  }

  /**
   * setIsAlternateAdmin.
   **/
  public void setIsAlternateAdmin(String isAlternateAdmin) {
    this.isAlternateAdmin = isAlternateAdmin;
  }


  /**
   * isNAREnabled.
   *
   * @return UserInformation
   **/
  public UserInformation isNAREnabled(String isNAREnabled) {
    this.isNAREnabled = isNAREnabled;
    return this;
  }

  /**
   * .
   * @return isNAREnabled
   **/
  @ApiModelProperty(value = "")
  public String getIsNAREnabled() {
    return isNAREnabled;
  }

  /**
   * setIsNAREnabled.
   **/
  public void setIsNAREnabled(String isNAREnabled) {
    this.isNAREnabled = isNAREnabled;
  }


  /**
   * jobTitle.
   *
   * @return UserInformation
   **/
  public UserInformation jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * .
   * @return jobTitle
   **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  /**
   * setJobTitle.
   **/
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  /**
   * lastLogin.
   *
   * @return UserInformation
   **/
  public UserInformation lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Shows the date-time when the user last logged on to the system..
   * @return lastLogin
   **/
  @ApiModelProperty(value = "Shows the date-time when the user last logged on to the system.")
  public String getLastLogin() {
    return lastLogin;
  }

  /**
   * setLastLogin.
   **/
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  /**
   * lastName.
   *
   * @return UserInformation
   **/
  public UserInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The user's last name.  Maximum Length: 50 characters..
   * @return lastName
   **/
  @ApiModelProperty(value = "The user's last name.  Maximum Length: 50 characters.")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * loginStatus.
   *
   * @return UserInformation
   **/
  public UserInformation loginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
    return this;
  }

  /**
   * Shows the current status of the user's password. Possible values are:   * password_reset * password_active * password_expired * password_locked * password_reset_failed  .
   * @return loginStatus
   **/
  @ApiModelProperty(value = "Shows the current status of the user's password. Possible values are:   * password_reset * password_active * password_expired * password_locked * password_reset_failed  ")
  public String getLoginStatus() {
    return loginStatus;
  }

  /**
   * setLoginStatus.
   **/
  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }


  /**
   * middleName.
   *
   * @return UserInformation
   **/
  public UserInformation middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * The user's middle name.  Maximum Length: 50 characters..
   * @return middleName
   **/
  @ApiModelProperty(value = "The user's middle name.  Maximum Length: 50 characters.")
  public String getMiddleName() {
    return middleName;
  }

  /**
   * setMiddleName.
   **/
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  /**
   * password.
   *
   * @return UserInformation
   **/
  public UserInformation password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * passwordExpiration.
   *
   * @return UserInformation
   **/
  public UserInformation passwordExpiration(String passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
    return this;
  }

  /**
   * .
   * @return passwordExpiration
   **/
  @ApiModelProperty(value = "")
  public String getPasswordExpiration() {
    return passwordExpiration;
  }

  /**
   * setPasswordExpiration.
   **/
  public void setPasswordExpiration(String passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
  }


  /**
   * permissionProfileId.
   *
   * @return UserInformation
   **/
  public UserInformation permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

  /**
   * .
   * @return permissionProfileId
   **/
  @ApiModelProperty(value = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  /**
   * setPermissionProfileId.
   **/
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }


  /**
   * permissionProfileName.
   *
   * @return UserInformation
   **/
  public UserInformation permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

  /**
   * .
   * @return permissionProfileName
   **/
  @ApiModelProperty(value = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  /**
   * setPermissionProfileName.
   **/
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }


  /**
   * profileImageUri.
   *
   * @return UserInformation
   **/
  public UserInformation profileImageUri(String profileImageUri) {
    this.profileImageUri = profileImageUri;
    return this;
  }

  /**
   * .
   * @return profileImageUri
   **/
  @ApiModelProperty(value = "")
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
   * sendActivationEmail.
   *
   * @return UserInformation
   **/
  public UserInformation sendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
    return this;
  }

  /**
   * .
   * @return sendActivationEmail
   **/
  @ApiModelProperty(value = "")
  public String getSendActivationEmail() {
    return sendActivationEmail;
  }

  /**
   * setSendActivationEmail.
   **/
  public void setSendActivationEmail(String sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
  }


  /**
   * sendActivationOnInvalidLogin.
   *
   * @return UserInformation
   **/
  public UserInformation sendActivationOnInvalidLogin(String sendActivationOnInvalidLogin) {
    this.sendActivationOnInvalidLogin = sendActivationOnInvalidLogin;
    return this;
  }

  /**
   * When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account. .
   * @return sendActivationOnInvalidLogin
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account. ")
  public String getSendActivationOnInvalidLogin() {
    return sendActivationOnInvalidLogin;
  }

  /**
   * setSendActivationOnInvalidLogin.
   **/
  public void setSendActivationOnInvalidLogin(String sendActivationOnInvalidLogin) {
    this.sendActivationOnInvalidLogin = sendActivationOnInvalidLogin;
  }


  /**
   * signatureImageUri.
   *
   * @return UserInformation
   **/
  public UserInformation signatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
    return this;
  }

  /**
   * Contains the URI for an endpoint that you can use to retrieve the signature image..
   * @return signatureImageUri
   **/
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
  public String getSignatureImageUri() {
    return signatureImageUri;
  }

  /**
   * setSignatureImageUri.
   **/
  public void setSignatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
  }


  /**
   * subscribe.
   *
   * @return UserInformation
   **/
  public UserInformation subscribe(String subscribe) {
    this.subscribe = subscribe;
    return this;
  }

  /**
   * .
   * @return subscribe
   **/
  @ApiModelProperty(value = "")
  public String getSubscribe() {
    return subscribe;
  }

  /**
   * setSubscribe.
   **/
  public void setSubscribe(String subscribe) {
    this.subscribe = subscribe;
  }


  /**
   * suffixName.
   *
   * @return UserInformation
   **/
  public UserInformation suffixName(String suffixName) {
    this.suffixName = suffixName;
    return this;
  }

  /**
   * The suffix for the user's name.   Maximum Length: 50 characters. .
   * @return suffixName
   **/
  @ApiModelProperty(value = "The suffix for the user's name.   Maximum Length: 50 characters. ")
  public String getSuffixName() {
    return suffixName;
  }

  /**
   * setSuffixName.
   **/
  public void setSuffixName(String suffixName) {
    this.suffixName = suffixName;
  }


  /**
   * title.
   *
   * @return UserInformation
   **/
  public UserInformation title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the user..
   * @return title
   **/
  @ApiModelProperty(value = "The title of the user.")
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
   * uri.
   *
   * @return UserInformation
   **/
  public UserInformation uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * userAddedToAccountDateTime.
   *
   * @return UserInformation
   **/
  public UserInformation userAddedToAccountDateTime(String userAddedToAccountDateTime) {
    this.userAddedToAccountDateTime = userAddedToAccountDateTime;
    return this;
  }

  /**
   * .
   * @return userAddedToAccountDateTime
   **/
  @ApiModelProperty(value = "")
  public String getUserAddedToAccountDateTime() {
    return userAddedToAccountDateTime;
  }

  /**
   * setUserAddedToAccountDateTime.
   **/
  public void setUserAddedToAccountDateTime(String userAddedToAccountDateTime) {
    this.userAddedToAccountDateTime = userAddedToAccountDateTime;
  }


  /**
   * userId.
   *
   * @return UserInformation
   **/
  public UserInformation userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * userName.
   *
   * @return UserInformation
   **/
  public UserInformation userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * .
   * @return userName
   **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * userProfileLastModifiedDate.
   *
   * @return UserInformation
   **/
  public UserInformation userProfileLastModifiedDate(String userProfileLastModifiedDate) {
    this.userProfileLastModifiedDate = userProfileLastModifiedDate;
    return this;
  }

  /**
   * .
   * @return userProfileLastModifiedDate
   **/
  @ApiModelProperty(value = "")
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
   * userSettings.
   *
   * @return UserInformation
   **/
  public UserInformation userSettings(UserSettingsInformation userSettings) {
    this.userSettings = userSettings;
    return this;
  }

  /**
   * The collection of settings representing the actions a user can perform. See [userSettingsInformation](/docs/esign-rest-api/reference/users/users/get/#userSettingsInformation) for available settings..
   * @return userSettings
   **/
  @ApiModelProperty(value = "The collection of settings representing the actions a user can perform. See [userSettingsInformation](/docs/esign-rest-api/reference/users/users/get/#userSettingsInformation) for available settings.")
  public UserSettingsInformation getUserSettings() {
    return userSettings;
  }

  /**
   * setUserSettings.
   **/
  public void setUserSettings(UserSettingsInformation userSettings) {
    this.userSettings = userSettings;
  }


  /**
   * userStatus.
   *
   * @return UserInformation
   **/
  public UserInformation userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * .
   * @return userStatus
   **/
  @ApiModelProperty(value = "")
  public String getUserStatus() {
    return userStatus;
  }

  /**
   * setUserStatus.
   **/
  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }


  /**
   * userType.
   *
   * @return UserInformation
   **/
  public UserInformation userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * .
   * @return userType
   **/
  @ApiModelProperty(value = "")
  public String getUserType() {
    return userType;
  }

  /**
   * setUserType.
   **/
  public void setUserType(String userType) {
    this.userType = userType;
  }


  /**
   * workAddress.
   *
   * @return UserInformation
   **/
  public UserInformation workAddress(AddressInformation workAddress) {
    this.workAddress = workAddress;
    return this;
  }

  /**
   * .
   * @return workAddress
   **/
  @ApiModelProperty(value = "")
  public AddressInformation getWorkAddress() {
    return workAddress;
  }

  /**
   * setWorkAddress.
   **/
  public void setWorkAddress(AddressInformation workAddress) {
    this.workAddress = workAddress;
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
    UserInformation userInformation = (UserInformation) o;
    return Objects.equals(this.activationAccessCode, userInformation.activationAccessCode) &&
        Objects.equals(this.company, userInformation.company) &&
        Objects.equals(this.connectConfigurations, userInformation.connectConfigurations) &&
        Objects.equals(this.countryCode, userInformation.countryCode) &&
        Objects.equals(this.createdDateTime, userInformation.createdDateTime) &&
        Objects.equals(this.customSettings, userInformation.customSettings) &&
        Objects.equals(this.defaultAccountId, userInformation.defaultAccountId) &&
        Objects.equals(this.email, userInformation.email) &&
        Objects.equals(this.enableConnectForUser, userInformation.enableConnectForUser) &&
        Objects.equals(this.errorDetails, userInformation.errorDetails) &&
        Objects.equals(this.firstName, userInformation.firstName) &&
        Objects.equals(this.forgottenPasswordInfo, userInformation.forgottenPasswordInfo) &&
        Objects.equals(this.groupList, userInformation.groupList) &&
        Objects.equals(this.hasRemoteNotary, userInformation.hasRemoteNotary) &&
        Objects.equals(this.homeAddress, userInformation.homeAddress) &&
        Objects.equals(this.initialsImageUri, userInformation.initialsImageUri) &&
        Objects.equals(this.isAdmin, userInformation.isAdmin) &&
        Objects.equals(this.isAlternateAdmin, userInformation.isAlternateAdmin) &&
        Objects.equals(this.isNAREnabled, userInformation.isNAREnabled) &&
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
        Objects.equals(this.userAddedToAccountDateTime, userInformation.userAddedToAccountDateTime) &&
        Objects.equals(this.userId, userInformation.userId) &&
        Objects.equals(this.userName, userInformation.userName) &&
        Objects.equals(this.userProfileLastModifiedDate, userInformation.userProfileLastModifiedDate) &&
        Objects.equals(this.userSettings, userInformation.userSettings) &&
        Objects.equals(this.userStatus, userInformation.userStatus) &&
        Objects.equals(this.userType, userInformation.userType) &&
        Objects.equals(this.workAddress, userInformation.workAddress);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(activationAccessCode, company, connectConfigurations, countryCode, createdDateTime, customSettings, defaultAccountId, email, enableConnectForUser, errorDetails, firstName, forgottenPasswordInfo, groupList, hasRemoteNotary, homeAddress, initialsImageUri, isAdmin, isAlternateAdmin, isNAREnabled, jobTitle, lastLogin, lastName, loginStatus, middleName, password, passwordExpiration, permissionProfileId, permissionProfileName, profileImageUri, sendActivationEmail, sendActivationOnInvalidLogin, signatureImageUri, subscribe, suffixName, title, uri, userAddedToAccountDateTime, userId, userName, userProfileLastModifiedDate, userSettings, userStatus, userType, workAddress);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInformation {\n");
    
    sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    connectConfigurations: ").append(toIndentedString(connectConfigurations)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customSettings: ").append(toIndentedString(customSettings)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enableConnectForUser: ").append(toIndentedString(enableConnectForUser)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("    hasRemoteNotary: ").append(toIndentedString(hasRemoteNotary)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isAlternateAdmin: ").append(toIndentedString(isAlternateAdmin)).append("\n");
    sb.append("    isNAREnabled: ").append(toIndentedString(isNAREnabled)).append("\n");
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
    sb.append("    userAddedToAccountDateTime: ").append(toIndentedString(userAddedToAccountDateTime)).append("\n");
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

