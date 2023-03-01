
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * WorkspacesApi class.
 *
 **/
public class WorkspacesApi {
  private ApiClient apiClient;

 /**
  * WorkspacesApi.
  *
  **/
  public WorkspacesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * WorkspacesApi.
  *
  **/
  public WorkspacesApi(ApiClient apiClient) {
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
   * Create a Workspace.
   * Creates a new workspace.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspace  (optional)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace createWorkspace(String accountId, Workspace workspace) throws ApiException {
    ApiResponse<Workspace> localVarResponse = createWorkspaceWithHttpInfo(accountId, workspace);
    return localVarResponse.getData();
  }

  /**
   * Create a Workspace
   * Creates a new workspace.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspace  (optional)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace > createWorkspaceWithHttpInfo(String accountId, Workspace workspace) throws ApiException {
    Object localVarPostBody = workspace;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createWorkspace");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
    
    GenericType<Workspace> localVarReturnType = new GenericType<Workspace>() {};
    Workspace localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workspace>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a workspace file..
   * This method adds a file to a workspace.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @return WorkspaceItem
   * @throws ApiException if fails to make API call
   */
  public WorkspaceItem createWorkspaceFile(String accountId, String workspaceId, String folderId) throws ApiException {
    ApiResponse<WorkspaceItem> localVarResponse = createWorkspaceFileWithHttpInfo(accountId, workspaceId, folderId);
    return localVarResponse.getData();
  }

  /**
   * Creates a workspace file.
   * This method adds a file to a workspace.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @return WorkspaceItem
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceItem > createWorkspaceFileWithHttpInfo(String accountId, String workspaceId, String folderId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createWorkspaceFile");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling createWorkspaceFile");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createWorkspaceFile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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
    
    GenericType<WorkspaceItem> localVarReturnType = new GenericType<WorkspaceItem>() {};
    WorkspaceItem localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkspaceItem>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete Workspace.
   * Deletes an existing workspace (logically).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace deleteWorkspace(String accountId, String workspaceId) throws ApiException {
    ApiResponse<Workspace> localVarResponse = deleteWorkspaceWithHttpInfo(accountId, workspaceId);
    return localVarResponse.getData();
  }

  /**
   * Delete Workspace
   * Deletes an existing workspace (logically).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace > deleteWorkspaceWithHttpInfo(String accountId, String workspaceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteWorkspace");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling deleteWorkspace");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

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
    
    GenericType<Workspace> localVarReturnType = new GenericType<Workspace>() {};
    Workspace localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workspace>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes workspace one or more specific files/folders from the given folder or root..
   * This method deletes one or more files or sub-folders from a workspace folder or root.  Note: To delete items from a workspace, the &#x60;status&#x60; of the workspace must be &#x60;active&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param workspaceItemList  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkspaceFolderItems(String accountId, String workspaceId, String folderId, WorkspaceItemList workspaceItemList) throws ApiException {
    deleteWorkspaceFolderItemsWithHttpInfo(accountId, workspaceId, folderId, workspaceItemList);
  }

  /**
   * Deletes workspace one or more specific files/folders from the given folder or root.
   * This method deletes one or more files or sub-folders from a workspace folder or root.  Note: To delete items from a workspace, the &#x60;status&#x60; of the workspace must be &#x60;active&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param workspaceItemList  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteWorkspaceFolderItemsWithHttpInfo(String accountId, String workspaceId, String folderId, WorkspaceItemList workspaceItemList) throws ApiException {
    Object localVarPostBody = workspaceItemList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteWorkspaceFolderItems");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling deleteWorkspaceFolderItems");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling deleteWorkspaceFolderItems");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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
   * Get Workspace.
   * Retrives properties about a workspace given a unique workspaceId. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace getWorkspace(String accountId, String workspaceId) throws ApiException {
    ApiResponse<Workspace> localVarResponse = getWorkspaceWithHttpInfo(accountId, workspaceId);
    return localVarResponse.getData();
  }

  /**
   * Get Workspace
   * Retrives properties about a workspace given a unique workspaceId. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace > getWorkspaceWithHttpInfo(String accountId, String workspaceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkspace");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling getWorkspace");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

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
    
    GenericType<Workspace> localVarReturnType = new GenericType<Workspace>() {};
    Workspace localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workspace>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get Workspace File Retrieves a workspace file (the binary).
  /// </summary>

 /**
  * GetWorkspaceFileOptions Class.
  *
  **/
  public class GetWorkspaceFileOptions
  {
  private String isDownload = null;
  private String pdfVersion = null;
  
 /**
  * setIsDownload method.
  */
  public void setIsDownload(String isDownload) {
    this.isDownload = isDownload;
  }

 /**
  * getIsDownload method.
  *
  * @return String
  */
  public String getIsDownload() {
    return this.isDownload;
  }
  
 /**
  * setPdfVersion method.
  */
  public void setPdfVersion(String pdfVersion) {
    this.pdfVersion = pdfVersion;
  }

 /**
  * getPdfVersion method.
  *
  * @return String
  */
  public String getPdfVersion() {
    return this.pdfVersion;
  }
  }

   /**
   * Get Workspace File.
   * Retrieves a workspace file (the binary).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @return void
   */ 
  public void getWorkspaceFile(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
    getWorkspaceFile(accountId, workspaceId, folderId, fileId, null);
  }

  /**
   * Get Workspace File.
   * Retrieves a workspace file (the binary).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void getWorkspaceFile(String accountId, String workspaceId, String folderId, String fileId, WorkspacesApi.GetWorkspaceFileOptions options) throws ApiException {
    getWorkspaceFileWithHttpInfo(accountId, workspaceId, folderId, fileId, options);
  }

  /**
   * Get Workspace File
   * Retrieves a workspace file (the binary).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getWorkspaceFileWithHttpInfo(String accountId, String workspaceId, String folderId, String fileId, WorkspacesApi.GetWorkspaceFileOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkspaceFile");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling getWorkspaceFile");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getWorkspaceFile");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getWorkspaceFile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_download", options.isDownload));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("pdf_version", options.pdfVersion));
    }

    

    

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
  /// <summary>
  /// List File Pages Retrieves a workspace file as rasterized pages.
  /// </summary>

 /**
  * ListWorkspaceFilePagesOptions Class.
  *
  **/
  public class ListWorkspaceFilePagesOptions
  {
  private String count = null;
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
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
  * setDpi method.
  */
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

 /**
  * getDpi method.
  *
  * @return String
  */
  public String getDpi() {
    return this.dpi;
  }
  
 /**
  * setMaxHeight method.
  */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }

 /**
  * getMaxHeight method.
  *
  * @return String
  */
  public String getMaxHeight() {
    return this.maxHeight;
  }
  
 /**
  * setMaxWidth method.
  */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }

