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
 * VersionedFlowSnapshotMetadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class VersionedFlowSnapshotMetadata {
  @SerializedName("link")
  private JaxbLink link = null;

  @SerializedName("bucketIdentifier")
  private String bucketIdentifier = null;

  @SerializedName("flowIdentifier")
  private String flowIdentifier = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("comments")
  private String comments = null;

  public VersionedFlowSnapshotMetadata link(JaxbLink link) {
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

  public VersionedFlowSnapshotMetadata bucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
    return this;
  }

   /**
   * The identifier of the bucket this snapshot belongs to.
   * @return bucketIdentifier
  **/
  @Schema(required = true, description = "The identifier of the bucket this snapshot belongs to.")
  public String getBucketIdentifier() {
    return bucketIdentifier;
  }

  public void setBucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
  }

  public VersionedFlowSnapshotMetadata flowIdentifier(String flowIdentifier) {
    this.flowIdentifier = flowIdentifier;
    return this;
  }

   /**
   * The identifier of the flow this snapshot belongs to.
   * @return flowIdentifier
  **/
  @Schema(required = true, description = "The identifier of the flow this snapshot belongs to.")
  public String getFlowIdentifier() {
    return flowIdentifier;
  }

  public void setFlowIdentifier(String flowIdentifier) {
    this.flowIdentifier = flowIdentifier;
  }

  public VersionedFlowSnapshotMetadata version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version of this snapshot of the flow.
   * minimum: -1
   * @return version
  **/
  @Schema(required = true, description = "The version of this snapshot of the flow.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

   /**
   * The timestamp when the flow was saved, as milliseconds since epoch.
   * minimum: 1
   * @return timestamp
  **/
  @Schema(description = "The timestamp when the flow was saved, as milliseconds since epoch.")
  public Long getTimestamp() {
    return timestamp;
  }

   /**
   * The user that created this snapshot of the flow.
   * @return author
  **/
  @Schema(description = "The user that created this snapshot of the flow.")
  public String getAuthor() {
    return author;
  }

  public VersionedFlowSnapshotMetadata comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments provided by the user when creating the snapshot.
   * @return comments
  **/
  @Schema(description = "The comments provided by the user when creating the snapshot.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowSnapshotMetadata versionedFlowSnapshotMetadata = (VersionedFlowSnapshotMetadata) o;
    return Objects.equals(this.link, versionedFlowSnapshotMetadata.link) &&
        Objects.equals(this.bucketIdentifier, versionedFlowSnapshotMetadata.bucketIdentifier) &&
        Objects.equals(this.flowIdentifier, versionedFlowSnapshotMetadata.flowIdentifier) &&
        Objects.equals(this.version, versionedFlowSnapshotMetadata.version) &&
        Objects.equals(this.timestamp, versionedFlowSnapshotMetadata.timestamp) &&
        Objects.equals(this.author, versionedFlowSnapshotMetadata.author) &&
        Objects.equals(this.comments, versionedFlowSnapshotMetadata.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, bucketIdentifier, flowIdentifier, version, timestamp, author, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowSnapshotMetadata {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    bucketIdentifier: ").append(toIndentedString(bucketIdentifier)).append("\n");
    sb.append("    flowIdentifier: ").append(toIndentedString(flowIdentifier)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
