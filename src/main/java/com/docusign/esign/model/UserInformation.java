package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformationV2;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ForgottenPasswordInformation;
import com.docusign.esign.model.Group;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.UserAccountManagementGranularInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserInformation   {
  
  private UserAccountManagementGranularInformation accountManagementGranular = null;
  private String activationAccessCode = null;
  private String createdDateTime = null;
  private java.util.List<NameValue> customSettings = new java.util.ArrayList<NameValue>();
  private String email = null;
  private String enableConnectForUser = null;
  private ErrorDetails errorDetails = null;
  private String firstName = null;
  private ForgottenPasswordInformation forgottenPasswordInfo = null;
  private java.util.List<Group> groupList = new java.util.ArrayList<Group>();
  private AddressInformationV2 homeAddress = null;
  private String initialsImageUri = null;
  private String isAdmin = null;
  private String lastLogin = null;
  private String lastName = null;
  private String loginStatus = null;
  private String middleName = null;
  private String password = null;
  private String passwordExpiration = null;
  private String permissionProfileId = null;
  private String permissionProfileName = null;
  private String profileImageUri = null;
  private String sendActivationOnInvalidLogin = null;
  private String signatureImageUri = null;
  private String suffixName = null;
  private String title = null;
  private String uri = null;
  private String userId = null;
  private String userName = null;
  private String userProfileLastModifiedDate = null;
  private java.util.List<NameValue> userSettings = new java.util.ArrayList<NameValue>();
  private String userStatus = null;
  private String userType = null;
  private AddressInformationV2 workAddress = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountManagementGranular")
  public UserAccountManagementGranularInformation getAccountManagementGranular() {
    return accountManagementGranular;
  }
  public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
  }

  
  /**
   * The activation code the new user must enter when activating their account.
   **/
  
  @ApiModelProperty(value = "The activation code the new user must enter when activating their account.")
  @JsonProperty("activationAccessCode")
  public String getActivationAccessCode() {
    return activationAccessCode;
  }
  public void setActivationAccessCode(String activationAccessCode) {
    this.activationAccessCode = activationAccessCode;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * The name/value pair information for the user custom setting.
   **/
  
  @ApiModelProperty(value = "The name/value pair information for the user custom setting.")
  @JsonProperty("customSettings")
  public java.util.List<NameValue> getCustomSettings() {
    return customSettings;
  }
  public void setCustomSettings(java.util.List<NameValue> customSettings) {
    this.customSettings = customSettings;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.
   **/
  
  @ApiModelProperty(value = "Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.")
  @JsonProperty("enableConnectForUser")
  public String getEnableConnectForUser() {
    return enableConnectForUser;
  }
  public void setEnableConnectForUser(String enableConnectForUser) {
    this.enableConnectForUser = enableConnectForUser;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * The user’s first name. \nMaximum Length: 50 characters.
   **/
  
  @ApiModelProperty(value = "The user’s first name. \nMaximum Length: 50 characters.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("forgottenPasswordInfo")
  public ForgottenPasswordInformation getForgottenPasswordInfo() {
    return forgottenPasswordInfo;
  }
  public void setForgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
    this.forgottenPasswordInfo = forgottenPasswordInfo;
  }

  
  /**
   * A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId. \n\nThe parameters are:\n\n* groupId – The DocuSign group ID for the group.\n* groupName – The name of the group\n* permissionProfileId – The ID of the permission profile associated with the group.\n* groupType – The group type.
   **/
  
  @ApiModelProperty(value = "A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId. \n\nThe parameters are:\n\n* groupId – The DocuSign group ID for the group.\n* groupName – The name of the group\n* permissionProfileId – The ID of the permission profile associated with the group.\n* groupType – The group type.")
  @JsonProperty("groupList")
  public java.util.List<Group> getGroupList() {
    return groupList;
  }
  public void setGroupList(java.util.List<Group> groupList) {
    this.groupList = groupList;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("homeAddress")
  public AddressInformationV2 getHomeAddress() {
    return homeAddress;
  }
  public void setHomeAddress(AddressInformationV2 homeAddress) {
    this.homeAddress = homeAddress;
  }

  
  /**
   * Contains the URI for an endpoint that you can use to retrieve the initials image.
   **/
  
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
  @JsonProperty("initialsImageUri")
  public String getInitialsImageUri() {
    return initialsImageUri;
  }
  public void setInitialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
  }

  
  /**
   * Determines if the feature set is actively set as part of the plan.
   **/
  
  @ApiModelProperty(value = "Determines if the feature set is actively set as part of the plan.")
  @JsonProperty("isAdmin")
  public String getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }

  
  /**
   * Shows the date-time when the user last logged on to the system.
   **/
  
  @ApiModelProperty(value = "Shows the date-time when the user last logged on to the system.")
  @JsonProperty("lastLogin")
  public String getLastLogin() {
    return lastLogin;
  }
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  
  /**
   * The user’s last name. \nMaximum Length: 50 characters.
   **/
  
  @ApiModelProperty(value = "The user’s last name. \nMaximum Length: 50 characters.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Shows the current status of the user’s password. Possible values are: \n\n* password_reset\n* password_active\n* password_expired\n* password_locked\n* password_reset_failed
   **/
  
  @ApiModelProperty(value = "Shows the current status of the user’s password. Possible values are: \n\n* password_reset\n* password_active\n* password_expired\n* password_locked\n* password_reset_failed")
  @JsonProperty("loginStatus")
  public String getLoginStatus() {
    return loginStatus;
  }
  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }

  
  /**
   * The user’s middle name. \nMaximum Length: 50 characters.
   **/
  
  @ApiModelProperty(value = "The user’s middle name. \nMaximum Length: 50 characters.")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordExpiration")
  public String getPasswordExpiration() {
    return passwordExpiration;
  }
  public void setPasswordExpiration(String passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionProfileId")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionProfileName")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
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
   * When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account.
   **/
  
  @ApiModelProperty(value = "When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account.")
  @JsonProperty("sendActivationOnInvalidLogin")
  public String getSendActivationOnInvalidLogin() {
    return sendActivationOnInvalidLogin;
  }
  public void setSendActivationOnInvalidLogin(String sendActivationOnInvalidLogin) {
    this.sendActivationOnInvalidLogin = sendActivationOnInvalidLogin;
  }

  
  /**
   * Contains the URI for an endpoint that you can use to retrieve the signature image.
   **/
  
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
  @JsonProperty("signatureImageUri")
  public String getSignatureImageUri() {
    return signatureImageUri;
  }
  public void setSignatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
  }

  
  /**
   * The suffix for the user's name. \n\nMaximum Length: 50 characters.
   **/
  
  @ApiModelProperty(value = "The suffix for the user's name. \n\nMaximum Length: 50 characters.")
  @JsonProperty("suffixName")
  public String getSuffixName() {
    return suffixName;
  }
  public void setSuffixName(String suffixName) {
    this.suffixName = suffixName;
  }

  
  /**
   * The title of the user.
   **/
  
  @ApiModelProperty(value = "The title of the user.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
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

  
  /**
   * The name/value pair information for user settings. These determine the actions that a user can take in the account. The `[ML:userSettings]` are listed and described below.
   **/
  
  @ApiModelProperty(value = "The name/value pair information for user settings. These determine the actions that a user can take in the account. The `[ML:userSettings]` are listed and described below.")
  @JsonProperty("userSettings")
  public java.util.List<NameValue> getUserSettings() {
    return userSettings;
  }
  public void setUserSettings(java.util.List<NameValue> userSettings) {
    this.userSettings = userSettings;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userStatus")
  public String getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userType")
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workAddress")
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

    return true && Objects.equals(accountManagementGranular, userInformation.accountManagementGranular) &&
        Objects.equals(activationAccessCode, userInformation.activationAccessCode) &&
        Objects.equals(createdDateTime, userInformation.createdDateTime) &&
        Objects.equals(customSettings, userInformation.customSettings) &&
        Objects.equals(email, userInformation.email) &&
        Objects.equals(enableConnectForUser, userInformation.enableConnectForUser) &&
        Objects.equals(errorDetails, userInformation.errorDetails) &&
        Objects.equals(firstName, userInformation.firstName) &&
        Objects.equals(forgottenPasswordInfo, userInformation.forgottenPasswordInfo) &&
        Objects.equals(groupList, userInformation.groupList) &&
        Objects.equals(homeAddress, userInformation.homeAddress) &&
        Objects.equals(initialsImageUri, userInformation.initialsImageUri) &&
        Objects.equals(isAdmin, userInformation.isAdmin) &&
        Objects.equals(lastLogin, userInformation.lastLogin) &&
        Objects.equals(lastName, userInformation.lastName) &&
        Objects.equals(loginStatus, userInformation.loginStatus) &&
        Objects.equals(middleName, userInformation.middleName) &&
        Objects.equals(password, userInformation.password) &&
        Objects.equals(passwordExpiration, userInformation.passwordExpiration) &&
        Objects.equals(permissionProfileId, userInformation.permissionProfileId) &&
        Objects.equals(permissionProfileName, userInformation.permissionProfileName) &&
        Objects.equals(profileImageUri, userInformation.profileImageUri) &&
        Objects.equals(sendActivationOnInvalidLogin, userInformation.sendActivationOnInvalidLogin) &&
        Objects.equals(signatureImageUri, userInformation.signatureImageUri) &&
        Objects.equals(suffixName, userInformation.suffixName) &&
        Objects.equals(title, userInformation.title) &&
        Objects.equals(uri, userInformation.uri) &&
        Objects.equals(userId, userInformation.userId) &&
        Objects.equals(userName, userInformation.userName) &&
        Objects.equals(userProfileLastModifiedDate, userInformation.userProfileLastModifiedDate) &&
        Objects.equals(userSettings, userInformation.userSettings) &&
        Objects.equals(userStatus, userInformation.userStatus) &&
        Objects.equals(userType, userInformation.userType) &&
        Objects.equals(workAddress, userInformation.workAddress)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagementGranular, activationAccessCode, createdDateTime, customSettings, email, enableConnectForUser, errorDetails, firstName, forgottenPasswordInfo, groupList, homeAddress, initialsImageUri, isAdmin, lastLogin, lastName, loginStatus, middleName, password, passwordExpiration, permissionProfileId, permissionProfileName, profileImageUri, sendActivationOnInvalidLogin, signatureImageUri, suffixName, title, uri, userId, userName, userProfileLastModifiedDate, userSettings, userStatus, userType, workAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInformation {\n");
    
    if (accountManagementGranular != null)
      sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
    if (activationAccessCode != null)
      sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (customSettings != null)
      sb.append("    customSettings: ").append(toIndentedString(customSettings)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (enableConnectForUser != null)
      sb.append("    enableConnectForUser: ").append(toIndentedString(enableConnectForUser)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (firstName != null)
      sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    if (forgottenPasswordInfo != null)
      sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
    if (groupList != null)
      sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    if (homeAddress != null)
      sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    if (initialsImageUri != null)
      sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
    if (isAdmin != null)
      sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    if (lastLogin != null)
      sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    if (lastName != null)
      sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    if (loginStatus != null)
      sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
    if (middleName != null)
      sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    if (password != null)
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
    if (passwordExpiration != null)
      sb.append("    passwordExpiration: ").append(toIndentedString(passwordExpiration)).append("\n");
    if (permissionProfileId != null)
      sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    if (permissionProfileName != null)
      sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
    if (profileImageUri != null)
      sb.append("    profileImageUri: ").append(toIndentedString(profileImageUri)).append("\n");
    if (sendActivationOnInvalidLogin != null)
      sb.append("    sendActivationOnInvalidLogin: ").append(toIndentedString(sendActivationOnInvalidLogin)).append("\n");
    if (signatureImageUri != null)
      sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
    if (suffixName != null)
      sb.append("    suffixName: ").append(toIndentedString(suffixName)).append("\n");
    if (title != null)
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
    if (uri != null)
      sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    if (userName != null)
      sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    if (userProfileLastModifiedDate != null)
      sb.append("    userProfileLastModifiedDate: ").append(toIndentedString(userProfileLastModifiedDate)).append("\n");
    if (userSettings != null)
      sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
    if (userStatus != null)
      sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    if (userType != null)
      sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    if (workAddress != null)
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

