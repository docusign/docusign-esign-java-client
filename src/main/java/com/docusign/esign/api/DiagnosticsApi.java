package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ServiceInformation;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ResourceInformation;
import com.docusign.esign.model.ApiRequestLogsResult;
import com.docusign.esign.model.DiagnosticsSettingsInformation;


public class DiagnosticsApi {
  private ApiClient apiClient;

  public DiagnosticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DiagnosticsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  
  /**
   * Retrieves the available REST API versions.
   * Retrieves the available REST API versions.\n\nDocuSign Production system: https://www.docusign.net/restapi/service_information\nDocuSign Demo system: https://demo.docusign.net/restapi/service_information\n\nYou do not need an integrator key to view the REST API versions and resources.
   * @param DiagnosticsApi.GetServiceOptions Options for modifying the method behavior.
   * @return ServiceInformation
   */
  public ServiceInformation getService() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/service_information".replaceAll("\\{format\\}","json");

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

    
    GenericType<ServiceInformation> returnType = new GenericType<ServiceInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Lists resources for REST version specified
   * Retrieves the base resources available for the DocuSign REST APIs.\n\nYou do not need an integrator key to view the REST API versions and resources.\n\nExample: https://demo.docusign.net/restapi/v2 lists all of the base resources available in version 2 of the REST API on the DocuSign Demo system.\n\nTo view descriptions and samples of the service operations for all versions, remove the version number and add /help to the URL.\n\nExample: https://demo.docusign.net/restapi/help lists the REST API operations on the DocuSign Demo system with XML and JSON request and response samples.
   * @param DiagnosticsApi.GetResourcesOptions Options for modifying the method behavior.
   * @return ResourceInformation
   */
  public ResourceInformation getResources() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2".replaceAll("\\{format\\}","json");

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

    
    GenericType<ResourceInformation> returnType = new GenericType<ResourceInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the API request logging log files. Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.\n\nIf the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.\n\nIf the Accept header is set to `application/json` or `application/xml`, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below.
  /// </summary>
  public class ListRequestLogsOptions
  {
	
	private String encoding = null;
	
	
	/*
	 * 
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
	public String getEncoding() {
		return this.encoding;
	}
	
  }

   /**
   * Gets the API request logging log files.
   * Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.\n\nIf the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.\n\nIf the Accept header is set to `application/json` or `application/xml`, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below.
   * @return ApiRequestLogsResult
   */ 
  public ApiRequestLogsResult listRequestLogs() throws ApiException {
    return listRequestLogs(null);
  }
  
  
  /**
   * Gets the API request logging log files.
   * Retrieves a list of log entries as a JSON or xml object or as a zip file containing the entries.\n\nIf the Accept header is set to application/zip, the response is a zip file containing individual text files, each representing an API request.\n\nIf the Accept header is set to `application/json` or `application/xml`, the response returns list of log entries in either JSON or XML. An example JSON response body is shown below.
   * @param DiagnosticsApi.ListRequestLogsOptions Options for modifying the method behavior.
   * @return ApiRequestLogsResult
   */
  public ApiRequestLogsResult listRequestLogs(DiagnosticsApi.ListRequestLogsOptions options) throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/diagnostics/request_logs".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "encoding", options.encoding));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ApiRequestLogsResult> returnType = new GenericType<ApiRequestLogsResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the request log files.
   * Deletes the request log files.
   * @param DiagnosticsApi.DeleteRequestLogsOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteRequestLogs() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/diagnostics/request_logs".replaceAll("\\{format\\}","json");

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Gets a request logging log file.
   * Retrieves information for a single log entry.\n\n**Request**\nThe `requestLogfId` property can be retrieved by getting the list of log entries. The Content-Transfer-Encoding header can be set to base64 to retrieve the API request/response as base 64 string. Otherwise the bytes of the request/response are returned.\n\n**Response**\nIf the Content-Transfer-Encoding header was set to base64, the log is returned as a base64 string.
   * @param requestLogId 
   * @param DiagnosticsApi.GetRequestLogOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getRequestLog(String requestLogId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'requestLogId' is set
     if (requestLogId == null) {
        throw new ApiException(400, "Missing the required parameter 'requestLogId' when calling getRequestLog");
     }
     
    // create path and map variables
    String path = "/v2/diagnostics/request_logs/{requestLogId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "requestLogId" + "\\}", apiClient.escapeString(requestLogId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "text/plain"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets the API request logging settings.
   * Retrieves the current API request logging setting for the user and remaining log entries.\n\n**Response**\nThe response includes the current API request logging setting for the user, along with the maximum log entries and remaining log entries.
   * @param DiagnosticsApi.GetRequestLogSettingsOptions Options for modifying the method behavior.
   * @return DiagnosticsSettingsInformation
   */
  public DiagnosticsSettingsInformation getRequestLogSettings() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/diagnostics/settings".replaceAll("\\{format\\}","json");

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

    
    GenericType<DiagnosticsSettingsInformation> returnType = new GenericType<DiagnosticsSettingsInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Enables or disables API request logging for troubleshooting.
   * Enables or disables API request logging for troubleshooting.\n\nWhen enabled (`apiRequestLogging` is set to true), REST API requests and responses for the user are added to a log. A log can have up to 50 requests/responses and the current number of log entries can be determined by getting the settings. Logging is automatically disabled when the log limit of 50 is reached.\n\nYou can call [ML:GetRequestLog] or [ML:GetRequestLogs] to download the log files (individually or as a zip file). Call [ML:DeleteRequestLogs] to clear the log by deleting current entries.\n\nPrivate information, such as passwords and integrator key information, which is normally located in the call header is omitted from the request/response log.\n\n###### Note: API request logging only captures requests from the authenticated user. Any call that does not authenticate the user and resolve a userId isn&#39;t logged. Meaning that login_information, NewAccounts, or other distributor-credential calls are not logged.
   * @param DiagnosticsApi.UpdateRequestLogSettingsOptions Options for modifying the method behavior.
   * @return DiagnosticsSettingsInformation
   */
  public DiagnosticsSettingsInformation updateRequestLogSettings(DiagnosticsSettingsInformation diagnosticsSettingsInformation) throws ApiException {
  
    Object postBody = diagnosticsSettingsInformation;
    
    // create path and map variables
    String path = "/v2/diagnostics/settings".replaceAll("\\{format\\}","json");

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

    
    GenericType<DiagnosticsSettingsInformation> returnType = new GenericType<DiagnosticsSettingsInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
