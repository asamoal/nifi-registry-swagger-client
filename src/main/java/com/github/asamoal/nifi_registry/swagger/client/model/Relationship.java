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
 * Relationship
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T16:35:44.644520+02:00[Europe/Berlin]")
public class Relationship {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("autoTerminated")
  private Boolean autoTerminated = null;

  public Relationship name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the relationship
   * @return name
  **/
  @Schema(description = "The name of the relationship")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Relationship description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the relationship
   * @return description
  **/
  @Schema(description = "The description of the relationship")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Relationship autoTerminated(Boolean autoTerminated) {
    this.autoTerminated = autoTerminated;
    return this;
  }

   /**
   * Whether or not the relationship is auto-terminated by default
   * @return autoTerminated
  **/
  @Schema(description = "Whether or not the relationship is auto-terminated by default")
  public Boolean isAutoTerminated() {
    return autoTerminated;
  }

  public void setAutoTerminated(Boolean autoTerminated) {
    this.autoTerminated = autoTerminated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationship relationship = (Relationship) o;
    return Objects.equals(this.name, relationship.name) &&
        Objects.equals(this.description, relationship.description) &&
        Objects.equals(this.autoTerminated, relationship.autoTerminated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, autoTerminated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    autoTerminated: ").append(toIndentedString(autoTerminated)).append("\n");
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
