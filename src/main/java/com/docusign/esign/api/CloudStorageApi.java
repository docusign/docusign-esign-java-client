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

  
  
  /// <summary>
  /// Get the Cloud Storage Provider configuration for the specified user. Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.\n\nThe {serviceId} parameter can be either the service name or serviceId.
  /// </summary>
  public class ListProvidersOptions
  {
	
	private String redirectUrl = null;
	
	
	/*
	 * The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.\n\nThe redirectUrl is restricted to URLs in the docusign.com or docusign.net domains. 
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
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.\n\nThe {serviceId} parameter can be either the service name or serviceId.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @return CloudStorageProviders
   */ 
  public CloudStorageProviders listProviders(String accountId, String userId) throws ApiException {
    return listProviders(accountId, userId, null);
  }
  
  
  /**
   * Get the Cloud Storage Provider configuration for the specified user.
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.\n\nThe {serviceId} parameter can be either the service name or serviceId.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param CloudStorageApi.ListProvidersOptions Options for modifying the method behavior.
   * @return CloudStorageProviders
   */
  public CloudStorageProviders listProviders(String accountId, String userId, CloudStorageApi.ListProvidersOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listProviders");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling listProviders");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "redirectUrl", options.redirectUrl));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<CloudStorageProviders> returnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Configures the redirect URL information  for one or more cloud storage providers for the specified user.
   * Configures the redirect URL information  for one or more cloud storage providers for the specified user. The redirect URL is added to the authentication URL to complete the return route.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param CloudStorageApi.CreateProviderOptions Options for modifying the method behavior.
   * @return CloudStorageProviders
   */
  public CloudStorageProviders createProvider(String accountId, String userId, CloudStorageProviders cloudStorageProviders) throws ApiException {
  
    Object postBody = cloudStorageProviders;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createProvider");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling createProvider");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<CloudStorageProviders> returnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the user authentication information for one or more cloud storage providers.
   * Deletes the user authentication information for one or more cloud storage providers. The next time the user tries to access the cloud storage provider, they must pass normal authentication.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param CloudStorageApi.DeleteProvidersOptions Options for modifying the method behavior.
   * @return CloudStorageProviders
   */
  public CloudStorageProviders deleteProviders(String accountId, String userId, CloudStorageProviders cloudStorageProviders) throws ApiException {
  
    Object postBody = cloudStorageProviders;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteProviders");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteProviders");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<CloudStorageProviders> returnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the specified Cloud Storage Provider configuration for the User. Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
  /// </summary>
  public class GetProviderOptions
  {
	
	private String redirectUrl = null;
	
	
	/*
	 * The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.\n\nThe redirectUrl is restricted to URLs in the docusign.com or docusign.net domains. 
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
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @return CloudStorageProviders
   */ 
  public CloudStorageProviders getProvider(String accountId, String userId, String serviceId) throws ApiException {
    return getProvider(accountId, userId, serviceId, null);
  }
  
  
  /**
   * Gets the specified Cloud Storage Provider configuration for the User.
   * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @param CloudStorageApi.GetProviderOptions Options for modifying the method behavior.
   * @return CloudStorageProviders
   */
  public CloudStorageProviders getProvider(String accountId, String userId, String serviceId, CloudStorageApi.GetProviderOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getProvider");
     }
     
     // verify the required parameter 'serviceId' is set
     if (serviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'serviceId' when calling getProvider");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling getProvider");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "redirectUrl", options.redirectUrl));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<CloudStorageProviders> returnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the user authentication information for the specified cloud storage provider.
   * Deletes the user authentication information for the specified cloud storage provider. The next time the user tries to access the cloud storage provider, they must pass normal authentication for this cloud storage provider.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @param CloudStorageApi.DeleteProviderOptions Options for modifying the method behavior.
   * @return CloudStorageProviders
   */
  public CloudStorageProviders deleteProvider(String accountId, String userId, String serviceId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteProvider");
     }
     
     // verify the required parameter 'serviceId' is set
     if (serviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'serviceId' when calling deleteProvider");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteProvider");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<CloudStorageProviders> returnType = new GenericType<CloudStorageProviders>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
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
	 * An optional value that sets how many items are included in the response. \n\nThe default setting for this is 25. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * An optional value that sets the direction order used to sort the item list. \n\nValid values are: \n\n* asc = ascending sort order\n* desc = descending sort order 
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder() {
		return this.order;
	}
	
	/*
	 * An optional value that sets the file attribute used to sort the item list. \n\nValid values are: \n\n* modified\n* name 
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
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @return ExternalFolder
   */ 
  public ExternalFolder listFolders(String accountId, String userId, String serviceId) throws ApiException {
    return listFolders(accountId, userId, serviceId, null);
  }
  
  
  /**
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider.
   * Retrieves a list of all the items in a specified folder from the specified cloud storage provider.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @param CloudStorageApi.ListFoldersOptions Options for modifying the method behavior.
   * @return ExternalFolder
   */
  public ExternalFolder listFolders(String accountId, String userId, String serviceId, CloudStorageApi.ListFoldersOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listFolders");
     }
     
     // verify the required parameter 'serviceId' is set
     if (serviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'serviceId' when calling listFolders");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling listFolders");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "cloud_storage_folder_path", options.cloudStorageFolderPath));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ExternalFolder> returnType = new GenericType<ExternalFolder>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
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
	 * An optional value that sets how many items are included in the response. \n\nThe default setting for this is 25. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * An optional value that sets the direction order used to sort the item list. \n\nValid values are: \n\n* asc = ascending sort order\n* desc = descending sort order 
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder() {
		return this.order;
	}
	
	/*
	 * An optional value that sets the file attribute used to sort the item list. \n\nValid values are: \n\n* modified\n* name 
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
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @param folderId The ID of the folder being accessed.
   * @return ExternalFolder
   */ 
  public ExternalFolder list(String accountId, String userId, String serviceId, String folderId) throws ApiException {
    return list(accountId, userId, serviceId, folderId, null);
  }
  
  
  /**
   * Gets a list of all the items from the specified cloud storage provider.
   * Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;).
   * @param folderId The ID of the folder being accessed.
   * @param CloudStorageApi.ListOptions Options for modifying the method behavior.
   * @return ExternalFolder
   */
  public ExternalFolder list(String accountId, String userId, String serviceId, String folderId, CloudStorageApi.ListOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling list");
     }
     
     // verify the required parameter 'serviceId' is set
     if (serviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'serviceId' when calling list");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling list");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders/{folderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "cloud_storage_folder_path", options.cloudStorageFolderPath));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ExternalFolder> returnType = new GenericType<ExternalFolder>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
