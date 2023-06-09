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

package com.github.asamoal.nifi_registry.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RegistryConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class RegistryConfiguration {
  @SerializedName("supportsManagedAuthorizer")
  private Boolean supportsManagedAuthorizer = null;

  @SerializedName("supportsConfigurableAuthorizer")
  private Boolean supportsConfigurableAuthorizer = null;

  @SerializedName("supportsConfigurableUsersAndGroups")
  private Boolean supportsConfigurableUsersAndGroups = null;

   /**
   * Whether this NiFi Registry supports a managed authorizer. Managed authorizers can visualize users, groups, and policies in the UI.
   * @return supportsManagedAuthorizer
  **/
  @Schema(description = "Whether this NiFi Registry supports a managed authorizer. Managed authorizers can visualize users, groups, and policies in the UI.")
  public Boolean isSupportsManagedAuthorizer() {
    return supportsManagedAuthorizer;
  }

   /**
   * Whether this NiFi Registry supports a configurable authorizer.
   * @return supportsConfigurableAuthorizer
  **/
  @Schema(description = "Whether this NiFi Registry supports a configurable authorizer.")
  public Boolean isSupportsConfigurableAuthorizer() {
    return supportsConfigurableAuthorizer;
  }

   /**
   * Whether this NiFi Registry supports configurable users and groups.
   * @return supportsConfigurableUsersAndGroups
  **/
  @Schema(description = "Whether this NiFi Registry supports configurable users and groups.")
  public Boolean isSupportsConfigurableUsersAndGroups() {
    return supportsConfigurableUsersAndGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryConfiguration registryConfiguration = (RegistryConfiguration) o;
    return Objects.equals(this.supportsManagedAuthorizer, registryConfiguration.supportsManagedAuthorizer) &&
        Objects.equals(this.supportsConfigurableAuthorizer, registryConfiguration.supportsConfigurableAuthorizer) &&
        Objects.equals(this.supportsConfigurableUsersAndGroups, registryConfiguration.supportsConfigurableUsersAndGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsManagedAuthorizer, supportsConfigurableAuthorizer, supportsConfigurableUsersAndGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryConfiguration {\n");
    
    sb.append("    supportsManagedAuthorizer: ").append(toIndentedString(supportsManagedAuthorizer)).append("\n");
    sb.append("    supportsConfigurableAuthorizer: ").append(toIndentedString(supportsConfigurableAuthorizer)).append("\n");
    sb.append("    supportsConfigurableUsersAndGroups: ").append(toIndentedString(supportsConfigurableUsersAndGroups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
