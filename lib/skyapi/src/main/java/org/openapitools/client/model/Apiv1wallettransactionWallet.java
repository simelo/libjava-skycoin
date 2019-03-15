/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.25.1
 * Contact: skycoin.doe@example.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Apiv1wallettransactionWallet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-14T21:13:49.839099-04:00[America/Havana]")
public class Apiv1wallettransactionWallet {
  public static final String SERIALIZED_NAME_UNSPENTS = "unspents";
  @SerializedName(SERIALIZED_NAME_UNSPENTS)
  private List<String> unspents = null;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public Apiv1wallettransactionWallet unspents(List<String> unspents) {
    this.unspents = unspents;
    return this;
  }

  public Apiv1wallettransactionWallet addUnspentsItem(String unspentsItem) {
    if (this.unspents == null) {
      this.unspents = new ArrayList<String>();
    }
    this.unspents.add(unspentsItem);
    return this;
  }

   /**
   * Get unspents
   * @return unspents
  **/
  @ApiModelProperty(value = "")
  public List<String> getUnspents() {
    return unspents;
  }

  public void setUnspents(List<String> unspents) {
    this.unspents = unspents;
  }

  public Apiv1wallettransactionWallet addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Apiv1wallettransactionWallet addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public Apiv1wallettransactionWallet password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Apiv1wallettransactionWallet id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1wallettransactionWallet apiv1wallettransactionWallet = (Apiv1wallettransactionWallet) o;
    return Objects.equals(this.unspents, apiv1wallettransactionWallet.unspents) &&
        Objects.equals(this.addresses, apiv1wallettransactionWallet.addresses) &&
        Objects.equals(this.password, apiv1wallettransactionWallet.password) &&
        Objects.equals(this.id, apiv1wallettransactionWallet.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unspents, addresses, password, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1wallettransactionWallet {\n");
    
    sb.append("    unspents: ").append(toIndentedString(unspents)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
