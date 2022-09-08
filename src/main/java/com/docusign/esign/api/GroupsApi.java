
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * GroupsApi class.
 *
 **/
public class GroupsApi {
  private ApiClient apiClient;

 /**
  * GroupsApi.
  *
  **/
  public GroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * GroupsApi.
  *
  **/
  public GroupsApi(ApiClient apiClient) {
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


  /**
   * Creates one or more groups for the account..
   * Creates one or more groups for the account.  Groups can be used to help manage users by associating users with a group. You can associate a group with a Permission Profile, which sets the user permissions for users in that group without having to set the &#x60;userSettings&#x60; property for each user. You are not required to set Permission Profiles for a group, but it makes it easier to manage user permissions for a large number of users. You can also use groups with template sharing to limit user access to templates.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation createGroups(String accountId, GroupInformation groupInformation) throws ApiException {
    ApiResponse<GroupInformation> localVarResponse = createGroupsWithHttpInfo(accountId, groupInformation);
    return localVarResponse.getData();
  }

  /**
   * Creates one or more groups for the account.
   * Creates one or more groups for the account.  Groups can be used to help manage users by associating users with a group. You can associate a group with a Permission Profile, which sets the user permissions for users in that group without having to set the &#x60;userSettings&#x60; property for each user. You are not required to set Permission Profiles for a group, but it makes it easier to manage user permissions for a large number of users. You can also use groups with template sharing to limit user access to templates.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupInformation > createGroupsWithHttpInfo(String accountId, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups"
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
    
    GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
    GroupInformation localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes brand information from the requested group..
   * Deletes brand information from the requested group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param brandsRequest  (optional)
   * @return GroupBrands
   * @throws ApiException if fails to make API call
   */
  public GroupBrands deleteBrands(String accountId, String groupId, BrandsRequest brandsRequest) throws ApiException {
    ApiResponse<GroupBrands> localVarResponse = deleteBrandsWithHttpInfo(accountId, groupId, brandsRequest);
    return localVarResponse.getData();
  }

  /**
   * Deletes brand information from the requested group.
   * Deletes brand information from the requested group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param brandsRequest  (optional)
   * @return GroupBrands
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupBrands > deleteBrandsWithHttpInfo(String accountId, String groupId, BrandsRequest brandsRequest) throws ApiException {
    Object localVarPostBody = brandsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrands");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups/{groupId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    GenericType<GroupBrands> localVarReturnType = new GenericType<GroupBrands>() {};
    GroupBrands localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupBrands>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes one or more users from a gro.
   * Deletes one or more users from a group. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param userInfoList  (optional)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse deleteGroupUsers(String accountId, String groupId, UserInfoList userInfoList) throws ApiException {
    ApiResponse<UsersResponse> localVarResponse = deleteGroupUsersWithHttpInfo(accountId, groupId, userInfoList);
    return localVarResponse.getData();
  }

  /**
   * Deletes one or more users from a gro
   * Deletes one or more users from a group. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param userInfoList  (optional)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersResponse > deleteGroupUsersWithHttpInfo(String accountId, String groupId, UserInfoList userInfoList) throws ApiException {
    Object localVarPostBody = userInfoList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteGroupUsers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteGroupUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups/{groupId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
    UsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes an existing user group..
   * Deletes an existing user group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation deleteGroups(String accountId, GroupInformation groupInformation) throws ApiException {
    ApiResponse<GroupInformation> localVarResponse = deleteGroupsWithHttpInfo(accountId, groupInformation);
    return localVarResponse.getData();
  }

  /**
   * Deletes an existing user group.
   * Deletes an existing user group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupInformation > deleteGroupsWithHttpInfo(String accountId, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups"
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
    
    GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
    GroupInformation localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets group brand ID Information. .
   * Retrieves information about the brands associated with the requested group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @return GroupBrands
   * @throws ApiException if fails to make API call
   */
  public GroupBrands getBrands(String accountId, String groupId) throws ApiException {
    ApiResponse<GroupBrands> localVarResponse = getBrandsWithHttpInfo(accountId, groupId);
    return localVarResponse.getData();
  }

  /**
   * Gets group brand ID Information. 
   * Retrieves information about the brands associated with the requested group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @return GroupBrands
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupBrands > getBrandsWithHttpInfo(String accountId, String groupId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrands");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups/{groupId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    GenericType<GroupBrands> localVarReturnType = new GenericType<GroupBrands>() {};
    GroupBrands localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupBrands>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a list of users in a group. Retrieves a list of users in a group.
  /// </summary>

 /**
  * ListGroupUsersOptions Class.
  *
  **/
  public class ListGroupUsersOptions
  {
  private String count = null;
  private String startPosition = null;
  
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
  }

   /**
   * Gets a list of users in a group..
   * Retrieves a list of users in a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @return UsersResponse
   */ 
  public UsersResponse listGroupUsers(String accountId, String groupId) throws ApiException {
    return listGroupUsers(accountId, groupId, null);
  }

  /**
   * Gets a list of users in a group..
   * Retrieves a list of users in a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param options for modifying the method behavior.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listGroupUsers(String accountId, String groupId, GroupsApi.ListGroupUsersOptions options) throws ApiException {
    ApiResponse<UsersResponse> localVarResponse = listGroupUsersWithHttpInfo(accountId, groupId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of users in a group.
   * Retrieves a list of users in a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param options for modifying the method behavior.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersResponse > listGroupUsersWithHttpInfo(String accountId, String groupId, GroupsApi.ListGroupUsersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listGroupUsers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups/{groupId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
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
    UsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets information about groups associated with the account. Retrieves information about groups associated with the account.
  /// </summary>

 /**
  * ListGroupsOptions Class.
  *
  **/
  public class ListGroupsOptions
  {
  private String count = null;
  private String groupType = null;
  private String includeUsercount = null;
  private String searchText = null;
  private String startPosition = null;
  
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
  * setGroupType method.
  */
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

 /**
  * getGroupType method.
  *
  * @return String
  */
  public String getGroupType() {
    return this.groupType;
  }
  
 /**
  * setIncludeUsercount method.
  */
  public void setIncludeUsercount(String includeUsercount) {
    this.includeUsercount = includeUsercount;
  }

 /**
  * getIncludeUsercount method.
  *
  * @return String
  */
  public String getIncludeUsercount() {
    return this.includeUsercount;
  }
  
 /**
  * setSearchText method.
  */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

 /**
  * getSearchText method.
  *
  * @return String
  */
  public String getSearchText() {
    return this.searchText;
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
  }

   /**
   * Gets information about groups associated with the account..
   * Retrieves information about groups associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return GroupInformation
   */ 
  public GroupInformation listGroups(String accountId) throws ApiException {
    return listGroups(accountId, null);
  }

  /**
   * Gets information about groups associated with the account..
   * Retrieves information about groups associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation listGroups(String accountId, GroupsApi.ListGroupsOptions options) throws ApiException {
    ApiResponse<GroupInformation> localVarResponse = listGroupsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets information about groups associated with the account.
   * Retrieves information about groups associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupInformation > listGroupsWithHttpInfo(String accountId, GroupsApi.ListGroupsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("group_type", options.groupType));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_usercount", options.includeUsercount));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
    GroupInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds group brand ID information to a group..
   * Adds group brand ID information to a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param brandsRequest  (optional)
   * @return GroupBrands
   * @throws ApiException if fails to make API call
   */
  public GroupBrands updateBrands(String accountId, String groupId, BrandsRequest brandsRequest) throws ApiException {
    ApiResponse<GroupBrands> localVarResponse = updateBrandsWithHttpInfo(accountId, groupId, brandsRequest);
    return localVarResponse.getData();
  }

  /**
   * Adds group brand ID information to a group.
   * Adds group brand ID information to a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param brandsRequest  (optional)
   * @return GroupBrands
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupBrands > updateBrandsWithHttpInfo(String accountId, String groupId, BrandsRequest brandsRequest) throws ApiException {
    Object localVarPostBody = brandsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrands");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups/{groupId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    GenericType<GroupBrands> localVarReturnType = new GenericType<GroupBrands>() {};
    GroupBrands localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupBrands>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds one or more users to an existing group..
   * Adds one or more users to an existing group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param userInfoList  (optional)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse updateGroupUsers(String accountId, String groupId, UserInfoList userInfoList) throws ApiException {
    ApiResponse<UsersResponse> localVarResponse = updateGroupUsersWithHttpInfo(accountId, groupId, userInfoList);
    return localVarResponse.getData();
  }

  /**
   * Adds one or more users to an existing group.
   * Adds one or more users to an existing group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param userInfoList  (optional)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersResponse > updateGroupUsersWithHttpInfo(String accountId, String groupId, UserInfoList userInfoList) throws ApiException {
    Object localVarPostBody = userInfoList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateGroupUsers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateGroupUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups/{groupId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
    UsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the group information for a group..
   * Updates the group name and modifies, or sets, the permission profile for the group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation updateGroups(String accountId, GroupInformation groupInformation) throws ApiException {
    ApiResponse<GroupInformation> localVarResponse = updateGroupsWithHttpInfo(accountId, groupInformation);
    return localVarResponse.getData();
  }

  /**
   * Updates the group information for a group.
   * Updates the group name and modifies, or sets, the permission profile for the group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupInformation > updateGroupsWithHttpInfo(String accountId, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/groups"
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
    
    GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
    GroupInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
