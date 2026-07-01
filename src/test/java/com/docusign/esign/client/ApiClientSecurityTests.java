package com.docusign.esign.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Security tests for ApiClient.
 * Verifies secure-by-default behavior, insecure factory, and proxy auth
 * controls.
 */
class ApiClientSecurityTests {

    private ApiClient client;

    @BeforeEach
    void setUp() {
        client = new ApiClient();
    }

    // ── Secure-by-default ──────────────────────────────────────────────

    @Nested
    @DisplayName("Secure-by-default constructor")
    class SecureDefaults {

        @Test
        @DisplayName("Default client does not allow insecure connections")
        void defaultClientIsSecure() {
            assertFalse(client.isAllowInsecureConnections());
        }

        @Test
        @DisplayName("Default base path uses HTTPS")
        void defaultBasePathIsHttps() {
            assertTrue(client.getBasePath().startsWith("https://"),
                    "Default base path must use HTTPS");
        }
    }

    // ── setBasePath validation ─────────────────────────────────────────

    @Nested
    @DisplayName("setBasePath HTTP rejection")
    class SetBasePathValidation {

        @Test
        @DisplayName("setBasePath rejects HTTP URL")
        void rejectsHttp() {
            assertThrows(IllegalArgumentException.class,
                    () -> client.setBasePath("http://localhost/restapi"));
        }

        @Test
        @DisplayName("setBasePath accepts HTTPS URL")
        void acceptsHttps() {
            assertDoesNotThrow(
                    () -> client.setBasePath("https://demo.docusign.net/restapi"));
        }

        @Test
        @DisplayName("setBasePath on insecure client accepts HTTP URL")
        void insecureClientAcceptsHttp() {
            ApiClient insecure = ApiClient.insecure();
            assertDoesNotThrow(
                    () -> insecure.setBasePath("http://localhost:8080/restapi"));
            assertEquals("http://localhost:8080/restapi", insecure.getBasePath());
        }

        @Test
        @DisplayName("setBasePath with perConnectionProxyAuth=true still rejects HTTP URL")
        void perConnectionProxyAuthDoesNotBypassHttpsCheck() {
            client.setPerConnectionProxyAuth(true);
            assertThrows(IllegalArgumentException.class,
                    () -> client.setBasePath("http://localhost/restapi"));
        }

        @Test
        @DisplayName("setBasePath accepts null without throwing")
        void acceptsNull() {
            assertDoesNotThrow(() -> client.setBasePath(null));
        }

        @Test
        @DisplayName("setBasePath rejects mixed-case HTTP scheme (HTTP://, Http://)")
        void rejectsMixedCaseHttpScheme() {
            assertThrows(IllegalArgumentException.class,
                    () -> client.setBasePath("HTTP://localhost/restapi"));
            assertThrows(IllegalArgumentException.class,
                    () -> client.setBasePath("Http://localhost/restapi"));
        }
    }

    // ── setOAuthBasePath validation ────────────────────────────────────

    @Nested
    @DisplayName("setOAuthBasePath HTTP rejection")
    class SetOAuthBasePathValidation {

        @Test
        @DisplayName("setOAuthBasePath rejects HTTP URL")
        void rejectsHttp() {
            assertThrows(IllegalArgumentException.class,
                    () -> client.setOAuthBasePath("http://localhost"));
        }

        @Test
        @DisplayName("setOAuthBasePath accepts bare hostname (no scheme)")
        void acceptsBareHostname() {
            assertDoesNotThrow(
                    () -> client.setOAuthBasePath("account-d.docusign.com"));
        }

        @Test
        @DisplayName("setOAuthBasePath accepts HTTPS URL")
        void acceptsHttps() {
            assertDoesNotThrow(
                    () -> client.setOAuthBasePath("https://account-d.docusign.com"));
        }

        @Test
        @DisplayName("setOAuthBasePath accepts null without throwing")
        void acceptsNull() {
            assertDoesNotThrow(() -> client.setOAuthBasePath(null));
        }

        @Test
        @DisplayName("setOAuthBasePath rejects mixed-case HTTP scheme (HTTP://, Http://)")
        void rejectsMixedCaseHttpScheme() {
            assertThrows(IllegalArgumentException.class,
                    () -> client.setOAuthBasePath("HTTP://localhost"));
            assertThrows(IllegalArgumentException.class,
                    () -> client.setOAuthBasePath("Http://localhost"));
        }

        @Test
        @DisplayName("setOAuthBasePath on insecure client accepts HTTP URL and stores the value")
        void insecureClientAcceptsHttp() throws Exception {
            ApiClient insecure = ApiClient.insecure();
            assertDoesNotThrow(() -> insecure.setOAuthBasePath("http://localhost"));

            Field oAuthBasePathField = ApiClient.class.getDeclaredField("oAuthBasePath");
            oAuthBasePathField.setAccessible(true);
            assertEquals("http://localhost", oAuthBasePathField.get(insecure));
        }
    }

    // ── String constructor validation ──────────────────────────────────

    @Nested
    @DisplayName("ApiClient(String) constructor HTTP rejection")
    class ConstructorValidation {

        @Test
        @DisplayName("ApiClient(String) rejects HTTP URL")
        void rejectsHttp() {
            assertThrows(IllegalArgumentException.class,
                    () -> new ApiClient("http://localhost/restapi"));
        }

        @Test
        @DisplayName("ApiClient(String) accepts HTTPS URL")
        void acceptsHttps() {
            assertDoesNotThrow(
                    () -> new ApiClient("https://demo.docusign.net/restapi"));
        }
    }

