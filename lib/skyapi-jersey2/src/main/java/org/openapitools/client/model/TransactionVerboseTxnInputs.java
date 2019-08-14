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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TransactionVerboseTxnInputs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-05T22:49:48.091-04:00[America/Havana]")
public class TransactionVerboseTxnInputs {
  @JsonProperty("uxid")
  private String uxid;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("coins")
  private String coins;

  @JsonProperty("hours")
  private Long hours;

  @JsonProperty("calculated_hours")
  private Long calculatedHours;

  public TransactionVerboseTxnInputs uxid(String uxid) {
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

  public TransactionVerboseTxnInputs owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public TransactionVerboseTxnInputs coins(String coins) {
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

  public TransactionVerboseTxnInputs hours(Long hours) {
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

  public TransactionVerboseTxnInputs calculatedHours(Long calculatedHours) {
    this.calculatedHours = calculatedHours;
    return this;
  }

   /**
   * Get calculatedHours
   * @return calculatedHours
  **/
  @ApiModelProperty(value = "")
  public Long getCalculatedHours() {
    return calculatedHours;
  }

  public void setCalculatedHours(Long calculatedHours) {
    this.calculatedHours = calculatedHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVerboseTxnInputs transactionVerboseTxnInputs = (TransactionVerboseTxnInputs) o;
    return Objects.equals(this.uxid, transactionVerboseTxnInputs.uxid) &&
        Objects.equals(this.owner, transactionVerboseTxnInputs.owner) &&
        Objects.equals(this.coins, transactionVerboseTxnInputs.coins) &&
        Objects.equals(this.hours, transactionVerboseTxnInputs.hours) &&
        Objects.equals(this.calculatedHours, transactionVerboseTxnInputs.calculatedHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uxid, owner, coins, hours, calculatedHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVerboseTxnInputs {\n");
    sb.append("    uxid: ").append(toIndentedString(uxid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    coins: ").append(toIndentedString(coins)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    calculatedHours: ").append(toIndentedString(calculatedHours)).append("\n");
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

