
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * UsersApi class.
 *
 **/
public class UsersApi {
  private ApiClient apiClient;

 /**
  * UsersApi.
  *
  **/
  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * UsersApi.
  *
  **/
  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Retrieves the list of users for the specified account. Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
  /// </summary>

 /**
  * CallListOptions Class.
  *
  **/
  public class CallListOptions
  {
  private String additionalInfo = null;
  private String alternateAdminsOnly = null;
  private String count = null;
  private String domainUsersOnly = null;
  private String email = null;
  private String emailSubstring = null;
  private String groupId = null;
  private String includeLicense = null;
  private String includeUsersettingsForCsv = null;
  private String loginStatus = null;
  private String notGroupId = null;
  private String startPosition = null;
  private String status = null;
  private String userNameSubstring = null;
  
 /**
  * setAdditionalInfo method.
  */
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

 /**
  * getAdditionalInfo method.
  *
  * @return String
  */
  public String getAdditionalInfo() {
    return this.additionalInfo;
  }
  
 /**
  * setAlternateAdminsOnly method.
  */
  public void setAlternateAdminsOnly(String alternateAdminsOnly) {
    this.alternateAdminsOnly = alternateAdminsOnly;
  }

 /**
  * getAlternateAdminsOnly method.
  *
  * @return String
  */
  public String getAlternateAdminsOnly() {
    return this.alternateAdminsOnly;
  }
  
 /**
  * setCount method.
  */
  public void setCount(String count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return String
  */
  public String getCount() {
    return this.count;
  }
  
 /**
  * setDomainUsersOnly method.
  */
  public void setDomainUsersOnly(String domainUsersOnly) {
    this.domainUsersOnly = domainUsersOnly;
  }

 /**
  * getDomainUsersOnly method.
  *
  * @return String
  */
  public String getDomainUsersOnly() {
    return this.domainUsersOnly;
  }
  
 /**
  * setEmail method.
  */
  public void setEmail(String email) {
    this.email = email;
  }

 /**
  * getEmail method.
  *
  * @return String
  */
  public String getEmail() {
    return this.email;
  }
  
 /**
  * setEmailSubstring method.
  */
  public void setEmailSubstring(String emailSubstring) {
    this.emailSubstring = emailSubstring;
  }

 /**
  * getEmailSubstring method.
  *
  * @return String
  */
  public String getEmailSubstring() {
    return this.emailSubstring;
  }
  
 /**
  * setGroupId method.
  */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

 /**
  * getGroupId method.
  *
  * @return String
  */
  public String getGroupId() {
    return this.groupId;
  }
  
 /**
  * setIncludeLicense method.
  */
  public void setIncludeLicense(String includeLicense) {
    this.includeLicense = includeLicense;
  }

 /**
  * getIncludeLicense method.
  *
  * @return String
  */
  public String getIncludeLicense() {
    return this.includeLicense;
  }
  
 /**
  * setIncludeUsersettingsForCsv method.
  */
  public void setIncludeUsersettingsForCsv(String includeUsersettingsForCsv) {
    this.includeUsersettingsForCsv = includeUsersettingsForCsv;
  }

 /**
  * getIncludeUsersettingsForCsv method.
  *
  * @return String
  */
  public String getIncludeUsersettingsForCsv() {
    return this.includeUsersettingsForCsv;
  }
  
 /**
  * setLoginStatus method.
  */
  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }

 /**
  * getLoginStatus method.
  *
  * @return String
  */
  public String getLoginStatus() {
    return this.loginStatus;
  }
  
 /**
  * setNotGroupId method.
  */
  public void setNotGroupId(String notGroupId) {
    this.notGroupId = notGroupId;
  }

 /**
  * getNotGroupId method.
  *
  * @return String
  */
  public String getNotGroupId() {
    return this.notGroupId;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return String
  */
  public String getStartPosition() {
    return this.startPosition;
  }
  
 /**
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
  }
  
 /**
  * setUserNameSubstring method.
  */
  public void setUserNameSubstring(String userNameSubstring) {
    this.userNameSubstring = userNameSubstring;
  }

 /**
  * getUserNameSubstring method.
  *
  * @return String
  */
  public String getUserNameSubstring() {
    return this.userNameSubstring;
  }
  }

   /**
   * Retrieves the list of users for the specified account..
   * Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return UserInformationList
   */ 
  public UserInformationList callList(String accountId) throws ApiException {
    return callList(accountId, null);
  }