    // ── insecure() factory ─────────────────────────────────────────────

    @Nested
    @DisplayName("ApiClient.insecure() factory")
    class InsecureFactory {

        @Test
        @DisplayName("insecure() enables insecure connections")
        void insecureFactoryEnablesFlag() {
            ApiClient insecure = ApiClient.insecure();
            assertTrue(insecure.isAllowInsecureConnections());
        }

        @Test
        @DisplayName("insecure(basePath) allows HTTP URL")
        void insecureFactoryAllowsHttp() {
            ApiClient insecure = ApiClient.insecure("http://localhost:8080/restapi");
            assertTrue(insecure.isAllowInsecureConnections());
            assertEquals("http://localhost:8080/restapi", insecure.getBasePath());
        }

        @Test
        @DisplayName("insecure(basePath) allows HTTPS URL")
        void insecureFactoryAllowsHttps() {
            ApiClient insecure = ApiClient.insecure("https://demo.docusign.net/restapi");
            assertTrue(insecure.isAllowInsecureConnections());
            assertEquals("https://demo.docusign.net/restapi", insecure.getBasePath());
        }

        @Test
        @DisplayName("insecure() preserves backward-compatible JVM-wide proxy auth default")
        void insecureFactoryKeepsProxyAuthDefault() {
            ApiClient insecure = ApiClient.insecure();
            assertFalse(insecure.isPerConnectionProxyAuth());
        }

        @Test
        @DisplayName("insecure(null) does not throw")
        void insecureWithNullBasePathDoesNotThrow() {
            ApiClient insecure = assertDoesNotThrow(() -> ApiClient.insecure(null));
            assertTrue(insecure.isAllowInsecureConnections());
        }
    }

    // ── perConnectionProxyAuth ─────────────────────────────────────────

    @Nested
    @DisplayName("perConnectionProxyAuth backward compatibility and opt-in paths")
    class PerConnectionProxyAuth {

        @Test
        @DisplayName("Default is false (JVM-wide Authenticator for backward compat)")
        void defaultIsFalse() {
            assertFalse(client.isPerConnectionProxyAuth());
        }

        @Test
        @DisplayName("Setter enables per-connection proxy auth")
        void canBeEnabledViaSetter() {
            client.setPerConnectionProxyAuth(true);
            assertTrue(client.isPerConnectionProxyAuth());
        }

        @Test
        @DisplayName("Setter returns ApiClient for chaining")
        void returnsClientForChaining() {
            ApiClient result = client.setPerConnectionProxyAuth(true);
            assertSame(client, result);
        }

        @Test
        @DisplayName("ApiClient(boolean) constructor enables per-connection proxy auth at construction time")
        void booleanConstructorEnablesPerConnectionProxyAuth() {
            ApiClient proxyScopedClient = new ApiClient(true);

            assertTrue(proxyScopedClient.isPerConnectionProxyAuth());
            assertFalse(proxyScopedClient.isAllowInsecureConnections());
            assertTrue(proxyScopedClient.getBasePath().startsWith("https://"),
                    "Construction-time proxy auth opt-in must keep secure defaults");
        }

        @Test
        @DisplayName("ApiClient(boolean) constructor with false is equivalent to default constructor")
        void booleanConstructorFalseMatchesDefault() {
            ApiClient explicit = new ApiClient(false);

            assertFalse(explicit.isPerConnectionProxyAuth());
            assertFalse(explicit.isAllowInsecureConnections());
        }

        @Test
        @DisplayName("Enabling per-connection proxy auth via setter on OAuth-constructed client works")
        void oauthConstructorPlusSetterEnablesPerConnectionProxyAuth() {
            ApiClient proxyScopedClient = new ApiClient("account-d.docusign.com", new String[] { "docusignApiKey" });
            proxyScopedClient.setPerConnectionProxyAuth(true);

            assertTrue(proxyScopedClient.isPerConnectionProxyAuth());
            assertFalse(proxyScopedClient.isAllowInsecureConnections());
        }
    }

    // ── invokeAPI defense-in-depth ─────────────────────────────────────

    @Nested
    @DisplayName("invokeAPI defense-in-depth HTTPS guard")
    class InvokeApiGuard {

        @Test
        @DisplayName("invokeAPI rejects HTTP basePath even if field is set directly via reflection")
        void rejectsHttpViaReflection() throws Exception {
            // Bypass setBasePath validation via reflection to simulate a
            // scenario where basePath ends up as HTTP (e.g. deserialization)
            Field basePathField = ApiClient.class.getDeclaredField("basePath");
            basePathField.setAccessible(true);
            basePathField.set(client, "http://evil.example.com/restapi");

            ApiException ex = assertThrows(ApiException.class,
                    () -> client.invokeAPI("/test", "GET",
                            null, null, null,
                            new java.util.HashMap<>(), new java.util.HashMap<>(),
                            "application/json", "application/json",
                            new String[] {}, null));

            assertTrue(ex.getMessage().contains("HTTPS is required"),
                    "Expected HTTPS-required message but got: " + ex.getMessage());
        }

        @Test
        @DisplayName("insecure client guard flag is false — invokeAPI HTTPS check will not fire")
        void insecureClientGuardFlagIsFalse() throws Exception {
            ApiClient insecure = ApiClient.insecure();
            Field basePathField = ApiClient.class.getDeclaredField("basePath");
            basePathField.setAccessible(true);
            basePathField.set(insecure, "http://evil.example.com/restapi");

            assertTrue(insecure.isAllowInsecureConnections(),
                    "allowInsecureConnections must be true so the HTTPS guard condition evaluates to false");
        }
    }
}
