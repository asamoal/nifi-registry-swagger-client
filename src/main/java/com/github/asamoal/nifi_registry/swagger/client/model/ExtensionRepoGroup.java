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
import com.github.asamoal.nifi_registry.swagger.client.model.JaxbLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ExtensionRepoGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class ExtensionRepoGroup {
  @SerializedName("link")
  private JaxbLink link = null;

  @SerializedName("bucketName")
  private String bucketName = null;

  @SerializedName("groupId")
  private String groupId = null;

  public ExtensionRepoGroup link(JaxbLink link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public JaxbLink getLink() {
    return link;
  }

  public void setLink(JaxbLink link) {
    this.link = link;
  }

  public ExtensionRepoGroup bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * The bucket name
   * @return bucketName
  **/
  @Schema(description = "The bucket name")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public ExtensionRepoGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id
   * @return groupId
  **/
  @Schema(description = "The group id")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionRepoGroup extensionRepoGroup = (ExtensionRepoGroup) o;
    return Objects.equals(this.link, extensionRepoGroup.link) &&
        Objects.equals(this.bucketName, extensionRepoGroup.bucketName) &&
        Objects.equals(this.groupId, extensionRepoGroup.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, bucketName, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionRepoGroup {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
