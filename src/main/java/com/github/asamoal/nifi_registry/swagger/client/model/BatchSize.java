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
 * BatchSize
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class BatchSize {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("duration")
  private String duration = null;

  public BatchSize count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Preferred number of flow files to include in a transaction.
   * @return count
  **/
  @Schema(description = "Preferred number of flow files to include in a transaction.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BatchSize size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Preferred number of bytes to include in a transaction.
   * @return size
  **/
  @Schema(description = "Preferred number of bytes to include in a transaction.")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public BatchSize duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Preferred amount of time that a transaction should span.
   * @return duration
  **/
  @Schema(description = "Preferred amount of time that a transaction should span.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchSize batchSize = (BatchSize) o;
    return Objects.equals(this.count, batchSize.count) &&
        Objects.equals(this.size, batchSize.size) &&
        Objects.equals(this.duration, batchSize.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, size, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSize {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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