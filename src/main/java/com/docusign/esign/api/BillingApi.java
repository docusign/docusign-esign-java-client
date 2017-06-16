package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.BillingInvoicesResponse;
import com.docusign.esign.model.BillingInvoice;
import com.docusign.esign.model.BillingInvoicesSummary;
import com.docusign.esign.model.BillingPaymentsResponse;
import com.docusign.esign.model.BillingPaymentResponse;
import com.docusign.esign.model.BillingPaymentRequest;
import com.docusign.esign.model.BillingPaymentItem;
import com.docusign.esign.model.AccountBillingPlanResponse;
import com.docusign.esign.model.BillingPlanUpdateResponse;
import com.docusign.esign.model.BillingPlanInformation;
import com.docusign.esign.model.PurchasedEnvelopesInformation;
import com.docusign.esign.model.BillingPlansResponse;
import com.docusign.esign.model.BillingPlanResponse;


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

  
  
  /// <summary>
  /// Get a List of Billing Invoices Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.\n\nPrivileges required: account administrator
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
   * Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.\n\nPrivileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @return BillingInvoicesResponse
   */ 
  public BillingInvoicesResponse listInvoices(String accountId) throws ApiException {
    return listInvoices(accountId, null);
  }
  
  
  /**
   * Get a List of Billing Invoices
   * Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.\n\nPrivileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.ListInvoicesOptions Options for modifying the method behavior.
   * @return BillingInvoicesResponse
   */
  public BillingInvoicesResponse listInvoices(String accountId, BillingApi.ListInvoicesOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listInvoices");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_invoices".replaceAll("\\{format\\}","json")
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

    
    GenericType<BillingInvoicesResponse> returnType = new GenericType<BillingInvoicesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Retrieves a billing invoice.
   * Retrieves the specified invoice. \n\n###### Note: If the `pdfAvailable` property in the response is set to *true*, you can download a PDF version of the invoice. To download the PDF, make the call again and change the value of the `Accept` property in the header to `Accept: application/pdf`.\n\nPrivileges required: account administrator\n\nThe response returns a list of charges and information about the charges. Quantities are usually shown as ‘unlimited’ or an integer. Amounts are shown in the currency set for the account.\n\n**Response**\nThe following table provides a description of the different `chargeName` property values. The information will grow as more chargeable items are added to the system.\n\n| chargeName | Description |\n| --- | --- |\n| id_check | ID Check Charge |\n| in_person_signing | In Person Signing charge |\n| envelopes Included | Sent Envelopes for the account |\n| age_verify | Age verification check |\n| ofac | OFAC Check |\n| id_confirm | ID confirmation check |\n| student_authentication | STAN PIN authentication check |\n| wet_sign_fax | Pages for returning signed documents by fax |\n| attachment_fax | Pages for returning attachments by fax |\n| phone_authentication | Phone authentication charge |\n| powerforms | PowerForm envelopes sent |\n| signer_payments | Payment processing charge |\n| outbound_fax | Send by fax charge |\n| bulk_recipient_envelopes | Bulk Recipient Envelopes sent |\n| sms_authentications | SMS authentication charge |\n| saml_authentications | SAML authentication charge |\n| express_signer_certificate | DocuSign Express Certificate charge |\n| personal_signer_certificate | Personal Signer Certificate charge |\n| safe_certificate | SAFE BioPharma Signer Certificate charge |\n| seats | Included active seats charge |\n| open_trust_certificate | OpenTrust Signer Certificate charge |
   * @param accountId The external account number (int) or account ID Guid.
   * @param invoiceId 
   * @param BillingApi.GetInvoiceOptions Options for modifying the method behavior.
   * @return BillingInvoice
   */
  public BillingInvoice getInvoice(String accountId, String invoiceId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getInvoice");
     }
     
     // verify the required parameter 'invoiceId' is set
     if (invoiceId == null) {
        throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getInvoice");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_invoices/{invoiceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()));

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

    
    GenericType<BillingInvoice> returnType = new GenericType<BillingInvoice>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Get a list of past due invoices.
   * Returns a list past due invoices for the account and notes if payment can be made through the REST API. \n\nPrivileges Required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.ListInvoicesPastDueOptions Options for modifying the method behavior.
   * @return BillingInvoicesSummary
   */
  public BillingInvoicesSummary listInvoicesPastDue(String accountId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listInvoicesPastDue");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_invoices_past_due".replaceAll("\\{format\\}","json")
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

    
    GenericType<BillingInvoicesSummary> returnType = new GenericType<BillingInvoicesSummary>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets payment information for one or more payments. Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days. \n\nPrivileges required: account administrator
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
   * Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days. \n\nPrivileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @return BillingPaymentsResponse
   */ 
  public BillingPaymentsResponse listPayments(String accountId) throws ApiException {
    return listPayments(accountId, null);
  }
  
  
  /**
   * Gets payment information for one or more payments.
   * Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days. \n\nPrivileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.ListPaymentsOptions Options for modifying the method behavior.
   * @return BillingPaymentsResponse
   */
  public BillingPaymentsResponse listPayments(String accountId, BillingApi.ListPaymentsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPayments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_payments".replaceAll("\\{format\\}","json")
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

    
    GenericType<BillingPaymentsResponse> returnType = new GenericType<BillingPaymentsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Posts a payment to a past due invoice.
   * Posts a payment to a past due invoice. \n\n###### Note: This can only be used if the `paymentAllowed` value for a past due invoice is true. This can be determined calling [ML:GetBillingInvoicesPastDue].\n\nThe response returns information for a single payment, if a payment ID was used in the endpoint, or a list of payments. If the from date or to date queries or payment ID are not used, the response returns payment information for the last 365 days. If the request was for a single payment ID, the `nextUri` and `previousUri` properties are not returned.\n\nPrivileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.MakePaymentOptions Options for modifying the method behavior.
   * @return BillingPaymentResponse
   */
  public BillingPaymentResponse makePayment(String accountId, BillingPaymentRequest billingPaymentRequest) throws ApiException {
  
    Object postBody = billingPaymentRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling makePayment");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_payments".replaceAll("\\{format\\}","json")
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

    
    GenericType<BillingPaymentResponse> returnType = new GenericType<BillingPaymentResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets billing payment information for a specific payment.
   * Retrieves the information for a specified payment. \n\nPrivileges required: account administrator
   * @param accountId The external account number (int) or account ID Guid.
   * @param paymentId 
   * @param BillingApi.GetPaymentOptions Options for modifying the method behavior.
   * @return BillingPaymentItem
   */
  public BillingPaymentItem getPayment(String accountId, String paymentId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPayment");
     }
     
     // verify the required parameter 'paymentId' is set
     if (paymentId == null) {
        throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getPayment");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_payments/{paymentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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

    
    GenericType<BillingPaymentItem> returnType = new GenericType<BillingPaymentItem>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Get Account Billing Plan Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.\n\nBy default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the `setting` set to **false**. \n\nResponse\n\nThe response returns the billing plan information, including the currency code, for the plan. The `billingPlan` and `succesorPlans` property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the `billingAddress` and `creditCardInformation` property values are the same as those shown in the [ML:Update Billing Plan] reference.\n\n###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible.
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
	 * When set to **true**, the `canUpgrade` and `renewalStatus` properities are included the response and an array of `supportedCountries` property is added to the `billingAddress` information. 
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
   * Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.\n\nBy default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the `setting` set to **false**. \n\nResponse\n\nThe response returns the billing plan information, including the currency code, for the plan. The `billingPlan` and `succesorPlans` property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the `billingAddress` and `creditCardInformation` property values are the same as those shown in the [ML:Update Billing Plan] reference.\n\n###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible.
   * @param accountId The external account number (int) or account ID Guid.
   * @return AccountBillingPlanResponse
   */ 
  public AccountBillingPlanResponse getPlan(String accountId) throws ApiException {
    return getPlan(accountId, null);
  }
  
  
  /**
   * Get Account Billing Plan
   * Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.\n\nBy default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the `setting` set to **false**. \n\nResponse\n\nThe response returns the billing plan information, including the currency code, for the plan. The `billingPlan` and `succesorPlans` property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the `billingAddress` and `creditCardInformation` property values are the same as those shown in the [ML:Update Billing Plan] reference.\n\n###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible.
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.GetPlanOptions Options for modifying the method behavior.
   * @return AccountBillingPlanResponse
   */
  public AccountBillingPlanResponse getPlan(String accountId, BillingApi.GetPlanOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPlan");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_plan".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_credit_card_information", options.includeCreditCardInformation));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_successor_plans", options.includeSuccessorPlans));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<AccountBillingPlanResponse> returnType = new GenericType<AccountBillingPlanResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
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
   * @param accountId The external account number (int) or account ID Guid.
   * @return BillingPlanUpdateResponse
   */ 
  public BillingPlanUpdateResponse updatePlan(String accountId, BillingPlanInformation billingPlanInformation) throws ApiException {
    return updatePlan(accountId, billingPlanInformation, null);
  }
  
  
  /**
   * Updates the account billing plan.
   * Updates the billing plan information, billing address, and credit card information for the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.UpdatePlanOptions Options for modifying the method behavior.
   * @return BillingPlanUpdateResponse
   */
  public BillingPlanUpdateResponse updatePlan(String accountId, BillingPlanInformation billingPlanInformation, BillingApi.UpdatePlanOptions options) throws ApiException {
  
    Object postBody = billingPlanInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePlan");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_plan".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "preview_billing_plan", options.previewBillingPlan));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<BillingPlanUpdateResponse> returnType = new GenericType<BillingPlanUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Reserverd: Purchase additional envelopes.
   * Reserved: At this time, this endpoint is limited to DocuSign internal use only. Completes the purchase of envelopes for your account. The actual purchase is done as part of an internal workflow interaction with an envelope vendor.
   * @param accountId The external account number (int) or account ID Guid.
   * @param BillingApi.PurchaseEnvelopesOptions Options for modifying the method behavior.
   * @return void
   */
  public void purchaseEnvelopes(String accountId, PurchasedEnvelopesInformation purchasedEnvelopesInformation) throws ApiException {
  
    Object postBody = purchasedEnvelopesInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling purchaseEnvelopes");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/billing_plan/purchased_envelopes".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Gets the list of available billing plans.
   * Retrieves a list of the billing plans associated with a distributor.
   * @param BillingApi.ListBillingPlansOptions Options for modifying the method behavior.
   * @return BillingPlansResponse
   */
  public BillingPlansResponse listBillingPlans() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/billing_plans".replaceAll("\\{format\\}","json");

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

    
    GenericType<BillingPlansResponse> returnType = new GenericType<BillingPlansResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Get the billing plan details.
   * Retrieves the billing plan details for the specified billing plan ID.
   * @param billingPlanId The ID of the billing plan being accessed.
   * @param BillingApi.GetBillingPlanOptions Options for modifying the method behavior.
   * @return BillingPlanResponse
   */
  public BillingPlanResponse getBillingPlan(String billingPlanId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'billingPlanId' is set
     if (billingPlanId == null) {
        throw new ApiException(400, "Missing the required parameter 'billingPlanId' when calling getBillingPlan");
     }
     
    // create path and map variables
    String path = "/v2/billing_plans/{billingPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingPlanId" + "\\}", apiClient.escapeString(billingPlanId.toString()));

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

    
    GenericType<BillingPlanResponse> returnType = new GenericType<BillingPlanResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
