package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ConnectConfigResults;
import com.docusign.esign.model.ConnectCustomConfiguration;
import com.docusign.esign.model.ConnectFailureFilter;
import com.docusign.esign.model.ConnectFailureResults;
import com.docusign.esign.model.ConnectLogs;
import com.docusign.esign.model.ConnectLog;
import com.docusign.esign.model.MobileNotifierConfigurationInformation;
import com.docusign.esign.model.IntegratedUserInfoList;


public class ConnectApi {
  private ApiClient apiClient;

  public ConnectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  
  /**
   * Get Connect Configuration Information
   * Retrieves all the DocuSign Custom Connect definitions for the specified account.\n\n###### Note: Connect must be enabled for your account to use this function. This does not retrieve information for Connect configurations for Box, eOriginal, or Salesforce.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.ListConfigurationsOptions Options for modifying the method behavior.
   * @return ConnectConfigResults
   */
  public ConnectConfigResults listConfigurations(String accountId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listConfigurations");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConnectConfigResults> returnType = new GenericType<ConnectConfigResults>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates a specified Connect configuration.
   * Updates the specified DocuSign Connect configuration in your account.\n\n###### Note: Connect must be enabled for your account to use this function. This cannot be used to update Connect configurations for Box, eOriginal, or Salesforce.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.UpdateConfigurationOptions Options for modifying the method behavior.
   * @return ConnectCustomConfiguration
   */
  public ConnectCustomConfiguration updateConfiguration(String accountId, ConnectCustomConfiguration connectCustomConfiguration) throws ApiException {
  
    Object postBody = connectCustomConfiguration;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateConfiguration");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConnectCustomConfiguration> returnType = new GenericType<ConnectCustomConfiguration>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates a connect configuration for the specified account.
   * Creates a DocuSign Custom Connect definition for your account. DocuSign Connect enables the sending of real-time data updates to external applications. These updates are generated by user transactions as the envelope progresses through actions to completion. The Connect Service provides updated information about the status of these transactions and returns updates that include the actual content of document form fields. Be aware that, these updates might or might not include the document itself. For more information about Connect, see the [ML:DocuSign Connect Service Guide].\n\n###### Note: Connect must be enabled for your account to use this function. This cannot be used to set up Connect configurations for Salesforce or eOriginal.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.CreateConfigurationOptions Options for modifying the method behavior.
   * @return ConnectCustomConfiguration
   */
  public ConnectCustomConfiguration createConfiguration(String accountId, ConnectCustomConfiguration connectCustomConfiguration) throws ApiException {
  
    Object postBody = connectCustomConfiguration;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createConfiguration");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConnectCustomConfiguration> returnType = new GenericType<ConnectCustomConfiguration>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Republishes Connect information for multiple envelopes.
   * Republishes Connect information for the  specified set of envelopes. The primary use is to republish Connect post failures by including envelope IDs for the envelopes that failed to post in the request. The list of envelope IDs that failed to post correctly can be retrieved by calling to [ML:GetConnectLog] retrieve the failure log.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.RetryEventForEnvelopesOptions Options for modifying the method behavior.
   * @return ConnectFailureResults
   */
  public ConnectFailureResults retryEventForEnvelopes(String accountId, ConnectFailureFilter connectFailureFilter) throws ApiException {
  
    Object postBody = connectFailureFilter;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling retryEventForEnvelopes");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/envelopes/retry_queue".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConnectFailureResults> returnType = new GenericType<ConnectFailureResults>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Republishes Connect information for the specified envelope.
   * Republishes Connect information for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param ConnectApi.RetryEventForEnvelopeOptions Options for modifying the method behavior.
   * @return ConnectFailureResults
   */
  public ConnectFailureResults retryEventForEnvelope(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling retryEventForEnvelope");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling retryEventForEnvelope");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/envelopes/{envelopeId}/retry_queue".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<ConnectFailureResults> returnType = new GenericType<ConnectFailureResults>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the Connect failure log information. Retrieves the Connect Failure Log information. It can be used to determine which envelopes failed to post, so a republish request can be created.
  /// </summary>
  public class ListEventFailureLogsOptions
  {
	
	private String fromDate = null;
	
	private String toDate = null;
	
	
	/*
	 * 
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getFromDate() {
		return this.fromDate;
	}
	
	/*
	 * 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Gets the Connect failure log information.
   * Retrieves the Connect Failure Log information. It can be used to determine which envelopes failed to post, so a republish request can be created.
   * @param accountId The external account number (int) or account ID Guid.
   * @return ConnectLogs
   */ 
  public ConnectLogs listEventFailureLogs(String accountId) throws ApiException {
    return listEventFailureLogs(accountId, null);
  }
  
  
  /**
   * Gets the Connect failure log information.
   * Retrieves the Connect Failure Log information. It can be used to determine which envelopes failed to post, so a republish request can be created.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.ListEventFailureLogsOptions Options for modifying the method behavior.
   * @return ConnectLogs
   */
  public ConnectLogs listEventFailureLogs(String accountId, ConnectApi.ListEventFailureLogsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listEventFailureLogs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/failures".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ConnectLogs> returnType = new GenericType<ConnectLogs>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a Connect failure log entry.
   * Deletes the Connect failure log information for the specified entry.
   * @param accountId The external account number (int) or account ID Guid.
   * @param failureId The ID of the failed connect log entry.
   * @param ConnectApi.DeleteEventFailureLogOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteEventFailureLog(String accountId, String failureId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEventFailureLog");
     }
     
     // verify the required parameter 'failureId' is set
     if (failureId == null) {
        throw new ApiException(400, "Missing the required parameter 'failureId' when calling deleteEventFailureLog");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/failures/{failureId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "failureId" + "\\}", apiClient.escapeString(failureId.toString()));

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
  
  
  /// <summary>
  /// Gets the Connect log. Retrieves a list of connect log entries for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
  /// </summary>
  public class ListEventLogsOptions
  {
	
	private String fromDate = null;
	
	private String toDate = null;
	
	
	/*
	 * 
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getFromDate() {
		return this.fromDate;
	}
	
	/*
	 * 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Gets the Connect log.
   * Retrieves a list of connect log entries for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
   * @param accountId The external account number (int) or account ID Guid.
   * @return ConnectLogs
   */ 
  public ConnectLogs listEventLogs(String accountId) throws ApiException {
    return listEventLogs(accountId, null);
  }
  
  
  /**
   * Gets the Connect log.
   * Retrieves a list of connect log entries for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.ListEventLogsOptions Options for modifying the method behavior.
   * @return ConnectLogs
   */
  public ConnectLogs listEventLogs(String accountId, ConnectApi.ListEventLogsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listEventLogs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/logs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ConnectLogs> returnType = new GenericType<ConnectLogs>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets a list of Connect log entries.
   * Retrieves a list of connect log entries for your account.\n\n###### Note: The `enableLog` property in the Connect configuration must be set to **true** to enable logging. If logging is not enabled, then no log entries are recorded.
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.DeleteEventLogsOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteEventLogs(String accountId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEventLogs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/logs".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  /// <summary>
  /// Get the specified Connect log entry. Retrieves the specified Connect log entry for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
  /// </summary>
  public class GetEventLogOptions
  {
	
	private String additionalInfo = null;
	
	
	/*
	 * When true, the connectDebugLog information is included in the response. 
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	public String getAdditionalInfo() {
		return this.additionalInfo;
	}
	
  }

   /**
   * Get the specified Connect log entry.
   * Retrieves the specified Connect log entry for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
   * @param accountId The external account number (int) or account ID Guid.
   * @param logId The ID of the connect log entry
   * @return ConnectLog
   */ 
  public ConnectLog getEventLog(String accountId, String logId) throws ApiException {
    return getEventLog(accountId, logId, null);
  }
  
  
  /**
   * Get the specified Connect log entry.
   * Retrieves the specified Connect log entry for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
   * @param accountId The external account number (int) or account ID Guid.
   * @param logId The ID of the connect log entry
   * @param ConnectApi.GetEventLogOptions Options for modifying the method behavior.
   * @return ConnectLog
   */
  public ConnectLog getEventLog(String accountId, String logId, ConnectApi.GetEventLogOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEventLog");
     }
     
     // verify the required parameter 'logId' is set
     if (logId == null) {
        throw new ApiException(400, "Missing the required parameter 'logId' when calling getEventLog");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/logs/{logId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "logId" + "\\}", apiClient.escapeString(logId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "additional_info", options.additionalInfo));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ConnectLog> returnType = new GenericType<ConnectLog>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a specified Connect log entry.
   * Deletes a specified entry from the Connect Log.
   * @param accountId The external account number (int) or account ID Guid.
   * @param logId The ID of the connect log entry
   * @param ConnectApi.DeleteEventLogOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteEventLog(String accountId, String logId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEventLog");
     }
     
     // verify the required parameter 'logId' is set
     if (logId == null) {
        throw new ApiException(400, "Missing the required parameter 'logId' when calling deleteEventLog");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/logs/{logId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "logId" + "\\}", apiClient.escapeString(logId.toString()));

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
   * Reserved
   * Reserved:
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.ListMobileNotifiersOptions Options for modifying the method behavior.
   * @return MobileNotifierConfigurationInformation
   */
  public MobileNotifierConfigurationInformation listMobileNotifiers(String accountId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listMobileNotifiers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/mobile_notifiers".replaceAll("\\{format\\}","json")
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

    
    GenericType<MobileNotifierConfigurationInformation> returnType = new GenericType<MobileNotifierConfigurationInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Reserved
   * Reserved:
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.UpdateMobileNotifiersOptions Options for modifying the method behavior.
   * @return MobileNotifierConfigurationInformation
   */
  public MobileNotifierConfigurationInformation updateMobileNotifiers(String accountId, MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation) throws ApiException {
  
    Object postBody = mobileNotifierConfigurationInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateMobileNotifiers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/mobile_notifiers".replaceAll("\\{format\\}","json")
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

    
    GenericType<MobileNotifierConfigurationInformation> returnType = new GenericType<MobileNotifierConfigurationInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Reserved
   * Reserved:
   * @param accountId The external account number (int) or account ID Guid.
   * @param ConnectApi.DeleteMobileNotifiersOptions Options for modifying the method behavior.
   * @return MobileNotifierConfigurationInformation
   */
  public MobileNotifierConfigurationInformation deleteMobileNotifiers(String accountId, MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation) throws ApiException {
  
    Object postBody = mobileNotifierConfigurationInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteMobileNotifiers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/mobile_notifiers".replaceAll("\\{format\\}","json")
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

    
    GenericType<MobileNotifierConfigurationInformation> returnType = new GenericType<MobileNotifierConfigurationInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Get a Connect Configuration Information
   * Retrieves the information for the specified DocuSign Connect configuration.\n\n###### Note: Connect must be enabled for your account to use this function.
   * @param accountId The external account number (int) or account ID Guid.
   * @param connectId The ID of the custom Connect configuration being accessed.
   * @param ConnectApi.GetConfigurationOptions Options for modifying the method behavior.
   * @return ConnectConfigResults
   */
  public ConnectConfigResults getConfiguration(String accountId, String connectId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConfiguration");
     }
     
     // verify the required parameter 'connectId' is set
     if (connectId == null) {
        throw new ApiException(400, "Missing the required parameter 'connectId' when calling getConfiguration");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/{connectId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "connectId" + "\\}", apiClient.escapeString(connectId.toString()));

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

    
    GenericType<ConnectConfigResults> returnType = new GenericType<ConnectConfigResults>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the specified connect configuration.
   * Deletes the specified DocuSign Connect configuration.\n\n###### Note: Connect must be enabled for your account to use this function.
   * @param accountId The external account number (int) or account ID Guid.
   * @param connectId The ID of the custom Connect configuration being accessed.
   * @param ConnectApi.DeleteConfigurationOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteConfiguration(String accountId, String connectId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteConfiguration");
     }
     
     // verify the required parameter 'connectId' is set
     if (connectId == null) {
        throw new ApiException(400, "Missing the required parameter 'connectId' when calling deleteConfiguration");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/{connectId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "connectId" + "\\}", apiClient.escapeString(connectId.toString()));

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
  
  
  /// <summary>
  /// Returns users from the configured Connect service. Returns users from the configured Connect service.
  /// </summary>
  public class ListUsersOptions
  {
	
	private String count = null;
	
	private String emailSubstring = null;
	
	private String listIncludedUsers = null;
	
	private String startPosition = null;
	
	private String status = null;
	
	private String userNameSubstring = null;
	
	
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
	public void setEmailSubstring(String emailSubstring) {
		this.emailSubstring = emailSubstring;
	}
	
	public String getEmailSubstring() {
		return this.emailSubstring;
	}
	
	/*
	 * 
	 */
	public void setListIncludedUsers(String listIncludedUsers) {
		this.listIncludedUsers = listIncludedUsers;
	}
	
	public String getListIncludedUsers() {
		return this.listIncludedUsers;
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
	
	/*
	 * 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	/*
	 * 
	 */
	public void setUserNameSubstring(String userNameSubstring) {
		this.userNameSubstring = userNameSubstring;
	}
	
	public String getUserNameSubstring() {
		return this.userNameSubstring;
	}
	
  }

   /**
   * Returns users from the configured Connect service.
   * Returns users from the configured Connect service.
   * @param accountId The external account number (int) or account ID Guid.
   * @param connectId The ID of the custom Connect configuration being accessed.
   * @return IntegratedUserInfoList
   */ 
  public IntegratedUserInfoList listUsers(String accountId, String connectId) throws ApiException {
    return listUsers(accountId, connectId, null);
  }
  
  
  /**
   * Returns users from the configured Connect service.
   * Returns users from the configured Connect service.
   * @param accountId The external account number (int) or account ID Guid.
   * @param connectId The ID of the custom Connect configuration being accessed.
   * @param ConnectApi.ListUsersOptions Options for modifying the method behavior.
   * @return IntegratedUserInfoList
   */
  public IntegratedUserInfoList listUsers(String accountId, String connectId, ConnectApi.ListUsersOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listUsers");
     }
     
     // verify the required parameter 'connectId' is set
     if (connectId == null) {
        throw new ApiException(400, "Missing the required parameter 'connectId' when calling listUsers");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/connect/{connectId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "connectId" + "\\}", apiClient.escapeString(connectId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "email_substring", options.emailSubstring));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "list_included_users", options.listIncludedUsers));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "status", options.status));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "user_name_substring", options.userNameSubstring));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<IntegratedUserInfoList> returnType = new GenericType<IntegratedUserInfoList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
