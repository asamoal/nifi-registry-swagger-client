/*
 * Apache NiFi Registry REST API
 * The REST API provides an interface to a registry with operations for saving, versioning, reading NiFi flows and components.
 *
 * OpenAPI spec version: 1.20.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi_registry.swagger.client;

import com.github.asamoal.nifi_registry.swagger.client.model.CurrentUser;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccessApi
 */
@Ignore
public class AccessApiTest {

    private final AccessApi api = new AccessApi();

    /**
     * Create token trying all providers
     *
     * Creates a token for accessing the REST API via auto-detected method of verifying client identity claim credentials. The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenByTryingAllProvidersTest() throws Exception {
        String response = api.createAccessTokenByTryingAllProviders();

        // TODO: test validations
    }
    /**
     * Create token using basic auth
     *
     * Creates a token for accessing the REST API via username/password. The user credentials must be passed in standard HTTP Basic Auth format. That is: &#x27;Authorization: Basic &lt;credentials&gt;&#x27;, where &lt;credentials&gt; is the base64 encoded value of &#x27;&lt;username&gt;:&lt;password&gt;&#x27;. The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenUsingBasicAuthCredentialsTest() throws Exception {
        String response = api.createAccessTokenUsingBasicAuthCredentials();

        // TODO: test validations
    }
    /**
     * Create token using identity provider
     *
     * Creates a token for accessing the REST API via a custom identity provider. The user credentials must be passed in a format understood by the custom identity provider, e.g., a third-party auth token in an HTTP header. The exact format of the user credentials expected by the custom identity provider can be discovered by &#x27;GET /access/token/identity-provider/usage&#x27;. The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenUsingIdentityProviderCredentialsTest() throws Exception {
        String response = api.createAccessTokenUsingIdentityProviderCredentials();

        // TODO: test validations
    }
    /**
     * Create token using kerberos
     *
     * Creates a token for accessing the REST API via Kerberos Service Tickets or SPNEGO Tokens (which includes Kerberos Service Tickets). The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenUsingKerberosTicketTest() throws Exception {
        String response = api.createAccessTokenUsingKerberosTicket();

        // TODO: test validations
    }
    /**
     * Get access status
     *
     * Returns the current client&#x27;s authenticated identity and permissions to top-level resources
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccessStatusTest() throws Exception {
        CurrentUser response = api.getAccessStatus();

        // TODO: test validations
    }
    /**
     * Get identity provider usage
     *
     * Provides a description of how the currently configured identity provider expects credentials to be passed to POST /access/token/identity-provider
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIdentityProviderUsageInstructionsTest() throws Exception {
        String response = api.getIdentityProviderUsageInstructions();

        // TODO: test validations
    }
    /**
     * Performs a logout for other providers that have been issued a JWT.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void logoutTest() throws Exception {
        api.logout();

        // TODO: test validations
    }
    /**
     * Completes the logout sequence.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void logoutCompleteTest() throws Exception {
        api.logoutComplete();

        // TODO: test validations
    }
    /**
     * Redirect/callback URI for processing the result of the OpenId Connect login sequence.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void oidcCallbackTest() throws Exception {
        api.oidcCallback();

        // TODO: test validations
    }
    /**
     * Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void oidcExchangeTest() throws Exception {
        String response = api.oidcExchange();

        // TODO: test validations
    }
    /**
     * Performs a logout in the OpenId Provider.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void oidcLogoutTest() throws Exception {
        api.oidcLogout();

        // TODO: test validations
    }
    /**
     * Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void oidcLogoutCallbackTest() throws Exception {
        api.oidcLogoutCallback();

        // TODO: test validations
    }
    /**
     * Initiates a request to authenticate through the configured OpenId Connect provider.
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void oidcRequestTest() throws Exception {
        api.oidcRequest();

        // TODO: test validations
    }
    /**
     * Test identity provider
     *
     * Tests the format of the credentials against this identity provider without preforming authentication on the credentials to validate them. The user credentials should be passed in a format understood by the custom identity provider as defined by &#x27;GET /access/token/identity-provider/usage&#x27;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testIdentityProviderRecognizesCredentialsFormatTest() throws Exception {
        String response = api.testIdentityProviderRecognizesCredentialsFormat();

        // TODO: test validations
    }
}
