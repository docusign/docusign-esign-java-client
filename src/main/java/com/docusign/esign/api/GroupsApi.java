package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.BrandsRequest;
import com.docusign.esign.model.BrandsResponse;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.GroupInformation;
import com.docusign.esign.model.UserInfoList;
import com.docusign.esign.model.UsersResponse;




  public class GroupsApi {
  private ApiClient apiClient;

  public GroupsApi() {
  this(Configuration.getDefaultApiClient());
  }

  public GroupsApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Creates one or more groups for the account.
   * Creates one or more groups for the account.  Groups can be used to help manage users by associating users with a group. You can associate a group with a Permission Profile, which sets the user permissions for users in that group without having to set the &#x60;userSettings&#x60; property for each user. You are not required to set Permission Profiles for a group, but it makes it easier to manage user permissions for a large number of users. You can also use groups with template sharing to limit user access to templates.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation createGroups(String accountId, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createGroups");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes brand information from the requested group.
   * Deletes brand information from the requested group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param brandsRequest  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse deleteBrands(String accountId, String groupId, BrandsRequest brandsRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/groups/{groupId}/brands".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public UsersResponse deleteGroupUsers(String accountId, String groupId, UserInfoList userInfoList) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/groups/{groupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes an existing user group.
   * Deletes an existing user group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation deleteGroups(String accountId, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteGroups");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets group brand ID Information. 
   * Retrieves information about the brands associated with the requested group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse getBrands(String accountId, String groupId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/groups/{groupId}/brands".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets a list of users in a group. Retrieves a list of users in a group.
  /// </summary>
  public class ListGroupUsersOptions
  {
  private String count = null;
  private String startPosition = null;
  /*
   * Number of records to return. The number must be greater than 1 and less than or equal to 100.  
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * Starting value for the list. 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Gets a list of users in a group.
   * Retrieves a list of users in a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @return UsersResponse
   */ 
  public UsersResponse listGroupUsers(String accountId, String groupId) throws ApiException {
    return listGroupUsers(accountId, groupId, null);
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
  public UsersResponse listGroupUsers(String accountId, String groupId, GroupsApi.ListGroupUsersOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/groups/{groupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets information about groups associated with the account. Retrieves information about groups associated with the account.
  /// </summary>
  public class ListGroupsOptions
  {
  private String count = null;
  private String groupType = null;
  private String searchText = null;
  private String startPosition = null;
  /*
   * Number of records to return. The number must be greater than 1 and less than or equal to 100. 
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }
  
  public String getGroupType() {
    return this.groupType;
  }
  /*
   * 
   */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }
  
  public String getSearchText() {
    return this.searchText;
  }
  /*
   * Starting value for the list. 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Gets information about groups associated with the account.
   * Retrieves information about groups associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return GroupInformation
   */ 
  public GroupInformation listGroups(String accountId) throws ApiException {
    return listGroups(accountId, null);
  }

  /**
   * Gets information about groups associated with the account.
   * Retrieves information about groups associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation listGroups(String accountId, GroupsApi.ListGroupsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listGroups");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_type", options.groupType));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Adds group brand ID information to a group.
   * Adds group brand ID information to a group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupId The ID of the group being accessed. (required)
   * @param brandsRequest  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse updateBrands(String accountId, String groupId, BrandsRequest brandsRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/groups/{groupId}/brands".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public UsersResponse updateGroupUsers(String accountId, String groupId, UserInfoList userInfoList) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/groups/{groupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Updates the group information for a group.
   * Updates the group name and modifies, or sets, the permission profile for the group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation updateGroups(String accountId, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateGroups");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
