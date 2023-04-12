/*
 * Apache NiFi Registry REST API
 * The REST API provides an interface to a registry with operations for saving, versioning, reading NiFi flows and components.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi_registry.swagger.client;

import com.github.asamoal.nifi_registry.swagger.client.model.BucketItem;
import com.github.asamoal.nifi_registry.swagger.client.model.Fields;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ItemsApi
 */
@Ignore
public class ItemsApiTest {

    private final ItemsApi api = new ItemsApi();

    /**
     * Get item fields
     *
     * Retrieves the item field names for searching or sorting on bucket items.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAvailableBucketItemFieldsTest() throws Exception {
        Fields response = api.getAvailableBucketItemFields();

        // TODO: test validations
    }
    /**
     * Get all items
     *
     * Get items across all buckets. The returned items will include only items from buckets for which the user is authorized. If the user is not authorized to any buckets, an empty list will be returned.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsTest() throws Exception {
        List<BucketItem> response = api.getItems();

        // TODO: test validations
    }
    /**
     * Get bucket items
     *
     * Gets the items located in the given bucket.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsInBucketTest() throws Exception {
        String bucketId = null;
        List<BucketItem> response = api.getItemsInBucket(bucketId);

        // TODO: test validations
    }
}