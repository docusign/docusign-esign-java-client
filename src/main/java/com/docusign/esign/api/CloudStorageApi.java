package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.CloudStorageProviders;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ExternalFolder;




  public class CloudStorageApi {
  private ApiClient apiClient;

  public CloudStorageApi() {
  this(Configuration.getDefaultApiClient());
  }

  public CloudStorageApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Configures the redirect URL information  for one or more cloud storage providers for the specified user.
   * Configures the redirect URL information  for one or more cloud storage providers for the specified user. The redirect URL is added to the authentication URL to complete the return route.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param cloudStorageProviders  (optional)
   * @return CloudStorageProviders
   * @throws ApiException if fails to make API call
   */
  public CloudStorageProviders createProvider(String accountId, String userId, CloudStorageProviders cloudStorageProviders) throws ApiException {
    Object localVarPostBody = cloudStorageProviders;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createProvider");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createProvider");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

        GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes the user authentication information for the specified cloud storage provider.
   * Deletes the user authentication information for the specified cloud storage provider. The next time the user tries to access the cloud storage provider, they must pass normal authentication for this cloud storage provider.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @return CloudStorageProviders
   * @throws ApiException if fails to make API call
   */
  public CloudStorageProviders deleteProvider(String accountId, String userId, String serviceId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteProvider");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteProvider");
      }
    
      // verify the required parameter 'serviceId' is set
      if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling deleteProvider");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

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

        GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes the user authentication information for one or more cloud storage providers.
   * Deletes the user authentication information for one or more cloud storage providers. The next time the user tries to access the cloud storage provider, they must pass normal authentication.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param cloudStorageProviders  (optional)
   * @return CloudStorageProviders
   * @throws ApiException if fails to make API call
   */
  public CloudStorageProviders deleteProviders(String accountId, String userId, CloudStorageProviders cloudStorageProviders) throws ApiException {
    Object localVarPostBody = cloudStorageProviders;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteProviders");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteProviders");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

        GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets the specified Cloud Storage Provider configuration for the User. Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
  /// </summary>
  public class GetProviderOptions
  {
  private String redirectUrl = null;
  /*
   *  The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.  The redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.   
   */
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }
  
  public String getRedirectUrl() {
    return this.redirectUrl;
  }
  }

   /**
   * Gets the specified Cloud Storage Provider configuration for the User.
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @return CloudStorageProviders
   */ 
  public CloudStorageProviders getProvider(String accountId, String userId, String serviceId) throws ApiException {
    return getProvider(accountId, userId, serviceId, null);
  }

  /**
   * Gets the specified Cloud Storage Provider configuration for the User.
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @param options for modifying the method behavior.
   * @return CloudStorageProviders
   * @throws ApiException if fails to make API call
   */
  public CloudStorageProviders getProvider(String accountId, String userId, String serviceId, CloudStorageApi.GetProviderOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getProvider");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getProvider");
      }
    
      // verify the required parameter 'serviceId' is set
      if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling getProvider");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectUrl", options.redirectUrl));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets a list of all the items from the specified cloud storage provider. Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
  /// </summary>
  public class ListOptions
  {
  private String cloudStorageFolderPath = null;
  private String count = null;
  private String order = null;
  private String orderBy = null;
  private String searchText = null;
  private String startPosition = null;
  /*
   * 
   */
  public void setCloudStorageFolderPath(String cloudStorageFolderPath) {
    this.cloudStorageFolderPath = cloudStorageFolderPath;
  }
  
  public String getCloudStorageFolderPath() {
    return this.cloudStorageFolderPath;
  }
  /*
   * An optional value that sets how many items are included in the response.   The default setting for this is 25.  
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * An optional value that sets the direction order used to sort the item list.   Valid values are:   * asc &#x3D; ascending sort order * desc &#x3D; descending sort order  
   */
  public void setOrder(String order) {
    this.order = order;
  }
  
  public String getOrder() {
    return this.order;
  }
  /*
   * An optional value that sets the file attribute used to sort the item list.   Valid values are:   * modified * name   
   */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }
  
  public String getOrderBy() {
    return this.orderBy;
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
   * Indicates the starting point of the first item included in the response set. It uses a 0-based index. The default setting for this is 0.   
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Gets a list of all the items from the specified cloud storage provider.
   * Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @return ExternalFolder
   */ 
  public ExternalFolder list(String accountId, String userId, String serviceId, String folderId) throws ApiException {
    return list(accountId, userId, serviceId, folderId, null);
  }

  /**
   * Gets a list of all the items from the specified cloud storage provider.
   * Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param options for modifying the method behavior.
   * @return ExternalFolder
   * @throws ApiException if fails to make API call
   */
  public ExternalFolder list(String accountId, String userId, String serviceId, String folderId, CloudStorageApi.ListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling list");
      }
    
      // verify the required parameter 'serviceId' is set
      if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling list");
      }
    
      // verify the required parameter 'folderId' is set
      if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling list");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders/{folderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloud_storage_folder_path", options.cloudStorageFolderPath));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
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

        GenericType<ExternalFolder> localVarReturnType = new GenericType<ExternalFolder>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Retrieves a list of all the items in a specified folder from the specified cloud storage provider. Retrieves a list of all the items in a specified folder from the specified cloud storage provider. 
  /// </summary>
  public class ListFoldersOptions
  {
  private String cloudStorageFolderPath = null;
  private String count = null;
  private String order = null;
  private String orderBy = null;
  private String searchText = null;
  private String startPosition = null;
  /*
   * A comma separated list of folder IDs included in the request.  
   */
  public void setCloudStorageFolderPath(String cloudStorageFolderPath) {
    this.cloudStorageFolderPath = cloudStorageFolderPath;
  }
  
  public String getCloudStorageFolderPath() {
    return this.cloudStorageFolderPath;
  }
  /*
   * An optional value that sets how many items are included in the response.   The default setting for this is 25.  
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * An optional value that sets the direction order used to sort the item list.   Valid values are:   * asc &#x3D; ascending sort order * desc &#x3D; descending sort order  
   */
  public void setOrder(String order) {
    this.order = order;
  }
  
  public String getOrder() {
    return this.order;
  }
  /*
   * An optional value that sets the file attribute used to sort the item list.   Valid values are:   * modified * name   
   */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }
  
  public String getOrderBy() {
    return this.orderBy;
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
   * Indicates the starting point of the first item included in the response set. It uses a 0-based index. The default setting for this is 0.   
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider.
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @return ExternalFolder
   */ 
  public ExternalFolder listFolders(String accountId, String userId, String serviceId) throws ApiException {
    return listFolders(accountId, userId, serviceId, null);
  }

  /**
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider.
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @param options for modifying the method behavior.
   * @return ExternalFolder
   * @throws ApiException if fails to make API call
   */
  public ExternalFolder listFolders(String accountId, String userId, String serviceId, CloudStorageApi.ListFoldersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listFolders");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listFolders");
      }
    
      // verify the required parameter 'serviceId' is set
      if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling listFolders");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloud_storage_folder_path", options.cloudStorageFolderPath));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
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

        GenericType<ExternalFolder> localVarReturnType = new GenericType<ExternalFolder>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Get the Cloud Storage Provider configuration for the specified user. Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.  The {serviceId} parameter can be either the service name or serviceId.
  /// </summary>
  public class ListProvidersOptions
  {
  private String redirectUrl = null;
  /*
   *  The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.  The redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.   
   */
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }
  
  public String getRedirectUrl() {
    return this.redirectUrl;
  }
  }

   /**
   * Get the Cloud Storage Provider configuration for the specified user.
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.  The {serviceId} parameter can be either the service name or serviceId.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return CloudStorageProviders
   */ 
  public CloudStorageProviders listProviders(String accountId, String userId) throws ApiException {
    return listProviders(accountId, userId, null);
  }

  /**
   * Get the Cloud Storage Provider configuration for the specified user.
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.  The {serviceId} parameter can be either the service name or serviceId.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return CloudStorageProviders
   * @throws ApiException if fails to make API call
   */
  public CloudStorageProviders listProviders(String accountId, String userId, CloudStorageApi.ListProvidersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listProviders");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listProviders");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectUrl", options.redirectUrl));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