  /**
   * Retrieves the list of users for the specified account..
   * Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return UserInformationList
   * @throws ApiException if fails to make API call
   */
  public UserInformationList callList(String accountId, UsersApi.CallListOptions options) throws ApiException {
    ApiResponse<UserInformationList> localVarResponse = callListWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of users for the specified account.
   * Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return UserInformationList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserInformationList > callListWithHttpInfo(String accountId, UsersApi.CallListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling callList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("additional_info", options.additionalInfo));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("alternate_admins_only", options.alternateAdminsOnly));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("domain_users_only", options.domainUsersOnly));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email_substring", options.emailSubstring));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("group_id", options.groupId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_license", options.includeLicense));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_usersettings_for_csv", options.includeUsersettingsForCsv));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("login_status", options.loginStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("not_group_id", options.notGroupId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_name_substring", options.userNameSubstring));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserInformationList> localVarReturnType = new GenericType<UserInformationList>() {};
    UserInformationList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserInformationList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds news user to the specified account..
   * Adds new users to your account. Set the &#x60;userSettings&#x60; property in the request to specify the actions the users can perform on the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param newUsersDefinition  (optional)
   * @return NewUsersSummary
   * @throws ApiException if fails to make API call
   */
  public NewUsersSummary create(String accountId, NewUsersDefinition newUsersDefinition) throws ApiException {
    ApiResponse<NewUsersSummary> localVarResponse = createWithHttpInfo(accountId, newUsersDefinition);
    return localVarResponse.getData();
  }

  /**
   * Adds news user to the specified account.
   * Adds new users to your account. Set the &#x60;userSettings&#x60; property in the request to specify the actions the users can perform on the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param newUsersDefinition  (optional)
   * @return NewUsersSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NewUsersSummary > createWithHttpInfo(String accountId, NewUsersDefinition newUsersDefinition) throws ApiException {
    Object localVarPostBody = newUsersDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<NewUsersSummary> localVarReturnType = new GenericType<NewUsersSummary>() {};
    NewUsersSummary localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NewUsersSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds user Signature and initials images to a Signature..
   * Adds a user signature image and/or user initials image to the specified user.   The userId property specified in the endpoint must match the authenticated user&#39;s userId and the user must be a member of the account.  The rules and processes associated with this are:  * If Content-Type is set to application/json, then the default behavior for creating a default signature image, based on the name and a DocuSign font, is used. * If Content-Type is set to multipart/form-data, then the request must contain a first part with the user signature information, followed by parts that contain the images.  For each Image part, the Content-Disposition header has a \&quot;filename\&quot; value that is used to map to the &#x60;signatureName&#x60; and/or &#x60;signatureInitials&#x60; properties in the JSON to the image.   For example:  &#x60;Content-Disposition: file; filename&#x3D;\&quot;Ron Test20121127083900\&quot;&#x60;  If no matching image (by filename value) is found, then the image is not set. One, both, or neither of the signature and initials images can be set with this call.  The Content-Transfer-Encoding: base64 header, set in the header for the part containing the image, can be set to indicate that the images are formatted as base64 instead of as binary.  If successful, 200-OK is returned, and a JSON structure containing the signature information is provided, note that the signatureId can change with each API POST, PUT, or DELETE since the changes to the signature structure cause the current signature to be closed, and a new signature record to be created.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSignaturesInformation  (optional)
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public UserSignaturesInformation createSignatures(String accountId, String userId, UserSignaturesInformation userSignaturesInformation) throws ApiException {
    ApiResponse<UserSignaturesInformation> localVarResponse = createSignaturesWithHttpInfo(accountId, userId, userSignaturesInformation);
    return localVarResponse.getData();
  }

  /**
   * Adds user Signature and initials images to a Signature.
   * Adds a user signature image and/or user initials image to the specified user.   The userId property specified in the endpoint must match the authenticated user&#39;s userId and the user must be a member of the account.  The rules and processes associated with this are:  * If Content-Type is set to application/json, then the default behavior for creating a default signature image, based on the name and a DocuSign font, is used. * If Content-Type is set to multipart/form-data, then the request must contain a first part with the user signature information, followed by parts that contain the images.  For each Image part, the Content-Disposition header has a \&quot;filename\&quot; value that is used to map to the &#x60;signatureName&#x60; and/or &#x60;signatureInitials&#x60; properties in the JSON to the image.   For example:  &#x60;Content-Disposition: file; filename&#x3D;\&quot;Ron Test20121127083900\&quot;&#x60;  If no matching image (by filename value) is found, then the image is not set. One, both, or neither of the signature and initials images can be set with this call.  The Content-Transfer-Encoding: base64 header, set in the header for the part containing the image, can be set to indicate that the images are formatted as base64 instead of as binary.  If successful, 200-OK is returned, and a JSON structure containing the signature information is provided, note that the signatureId can change with each API POST, PUT, or DELETE since the changes to the signature structure cause the current signature to be closed, and a new signature record to be created.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSignaturesInformation  (optional)
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignaturesInformation > createSignaturesWithHttpInfo(String accountId, String userId, UserSignaturesInformation userSignaturesInformation) throws ApiException {
    Object localVarPostBody = userSignaturesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createSignatures");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignaturesInformation> localVarReturnType = new GenericType<UserSignaturesInformation>() {};
    UserSignaturesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignaturesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Removes users account privileges. This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
  /// </summary>

 /**
  * DeleteOptions Class.
  *
  **/
  public class DeleteOptions
  {
  private String delete = null;
  
 /**
  * setDelete method.
  */
  public void setDelete(String delete) {
    this.delete = delete;
  }

 /**
  * getDelete method.
  *
  * @return String
  */
  public String getDelete() {
    return this.delete;
  }
  }

   /**
   * Removes users account privileges..
   * This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInfoList  (optional)
   * @return UsersResponse
   */ 
  public UsersResponse delete(String accountId, UserInfoList userInfoList) throws ApiException {
    return delete(accountId, userInfoList, null);
  }

  /**
   * Removes users account privileges..
   * This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInfoList  (optional)
   * @param options for modifying the method behavior.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse delete(String accountId, UserInfoList userInfoList, UsersApi.DeleteOptions options) throws ApiException {
    ApiResponse<UsersResponse> localVarResponse = deleteWithHttpInfo(accountId, userInfoList, options);
    return localVarResponse.getData();
  }

  /**
   * Removes users account privileges.
   * This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInfoList  (optional)
   * @param options for modifying the method behavior.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersResponse > deleteWithHttpInfo(String accountId, UserInfoList userInfoList, UsersApi.DeleteOptions options) throws ApiException {
    Object localVarPostBody = userInfoList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("delete", options.delete));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
    UsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Replaces a particular contact associated with an account for the DocuSign service..
   * This method deletes a contact associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse deleteContactWithId(String accountId, String contactId) throws ApiException {
    ApiResponse<ContactUpdateResponse> localVarResponse = deleteContactWithIdWithHttpInfo(accountId, contactId);
    return localVarResponse.getData();
  }

  /**
   * Replaces a particular contact associated with an account for the DocuSign service.
   * This method deletes a contact associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactUpdateResponse > deleteContactWithIdWithHttpInfo(String accountId, String contactId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteContactWithId");
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling deleteContactWithId");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/contacts/{contactId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
    ContactUpdateResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ContactUpdateResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete contacts associated with an account for the DocuSign service..
   * This method deletes multiple contacts associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse deleteContacts(String accountId, ContactModRequest contactModRequest) throws ApiException {
    ApiResponse<ContactUpdateResponse> localVarResponse = deleteContactsWithHttpInfo(accountId, contactModRequest);
    return localVarResponse.getData();
  }

  /**
   * Delete contacts associated with an account for the DocuSign service.
   * This method deletes multiple contacts associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactUpdateResponse > deleteContactsWithHttpInfo(String accountId, ContactModRequest contactModRequest) throws ApiException {
    Object localVarPostBody = contactModRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteContacts");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/contacts"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
    ContactUpdateResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ContactUpdateResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes custom user settings for a specified user..
   * Deletes the specified custom user settings for a single user.  ###Deleting Grouped Custom User Settings###  If the custom user settings you want to delete are grouped, you must include the following information in the header, after Content-Type, in the request:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings.  If the extra header information is not included, only the custom user settings that were added without a group are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param customSettingsInformation  (optional)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public CustomSettingsInformation deleteCustomSettings(String accountId, String userId, CustomSettingsInformation customSettingsInformation) throws ApiException {
    ApiResponse<CustomSettingsInformation> localVarResponse = deleteCustomSettingsWithHttpInfo(accountId, userId, customSettingsInformation);
    return localVarResponse.getData();
  }

  /**
   * Deletes custom user settings for a specified user.
   * Deletes the specified custom user settings for a single user.  ###Deleting Grouped Custom User Settings###  If the custom user settings you want to delete are grouped, you must include the following information in the header, after Content-Type, in the request:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings.  If the extra header information is not included, only the custom user settings that were added without a group are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param customSettingsInformation  (optional)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomSettingsInformation > deleteCustomSettingsWithHttpInfo(String accountId, String userId, CustomSettingsInformation customSettingsInformation) throws ApiException {
    Object localVarPostBody = customSettingsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomSettings");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteCustomSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/custom_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<CustomSettingsInformation> localVarReturnType = new GenericType<CustomSettingsInformation>() {};
    CustomSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the user profile image for the specified user..
   * Deletes the user profile image from the  specified user&#39;s profile.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProfileImage(String accountId, String userId) throws ApiException {
    deleteProfileImageWithHttpInfo(accountId, userId);
  }

  /**
   * Deletes the user profile image for the specified user.
   * Deletes the user profile image from the  specified user&#39;s profile.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteProfileImageWithHttpInfo(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteProfileImage");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteProfileImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/profile/image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Removes removes signature information for the specified user..
   * Removes the signature information for the user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSignature(String accountId, String userId, String signatureId) throws ApiException {
    deleteSignatureWithHttpInfo(accountId, userId, signatureId);
  }

  /**
   * Removes removes signature information for the specified user.
   * Removes the signature information for the user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteSignatureWithHttpInfo(String accountId, String userId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteSignature");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Deletes the user initials image or the  user signature image for the specified user..
   * Deletes the specified initials image or signature image for the specified user.  The function deletes one or the other of the image types, to delete both the initials image and signature image you must call the endpoint twice.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature deleteSignatureImage(String accountId, String userId, String signatureId, String imageType) throws ApiException {
    ApiResponse<UserSignature> localVarResponse = deleteSignatureImageWithHttpInfo(accountId, userId, signatureId, imageType);
    return localVarResponse.getData();
  }

  /**
   * Deletes the user initials image or the  user signature image for the specified user.
   * Deletes the specified initials image or signature image for the specified user.  The function deletes one or the other of the image types, to delete both the initials image and signature image you must call the endpoint twice.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignature > deleteSignatureImageWithHttpInfo(String accountId, String userId, String signatureId, String imageType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteSignatureImage");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling deleteSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
    UserSignature localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a particular contact associated with the user&#39;s account. This method returns one or more contacts associated with a DocuSign account. You can also retrieve contacts from connected [cloud storage][CloudStorage] providers by using the &#x60;cloud_provider&#x60; query parameter. By default, contacts are retrieved from the DocuSign account&#39;s default address book.  To return a specific contact, use the &#x60;contactId&#x60; query parameter. To return all contacts associated with an account, omit this parameter.  [CloudStorage]: /docs/esign-rest-api/reference/cloudstorage/
  /// </summary>

 /**
  * GetContactByIdOptions Class.
  *
  **/
  public class GetContactByIdOptions
  {
  private String cloudProvider = null;
  
 /**
  * setCloudProvider method.
  */
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

 /**
  * getCloudProvider method.
  *
  * @return String
  */
  public String getCloudProvider() {
    return this.cloudProvider;
  }
  }

   /**
   * Gets a particular contact associated with the user&#39;s account..
   * This method returns one or more contacts associated with a DocuSign account. You can also retrieve contacts from connected [cloud storage][CloudStorage] providers by using the &#x60;cloud_provider&#x60; query parameter. By default, contacts are retrieved from the DocuSign account&#39;s default address book.  To return a specific contact, use the &#x60;contactId&#x60; query parameter. To return all contacts associated with an account, omit this parameter.  [CloudStorage]: /docs/esign-rest-api/reference/cloudstorage/
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @return ContactGetResponse
   */ 
  public ContactGetResponse getContactById(String accountId, String contactId) throws ApiException {
    return getContactById(accountId, contactId, null);
  }

  /**
   * Gets a particular contact associated with the user&#39;s account..
   * This method returns one or more contacts associated with a DocuSign account. You can also retrieve contacts from connected [cloud storage][CloudStorage] providers by using the &#x60;cloud_provider&#x60; query parameter. By default, contacts are retrieved from the DocuSign account&#39;s default address book.  To return a specific contact, use the &#x60;contactId&#x60; query parameter. To return all contacts associated with an account, omit this parameter.  [CloudStorage]: /docs/esign-rest-api/reference/cloudstorage/
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @param options for modifying the method behavior.
   * @return ContactGetResponse
   * @throws ApiException if fails to make API call
   */
  public ContactGetResponse getContactById(String accountId, String contactId, UsersApi.GetContactByIdOptions options) throws ApiException {
    ApiResponse<ContactGetResponse> localVarResponse = getContactByIdWithHttpInfo(accountId, contactId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a particular contact associated with the user&#39;s account.
   * This method returns one or more contacts associated with a DocuSign account. You can also retrieve contacts from connected [cloud storage][CloudStorage] providers by using the &#x60;cloud_provider&#x60; query parameter. By default, contacts are retrieved from the DocuSign account&#39;s default address book.  To return a specific contact, use the &#x60;contactId&#x60; query parameter. To return all contacts associated with an account, omit this parameter.  [CloudStorage]: /docs/esign-rest-api/reference/cloudstorage/
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @param options for modifying the method behavior.
   * @return ContactGetResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactGetResponse > getContactByIdWithHttpInfo(String accountId, String contactId, UsersApi.GetContactByIdOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getContactById");
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContactById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/contacts/{contactId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cloud_provider", options.cloudProvider));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ContactGetResponse> localVarReturnType = new GenericType<ContactGetResponse>() {};
    ContactGetResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ContactGetResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the user information for a specified user. Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
  /// </summary>

 /**
  * GetInformationOptions Class.
  *
  **/
  public class GetInformationOptions
  {
  private String additionalInfo = null;
  private String email = null;
  private String includeLicense = null;
  
 /**
  * setAdditionalInfo method.
  */
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

 /**
  * getAdditionalInfo method.
  *
  * @return String
  */
  public String getAdditionalInfo() {
    return this.additionalInfo;
  }
  
 /**
  * setEmail method.
  */
  public void setEmail(String email) {
    this.email = email;
  }

 /**
  * getEmail method.
  *
  * @return String
  */
  public String getEmail() {
    return this.email;
  }
  
 /**
  * setIncludeLicense method.
  */
  public void setIncludeLicense(String includeLicense) {
    this.includeLicense = includeLicense;
  }

 /**
  * getIncludeLicense method.
  *
  * @return String
  */
  public String getIncludeLicense() {
    return this.includeLicense;
  }
  }

   /**
   * Gets the user information for a specified user..
   * Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserInformation
   */ 
  public UserInformation getInformation(String accountId, String userId) throws ApiException {
    return getInformation(accountId, userId, null);
  }

  /**
   * Gets the user information for a specified user..
   * Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return UserInformation
   * @throws ApiException if fails to make API call
   */
  public UserInformation getInformation(String accountId, String userId, UsersApi.GetInformationOptions options) throws ApiException {
    ApiResponse<UserInformation> localVarResponse = getInformationWithHttpInfo(accountId, userId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the user information for a specified user.
   * Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return UserInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserInformation > getInformationWithHttpInfo(String accountId, String userId, UsersApi.GetInformationOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getInformation");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("additional_info", options.additionalInfo));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_license", options.includeLicense));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserInformation> localVarReturnType = new GenericType<UserInformation>() {};
    UserInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Retrieves the user profile for a specified user..
   * Retrieves the user profile information, the privacy settings and personal information (address, phone number, etc.) for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserProfile
   * @throws ApiException if fails to make API call
   */
  public UserProfile getProfile(String accountId, String userId) throws ApiException {
    ApiResponse<UserProfile> localVarResponse = getProfileWithHttpInfo(accountId, userId);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the user profile for a specified user.
   * Retrieves the user profile information, the privacy settings and personal information (address, phone number, etc.) for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserProfile
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserProfile > getProfileWithHttpInfo(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getProfile");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/profile"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserProfile> localVarReturnType = new GenericType<UserProfile>() {};
    UserProfile localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserProfile>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieves the user profile image for the specified user. Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
  /// </summary>

 /**
  * GetProfileImageOptions Class.
  *
  **/
  public class GetProfileImageOptions
  {
  private String encoding = null;
  
 /**
  * setEncoding method.
  */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

 /**
  * getEncoding method.
  *
  * @return String
  */
  public String getEncoding() {
    return this.encoding;
  }
  }

   /**
   * Retrieves the user profile image for the specified user..
   * Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return byte[]
   */ 
  public byte[] getProfileImage(String accountId, String userId) throws ApiException {
    return getProfileImage(accountId, userId, null);
  }

  /**
   * Retrieves the user profile image for the specified user..
   * Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getProfileImage(String accountId, String userId, UsersApi.GetProfileImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getProfileImageWithHttpInfo(accountId, userId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the user profile image for the specified user.
   * Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getProfileImageWithHttpInfo(String accountId, String userId, UsersApi.GetProfileImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getProfileImage");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getProfileImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/profile/image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encoding", options.encoding));
    }

    

    

    final String[] localVarAccepts = {
      "image/gif"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    byte[] localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<byte[]>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the user account settings for a specified user..
   * Retrieves a list of the account settings and email notification information for the specified user.  The response returns the account setting name/value information and the email notification settings for the specified user. For more information about the different user settings, see the [ML:userSettings list].
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public UserSettingsInformation getSettings(String accountId, String userId) throws ApiException {
    ApiResponse<UserSettingsInformation> localVarResponse = getSettingsWithHttpInfo(accountId, userId);
    return localVarResponse.getData();
  }

  /**
   * Gets the user account settings for a specified user.
   * Retrieves a list of the account settings and email notification information for the specified user.  The response returns the account setting name/value information and the email notification settings for the specified user. For more information about the different user settings, see the [ML:userSettings list].
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSettingsInformation > getSettingsWithHttpInfo(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSettings");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSettingsInformation> localVarReturnType = new GenericType<UserSettingsInformation>() {};
    UserSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the user signature information for the specified user..
   * Retrieves the structure of a single signature with a known signature name.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature getSignature(String accountId, String userId, String signatureId) throws ApiException {
    ApiResponse<UserSignature> localVarResponse = getSignatureWithHttpInfo(accountId, userId, signatureId);
    return localVarResponse.getData();
  }

  /**
   * Gets the user signature information for the specified user.
   * Retrieves the structure of a single signature with a known signature name.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignature > getSignatureWithHttpInfo(String accountId, String userId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSignature");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
    UserSignature localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieves the user initials image or the  user signature image for the specified user. Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>

 /**
  * GetSignatureImageOptions Class.
  *
  **/
  public class GetSignatureImageOptions
  {
  private String includeChrome = null;
  
 /**
  * setIncludeChrome method.
  */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

 /**
  * getIncludeChrome method.
  *
  * @return String
  */
  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Retrieves the user initials image or the  user signature image for the specified user..
   * Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return byte[]
   */ 
  public byte[] getSignatureImage(String accountId, String userId, String signatureId, String imageType) throws ApiException {
    return getSignatureImage(accountId, userId, signatureId, imageType, null);
  }

  /**
   * Retrieves the user initials image or the  user signature image for the specified user..
   * Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getSignatureImage(String accountId, String userId, String signatureId, String imageType, UsersApi.GetSignatureImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getSignatureImageWithHttpInfo(accountId, userId, signatureId, imageType, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the user initials image or the  user signature image for the specified user.
   * Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getSignatureImageWithHttpInfo(String accountId, String userId, String signatureId, String imageType, UsersApi.GetSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSignatureImage");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling getSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_chrome", options.includeChrome));
    }

    

    

    final String[] localVarAccepts = {
      "image/gif"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    byte[] localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<byte[]>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Retrieves the custom user settings for a specified user..
   * Retrieves a list of custom user settings for a single user.  Custom settings provide a flexible way to store and retrieve custom user information that can be used in your own system.  ###### Note: Custom user settings are not the same as user account settings.  ###Getting Grouped Custom User Settings###  If the custom user settings you want to retrieve are grouped, you must include the following information in the header, after Content-Type, in the request:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings.  If the extra header information is not included, only the custom user settings that were added without a group are retrieved.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public CustomSettingsInformation listCustomSettings(String accountId, String userId) throws ApiException {
    ApiResponse<CustomSettingsInformation> localVarResponse = listCustomSettingsWithHttpInfo(accountId, userId);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the custom user settings for a specified user.
   * Retrieves a list of custom user settings for a single user.  Custom settings provide a flexible way to store and retrieve custom user information that can be used in your own system.  ###### Note: Custom user settings are not the same as user account settings.  ###Getting Grouped Custom User Settings###  If the custom user settings you want to retrieve are grouped, you must include the following information in the header, after Content-Type, in the request:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings.  If the extra header information is not included, only the custom user settings that were added without a group are retrieved.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomSettingsInformation > listCustomSettingsWithHttpInfo(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomSettings");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listCustomSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/custom_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<CustomSettingsInformation> localVarReturnType = new GenericType<CustomSettingsInformation>() {};
    CustomSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieves a list of user signature definitions for a specified user. Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
  /// </summary>

 /**
  * ListSignaturesOptions Class.
  *
  **/
  public class ListSignaturesOptions
  {
  private String stampType = null;
  
 /**
  * setStampType method.
  */
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }

 /**
  * getStampType method.
  *
  * @return String
  */
  public String getStampType() {
    return this.stampType;
  }
  }

   /**
   * Retrieves a list of user signature definitions for a specified user..
   * Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserSignaturesInformation
   */ 
  public UserSignaturesInformation listSignatures(String accountId, String userId) throws ApiException {
    return listSignatures(accountId, userId, null);
  }

  /**
   * Retrieves a list of user signature definitions for a specified user..
   * Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public UserSignaturesInformation listSignatures(String accountId, String userId, UsersApi.ListSignaturesOptions options) throws ApiException {
    ApiResponse<UserSignaturesInformation> localVarResponse = listSignaturesWithHttpInfo(accountId, userId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves a list of user signature definitions for a specified user.
   * Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignaturesInformation > listSignaturesWithHttpInfo(String accountId, String userId, UsersApi.ListSignaturesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSignatures");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_type", options.stampType));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignaturesInformation> localVarReturnType = new GenericType<UserSignaturesInformation>() {};
    UserSignaturesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignaturesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Imports multiple new contacts into the contacts collection from CSV, JSON, or XML (based on content type)..
   * This method adds multiple contacts into a contacts list.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse postContacts(String accountId, ContactModRequest contactModRequest) throws ApiException {
    ApiResponse<ContactUpdateResponse> localVarResponse = postContactsWithHttpInfo(accountId, contactModRequest);
    return localVarResponse.getData();
  }

  /**
   * Imports multiple new contacts into the contacts collection from CSV, JSON, or XML (based on content type).
   * This method adds multiple contacts into a contacts list.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactUpdateResponse > postContactsWithHttpInfo(String accountId, ContactModRequest contactModRequest) throws ApiException {
    Object localVarPostBody = contactModRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling postContacts");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/contacts"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
    ContactUpdateResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ContactUpdateResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Replaces contacts associated with an account for the DocuSign service..
   * This method updates one or more contacts associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse putContacts(String accountId, ContactModRequest contactModRequest) throws ApiException {
    ApiResponse<ContactUpdateResponse> localVarResponse = putContactsWithHttpInfo(accountId, contactModRequest);
    return localVarResponse.getData();
  }

  /**
   * Replaces contacts associated with an account for the DocuSign service.
   * This method updates one or more contacts associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactUpdateResponse > putContactsWithHttpInfo(String accountId, ContactModRequest contactModRequest) throws ApiException {
    Object localVarPostBody = contactModRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putContacts");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/contacts"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
    ContactUpdateResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ContactUpdateResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds or updates custom user settings for the specified user..
   * Adds or updates custom user settings for the specified user.  ###### Note: Custom user settings are not the same as user account settings.  Custom settings provide a flexible way to store and retrieve custom user information that you can use in your own system.  **Important**: There is a limit on the size for all the custom user settings for a single user. The limit is 4,000 characters, which includes the XML and JSON structure for the settings.  ### Grouping Custom User Settings ###  You can group custom user settings when adding them. Grouping allows you to retrieve settings that are in a specific group, instead of retrieving all the user custom settings.  To group custom user settings, add the following information in the header, after Content-Type:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings. Grouping is shown in the Example Request Body below.  When getting or deleting grouped custom user settings, you must include the extra header information.  Grouping custom user settings is not required and if the extra header information is not included, the custom user settings are added normally and can be retrieved or deleted without including the additional header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param customSettingsInformation  (optional)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public CustomSettingsInformation updateCustomSettings(String accountId, String userId, CustomSettingsInformation customSettingsInformation) throws ApiException {
    ApiResponse<CustomSettingsInformation> localVarResponse = updateCustomSettingsWithHttpInfo(accountId, userId, customSettingsInformation);
    return localVarResponse.getData();
  }

  /**
   * Adds or updates custom user settings for the specified user.
   * Adds or updates custom user settings for the specified user.  ###### Note: Custom user settings are not the same as user account settings.  Custom settings provide a flexible way to store and retrieve custom user information that you can use in your own system.  **Important**: There is a limit on the size for all the custom user settings for a single user. The limit is 4,000 characters, which includes the XML and JSON structure for the settings.  ### Grouping Custom User Settings ###  You can group custom user settings when adding them. Grouping allows you to retrieve settings that are in a specific group, instead of retrieving all the user custom settings.  To group custom user settings, add the following information in the header, after Content-Type:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings. Grouping is shown in the Example Request Body below.  When getting or deleting grouped custom user settings, you must include the extra header information.  Grouping custom user settings is not required and if the extra header information is not included, the custom user settings are added normally and can be retrieved or deleted without including the additional header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param customSettingsInformation  (optional)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomSettingsInformation > updateCustomSettingsWithHttpInfo(String accountId, String userId, CustomSettingsInformation customSettingsInformation) throws ApiException {
    Object localVarPostBody = customSettingsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomSettings");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateCustomSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/custom_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<CustomSettingsInformation> localVarReturnType = new GenericType<CustomSettingsInformation>() {};
    CustomSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the user profile information for the specified user..
   * Updates the user&#39;s detail information, profile information, privacy settings, and personal information in the user ID card.  You can also change a user&#39;s name by changing the information in the &#x60;userDetails&#x60; property. When changing a user&#39;s name, you can either change the information in the &#x60;userName&#x60; property OR change the information in &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName, suffixName&#x60;, and &#x60;title&#x60; properties. Changes to &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName&#x60;, &#x60;suffixName&#x60;, and &#x60;title&#x60; properties take precedence over changes to the &#x60;userName&#x60; property.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userProfile  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateProfile(String accountId, String userId, UserProfile userProfile) throws ApiException {
    updateProfileWithHttpInfo(accountId, userId, userProfile);
  }

  /**
   * Updates the user profile information for the specified user.
   * Updates the user&#39;s detail information, profile information, privacy settings, and personal information in the user ID card.  You can also change a user&#39;s name by changing the information in the &#x60;userDetails&#x60; property. When changing a user&#39;s name, you can either change the information in the &#x60;userName&#x60; property OR change the information in &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName, suffixName&#x60;, and &#x60;title&#x60; properties. Changes to &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName&#x60;, &#x60;suffixName&#x60;, and &#x60;title&#x60; properties take precedence over changes to the &#x60;userName&#x60; property.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userProfile  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateProfileWithHttpInfo(String accountId, String userId, UserProfile userProfile) throws ApiException {
    Object localVarPostBody = userProfile;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateProfile");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/profile"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Updates the user profile image for a specified user..
   * Updates the user profile image by uploading an image to the user profile.  The supported image formats are: gif, png, jpeg, and bmp. The file must be less than 200K. For best viewing results, DocuSign recommends that the image is no more than 79 pixels wide and high.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProfileImage(String accountId, String userId) throws ApiException {
    updateProfileImageWithHttpInfo(accountId, userId);
  }

  /**
   * Updates the user profile image for a specified user.
   * Updates the user profile image by uploading an image to the user profile.  The supported image formats are: gif, png, jpeg, and bmp. The file must be less than 200K. For best viewing results, DocuSign recommends that the image is no more than 79 pixels wide and high.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateProfileImageWithHttpInfo(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateProfileImage");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateProfileImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/profile/image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Updates the user account settings for a specified user. Updates the account settings list and email notification types for the specified user.
  /// </summary>

 /**
  * UpdateSettingsOptions Class.
  *
  **/
  public class UpdateSettingsOptions
  {
  private String allowAllLanguages = null;
  
 /**
  * setAllowAllLanguages method.
  */
  public void setAllowAllLanguages(String allowAllLanguages) {
    this.allowAllLanguages = allowAllLanguages;
  }

 /**
  * getAllowAllLanguages method.
  *
  * @return String
  */
  public String getAllowAllLanguages() {
    return this.allowAllLanguages;
  }
  }

   /**
   * Updates the user account settings for a specified user..
   * Updates the account settings list and email notification types for the specified user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSettingsInformation  (optional)
   * @return void
   */ 
  public void updateSettings(String accountId, String userId, UserSettingsInformation userSettingsInformation) throws ApiException {
    updateSettings(accountId, userId, userSettingsInformation, null);
  }

  /**
   * Updates the user account settings for a specified user..
   * Updates the account settings list and email notification types for the specified user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSettingsInformation  (optional)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void updateSettings(String accountId, String userId, UserSettingsInformation userSettingsInformation, UsersApi.UpdateSettingsOptions options) throws ApiException {
    updateSettingsWithHttpInfo(accountId, userId, userSettingsInformation, options);
  }

  /**
   * Updates the user account settings for a specified user.
   * Updates the account settings list and email notification types for the specified user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSettingsInformation  (optional)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateSettingsWithHttpInfo(String accountId, String userId, UserSettingsInformation userSettingsInformation, UsersApi.UpdateSettingsOptions options) throws ApiException {
    Object localVarPostBody = userSettingsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSettings");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("allow_all_languages", options.allowAllLanguages));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Updates the user signature for a specified user. Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
  /// </summary>

 /**
  * UpdateSignatureOptions Class.
  *
  **/
  public class UpdateSignatureOptions
  {
  private String closeExistingSignature = null;
  
 /**
  * setCloseExistingSignature method.
  */
  public void setCloseExistingSignature(String closeExistingSignature) {
    this.closeExistingSignature = closeExistingSignature;
  }

 /**
  * getCloseExistingSignature method.
  *
  * @return String
  */
  public String getCloseExistingSignature() {
    return this.closeExistingSignature;
  }
  }

   /**
   * Updates the user signature for a specified user..
   * Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param userSignatureDefinition  (optional)
   * @return UserSignature
   */ 
  public UserSignature updateSignature(String accountId, String userId, String signatureId, UserSignatureDefinition userSignatureDefinition) throws ApiException {
    return updateSignature(accountId, userId, signatureId, userSignatureDefinition, null);
  }

  /**
   * Updates the user signature for a specified user..
   * Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param userSignatureDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature updateSignature(String accountId, String userId, String signatureId, UserSignatureDefinition userSignatureDefinition, UsersApi.UpdateSignatureOptions options) throws ApiException {
    ApiResponse<UserSignature> localVarResponse = updateSignatureWithHttpInfo(accountId, userId, signatureId, userSignatureDefinition, options);
    return localVarResponse.getData();
  }

  /**
   * Updates the user signature for a specified user.
   * Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param userSignatureDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignature > updateSignatureWithHttpInfo(String accountId, String userId, String signatureId, UserSignatureDefinition userSignatureDefinition, UsersApi.UpdateSignatureOptions options) throws ApiException {
    Object localVarPostBody = userSignatureDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSignature");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("close_existing_signature", options.closeExistingSignature));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
    UserSignature localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates the user signature image or user initials image for the specified user. Updates the user signature image or user initials image for the specified user. The supported image formats for this file are: gif, png, jpeg, and bmp. The file must be less than 200K.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;. 
  /// </summary>

 /**
  * UpdateSignatureImageOptions Class.
  *
  **/
  public class UpdateSignatureImageOptions
  {
  private String transparentPng = null;
  
 /**
  * setTransparentPng method.
  */
  public void setTransparentPng(String transparentPng) {
    this.transparentPng = transparentPng;
  }

 /**
  * getTransparentPng method.
  *
  * @return String
  */
  public String getTransparentPng() {
    return this.transparentPng;
  }
  }

   /**
   * Updates the user signature image or user initials image for the specified user..
   * Updates the user signature image or user initials image for the specified user. The supported image formats for this file are: gif, png, jpeg, and bmp. The file must be less than 200K.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param imageBytes Updated image content. (required)
   * @return UserSignature
   */ 
  public UserSignature updateSignatureImage(String accountId, String userId, String signatureId, String imageType, byte[] imageBytes) throws ApiException {
    return updateSignatureImage(accountId, userId, signatureId, imageType, imageBytes, null);
  }

  /**
   * Updates the user signature image or user initials image for the specified user..
   * Updates the user signature image or user initials image for the specified user. The supported image formats for this file are: gif, png, jpeg, and bmp. The file must be less than 200K.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param imageBytes Updated image content. (required)
   * @param options for modifying the method behavior.
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature updateSignatureImage(String accountId, String userId, String signatureId, String imageType, byte[] imageBytes, UsersApi.UpdateSignatureImageOptions options) throws ApiException {
    ApiResponse<UserSignature> localVarResponse = updateSignatureImageWithHttpInfo(accountId, userId, signatureId, imageType, imageBytes, options);
    return localVarResponse.getData();
  }

  /**
   * Updates the user signature image or user initials image for the specified user.
   * Updates the user signature image or user initials image for the specified user. The supported image formats for this file are: gif, png, jpeg, and bmp. The file must be less than 200K.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param imageBytes Updated image content. (required)
   * @param options for modifying the method behavior.
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignature > updateSignatureImageWithHttpInfo(String accountId, String userId, String signatureId, String imageType, byte[] imageBytes, UsersApi.UpdateSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = imageBytes;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSignatureImage");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling updateSignatureImage");
    }
    
    // verify the required parameter 'imageBytes' is set
    if (imageBytes == null) {
      throw new ApiException(400, "Missing the required parameter 'imageBytes' when calling updateSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transparent_png", options.transparentPng));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
    UserSignature localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds/updates a user signature..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSignaturesInformation  (optional)
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public UserSignaturesInformation updateSignatures(String accountId, String userId, UserSignaturesInformation userSignaturesInformation) throws ApiException {
    ApiResponse<UserSignaturesInformation> localVarResponse = updateSignaturesWithHttpInfo(accountId, userId, userSignaturesInformation);
    return localVarResponse.getData();
  }

  /**
   * Adds/updates a user signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSignaturesInformation  (optional)
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignaturesInformation > updateSignaturesWithHttpInfo(String accountId, String userId, UserSignaturesInformation userSignaturesInformation) throws ApiException {
    Object localVarPostBody = userSignaturesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSignatures");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserSignaturesInformation> localVarReturnType = new GenericType<UserSignaturesInformation>() {};
    UserSignaturesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignaturesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates the specified user information. To update user information for a specific user, submit a [Users](#Users) object with updated field values in the request body of this operation.
  /// </summary>

 /**
  * UpdateUserOptions Class.
  *
  **/
  public class UpdateUserOptions
  {
  private String allowAllLanguages = null;
  
 /**
  * setAllowAllLanguages method.
  */
  public void setAllowAllLanguages(String allowAllLanguages) {
    this.allowAllLanguages = allowAllLanguages;
  }

 /**
  * getAllowAllLanguages method.
  *
  * @return String
  */
  public String getAllowAllLanguages() {
    return this.allowAllLanguages;
  }
  }

   /**
   * Updates the specified user information..
   * To update user information for a specific user, submit a [Users](#Users) object with updated field values in the request body of this operation.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userInformation  (optional)
   * @return UserInformation
   */ 
  public UserInformation updateUser(String accountId, String userId, UserInformation userInformation) throws ApiException {
    return updateUser(accountId, userId, userInformation, null);
  }

  /**
   * Updates the specified user information..
   * To update user information for a specific user, submit a [Users](#Users) object with updated field values in the request body of this operation.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userInformation  (optional)
   * @param options for modifying the method behavior.
   * @return UserInformation
   * @throws ApiException if fails to make API call
   */
  public UserInformation updateUser(String accountId, String userId, UserInformation userInformation, UsersApi.UpdateUserOptions options) throws ApiException {
    ApiResponse<UserInformation> localVarResponse = updateUserWithHttpInfo(accountId, userId, userInformation, options);
    return localVarResponse.getData();
  }

  /**
   * Updates the specified user information.
   * To update user information for a specific user, submit a [Users](#Users) object with updated field values in the request body of this operation.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userInformation  (optional)
   * @param options for modifying the method behavior.
   * @return UserInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserInformation > updateUserWithHttpInfo(String accountId, String userId, UserInformation userInformation, UsersApi.UpdateUserOptions options) throws ApiException {
    Object localVarPostBody = userInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("allow_all_languages", options.allowAllLanguages));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserInformation> localVarReturnType = new GenericType<UserInformation>() {};
    UserInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Change one or more user in the specified account. This method updates the information about one or more account users.
  /// </summary>

 /**
  * UpdateUsersOptions Class.
  *
  **/
  public class UpdateUsersOptions
  {
  private String allowAllLanguages = null;
  
 /**
  * setAllowAllLanguages method.
  */
  public void setAllowAllLanguages(String allowAllLanguages) {
    this.allowAllLanguages = allowAllLanguages;
  }

 /**
  * getAllowAllLanguages method.
  *
  * @return String
  */
  public String getAllowAllLanguages() {
    return this.allowAllLanguages;
  }
  }

   /**
   * Change one or more user in the specified account..
   * This method updates the information about one or more account users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInformationList  (optional)
   * @return UserInformationList
   */ 
  public UserInformationList updateUsers(String accountId, UserInformationList userInformationList) throws ApiException {
    return updateUsers(accountId, userInformationList, null);
  }

  /**
   * Change one or more user in the specified account..
   * This method updates the information about one or more account users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInformationList  (optional)
   * @param options for modifying the method behavior.
   * @return UserInformationList
   * @throws ApiException if fails to make API call
   */
  public UserInformationList updateUsers(String accountId, UserInformationList userInformationList, UsersApi.UpdateUsersOptions options) throws ApiException {
    ApiResponse<UserInformationList> localVarResponse = updateUsersWithHttpInfo(accountId, userInformationList, options);
    return localVarResponse.getData();
  }

  /**
   * Change one or more user in the specified account.
   * This method updates the information about one or more account users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInformationList  (optional)
   * @param options for modifying the method behavior.
   * @return UserInformationList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserInformationList > updateUsersWithHttpInfo(String accountId, UserInformationList userInformationList, UsersApi.UpdateUsersOptions options) throws ApiException {
    Object localVarPostBody = userInformationList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("allow_all_languages", options.allowAllLanguages));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserInformationList> localVarReturnType = new GenericType<UserInformationList>() {};
    UserInformationList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserInformationList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
