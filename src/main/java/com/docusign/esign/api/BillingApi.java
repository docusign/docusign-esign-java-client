
package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;



public class BillingApi {
  private ApiClient apiClient;

  public BillingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Get the billing plan details.
   * Retrieves the billing plan details for the specified billing plan ID.
   * @param billingPlanId The ID of the billing plan being accessed. (required)
   * @return BillingPlanResponse
   * @throws ApiException if fails to make API call
   */
  public BillingPlanResponse getBillingPlan(String billingPlanId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'billingPlanId' is set
    if (billingPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingPlanId' when calling getBillingPlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/billing_plans/{billingPlanId}"
      .replaceAll("\\{" + "billingPlanId" + "\\}", apiClient.escapeString(billingPlanId.toString()));

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

    GenericType<BillingPlanResponse> localVarReturnType = new GenericType<BillingPlanResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get metadata for a given credit card.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return CreditCardInformation
   * @throws ApiException if fails to make API call
   */
  public CreditCardInformation getCreditCardInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getCreditCardInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_plan/credit_card"
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

    GenericType<CreditCardInformation> localVarReturnType = new GenericType<CreditCardInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns downgrade plan information for the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return DowngradRequestBillingInfoResponse
   * @throws ApiException if fails to make API call
   */
  public DowngradRequestBillingInfoResponse getDowngradeRequestBillingInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDowngradeRequestBillingInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_plan/downgrade"
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

    GenericType<DowngradRequestBillingInfoResponse> localVarReturnType = new GenericType<DowngradRequestBillingInfoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Retrieves a billing invoice.
   * Retrieves the specified invoice.   ###### Note: If the &#x60;pdfAvailable&#x60; property in the response is set to *true*, you can download a PDF version of the invoice. To download the PDF, make the call again and change the value of the &#x60;Accept&#x60; property in the header to &#x60;Accept: application/pdf&#x60;.  Privileges required: account administrator  The response returns a list of charges and information about the charges. Quantities are usually shown as &#39;unlimited&#39; or an integer. Amounts are shown in the currency set for the account.  **Response** The following table provides a description of the different &#x60;chargeName&#x60; property values. The information will grow as more chargeable items are added to the system.  | chargeName | Description | | --- | --- | | id_check | IDÃÂÃÂÃÂÃÂ Check Charge | | in_person_signing | In Person Signing charge | | envelopes Included | Sent Envelopes for the account | | age_verify | Age verification check | | ofac | OFAC Check | | id_confirm | ID confirmation check | | student_authentication | STAN PIN authentication check | | wet_sign_fax | Pages for returning signed documents by fax | | attachment_fax | Pages for returning attachments by fax | | phone_authentication | Phone authentication charge | | powerforms | PowerForm envelopes sent | | signer_payments | Payment processing charge | | outbound_fax | Send by fax charge | | bulk_recipient_envelopes | Bulk Recipient Envelopes sent | | sms_authentications | SMS authentication charge | | saml_authentications | SAML authentication charge | | express_signer_certificate | DocuSign Express Certificate charge | | personal_signer_certificate | Personal Signer Certificate charge | | safe_certificate | SAFE BioPharma Signer Certificate charge | | seats | Included active seats charge | | open_trust_certificate | OpenTrust Signer Certificate charge | 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param invoiceId  (required)
   * @return BillingInvoice
   * @throws ApiException if fails to make API call
   */
  public BillingInvoice getInvoice(String accountId, String invoiceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getInvoice");
    }
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_invoices/{invoiceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()));

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

    GenericType<BillingInvoice> localVarReturnType = new GenericType<BillingInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets billing payment information for a specific payment.
   * Retrieves the information for a specified payment.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param paymentId  (required)
   * @return BillingPaymentItem
   * @throws ApiException if fails to make API call
   */
  public BillingPaymentItem getPayment(String accountId, String paymentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPayment");
    }
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getPayment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_payments/{paymentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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

    GenericType<BillingPaymentItem> localVarReturnType = new GenericType<BillingPaymentItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get Account Billing Plan Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.  By default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the &#x60;setting&#x60; set to **false**.   Response  The response returns the billing plan information, including the currency code, for the plan. The &#x60;billingPlan&#x60; and &#x60;succesorPlans&#x60; property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the &#x60;billingAddress&#x60; and &#x60;creditCardInformation&#x60; property values are the same as those shown in the [ML:Update Billing Plan] reference.  ###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible. 
  /// </summary>
  public class GetPlanOptions
  {
  private String includeCreditCardInformation = null;
  private String includeMetadata = null;
  private String includeSuccessorPlans = null;
  /*
   * When set to **true**, excludes credit card information from the response. 
   */
  public void setIncludeCreditCardInformation(String includeCreditCardInformation) {
    this.includeCreditCardInformation = includeCreditCardInformation;
  }

  public String getIncludeCreditCardInformation() {
    return this.includeCreditCardInformation;
  }
  /*
   * When set to **true**, the &#x60;canUpgrade&#x60; and &#x60;renewalStatus&#x60; properities are included the response and an array of &#x60;supportedCountries&#x60; property is added to the &#x60;billingAddress&#x60; information.  
   */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  /*
   * When set to **true**, excludes successor information from the response. 
   */
  public void setIncludeSuccessorPlans(String includeSuccessorPlans) {
    this.includeSuccessorPlans = includeSuccessorPlans;
  }

  public String getIncludeSuccessorPlans() {
    return this.includeSuccessorPlans;
  }
  }

   /**
   * Get Account Billing Plan
   * Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.  By default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the &#x60;setting&#x60; set to **false**.   Response  The response returns the billing plan information, including the currency code, for the plan. The &#x60;billingPlan&#x60; and &#x60;succesorPlans&#x60; property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the &#x60;billingAddress&#x60; and &#x60;creditCardInformation&#x60; property values are the same as those shown in the [ML:Update Billing Plan] reference.  ###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountBillingPlanResponse
   */ 
  public AccountBillingPlanResponse getPlan(String accountId) throws ApiException {
    return getPlan(accountId, null);
  }

  /**
   * Get Account Billing Plan
   * Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.  By default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the &#x60;setting&#x60; set to **false**.   Response  The response returns the billing plan information, including the currency code, for the plan. The &#x60;billingPlan&#x60; and &#x60;succesorPlans&#x60; property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the &#x60;billingAddress&#x60; and &#x60;creditCardInformation&#x60; property values are the same as those shown in the [ML:Update Billing Plan] reference.  ###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountBillingPlanResponse
   * @throws ApiException if fails to make API call
   */
  public AccountBillingPlanResponse getPlan(String accountId, BillingApi.GetPlanOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_plan"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_credit_card_information", options.includeCreditCardInformation));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_successor_plans", options.includeSuccessorPlans));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountBillingPlanResponse> localVarReturnType = new GenericType<AccountBillingPlanResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the list of available billing plans.
   * Retrieves a list of the billing plans associated with a distributor.
   * @return BillingPlansResponse
   * @throws ApiException if fails to make API call
   */
  public BillingPlansResponse listBillingPlans() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/billing_plans";

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

    GenericType<BillingPlansResponse> localVarReturnType = new GenericType<BillingPlansResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get a List of Billing Invoices Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.  Privileges required: account administrator 
  /// </summary>
  public class ListInvoicesOptions
  {
  private String fromDate = null;
  private String toDate = null;
  /*
   * Specifies the date/time of the earliest invoice in the account to retrieve. 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * Specifies the date/time of the latest invoice in the account to retrieve. 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Get a List of Billing Invoices
   * Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.  Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BillingInvoicesResponse
   */ 
  public BillingInvoicesResponse listInvoices(String accountId) throws ApiException {
    return listInvoices(accountId, null);
  }

  /**
   * Get a List of Billing Invoices
   * Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.  Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BillingInvoicesResponse
   * @throws ApiException if fails to make API call
   */
  public BillingInvoicesResponse listInvoices(String accountId, BillingApi.ListInvoicesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_invoices"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BillingInvoicesResponse> localVarReturnType = new GenericType<BillingInvoicesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get a list of past due invoices.
   * Returns a list past due invoices for the account and notes if payment can be made through the REST API.   Privileges Required: account administrator
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BillingInvoicesSummary
   * @throws ApiException if fails to make API call
   */
  public BillingInvoicesSummary listInvoicesPastDue(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listInvoicesPastDue");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_invoices_past_due"
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

    GenericType<BillingInvoicesSummary> localVarReturnType = new GenericType<BillingInvoicesSummary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets payment information for one or more payments. Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days.   Privileges required: account administrator 
  /// </summary>
  public class ListPaymentsOptions
  {
  private String fromDate = null;
  private String toDate = null;
  /*
   * Specifies the date/time of the earliest payment in the account to retrieve. 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * Specifies the date/time of the latest payment in the account to retrieve. 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets payment information for one or more payments.
   * Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BillingPaymentsResponse
   */ 
  public BillingPaymentsResponse listPayments(String accountId) throws ApiException {
    return listPayments(accountId, null);
  }

  /**
   * Gets payment information for one or more payments.
   * Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BillingPaymentsResponse
   * @throws ApiException if fails to make API call
   */
  public BillingPaymentsResponse listPayments(String accountId, BillingApi.ListPaymentsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPayments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_payments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BillingPaymentsResponse> localVarReturnType = new GenericType<BillingPaymentsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Posts a payment to a past due invoice.
   * Posts a payment to a past due invoice.   ###### Note: This can only be used if the &#x60;paymentAllowed&#x60; value for a past due invoice is true. This can be determined calling [ML:GetBillingInvoicesPastDue].  The response returns information for a single payment, if a payment ID was used in the endpoint, or a list of payments. If the from date or to date queries or payment ID are not used, the response returns payment information for the last 365 days. If the request was for a single payment ID, the &#x60;nextUri&#x60; and &#x60;previousUri&#x60; properties are not returned.  Privileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param billingPaymentRequest  (optional)
   * @return BillingPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public BillingPaymentResponse makePayment(String accountId, BillingPaymentRequest billingPaymentRequest) throws ApiException {
    Object localVarPostBody = billingPaymentRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling makePayment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_payments"
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

    GenericType<BillingPaymentResponse> localVarReturnType = new GenericType<BillingPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Reserverd: Purchase additional envelopes.
   * Reserved: At this time, this endpoint is limited to DocuSign internal use only. Completes the purchase of envelopes for your account. The actual purchase is done as part of an internal workflow interaction with an envelope vendor.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param purchasedEnvelopesInformation  (optional)
   * @throws ApiException if fails to make API call
   */
  public void purchaseEnvelopes(String accountId, PurchasedEnvelopesInformation purchasedEnvelopesInformation) throws ApiException {
    Object localVarPostBody = purchasedEnvelopesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling purchaseEnvelopes");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_plan/purchased_envelopes"
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
  }

  /**
   * Queues downgrade billing plan request for an account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param downgradeBillingPlanInformation  (optional)
   * @return DowngradePlanUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public DowngradePlanUpdateResponse updateDowngradeAccountBillingPlan(String accountId, DowngradeBillingPlanInformation downgradeBillingPlanInformation) throws ApiException {
    Object localVarPostBody = downgradeBillingPlanInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDowngradeAccountBillingPlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_plan/downgrade"
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

    GenericType<DowngradePlanUpdateResponse> localVarReturnType = new GenericType<DowngradePlanUpdateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Updates the account billing plan. Updates the billing plan information, billing address, and credit card information for the specified account.
  /// </summary>
  public class UpdatePlanOptions
  {
  private String previewBillingPlan = null;
  /*
   * When set to **true**, updates the account using a preview billing plan. 
   */
  public void setPreviewBillingPlan(String previewBillingPlan) {
    this.previewBillingPlan = previewBillingPlan;
  }

  public String getPreviewBillingPlan() {
    return this.previewBillingPlan;
  }
  }

   /**
   * Updates the account billing plan.
   * Updates the billing plan information, billing address, and credit card information for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param billingPlanInformation  (optional)
   * @return BillingPlanUpdateResponse
   */ 
  public BillingPlanUpdateResponse updatePlan(String accountId, BillingPlanInformation billingPlanInformation) throws ApiException {
    return updatePlan(accountId, billingPlanInformation, null);
  }

  /**
   * Updates the account billing plan.
   * Updates the billing plan information, billing address, and credit card information for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param billingPlanInformation  (optional)
   * @param options for modifying the method behavior.
   * @return BillingPlanUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public BillingPlanUpdateResponse updatePlan(String accountId, BillingPlanInformation billingPlanInformation, BillingApi.UpdatePlanOptions options) throws ApiException {
    Object localVarPostBody = billingPlanInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_plan"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<BillingPlanUpdateResponse> localVarReturnType = new GenericType<BillingPlanUpdateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
