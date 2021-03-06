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
import java.util.ArrayList;
import java.util.List;

/**
 * WalletTransactionSignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T00:13:07.983-04:00[America/Havana]")
public class WalletTransactionSignRequest {
  @JsonProperty("wallet_id")
  private String walletId;

  @JsonProperty("password")
  private String password;

  @JsonProperty("encoded_transaction")
  private String encodedTransaction;

  @JsonProperty("sign_indexes")
  private List<Long> signIndexes = new ArrayList<Long>();

  public WalletTransactionSignRequest walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * Get walletId
   * @return walletId
  **/
  @ApiModelProperty(value = "")
  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  public WalletTransactionSignRequest password(String password) {
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

  public WalletTransactionSignRequest encodedTransaction(String encodedTransaction) {
    this.encodedTransaction = encodedTransaction;
    return this;
  }

   /**
   * Get encodedTransaction
   * @return encodedTransaction
  **/
  @ApiModelProperty(value = "")
  public String getEncodedTransaction() {
    return encodedTransaction;
  }

  public void setEncodedTransaction(String encodedTransaction) {
    this.encodedTransaction = encodedTransaction;
  }

  public WalletTransactionSignRequest signIndexes(List<Long> signIndexes) {
    this.signIndexes = signIndexes;
    return this;
  }

  public WalletTransactionSignRequest addSignIndexesItem(Long signIndexesItem) {
    if (this.signIndexes == null) {
      this.signIndexes = new ArrayList<Long>();
    }
    this.signIndexes.add(signIndexesItem);
    return this;
  }

   /**
   * Get signIndexes
   * @return signIndexes
  **/
  @ApiModelProperty(value = "")
  public List<Long> getSignIndexes() {
    return signIndexes;
  }

  public void setSignIndexes(List<Long> signIndexes) {
    this.signIndexes = signIndexes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionSignRequest walletTransactionSignRequest = (WalletTransactionSignRequest) o;
    return Objects.equals(this.walletId, walletTransactionSignRequest.walletId) &&
        Objects.equals(this.password, walletTransactionSignRequest.password) &&
        Objects.equals(this.encodedTransaction, walletTransactionSignRequest.encodedTransaction) &&
        Objects.equals(this.signIndexes, walletTransactionSignRequest.signIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, password, encodedTransaction, signIndexes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionSignRequest {\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    encodedTransaction: ").append(toIndentedString(encodedTransaction)).append("\n");
    sb.append("    signIndexes: ").append(toIndentedString(signIndexes)).append("\n");
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

