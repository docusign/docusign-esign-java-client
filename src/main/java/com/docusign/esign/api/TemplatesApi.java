package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.EnvelopeTemplateResults;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.TemplateSummary;
import com.docusign.esign.model.EnvelopeTemplate;
import com.docusign.esign.model.TemplateUpdateSummary;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.TemplateCustomFields;
import com.docusign.esign.model.TemplateDocumentsResult;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.EnvelopeDocument;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.PageRequest;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.LockRequest;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.TemplateNotificationRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientsUpdateSummary;
import com.docusign.esign.model.TemplateRecipients;
import com.docusign.esign.model.BulkRecipientsResponse;
import com.docusign.esign.model.BulkRecipientsRequest;
import com.docusign.esign.model.BulkRecipientsSummaryResponse;
import com.docusign.esign.model.BulkRecipientsUpdateResponse;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.TemplateTabs;
import com.docusign.esign.model.ViewUrl;
import com.docusign.esign.model.ReturnUrlRequest;
import com.docusign.esign.model.GroupInformation;


public class TemplatesApi {
  private ApiClient apiClient;

  public TemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  /// <summary>
  /// Gets the definition of a template. Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
  /// </summary>
  public class ListTemplatesOptions
  {
	
	private String count = null;
	
	private String folder = null;
	
	private String folderIds = null;
	
	private String fromDate = null;
	
	private String include = null;
	
	private String order = null;
	
	private String orderBy = null;
	
	private String searchText = null;
	
	private String shared = null;
	
	private String sharedByMe = null;
	
	private String startPosition = null;
	
	private String toDate = null;
	
	private String usedFromDate = null;
	
	private String usedToDate = null;
	
	private String userFilter = null;
	
	
	/*
	 * Number of records to return in the cache. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * The query value can be a folder name or folder ID. The response will only return templates in the specified folder. 
	 */
	public void setFolder(String folder) {
		this.folder = folder;
	}
	
	public String getFolder() {
		return this.folder;
	}
	
	/*
	 * A comma separated list of folder ID GUIDs. 
	 */
	public void setFolderIds(String folderIds) {
		this.folderIds = folderIds;
	}
	
	public String getFolderIds() {
		return this.folderIds;
	}
	
	/*
	 * Start of the search date range. Only returns templates created on or after this date/time. If no value is specified, there is no limit on the earliest date created. 
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getFromDate() {
		return this.fromDate;
	}
	
	/*
	 * A comma separated list of additional template attributes to include in the response. Valid values are: recipients, folders, documents, custom_fields, and notifications. 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
	/*
	 * Sets the direction order used to sort the list. Valid values are: -asc = ascending sort order (a to z)  -desc = descending sort order (z to a) 
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder() {
		return this.order;
	}
	
	/*
	 * Sets the file attribute used to sort the list. Valid values are:  -name: template name  -modified: date/time template was last modified.  -used: date/time the template was last used. 
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	public String getOrderBy() {
		return this.orderBy;
	}
	
	/*
	 * The search text used to search the names of templates. 
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
	public void setShared(String shared) {
		this.shared = shared;
	}
	
	public String getShared() {
		return this.shared;
	}
	
	/*
	 * If true, the response only includes templates shared by the user. If false, the response only returns template not shared by the user. If not specified, the response is not affected. 
	 */
	public void setSharedByMe(String sharedByMe) {
		this.sharedByMe = sharedByMe;
	}
	
	public String getSharedByMe() {
		return this.sharedByMe;
	}
	
	/*
	 * The starting index for the first template shown in the response. This must be greater than or equal to 0 (zero). 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
	/*
	 * End of the search date range. Only returns templates created up to this date/time. If no value is provided, this defaults to the current date. 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
	/*
	 * Start of the search date range. Only returns templates used or edited on or after this date/time. If no value is specified, there is no limit on the earliest date used. 
	 */
	public void setUsedFromDate(String usedFromDate) {
		this.usedFromDate = usedFromDate;
	}
	
