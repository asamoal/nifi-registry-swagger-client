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
 * BundleVersionDependency
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class BundleVersionDependency {
  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("artifactId")
  private String artifactId = null;

  @SerializedName("version")
  private String version = null;

  public BundleVersionDependency groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id of the bundle dependency
   * @return groupId
  **/
  @Schema(description = "The group id of the bundle dependency")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public BundleVersionDependency artifactId(String artifactId) {
    this.artifactId = artifactId;
    return this;
  }

   /**
   * The artifact id of the bundle dependency
   * @return artifactId
  **/
  @Schema(description = "The artifact id of the bundle dependency")
  public String getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(String artifactId) {
    this.artifactId = artifactId;
  }

  public BundleVersionDependency version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the bundle dependency
   * @return version
  **/
  @Schema(description = "The version of the bundle dependency")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleVersionDependency bundleVersionDependency = (BundleVersionDependency) o;
    return Objects.equals(this.groupId, bundleVersionDependency.groupId) &&
        Objects.equals(this.artifactId, bundleVersionDependency.artifactId) &&
        Objects.equals(this.version, bundleVersionDependency.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, artifactId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleVersionDependency {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
