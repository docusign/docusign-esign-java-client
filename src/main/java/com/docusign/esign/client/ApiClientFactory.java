package com.docusign.esign.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import java.text.DateFormat;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Provides ways to use {@link ApiClient} instances with shared (reusable) resource pool
 * ({@link Client} and {@link ObjectMapper}) in thread-safe manner.
 */
public class ApiClientFactory {
  private static final JSON json = new JSON();
  private final Client client;
  private final Consumer<ApiClient> preconfigureApiClient;

  public ApiClientFactory() {
    this(false);
  }

  public ApiClientFactory(boolean debugging) {
    this(debugging, o -> {}, o -> {});
  }

  public ApiClientFactory(
          boolean debugging,
          Consumer<ClientConfig> preconfigureHttpClient,
          Consumer<ApiClient> preconfigureApiClient
  ) {
    this.client = HttpClientFactory.buildHttpClient(debugging, json, preconfigureHttpClient);
    this.preconfigureApiClient = preconfigureApiClient;
  }

  /**
   * Execute {@code operation} against a new preconfigured {@link ApiClient} instance
   * initialized with shared reusable resource pool.
   * <br>
   * <b>Important</b>: provided {@link ApiClient} instance should not be used from multiple threads!
   * Each thread should call {@code execute} to operate on its own instance.
   *
   * @param operation lambda function representing the operation.
   * @param <T>       the operation return type
   */
  public <T> T execute(Function<ApiClient, T> operation) {
    LimitedApiClient apiClient = new LimitedApiClient(json, client);
    preconfigureApiClient.accept(apiClient);
    return operation.apply(apiClient);
  }

  // ApiClient extension with a number of forbidden APIs that can potentially cause unsafe/unexpected
  // mutations against the reusable resource pool. This is to guarantee safe usage.
  private static final class LimitedApiClient extends ApiClient {
    LimitedApiClient(JSON json, Client httpClient) {
      super(json, httpClient);
    }

    @Override
    protected Client buildHttpClient(boolean debugging) {
      // using the same instance all the way
      return httpClient;
    }

    @Override
    public ApiClient rebuildHttpClient() {
      return forbidden();
    }

    @Override
    public ObjectMapper getObjectMapper() {
      return forbidden();
    }

    @Override
    public ApiClient setObjectMapper(ObjectMapper objectMapper) {
      return forbidden();
    }

    @Override
    public JSON getJSON() {
      return forbidden();
    }

    @Override
    public Client getHttpClient() {
      return forbidden();
    }

    @Override
    public ApiClient setDebugging(boolean debugging) {
      return forbidden();
    }

    @Override
    public ApiClient setHttpClient(Client httpClient) {
      return forbidden();
    }

    @Override
    public ApiClient setConnectTimeout(int connectionTimeout) {
      return forbidden();
    }

    @Override
    public ApiClient setReadTimeout(int readTimeout) {
      return forbidden();
    }

    @Override
    public ApiClient setDateFormat(DateFormat dateFormat) {
      return forbidden();
    }

    private static <T> T forbidden() {
      throw new UnsupportedOperationException("This method should not be used.");
    }
  }
}
