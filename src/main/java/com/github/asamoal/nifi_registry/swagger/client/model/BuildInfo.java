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
 * BuildInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T16:35:44.644520+02:00[Europe/Berlin]")
public class BuildInfo {
  @SerializedName("buildTool")
  private String buildTool = null;

  @SerializedName("buildFlags")
  private String buildFlags = null;

  @SerializedName("buildBranch")
  private String buildBranch = null;

  @SerializedName("buildTag")
  private String buildTag = null;

  @SerializedName("buildRevision")
  private String buildRevision = null;

  @SerializedName("built")
  private Long built = null;

  @SerializedName("builtBy")
  private String builtBy = null;

  public BuildInfo buildTool(String buildTool) {
    this.buildTool = buildTool;
    return this;
  }

   /**
   * The tool used to build the version of the bundle
   * @return buildTool
  **/
  @Schema(description = "The tool used to build the version of the bundle")
  public String getBuildTool() {
    return buildTool;
  }

  public void setBuildTool(String buildTool) {
    this.buildTool = buildTool;
  }

  public BuildInfo buildFlags(String buildFlags) {
    this.buildFlags = buildFlags;
    return this;
  }

   /**
   * The flags used to build the version of the bundle
   * @return buildFlags
  **/
  @Schema(description = "The flags used to build the version of the bundle")
  public String getBuildFlags() {
    return buildFlags;
  }

  public void setBuildFlags(String buildFlags) {
    this.buildFlags = buildFlags;
  }

  public BuildInfo buildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
    return this;
  }

   /**
   * The branch used to build the version of the bundle
   * @return buildBranch
  **/
  @Schema(description = "The branch used to build the version of the bundle")
  public String getBuildBranch() {
    return buildBranch;
  }

  public void setBuildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
  }

  public BuildInfo buildTag(String buildTag) {
    this.buildTag = buildTag;
    return this;
  }

   /**
   * The tag used to build the version of the bundle
   * @return buildTag
  **/
  @Schema(description = "The tag used to build the version of the bundle")
  public String getBuildTag() {
    return buildTag;
  }

  public void setBuildTag(String buildTag) {
    this.buildTag = buildTag;
  }

  public BuildInfo buildRevision(String buildRevision) {
    this.buildRevision = buildRevision;
    return this;
  }

   /**
   * The revision used to build the version of the bundle
   * @return buildRevision
  **/
  @Schema(description = "The revision used to build the version of the bundle")
  public String getBuildRevision() {
    return buildRevision;
  }

  public void setBuildRevision(String buildRevision) {
    this.buildRevision = buildRevision;
  }

  public BuildInfo built(Long built) {
    this.built = built;
    return this;
  }

   /**
   * The timestamp the version of the bundle was built
   * @return built
  **/
  @Schema(description = "The timestamp the version of the bundle was built")
  public Long getBuilt() {
    return built;
  }

  public void setBuilt(Long built) {
    this.built = built;
  }

  public BuildInfo builtBy(String builtBy) {
    this.builtBy = builtBy;
    return this;
  }

   /**
   * The identity of the user that performed the build
   * @return builtBy
  **/
  @Schema(description = "The identity of the user that performed the build")
  public String getBuiltBy() {
    return builtBy;
  }

  public void setBuiltBy(String builtBy) {
    this.builtBy = builtBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildInfo buildInfo = (BuildInfo) o;
    return Objects.equals(this.buildTool, buildInfo.buildTool) &&
        Objects.equals(this.buildFlags, buildInfo.buildFlags) &&
        Objects.equals(this.buildBranch, buildInfo.buildBranch) &&
        Objects.equals(this.buildTag, buildInfo.buildTag) &&
        Objects.equals(this.buildRevision, buildInfo.buildRevision) &&
        Objects.equals(this.built, buildInfo.built) &&
        Objects.equals(this.builtBy, buildInfo.builtBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildTool, buildFlags, buildBranch, buildTag, buildRevision, built, builtBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildInfo {\n");
    
    sb.append("    buildTool: ").append(toIndentedString(buildTool)).append("\n");
    sb.append("    buildFlags: ").append(toIndentedString(buildFlags)).append("\n");
    sb.append("    buildBranch: ").append(toIndentedString(buildBranch)).append("\n");
    sb.append("    buildTag: ").append(toIndentedString(buildTag)).append("\n");
    sb.append("    buildRevision: ").append(toIndentedString(buildRevision)).append("\n");
    sb.append("    built: ").append(toIndentedString(built)).append("\n");
    sb.append("    builtBy: ").append(toIndentedString(builtBy)).append("\n");
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