	public String getUsedFromDate() {
		return this.usedFromDate;
	}
	
	/*
	 * End of the search date range. Only returns templates used or edited up to this date/time. If no value is provided, this defaults to the current date. 
	 */
	public void setUsedToDate(String usedToDate) {
		this.usedToDate = usedToDate;
	}
	
	public String getUsedToDate() {
		return this.usedToDate;
	}
	
	/*
	 * Sets if the templates shown in the response Valid values are:  -owned_by_me: only shows templates the user owns.  -shared_with_me: only shows templates that are shared with the user.  -all: shows all templates owned or shared with the user. 
	 */
	public void setUserFilter(String userFilter) {
		this.userFilter = userFilter;
	}
	
	public String getUserFilter() {
		return this.userFilter;
	}
	
  }

   /**
   * Gets the definition of a template.
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid.
   * @return EnvelopeTemplateResults
   */ 
  public EnvelopeTemplateResults listTemplates(String accountId) throws ApiException {
    return listTemplates(accountId, null);
  }
  
  
  /**
   * Gets the definition of a template.
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid.
   * @param TemplatesApi.ListTemplatesOptions Options for modifying the method behavior.
   * @return EnvelopeTemplateResults
   */
  public EnvelopeTemplateResults listTemplates(String accountId, TemplatesApi.ListTemplatesOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "folder", options.folder));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "folder_ids", options.folderIds));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "shared", options.shared));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "shared_by_me", options.sharedByMe));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "used_from_date", options.usedFromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "used_to_date", options.usedToDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "user_filter", options.userFilter));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeTemplateResults> returnType = new GenericType<EnvelopeTemplateResults>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates an envelope from a template.
   * Creates a template definition using a multipart request.\n\n###Template Email Subject Merge Fields\n\nCall this endpoint to insert a recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient’s role name, are added to the `emailSubject` property when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n###### Note: If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\nTo add a recipient’s name in the subject line add the following text in the `emailSubject` property when creating the template or when sending an envelope from a template:\n\n[[&lt;roleName&gt;_UserName]]\n\nExample:\n\n`\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\nTo add a recipient’s email address in the subject line add the following text in the `emailSubject` property when creating the template or when sending an envelope from a template:\n\n[[&lt;roleName&gt;_Email]]\n\nExample:\n\n`\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\n\nIn both cases the &lt;roleName&gt; is the recipient&#39;s contents of the `roleName` property in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.
   * @param accountId The external account number (int) or account ID Guid.
   * @param TemplatesApi.CreateTemplateOptions Options for modifying the method behavior.
   * @return TemplateSummary
   */
  public TemplateSummary createTemplate(String accountId, EnvelopeTemplate envelopeTemplate) throws ApiException {
  
    Object postBody = envelopeTemplate;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplate");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates".replaceAll("\\{format\\}","json")
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

    
    GenericType<TemplateSummary> returnType = new GenericType<TemplateSummary>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets a list of templates for a specified account. Retrieves the definition of the specified template.
  /// </summary>
  public class GetOptions
  {
	
	private String include = null;
	
	
	/*
	 * 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
  }

   /**
   * Gets a list of templates for a specified account.
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @return EnvelopeTemplate
   */ 
  public EnvelopeTemplate get(String accountId, String templateId) throws ApiException {
    return get(accountId, templateId, null);
  }
  
  
  /**
   * Gets a list of templates for a specified account.
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.GetOptions Options for modifying the method behavior.
   * @return EnvelopeTemplate
   */
  public EnvelopeTemplate get(String accountId, String templateId, TemplatesApi.GetOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling get");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeTemplate> returnType = new GenericType<EnvelopeTemplate>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates an existing template.
   * Updates an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.UpdateOptions Options for modifying the method behavior.
   * @return TemplateUpdateSummary
   */
  public TemplateUpdateSummary update(String accountId, String templateId, EnvelopeTemplate envelopeTemplate) throws ApiException {
  
    Object postBody = envelopeTemplate;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling update");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<TemplateUpdateSummary> returnType = new GenericType<TemplateUpdateSummary>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets the custom document fields from a template.
   * Retrieves the custom document field information from an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.ListCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields listCustomFields(String accountId, String templateId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates envelope custom fields in a template.
   * Updates the custom fields in a template.\n\nEach custom field used in a template must have a unique name.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.UpdateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields updateCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
  
    Object postBody = templateCustomFields;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates custom document fields in an existing template document.
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.CreateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields createCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
  
    Object postBody = templateCustomFields;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes envelope custom fields in a template.
   * Deletes envelope custom fields in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.DeleteCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields deleteCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
  
    Object postBody = templateCustomFields;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets a list of documents associated with a template.
   * Retrieves a list of documents associated with the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.ListDocumentsOptions Options for modifying the method behavior.
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult listDocuments(String accountId, String templateId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<TemplateDocumentsResult> returnType = new GenericType<TemplateDocumentsResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Adds documents to a template document. Adds one or more documents to an existing template document.
  /// </summary>
  public class UpdateDocumentsOptions
  {
	
	private String applyDocumentFields = null;
	
	
	/*
	 * 
	 */
	public void setApplyDocumentFields(String applyDocumentFields) {
		this.applyDocumentFields = applyDocumentFields;
	}
	
	public String getApplyDocumentFields() {
		return this.applyDocumentFields;
	}
	
  }

   /**
   * Adds documents to a template document.
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @return TemplateDocumentsResult
   */ 
  public TemplateDocumentsResult updateDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return updateDocuments(accountId, templateId, envelopeDefinition, null);
  }
  
  
  /**
   * Adds documents to a template document.
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.UpdateDocumentsOptions Options for modifying the method behavior.
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult updateDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition, TemplatesApi.UpdateDocumentsOptions options) throws ApiException {
  
    Object postBody = envelopeDefinition;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocuments");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<TemplateDocumentsResult> returnType = new GenericType<TemplateDocumentsResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes documents from a template.
   * Deletes one or more documents from an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.DeleteDocumentsOptions Options for modifying the method behavior.
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult deleteDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
  
    Object postBody = envelopeDefinition;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocuments");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<TemplateDocumentsResult> returnType = new GenericType<TemplateDocumentsResult>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets PDF documents from a template. Retrieves one or more PDF documents from the specified template.\n\nYou can specify the ID of the document to retrieve or can specify `combined` to retrieve all documents in the template as one pdf.
  /// </summary>
  public class GetDocumentOptions
  {
	
	private String encrypt = null;
	
	private String showChanges = null;
	
	
	/*
	 * 
	 */
	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}
	
	public String getEncrypt() {
		return this.encrypt;
	}
	
	/*
	 * 
	 */
	public void setShowChanges(String showChanges) {
		this.showChanges = showChanges;
	}
	
	public String getShowChanges() {
		return this.showChanges;
	}
	
  }

   /**
   * Gets PDF documents from a template.
   * Retrieves one or more PDF documents from the specified template.\n\nYou can specify the ID of the document to retrieve or can specify `combined` to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @return byte[]
   */ 
  public byte[] getDocument(String accountId, String templateId, String documentId) throws ApiException {
    return getDocument(accountId, templateId, documentId, null);
  }
  
  
  /**
   * Gets PDF documents from a template.
   * Retrieves one or more PDF documents from the specified template.\n\nYou can specify the ID of the document to retrieve or can specify `combined` to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param TemplatesApi.GetDocumentOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getDocument(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocument");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "encrypt", options.encrypt));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
	 
    }

    final String[] accepts = {
      "application/pdf"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Adds a document to a template document. Adds the specified document to an existing template document.
  /// </summary>
  public class UpdateDocumentOptions
  {
	
	private String applyDocumentFields = null;
	
	private String isEnvelopeDefinition = null;
	
	
	/*
	 * 
	 */
	public void setApplyDocumentFields(String applyDocumentFields) {
		this.applyDocumentFields = applyDocumentFields;
	}
	
	public String getApplyDocumentFields() {
		return this.applyDocumentFields;
	}
	
	/*
	 * 
	 */
	public void setIsEnvelopeDefinition(String isEnvelopeDefinition) {
		this.isEnvelopeDefinition = isEnvelopeDefinition;
	}
	
	public String getIsEnvelopeDefinition() {
		return this.isEnvelopeDefinition;
	}
	
  }

   /**
   * Adds a document to a template document.
   * Adds the specified document to an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @return EnvelopeDocument
   */ 
  public EnvelopeDocument updateDocument(String accountId, String templateId, String documentId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return updateDocument(accountId, templateId, documentId, envelopeDefinition, null);
  }
  
  
  /**
   * Adds a document to a template document.
   * Adds the specified document to an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param TemplatesApi.UpdateDocumentOptions Options for modifying the method behavior.
   * @return EnvelopeDocument
   */
  public EnvelopeDocument updateDocument(String accountId, String templateId, String documentId, EnvelopeDefinition envelopeDefinition, TemplatesApi.UpdateDocumentOptions options) throws ApiException {
  
    Object postBody = envelopeDefinition;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocument");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "is_envelope_definition", options.isEnvelopeDefinition));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeDocument> returnType = new GenericType<EnvelopeDocument>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets the custom document fields for a an existing template document.
   * Retrieves the custom document fields for an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param TemplatesApi.ListDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String templateId, String documentId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling listDocumentFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates existing custom document fields in an existing template document.
   * Updates existing custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param TemplatesApi.UpdateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
    Object postBody = documentFieldsInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates custom document fields in an existing template document.
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param TemplatesApi.CreateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
    Object postBody = documentFieldsInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes custom document fields from an existing template document.
   * Deletes custom document fields from an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param TemplatesApi.DeleteDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
    Object postBody = documentFieldsInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a page from a document in an template.
   * Deletes a page from a document in a template based on the page number.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @param TemplatesApi.DeleteDocumentPageOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
  
    Object postBody = pageRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentPage");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentPage");
     }
     
     // verify the required parameter 'pageNumber' is set
     if (pageNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling deleteDocumentPage");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocumentPage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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
  /// Gets a page image from a template for display. Retrieves a page image for display from the specified template.
  /// </summary>
  public class GetDocumentPageImageOptions
  {
	
	private String dpi = null;
	
	private String maxHeight = null;
	
	private String maxWidth = null;
	
	private String showChanges = null;
	
	
	/*
	 * 
	 */
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	
	public String getDpi() {
		return this.dpi;
	}
	
	/*
	 * 
	 */
	public void setMaxHeight(String maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public String getMaxHeight() {
		return this.maxHeight;
	}
	
	/*
	 * 
	 */
	public void setMaxWidth(String maxWidth) {
		this.maxWidth = maxWidth;
	}
	
	public String getMaxWidth() {
		return this.maxWidth;
	}
	
	/*
	 * 
	 */
	public void setShowChanges(String showChanges) {
		this.showChanges = showChanges;
	}
	
	public String getShowChanges() {
		return this.showChanges;
	}
	
  }

   /**
   * Gets a page image from a template for display.
   * Retrieves a page image for display from the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @return byte[]
   */ 
  public byte[] getDocumentPageImage(String accountId, String templateId, String documentId, String pageNumber) throws ApiException {
    return getDocumentPageImage(accountId, templateId, documentId, pageNumber, null);
  }
  
  
  /**
   * Gets a page image from a template for display.
   * Retrieves a page image for display from the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @param TemplatesApi.GetDocumentPageImageOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getDocumentPageImage(String accountId, String templateId, String documentId, String pageNumber, TemplatesApi.GetDocumentPageImageOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentPageImage");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentPageImage");
     }
     
     // verify the required parameter 'pageNumber' is set
     if (pageNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling getDocumentPageImage");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getDocumentPageImage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "dpi", options.dpi));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "max_height", options.maxHeight));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "max_width", options.maxWidth));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
	 
    }

    final String[] accepts = {
      "image/png"
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
   * Rotates page image from a template for display.
   * Rotates page image from a template for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @param TemplatesApi.RotateDocumentPageOptions Options for modifying the method behavior.
   * @return void
   */
  public void rotateDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
  
    Object postBody = pageRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling rotateDocumentPage");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling rotateDocumentPage");
     }
     
     // verify the required parameter 'pageNumber' is set
     if (pageNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling rotateDocumentPage");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling rotateDocumentPage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Gets template lock information.
   * Retrieves general information about the template lock.\n\nIf the call is made by the user who has the lock and the request has the same integrator key as original, then the `X-DocuSign-Edit` header  field and additional lock information is included in the response. This allows users to recover a lost editing session token and the `X-DocuSign-Edit` header.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.GetLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation getLock(String accountId, String templateId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates a template lock.
   * Updates the lock duration time or update the `lockedByApp` property information for the specified template. The user and integrator key must match the user specified by the `lockByUser` property and integrator key information and the `X-DocuSign-Edit` header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.UpdateLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation updateLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
  
    Object postBody = lockRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateLock");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Lock a template.
   * Locks the specified template, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the template.\n\n###### Note: Users must have envelope locking capability enabled to use this function (the userSetting property `canLockEnvelopes` must be set to **true** for the user).
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.CreateLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation createLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
  
    Object postBody = lockRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createLock");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a template lock.
   * Deletes the lock from the specified template. The `X-DocuSign-Edit` header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.DeleteLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation deleteLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
  
    Object postBody = lockRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteLock");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets template notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.GetNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   */
  public Notification getNotificationSettings(String accountId, String templateId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getNotificationSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<Notification> returnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates the notification  structure for an existing template.
   * Updates the notification structure for an existing template. Use this endpoint to set reminder and expiration notifications.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.UpdateNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   */
  public Notification updateNotificationSettings(String accountId, String templateId, TemplateNotificationRequest templateNotificationRequest) throws ApiException {
  
    Object postBody = templateNotificationRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationSettings");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateNotificationSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<Notification> returnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets recipient information from a template. Retrieves the information for all recipients in the specified template.
  /// </summary>
  public class ListRecipientsOptions
  {
	
	private String includeAnchorTabLocations = null;
	
	private String includeExtended = null;
	
	private String includeTabs = null;
	
	
	/*
	 * When set to **true** and `include_tabs` is set to **true**, all tabs with anchor tab properties are included in the response. 
	 */
	public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
		this.includeAnchorTabLocations = includeAnchorTabLocations;
	}
	
	public String getIncludeAnchorTabLocations() {
		return this.includeAnchorTabLocations;
	}
	
	/*
	 * When set to **true**, the extended properties are included in the response. 
	 */
	public void setIncludeExtended(String includeExtended) {
		this.includeExtended = includeExtended;
	}
	
	public String getIncludeExtended() {
		return this.includeExtended;
	}
	
	/*
	 * When set to **true**, the tab information associated with the recipient is included in the response. 
	 */
	public void setIncludeTabs(String includeTabs) {
		this.includeTabs = includeTabs;
	}
	
	public String getIncludeTabs() {
		return this.includeTabs;
	}
	
  }

   /**
   * Gets recipient information from a template.
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String templateId) throws ApiException {
    return listRecipients(accountId, templateId, null);
  }
  
  
  /**
   * Gets recipient information from a template.
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.ListRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients listRecipients(String accountId, String templateId, TemplatesApi.ListRecipientsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_anchor_tab_locations", options.includeAnchorTabLocations));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_extended", options.includeExtended));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Updates recipients in a template. Updates recipients in a template. \n\nYou can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.
  /// </summary>
  public class UpdateRecipientsOptions
  {
	
	private String resendEnvelope = null;
	
	
	/*
	 * 
	 */
	public void setResendEnvelope(String resendEnvelope) {
		this.resendEnvelope = resendEnvelope;
	}
	
	public String getResendEnvelope() {
		return this.resendEnvelope;
	}
	
  }

   /**
   * Updates recipients in a template.
   * Updates recipients in a template. \n\nYou can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @return RecipientsUpdateSummary
   */ 
  public RecipientsUpdateSummary updateRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
    return updateRecipients(accountId, templateId, templateRecipients, null);
  }
  
  
  /**
   * Updates recipients in a template.
   * Updates recipients in a template. \n\nYou can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.UpdateRecipientsOptions Options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.UpdateRecipientsOptions options) throws ApiException {
  
    Object postBody = templateRecipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<RecipientsUpdateSummary> returnType = new GenericType<RecipientsUpdateSummary>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Adds tabs for a recipient. Adds one or more recipients to a template.
  /// </summary>
  public class CreateRecipientsOptions
  {
	
	private String resendEnvelope = null;
	
	
	/*
	 * 
	 */
	public void setResendEnvelope(String resendEnvelope) {
		this.resendEnvelope = resendEnvelope;
	}
	
	public String getResendEnvelope() {
		return this.resendEnvelope;
	}
	
  }

   /**
   * Adds tabs for a recipient.
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @return Recipients
   */ 
  public Recipients createRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
    return createRecipients(accountId, templateId, templateRecipients, null);
  }
  
  
  /**
   * Adds tabs for a recipient.
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.CreateRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients createRecipients(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.CreateRecipientsOptions options) throws ApiException {
  
    Object postBody = templateRecipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes recipients from a template.
   * Deletes one or more recipients from a template. Recipients to be deleted are listed in the request, with the `recipientId` being used as the key for deleting recipients.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.DeleteRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients deleteRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
  
    Object postBody = templateRecipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the specified recipient file from a template.
   * Deletes the specified recipient file from the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.DeleteRecipientOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients deleteRecipient(String accountId, String templateId, String recipientId, TemplateRecipients templateRecipients) throws ApiException {
  
    Object postBody = templateRecipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipient");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteRecipient");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteRecipient");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the bulk recipient file from a template. Retrieves the bulk recipient file information from a template that has a bulk recipient.
  /// </summary>
  public class ListBulkRecipientsOptions
  {
	
	private String includeTabs = null;
	
	private String startPosition = null;
	
	
	/*
	 * 
	 */
	public void setIncludeTabs(String includeTabs) {
		this.includeTabs = includeTabs;
	}
	
	public String getIncludeTabs() {
		return this.includeTabs;
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
   * Gets the bulk recipient file from a template.
   * Retrieves the bulk recipient file information from a template that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return BulkRecipientsResponse
   */ 
  public BulkRecipientsResponse listBulkRecipients(String accountId, String templateId, String recipientId) throws ApiException {
    return listBulkRecipients(accountId, templateId, recipientId, null);
  }
  
  
  /**
   * Gets the bulk recipient file from a template.
   * Retrieves the bulk recipient file information from a template that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.ListBulkRecipientsOptions Options for modifying the method behavior.
   * @return BulkRecipientsResponse
   */
  public BulkRecipientsResponse listBulkRecipients(String accountId, String templateId, String recipientId, TemplatesApi.ListBulkRecipientsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listBulkRecipients");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listBulkRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listBulkRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
	 
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

    
    GenericType<BulkRecipientsResponse> returnType = new GenericType<BulkRecipientsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds or replaces the bulk recipients list in a template.
   * Updates the bulk recipients in a template using a file upload. The Content-Type supported for uploading a bulk recipient file is CSV (text/csv).\n\nThe REST API does not support modifying individual rows or values in the bulk recipients file. It only allows the entire file to be added or replaced with a new file.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.UpdateBulkRecipientsOptions Options for modifying the method behavior.
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse updateBulkRecipients(String accountId, String templateId, String recipientId, BulkRecipientsRequest bulkRecipientsRequest) throws ApiException {
  
    Object postBody = bulkRecipientsRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBulkRecipients");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateBulkRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateBulkRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<BulkRecipientsSummaryResponse> returnType = new GenericType<BulkRecipientsSummaryResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the bulk recipient list on a template.
   * Deletes the bulk recipient list on a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.DeleteBulkRecipientsOptions Options for modifying the method behavior.
   * @return BulkRecipientsUpdateResponse
   */
  public BulkRecipientsUpdateResponse deleteBulkRecipients(String accountId, String templateId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBulkRecipients");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteBulkRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteBulkRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<BulkRecipientsUpdateResponse> returnType = new GenericType<BulkRecipientsUpdateResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in a template. Gets the tabs information for a signer or sign-in-person recipient in a template.
  /// </summary>
  public class ListTabsOptions
  {
	
	private String includeAnchorTabLocations = null;
	
	private String includeMetadata = null;
	
	
	/*
	 * When set to **true**, all tabs with anchor tab properties are included in the response. 
	 */
	public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
		this.includeAnchorTabLocations = includeAnchorTabLocations;
	}
	
	public String getIncludeAnchorTabLocations() {
		return this.includeAnchorTabLocations;
	}
	
	/*
	 * 
	 */
	public void setIncludeMetadata(String includeMetadata) {
		this.includeMetadata = includeMetadata;
	}
	
	public String getIncludeMetadata() {
		return this.includeMetadata;
	}
	
  }

   /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return Tabs
   */ 
  public Tabs listTabs(String accountId, String templateId, String recipientId) throws ApiException {
    return listTabs(accountId, templateId, recipientId, null);
  }
  
  
  /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.ListTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs listTabs(String accountId, String templateId, String recipientId, TemplatesApi.ListTabsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listTabs");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_anchor_tab_locations", options.includeAnchorTabLocations));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates the tabs for a recipient.
   * Updates one or more tabs for a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.UpdateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs updateTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
  
    Object postBody = templateTabs;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTabs");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.CreateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs createTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
  
    Object postBody = templateTabs;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createTabs");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the tabs associated with a recipient in a template.
   * Deletes one or more tabs associated with a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param TemplatesApi.DeleteTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs deleteTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
  
    Object postBody = templateTabs;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteTabs");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Provides a URL to start an edit view of the Template UI
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param TemplatesApi.CreateEditViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createEditView(String accountId, String templateId, ReturnUrlRequest returnUrlRequest) throws ApiException {
  
    Object postBody = returnUrlRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEditView");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createEditView");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/views/edit".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Shares a template with a group
   * Shares a template with the specified members group.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param templatePart Currently, the only defined part is **groups**.
   * @param TemplatesApi.UpdateGroupShareOptions Options for modifying the method behavior.
   * @return GroupInformation
   */
  public GroupInformation updateGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
  
    Object postBody = groupInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateGroupShare");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateGroupShare");
     }
     
     // verify the required parameter 'templatePart' is set
     if (templatePart == null) {
        throw new ApiException(400, "Missing the required parameter 'templatePart' when calling updateGroupShare");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/{templatePart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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

    
    GenericType<GroupInformation> returnType = new GenericType<GroupInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Removes a member group&#39;s sharing permissions for a template.
   * Removes a member group&#39;s sharing permissions for a specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param templatePart Currently, the only defined part is **groups**.
   * @param TemplatesApi.DeleteGroupShareOptions Options for modifying the method behavior.
   * @return GroupInformation
   */
  public GroupInformation deleteGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
  
    Object postBody = groupInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteGroupShare");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteGroupShare");
     }
     
     // verify the required parameter 'templatePart' is set
     if (templatePart == null) {
        throw new ApiException(400, "Missing the required parameter 'templatePart' when calling deleteGroupShare");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/{templatePart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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

    
    GenericType<GroupInformation> returnType = new GenericType<GroupInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
