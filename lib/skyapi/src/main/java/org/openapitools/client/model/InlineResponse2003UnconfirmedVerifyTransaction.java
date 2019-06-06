/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.25.1
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
 * Represent unconfirmed transactions
 */
@ApiModel(description = "Represent unconfirmed transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-06T13:17:51.889712-04:00[America/Havana]")
public class InlineResponse2003UnconfirmedVerifyTransaction {
  public static final String SERIALIZED_NAME_BURN_FACTOR = "burn_factor";
  @SerializedName(SERIALIZED_NAME_BURN_FACTOR)
  private Integer burnFactor;

  public static final String SERIALIZED_NAME_MAX_TRANSACTION_SIZE = "max_transaction_size";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTION_SIZE)
  private Integer maxTransactionSize;

  public static final String SERIALIZED_NAME_MAX_DECIMALS = "max_decimals";
  @SerializedName(SERIALIZED_NAME_MAX_DECIMALS)
  private Integer maxDecimals;

  public InlineResponse2003UnconfirmedVerifyTransaction burnFactor(Integer burnFactor) {
    this.burnFactor = burnFactor;
    return this;
  }

   /**
   * Get burnFactor
   * @return burnFactor
  **/
  @ApiModelProperty(value = "")
  public Integer getBurnFactor() {
    return burnFactor;
  }

  public void setBurnFactor(Integer burnFactor) {
    this.burnFactor = burnFactor;
  }

  public InlineResponse2003UnconfirmedVerifyTransaction maxTransactionSize(Integer maxTransactionSize) {
    this.maxTransactionSize = maxTransactionSize;
    return this;
  }

   /**
   * Get maxTransactionSize
   * @return maxTransactionSize
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxTransactionSize() {
    return maxTransactionSize;
  }

  public void setMaxTransactionSize(Integer maxTransactionSize) {
    this.maxTransactionSize = maxTransactionSize;
  }

  public InlineResponse2003UnconfirmedVerifyTransaction maxDecimals(Integer maxDecimals) {
    this.maxDecimals = maxDecimals;
    return this;
  }

   /**
   * Get maxDecimals
   * @return maxDecimals
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxDecimals() {
    return maxDecimals;
  }

  public void setMaxDecimals(Integer maxDecimals) {
    this.maxDecimals = maxDecimals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003UnconfirmedVerifyTransaction inlineResponse2003UnconfirmedVerifyTransaction = (InlineResponse2003UnconfirmedVerifyTransaction) o;
    return Objects.equals(this.burnFactor, inlineResponse2003UnconfirmedVerifyTransaction.burnFactor) &&
        Objects.equals(this.maxTransactionSize, inlineResponse2003UnconfirmedVerifyTransaction.maxTransactionSize) &&
        Objects.equals(this.maxDecimals, inlineResponse2003UnconfirmedVerifyTransaction.maxDecimals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burnFactor, maxTransactionSize, maxDecimals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003UnconfirmedVerifyTransaction {\n");
    sb.append("    burnFactor: ").append(toIndentedString(burnFactor)).append("\n");
    sb.append("    maxTransactionSize: ").append(toIndentedString(maxTransactionSize)).append("\n");
    sb.append("    maxDecimals: ").append(toIndentedString(maxDecimals)).append("\n");
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

