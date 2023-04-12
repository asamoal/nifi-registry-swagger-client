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

import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlow;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlowDifference;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlowSnapshot;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlowSnapshotMetadata;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BucketFlowsApi
 */
@Ignore
public class BucketFlowsApiTest {

    private final BucketFlowsApi api = new BucketFlowsApi();

    /**
     * Create flow
     *
     * Creates a flow in the given bucket. The flow id is created by the server and populated in the returned entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFlowTest() throws Exception {
        VersionedFlow body = null;
        String bucketId = null;
        VersionedFlow response = api.createFlow(body, bucketId);

        // TODO: test validations
    }
    /**
     * Create flow version
     *
     * Creates the next version of a flow. The version number of the object being created must be the next available version integer. Flow versions are immutable after they are created.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFlowVersionTest() throws Exception {
        VersionedFlowSnapshot body = null;
        String bucketId = null;
        String flowId = null;
        VersionedFlowSnapshot response = api.createFlowVersion(body, bucketId, flowId);

        // TODO: test validations
    }
    /**
     * Delete bucket flow
     *
     * Deletes a flow, including all saved versions of that flow.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteFlowTest() throws Exception {
        String version = null;
        String bucketId = null;
        String flowId = null;
        String clientId = null;
        VersionedFlow response = api.deleteFlow(version, bucketId, flowId, clientId);

        // TODO: test validations
    }
    /**
     * Exports specified bucket flow version content
     *
     * Exports the specified version of a flow, including the metadata and content of the flow.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void exportVersionedFlowTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        Integer versionNumber = null;
        VersionedFlowSnapshot response = api.exportVersionedFlow(bucketId, flowId, versionNumber);

        // TODO: test validations
    }
    /**
     * Get bucket flow
     *
     * Retrieves the flow with the given id in the given bucket.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFlowTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        VersionedFlow response = api.getFlow(bucketId, flowId);

        // TODO: test validations
    }
    /**
     * Get bucket flow diff
     *
     * Computes the differences between two given versions of a flow.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFlowDiffTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        Integer versionA = null;
        Integer versionB = null;
        VersionedFlowDifference response = api.getFlowDiff(bucketId, flowId, versionA, versionB);

        // TODO: test validations
    }
    /**
     * Get bucket flow version
     *
     * Gets the given version of a flow, including the metadata and content for the version.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFlowVersionTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        Integer versionNumber = null;
        VersionedFlowSnapshot response = api.getFlowVersion(bucketId, flowId, versionNumber);

        // TODO: test validations
    }
    /**
     * Get bucket flow versions
     *
     * Gets summary information for all versions of a flow. Versions are ordered newest-&gt;oldest.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFlowVersionsTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        List<VersionedFlowSnapshotMetadata> response = api.getFlowVersions(bucketId, flowId);

        // TODO: test validations
    }
    /**
     * Get bucket flows
     *
     * Retrieves all flows in the given bucket.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFlowsTest() throws Exception {
        String bucketId = null;
        List<VersionedFlow> response = api.getFlows(bucketId);

        // TODO: test validations
    }
    /**
     * Get latest bucket flow version content
     *
     * Gets the latest version of a flow, including the metadata and content of the flow.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLatestFlowVersionTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        VersionedFlowSnapshot response = api.getLatestFlowVersion(bucketId, flowId);

        // TODO: test validations
    }
    /**
     * Get latest bucket flow version metadata
     *
     * Gets the metadata for the latest version of a flow.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLatestFlowVersionMetadataTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        VersionedFlowSnapshotMetadata response = api.getLatestFlowVersionMetadata(bucketId, flowId);

        // TODO: test validations
    }
    /**
     * Import flow version
     *
     * Import the next version of a flow. The version number of the object being created will be the next available version integer. Flow versions are immutable after they are created.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void importVersionedFlowTest() throws Exception {
        String bucketId = null;
        String flowId = null;
        VersionedFlowSnapshot body = null;
        String comments = null;
        VersionedFlowSnapshot response = api.importVersionedFlow(bucketId, flowId, body, comments);

        // TODO: test validations
    }
    /**
     * Update bucket flow
     *
     * Updates the flow with the given id in the given bucket.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateFlowTest() throws Exception {
        VersionedFlow body = null;
        String bucketId = null;
        String flowId = null;
        VersionedFlow response = api.updateFlow(body, bucketId, flowId);

        // TODO: test validations
    }
}
