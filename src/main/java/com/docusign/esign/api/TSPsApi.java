package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.CompleteSignHashResponse;
import com.docusign.esign.model.CompleteSignRequest;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SignHashSessionInfoResponse;
import com.docusign.esign.model.SignSessionInfoRequest;
import com.docusign.esign.model.TspHealthCheckRequest;
import com.docusign.esign.model.UpdateTransactionRequest;
import com.docusign.esign.model.UpdateTransactionResponse;
import com.docusign.esign.model.UserInfoResponse;




  public class TSPsApi {
  private ApiClient apiClient;

  public TSPsApi() {
  this(Configuration.getDefaultApiClient());
  }

  public TSPsApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Complete Sign Hash
   * 
   * @param completeSignRequest  (optional)
   * @return CompleteSignHashResponse
   * @throws ApiException if fails to make API call
   */
  public CompleteSignHashResponse completeSignHash(CompleteSignRequest completeSignRequest) throws ApiException {
    Object localVarPostBody = completeSignRequest;
    
    // create path and map variables
    String localVarPath = "/v2/signature/completesignhash".replaceAll("\\{format\\}","json");

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

        GenericType<CompleteSignHashResponse> localVarReturnType = new GenericType<CompleteSignHashResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Get User Info To Sign Document
   * 
   * @return UserInfoResponse
   * @throws ApiException if fails to make API call
   */
  public UserInfoResponse getUserInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/signature/userInfo".replaceAll("\\{format\\}","json");

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

        GenericType<UserInfoResponse> localVarReturnType = new GenericType<UserInfoResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Report status from the TSP to DocuSign
   * 
   * @param tspHealthCheckRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void healthCheck(TspHealthCheckRequest tspHealthCheckRequest) throws ApiException {
    Object localVarPostBody = tspHealthCheckRequest;
    
    // create path and map variables
    String localVarPath = "/v2/signature/healthcheck".replaceAll("\\{format\\}","json");

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


      apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Get Signature Session Info To Sign Document Hash
   * 
   * @param signSessionInfoRequest  (optional)
   * @return SignHashSessionInfoResponse
   * @throws ApiException if fails to make API call
   */
  public SignHashSessionInfoResponse signHashSessionInfo(SignSessionInfoRequest signSessionInfoRequest) throws ApiException {
    Object localVarPostBody = signSessionInfoRequest;
    
    // create path and map variables
    String localVarPath = "/v2/signature/signhashsessioninfo".replaceAll("\\{format\\}","json");

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

        GenericType<SignHashSessionInfoResponse> localVarReturnType = new GenericType<SignHashSessionInfoResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Report an error from the tsp to docusign
   * 
   * @param updateTransactionRequest  (optional)
   * @return UpdateTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateTransactionResponse updateTransaction(UpdateTransactionRequest updateTransactionRequest) throws ApiException {
    Object localVarPostBody = updateTransactionRequest;
    
    // create path and map variables
    String localVarPath = "/v2/signature/updatetransaction".replaceAll("\\{format\\}","json");

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

        GenericType<UpdateTransactionResponse> localVarReturnType = new GenericType<UpdateTransactionResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
