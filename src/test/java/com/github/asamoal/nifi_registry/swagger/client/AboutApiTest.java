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

import com.github.asamoal.nifi_registry.swagger.client.model.RegistryAbout;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AboutApi
 */
@Ignore
public class AboutApiTest {

    private final AboutApi api = new AboutApi();

    /**
     * Get version
     *
     * Gets the NiFi Registry version.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVersionTest() throws Exception {
        RegistryAbout response = api.getVersion();

        // TODO: test validations
    }
}
