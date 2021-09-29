
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;




/**
 * CloudStorageApi class.
 *
 **/
public class CloudStorageApi {
  private ApiClient apiClient;

 /**
  * CloudStorageApi.
  *
  **/
  public CloudStorageApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * CloudStorageApi.
  *
  **/
  public CloudStorageApi(ApiClient apiClient) {
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
  /// Gets a list of all the items from the specified cloud storage provider. Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
  /// </summary>

 /**
  * CallListOptions Class.
  *
  **/
  public class CallListOptions
  {
  private String cloudStorageFolderPath = null;
  private String count = null;
  private String order = null;
  private String orderBy = null;
  private String searchText = null;
  private String startPosition = null;
  
 /**
  * setCloudStorageFolderPath method.
  */
  public void setCloudStorageFolderPath(String cloudStorageFolderPath) {
    this.cloudStorageFolderPath = cloudStorageFolderPath;
  }

 /**
  * getCloudStorageFolderPath method.
  *
  * @return String
  */
  public String getCloudStorageFolderPath() {
    return this.cloudStorageFolderPath;
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
  * setOrder method.
  */
  public void setOrder(String order) {
    this.order = order;
  }

 /**
  * getOrder method.
  *
  * @return String
  */
  public String getOrder() {
    return this.order;
  }
  
 /**
  * setOrderBy method.
  */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

 /**
  * getOrderBy method.
  *
  * @return String
  */
  public String getOrderBy() {
    return this.orderBy;
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
   * Gets a list of all the items from the specified cloud storage provider..
   * Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @return ExternalFolder
   */ 
  public ExternalFolder callList(String accountId, String userId, String serviceId, String folderId) throws ApiException {
    return callList(accountId, userId, serviceId, folderId, null);
  }

  /**
   * Gets a list of all the items from the specified cloud storage provider..
   * Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param serviceId The ID of the service to access.   Valid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param options for modifying the method behavior.
   * @return ExternalFolder
   * @throws ApiException if fails to make API call
   */
  public ExternalFolder callList(String accountId, String userId, String serviceId, String folderId, CloudStorageApi.CallListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling callList");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling callList");
    }
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling callList");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling callList");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders/{folderId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cloud_storage_folder_path", options.cloudStorageFolderPath));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
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

    GenericType<ExternalFolder> localVarReturnType = new GenericType<ExternalFolder>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Configures the redirect URL information  for one or more cloud storage providers for the specified user..
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
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage"
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

    GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the user authentication information for the specified cloud storage provider..
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
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

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

    GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the user authentication information for one or more cloud storage providers..
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
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage"
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

    GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the specified Cloud Storage Provider configuration for the User. Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
  /// </summary>

 /**
  * GetProviderOptions Class.
  *
  **/
  public class GetProviderOptions
  {
  private String redirectUrl = null;
  
 /**
  * setRedirectUrl method.
  */
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

 /**
  * getRedirectUrl method.
  *
  * @return String
  */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }
  }

   /**
   * Gets the specified Cloud Storage Provider configuration for the User..
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
   * Gets the specified Cloud Storage Provider configuration for the User..
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
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("redirectUrl", options.redirectUrl));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Retrieves a list of all the items in a specified folder from the specified cloud storage provider. Retrieves a list of all the items in a specified folder from the specified cloud storage provider. 
  /// </summary>

 /**
  * ListFoldersOptions Class.
  *
  **/
  public class ListFoldersOptions
  {
  private String cloudStorageFolderPath = null;
  private String count = null;
  private String order = null;
  private String orderBy = null;
  private String searchText = null;
  private String startPosition = null;
  
 /**
  * setCloudStorageFolderPath method.
  */
  public void setCloudStorageFolderPath(String cloudStorageFolderPath) {
    this.cloudStorageFolderPath = cloudStorageFolderPath;
  }

 /**
  * getCloudStorageFolderPath method.
  *
  * @return String
  */
  public String getCloudStorageFolderPath() {
    return this.cloudStorageFolderPath;
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
  * setOrder method.
  */
  public void setOrder(String order) {
    this.order = order;
  }

 /**
  * getOrder method.
  *
  * @return String
  */
  public String getOrder() {
    return this.order;
  }
  
 /**
  * setOrderBy method.
  */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

 /**
  * getOrderBy method.
  *
  * @return String
  */
  public String getOrderBy() {
    return this.orderBy;
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
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider..
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
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider..
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
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cloud_storage_folder_path", options.cloudStorageFolderPath));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
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

    GenericType<ExternalFolder> localVarReturnType = new GenericType<ExternalFolder>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get the Cloud Storage Provider configuration for the specified user. Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.  The {serviceId} parameter can be either the service name or serviceId.
  /// </summary>

 /**
  * ListProvidersOptions Class.
  *
  **/
  public class ListProvidersOptions
  {
  private String redirectUrl = null;
  
 /**
  * setRedirectUrl method.
  */
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

 /**
  * getRedirectUrl method.
  *
  * @return String
  */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }
  }

   /**
   * Get the Cloud Storage Provider configuration for the specified user..
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.  The {serviceId} parameter can be either the service name or serviceId.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return CloudStorageProviders
   */ 
  public CloudStorageProviders listProviders(String accountId, String userId) throws ApiException {
    return listProviders(accountId, userId, null);
  }

  /**
   * Get the Cloud Storage Provider configuration for the specified user..
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
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/cloud_storage"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("redirectUrl", options.redirectUrl));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CloudStorageProviders> localVarReturnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
