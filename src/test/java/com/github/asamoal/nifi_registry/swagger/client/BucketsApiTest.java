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

import com.github.asamoal.nifi_registry.swagger.client.model.Bucket;
import com.github.asamoal.nifi_registry.swagger.client.model.Fields;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BucketsApi
 */
@Ignore
public class BucketsApiTest {

    private final BucketsApi api = new BucketsApi();

    /**
     * Create bucket
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createBucketTest() throws Exception {
        Bucket body = null;
        Bucket response = api.createBucket(body);

        // TODO: test validations
    }
    /**
     * Delete bucket
     *
     * Deletes the bucket with the given id, along with all objects stored in the bucket
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteBucketTest() throws Exception {
        String version = null;
        String bucketId = null;
        String clientId = null;
        Bucket response = api.deleteBucket(version, bucketId, clientId);

        // TODO: test validations
    }
    /**
     * Get bucket fields
     *
     * Retrieves bucket field names for searching or sorting on buckets.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAvailableBucketFieldsTest() throws Exception {
        Fields response = api.getAvailableBucketFields();

        // TODO: test validations
    }
    /**
     * Get bucket
     *
     * Gets the bucket with the given id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBucketTest() throws Exception {
        String bucketId = null;
        Bucket response = api.getBucket(bucketId);

        // TODO: test validations
    }
    /**
     * Get all buckets
     *
     * The returned list will include only buckets for which the user is authorized.If the user is not authorized for any buckets, this returns an empty list.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBucketsTest() throws Exception {
        List<Bucket> response = api.getBuckets();

        // TODO: test validations
    }
    /**
     * Update bucket
     *
     * Updates the bucket with the given id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateBucketTest() throws Exception {
        Bucket body = null;
        String bucketId = null;
        Bucket response = api.updateBucket(body, bucketId);

        // TODO: test validations
    }
}
