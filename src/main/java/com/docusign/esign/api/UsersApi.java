package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ContactGetResponse;
import com.docusign.esign.model.ContactModRequest;
import com.docusign.esign.model.ContactUpdateResponse;
import com.docusign.esign.model.CustomSettingsInformation;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NewUsersDefinition;
import com.docusign.esign.model.NewUsersSummary;
import com.docusign.esign.model.UserInfoList;
import com.docusign.esign.model.UserInformation;
import com.docusign.esign.model.UserInformationList;
import com.docusign.esign.model.UserProfile;
import com.docusign.esign.model.UserSettingsInformation;
import com.docusign.esign.model.UserSignature;
import com.docusign.esign.model.UserSignatureDefinition;
import com.docusign.esign.model.UserSignaturesInformation;
import com.docusign.esign.model.UsersResponse;




  public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
  this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Adds news user to the specified account.
   * Adds new users to your account. Set the &#x60;userSettings&#x60; property in the request to specify the actions the users can perform on the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param newUsersDefinition  (optional)
   * @return NewUsersSummary
   * @throws ApiException if fails to make API call
   */
  public NewUsersSummary create(String accountId, NewUsersDefinition newUsersDefinition) throws ApiException {
    Object localVarPostBody = newUsersDefinition;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling create");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<NewUsersSummary> localVarReturnType = new GenericType<NewUsersSummary>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Adds user Signature and initials images to a Signature.
   * Adds a user signature image and/or user initials image to the specified user.   The userId property specified in the endpoint must match the authenticated user&#39;s userId and the user must be a member of the account.  The rules and processes associated with this are:  * If Content-Type is set to application/json, then the default behavior for creating a default signature image, based on the name and a DocuSign font, is used. * If Content-Type is set to multipart/form-data, then the request must contain a first part with the user signature information, followed by parts that contain the images.  For each Image part, the Content-Disposition header has a \&quot;filename\&quot; value that is used to map to the &#x60;signatureName&#x60; and/or &#x60;signatureInitials&#x60; properties in the JSON to the image.   For example:  &#x60;Content-Disposition: file; filename&#x3D;\&quot;Ron Test20121127083900\&quot;&#x60;  If no matching image (by filename value) is found, then the image is not set. One, both, or neither of the signature and initials images can be set with this call.  The Content-Transfer-Encoding: base64 header, set in the header for the part containing the image, can be set to indicate that the images are formatted as base64 instead of as binary.  If successful, 200-OK is returned, and a JSON structure containing the signature information is provided, note that the signatureId can change with each API POST, PUT, or DELETE since the changes to the signature structure cause the current signature to be closed, and a new signature record to be created.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSignaturesInformation  (optional)
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public UserSignaturesInformation createSignatures(String accountId, String userId, UserSignaturesInformation userSignaturesInformation) throws ApiException {
    Object localVarPostBody = userSignaturesInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createSignatures");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createSignatures");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignaturesInformation> localVarReturnType = new GenericType<UserSignaturesInformation>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Removes users account privileges. This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
  /// </summary>
  public class DeleteOptions
  {
  private String delete = null;
  /*
   * 
   */
  public void setDelete(String delete) {
    this.delete = delete;
  }
  
  public String getDelete() {
    return this.delete;
  }
  }

   /**
   * Removes users account privileges.
   * This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInfoList  (optional)
   * @return UsersResponse
   */ 
  public UsersResponse delete(String accountId, UserInfoList userInfoList) throws ApiException {
    return delete(accountId, userInfoList, null);
  }

  /**
   * Removes users account privileges.
   * This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.  The response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an &#x60;errorDetails&#x60; node with &#x60;errorCode&#x60; and &#x60;message&#x60; properties.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInfoList  (optional)
   * @param options for modifying the method behavior.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse delete(String accountId, UserInfoList userInfoList, UsersApi.DeleteOptions options) throws ApiException {
    Object localVarPostBody = userInfoList;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete", options.delete));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UsersResponse> localVarReturnType = new GenericType<UsersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Replaces a particular contact associated with an account for the DocuSign service.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse deleteContactWithId(String accountId, String contactId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteContactWithId");
      }
    
      // verify the required parameter 'contactId' is set
      if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling deleteContactWithId");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Delete contacts associated with an account for the DocuSign service.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse deleteContacts(String accountId, ContactModRequest contactModRequest) throws ApiException {
    Object localVarPostBody = contactModRequest;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteContacts");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/contacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes custom user settings for a specified user.
   * Deletes the specified custom user settings for a single user.  ###Deleting Grouped Custom User Settings###  If the custom user settings you want to delete are grouped, you must include the following information in the header, after Content-Type, in the request:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings.  If the extra header information is not included, only the custom user settings that were added without a group are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param customSettingsInformation  (optional)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public CustomSettingsInformation deleteCustomSettings(String accountId, String userId, CustomSettingsInformation customSettingsInformation) throws ApiException {
    Object localVarPostBody = customSettingsInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomSettings");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteCustomSettings");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/custom_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomSettingsInformation> localVarReturnType = new GenericType<CustomSettingsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes the user profile image for the specified user.
   * Deletes the user profile image from the  specified user&#39;s profile.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProfileImage(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteProfileImage");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteProfileImage");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/profile/image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Removes removes signature information for the specified user.
   * Removes the signature information for the user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSignature(String accountId, String userId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteSignature");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSignature");
      }
    
      // verify the required parameter 'signatureId' is set
      if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteSignature");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Deletes the user initials image or the  user signature image for the specified user.
   * Deletes the specified initials image or signature image for the specified user.  The function deletes one or the other of the image types, to delete both the initials image and signature image you must call the endpoint twice.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature deleteSignatureImage(String accountId, String userId, String signatureId, String imageType) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteSignatureImage");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSignatureImage");
      }
    
      // verify the required parameter 'signatureId' is set
      if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteSignatureImage");
      }
    
      // verify the required parameter 'imageType' is set
      if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling deleteSignatureImage");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets a particular contact associated with the user&#39;s account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactId The unique identifier of a person in the contacts address book. (required)
   * @return ContactGetResponse
   * @throws ApiException if fails to make API call
   */
  public ContactGetResponse getContactById(String accountId, String contactId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getContactById");
      }
    
      // verify the required parameter 'contactId' is set
      if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContactById");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<ContactGetResponse> localVarReturnType = new GenericType<ContactGetResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets the user information for a specified user. Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
  /// </summary>
  public class GetInformationOptions
  {
  private String additionalInfo = null;
  private String email = null;
  /*
   * When set to **true**, the full list of user information is returned for each user in the account. 
   */
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  
  public String getAdditionalInfo() {
    return this.additionalInfo;
  }
  /*
   * 
   */
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getEmail() {
    return this.email;
  }
  }

   /**
   * Gets the user information for a specified user.
   * Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserInformation
   */ 
  public UserInformation getInformation(String accountId, String userId) throws ApiException {
    return getInformation(accountId, userId, null);
  }

  /**
   * Gets the user information for a specified user.
   * Retrieves the user information for the specified user.   To return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional &#x60;additional_info&#x60; query string parameter to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return UserInformation
   * @throws ApiException if fails to make API call
   */
  public UserInformation getInformation(String accountId, String userId, UsersApi.GetInformationOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getInformation");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getInformation");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "additional_info", options.additionalInfo));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", options.email));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserInformation> localVarReturnType = new GenericType<UserInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Retrieves the user profile for a specified user.
   * Retrieves the user profile information, the privacy settings and personal information (address, phone number, etc.) for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserProfile
   * @throws ApiException if fails to make API call
   */
  public UserProfile getProfile(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getProfile");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getProfile");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/profile".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserProfile> localVarReturnType = new GenericType<UserProfile>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Retrieves the user profile image for the specified user. Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
  /// </summary>
  public class GetProfileImageOptions
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
   * Retrieves the user profile image for the specified user.
   * Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return byte[]
   */ 
  public byte[] getProfileImage(String accountId, String userId) throws ApiException {
    return getProfileImage(accountId, userId, null);
  }

  /**
   * Retrieves the user profile image for the specified user.
   * Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.  If successful, the response returns a 200 - OK and the user profile image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getProfileImage(String accountId, String userId, UsersApi.GetProfileImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getProfileImage");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getProfileImage");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/profile/image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "encoding", options.encoding));
    }
    
    
      final String[] localVarAccepts = {
    "image/gif"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets the user account settings for a specified user.
   * Retrieves a list of the account settings and email notification information for the specified user.  The response returns the account setting name/value information and the email notification settings for the specified user. For more information about the different user settings, see the [ML:userSettings list].
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public UserSettingsInformation getSettings(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSettings");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSettings");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSettingsInformation> localVarReturnType = new GenericType<UserSettingsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets the user signature information for the specified user.
   * Retrieves the structure of a single signature with a known signature name.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature getSignature(String accountId, String userId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSignature");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSignature");
      }
    
      // verify the required parameter 'signatureId' is set
      if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getSignature");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Retrieves the user initials image or the  user signature image for the specified user. Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>
  public class GetSignatureImageOptions
  {
  private String includeChrome = null;
  /*
   * 
   */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }
  
  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Retrieves the user initials image or the  user signature image for the specified user.
   * Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return byte[]
   */ 
  public byte[] getSignatureImage(String accountId, String userId, String signatureId, String imageType) throws ApiException {
    return getSignatureImage(accountId, userId, signatureId, imageType, null);
  }

  /**
   * Retrieves the user initials image or the  user signature image for the specified user.
   * Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.  ###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getSignatureImage(String accountId, String userId, String signatureId, String imageType, UsersApi.GetSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSignatureImage");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSignatureImage");
      }
    
      // verify the required parameter 'signatureId' is set
      if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getSignatureImage");
      }
    
      // verify the required parameter 'imageType' is set
      if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling getSignatureImage");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_chrome", options.includeChrome));
    }
    
    
      final String[] localVarAccepts = {
    "image/gif"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Retrieves the list of users for the specified account. Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
  /// </summary>
  public class ListOptions
  {
  private String additionalInfo = null;
  private String count = null;
  private String email = null;
  private String emailSubstring = null;
  private String groupId = null;
  private String loginStatus = null;
  private String notGroupId = null;
  private String startPosition = null;
  private String status = null;
  private String userNameSubstring = null;
  /*
   * When set to **true**, the full list of user information is returned for each user in the account. 
   */
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  
  public String getAdditionalInfo() {
    return this.additionalInfo;
  }
  /*
   * Number of records to return. The number must be greater than 0 and less than or equal to 100.  
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
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getEmail() {
    return this.email;
  }
  /*
   * Filters the returned user records by the email address or a sub-string of email address. 
   */
  public void setEmailSubstring(String emailSubstring) {
    this.emailSubstring = emailSubstring;
  }
  
  public String getEmailSubstring() {
    return this.emailSubstring;
  }
  /*
   * Filters user records returned by one or more group Id&#39;s. 
   */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }
  
  public String getGroupId() {
    return this.groupId;
  }
  /*
   * 
   */
  public void setLoginStatus(String loginStatus) {
    this.loginStatus = loginStatus;
  }
  
  public String getLoginStatus() {
    return this.loginStatus;
  }
  /*
   * 
   */
  public void setNotGroupId(String notGroupId) {
    this.notGroupId = notGroupId;
  }
  
  public String getNotGroupId() {
    return this.notGroupId;
  }
  /*
   * Starting value for the list.  
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
   * Filters the user records returned by the user name or a sub-string of user name. 
   */
  public void setUserNameSubstring(String userNameSubstring) {
    this.userNameSubstring = userNameSubstring;
  }
  
  public String getUserNameSubstring() {
    return this.userNameSubstring;
  }
  }

   /**
   * Retrieves the list of users for the specified account.
   * Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return UserInformationList
   */ 
  public UserInformationList list(String accountId) throws ApiException {
    return list(accountId, null);
  }

  /**
   * Retrieves the list of users for the specified account.
   * Retrieves the list of users for the specified account.  The response returns the list of users for the account along with the information about the result set. If the &#x60;additional_info&#x60; query was added to the endpoint and set to **true**, the full user information is returned for each user
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return UserInformationList
   * @throws ApiException if fails to make API call
   */
  public UserInformationList list(String accountId, UsersApi.ListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "additional_info", options.additionalInfo));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", options.email));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "email_substring", options.emailSubstring));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_id", options.groupId));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "login_status", options.loginStatus));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "not_group_id", options.notGroupId));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", options.status));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_name_substring", options.userNameSubstring));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserInformationList> localVarReturnType = new GenericType<UserInformationList>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Retrieves the custom user settings for a specified user.
   * Retrieves a list of custom user settings for a single user.  Custom settings provide a flexible way to store and retrieve custom user information that can be used in your own system.  ###### Note: Custom user settings are not the same as user account settings.  ###Getting Grouped Custom User Settings###  If the custom user settings you want to retrieve are grouped, you must include the following information in the header, after Content-Type, in the request:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings.  If the extra header information is not included, only the custom user settings that were added without a group are retrieved.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public CustomSettingsInformation listCustomSettings(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomSettings");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listCustomSettings");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/custom_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomSettingsInformation> localVarReturnType = new GenericType<CustomSettingsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Retrieves a list of user signature definitions for a specified user. Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
  /// </summary>
  public class ListSignaturesOptions
  {
  private String stampType = null;
  /*
   * 
   */
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }
  
  public String getStampType() {
    return this.stampType;
  }
  }

   /**
   * Retrieves a list of user signature definitions for a specified user.
   * Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return UserSignaturesInformation
   */ 
  public UserSignaturesInformation listSignatures(String accountId, String userId) throws ApiException {
    return listSignatures(accountId, userId, null);
  }

  /**
   * Retrieves a list of user signature definitions for a specified user.
   * Retrieves the signature definitions for the specified user.  The userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param options for modifying the method behavior.
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public UserSignaturesInformation listSignatures(String accountId, String userId, UsersApi.ListSignaturesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSignatures");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listSignatures");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "stamp_type", options.stampType));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignaturesInformation> localVarReturnType = new GenericType<UserSignaturesInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Imports multiple new contacts into the contacts collection from CSV, JSON, or XML (based on content type).
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse postContacts(String accountId, ContactModRequest contactModRequest) throws ApiException {
    Object localVarPostBody = contactModRequest;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling postContacts");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/contacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Replaces contacts associated with an account for the DocuSign service.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param contactModRequest  (optional)
   * @return ContactUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ContactUpdateResponse putContacts(String accountId, ContactModRequest contactModRequest) throws ApiException {
    Object localVarPostBody = contactModRequest;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putContacts");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/contacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<ContactUpdateResponse> localVarReturnType = new GenericType<ContactUpdateResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Adds or updates custom user settings for the specified user.
   * Adds or updates custom user settings for the specified user.  ###### Note: Custom user settings are not the same as user account settings.  Custom settings provide a flexible way to store and retrieve custom user information that you can use in your own system.  **Important**: There is a limit on the size for all the custom user settings for a single user. The limit is 4,000 characters, which includes the XML and JSON structure for the settings.  ### Grouping Custom User Settings ###  You can group custom user settings when adding them. Grouping allows you to retrieve settings that are in a specific group, instead of retrieving all the user custom settings.  To group custom user settings, add the following information in the header, after Content-Type:  &#x60;X-DocuSign-User-Settings-Key:group_name&#x60;  Where the &#x60;group_name&#x60; is your designated name for the group of customer user settings. Grouping is shown in the Example Request Body below.  When getting or deleting grouped custom user settings, you must include the extra header information.  Grouping custom user settings is not required and if the extra header information is not included, the custom user settings are added normally and can be retrieved or deleted without including the additional header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param customSettingsInformation  (optional)
   * @return CustomSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public CustomSettingsInformation updateCustomSettings(String accountId, String userId, CustomSettingsInformation customSettingsInformation) throws ApiException {
    Object localVarPostBody = customSettingsInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomSettings");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateCustomSettings");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/custom_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomSettingsInformation> localVarReturnType = new GenericType<CustomSettingsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Updates the user profile information for the specified user.
   * Updates the user&#39;s detail information, profile information, privacy settings, and personal information in the user ID card.  You can also change a user&#39;s name by changing the information in the &#x60;userDetails&#x60; property. When changing a user&#39;s name, you can either change the information in the &#x60;userName&#x60; property OR change the information in &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName, suffixName&#x60;, and &#x60;title&#x60; properties. Changes to &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName&#x60;, &#x60;suffixName&#x60;, and &#x60;title&#x60; properties take precedence over changes to the &#x60;userName&#x60; property.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userProfile  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateProfile(String accountId, String userId, UserProfile userProfile) throws ApiException {
    Object localVarPostBody = userProfile;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateProfile");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateProfile");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/profile".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Updates the user profile image for a specified user.
   * Updates the user profile image by uploading an image to the user profile.  The supported image formats are: gif, png, jpeg, and bmp. The file must be less than 200K. For best viewing results, DocuSign recommends that the image is no more than 79 pixels wide and high.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProfileImage(String accountId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateProfileImage");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateProfileImage");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/profile/image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Updates the user account settings for a specified user.
   * Updates the account settings list and email notification types for the specified user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSettingsInformation  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateSettings(String accountId, String userId, UserSettingsInformation userSettingsInformation) throws ApiException {
    Object localVarPostBody = userSettingsInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSettings");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSettings");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }
  /// <summary>
  /// Updates the user signature for a specified user. Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
  /// </summary>
  public class UpdateSignatureOptions
  {
  private String closeExistingSignature = null;
  /*
   * When set to **true**, closes the current signature. 
   */
  public void setCloseExistingSignature(String closeExistingSignature) {
    this.closeExistingSignature = closeExistingSignature;
  }
  
  public String getCloseExistingSignature() {
    return this.closeExistingSignature;
  }
  }

   /**
   * Updates the user signature for a specified user.
   * Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param userSignatureDefinition  (optional)
   * @return UserSignature
   */ 
  public UserSignature updateSignature(String accountId, String userId, String signatureId, UserSignatureDefinition userSignatureDefinition) throws ApiException {
    return updateSignature(accountId, userId, signatureId, userSignatureDefinition, null);
  }

  /**
   * Updates the user signature for a specified user.
   * Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.  ###### Note: This will also create a default signature for the user when one does not exist.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param userSignatureDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature updateSignature(String accountId, String userId, String signatureId, UserSignatureDefinition userSignatureDefinition, UsersApi.UpdateSignatureOptions options) throws ApiException {
    Object localVarPostBody = userSignatureDefinition;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSignature");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSignature");
      }
    
      // verify the required parameter 'signatureId' is set
      if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateSignature");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "close_existing_signature", options.closeExistingSignature));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Updates the user signature image or user initials image for the specified user.
   * Updates the user signature image or user initials image for the specified user. The supported image formats for this file are: gif, png, jpeg, and bmp. The file must be less than 200K.  The userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureId&#x60; parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint.   For example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature updateSignatureImage(String accountId, String userId, String signatureId, String imageType) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSignatureImage");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSignatureImage");
      }
    
      // verify the required parameter 'signatureId' is set
      if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateSignatureImage");
      }
    
      // verify the required parameter 'imageType' is set
      if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling updateSignatureImage");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Adds/updates a user signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userSignaturesInformation  (optional)
   * @return UserSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public UserSignaturesInformation updateSignatures(String accountId, String userId, UserSignaturesInformation userSignaturesInformation) throws ApiException {
    Object localVarPostBody = userSignaturesInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSignatures");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSignatures");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/signatures".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserSignaturesInformation> localVarReturnType = new GenericType<UserSignaturesInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Updates the specified user information.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @param userInformation  (optional)
   * @return UserInformation
   * @throws ApiException if fails to make API call
   */
  public UserInformation updateUser(String accountId, String userId, UserInformation userInformation) throws ApiException {
    Object localVarPostBody = userInformation;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUser");
      }
    
      // verify the required parameter 'userId' is set
      if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserInformation> localVarReturnType = new GenericType<UserInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Change one or more user in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param userInformationList  (optional)
   * @return UserInformationList
   * @throws ApiException if fails to make API call
   */
  public UserInformationList updateUsers(String accountId, UserInformationList userInformationList) throws ApiException {
    Object localVarPostBody = userInformationList;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUsers");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<UserInformationList> localVarReturnType = new GenericType<UserInformationList>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
