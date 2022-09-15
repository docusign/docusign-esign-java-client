
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * DiagnosticsApi class.
 *
 **/
public class DiagnosticsApi {
  private ApiClient apiClient;

 /**
  * DiagnosticsApi.
  *
  **/
  public DiagnosticsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * DiagnosticsApi.
  *
  **/
  public DiagnosticsApi(ApiClient apiClient) {
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
   * Deletes the request log files..
   * Deletes the request log files.
   * @throws ApiException if fails to make API call
   */
  public void deleteRequestLogs() throws ApiException {
    deleteRequestLogsWithHttpInfo();
  }

  /**
   * Deletes the request log files.
   * Deletes the request log files.
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteRequestLogsWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/diagnostics/request_logs";

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
   * Gets a request logging log file..
   * Retrieves information for a single log entry.  **Request** The &#x60;requestLogfId&#x60; property can be retrieved by getting the list of log entries. The Content-Transfer-Encoding header can be set to base64 to retrieve the API request/response as base 64 string. Otherwise the bytes of the request/response are returned.  **Response** If the Content-Transfer-Encoding header was set to base64, the log is returned as a base64 string.
   * @param requestLogId  (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getRequestLog(String requestLogId) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getRequestLogWithHttpInfo(requestLogId);
    return localVarResponse.getData();
  }

  /**
   * Gets a request logging log file.
   * Retrieves information for a single log entry.  **Request** The &#x60;requestLogfId&#x60; property can be retrieved by getting the list of log entries. The Content-Transfer-Encoding header can be set to base64 to retrieve the API request/response as base 64 string. Otherwise the bytes of the request/response are returned.  **Response** If the Content-Transfer-Encoding header was set to base64, the log is returned as a base64 string.
   * @param requestLogId  (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getRequestLogWithHttpInfo(String requestLogId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'requestLogId' is set
    if (requestLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestLogId' when calling getRequestLog");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/diagnostics/request_logs/{requestLogId}"
      .replaceAll("\\{" + "requestLogId" + "\\}", apiClient.escapeString(requestLogId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain"
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
   * Gets the API request logging settings..
   * Retrieves the current API request logging setting for the user and remaining log entries.  **Response** The response includes the current API request logging setting for the user, along with the maximum log entries and remaining log entries.
   * @return DiagnosticsSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public DiagnosticsSettingsInformation getRequestLogSettings() throws ApiException {
    ApiResponse<DiagnosticsSettingsInformation> localVarResponse = getRequestLogSettingsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Gets the API request logging settings.
   * Retrieves the current API request logging setting for the user and remaining log entries.  **Response** The response includes the current API request logging setting for the user, along with the maximum log entries and remaining log entries.
   * @return DiagnosticsSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DiagnosticsSettingsInformation > getRequestLogSettingsWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/diagnostics/settings";

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
    
    GenericType<DiagnosticsSettingsInformation> localVarReturnType = new GenericType<DiagnosticsSettingsInformation>() {};
    DiagnosticsSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DiagnosticsSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Lists resources for REST version specified.
   * Retrieves the base resources available for the DocuSign REST APIs.  You do not need an integrator key to view the REST API versions and resources.  Example: https://demo.docusign.net/restapi/v2 lists all of the base resources available in version 2 of the REST API on the DocuSign Demo system.  To view descriptions and samples of the service operations for all versions, remove the version number and add /help to the URL.  Example: https://demo.docusign.net/restapi/help lists the REST API operations on the DocuSign Demo system with XML and JSON request and response samples.
   * @return ResourceInformation
   * @throws ApiException if fails to make API call
   */
  public ResourceInformation getResources() throws ApiException {
    ApiResponse<ResourceInformation> localVarResponse = getResourcesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists resources for REST version specified
   * Retrieves the base resources available for the DocuSign REST APIs.  You do not need an integrator key to view the REST API versions and resources.  Example: https://demo.docusign.net/restapi/v2 lists all of the base resources available in version 2 of the REST API on the DocuSign Demo system.  To view descriptions and samples of the service operations for all versions, remove the version number and add /help to the URL.  Example: https://demo.docusign.net/restapi/help lists the REST API operations on the DocuSign Demo system with XML and JSON request and response samples.
   * @return ResourceInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResourceInformation > getResourcesWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1";

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
    
    GenericType<ResourceInformation> localVarReturnType = new GenericType<ResourceInformation>() {};
    ResourceInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ResourceInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Retrieves the available REST API versions..
   * Retrieves the available REST API versions.  DocuSign Production system: https://www.docusign.net/restapi/service_information DocuSign Demo system: https://demo.docusign.net/restapi/service_information  You do not need an integrator key to view the REST API versions and resources.
   * @return ServiceInformation
   * @throws ApiException if fails to make API call
   */
  public ServiceInformation getService() throws ApiException {
    ApiResponse<ServiceInformation> localVarResponse = getServiceWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the available REST API versions.
   * Retrieves the available REST API versions.  DocuSign Production system: https://www.docusign.net/restapi/service_information DocuSign Demo system: https://demo.docusign.net/restapi/service_information  You do not need an integrator key to view the REST API versions and resources.
   * @return ServiceInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ServiceInformation > getServiceWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/service_information";

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
    
    GenericType<ServiceInformation> localVarReturnType = new GenericType<ServiceInformation>() {};
    ServiceInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ServiceInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the API request logging log files. Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.  If the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.  If the Accept header is set to &#x60;application/json&#x60; or &#x60;application/xml&#x60;, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below. 
  /// </summary>

 /**
  * ListRequestLogsOptions Class.
  *
  **/
  public class ListRequestLogsOptions
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
   * Gets the API request logging log files..
   * Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.  If the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.  If the Accept header is set to &#x60;application/json&#x60; or &#x60;application/xml&#x60;, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below. 
   * @return ApiRequestLogsResult
   */ 
  public ApiRequestLogsResult listRequestLogs() throws ApiException {
    return listRequestLogs(null);
  }

  /**
   * Gets the API request logging log files..
   * Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.  If the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.  If the Accept header is set to &#x60;application/json&#x60; or &#x60;application/xml&#x60;, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below. 
   * @param options for modifying the method behavior.
   * @return ApiRequestLogsResult
   * @throws ApiException if fails to make API call
   */
  public ApiRequestLogsResult listRequestLogs(DiagnosticsApi.ListRequestLogsOptions options) throws ApiException {
    ApiResponse<ApiRequestLogsResult> localVarResponse = listRequestLogsWithHttpInfo(options);
    return localVarResponse.getData();
  }

  /**
   * Gets the API request logging log files.
   * Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.  If the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.  If the Accept header is set to &#x60;application/json&#x60; or &#x60;application/xml&#x60;, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below. 
   * @param options for modifying the method behavior.
   * @return ApiRequestLogsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiRequestLogsResult > listRequestLogsWithHttpInfo(DiagnosticsApi.ListRequestLogsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/diagnostics/request_logs";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encoding", options.encoding));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ApiRequestLogsResult> localVarReturnType = new GenericType<ApiRequestLogsResult>() {};
    ApiRequestLogsResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ApiRequestLogsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Enables or disables API request logging for troubleshooting..
   * Enables or disables API request logging for troubleshooting.  When enabled (&#x60;apiRequestLogging&#x60; is set to true), REST API requests and responses for the user are added to a log. A log can have up to 50 requests/responses and the current number of log entries can be determined by getting the settings. Logging is automatically disabled when the log limit of 50 is reached.  You can call [ML:GetRequestLog] or [ML:GetRequestLogs] to download the log files (individually or as a zip file). Call [ML:DeleteRequestLogs] to clear the log by deleting current entries.  Private information, such as passwords and integrator key information, which is normally located in the call header is omitted from the request/response log.  ###### Note: API request logging only captures requests from the authenticated user. Any call that does not authenticate the user and resolve a userId isn&#39;t logged. Meaning that login_information, NewAccounts, or other distributor-credential calls are not logged. 
   * @param diagnosticsSettingsInformation  (optional)
   * @return DiagnosticsSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public DiagnosticsSettingsInformation updateRequestLogSettings(DiagnosticsSettingsInformation diagnosticsSettingsInformation) throws ApiException {
    ApiResponse<DiagnosticsSettingsInformation> localVarResponse = updateRequestLogSettingsWithHttpInfo(diagnosticsSettingsInformation);
    return localVarResponse.getData();
  }

  /**
   * Enables or disables API request logging for troubleshooting.
   * Enables or disables API request logging for troubleshooting.  When enabled (&#x60;apiRequestLogging&#x60; is set to true), REST API requests and responses for the user are added to a log. A log can have up to 50 requests/responses and the current number of log entries can be determined by getting the settings. Logging is automatically disabled when the log limit of 50 is reached.  You can call [ML:GetRequestLog] or [ML:GetRequestLogs] to download the log files (individually or as a zip file). Call [ML:DeleteRequestLogs] to clear the log by deleting current entries.  Private information, such as passwords and integrator key information, which is normally located in the call header is omitted from the request/response log.  ###### Note: API request logging only captures requests from the authenticated user. Any call that does not authenticate the user and resolve a userId isn&#39;t logged. Meaning that login_information, NewAccounts, or other distributor-credential calls are not logged. 
   * @param diagnosticsSettingsInformation  (optional)
   * @return DiagnosticsSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DiagnosticsSettingsInformation > updateRequestLogSettingsWithHttpInfo(DiagnosticsSettingsInformation diagnosticsSettingsInformation) throws ApiException {
    Object localVarPostBody = diagnosticsSettingsInformation;
    
    // create path and map variables
    String localVarPath = "/v2.1/diagnostics/settings";

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
    
    GenericType<DiagnosticsSettingsInformation> localVarReturnType = new GenericType<DiagnosticsSettingsInformation>() {};
    DiagnosticsSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DiagnosticsSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
