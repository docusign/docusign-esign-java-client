package com.docusign.esign.client.auth;

import com.docusign.esign.client.Pair;
import java.util.List;
import java.util.Map;

/** ApiKeyAuth class. */
public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;

  private String apiKey;
  private String apiKeyPrefix;

  /**
   * ApiKeyAuth constructor.
   *
   * @param location Sets location
   * @param paramName Sets paramName
   */
  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
  }

  /**
   * getLocation method.
   *
   * @return String
   */
  public String getLocation() {
    return location;
  }

  /**
   * getParamName method.
   *
   * @return String
   */
  public String getParamName() {
    return paramName;
  }

  /**
   * getApiKey method.
   *
   * @return String
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * setApiKey method.
   *
   * @param apiKey The apiKey
   */
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * getApiKeyPrefix method.
   *
   * @return String
   */
  public String getApiKeyPrefix() {
    return apiKeyPrefix;
  }

  /**
   * setApiKeyPrefix method.
   *
   * @param apiKeyPrefix The apiKeyPrefix
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    this.apiKeyPrefix = apiKeyPrefix;
  }

  /**
   * applyToParams method.
   *
   * @param queryParams The query params
   * @param headerParams The header params
   */
  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (apiKey == null) {
      return;
    }
    String value;
    if (apiKeyPrefix != null) {
      value = apiKeyPrefix + " " + apiKey;
    } else {
      value = apiKey;
    }
    if ("query".equals(location)) {
      queryParams.add(new Pair(paramName, value));
    } else if ("header".equals(location)) {
      headerParams.put(paramName, value);
    }
  }
}
