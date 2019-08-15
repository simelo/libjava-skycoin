/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * The version of the OpenAPI document: 0.27.0
 * Contact: contact@skycoin.net
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

/**
 * ApiV1PendingTxsTransactionOutputs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T01:04:10.695-04:00[America/Havana]")
public class ApiV1PendingTxsTransactionOutputs {
  public static final String SERIALIZED_NAME_UXID = "uxid";
  @SerializedName(SERIALIZED_NAME_UXID)
  private String uxid;

  public static final String SERIALIZED_NAME_DST = "dst";
  @SerializedName(SERIALIZED_NAME_DST)
  private String dst;

  public static final String SERIALIZED_NAME_COINS = "coins";
  @SerializedName(SERIALIZED_NAME_COINS)
  private String coins;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Long hours;

  public ApiV1PendingTxsTransactionOutputs uxid(String uxid) {
    this.uxid = uxid;
    return this;
  }

   /**
   * Get uxid
   * @return uxid
  **/
  @ApiModelProperty(value = "")
  public String getUxid() {
    return uxid;
  }

  public void setUxid(String uxid) {
    this.uxid = uxid;
  }

  public ApiV1PendingTxsTransactionOutputs dst(String dst) {
    this.dst = dst;
    return this;
  }

   /**
   * Get dst
   * @return dst
  **/
  @ApiModelProperty(value = "")
  public String getDst() {
    return dst;
  }

  public void setDst(String dst) {
    this.dst = dst;
  }

  public ApiV1PendingTxsTransactionOutputs coins(String coins) {
    this.coins = coins;
    return this;
  }

   /**
   * Get coins
   * @return coins
  **/
  @ApiModelProperty(value = "")
  public String getCoins() {
    return coins;
  }

  public void setCoins(String coins) {
    this.coins = coins;
  }

  public ApiV1PendingTxsTransactionOutputs hours(Long hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @ApiModelProperty(value = "")
  public Long getHours() {
    return hours;
  }

  public void setHours(Long hours) {
    this.hours = hours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1PendingTxsTransactionOutputs apiV1PendingTxsTransactionOutputs = (ApiV1PendingTxsTransactionOutputs) o;
    return Objects.equals(this.uxid, apiV1PendingTxsTransactionOutputs.uxid) &&
        Objects.equals(this.dst, apiV1PendingTxsTransactionOutputs.dst) &&
        Objects.equals(this.coins, apiV1PendingTxsTransactionOutputs.coins) &&
        Objects.equals(this.hours, apiV1PendingTxsTransactionOutputs.hours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uxid, dst, coins, hours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1PendingTxsTransactionOutputs {\n");
    sb.append("    uxid: ").append(toIndentedString(uxid)).append("\n");
    sb.append("    dst: ").append(toIndentedString(dst)).append("\n");
    sb.append("    coins: ").append(toIndentedString(coins)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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

