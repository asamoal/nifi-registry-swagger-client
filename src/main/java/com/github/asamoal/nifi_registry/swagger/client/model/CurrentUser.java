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
import com.github.asamoal.nifi_registry.swagger.client.model.ResourcePermissions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CurrentUser
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class CurrentUser {
  @SerializedName("identity")
  private String identity = null;

  @SerializedName("anonymous")
  private Boolean anonymous = null;

  @SerializedName("loginSupported")
  private Boolean loginSupported = null;

  @SerializedName("resourcePermissions")
  private ResourcePermissions resourcePermissions = null;

  @SerializedName("oidcloginSupported")
  private Boolean oidcloginSupported = null;

   /**
   * The identity of the current user
   * @return identity
  **/
  @Schema(description = "The identity of the current user")
  public String getIdentity() {
    return identity;
  }

   /**
   * Indicates if the current user is anonymous
   * @return anonymous
  **/
  @Schema(description = "Indicates if the current user is anonymous")
  public Boolean isAnonymous() {
    return anonymous;
  }

  public CurrentUser loginSupported(Boolean loginSupported) {
    this.loginSupported = loginSupported;
    return this;
  }

   /**
   * Indicates if the NiFi Registry instance supports logging in
   * @return loginSupported
  **/
  @Schema(description = "Indicates if the NiFi Registry instance supports logging in")
  public Boolean isLoginSupported() {
    return loginSupported;
  }

  public void setLoginSupported(Boolean loginSupported) {
    this.loginSupported = loginSupported;
  }

  public CurrentUser resourcePermissions(ResourcePermissions resourcePermissions) {
    this.resourcePermissions = resourcePermissions;
    return this;
  }

   /**
   * Get resourcePermissions
   * @return resourcePermissions
  **/
  @Schema(description = "")
  public ResourcePermissions getResourcePermissions() {
    return resourcePermissions;
  }

  public void setResourcePermissions(ResourcePermissions resourcePermissions) {
    this.resourcePermissions = resourcePermissions;
  }

  public CurrentUser oidcloginSupported(Boolean oidcloginSupported) {
    this.oidcloginSupported = oidcloginSupported;
    return this;
  }

   /**
   * Indicates if the NiFi Registry instance supports logging in with an OIDC provider
   * @return oidcloginSupported
  **/
  @Schema(description = "Indicates if the NiFi Registry instance supports logging in with an OIDC provider")
  public Boolean isOidcloginSupported() {
    return oidcloginSupported;
  }

  public void setOidcloginSupported(Boolean oidcloginSupported) {
    this.oidcloginSupported = oidcloginSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUser currentUser = (CurrentUser) o;
    return Objects.equals(this.identity, currentUser.identity) &&
        Objects.equals(this.anonymous, currentUser.anonymous) &&
        Objects.equals(this.loginSupported, currentUser.loginSupported) &&
        Objects.equals(this.resourcePermissions, currentUser.resourcePermissions) &&
        Objects.equals(this.oidcloginSupported, currentUser.oidcloginSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, anonymous, loginSupported, resourcePermissions, oidcloginSupported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUser {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    loginSupported: ").append(toIndentedString(loginSupported)).append("\n");
    sb.append("    resourcePermissions: ").append(toIndentedString(resourcePermissions)).append("\n");
    sb.append("    oidcloginSupported: ").append(toIndentedString(oidcloginSupported)).append("\n");
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