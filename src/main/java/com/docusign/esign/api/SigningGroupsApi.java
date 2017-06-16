package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.SigningGroupInformation;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SigningGroup;
import com.docusign.esign.model.SigningGroupUsers;


public class SigningGroupsApi {
  private ApiClient apiClient;

  public SigningGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SigningGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  /// <summary>
  /// Gets a list of the Signing Groups in an account. Retrieves a list of all signing groups in the specified account.
  /// </summary>
  public class ListOptions
  {
	
	private String groupType = null;
	
	private String includeUsers = null;
	
	
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
	 * When set to **true**, the response includes the signing group members. 
	 */
	public void setIncludeUsers(String includeUsers) {
		this.includeUsers = includeUsers;
	}
	
	public String getIncludeUsers() {
		return this.includeUsers;
	}
	
  }

   /**
   * Gets a list of the Signing Groups in an account.
   * Retrieves a list of all signing groups in the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @return SigningGroupInformation
   */ 
  public SigningGroupInformation list(String accountId) throws ApiException {
    return list(accountId, null);
  }
  
  
  /**
   * Gets a list of the Signing Groups in an account.
   * Retrieves a list of all signing groups in the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param SigningGroupsApi.ListOptions Options for modifying the method behavior.
   * @return SigningGroupInformation
   */
  public SigningGroupInformation list(String accountId, SigningGroupsApi.ListOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "group_type", options.groupType));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_users", options.includeUsers));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<SigningGroupInformation> returnType = new GenericType<SigningGroupInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates signing group names.
   * Updates the name of one or more existing signing groups.
   * @param accountId The external account number (int) or account ID Guid.
   * @param SigningGroupsApi.UpdateListOptions Options for modifying the method behavior.
   * @return SigningGroupInformation
   */
  public SigningGroupInformation updateList(String accountId, SigningGroupInformation signingGroupInformation) throws ApiException {
  
    Object postBody = signingGroupInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateList");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    
    GenericType<SigningGroupInformation> returnType = new GenericType<SigningGroupInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates a signing group.
   * Creates one or more signing groups. \n\nMultiple signing groups can be created in one call. Only users with account administrator privileges can create signing groups. \n\nAn account can have a maximum of 50 signing groups. Each signing group can have a maximum of 50 group members.\n \nSigning groups can be used by any account user.
   * @param accountId The external account number (int) or account ID Guid.
   * @param SigningGroupsApi.CreateListOptions Options for modifying the method behavior.
   * @return SigningGroupInformation
   */
  public SigningGroupInformation createList(String accountId, SigningGroupInformation signingGroupInformation) throws ApiException {
  
    Object postBody = signingGroupInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createList");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    
    GenericType<SigningGroupInformation> returnType = new GenericType<SigningGroupInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes one or more signing groups.
   * Deletes one or more signing groups in the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param SigningGroupsApi.DeleteListOptions Options for modifying the method behavior.
   * @return SigningGroupInformation
   */
  public SigningGroupInformation deleteList(String accountId, SigningGroupInformation signingGroupInformation) throws ApiException {
  
    Object postBody = signingGroupInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteList");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    
    GenericType<SigningGroupInformation> returnType = new GenericType<SigningGroupInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets information about a signing group.
   * Retrieves information, including group member information, for the specified signing group.
   * @param accountId The external account number (int) or account ID Guid.
   * @param signingGroupId 
   * @param SigningGroupsApi.GetOptions Options for modifying the method behavior.
   * @return SigningGroup
   */
  public SigningGroup get(String accountId, String signingGroupId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
     }
     
     // verify the required parameter 'signingGroupId' is set
     if (signingGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'signingGroupId' when calling get");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups/{signingGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signingGroupId" + "\\}", apiClient.escapeString(signingGroupId.toString()));

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

    
    GenericType<SigningGroup> returnType = new GenericType<SigningGroup>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates a signing group.
   * Updates signing group name and member information. You can also add new members to the signing group. A signing group can have a maximum of 50 members.
   * @param accountId The external account number (int) or account ID Guid.
   * @param signingGroupId 
   * @param SigningGroupsApi.UpdateOptions Options for modifying the method behavior.
   * @return SigningGroup
   */
  public SigningGroup update(String accountId, String signingGroupId, SigningGroup signingGroup) throws ApiException {
  
    Object postBody = signingGroup;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
     }
     
     // verify the required parameter 'signingGroupId' is set
     if (signingGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'signingGroupId' when calling update");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups/{signingGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signingGroupId" + "\\}", apiClient.escapeString(signingGroupId.toString()));

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

    
    GenericType<SigningGroup> returnType = new GenericType<SigningGroup>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets a list of members in a Signing Group.
   * Retrieves the list of members in the specified Signing Group.
   * @param accountId The external account number (int) or account ID Guid.
   * @param signingGroupId 
   * @param SigningGroupsApi.ListUsersOptions Options for modifying the method behavior.
   * @return SigningGroupUsers
   */
  public SigningGroupUsers listUsers(String accountId, String signingGroupId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listUsers");
     }
     
     // verify the required parameter 'signingGroupId' is set
     if (signingGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'signingGroupId' when calling listUsers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups/{signingGroupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signingGroupId" + "\\}", apiClient.escapeString(signingGroupId.toString()));

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

    
    GenericType<SigningGroupUsers> returnType = new GenericType<SigningGroupUsers>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds members to a signing group.
   * Adds one or more new members to a signing group. A signing group can have a maximum of 50 members.
   * @param accountId The external account number (int) or account ID Guid.
   * @param signingGroupId 
   * @param SigningGroupsApi.UpdateUsersOptions Options for modifying the method behavior.
   * @return SigningGroupUsers
   */
  public SigningGroupUsers updateUsers(String accountId, String signingGroupId, SigningGroupUsers signingGroupUsers) throws ApiException {
  
    Object postBody = signingGroupUsers;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUsers");
     }
     
     // verify the required parameter 'signingGroupId' is set
     if (signingGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'signingGroupId' when calling updateUsers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups/{signingGroupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signingGroupId" + "\\}", apiClient.escapeString(signingGroupId.toString()));

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

    
    GenericType<SigningGroupUsers> returnType = new GenericType<SigningGroupUsers>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes  one or more members from a signing group.
   * Deletes  one or more members from the specified signing group.
   * @param accountId The external account number (int) or account ID Guid.
   * @param signingGroupId 
   * @param SigningGroupsApi.DeleteUsersOptions Options for modifying the method behavior.
   * @return SigningGroupUsers
   */
  public SigningGroupUsers deleteUsers(String accountId, String signingGroupId, SigningGroupUsers signingGroupUsers) throws ApiException {
  
    Object postBody = signingGroupUsers;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteUsers");
     }
     
     // verify the required parameter 'signingGroupId' is set
     if (signingGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'signingGroupId' when calling deleteUsers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/signing_groups/{signingGroupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signingGroupId" + "\\}", apiClient.escapeString(signingGroupId.toString()));

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

    
    GenericType<SigningGroupUsers> returnType = new GenericType<SigningGroupUsers>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
