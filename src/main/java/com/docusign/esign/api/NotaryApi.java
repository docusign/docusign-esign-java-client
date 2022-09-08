
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * NotaryApi class.
 *
 **/
public class NotaryApi {
  private ApiClient apiClient;

 /**
  * NotaryApi.
  *
  **/
  public NotaryApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * NotaryApi.
  *
  **/
  public NotaryApi(ApiClient apiClient) {
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
   * Add a notary to the system.
   * Registers the current user as a notary.
   * @param notary  (optional)
   * @return Notary
   * @throws ApiException if fails to make API call
   */
  public Notary createNotary(Notary notary) throws ApiException {
    ApiResponse<Notary> localVarResponse = createNotaryWithHttpInfo(notary);
    return localVarResponse.getData();
  }

  /**
   * Add a notary to the system
   * Registers the current user as a notary.
   * @param notary  (optional)
   * @return Notary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Notary > createNotaryWithHttpInfo(Notary notary) throws ApiException {
    Object localVarPostBody = notary;
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary";

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
    
    GenericType<Notary> localVarReturnType = new GenericType<Notary>() {};
    Notary localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Notary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Add a notary jurisdiction to the system.
   * Creates a jurisdiction object.
   * @param notaryJurisdiction  (optional)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdiction createNotaryJurisdictions(NotaryJurisdiction notaryJurisdiction) throws ApiException {
    ApiResponse<NotaryJurisdiction> localVarResponse = createNotaryJurisdictionsWithHttpInfo(notaryJurisdiction);
    return localVarResponse.getData();
  }

  /**
   * Add a notary jurisdiction to the system
   * Creates a jurisdiction object.
   * @param notaryJurisdiction  (optional)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotaryJurisdiction > createNotaryJurisdictionsWithHttpInfo(NotaryJurisdiction notaryJurisdiction) throws ApiException {
    Object localVarPostBody = notaryJurisdiction;
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/jurisdictions";

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
    
    GenericType<NotaryJurisdiction> localVarReturnType = new GenericType<NotaryJurisdiction>() {};
    NotaryJurisdiction localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotaryJurisdiction>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete a notary jurisdiction a specified user..
   * Deletes the specified jurisdiction.
   * @param jurisdictionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteNotaryJurisdiction(String jurisdictionId) throws ApiException {
    deleteNotaryJurisdictionWithHttpInfo(jurisdictionId);
  }

  /**
   * Delete a notary jurisdiction a specified user.
   * Deletes the specified jurisdiction.
   * @param jurisdictionId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteNotaryJurisdictionWithHttpInfo(String jurisdictionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'jurisdictionId' is set
    if (jurisdictionId == null) {
      throw new ApiException(400, "Missing the required parameter 'jurisdictionId' when calling deleteNotaryJurisdiction");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/jurisdictions/{jurisdictionId}"
      .replaceAll("\\{" + "jurisdictionId" + "\\}", apiClient.escapeString(jurisdictionId.toString()));

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
  /// <summary>
  /// Get notary settings for a user Gets settings for a notary user. The current user must be a notary.
  /// </summary>

 /**
  * GetNotaryOptions Class.
  *
  **/
  public class GetNotaryOptions
  {
  private String includeJurisdictions = null;
  
 /**
  * setIncludeJurisdictions method.
  */
  public void setIncludeJurisdictions(String includeJurisdictions) {
    this.includeJurisdictions = includeJurisdictions;
  }

 /**
  * getIncludeJurisdictions method.
  *
  * @return String
  */
  public String getIncludeJurisdictions() {
    return this.includeJurisdictions;
  }
  }

   /**
   * Get notary settings for a user.
   * Gets settings for a notary user. The current user must be a notary.
   * @return NotaryResult
   */ 
  public NotaryResult getNotary() throws ApiException {
    return getNotary(null);
  }

  /**
   * Get notary settings for a user.
   * Gets settings for a notary user. The current user must be a notary.
   * @param options for modifying the method behavior.
   * @return NotaryResult
   * @throws ApiException if fails to make API call
   */
  public NotaryResult getNotary(NotaryApi.GetNotaryOptions options) throws ApiException {
    ApiResponse<NotaryResult> localVarResponse = getNotaryWithHttpInfo(options);
    return localVarResponse.getData();
  }

  /**
   * Get notary settings for a user
   * Gets settings for a notary user. The current user must be a notary.
   * @param options for modifying the method behavior.
   * @return NotaryResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotaryResult > getNotaryWithHttpInfo(NotaryApi.GetNotaryOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_jurisdictions", options.includeJurisdictions));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<NotaryResult> localVarReturnType = new GenericType<NotaryResult>() {};
    NotaryResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotaryResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get notary a jurisdiction for a user.
   * Gets a jurisdiction object for the current user.  The following restrictions apply:  - The current user must be a notary. - The &#x60;jurisdictionId&#x60; must be a jurisdiction that the notary is registered for. 
   * @param jurisdictionId  (required)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdiction getNotaryJurisdiction(String jurisdictionId) throws ApiException {
    ApiResponse<NotaryJurisdiction> localVarResponse = getNotaryJurisdictionWithHttpInfo(jurisdictionId);
    return localVarResponse.getData();
  }

  /**
   * Get notary a jurisdiction for a user
   * Gets a jurisdiction object for the current user.  The following restrictions apply:  - The current user must be a notary. - The &#x60;jurisdictionId&#x60; must be a jurisdiction that the notary is registered for. 
   * @param jurisdictionId  (required)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotaryJurisdiction > getNotaryJurisdictionWithHttpInfo(String jurisdictionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'jurisdictionId' is set
    if (jurisdictionId == null) {
      throw new ApiException(400, "Missing the required parameter 'jurisdictionId' when calling getNotaryJurisdiction");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/jurisdictions/{jurisdictionId}"
      .replaceAll("\\{" + "jurisdictionId" + "\\}", apiClient.escapeString(jurisdictionId.toString()));

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
    
    GenericType<NotaryJurisdiction> localVarReturnType = new GenericType<NotaryJurisdiction>() {};
    NotaryJurisdiction localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotaryJurisdiction>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get notary seal for a jurisdiction.
   * 
   * @param jurisdictionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getNotaryJurisdictionSeal(String jurisdictionId) throws ApiException {
    getNotaryJurisdictionSealWithHttpInfo(jurisdictionId);
  }

  /**
   * Get notary seal for a jurisdiction
   * 
   * @param jurisdictionId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getNotaryJurisdictionSealWithHttpInfo(String jurisdictionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'jurisdictionId' is set
    if (jurisdictionId == null) {
      throw new ApiException(400, "Missing the required parameter 'jurisdictionId' when calling getNotaryJurisdictionSeal");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/jurisdictions/{jurisdictionId}/seal"
      .replaceAll("\\{" + "jurisdictionId" + "\\}", apiClient.escapeString(jurisdictionId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Get notary jurisdictions for a user.
   * Returns a list of jurisdictions that the notary is registered in. The current user must be a notary.
   * @return NotaryJurisdictionList
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdictionList getNotaryJurisdictions() throws ApiException {
    ApiResponse<NotaryJurisdictionList> localVarResponse = getNotaryJurisdictionsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Get notary jurisdictions for a user
   * Returns a list of jurisdictions that the notary is registered in. The current user must be a notary.
   * @return NotaryJurisdictionList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotaryJurisdictionList > getNotaryJurisdictionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/jurisdictions";

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
    
    GenericType<NotaryJurisdictionList> localVarReturnType = new GenericType<NotaryJurisdictionList>() {};
    NotaryJurisdictionList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotaryJurisdictionList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get notary jurisdictions for a user 
  /// </summary>

 /**
  * ListNotaryJournalsOptions Class.
  *
  **/
  public class ListNotaryJournalsOptions
  {
  private String count = null;
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
   * Get notary jurisdictions for a user.
   * 
   * @return NotaryJournalList
   */ 
  public NotaryJournalList listNotaryJournals() throws ApiException {
    return listNotaryJournals(null);
  }

  /**
   * Get notary jurisdictions for a user.
   * 
   * @param options for modifying the method behavior.
   * @return NotaryJournalList
   * @throws ApiException if fails to make API call
   */
  public NotaryJournalList listNotaryJournals(NotaryApi.ListNotaryJournalsOptions options) throws ApiException {
    ApiResponse<NotaryJournalList> localVarResponse = listNotaryJournalsWithHttpInfo(options);
    return localVarResponse.getData();
  }

  /**
   * Get notary jurisdictions for a user
   * 
   * @param options for modifying the method behavior.
   * @return NotaryJournalList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotaryJournalList > listNotaryJournalsWithHttpInfo(NotaryApi.ListNotaryJournalsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/journals";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
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
    
    GenericType<NotaryJournalList> localVarReturnType = new GenericType<NotaryJournalList>() {};
    NotaryJournalList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotaryJournalList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update a notary.
   * Updates notary information for the current user.
   * @param notary  (optional)
   * @return Notary
   * @throws ApiException if fails to make API call
   */
  public Notary updateNotary(Notary notary) throws ApiException {
    ApiResponse<Notary> localVarResponse = updateNotaryWithHttpInfo(notary);
    return localVarResponse.getData();
  }

  /**
   * Update a notary
   * Updates notary information for the current user.
   * @param notary  (optional)
   * @return Notary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Notary > updateNotaryWithHttpInfo(Notary notary) throws ApiException {
    Object localVarPostBody = notary;
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary";

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
    
    GenericType<Notary> localVarReturnType = new GenericType<Notary>() {};
    Notary localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Notary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update a notary jurisdiction.
   * Updates the jurisdiction information about a notary.  The following restrictions apply:  - The current user must be a notary. - The &#x60;jurisdictionId&#x60; path parameter must be a jurisdiction that the notary is registered for. - The &#x60;jurisdictionId&#x60; path parameter must match the request body&#39;s &#x60;jurisdiction.jurisdictionId&#x60;.  The request body must have a full &#x60;jurisdiction&#x60; object for the jurisdiction property. The best way to do this is to use &#x60;getNotaryJurisdiction&#x60; to obtain the current values and update the properties you want to change.  For example, assume &#x60;getNotaryJurisdiction&#x60; returns this:  &#x60;&#x60;&#x60; {     \&quot;jurisdiction\&quot;: {         \&quot;jurisdictionId\&quot;: \&quot;15\&quot;,         \&quot;name\&quot;: \&quot;Iowa\&quot;,         \&quot;county\&quot;: \&quot;\&quot;,         \&quot;enabled\&quot;: \&quot;true\&quot;,         \&quot;countyInSeal\&quot;: \&quot;false\&quot;,         \&quot;commissionIdInSeal\&quot;: \&quot;true\&quot;,         \&quot;stateNameInSeal\&quot;: \&quot;true\&quot;,         \&quot;notaryPublicInSeal\&quot;: \&quot;true\&quot;,         \&quot;allowSystemCreatedSeal\&quot;: \&quot;true\&quot;,         \&quot;allowUserUploadedSeal\&quot;: \&quot;false\&quot;     },     \&quot;commissionId\&quot;: \&quot;123456\&quot;,     \&quot;commissionExpiration\&quot;: \&quot;2020-08-31T07:00:00.0000000Z\&quot;,     \&quot;registeredName\&quot;: \&quot;Bob Notary\&quot;,     \&quot;county\&quot;: \&quot;Adams\&quot;,     \&quot;sealType\&quot;: \&quot;system_created\&quot; } &#x60;&#x60;&#x60;  If you want to change the name of the notary from \&quot;Bob Notary\&quot; to \&quot;Robert Notary\&quot;, your request body would be:  &#x60;&#x60;&#x60; {     \&quot;jurisdiction\&quot;: {         \&quot;jurisdictionId\&quot;: \&quot;15\&quot;,         \&quot;name\&quot;: \&quot;Iowa\&quot;,         \&quot;county\&quot;: \&quot;\&quot;,         \&quot;enabled\&quot;: \&quot;true\&quot;,         \&quot;countyInSeal\&quot;: \&quot;false\&quot;,         \&quot;commissionIdInSeal\&quot;: \&quot;true\&quot;,         \&quot;stateNameInSeal\&quot;: \&quot;true\&quot;,         \&quot;notaryPublicInSeal\&quot;: \&quot;true\&quot;,         \&quot;allowSystemCreatedSeal\&quot;: \&quot;true\&quot;,         \&quot;allowUserUploadedSeal\&quot;: \&quot;false\&quot;     },     \&quot;commissionId\&quot;: \&quot;123456\&quot;,     \&quot;commissionExpiration\&quot;: \&quot;2020-08-31T07:00:00.0000000Z\&quot;,     \&quot;registeredName\&quot;: \&quot;Robert Notary\&quot;,     \&quot;county\&quot;: \&quot;Adams\&quot;,     \&quot;sealType\&quot;: \&quot;system_created\&quot; } &#x60;&#x60;&#x60; 
   * @param jurisdictionId  (required)
   * @param notaryJurisdiction  (optional)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdiction updateNotaryJurisdiction(String jurisdictionId, NotaryJurisdiction notaryJurisdiction) throws ApiException {
    ApiResponse<NotaryJurisdiction> localVarResponse = updateNotaryJurisdictionWithHttpInfo(jurisdictionId, notaryJurisdiction);
    return localVarResponse.getData();
  }

  /**
   * Update a notary jurisdiction
   * Updates the jurisdiction information about a notary.  The following restrictions apply:  - The current user must be a notary. - The &#x60;jurisdictionId&#x60; path parameter must be a jurisdiction that the notary is registered for. - The &#x60;jurisdictionId&#x60; path parameter must match the request body&#39;s &#x60;jurisdiction.jurisdictionId&#x60;.  The request body must have a full &#x60;jurisdiction&#x60; object for the jurisdiction property. The best way to do this is to use &#x60;getNotaryJurisdiction&#x60; to obtain the current values and update the properties you want to change.  For example, assume &#x60;getNotaryJurisdiction&#x60; returns this:  &#x60;&#x60;&#x60; {     \&quot;jurisdiction\&quot;: {         \&quot;jurisdictionId\&quot;: \&quot;15\&quot;,         \&quot;name\&quot;: \&quot;Iowa\&quot;,         \&quot;county\&quot;: \&quot;\&quot;,         \&quot;enabled\&quot;: \&quot;true\&quot;,         \&quot;countyInSeal\&quot;: \&quot;false\&quot;,         \&quot;commissionIdInSeal\&quot;: \&quot;true\&quot;,         \&quot;stateNameInSeal\&quot;: \&quot;true\&quot;,         \&quot;notaryPublicInSeal\&quot;: \&quot;true\&quot;,         \&quot;allowSystemCreatedSeal\&quot;: \&quot;true\&quot;,         \&quot;allowUserUploadedSeal\&quot;: \&quot;false\&quot;     },     \&quot;commissionId\&quot;: \&quot;123456\&quot;,     \&quot;commissionExpiration\&quot;: \&quot;2020-08-31T07:00:00.0000000Z\&quot;,     \&quot;registeredName\&quot;: \&quot;Bob Notary\&quot;,     \&quot;county\&quot;: \&quot;Adams\&quot;,     \&quot;sealType\&quot;: \&quot;system_created\&quot; } &#x60;&#x60;&#x60;  If you want to change the name of the notary from \&quot;Bob Notary\&quot; to \&quot;Robert Notary\&quot;, your request body would be:  &#x60;&#x60;&#x60; {     \&quot;jurisdiction\&quot;: {         \&quot;jurisdictionId\&quot;: \&quot;15\&quot;,         \&quot;name\&quot;: \&quot;Iowa\&quot;,         \&quot;county\&quot;: \&quot;\&quot;,         \&quot;enabled\&quot;: \&quot;true\&quot;,         \&quot;countyInSeal\&quot;: \&quot;false\&quot;,         \&quot;commissionIdInSeal\&quot;: \&quot;true\&quot;,         \&quot;stateNameInSeal\&quot;: \&quot;true\&quot;,         \&quot;notaryPublicInSeal\&quot;: \&quot;true\&quot;,         \&quot;allowSystemCreatedSeal\&quot;: \&quot;true\&quot;,         \&quot;allowUserUploadedSeal\&quot;: \&quot;false\&quot;     },     \&quot;commissionId\&quot;: \&quot;123456\&quot;,     \&quot;commissionExpiration\&quot;: \&quot;2020-08-31T07:00:00.0000000Z\&quot;,     \&quot;registeredName\&quot;: \&quot;Robert Notary\&quot;,     \&quot;county\&quot;: \&quot;Adams\&quot;,     \&quot;sealType\&quot;: \&quot;system_created\&quot; } &#x60;&#x60;&#x60; 
   * @param jurisdictionId  (required)
   * @param notaryJurisdiction  (optional)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotaryJurisdiction > updateNotaryJurisdictionWithHttpInfo(String jurisdictionId, NotaryJurisdiction notaryJurisdiction) throws ApiException {
    Object localVarPostBody = notaryJurisdiction;
    
    // verify the required parameter 'jurisdictionId' is set
    if (jurisdictionId == null) {
      throw new ApiException(400, "Missing the required parameter 'jurisdictionId' when calling updateNotaryJurisdiction");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/notary/jurisdictions/{jurisdictionId}"
      .replaceAll("\\{" + "jurisdictionId" + "\\}", apiClient.escapeString(jurisdictionId.toString()));

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
    
    GenericType<NotaryJurisdiction> localVarReturnType = new GenericType<NotaryJurisdiction>() {};
    NotaryJurisdiction localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotaryJurisdiction>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
