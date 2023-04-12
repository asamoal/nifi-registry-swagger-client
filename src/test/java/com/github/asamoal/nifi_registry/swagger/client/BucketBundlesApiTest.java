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

import com.github.asamoal.nifi_registry.swagger.client.model.BundleVersion;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionBundle;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BucketBundlesApi
 */
@Ignore
public class BucketBundlesApiTest {

    private final BucketBundlesApi api = new BucketBundlesApi();

    /**
     * Create extension bundle version
     *
     * Creates a version of an extension bundle by uploading a binary artifact. If an extension bundle already exists in the given bucket with the same group id and artifact id as that of the bundle being uploaded, then it will be added as a new version to the existing bundle. If an extension bundle does not already exist in the given bucket with the same group id and artifact id, then a new extension bundle will be created and this version will be added to the new bundle. Client&#x27;s may optionally supply a SHA-256 in hex format through the multi-part form field &#x27;sha256&#x27;. If supplied, then this value will be compared against the SHA-256 computed by the server, and the bundle will be rejected if the values do not match. If not supplied, the bundle will be accepted, but will be marked to indicate that the client did not supply a SHA-256 during creation.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createExtensionBundleVersionTest() throws Exception {
        String bucketId = null;
        String bundleType = null;
        BundleVersion response = api.createExtensionBundleVersion(bucketId, bundleType);

        // TODO: test validations
    }
    /**
     * Get extension bundles by bucket
     *
     *   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionBundlesTest() throws Exception {
        String bucketId = null;
        List<ExtensionBundle> response = api.getExtensionBundles(bucketId);

        // TODO: test validations
    }
}
