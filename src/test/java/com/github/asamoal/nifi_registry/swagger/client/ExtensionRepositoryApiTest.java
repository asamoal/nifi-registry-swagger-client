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

import com.github.asamoal.nifi_registry.swagger.client.model.Extension;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionMetadata;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionRepoArtifact;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionRepoBucket;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionRepoGroup;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionRepoVersion;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionRepoVersionSummary;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ExtensionRepositoryApi
 */
@Ignore
public class ExtensionRepositoryApiTest {

    private final ExtensionRepositoryApi api = new ExtensionRepositoryApi();

    /**
     * Get extension repo artifacts
     *
     * Gets the artifacts in the extension repository in the given bucket and group.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoArtifactsTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        List<ExtensionRepoArtifact> response = api.getExtensionRepoArtifacts(bucketName, groupId);

        // TODO: test validations
    }
    /**
     * Get extension repo buckets
     *
     * Gets the names of the buckets the current user is authorized for in order to browse the repo by bucket.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoBucketsTest() throws Exception {
        List<ExtensionRepoBucket> response = api.getExtensionRepoBuckets();

        // TODO: test validations
    }
    /**
     * Get extension repo groups
     *
     * Gets the groups in the extension repository in the given bucket.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoGroupsTest() throws Exception {
        String bucketName = null;
        List<ExtensionRepoGroup> response = api.getExtensionRepoGroups(bucketName);

        // TODO: test validations
    }
    /**
     * Get extension repo version
     *
     * Gets information about the version in the given bucket, group, and artifact.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        ExtensionRepoVersion response = api.getExtensionRepoVersion(bucketName, groupId, artifactId, version);

        // TODO: test validations
    }
    /**
     * Get extension repo version content
     *
     * Gets the binary content of the bundle with the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionContentTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        List<byte[]> response = api.getExtensionRepoVersionContent(bucketName, groupId, artifactId, version);

        // TODO: test validations
    }
    /**
     * Get extension repo extension
     *
     * Gets information about the extension with the given name in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionExtensionTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        String name = null;
        Extension response = api.getExtensionRepoVersionExtension(bucketName, groupId, artifactId, version, name);

        // TODO: test validations
    }
    /**
     * Get extension repo extension details
     *
     * Gets the additional details documentation for the extension with the given name in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionExtensionAdditionalDetailsDocsTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        String name = null;
        String response = api.getExtensionRepoVersionExtensionAdditionalDetailsDocs(bucketName, groupId, artifactId, version, name);

        // TODO: test validations
    }
    /**
     * Get extension repo extension docs
     *
     * Gets the documentation for the extension with the given name in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionExtensionDocsTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        String name = null;
        String response = api.getExtensionRepoVersionExtensionDocs(bucketName, groupId, artifactId, version, name);

        // TODO: test validations
    }
    /**
     * Get extension repo extensions
     *
     * Gets information about the extensions in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionExtensionsTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        List<ExtensionMetadata> response = api.getExtensionRepoVersionExtensions(bucketName, groupId, artifactId, version);

        // TODO: test validations
    }
    /**
     * Get extension repo version checksum
     *
     * Gets the hex representation of the SHA-256 digest for the binary content of the bundle with the given bucket, group, artifact, and version.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionSha256Test() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        String version = null;
        String response = api.getExtensionRepoVersionSha256(bucketName, groupId, artifactId, version);

        // TODO: test validations
    }
    /**
     * Get extension repo versions
     *
     * Gets the versions in the extension repository for the given bucket, group, and artifact.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExtensionRepoVersionsTest() throws Exception {
        String bucketName = null;
        String groupId = null;
        String artifactId = null;
        List<ExtensionRepoVersionSummary> response = api.getExtensionRepoVersions(bucketName, groupId, artifactId);

        // TODO: test validations
    }
    /**
     * Get global extension repo version checksum
     *
     * Gets the hex representation of the SHA-256 digest for the binary content with the given bucket, group, artifact, and version. Since the same group-artifact-version can exist in multiple buckets, this will return the checksum of the first one returned. This will be consistent since the checksum must be the same when existing in multiple buckets.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGlobalExtensionRepoVersionSha256Test() throws Exception {
        String groupId = null;
        String artifactId = null;
        String version = null;
        String response = api.getGlobalExtensionRepoVersionSha256(groupId, artifactId, version);

        // TODO: test validations
    }
}
