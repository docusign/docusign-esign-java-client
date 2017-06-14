package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.WorkspaceList;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Workspace;
import com.docusign.esign.model.WorkspaceFolderContents;
import com.docusign.esign.model.WorkspaceItemList;
import com.docusign.esign.model.WorkspaceItem;
import com.docusign.esign.model.PageImages;


public class WorkspacesApi {
  private ApiClient apiClient;

  public WorkspacesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkspacesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  
  /**
   * List Workspaces
   * Gets information about the Workspaces that have been created.
   * @param accountId The external account number (int) or account ID Guid.
   * @param WorkspacesApi.ListWorkspacesOptions Options for modifying the method behavior.
   * @return WorkspaceList
   */
  public WorkspaceList listWorkspaces(String accountId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listWorkspaces");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces".replaceAll("\\{format\\}","json")
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

    
    GenericType<WorkspaceList> returnType = new GenericType<WorkspaceList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Create a Workspace
   * Creates a new workspace.
   * @param accountId The external account number (int) or account ID Guid.
   * @param WorkspacesApi.CreateWorkspaceOptions Options for modifying the method behavior.
   * @return Workspace
   */
  public Workspace createWorkspace(String accountId, Workspace workspace) throws ApiException {
  
    Object postBody = workspace;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createWorkspace");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces".replaceAll("\\{format\\}","json")
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

    
    GenericType<Workspace> returnType = new GenericType<Workspace>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Get Workspace
   * Retrives properties about a workspace given a unique workspaceId.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param WorkspacesApi.GetWorkspaceOptions Options for modifying the method behavior.
   * @return Workspace
   */
  public Workspace getWorkspace(String accountId, String workspaceId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkspace");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling getWorkspace");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

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

    
    GenericType<Workspace> returnType = new GenericType<Workspace>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Update Workspace
   * Updates information about a specific workspace.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param WorkspacesApi.UpdateWorkspaceOptions Options for modifying the method behavior.
   * @return Workspace
   */
  public Workspace updateWorkspace(String accountId, String workspaceId, Workspace workspace) throws ApiException {
  
    Object postBody = workspace;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWorkspace");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling updateWorkspace");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

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

    
    GenericType<Workspace> returnType = new GenericType<Workspace>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Delete Workspace
   * Deletes an existing workspace (logically).
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param WorkspacesApi.DeleteWorkspaceOptions Options for modifying the method behavior.
   * @return Workspace
   */
  public Workspace deleteWorkspace(String accountId, String workspaceId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteWorkspace");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling deleteWorkspace");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

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

    
    GenericType<Workspace> returnType = new GenericType<Workspace>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// List Workspace Folder Contents Retrieves workspace folder contents, which can include sub folders and files.
  /// </summary>
  public class ListWorkspaceFolderItemsOptions
  {
	
	private String count = null;
	
	private String includeFiles = null;
	
	private String includeSubFolders = null;
	
	private String includeThumbnails = null;
	
	private String includeUserDetail = null;
	
	private String startPosition = null;
	
	private String workspaceUserId = null;
	
	
	/*
	 * The maximum number of results to be returned by this request. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * When set to **true**, file information is returned in the response along with folder information. The default is **false**. 
	 */
	public void setIncludeFiles(String includeFiles) {
		this.includeFiles = includeFiles;
	}
	
	public String getIncludeFiles() {
		return this.includeFiles;
	}
	
	/*
	 * When set to **true**, information about the sub-folders of the current folder is returned. The default is **false**. 
	 */
	public void setIncludeSubFolders(String includeSubFolders) {
		this.includeSubFolders = includeSubFolders;
	}
	
	public String getIncludeSubFolders() {
		return this.includeSubFolders;
	}
	
	/*
	 * When set to **true**, thumbnails are returned as part of the response.  The default is **false**. 
	 */
	public void setIncludeThumbnails(String includeThumbnails) {
		this.includeThumbnails = includeThumbnails;
	}
	
	public String getIncludeThumbnails() {
		return this.includeThumbnails;
	}
	
	/*
	 * Set to **true** to return extended details about the user. The default is **false**. 
	 */
	public void setIncludeUserDetail(String includeUserDetail) {
		this.includeUserDetail = includeUserDetail;
	}
	
	public String getIncludeUserDetail() {
		return this.includeUserDetail;
	}
	
	/*
	 * The position within the total result set from which to start returning values. 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
	/*
	 * If set, then the results are filtered to those associated with the specified userId. 
	 */
	public void setWorkspaceUserId(String workspaceUserId) {
		this.workspaceUserId = workspaceUserId;
	}
	
	public String getWorkspaceUserId() {
		return this.workspaceUserId;
	}
	
  }

   /**
   * List Workspace Folder Contents
   * Retrieves workspace folder contents, which can include sub folders and files.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @return WorkspaceFolderContents
   */ 
  public WorkspaceFolderContents listWorkspaceFolderItems(String accountId, String workspaceId, String folderId) throws ApiException {
    return listWorkspaceFolderItems(accountId, workspaceId, folderId, null);
  }
  
  
  /**
   * List Workspace Folder Contents
   * Retrieves workspace folder contents, which can include sub folders and files.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param WorkspacesApi.ListWorkspaceFolderItemsOptions Options for modifying the method behavior.
   * @return WorkspaceFolderContents
   */
  public WorkspaceFolderContents listWorkspaceFolderItems(String accountId, String workspaceId, String folderId, WorkspacesApi.ListWorkspaceFolderItemsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listWorkspaceFolderItems");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling listWorkspaceFolderItems");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling listWorkspaceFolderItems");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_files", options.includeFiles));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_sub_folders", options.includeSubFolders));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_thumbnails", options.includeThumbnails));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_user_detail", options.includeUserDetail));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "workspace_user_id", options.workspaceUserId));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<WorkspaceFolderContents> returnType = new GenericType<WorkspaceFolderContents>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes workspace one or more specific files/folders from the given folder or root.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param WorkspacesApi.DeleteWorkspaceFolderItemsOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteWorkspaceFolderItems(String accountId, String workspaceId, String folderId, WorkspaceItemList workspaceItemList) throws ApiException {
  
    Object postBody = workspaceItemList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteWorkspaceFolderItems");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling deleteWorkspaceFolderItems");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling deleteWorkspaceFolderItems");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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
   * Creates a workspace file.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param WorkspacesApi.CreateWorkspaceFileOptions Options for modifying the method behavior.
   * @return WorkspaceItem
   */
  public WorkspaceItem createWorkspaceFile(String accountId, String workspaceId, String folderId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createWorkspaceFile");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling createWorkspaceFile");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling createWorkspaceFile");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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

    
    GenericType<WorkspaceItem> returnType = new GenericType<WorkspaceItem>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Get Workspace File Retrieves a workspace file (the binary).
  /// </summary>
  public class GetWorkspaceFileOptions
  {
	
	private String isDownload = null;
	
	private String pdfVersion = null;
	
	
	/*
	 * When set to **true**, the Content-Disposition header is set in the response. The value of the header provides the filename of the file. Default is **false**. 
	 */
	public void setIsDownload(String isDownload) {
		this.isDownload = isDownload;
	}
	
	public String getIsDownload() {
		return this.isDownload;
	}
	
	/*
	 * When set to **true** the file returned as a PDF. 
	 */
	public void setPdfVersion(String pdfVersion) {
		this.pdfVersion = pdfVersion;
	}
	
	public String getPdfVersion() {
		return this.pdfVersion;
	}
	
  }

   /**
   * Get Workspace File
   * Retrieves a workspace file (the binary).
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param fileId Specifies the room file ID GUID.
   * @return void
   */ 
  public void getWorkspaceFile(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
  getWorkspaceFile(accountId, workspaceId, folderId, fileId, null);
  }
  
  
  /**
   * Get Workspace File
   * Retrieves a workspace file (the binary).
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param fileId Specifies the room file ID GUID.
   * @param WorkspacesApi.GetWorkspaceFileOptions Options for modifying the method behavior.
   * @return void
   */
  public void getWorkspaceFile(String accountId, String workspaceId, String folderId, String fileId, WorkspacesApi.GetWorkspaceFileOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkspaceFile");
     }
     
     // verify the required parameter 'fileId' is set
     if (fileId == null) {
        throw new ApiException(400, "Missing the required parameter 'fileId' when calling getWorkspaceFile");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling getWorkspaceFile");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling getWorkspaceFile");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "is_download", options.isDownload));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "pdf_version", options.pdfVersion));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Update Workspace File Metadata
   * Updates workspace item metadata for one or more specific files/folders.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param fileId Specifies the room file ID GUID.
   * @param WorkspacesApi.UpdateWorkspaceFileOptions Options for modifying the method behavior.
   * @return WorkspaceItem
   */
  public WorkspaceItem updateWorkspaceFile(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWorkspaceFile");
     }
     
     // verify the required parameter 'fileId' is set
     if (fileId == null) {
        throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateWorkspaceFile");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling updateWorkspaceFile");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling updateWorkspaceFile");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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

    
    GenericType<WorkspaceItem> returnType = new GenericType<WorkspaceItem>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// List File Pages Retrieves a workspace file as rasterized pages.
  /// </summary>
  public class ListWorkspaceFilePagesOptions
  {
	
	private String count = null;
	
	private String dpi = null;
	
	private String maxHeight = null;
	
	private String maxWidth = null;
	
	private String startPosition = null;
	
	
	/*
	 * The maximum number of results to be returned by this request. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * Number of dots per inch for the resulting image. The default if not used is 94. The range is 1-310. 
	 */
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	
	public String getDpi() {
		return this.dpi;
	}
	
	/*
	 * Sets the maximum height (in pixels) of the returned image. 
	 */
	public void setMaxHeight(String maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public String getMaxHeight() {
		return this.maxHeight;
	}
	
	/*
	 * Sets the maximum width (in pixels) of the returned image. 
	 */
	public void setMaxWidth(String maxWidth) {
		this.maxWidth = maxWidth;
	}
	
	public String getMaxWidth() {
		return this.maxWidth;
	}
	
	/*
	 * The position within the total result set from which to start returning values. The value **thumbnail** may be used to return the page image. 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
  }

   /**
   * List File Pages
   * Retrieves a workspace file as rasterized pages.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param fileId Specifies the room file ID GUID.
   * @return PageImages
   */ 
  public PageImages listWorkspaceFilePages(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
    return listWorkspaceFilePages(accountId, workspaceId, folderId, fileId, null);
  }
  
  
  /**
   * List File Pages
   * Retrieves a workspace file as rasterized pages.
   * @param accountId The external account number (int) or account ID Guid.
   * @param workspaceId Specifies the workspace ID GUID.
   * @param folderId The ID of the folder being accessed.
   * @param fileId Specifies the room file ID GUID.
   * @param WorkspacesApi.ListWorkspaceFilePagesOptions Options for modifying the method behavior.
   * @return PageImages
   */
  public PageImages listWorkspaceFilePages(String accountId, String workspaceId, String folderId, String fileId, WorkspacesApi.ListWorkspaceFilePagesOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listWorkspaceFilePages");
     }
     
     // verify the required parameter 'fileId' is set
     if (fileId == null) {
        throw new ApiException(400, "Missing the required parameter 'fileId' when calling listWorkspaceFilePages");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling listWorkspaceFilePages");
     }
     
     // verify the required parameter 'workspaceId' is set
     if (workspaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling listWorkspaceFilePages");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}/pages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "dpi", options.dpi));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "max_height", options.maxHeight));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "max_width", options.maxWidth));
	 
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

    
    GenericType<PageImages> returnType = new GenericType<PageImages>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