 /**
  * getMaxWidth method.
  *
  * @return String
  */
  public String getMaxWidth() {
    return this.maxWidth;
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
   * List File Pages.
   * Retrieves a workspace file as rasterized pages.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @return PageImages
   */ 
  public PageImages listWorkspaceFilePages(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
    return listWorkspaceFilePages(accountId, workspaceId, folderId, fileId, null);
  }

  /**
   * List File Pages.
   * Retrieves a workspace file as rasterized pages.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public PageImages listWorkspaceFilePages(String accountId, String workspaceId, String folderId, String fileId, WorkspacesApi.ListWorkspaceFilePagesOptions options) throws ApiException {
    ApiResponse<PageImages> localVarResponse = listWorkspaceFilePagesWithHttpInfo(accountId, workspaceId, folderId, fileId, options);
    return localVarResponse.getData();
  }

  /**
   * List File Pages
   * Retrieves a workspace file as rasterized pages.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageImages > listWorkspaceFilePagesWithHttpInfo(String accountId, String workspaceId, String folderId, String fileId, WorkspacesApi.ListWorkspaceFilePagesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listWorkspaceFilePages");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling listWorkspaceFilePages");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling listWorkspaceFilePages");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling listWorkspaceFilePages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}/pages"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("dpi", options.dpi));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_height", options.maxHeight));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_width", options.maxWidth));
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
    
    GenericType<PageImages> localVarReturnType = new GenericType<PageImages>() {};
    PageImages localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PageImages>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// List Workspace Folder Contents Retrieves workspace folder contents, which can include sub folders and files.
  /// </summary>

 /**
  * ListWorkspaceFolderItemsOptions Class.
  *
  **/
  public class ListWorkspaceFolderItemsOptions
  {
  private String count = null;
  private String includeFiles = null;
  private String includeSubFolders = null;
  private String includeThumbnails = null;
  private String includeUserDetail = null;
  private String startPosition = null;
  private String workspaceUserId = null;
  
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
  * setIncludeFiles method.
  */
  public void setIncludeFiles(String includeFiles) {
    this.includeFiles = includeFiles;
  }

 /**
  * getIncludeFiles method.
  *
  * @return String
  */
  public String getIncludeFiles() {
    return this.includeFiles;
  }
  
 /**
  * setIncludeSubFolders method.
  */
  public void setIncludeSubFolders(String includeSubFolders) {
    this.includeSubFolders = includeSubFolders;
  }

 /**
  * getIncludeSubFolders method.
  *
  * @return String
  */
  public String getIncludeSubFolders() {
    return this.includeSubFolders;
  }
  
 /**
  * setIncludeThumbnails method.
  */
  public void setIncludeThumbnails(String includeThumbnails) {
    this.includeThumbnails = includeThumbnails;
  }

 /**
  * getIncludeThumbnails method.
  *
  * @return String
  */
  public String getIncludeThumbnails() {
    return this.includeThumbnails;
  }
  
 /**
  * setIncludeUserDetail method.
  */
  public void setIncludeUserDetail(String includeUserDetail) {
    this.includeUserDetail = includeUserDetail;
  }

 /**
  * getIncludeUserDetail method.
  *
  * @return String
  */
  public String getIncludeUserDetail() {
    return this.includeUserDetail;
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
  
 /**
  * setWorkspaceUserId method.
  */
  public void setWorkspaceUserId(String workspaceUserId) {
    this.workspaceUserId = workspaceUserId;
  }

 /**
  * getWorkspaceUserId method.
  *
  * @return String
  */
  public String getWorkspaceUserId() {
    return this.workspaceUserId;
  }
  }

   /**
   * List Workspace Folder Contents.
   * Retrieves workspace folder contents, which can include sub folders and files.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @return WorkspaceFolderContents
   */ 
  public WorkspaceFolderContents listWorkspaceFolderItems(String accountId, String workspaceId, String folderId) throws ApiException {
    return listWorkspaceFolderItems(accountId, workspaceId, folderId, null);
  }

  /**
   * List Workspace Folder Contents.
   * Retrieves workspace folder contents, which can include sub folders and files.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param options for modifying the method behavior.
   * @return WorkspaceFolderContents
   * @throws ApiException if fails to make API call
   */
  public WorkspaceFolderContents listWorkspaceFolderItems(String accountId, String workspaceId, String folderId, WorkspacesApi.ListWorkspaceFolderItemsOptions options) throws ApiException {
    ApiResponse<WorkspaceFolderContents> localVarResponse = listWorkspaceFolderItemsWithHttpInfo(accountId, workspaceId, folderId, options);
    return localVarResponse.getData();
  }

  /**
   * List Workspace Folder Contents
   * Retrieves workspace folder contents, which can include sub folders and files.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param options for modifying the method behavior.
   * @return WorkspaceFolderContents
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceFolderContents > listWorkspaceFolderItemsWithHttpInfo(String accountId, String workspaceId, String folderId, WorkspacesApi.ListWorkspaceFolderItemsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listWorkspaceFolderItems");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling listWorkspaceFolderItems");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling listWorkspaceFolderItems");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_files", options.includeFiles));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_sub_folders", options.includeSubFolders));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_thumbnails", options.includeThumbnails));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_user_detail", options.includeUserDetail));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("workspace_user_id", options.workspaceUserId));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WorkspaceFolderContents> localVarReturnType = new GenericType<WorkspaceFolderContents>() {};
    WorkspaceFolderContents localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkspaceFolderContents>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * List Workspaces.
   * Gets information about the Workspaces that have been created.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return WorkspaceList
   * @throws ApiException if fails to make API call
   */
  public WorkspaceList listWorkspaces(String accountId) throws ApiException {
    ApiResponse<WorkspaceList> localVarResponse = listWorkspacesWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * List Workspaces
   * Gets information about the Workspaces that have been created.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return WorkspaceList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceList > listWorkspacesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listWorkspaces");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
    
    GenericType<WorkspaceList> localVarReturnType = new GenericType<WorkspaceList>() {};
    WorkspaceList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkspaceList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update Workspace.
   * Updates information about a specific workspace.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param workspace  (optional)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace updateWorkspace(String accountId, String workspaceId, Workspace workspace) throws ApiException {
    ApiResponse<Workspace> localVarResponse = updateWorkspaceWithHttpInfo(accountId, workspaceId, workspace);
    return localVarResponse.getData();
  }

  /**
   * Update Workspace
   * Updates information about a specific workspace.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param workspace  (optional)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace > updateWorkspaceWithHttpInfo(String accountId, String workspaceId, Workspace workspace) throws ApiException {
    Object localVarPostBody = workspace;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWorkspace");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling updateWorkspace");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

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
    
    GenericType<Workspace> localVarReturnType = new GenericType<Workspace>() {};
    Workspace localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workspace>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update Workspace File Metadata.
   * Updates workspace item metadata for one or more specific files/folders.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @return WorkspaceItem
   * @throws ApiException if fails to make API call
   */
  public WorkspaceItem updateWorkspaceFile(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
    ApiResponse<WorkspaceItem> localVarResponse = updateWorkspaceFileWithHttpInfo(accountId, workspaceId, folderId, fileId);
    return localVarResponse.getData();
  }

  /**
   * Update Workspace File Metadata
   * Updates workspace item metadata for one or more specific files/folders.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param workspaceId Specifies the workspace ID GUID. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param fileId Specifies the room file ID GUID. (required)
   * @return WorkspaceItem
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceItem > updateWorkspaceFileWithHttpInfo(String accountId, String workspaceId, String folderId, String fileId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWorkspaceFile");
    }
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling updateWorkspaceFile");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling updateWorkspaceFile");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateWorkspaceFile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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
    
    GenericType<WorkspaceItem> localVarReturnType = new GenericType<WorkspaceItem>() {};
    WorkspaceItem localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkspaceItem>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
