
package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;



public class NotaryApi {
  private ApiClient apiClient;

  public NotaryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotaryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Add a notary to the system
   * 
   * @param notary  (optional)
   * @return Notary
   * @throws ApiException if fails to make API call
   */
  public Notary createNotary(Notary notary) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Add a notary jurisdiction to the system
   * 
   * @param notaryJurisdiction  (optional)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdiction createNotaryJurisdictions(NotaryJurisdiction notaryJurisdiction) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete a notary jurisdiction a specified user.
   * 
   * @param jurisdictionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteNotaryJurisdiction(String jurisdictionId) throws ApiException {
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
  }
  /// <summary>
  /// Get notary settings for a user 
  /// </summary>
  public class GetNotaryOptions
  {
  private String includeJurisdictions = null;
  /*
   * 
   */
  public void setIncludeJurisdictions(String includeJurisdictions) {
    this.includeJurisdictions = includeJurisdictions;
  }

  public String getIncludeJurisdictions() {
    return this.includeJurisdictions;
  }
  }

   /**
   * Get notary settings for a user
   * 
   * @return NotaryResult
   */ 
  public NotaryResult getNotary() throws ApiException {
    return getNotary(null);
  }

  /**
   * Get notary settings for a user
   * 
   * @param options for modifying the method behavior.
   * @return NotaryResult
   * @throws ApiException if fails to make API call
   */
  public NotaryResult getNotary(NotaryApi.GetNotaryOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get notary a jurisdiction for a user
   * 
   * @param jurisdictionId  (required)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdiction getNotaryJurisdiction(String jurisdictionId) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get notary seal for a jurisdiction
   * 
   * @param jurisdictionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getNotaryJurisdictionSeal(String jurisdictionId) throws ApiException {
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
  }

  /**
   * Get notary jurisdictions for a user
   * 
   * @return NotaryJurisdictionList
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdictionList getNotaryJurisdictions() throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get notary jurisdictions for a user 
  /// </summary>
  public class ListNotaryJournalsOptions
  {
  private String count = null;
  private String searchText = null;
  private String startPosition = null;
  /*
   * 
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
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public String getSearchText() {
    return this.searchText;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get notary jurisdictions for a user
   * 
   * @return NotaryJournalList
   */ 
  public NotaryJournalList listNotaryJournals() throws ApiException {
    return listNotaryJournals(null);
  }

  /**
   * Get notary jurisdictions for a user
   * 
   * @param options for modifying the method behavior.
   * @return NotaryJournalList
   * @throws ApiException if fails to make API call
   */
  public NotaryJournalList listNotaryJournals(NotaryApi.ListNotaryJournalsOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update a notary
   * 
   * @param notary  (optional)
   * @return Notary
   * @throws ApiException if fails to make API call
   */
  public Notary updateNotary(Notary notary) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update a notary jurisdiction
   * 
   * @param jurisdictionId  (required)
   * @param notaryJurisdiction  (optional)
   * @return NotaryJurisdiction
   * @throws ApiException if fails to make API call
   */
  public NotaryJurisdiction updateNotaryJurisdiction(String jurisdictionId, NotaryJurisdiction notaryJurisdiction) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
