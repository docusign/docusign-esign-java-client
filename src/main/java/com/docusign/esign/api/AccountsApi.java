
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * AccountsApi class.
 *
 **/
public class AccountsApi {
  private ApiClient apiClient;

 /**
  * AccountsApi.
  *
  **/
  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * AccountsApi.
  *
  **/
  public AccountsApi(ApiClient apiClient) {
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

  /// <summary>
  /// Creates new accounts. Creates new DocuSign service accounts.  This is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a &#x60;newAccountRequests&#x60; element. A maximum of 100 new accounts can be created at one time.  Note that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a &#x60;newAccountDefinition&#x60; property inside the &#x60;newAccountRequests&#x60; element. Response  The response returns the new account ID, password and the default user information for each newly created account.  A 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an &#x60;errorDetails&#x60; node is added in the response to each specific request that failed.
  /// </summary>

 /**
  * CreateOptions Class.
  *
  **/
  public class CreateOptions
  {
  private String previewBillingPlan = null;
  
 /**
  * setPreviewBillingPlan method.
  */
  public void setPreviewBillingPlan(String previewBillingPlan) {
    this.previewBillingPlan = previewBillingPlan;
  }

 /**
  * getPreviewBillingPlan method.
  *
  * @return String
  */
  public String getPreviewBillingPlan() {
    return this.previewBillingPlan;
  }
  }

   /**
   * Creates new accounts..
   * Creates new DocuSign service accounts.  This is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a &#x60;newAccountRequests&#x60; element. A maximum of 100 new accounts can be created at one time.  Note that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a &#x60;newAccountDefinition&#x60; property inside the &#x60;newAccountRequests&#x60; element. Response  The response returns the new account ID, password and the default user information for each newly created account.  A 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an &#x60;errorDetails&#x60; node is added in the response to each specific request that failed.
   * @param newAccountDefinition  (optional)
   * @return NewAccountSummary
   */ 
  public NewAccountSummary create(NewAccountDefinition newAccountDefinition) throws ApiException {
    return create(newAccountDefinition, null);
  }

  /**
   * Creates new accounts..
   * Creates new DocuSign service accounts.  This is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a &#x60;newAccountRequests&#x60; element. A maximum of 100 new accounts can be created at one time.  Note that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a &#x60;newAccountDefinition&#x60; property inside the &#x60;newAccountRequests&#x60; element. Response  The response returns the new account ID, password and the default user information for each newly created account.  A 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an &#x60;errorDetails&#x60; node is added in the response to each specific request that failed.
   * @param newAccountDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return NewAccountSummary
   * @throws ApiException if fails to make API call
   */
  public NewAccountSummary create(NewAccountDefinition newAccountDefinition, AccountsApi.CreateOptions options) throws ApiException {
    ApiResponse<NewAccountSummary> localVarResponse = createWithHttpInfo(newAccountDefinition, options);
    return localVarResponse.getData();
  }

  /**
   * Creates new accounts.
   * Creates new DocuSign service accounts.  This is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a &#x60;newAccountRequests&#x60; element. A maximum of 100 new accounts can be created at one time.  Note that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a &#x60;newAccountDefinition&#x60; property inside the &#x60;newAccountRequests&#x60; element. Response  The response returns the new account ID, password and the default user information for each newly created account.  A 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an &#x60;errorDetails&#x60; node is added in the response to each specific request that failed.
   * @param newAccountDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return NewAccountSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NewAccountSummary > createWithHttpInfo(NewAccountDefinition newAccountDefinition, AccountsApi.CreateOptions options) throws ApiException {
    Object localVarPostBody = newAccountDefinition;
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preview_billing_plan", options.previewBillingPlan));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<NewAccountSummary> localVarReturnType = new GenericType<NewAccountSummary>() {};
    NewAccountSummary localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NewAccountSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Adds/updates one or more account signatures. This request may include images in multi-part format. 
  /// </summary>

 /**
  * CreateAccountSignaturesOptions Class.
  *
  **/
  public class CreateAccountSignaturesOptions
  {
  private String decodeOnly = null;
  
 /**
  * setDecodeOnly method.
  */
  public void setDecodeOnly(String decodeOnly) {
    this.decodeOnly = decodeOnly;
  }

 /**
  * getDecodeOnly method.
  *
  * @return String
  */
  public String getDecodeOnly() {
    return this.decodeOnly;
  }
  }

   /**
   * Adds/updates one or more account signatures. This request may include images in multi-part format..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSignaturesInformation  (optional)
   * @return AccountSignaturesInformation
   */ 
  public AccountSignaturesInformation createAccountSignatures(String accountId, AccountSignaturesInformation accountSignaturesInformation) throws ApiException {
    return createAccountSignatures(accountId, accountSignaturesInformation, null);
  }

  /**
   * Adds/updates one or more account signatures. This request may include images in multi-part format..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSignaturesInformation  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSignaturesInformation createAccountSignatures(String accountId, AccountSignaturesInformation accountSignaturesInformation, AccountsApi.CreateAccountSignaturesOptions options) throws ApiException {
    ApiResponse<AccountSignaturesInformation> localVarResponse = createAccountSignaturesWithHttpInfo(accountId, accountSignaturesInformation, options);
    return localVarResponse.getData();
  }

  /**
   * Adds/updates one or more account signatures. This request may include images in multi-part format.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSignaturesInformation  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignaturesInformation > createAccountSignaturesWithHttpInfo(String accountId, AccountSignaturesInformation accountSignaturesInformation, AccountsApi.CreateAccountSignaturesOptions options) throws ApiException {
    Object localVarPostBody = accountSignaturesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createAccountSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("decode_only", options.decodeOnly));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountSignaturesInformation> localVarReturnType = new GenericType<AccountSignaturesInformation>() {};
    AccountSignaturesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignaturesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates one or more brand profile files for the account..
   * Creates one or more brand profile files for the account. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSig&#x60;) must be set to **true** for the account to use this call.  An error is returned if &#x60;brandId&#x60; property for a brand profile is already set for the account. To upload a new version of an existing brand profile, you must delete the profile and then upload the newer version.  When brand profile files are being uploaded, they must be combined into one zip file and the &#x60;Content-Type&#x60; must be &#x60;application/zip&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brand  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse createBrand(String accountId, Brand brand) throws ApiException {
    ApiResponse<BrandsResponse> localVarResponse = createBrandWithHttpInfo(accountId, brand);
    return localVarResponse.getData();
  }

  /**
   * Creates one or more brand profile files for the account.
   * Creates one or more brand profile files for the account. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSig&#x60;) must be set to **true** for the account to use this call.  An error is returned if &#x60;brandId&#x60; property for a brand profile is already set for the account. To upload a new version of an existing brand profile, you must delete the profile and then upload the newer version.  When brand profile files are being uploaded, they must be combined into one zip file and the &#x60;Content-Type&#x60; must be &#x60;application/zip&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brand  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BrandsResponse > createBrandWithHttpInfo(String accountId, Brand brand) throws ApiException {
    Object localVarPostBody = brand;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands"
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
    
    GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
    BrandsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BrandsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Creates an acount custom field. This method creates a custom field and makes it available for all new envelopes associated with an account.
  /// </summary>

 /**
  * CreateCustomFieldOptions Class.
  *
  **/
  public class CreateCustomFieldOptions
  {
  private String applyToTemplates = null;
  
 /**
  * setApplyToTemplates method.
  */
  public void setApplyToTemplates(String applyToTemplates) {
    this.applyToTemplates = applyToTemplates;
  }

 /**
  * getApplyToTemplates method.
  *
  * @return String
  */
  public String getApplyToTemplates() {
    return this.applyToTemplates;
  }
  }

   /**
   * Creates an acount custom field..
   * This method creates a custom field and makes it available for all new envelopes associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customField  (optional)
   * @return CustomFields
   */ 
  public CustomFields createCustomField(String accountId, CustomField customField) throws ApiException {
    return createCustomField(accountId, customField, null);
  }

  /**
   * Creates an acount custom field..
   * This method creates a custom field and makes it available for all new envelopes associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customField  (optional)
   * @param options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields createCustomField(String accountId, CustomField customField, AccountsApi.CreateCustomFieldOptions options) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = createCustomFieldWithHttpInfo(accountId, customField, options);
    return localVarResponse.getData();
  }

  /**
   * Creates an acount custom field.
   * This method creates a custom field and makes it available for all new envelopes associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customField  (optional)
   * @param options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > createCustomFieldWithHttpInfo(String accountId, CustomField customField, AccountsApi.CreateCustomFieldOptions options) throws ApiException {
    Object localVarPostBody = customField;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("apply_to_templates", options.applyToTemplates));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Creates a new permission profile in the specified account. This method creates a new permission profile for an account.  ### Related topics  - [How to create a permission profile](/docs/esign-rest-api/how-to/permission-profile-creating/) 
  /// </summary>

 /**
  * CreatePermissionProfileOptions Class.
  *
  **/
  public class CreatePermissionProfileOptions
  {
  private String include = null;
  
 /**
  * setInclude method.
  */
  public void setInclude(String include) {
    this.include = include;
  }

 /**
  * getInclude method.
  *
  * @return String
  */
  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Creates a new permission profile in the specified account..
   * This method creates a new permission profile for an account.  ### Related topics  - [How to create a permission profile](/docs/esign-rest-api/how-to/permission-profile-creating/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfile  (optional)
   * @return PermissionProfile
   */ 
  public PermissionProfile createPermissionProfile(String accountId, PermissionProfile permissionProfile) throws ApiException {
    return createPermissionProfile(accountId, permissionProfile, null);
  }

  /**
   * Creates a new permission profile in the specified account..
   * This method creates a new permission profile for an account.  ### Related topics  - [How to create a permission profile](/docs/esign-rest-api/how-to/permission-profile-creating/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfile  (optional)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public PermissionProfile createPermissionProfile(String accountId, PermissionProfile permissionProfile, AccountsApi.CreatePermissionProfileOptions options) throws ApiException {
    ApiResponse<PermissionProfile> localVarResponse = createPermissionProfileWithHttpInfo(accountId, permissionProfile, options);
    return localVarResponse.getData();
  }

  /**
   * Creates a new permission profile in the specified account.
   * This method creates a new permission profile for an account.  ### Related topics  - [How to create a permission profile](/docs/esign-rest-api/how-to/permission-profile-creating/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfile  (optional)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionProfile > createPermissionProfileWithHttpInfo(String accountId, PermissionProfile permissionProfile, AccountsApi.CreatePermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = permissionProfile;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<PermissionProfile> localVarReturnType = new GenericType<PermissionProfile>() {};
    PermissionProfile localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PermissionProfile>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the specified account..
   * This closes the specified account. You must be an account admin to close your account. Once closed, an account must be reopened by DocuSign.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(String accountId) throws ApiException {
    deleteWithHttpInfo(accountId);
  }

  /**
   * Deletes the specified account.
   * This closes the specified account. You must be an account admin to close your account. Once closed, an account must be reopened by DocuSign.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}"
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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Close the specified signature by Id..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAccountSignature(String accountId, String signatureId) throws ApiException {
    deleteAccountSignatureWithHttpInfo(accountId, signatureId);
  }

  /**
   * Close the specified signature by Id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteAccountSignatureWithHttpInfo(String accountId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteAccountSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

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
   * Deletes a signature, initials, or stamps image..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature deleteAccountSignatureImage(String accountId, String signatureId, String imageType) throws ApiException {
    ApiResponse<AccountSignature> localVarResponse = deleteAccountSignatureImageWithHttpInfo(accountId, signatureId, imageType);
    return localVarResponse.getData();
  }

  /**
   * Deletes a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignature > deleteAccountSignatureImageWithHttpInfo(String accountId, String signatureId, String imageType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteAccountSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling deleteAccountSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

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
    
    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    AccountSignature localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Removes a brand..
   * This method deletes a brand from an account.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBrand(String accountId, String brandId) throws ApiException {
    deleteBrandWithHttpInfo(accountId, brandId);
  }

  /**
   * Removes a brand.
   * This method deletes a brand from an account.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteBrandWithHttpInfo(String accountId, String brandId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrand");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling deleteBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

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
   * Delete one branding logo..
   * This method deletes a single logo from an account brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param logoType One of **Primary**, **Secondary** or **Email**. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBrandLogoByType(String accountId, String brandId, String logoType) throws ApiException {
    deleteBrandLogoByTypeWithHttpInfo(accountId, brandId, logoType);
  }

  /**
   * Delete one branding logo.
   * This method deletes a single logo from an account brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param logoType One of **Primary**, **Secondary** or **Email**. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteBrandLogoByTypeWithHttpInfo(String accountId, String brandId, String logoType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrandLogoByType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling deleteBrandLogoByType");
    }
    
    // verify the required parameter 'logoType' is set
    if (logoType == null) {
      throw new ApiException(400, "Missing the required parameter 'logoType' when calling deleteBrandLogoByType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/logos/{logoType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "logoType" + "\\}", apiClient.escapeString(logoType.toString()));

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
   * Deletes one or more brand profiles..
   * Deletes one or more brand profiles from an account. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;) must be set to **true** to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandsRequest  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse deleteBrands(String accountId, BrandsRequest brandsRequest) throws ApiException {
    ApiResponse<BrandsResponse> localVarResponse = deleteBrandsWithHttpInfo(accountId, brandsRequest);
    return localVarResponse.getData();
  }

  /**
   * Deletes one or more brand profiles.
   * Deletes one or more brand profiles from an account. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;) must be set to **true** to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandsRequest  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BrandsResponse > deleteBrandsWithHttpInfo(String accountId, BrandsRequest brandsRequest) throws ApiException {
    Object localVarPostBody = brandsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands"
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
    
    GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
    BrandsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BrandsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the signature for one or more captive recipient records..
   * Deletes the signature for one or more captive recipient records; it is primarily used for testing. This provides a way to reset the signature associated with a client user ID so that a new signature can be created the next time the client user ID is used.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param recipientPart  (required)
   * @param captiveRecipientInformation  (optional)
   * @return CaptiveRecipientInformation
   * @throws ApiException if fails to make API call
   */
  public CaptiveRecipientInformation deleteCaptiveRecipient(String accountId, String recipientPart, CaptiveRecipientInformation captiveRecipientInformation) throws ApiException {
    ApiResponse<CaptiveRecipientInformation> localVarResponse = deleteCaptiveRecipientWithHttpInfo(accountId, recipientPart, captiveRecipientInformation);
    return localVarResponse.getData();
  }

  /**
   * Deletes the signature for one or more captive recipient records.
   * Deletes the signature for one or more captive recipient records; it is primarily used for testing. This provides a way to reset the signature associated with a client user ID so that a new signature can be created the next time the client user ID is used.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param recipientPart  (required)
   * @param captiveRecipientInformation  (optional)
   * @return CaptiveRecipientInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CaptiveRecipientInformation > deleteCaptiveRecipientWithHttpInfo(String accountId, String recipientPart, CaptiveRecipientInformation captiveRecipientInformation) throws ApiException {
    Object localVarPostBody = captiveRecipientInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCaptiveRecipient");
    }
    
    // verify the required parameter 'recipientPart' is set
    if (recipientPart == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientPart' when calling deleteCaptiveRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/captive_recipients/{recipientPart}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "recipientPart" + "\\}", apiClient.escapeString(recipientPart.toString()));

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
    
    GenericType<CaptiveRecipientInformation> localVarReturnType = new GenericType<CaptiveRecipientInformation>() {};
    CaptiveRecipientInformation localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CaptiveRecipientInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Delete an existing account custom field. This method deletes an existing account custom field.
  /// </summary>

 /**
  * DeleteCustomFieldOptions Class.
  *
  **/
  public class DeleteCustomFieldOptions
  {
  private String applyToTemplates = null;
  
 /**
  * setApplyToTemplates method.
  */
  public void setApplyToTemplates(String applyToTemplates) {
    this.applyToTemplates = applyToTemplates;
  }

 /**
  * getApplyToTemplates method.
  *
  * @return String
  */
  public String getApplyToTemplates() {
    return this.applyToTemplates;
  }
  }

   /**
   * Delete an existing account custom field..
   * This method deletes an existing account custom field.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @return void
   */ 
  public void deleteCustomField(String accountId, String customFieldId) throws ApiException {
    deleteCustomField(accountId, customFieldId, null);
  }

  /**
   * Delete an existing account custom field..
   * This method deletes an existing account custom field.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomField(String accountId, String customFieldId, AccountsApi.DeleteCustomFieldOptions options) throws ApiException {
    deleteCustomFieldWithHttpInfo(accountId, customFieldId, options);
  }

  /**
   * Delete an existing account custom field.
   * This method deletes an existing account custom field.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteCustomFieldWithHttpInfo(String accountId, String customFieldId, AccountsApi.DeleteCustomFieldOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomField");
    }
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling deleteCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("apply_to_templates", options.applyToTemplates));
    }

    

    

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
   * Deletes configuration information for the eNote eOriginal integration..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteENoteConfiguration(String accountId) throws ApiException {
    deleteENoteConfigurationWithHttpInfo(accountId);
  }

  /**
   * Deletes configuration information for the eNote eOriginal integration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteENoteConfigurationWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteENoteConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/enote_configuration"
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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Deletes a permissions profile within the specified account. This method deletes a permission profile from an account.  To delete a permission profile, it must not have any users associated with it. When you use this method to delete a permission profile, you can reassign the users associated with it to a new permission profile at the same time by using the &#x60;move_users_to&#x60; query parameter.   ### Related topics  - [How to delete a permission profile](/docs/esign-rest-api/how-to/permission-profile-deleting/)
  /// </summary>

 /**
  * DeletePermissionProfileOptions Class.
  *
  **/
  public class DeletePermissionProfileOptions
  {
  private String moveUsersTo = null;
  
 /**
  * setMoveUsersTo method.
  */
  public void setMoveUsersTo(String moveUsersTo) {
    this.moveUsersTo = moveUsersTo;
  }

 /**
  * getMoveUsersTo method.
  *
  * @return String
  */
  public String getMoveUsersTo() {
    return this.moveUsersTo;
  }
  }

   /**
   * Deletes a permissions profile within the specified account..
   * This method deletes a permission profile from an account.  To delete a permission profile, it must not have any users associated with it. When you use this method to delete a permission profile, you can reassign the users associated with it to a new permission profile at the same time by using the &#x60;move_users_to&#x60; query parameter.   ### Related topics  - [How to delete a permission profile](/docs/esign-rest-api/how-to/permission-profile-deleting/)
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @return void
   */ 
  public void deletePermissionProfile(String accountId, String permissionProfileId) throws ApiException {
    deletePermissionProfile(accountId, permissionProfileId, null);
  }

  /**
   * Deletes a permissions profile within the specified account..
   * This method deletes a permission profile from an account.  To delete a permission profile, it must not have any users associated with it. When you use this method to delete a permission profile, you can reassign the users associated with it to a new permission profile at the same time by using the &#x60;move_users_to&#x60; query parameter.   ### Related topics  - [How to delete a permission profile](/docs/esign-rest-api/how-to/permission-profile-deleting/)
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void deletePermissionProfile(String accountId, String permissionProfileId, AccountsApi.DeletePermissionProfileOptions options) throws ApiException {
    deletePermissionProfileWithHttpInfo(accountId, permissionProfileId, options);
  }

  /**
   * Deletes a permissions profile within the specified account.
   * This method deletes a permission profile from an account.  To delete a permission profile, it must not have any users associated with it. When you use this method to delete a permission profile, you can reassign the users associated with it to a new permission profile at the same time by using the &#x60;move_users_to&#x60; query parameter.   ### Related topics  - [How to delete a permission profile](/docs/esign-rest-api/how-to/permission-profile-deleting/)
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deletePermissionProfileWithHttpInfo(String accountId, String permissionProfileId, AccountsApi.DeletePermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePermissionProfile");
    }
    
    // verify the required parameter 'permissionProfileId' is set
    if (permissionProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionProfileId' when calling deletePermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles/{permissionProfileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "permissionProfileId" + "\\}", apiClient.escapeString(permissionProfileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("move_users_to", options.moveUsersTo));
    }

    

    

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
   * Get the list of identity verification options for an account.
   * This method returns a list of Identity Verification workflows that are available to an account.  **Note:** To use this method, you must either be an account administrator or a sender.  ### Related topics  - [How to require ID Verification (IDV) for a recipient](/docs/esign-rest-api/how-to/id-verification/)  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountIdentityVerificationResponse
   * @throws ApiException if fails to make API call
   */
  public AccountIdentityVerificationResponse getAccountIdentityVerification(String accountId) throws ApiException {
    ApiResponse<AccountIdentityVerificationResponse> localVarResponse = getAccountIdentityVerificationWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Get the list of identity verification options for an account
   * This method returns a list of Identity Verification workflows that are available to an account.  **Note:** To use this method, you must either be an account administrator or a sender.  ### Related topics  - [How to require ID Verification (IDV) for a recipient](/docs/esign-rest-api/how-to/id-verification/)  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountIdentityVerificationResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountIdentityVerificationResponse > getAccountIdentityVerificationWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountIdentityVerification");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/identity_verification"
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
    
    GenericType<AccountIdentityVerificationResponse> localVarReturnType = new GenericType<AccountIdentityVerificationResponse>() {};
    AccountIdentityVerificationResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountIdentityVerificationResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieves the account information for the specified account. Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
  /// </summary>

 /**
  * GetAccountInformationOptions Class.
  *
  **/
  public class GetAccountInformationOptions
  {
  private String includeAccountSettings = null;
  
 /**
  * setIncludeAccountSettings method.
  */
  public void setIncludeAccountSettings(String includeAccountSettings) {
    this.includeAccountSettings = includeAccountSettings;
  }

 /**
  * getIncludeAccountSettings method.
  *
  * @return String
  */
  public String getIncludeAccountSettings() {
    return this.includeAccountSettings;
  }
  }

   /**
   * Retrieves the account information for the specified account..
   * Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountInformation
   */ 
  public AccountInformation getAccountInformation(String accountId) throws ApiException {
    return getAccountInformation(accountId, null);
  }

  /**
   * Retrieves the account information for the specified account..
   * Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountInformation
   * @throws ApiException if fails to make API call
   */
  public AccountInformation getAccountInformation(String accountId, AccountsApi.GetAccountInformationOptions options) throws ApiException {
    ApiResponse<AccountInformation> localVarResponse = getAccountInformationWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the account information for the specified account.
   * Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountInformation > getAccountInformationWithHttpInfo(String accountId, AccountsApi.GetAccountInformationOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_account_settings", options.includeAccountSettings));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountInformation> localVarReturnType = new GenericType<AccountInformation>() {};
    AccountInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns information about a single signature by specifed signatureId..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature getAccountSignature(String accountId, String signatureId) throws ApiException {
    ApiResponse<AccountSignature> localVarResponse = getAccountSignatureWithHttpInfo(accountId, signatureId);
    return localVarResponse.getData();
  }

  /**
   * Returns information about a single signature by specifed signatureId.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignature > getAccountSignatureWithHttpInfo(String accountId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getAccountSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

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
    
    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    AccountSignature localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns a signature, initials, or stamps image. 
  /// </summary>

 /**
  * GetAccountSignatureImageOptions Class.
  *
  **/
  public class GetAccountSignatureImageOptions
  {
  private String includeChrome = null;
  
 /**
  * setIncludeChrome method.
  */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

 /**
  * getIncludeChrome method.
  *
  * @return String
  */
  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Returns a signature, initials, or stamps image..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return byte[]
   */ 
  public byte[] getAccountSignatureImage(String accountId, String signatureId, String imageType) throws ApiException {
    return getAccountSignatureImage(accountId, signatureId, imageType, null);
  }

  /**
   * Returns a signature, initials, or stamps image..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getAccountSignatureImage(String accountId, String signatureId, String imageType, AccountsApi.GetAccountSignatureImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getAccountSignatureImageWithHttpInfo(accountId, signatureId, imageType, options);
    return localVarResponse.getData();
  }

  /**
   * Returns a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getAccountSignatureImageWithHttpInfo(String accountId, String signatureId, String imageType, AccountsApi.GetAccountSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getAccountSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling getAccountSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_chrome", options.includeChrome));
    }

    

    

    final String[] localVarAccepts = {
      "image/gif"
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
  /// <summary>
  /// Returns the managed signature definitions for the account 
  /// </summary>

 /**
  * GetAccountSignaturesOptions Class.
  *
  **/
  public class GetAccountSignaturesOptions
  {
  private String stampFormat = null;
  private String stampName = null;
  private String stampType = null;
  
 /**
  * setStampFormat method.
  */
  public void setStampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
  }

 /**
  * getStampFormat method.
  *
  * @return String
  */
  public String getStampFormat() {
    return this.stampFormat;
  }
  
 /**
  * setStampName method.
  */
  public void setStampName(String stampName) {
    this.stampName = stampName;
  }

 /**
  * getStampName method.
  *
  * @return String
  */
  public String getStampName() {
    return this.stampName;
  }
  
 /**
  * setStampType method.
  */
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }

 /**
  * getStampType method.
  *
  * @return String
  */
  public String getStampType() {
    return this.stampType;
  }
  }

   /**
   * Returns the managed signature definitions for the account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSignaturesInformation
   */ 
  public AccountSignaturesInformation getAccountSignatures(String accountId) throws ApiException {
    return getAccountSignatures(accountId, null);
  }

  /**
   * Returns the managed signature definitions for the account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSignaturesInformation getAccountSignatures(String accountId, AccountsApi.GetAccountSignaturesOptions options) throws ApiException {
    ApiResponse<AccountSignaturesInformation> localVarResponse = getAccountSignaturesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns the managed signature definitions for the account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignaturesInformation > getAccountSignaturesWithHttpInfo(String accountId, AccountsApi.GetAccountSignaturesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_format", options.stampFormat));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_name", options.stampName));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_type", options.stampType));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountSignaturesInformation> localVarReturnType = new GenericType<AccountSignaturesInformation>() {};
    AccountSignaturesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignaturesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns tab settings list for specified account.
   * This method returns information about the tab types and tab functionality that is currently enabled for an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return TabAccountSettings
   * @throws ApiException if fails to make API call
   */
  public TabAccountSettings getAccountTabSettings(String accountId) throws ApiException {
    ApiResponse<TabAccountSettings> localVarResponse = getAccountTabSettingsWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Returns tab settings list for specified account
   * This method returns information about the tab types and tab functionality that is currently enabled for an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return TabAccountSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TabAccountSettings > getAccountTabSettingsWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountTabSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/tabs"
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
    
    GenericType<TabAccountSettings> localVarReturnType = new GenericType<TabAccountSettings>() {};
    TabAccountSettings localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TabAccountSettings>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get all payment gateway account for the provided accountId.
   * This method returns a list of payment gateway accounts and basic information about them.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PaymentGatewayAccountsInfo
   * @throws ApiException if fails to make API call
   */
  public PaymentGatewayAccountsInfo getAllPaymentGatewayAccounts(String accountId) throws ApiException {
    ApiResponse<PaymentGatewayAccountsInfo> localVarResponse = getAllPaymentGatewayAccountsWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Get all payment gateway account for the provided accountId
   * This method returns a list of payment gateway accounts and basic information about them.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PaymentGatewayAccountsInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PaymentGatewayAccountsInfo > getAllPaymentGatewayAccountsWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAllPaymentGatewayAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/payment_gateway_accounts"
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
    
    GenericType<PaymentGatewayAccountsInfo> localVarReturnType = new GenericType<PaymentGatewayAccountsInfo>() {};
    PaymentGatewayAccountsInfo localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PaymentGatewayAccountsInfo>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets list of recurring and usage charges for the account. Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
  /// </summary>

 /**
  * GetBillingChargesOptions Class.
  *
  **/
  public class GetBillingChargesOptions
  {
  private String includeCharges = null;
  
 /**
  * setIncludeCharges method.
  */
  public void setIncludeCharges(String includeCharges) {
    this.includeCharges = includeCharges;
  }

 /**
  * getIncludeCharges method.
  *
  * @return String
  */
  public String getIncludeCharges() {
    return this.includeCharges;
  }
  }

   /**
   * Gets list of recurring and usage charges for the account..
   * Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BillingChargeResponse
   */ 
  public BillingChargeResponse getBillingCharges(String accountId) throws ApiException {
    return getBillingCharges(accountId, null);
  }

  /**
   * Gets list of recurring and usage charges for the account..
   * Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BillingChargeResponse
   * @throws ApiException if fails to make API call
   */
  public BillingChargeResponse getBillingCharges(String accountId, AccountsApi.GetBillingChargesOptions options) throws ApiException {
    ApiResponse<BillingChargeResponse> localVarResponse = getBillingChargesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets list of recurring and usage charges for the account.
   * Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BillingChargeResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BillingChargeResponse > getBillingChargesWithHttpInfo(String accountId, AccountsApi.GetBillingChargesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBillingCharges");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_charges"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_charges", options.includeCharges));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<BillingChargeResponse> localVarReturnType = new GenericType<BillingChargeResponse>() {};
    BillingChargeResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BillingChargeResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get information for a specific brand. This method returns details about an account brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
  /// </summary>

 /**
  * GetBrandOptions Class.
  *
  **/
  public class GetBrandOptions
  {
  private String includeExternalReferences = null;
  private String includeLogos = null;
  
 /**
  * setIncludeExternalReferences method.
  */
  public void setIncludeExternalReferences(String includeExternalReferences) {
    this.includeExternalReferences = includeExternalReferences;
  }

 /**
  * getIncludeExternalReferences method.
  *
  * @return String
  */
  public String getIncludeExternalReferences() {
    return this.includeExternalReferences;
  }
  
 /**
  * setIncludeLogos method.
  */
  public void setIncludeLogos(String includeLogos) {
    this.includeLogos = includeLogos;
  }

 /**
  * getIncludeLogos method.
  *
  * @return String
  */
  public String getIncludeLogos() {
    return this.includeLogos;
  }
  }

   /**
   * Get information for a specific brand..
   * This method returns details about an account brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @return Brand
   */ 
  public Brand getBrand(String accountId, String brandId) throws ApiException {
    return getBrand(accountId, brandId, null);
  }

  /**
   * Get information for a specific brand..
   * This method returns details about an account brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param options for modifying the method behavior.
   * @return Brand
   * @throws ApiException if fails to make API call
   */
  public Brand getBrand(String accountId, String brandId, AccountsApi.GetBrandOptions options) throws ApiException {
    ApiResponse<Brand> localVarResponse = getBrandWithHttpInfo(accountId, brandId, options);
    return localVarResponse.getData();
  }

  /**
   * Get information for a specific brand.
   * This method returns details about an account brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param options for modifying the method behavior.
   * @return Brand
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Brand > getBrandWithHttpInfo(String accountId, String brandId, AccountsApi.GetBrandOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrand");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_external_references", options.includeExternalReferences));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_logos", options.includeLogos));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Brand> localVarReturnType = new GenericType<Brand>() {};
    Brand localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Brand>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Export a specific brand..
   * This method exports information about a brand to an XML file.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @throws ApiException if fails to make API call
   */
  public void getBrandExportFile(String accountId, String brandId) throws ApiException {
    getBrandExportFileWithHttpInfo(accountId, brandId);
  }

  /**
   * Export a specific brand.
   * This method exports information about a brand to an XML file.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getBrandExportFileWithHttpInfo(String accountId, String brandId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandExportFile");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandExportFile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/file"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

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
   * Obtains the specified image for a brand..
   * This method returns a specific logo that is used in a brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param logoType One of **Primary**, **Secondary** or **Email**. (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getBrandLogoByType(String accountId, String brandId, String logoType) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getBrandLogoByTypeWithHttpInfo(accountId, brandId, logoType);
    return localVarResponse.getData();
  }

  /**
   * Obtains the specified image for a brand.
   * This method returns a specific logo that is used in a brand.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param logoType One of **Primary**, **Secondary** or **Email**. (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getBrandLogoByTypeWithHttpInfo(String accountId, String brandId, String logoType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandLogoByType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandLogoByType");
    }
    
    // verify the required parameter 'logoType' is set
    if (logoType == null) {
      throw new ApiException(400, "Missing the required parameter 'logoType' when calling getBrandLogoByType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/logos/{logoType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "logoType" + "\\}", apiClient.escapeString(logoType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "image/png"
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
   * Returns the specified account&#39;s list of branding resources (metadata)..
   * This method returns metadata about the branding resources that are associated with an account.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @return BrandResourcesList
   * @throws ApiException if fails to make API call
   */
  public BrandResourcesList getBrandResources(String accountId, String brandId) throws ApiException {
    ApiResponse<BrandResourcesList> localVarResponse = getBrandResourcesWithHttpInfo(accountId, brandId);
    return localVarResponse.getData();
  }

  /**
   * Returns the specified account&#39;s list of branding resources (metadata).
   * This method returns metadata about the branding resources that are associated with an account.  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @return BrandResourcesList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BrandResourcesList > getBrandResourcesWithHttpInfo(String accountId, String brandId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandResources");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandResources");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/resources"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

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
    
    GenericType<BrandResourcesList> localVarReturnType = new GenericType<BrandResourcesList>() {};
    BrandResourcesList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BrandResourcesList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns the specified branding resource file. This method returns a specific branding resource file.  A brand uses a set of brand resource files to control the sending, signing, email message, and captive (embedded) signing experiences.  You can modify the default email messages and formats in these files and upload them to your brand to customize the user experience.  **Important:** When you upload a modified resource file, only the elements that differ from the master resource file are saved as your resource file. Similarly, when you download your resource files, only the modified elements are included in the file.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
  /// </summary>

 /**
  * GetBrandResourcesByContentTypeOptions Class.
  *
  **/
  public class GetBrandResourcesByContentTypeOptions
  {
  private String langcode = null;
  private String returnMaster = null;
  
 /**
  * setLangcode method.
  */
  public void setLangcode(String langcode) {
    this.langcode = langcode;
  }

 /**
  * getLangcode method.
  *
  * @return String
  */
  public String getLangcode() {
    return this.langcode;
  }
  
 /**
  * setReturnMaster method.
  */
  public void setReturnMaster(String returnMaster) {
    this.returnMaster = returnMaster;
  }

 /**
  * getReturnMaster method.
  *
  * @return String
  */
  public String getReturnMaster() {
    return this.returnMaster;
  }
  }

   /**
   * Returns the specified branding resource file..
   * This method returns a specific branding resource file.  A brand uses a set of brand resource files to control the sending, signing, email message, and captive (embedded) signing experiences.  You can modify the default email messages and formats in these files and upload them to your brand to customize the user experience.  **Important:** When you upload a modified resource file, only the elements that differ from the master resource file are saved as your resource file. Similarly, when you download your resource files, only the modified elements are included in the file.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param resourceContentType  (required)
   * @return void
   */ 
  public void getBrandResourcesByContentType(String accountId, String brandId, String resourceContentType) throws ApiException {
    getBrandResourcesByContentType(accountId, brandId, resourceContentType, null);
  }

  /**
   * Returns the specified branding resource file..
   * This method returns a specific branding resource file.  A brand uses a set of brand resource files to control the sending, signing, email message, and captive (embedded) signing experiences.  You can modify the default email messages and formats in these files and upload them to your brand to customize the user experience.  **Important:** When you upload a modified resource file, only the elements that differ from the master resource file are saved as your resource file. Similarly, when you download your resource files, only the modified elements are included in the file.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param resourceContentType  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void getBrandResourcesByContentType(String accountId, String brandId, String resourceContentType, AccountsApi.GetBrandResourcesByContentTypeOptions options) throws ApiException {
    getBrandResourcesByContentTypeWithHttpInfo(accountId, brandId, resourceContentType, options);
  }

  /**
   * Returns the specified branding resource file.
   * This method returns a specific branding resource file.  A brand uses a set of brand resource files to control the sending, signing, email message, and captive (embedded) signing experiences.  You can modify the default email messages and formats in these files and upload them to your brand to customize the user experience.  **Important:** When you upload a modified resource file, only the elements that differ from the master resource file are saved as your resource file. Similarly, when you download your resource files, only the modified elements are included in the file.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param resourceContentType  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getBrandResourcesByContentTypeWithHttpInfo(String accountId, String brandId, String resourceContentType, AccountsApi.GetBrandResourcesByContentTypeOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandResourcesByContentType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandResourcesByContentType");
    }
    
    // verify the required parameter 'resourceContentType' is set
    if (resourceContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceContentType' when calling getBrandResourcesByContentType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/resources/{resourceContentType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "resourceContentType" + "\\}", apiClient.escapeString(resourceContentType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langcode", options.langcode));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("return_master", options.returnMaster));
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

  /**
   * Gets the Electronic Record and Signature Disclosure..
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, for the requested envelope recipient. This might be different than the current account disclosure depending on account settings, such as branding, and when the account disclosure was last updated. An optional query string can be included to return the language for the disclosure.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String langCode) throws ApiException {
    ApiResponse<ConsumerDisclosure> localVarResponse = getConsumerDisclosureWithHttpInfo(accountId, langCode);
    return localVarResponse.getData();
  }

  /**
   * Gets the Electronic Record and Signature Disclosure.
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, for the requested envelope recipient. This might be different than the current account disclosure depending on account settings, such as branding, and when the account disclosure was last updated. An optional query string can be included to return the language for the disclosure.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumerDisclosure > getConsumerDisclosureWithHttpInfo(String accountId, String langCode) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'langCode' is set
    if (langCode == null) {
      throw new ApiException(400, "Missing the required parameter 'langCode' when calling getConsumerDisclosure");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/consumer_disclosure/{langCode}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

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
    
    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    ConsumerDisclosure localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ConsumerDisclosure>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the Electronic Record and Signature Disclosure for the account. Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
  /// </summary>

 /**
  * GetConsumerDisclosureDefaultOptions Class.
  *
  **/
  public class GetConsumerDisclosureDefaultOptions
  {
  private String langCode = null;
  
 /**
  * setLangCode method.
  */
  public void setLangCode(String langCode) {
    this.langCode = langCode;
  }

 /**
  * getLangCode method.
  *
  * @return String
  */
  public String getLangCode() {
    return this.langCode;
  }
  }

   /**
   * Gets the Electronic Record and Signature Disclosure for the account..
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId) throws ApiException {
    return getConsumerDisclosureDefault(accountId, null);
  }

  /**
   * Gets the Electronic Record and Signature Disclosure for the account..
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, AccountsApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
    ApiResponse<ConsumerDisclosure> localVarResponse = getConsumerDisclosureDefaultWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the Electronic Record and Signature Disclosure for the account.
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumerDisclosure > getConsumerDisclosureDefaultWithHttpInfo(String accountId, AccountsApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosureDefault");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/consumer_disclosure"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langCode", options.langCode));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    ConsumerDisclosure localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ConsumerDisclosure>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the configuration information for the eNote eOriginal integration..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return ENoteConfiguration
   * @throws ApiException if fails to make API call
   */
  public ENoteConfiguration getENoteConfiguration(String accountId) throws ApiException {
    ApiResponse<ENoteConfiguration> localVarResponse = getENoteConfigurationWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Returns the configuration information for the eNote eOriginal integration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return ENoteConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ENoteConfiguration > getENoteConfigurationWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getENoteConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/enote_configuration"
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
    
    GenericType<ENoteConfiguration> localVarReturnType = new GenericType<ENoteConfiguration>() {};
    ENoteConfiguration localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ENoteConfiguration>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Select envelope purge configuration..
   * An envelope purge configuration enables account administrators to permanently remove documents and their field data from completed and voided envelopes after a specified retention period (&#x60;retentionDays&#x60;). This method retrieves the current envelope purge configuration for your account.  **Note:** To use this method, you must be an account administrator.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public EnvelopePurgeConfiguration getEnvelopePurgeConfiguration(String accountId) throws ApiException {
    ApiResponse<EnvelopePurgeConfiguration> localVarResponse = getEnvelopePurgeConfigurationWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Select envelope purge configuration.
   * An envelope purge configuration enables account administrators to permanently remove documents and their field data from completed and voided envelopes after a specified retention period (&#x60;retentionDays&#x60;). This method retrieves the current envelope purge configuration for your account.  **Note:** To use this method, you must be an account administrator.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopePurgeConfiguration > getEnvelopePurgeConfigurationWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopePurgeConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/envelope_purge_configuration"
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
    
    GenericType<EnvelopePurgeConfiguration> localVarReturnType = new GenericType<EnvelopePurgeConfiguration>() {};
    EnvelopePurgeConfiguration localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopePurgeConfiguration>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Retrieves the list of favorited templates for this caller.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public FavoriteTemplatesInfo getFavoriteTemplates(String accountId) throws ApiException {
    ApiResponse<FavoriteTemplatesInfo> localVarResponse = getFavoriteTemplatesWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of favorited templates for this caller
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FavoriteTemplatesInfo > getFavoriteTemplatesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFavoriteTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/favorite_templates"
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
    
    GenericType<FavoriteTemplatesInfo> localVarReturnType = new GenericType<FavoriteTemplatesInfo>() {};
    FavoriteTemplatesInfo localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FavoriteTemplatesInfo>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns default user level settings for a specified account.
   * This method returns the default settings for the email notifications that signers and senders receive about envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return NotificationDefaults
   * @throws ApiException if fails to make API call
   */
  public NotificationDefaults getNotificationDefaults(String accountId) throws ApiException {
    ApiResponse<NotificationDefaults> localVarResponse = getNotificationDefaultsWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Returns default user level settings for a specified account
   * This method returns the default settings for the email notifications that signers and senders receive about envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return NotificationDefaults
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotificationDefaults > getNotificationDefaultsWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/notification_defaults"
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
    
    GenericType<NotificationDefaults> localVarReturnType = new GenericType<NotificationDefaults>() {};
    NotificationDefaults localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotificationDefaults>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get the password rules.
   * This method retrieves the password rules for an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountPasswordRules
   * @throws ApiException if fails to make API call
   */
  public AccountPasswordRules getPasswordRules(String accountId) throws ApiException {
    ApiResponse<AccountPasswordRules> localVarResponse = getPasswordRulesWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Get the password rules
   * This method retrieves the password rules for an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountPasswordRules
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountPasswordRules > getPasswordRulesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPasswordRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/password_rules"
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
    
    GenericType<AccountPasswordRules> localVarReturnType = new GenericType<AccountPasswordRules>() {};
    AccountPasswordRules localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountPasswordRules>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get membership account password rules.
   * 
   * @return UserPasswordRules
   * @throws ApiException if fails to make API call
   */
  public UserPasswordRules getPasswordRules_0() throws ApiException {
    ApiResponse<UserPasswordRules> localVarResponse = getPasswordRules_0WithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Get membership account password rules
   * 
   * @return UserPasswordRules
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPasswordRules > getPasswordRules_0WithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/password_rules";

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
    
    GenericType<UserPasswordRules> localVarReturnType = new GenericType<UserPasswordRules>() {};
    UserPasswordRules localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserPasswordRules>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns a permissions profile in the specified account. This method returns information about a specific permission profile that is associated with an account.  ### Related topics  - [How to set a permission profile](/docs/esign-rest-api/how-to/permission-profile-setting/) 
  /// </summary>

 /**
  * GetPermissionProfileOptions Class.
  *
  **/
  public class GetPermissionProfileOptions
  {
  private String include = null;
  
 /**
  * setInclude method.
  */
  public void setInclude(String include) {
    this.include = include;
  }

 /**
  * getInclude method.
  *
  * @return String
  */
  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Returns a permissions profile in the specified account..
   * This method returns information about a specific permission profile that is associated with an account.  ### Related topics  - [How to set a permission profile](/docs/esign-rest-api/how-to/permission-profile-setting/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @return PermissionProfile
   */ 
  public PermissionProfile getPermissionProfile(String accountId, String permissionProfileId) throws ApiException {
    return getPermissionProfile(accountId, permissionProfileId, null);
  }

  /**
   * Returns a permissions profile in the specified account..
   * This method returns information about a specific permission profile that is associated with an account.  ### Related topics  - [How to set a permission profile](/docs/esign-rest-api/how-to/permission-profile-setting/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public PermissionProfile getPermissionProfile(String accountId, String permissionProfileId, AccountsApi.GetPermissionProfileOptions options) throws ApiException {
    ApiResponse<PermissionProfile> localVarResponse = getPermissionProfileWithHttpInfo(accountId, permissionProfileId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns a permissions profile in the specified account.
   * This method returns information about a specific permission profile that is associated with an account.  ### Related topics  - [How to set a permission profile](/docs/esign-rest-api/how-to/permission-profile-setting/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionProfile > getPermissionProfileWithHttpInfo(String accountId, String permissionProfileId, AccountsApi.GetPermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPermissionProfile");
    }
    
    // verify the required parameter 'permissionProfileId' is set
    if (permissionProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionProfileId' when calling getPermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles/{permissionProfileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "permissionProfileId" + "\\}", apiClient.escapeString(permissionProfileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<PermissionProfile> localVarReturnType = new GenericType<PermissionProfile>() {};
    PermissionProfile localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PermissionProfile>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Retrieves the account provisioning information for the account..
   * Retrieves the account provisioning information for the account.
   * @return ProvisioningInformation
   * @throws ApiException if fails to make API call
   */
  public ProvisioningInformation getProvisioning() throws ApiException {
    ApiResponse<ProvisioningInformation> localVarResponse = getProvisioningWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the account provisioning information for the account.
   * Retrieves the account provisioning information for the account.
   * @return ProvisioningInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ProvisioningInformation > getProvisioningWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/provisioning";

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
    
    GenericType<ProvisioningInformation> localVarReturnType = new GenericType<ProvisioningInformation>() {};
    ProvisioningInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ProvisioningInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets list of supported languages for recipient language setting..
   * Retrieves a list of supported languages that you can set for an individual recipient when creating an envelope, as well as their simple type enumeration values. These are the languages that you can set for the standard email format and signing view for each recipient.  For example, in the recipient&#39;s email notification, this setting affects elements such as the standard introductory text describing the request to sign. It also determines the language used for buttons and tabs in both the email notification and the signing experience.  **Note:** Setting a language for a recipient affects only the DocuSign standard text. Any custom text that you enter for the &#x60;emailBody&#x60; and &#x60;emailSubject&#x60; of the notification is not translated, and appears exactly as you enter it.  For more information, see [Set Recipient Language and Specify Custom Email Messages](https://support.docusign.com/en/guides/ndse-user-guide-recipient-language).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return SupportedLanguages
   * @throws ApiException if fails to make API call
   */
  public SupportedLanguages getSupportedLanguages(String accountId) throws ApiException {
    ApiResponse<SupportedLanguages> localVarResponse = getSupportedLanguagesWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Gets list of supported languages for recipient language setting.
   * Retrieves a list of supported languages that you can set for an individual recipient when creating an envelope, as well as their simple type enumeration values. These are the languages that you can set for the standard email format and signing view for each recipient.  For example, in the recipient&#39;s email notification, this setting affects elements such as the standard introductory text describing the request to sign. It also determines the language used for buttons and tabs in both the email notification and the signing experience.  **Note:** Setting a language for a recipient affects only the DocuSign standard text. Any custom text that you enter for the &#x60;emailBody&#x60; and &#x60;emailSubject&#x60; of the notification is not translated, and appears exactly as you enter it.  For more information, see [Set Recipient Language and Specify Custom Email Messages](https://support.docusign.com/en/guides/ndse-user-guide-recipient-language).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return SupportedLanguages
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SupportedLanguages > getSupportedLanguagesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSupportedLanguages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/supported_languages"
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
    
    GenericType<SupportedLanguages> localVarReturnType = new GenericType<SupportedLanguages>() {};
    SupportedLanguages localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<SupportedLanguages>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get watermark information..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public Watermark getWatermark(String accountId) throws ApiException {
    ApiResponse<Watermark> localVarResponse = getWatermarkWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Get watermark information.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Watermark > getWatermarkWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWatermark");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/watermark"
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
    
    GenericType<Watermark> localVarReturnType = new GenericType<Watermark>() {};
    Watermark localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Watermark>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get watermark preview..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param watermark  (optional)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public Watermark getWatermarkPreview(String accountId, Watermark watermark) throws ApiException {
    ApiResponse<Watermark> localVarResponse = getWatermarkPreviewWithHttpInfo(accountId, watermark);
    return localVarResponse.getData();
  }

  /**
   * Get watermark preview.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param watermark  (optional)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Watermark > getWatermarkPreviewWithHttpInfo(String accountId, Watermark watermark) throws ApiException {
    Object localVarPostBody = watermark;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWatermarkPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/watermark/preview"
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
    
    GenericType<Watermark> localVarReturnType = new GenericType<Watermark>() {};
    Watermark localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Watermark>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a list of brand profiles. Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
  /// </summary>

 /**
  * ListBrandsOptions Class.
  *
  **/
  public class ListBrandsOptions
  {
  private String excludeDistributorBrand = null;
  private String includeLogos = null;
  
 /**
  * setExcludeDistributorBrand method.
  */
  public void setExcludeDistributorBrand(String excludeDistributorBrand) {
    this.excludeDistributorBrand = excludeDistributorBrand;
  }

 /**
  * getExcludeDistributorBrand method.
  *
  * @return String
  */
  public String getExcludeDistributorBrand() {
    return this.excludeDistributorBrand;
  }
  
 /**
  * setIncludeLogos method.
  */
  public void setIncludeLogos(String includeLogos) {
    this.includeLogos = includeLogos;
  }

 /**
  * getIncludeLogos method.
  *
  * @return String
  */
  public String getIncludeLogos() {
    return this.includeLogos;
  }
  }

   /**
   * Gets a list of brand profiles..
   * Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BrandsResponse
   */ 
  public BrandsResponse listBrands(String accountId) throws ApiException {
    return listBrands(accountId, null);
  }

  /**
   * Gets a list of brand profiles..
   * Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse listBrands(String accountId, AccountsApi.ListBrandsOptions options) throws ApiException {
    ApiResponse<BrandsResponse> localVarResponse = listBrandsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of brand profiles.
   * Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BrandsResponse > listBrandsWithHttpInfo(String accountId, AccountsApi.ListBrandsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("exclude_distributor_brand", options.excludeDistributorBrand));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_logos", options.includeLogos));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
    BrandsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BrandsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets a list of custom fields associated with the account..
   * Retrieves a list of envelope custom fields associated with the account. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.  There are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. The list custom field lets the sender select the value of the field from a list you provide.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields listCustomFields(String accountId) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = listCustomFieldsWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of custom fields associated with the account.
   * Retrieves a list of envelope custom fields associated with the account. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.  There are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. The list custom field lets the sender select the value of the field from a list you provide.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > listCustomFieldsWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields"
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
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a list of permission profiles. Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
  /// </summary>

 /**
  * ListPermissionsOptions Class.
  *
  **/
  public class ListPermissionsOptions
  {
  private String include = null;
  
 /**
  * setInclude method.
  */
  public void setInclude(String include) {
    this.include = include;
  }

 /**
  * getInclude method.
  *
  * @return String
  */
  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Gets a list of permission profiles..
   * Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PermissionProfileInformation
   */ 
  public PermissionProfileInformation listPermissions(String accountId) throws ApiException {
    return listPermissions(accountId, null);
  }

  /**
   * Gets a list of permission profiles..
   * Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PermissionProfileInformation
   * @throws ApiException if fails to make API call
   */
  public PermissionProfileInformation listPermissions(String accountId, AccountsApi.ListPermissionsOptions options) throws ApiException {
    ApiResponse<PermissionProfileInformation> localVarResponse = listPermissionsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of permission profiles.
   * Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PermissionProfileInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionProfileInformation > listPermissionsWithHttpInfo(String accountId, AccountsApi.ListPermissionsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<PermissionProfileInformation> localVarReturnType = new GenericType<PermissionProfileInformation>() {};
    PermissionProfileInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PermissionProfileInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets recipient names associated with an email address. Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
  /// </summary>

 /**
  * ListRecipientNamesByEmailOptions Class.
  *
  **/
  public class ListRecipientNamesByEmailOptions
  {
  private String email = null;
  
 /**
  * setEmail method.
  */
  public void setEmail(String email) {
    this.email = email;
  }

 /**
  * getEmail method.
  *
  * @return String
  */
  public String getEmail() {
    return this.email;
  }
  }

   /**
   * Gets recipient names associated with an email address..
   * Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return RecipientNamesResponse
   */ 
  public RecipientNamesResponse listRecipientNamesByEmail(String accountId) throws ApiException {
    return listRecipientNamesByEmail(accountId, null);
  }

  /**
   * Gets recipient names associated with an email address..
   * Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return RecipientNamesResponse
   * @throws ApiException if fails to make API call
   */
  public RecipientNamesResponse listRecipientNamesByEmail(String accountId, AccountsApi.ListRecipientNamesByEmailOptions options) throws ApiException {
    ApiResponse<RecipientNamesResponse> localVarResponse = listRecipientNamesByEmailWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets recipient names associated with an email address.
   * Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return RecipientNamesResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecipientNamesResponse > listRecipientNamesByEmailWithHttpInfo(String accountId, AccountsApi.ListRecipientNamesByEmailOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipientNamesByEmail");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/recipient_names"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RecipientNamesResponse> localVarReturnType = new GenericType<RecipientNamesResponse>() {};
    RecipientNamesResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RecipientNamesResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets account settings information..
   * Retrieves the account settings information for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSettingsInformation listSettings(String accountId) throws ApiException {
    ApiResponse<AccountSettingsInformation> localVarResponse = listSettingsWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Gets account settings information.
   * Retrieves the account settings information for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSettingsInformation > listSettingsWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings"
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
    
    GenericType<AccountSettingsInformation> localVarReturnType = new GenericType<AccountSettingsInformation>() {};
    AccountSettingsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSettingsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Reserved: Gets the shared item status for one or more users. Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
  /// </summary>

 /**
  * ListSharedAccessOptions Class.
  *
  **/
  public class ListSharedAccessOptions
  {
  private String count = null;
  private String envelopesNotSharedUserStatus = null;
  private String folderIds = null;
  private String itemType = null;
  private String searchText = null;
  private String shared = null;
  private String startPosition = null;
  private String userIds = null;
  
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
  * setEnvelopesNotSharedUserStatus method.
  */
  public void setEnvelopesNotSharedUserStatus(String envelopesNotSharedUserStatus) {
    this.envelopesNotSharedUserStatus = envelopesNotSharedUserStatus;
  }

 /**
  * getEnvelopesNotSharedUserStatus method.
  *
  * @return String
  */
  public String getEnvelopesNotSharedUserStatus() {
    return this.envelopesNotSharedUserStatus;
  }
  
 /**
  * setFolderIds method.
  */
  public void setFolderIds(String folderIds) {
    this.folderIds = folderIds;
  }

 /**
  * getFolderIds method.
  *
  * @return String
  */
  public String getFolderIds() {
    return this.folderIds;
  }
  
 /**
  * setItemType method.
  */
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

 /**
  * getItemType method.
  *
  * @return String
  */
  public String getItemType() {
    return this.itemType;
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
  * setShared method.
  */
  public void setShared(String shared) {
    this.shared = shared;
  }

 /**
  * getShared method.
  *
  * @return String
  */
  public String getShared() {
    return this.shared;
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
  * setUserIds method.
  */
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

 /**
  * getUserIds method.
  *
  * @return String
  */
  public String getUserIds() {
    return this.userIds;
  }
  }

   /**
   * Reserved: Gets the shared item status for one or more users..
   * Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSharedAccess
   */ 
  public AccountSharedAccess listSharedAccess(String accountId) throws ApiException {
    return listSharedAccess(accountId, null);
  }

  /**
   * Reserved: Gets the shared item status for one or more users..
   * Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public AccountSharedAccess listSharedAccess(String accountId, AccountsApi.ListSharedAccessOptions options) throws ApiException {
    ApiResponse<AccountSharedAccess> localVarResponse = listSharedAccessWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Reserved: Gets the shared item status for one or more users.
   * Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSharedAccess > listSharedAccessWithHttpInfo(String accountId, AccountsApi.ListSharedAccessOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSharedAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/shared_access"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("envelopes_not_shared_user_status", options.envelopesNotSharedUserStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_ids", options.folderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("item_type", options.itemType));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared", options.shared));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_ids", options.userIds));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountSharedAccess> localVarReturnType = new GenericType<AccountSharedAccess>() {};
    AccountSharedAccess localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSharedAccess>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns Account available signature providers for specified account..
   * Returns a list of signature providers that the specified account can use.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSignatureProviders
   * @throws ApiException if fails to make API call
   */
  public AccountSignatureProviders listSignatureProviders(String accountId) throws ApiException {
    ApiResponse<AccountSignatureProviders> localVarResponse = listSignatureProvidersWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Returns Account available signature providers for specified account.
   * Returns a list of signature providers that the specified account can use.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSignatureProviders
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignatureProviders > listSignatureProvidersWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSignatureProviders");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatureProviders"
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
    
    GenericType<AccountSignatureProviders> localVarReturnType = new GenericType<AccountSignatureProviders>() {};
    AccountSignatureProviders localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignatureProviders>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets a list of unsupported file types..
   * Retrieves a list of file types (mime-types and file-extensions) that are not supported for upload through the DocuSign system.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FileTypeList
   * @throws ApiException if fails to make API call
   */
  public FileTypeList listUnsupportedFileTypes(String accountId) throws ApiException {
    ApiResponse<FileTypeList> localVarResponse = listUnsupportedFileTypesWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of unsupported file types.
   * Retrieves a list of file types (mime-types and file-extensions) that are not supported for upload through the DocuSign system.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FileTypeList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FileTypeList > listUnsupportedFileTypesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listUnsupportedFileTypes");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/unsupported_file_types"
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
    
    GenericType<FileTypeList> localVarReturnType = new GenericType<FileTypeList>() {};
    FileTypeList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FileTypeList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Unfavorite a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param favoriteTemplatesInfo  (optional)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public FavoriteTemplatesInfo unFavoriteTemplate(String accountId, FavoriteTemplatesInfo favoriteTemplatesInfo) throws ApiException {
    ApiResponse<FavoriteTemplatesInfo> localVarResponse = unFavoriteTemplateWithHttpInfo(accountId, favoriteTemplatesInfo);
    return localVarResponse.getData();
  }

  /**
   * Unfavorite a template
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param favoriteTemplatesInfo  (optional)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FavoriteTemplatesInfo > unFavoriteTemplateWithHttpInfo(String accountId, FavoriteTemplatesInfo favoriteTemplatesInfo) throws ApiException {
    Object localVarPostBody = favoriteTemplatesInfo;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling unFavoriteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/favorite_templates"
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
    
    GenericType<FavoriteTemplatesInfo> localVarReturnType = new GenericType<FavoriteTemplatesInfo>() {};
    FavoriteTemplatesInfo localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FavoriteTemplatesInfo>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates a account signature..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSignaturesInformation  (optional)
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSignaturesInformation updateAccountSignature(String accountId, AccountSignaturesInformation accountSignaturesInformation) throws ApiException {
    ApiResponse<AccountSignaturesInformation> localVarResponse = updateAccountSignatureWithHttpInfo(accountId, accountSignaturesInformation);
    return localVarResponse.getData();
  }

  /**
   * Updates a account signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSignaturesInformation  (optional)
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignaturesInformation > updateAccountSignatureWithHttpInfo(String accountId, AccountSignaturesInformation accountSignaturesInformation) throws ApiException {
    Object localVarPostBody = accountSignaturesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures"
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
    
    GenericType<AccountSignaturesInformation> localVarReturnType = new GenericType<AccountSignaturesInformation>() {};
    AccountSignaturesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignaturesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates a account signature. 
  /// </summary>

 /**
  * UpdateAccountSignatureByIdOptions Class.
  *
  **/
  public class UpdateAccountSignatureByIdOptions
  {
  private String closeExistingSignature = null;
  
 /**
  * setCloseExistingSignature method.
  */
  public void setCloseExistingSignature(String closeExistingSignature) {
    this.closeExistingSignature = closeExistingSignature;
  }

 /**
  * getCloseExistingSignature method.
  *
  * @return String
  */
  public String getCloseExistingSignature() {
    return this.closeExistingSignature;
  }
  }

   /**
   * Updates a account signature..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param accountSignatureDefinition  (optional)
   * @return AccountSignature
   */ 
  public AccountSignature updateAccountSignatureById(String accountId, String signatureId, AccountSignatureDefinition accountSignatureDefinition) throws ApiException {
    return updateAccountSignatureById(accountId, signatureId, accountSignatureDefinition, null);
  }

  /**
   * Updates a account signature..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param accountSignatureDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature updateAccountSignatureById(String accountId, String signatureId, AccountSignatureDefinition accountSignatureDefinition, AccountsApi.UpdateAccountSignatureByIdOptions options) throws ApiException {
    ApiResponse<AccountSignature> localVarResponse = updateAccountSignatureByIdWithHttpInfo(accountId, signatureId, accountSignatureDefinition, options);
    return localVarResponse.getData();
  }

  /**
   * Updates a account signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param accountSignatureDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignature > updateAccountSignatureByIdWithHttpInfo(String accountId, String signatureId, AccountSignatureDefinition accountSignatureDefinition, AccountsApi.UpdateAccountSignatureByIdOptions options) throws ApiException {
    Object localVarPostBody = accountSignatureDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountSignatureById");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateAccountSignatureById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("close_existing_signature", options.closeExistingSignature));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    AccountSignature localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Sets a signature, initials, or stamps image. 
  /// </summary>

 /**
  * UpdateAccountSignatureImageOptions Class.
  *
  **/
  public class UpdateAccountSignatureImageOptions
  {
  private String transparentPng = null;
  
 /**
  * setTransparentPng method.
  */
  public void setTransparentPng(String transparentPng) {
    this.transparentPng = transparentPng;
  }

 /**
  * getTransparentPng method.
  *
  * @return String
  */
  public String getTransparentPng() {
    return this.transparentPng;
  }
  }

   /**
   * Sets a signature, initials, or stamps image..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return AccountSignature
   */ 
  public AccountSignature updateAccountSignatureImage(String accountId, String signatureId, String imageType) throws ApiException {
    return updateAccountSignatureImage(accountId, signatureId, imageType, null);
  }

  /**
   * Sets a signature, initials, or stamps image..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature updateAccountSignatureImage(String accountId, String signatureId, String imageType, AccountsApi.UpdateAccountSignatureImageOptions options) throws ApiException {
    ApiResponse<AccountSignature> localVarResponse = updateAccountSignatureImageWithHttpInfo(accountId, signatureId, imageType, options);
    return localVarResponse.getData();
  }

  /**
   * Sets a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSignature > updateAccountSignatureImageWithHttpInfo(String accountId, String signatureId, String imageType, AccountsApi.UpdateAccountSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateAccountSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling updateAccountSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transparent_png", options.transparentPng));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    AccountSignature localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Modifies tab settings for specified account.
   * This method modifies the tab types and tab functionality that is enabled for an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param tabAccountSettings  (optional)
   * @return TabAccountSettings
   * @throws ApiException if fails to make API call
   */
  public TabAccountSettings updateAccountTabSettings(String accountId, TabAccountSettings tabAccountSettings) throws ApiException {
    ApiResponse<TabAccountSettings> localVarResponse = updateAccountTabSettingsWithHttpInfo(accountId, tabAccountSettings);
    return localVarResponse.getData();
  }

  /**
   * Modifies tab settings for specified account
   * This method modifies the tab types and tab functionality that is enabled for an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param tabAccountSettings  (optional)
   * @return TabAccountSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TabAccountSettings > updateAccountTabSettingsWithHttpInfo(String accountId, TabAccountSettings tabAccountSettings) throws ApiException {
    Object localVarPostBody = tabAccountSettings;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountTabSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/tabs"
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
    
    GenericType<TabAccountSettings> localVarReturnType = new GenericType<TabAccountSettings>() {};
    TabAccountSettings localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TabAccountSettings>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates an existing brand. This method updates an account brand.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
  /// </summary>

 /**
  * UpdateBrandOptions Class.
  *
  **/
  public class UpdateBrandOptions
  {
  private String replaceBrand = null;
  
 /**
  * setReplaceBrand method.
  */
  public void setReplaceBrand(String replaceBrand) {
    this.replaceBrand = replaceBrand;
  }

 /**
  * getReplaceBrand method.
  *
  * @return String
  */
  public String getReplaceBrand() {
    return this.replaceBrand;
  }
  }

   /**
   * Updates an existing brand..
   * This method updates an account brand.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param brand  (optional)
   * @return Brand
   */ 
  public Brand updateBrand(String accountId, String brandId, Brand brand) throws ApiException {
    return updateBrand(accountId, brandId, brand, null);
  }

  /**
   * Updates an existing brand..
   * This method updates an account brand.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param brand  (optional)
   * @param options for modifying the method behavior.
   * @return Brand
   * @throws ApiException if fails to make API call
   */
  public Brand updateBrand(String accountId, String brandId, Brand brand, AccountsApi.UpdateBrandOptions options) throws ApiException {
    ApiResponse<Brand> localVarResponse = updateBrandWithHttpInfo(accountId, brandId, brand, options);
    return localVarResponse.getData();
  }

  /**
   * Updates an existing brand.
   * This method updates an account brand.   **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param brand  (optional)
   * @param options for modifying the method behavior.
   * @return Brand
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Brand > updateBrandWithHttpInfo(String accountId, String brandId, Brand brand, AccountsApi.UpdateBrandOptions options) throws ApiException {
    Object localVarPostBody = brand;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrand");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("replace_brand", options.replaceBrand));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Brand> localVarReturnType = new GenericType<Brand>() {};
    Brand localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Brand>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Put one branding logo..
   * This method updates a single brand logo.  You pass in the new version of the resource in the &#x60;Content-Disposition&#x60; header. Example:  &#x60;Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;logo.jpg\&quot;&#x60;  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brandId The ID of the brand. (required)
   * @param logoType The type of logo. Valid values are:  - &#x60;primary&#x60;  - &#x60;secondary&#x60;  - &#x60;email&#x60; (required)
   * @param logoFileBytes Brand logo binary Stream. Supported formats: JPG, GIF, PNG. Maximum file size: 300 KB. Recommended dimensions: 296 x 76 pixels (larger images will be resized). Changes may take up to one hour to display in all places (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBrandLogoByType(String accountId, String brandId, String logoType, byte[] logoFileBytes) throws ApiException {
    updateBrandLogoByTypeWithHttpInfo(accountId, brandId, logoType, logoFileBytes);
  }

  /**
   * Put one branding logo.
   * This method updates a single brand logo.  You pass in the new version of the resource in the &#x60;Content-Disposition&#x60; header. Example:  &#x60;Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;logo.jpg\&quot;&#x60;  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brandId The ID of the brand. (required)
   * @param logoType The type of logo. Valid values are:  - &#x60;primary&#x60;  - &#x60;secondary&#x60;  - &#x60;email&#x60; (required)
   * @param logoFileBytes Brand logo binary Stream. Supported formats: JPG, GIF, PNG. Maximum file size: 300 KB. Recommended dimensions: 296 x 76 pixels (larger images will be resized). Changes may take up to one hour to display in all places (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateBrandLogoByTypeWithHttpInfo(String accountId, String brandId, String logoType, byte[] logoFileBytes) throws ApiException {
    Object localVarPostBody = logoFileBytes;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrandLogoByType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrandLogoByType");
    }
    
    // verify the required parameter 'logoType' is set
    if (logoType == null) {
      throw new ApiException(400, "Missing the required parameter 'logoType' when calling updateBrandLogoByType");
    }
    
    // verify the required parameter 'logoFileBytes' is set
    if (logoFileBytes == null) {
      throw new ApiException(400, "Missing the required parameter 'logoFileBytes' when calling updateBrandLogoByType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/logos/{logoType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "logoType" + "\\}", apiClient.escapeString(logoType.toString()));

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
      "image/png"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Uploads a branding resource file..
   * This method updates a branding resource file.  You pass in the new version of the resource file in the &#x60;Content-Disposition&#x60; header. Example:  &#x60;Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;DocuSign_SigningResource_4328673.xml\&quot;&#x60;  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).  **Important:** Customizing resource files is an advanced branding configuration option which can significantly impact your account, and should be done only by someone with expertise in XML and HTML. The master resource files are subject to change without notice. If you customize your resource files, after each release, DocuSign recommends you review any changes and update your custom files as needed.  When you upload a modified resource file, only the elements that differ from the master resource file are saved as your resource file. Similarly, when you download your resource files, only the modified elements are included in the file.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brandId The ID of the brand. (required)
   * @param resourceContentType The type of brand resource file that you are updating. Valid values are:  - &#x60;sending&#x60; - &#x60;signing&#x60; - &#x60;email&#x60; - &#x60;signing_captive&#x60; (required)
   * @param fileXml Brand resource XML file. (required)
   * @return BrandResources
   * @throws ApiException if fails to make API call
   */
  public BrandResources updateBrandResourcesByContentType(String accountId, String brandId, String resourceContentType, byte[] fileXml) throws ApiException {
    ApiResponse<BrandResources> localVarResponse = updateBrandResourcesByContentTypeWithHttpInfo(accountId, brandId, resourceContentType,  fileXml);
    return localVarResponse.getData();
  }

  /**
   * Uploads a branding resource file.
   * This method updates a branding resource file.  You pass in the new version of the resource file in the &#x60;Content-Disposition&#x60; header. Example:  &#x60;Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;DocuSign_SigningResource_4328673.xml\&quot;&#x60;  **Note:** Branding for either signing or sending must be enabled for the account (&#x60;canSelfBrandSend&#x60; , &#x60;canSelfBrandSign&#x60;, or both of these account settings must be **true**).  **Important:** Customizing resource files is an advanced branding configuration option which can significantly impact your account, and should be done only by someone with expertise in XML and HTML. The master resource files are subject to change without notice. If you customize your resource files, after each release, DocuSign recommends you review any changes and update your custom files as needed.  When you upload a modified resource file, only the elements that differ from the master resource file are saved as your resource file. Similarly, when you download your resource files, only the modified elements are included in the file.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brandId The ID of the brand. (required)
   * @param resourceContentType The type of brand resource file that you are updating. Valid values are:  - &#x60;sending&#x60; - &#x60;signing&#x60; - &#x60;email&#x60; - &#x60;signing_captive&#x60; (required)
   * @param fileXml Brand resource XML file. (required)
   * @return BrandResources
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BrandResources > updateBrandResourcesByContentTypeWithHttpInfo(String accountId, String brandId, String resourceContentType, byte[] fileXml) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrandResourcesByContentType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrandResourcesByContentType");
    }
    
    // verify the required parameter 'resourceContentType' is set
    if (resourceContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceContentType' when calling updateBrandResourcesByContentType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/resources/{resourceContentType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "resourceContentType" + "\\}", apiClient.escapeString(resourceContentType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    if (fileXml != null) {
      localVarFormParams.put("file.xml", fileXml);
    }

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<BrandResources> localVarReturnType = new GenericType<BrandResources>() {};
    BrandResources localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BrandResources>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Update Consumer Disclosure. Account administrators can use this method to perform the following tasks:  - Customize values in the default disclosure. - Switch to a custom disclosure that uses your own text and HTML formatting. - Change values in your existing consumer disclosure.   To specify the signer language version of the disclosure that you are updating, use the optional &#x60;langCode&#x60; query parameter.  **Note:** Only account administrators can use this method. Each time you change the disclosure content, all unsigned recipients of outstanding documents will be required to accept a new version.   ## Updating the default disclosure  When you update the default disclosure, you can edit all properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;custom&#x60;: The default value is **false.** Editing this property causes the default disclosure to switch to a custom disclosure. - &#x60;esignAgreement&#x60;: This property is read-only. - &#x60;esignText&#x60;: You cannot edit this property when &#x60;custom&#x60; is set to **false.** The API returns a 200 OK HTTP response, but does not update the &#x60;esignText&#x60;. - Metadata properties: These properties are read-only.  **Note:** The text of the default disclosure is always in English.  ## Switching to a custom disclosure  To switch to a custom disclosure, set the &#x60;custom&#x60; property to **true** and customize the value for the &#x60;eSignText&#x60; property.   You can also edit all of the other properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Note:** When you use a custom disclosure, you can create versions of it in different signer languages and se the &#x60;langCode&#x60; parameter to specify the signer language version that you are updating.  **Important:**  When you switch from a default to a custom disclosure, note the following information:  - You will not be able to return to using the default disclosure. - Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  ## Updating a custom disclosure  When you update a custom disclosure, you can update all of the properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only.  - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Important:** Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  
  /// </summary>

 /**
  * UpdateConsumerDisclosureOptions Class.
  *
  **/
  public class UpdateConsumerDisclosureOptions
  {
  private String includeMetadata = null;
  
 /**
  * setIncludeMetadata method.
  */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

 /**
  * getIncludeMetadata method.
  *
  * @return String
  */
  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  }

   /**
   * Update Consumer Disclosure..
   * Account administrators can use this method to perform the following tasks:  - Customize values in the default disclosure. - Switch to a custom disclosure that uses your own text and HTML formatting. - Change values in your existing consumer disclosure.   To specify the signer language version of the disclosure that you are updating, use the optional &#x60;langCode&#x60; query parameter.  **Note:** Only account administrators can use this method. Each time you change the disclosure content, all unsigned recipients of outstanding documents will be required to accept a new version.   ## Updating the default disclosure  When you update the default disclosure, you can edit all properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;custom&#x60;: The default value is **false.** Editing this property causes the default disclosure to switch to a custom disclosure. - &#x60;esignAgreement&#x60;: This property is read-only. - &#x60;esignText&#x60;: You cannot edit this property when &#x60;custom&#x60; is set to **false.** The API returns a 200 OK HTTP response, but does not update the &#x60;esignText&#x60;. - Metadata properties: These properties are read-only.  **Note:** The text of the default disclosure is always in English.  ## Switching to a custom disclosure  To switch to a custom disclosure, set the &#x60;custom&#x60; property to **true** and customize the value for the &#x60;eSignText&#x60; property.   You can also edit all of the other properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Note:** When you use a custom disclosure, you can create versions of it in different signer languages and se the &#x60;langCode&#x60; parameter to specify the signer language version that you are updating.  **Important:**  When you switch from a default to a custom disclosure, note the following information:  - You will not be able to return to using the default disclosure. - Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  ## Updating a custom disclosure  When you update a custom disclosure, you can update all of the properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only.  - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Important:** Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param consumerDisclosure  (optional)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure updateConsumerDisclosure(String accountId, String langCode, ConsumerDisclosure consumerDisclosure) throws ApiException {
    return updateConsumerDisclosure(accountId, langCode, consumerDisclosure, null);
  }

  /**
   * Update Consumer Disclosure..
   * Account administrators can use this method to perform the following tasks:  - Customize values in the default disclosure. - Switch to a custom disclosure that uses your own text and HTML formatting. - Change values in your existing consumer disclosure.   To specify the signer language version of the disclosure that you are updating, use the optional &#x60;langCode&#x60; query parameter.  **Note:** Only account administrators can use this method. Each time you change the disclosure content, all unsigned recipients of outstanding documents will be required to accept a new version.   ## Updating the default disclosure  When you update the default disclosure, you can edit all properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;custom&#x60;: The default value is **false.** Editing this property causes the default disclosure to switch to a custom disclosure. - &#x60;esignAgreement&#x60;: This property is read-only. - &#x60;esignText&#x60;: You cannot edit this property when &#x60;custom&#x60; is set to **false.** The API returns a 200 OK HTTP response, but does not update the &#x60;esignText&#x60;. - Metadata properties: These properties are read-only.  **Note:** The text of the default disclosure is always in English.  ## Switching to a custom disclosure  To switch to a custom disclosure, set the &#x60;custom&#x60; property to **true** and customize the value for the &#x60;eSignText&#x60; property.   You can also edit all of the other properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Note:** When you use a custom disclosure, you can create versions of it in different signer languages and se the &#x60;langCode&#x60; parameter to specify the signer language version that you are updating.  **Important:**  When you switch from a default to a custom disclosure, note the following information:  - You will not be able to return to using the default disclosure. - Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  ## Updating a custom disclosure  When you update a custom disclosure, you can update all of the properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only.  - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Important:** Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param consumerDisclosure  (optional)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure updateConsumerDisclosure(String accountId, String langCode, ConsumerDisclosure consumerDisclosure, AccountsApi.UpdateConsumerDisclosureOptions options) throws ApiException {
    ApiResponse<ConsumerDisclosure> localVarResponse = updateConsumerDisclosureWithHttpInfo(accountId, langCode, consumerDisclosure, options);
    return localVarResponse.getData();
  }

  /**
   * Update Consumer Disclosure.
   * Account administrators can use this method to perform the following tasks:  - Customize values in the default disclosure. - Switch to a custom disclosure that uses your own text and HTML formatting. - Change values in your existing consumer disclosure.   To specify the signer language version of the disclosure that you are updating, use the optional &#x60;langCode&#x60; query parameter.  **Note:** Only account administrators can use this method. Each time you change the disclosure content, all unsigned recipients of outstanding documents will be required to accept a new version.   ## Updating the default disclosure  When you update the default disclosure, you can edit all properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;custom&#x60;: The default value is **false.** Editing this property causes the default disclosure to switch to a custom disclosure. - &#x60;esignAgreement&#x60;: This property is read-only. - &#x60;esignText&#x60;: You cannot edit this property when &#x60;custom&#x60; is set to **false.** The API returns a 200 OK HTTP response, but does not update the &#x60;esignText&#x60;. - Metadata properties: These properties are read-only.  **Note:** The text of the default disclosure is always in English.  ## Switching to a custom disclosure  To switch to a custom disclosure, set the &#x60;custom&#x60; property to **true** and customize the value for the &#x60;eSignText&#x60; property.   You can also edit all of the other properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only. - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Note:** When you use a custom disclosure, you can create versions of it in different signer languages and se the &#x60;langCode&#x60; parameter to specify the signer language version that you are updating.  **Important:**  When you switch from a default to a custom disclosure, note the following information:  - You will not be able to return to using the default disclosure. - Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  ## Updating a custom disclosure  When you update a custom disclosure, you can update all of the properties except for the following ones:  - &#x60;accountEsignId&#x60;: This property is read-only.  - &#x60;esignAgreement&#x60;: This property is read-only. - Metadata properties: These properties are read-only.  **Important:** Only the disclosure for the currently selected signer language is saved. DocuSign will not automatically translate your custom disclosure. You must create a disclosure for each language that your signers use.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param consumerDisclosure  (optional)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumerDisclosure > updateConsumerDisclosureWithHttpInfo(String accountId, String langCode, ConsumerDisclosure consumerDisclosure, AccountsApi.UpdateConsumerDisclosureOptions options) throws ApiException {
    Object localVarPostBody = consumerDisclosure;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateConsumerDisclosure");
    }
    
    // verify the required parameter 'langCode' is set
    if (langCode == null) {
      throw new ApiException(400, "Missing the required parameter 'langCode' when calling updateConsumerDisclosure");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/consumer_disclosure/{langCode}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    ConsumerDisclosure localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ConsumerDisclosure>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates an existing account custom field. This method updates an existing account custom field.
  /// </summary>

 /**
  * UpdateCustomFieldOptions Class.
  *
  **/
  public class UpdateCustomFieldOptions
  {
  private String applyToTemplates = null;
  
 /**
  * setApplyToTemplates method.
  */
  public void setApplyToTemplates(String applyToTemplates) {
    this.applyToTemplates = applyToTemplates;
  }

 /**
  * getApplyToTemplates method.
  *
  * @return String
  */
  public String getApplyToTemplates() {
    return this.applyToTemplates;
  }
  }

   /**
   * Updates an existing account custom field..
   * This method updates an existing account custom field.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param customField  (optional)
   * @return CustomFields
   */ 
  public CustomFields updateCustomField(String accountId, String customFieldId, CustomField customField) throws ApiException {
    return updateCustomField(accountId, customFieldId, customField, null);
  }

  /**
   * Updates an existing account custom field..
   * This method updates an existing account custom field.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param customField  (optional)
   * @param options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields updateCustomField(String accountId, String customFieldId, CustomField customField, AccountsApi.UpdateCustomFieldOptions options) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = updateCustomFieldWithHttpInfo(accountId, customFieldId, customField, options);
    return localVarResponse.getData();
  }

  /**
   * Updates an existing account custom field.
   * This method updates an existing account custom field.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param customField  (optional)
   * @param options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > updateCustomFieldWithHttpInfo(String accountId, String customFieldId, CustomField customField, AccountsApi.UpdateCustomFieldOptions options) throws ApiException {
    Object localVarPostBody = customField;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomField");
    }
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling updateCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("apply_to_templates", options.applyToTemplates));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates configuration information for the eNote eOriginal integration..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param eNoteConfiguration  (optional)
   * @return ENoteConfiguration
   * @throws ApiException if fails to make API call
   */
  public ENoteConfiguration updateENoteConfiguration(String accountId, ENoteConfiguration eNoteConfiguration) throws ApiException {
    ApiResponse<ENoteConfiguration> localVarResponse = updateENoteConfigurationWithHttpInfo(accountId, eNoteConfiguration);
    return localVarResponse.getData();
  }

  /**
   * Updates configuration information for the eNote eOriginal integration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param eNoteConfiguration  (optional)
   * @return ENoteConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ENoteConfiguration > updateENoteConfigurationWithHttpInfo(String accountId, ENoteConfiguration eNoteConfiguration) throws ApiException {
    Object localVarPostBody = eNoteConfiguration;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateENoteConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/enote_configuration"
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
    
    GenericType<ENoteConfiguration> localVarReturnType = new GenericType<ENoteConfiguration>() {};
    ENoteConfiguration localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ENoteConfiguration>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates envelope purge configuration..
   * An envelope purge configuration enables account administrators to permanently remove documents and their field data from completed and voided envelopes after a specified retention period (&#x60;retentionDays&#x60;). This method sets the envelope purge configuration for your account.  **Note:** To use this method, you must be an account administrator.  For more information, see [Purge Envelopes](https://support.docusign.com/en/guides/ndse-user-guide-purge-envelopes).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopePurgeConfiguration  (optional)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public EnvelopePurgeConfiguration updateEnvelopePurgeConfiguration(String accountId, EnvelopePurgeConfiguration envelopePurgeConfiguration) throws ApiException {
    ApiResponse<EnvelopePurgeConfiguration> localVarResponse = updateEnvelopePurgeConfigurationWithHttpInfo(accountId, envelopePurgeConfiguration);
    return localVarResponse.getData();
  }

  /**
   * Updates envelope purge configuration.
   * An envelope purge configuration enables account administrators to permanently remove documents and their field data from completed and voided envelopes after a specified retention period (&#x60;retentionDays&#x60;). This method sets the envelope purge configuration for your account.  **Note:** To use this method, you must be an account administrator.  For more information, see [Purge Envelopes](https://support.docusign.com/en/guides/ndse-user-guide-purge-envelopes).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopePurgeConfiguration  (optional)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopePurgeConfiguration > updateEnvelopePurgeConfigurationWithHttpInfo(String accountId, EnvelopePurgeConfiguration envelopePurgeConfiguration) throws ApiException {
    Object localVarPostBody = envelopePurgeConfiguration;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopePurgeConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/envelope_purge_configuration"
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
    
    GenericType<EnvelopePurgeConfiguration> localVarReturnType = new GenericType<EnvelopePurgeConfiguration>() {};
    EnvelopePurgeConfiguration localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopePurgeConfiguration>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Favorites a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param favoriteTemplatesInfo  (optional)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public FavoriteTemplatesInfo updateFavoriteTemplate(String accountId, FavoriteTemplatesInfo favoriteTemplatesInfo) throws ApiException {
    ApiResponse<FavoriteTemplatesInfo> localVarResponse = updateFavoriteTemplateWithHttpInfo(accountId, favoriteTemplatesInfo);
    return localVarResponse.getData();
  }

  /**
   * Favorites a template
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param favoriteTemplatesInfo  (optional)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FavoriteTemplatesInfo > updateFavoriteTemplateWithHttpInfo(String accountId, FavoriteTemplatesInfo favoriteTemplatesInfo) throws ApiException {
    Object localVarPostBody = favoriteTemplatesInfo;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateFavoriteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/favorite_templates"
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
    
    GenericType<FavoriteTemplatesInfo> localVarReturnType = new GenericType<FavoriteTemplatesInfo>() {};
    FavoriteTemplatesInfo localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FavoriteTemplatesInfo>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates default user level settings for a specified account.
   * This method changes the default settings for the email notifications that signers and senders receive about envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param notificationDefaults  (optional)
   * @return NotificationDefaults
   * @throws ApiException if fails to make API call
   */
  public NotificationDefaults updateNotificationDefaults(String accountId, NotificationDefaults notificationDefaults) throws ApiException {
    ApiResponse<NotificationDefaults> localVarResponse = updateNotificationDefaultsWithHttpInfo(accountId, notificationDefaults);
    return localVarResponse.getData();
  }

  /**
   * Updates default user level settings for a specified account
   * This method changes the default settings for the email notifications that signers and senders receive about envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param notificationDefaults  (optional)
   * @return NotificationDefaults
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NotificationDefaults > updateNotificationDefaultsWithHttpInfo(String accountId, NotificationDefaults notificationDefaults) throws ApiException {
    Object localVarPostBody = notificationDefaults;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/notification_defaults"
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
    
    GenericType<NotificationDefaults> localVarReturnType = new GenericType<NotificationDefaults>() {};
    NotificationDefaults localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NotificationDefaults>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update the password rules.
   * This method updates the password rules for an account.  **Note:** To update the password rules for an account, you must be an account administrator.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountPasswordRules  (optional)
   * @return AccountPasswordRules
   * @throws ApiException if fails to make API call
   */
  public AccountPasswordRules updatePasswordRules(String accountId, AccountPasswordRules accountPasswordRules) throws ApiException {
    ApiResponse<AccountPasswordRules> localVarResponse = updatePasswordRulesWithHttpInfo(accountId, accountPasswordRules);
    return localVarResponse.getData();
  }

  /**
   * Update the password rules
   * This method updates the password rules for an account.  **Note:** To update the password rules for an account, you must be an account administrator.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountPasswordRules  (optional)
   * @return AccountPasswordRules
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountPasswordRules > updatePasswordRulesWithHttpInfo(String accountId, AccountPasswordRules accountPasswordRules) throws ApiException {
    Object localVarPostBody = accountPasswordRules;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePasswordRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/password_rules"
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
    
    GenericType<AccountPasswordRules> localVarReturnType = new GenericType<AccountPasswordRules>() {};
    AccountPasswordRules localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountPasswordRules>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates a permission profile within the specified account. This method updates an account permission profile.  ### Related topics  - [How to update individual permission settings](/docs/esign-rest-api/how-to/permission-profile-updating/) 
  /// </summary>

 /**
  * UpdatePermissionProfileOptions Class.
  *
  **/
  public class UpdatePermissionProfileOptions
  {
  private String include = null;
  
 /**
  * setInclude method.
  */
  public void setInclude(String include) {
    this.include = include;
  }

 /**
  * getInclude method.
  *
  * @return String
  */
  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Updates a permission profile within the specified account..
   * This method updates an account permission profile.  ### Related topics  - [How to update individual permission settings](/docs/esign-rest-api/how-to/permission-profile-updating/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param permissionProfile  (optional)
   * @return PermissionProfile
   */ 
  public PermissionProfile updatePermissionProfile(String accountId, String permissionProfileId, PermissionProfile permissionProfile) throws ApiException {
    return updatePermissionProfile(accountId, permissionProfileId, permissionProfile, null);
  }

  /**
   * Updates a permission profile within the specified account..
   * This method updates an account permission profile.  ### Related topics  - [How to update individual permission settings](/docs/esign-rest-api/how-to/permission-profile-updating/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param permissionProfile  (optional)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public PermissionProfile updatePermissionProfile(String accountId, String permissionProfileId, PermissionProfile permissionProfile, AccountsApi.UpdatePermissionProfileOptions options) throws ApiException {
    ApiResponse<PermissionProfile> localVarResponse = updatePermissionProfileWithHttpInfo(accountId, permissionProfileId, permissionProfile, options);
    return localVarResponse.getData();
  }

  /**
   * Updates a permission profile within the specified account.
   * This method updates an account permission profile.  ### Related topics  - [How to update individual permission settings](/docs/esign-rest-api/how-to/permission-profile-updating/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param permissionProfile  (optional)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionProfile > updatePermissionProfileWithHttpInfo(String accountId, String permissionProfileId, PermissionProfile permissionProfile, AccountsApi.UpdatePermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = permissionProfile;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePermissionProfile");
    }
    
    // verify the required parameter 'permissionProfileId' is set
    if (permissionProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionProfileId' when calling updatePermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles/{permissionProfileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "permissionProfileId" + "\\}", apiClient.escapeString(permissionProfileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<PermissionProfile> localVarReturnType = new GenericType<PermissionProfile>() {};
    PermissionProfile localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PermissionProfile>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the account settings for an account..
   * Updates the account settings for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSettingsInformation  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateSettings(String accountId, AccountSettingsInformation accountSettingsInformation) throws ApiException {
    updateSettingsWithHttpInfo(accountId, accountSettingsInformation);
  }

  /**
   * Updates the account settings for an account.
   * Updates the account settings for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSettingsInformation  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateSettingsWithHttpInfo(String accountId, AccountSettingsInformation accountSettingsInformation) throws ApiException {
    Object localVarPostBody = accountSettingsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings"
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
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Reserved: Sets the shared access information for users. Reserved: Sets the shared access information for one or more users.
  /// </summary>

 /**
  * UpdateSharedAccessOptions Class.
  *
  **/
  public class UpdateSharedAccessOptions
  {
  private String itemType = null;
  private String preserveExistingSharedAccess = null;
  private String userIds = null;
  
 /**
  * setItemType method.
  */
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

 /**
  * getItemType method.
  *
  * @return String
  */
  public String getItemType() {
    return this.itemType;
  }
  
 /**
  * setPreserveExistingSharedAccess method.
  */
  public void setPreserveExistingSharedAccess(String preserveExistingSharedAccess) {
    this.preserveExistingSharedAccess = preserveExistingSharedAccess;
  }

 /**
  * getPreserveExistingSharedAccess method.
  *
  * @return String
  */
  public String getPreserveExistingSharedAccess() {
    return this.preserveExistingSharedAccess;
  }
  
 /**
  * setUserIds method.
  */
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

 /**
  * getUserIds method.
  *
  * @return String
  */
  public String getUserIds() {
    return this.userIds;
  }
  }

   /**
   * Reserved: Sets the shared access information for users..
   * Reserved: Sets the shared access information for one or more users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSharedAccess  (optional)
   * @return AccountSharedAccess
   */ 
  public AccountSharedAccess updateSharedAccess(String accountId, AccountSharedAccess accountSharedAccess) throws ApiException {
    return updateSharedAccess(accountId, accountSharedAccess, null);
  }

  /**
   * Reserved: Sets the shared access information for users..
   * Reserved: Sets the shared access information for one or more users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSharedAccess  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public AccountSharedAccess updateSharedAccess(String accountId, AccountSharedAccess accountSharedAccess, AccountsApi.UpdateSharedAccessOptions options) throws ApiException {
    ApiResponse<AccountSharedAccess> localVarResponse = updateSharedAccessWithHttpInfo(accountId, accountSharedAccess, options);
    return localVarResponse.getData();
  }

  /**
   * Reserved: Sets the shared access information for users.
   * Reserved: Sets the shared access information for one or more users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSharedAccess  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSharedAccess > updateSharedAccessWithHttpInfo(String accountId, AccountSharedAccess accountSharedAccess, AccountsApi.UpdateSharedAccessOptions options) throws ApiException {
    Object localVarPostBody = accountSharedAccess;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSharedAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/shared_access"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("item_type", options.itemType));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preserve_existing_shared_access", options.preserveExistingSharedAccess));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_ids", options.userIds));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AccountSharedAccess> localVarReturnType = new GenericType<AccountSharedAccess>() {};
    AccountSharedAccess localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSharedAccess>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update watermark information..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param watermark  (optional)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public Watermark updateWatermark(String accountId, Watermark watermark) throws ApiException {
    ApiResponse<Watermark> localVarResponse = updateWatermarkWithHttpInfo(accountId, watermark);
    return localVarResponse.getData();
  }

  /**
   * Update watermark information.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param watermark  (optional)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Watermark > updateWatermarkWithHttpInfo(String accountId, Watermark watermark) throws ApiException {
    Object localVarPostBody = watermark;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWatermark");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/watermark"
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
    
    GenericType<Watermark> localVarReturnType = new GenericType<Watermark>() {};
    Watermark localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Watermark>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
