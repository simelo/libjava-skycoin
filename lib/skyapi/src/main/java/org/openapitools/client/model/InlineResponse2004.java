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
import org.openapitools.client.model.ApiV1PendingTxsTransaction;

/**
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-06T13:17:51.889712-04:00[America/Havana]")
public class InlineResponse2004 {
  public static final String SERIALIZED_NAME_ANNOUNCED = "announced";
  @SerializedName(SERIALIZED_NAME_ANNOUNCED)
  private String announced;

  public static final String SERIALIZED_NAME_IS_VALID = "is_valid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_CHECKED = "checked";
  @SerializedName(SERIALIZED_NAME_CHECKED)
  private String checked;

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private String received;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private ApiV1PendingTxsTransaction transaction = null;

  public InlineResponse2004 announced(String announced) {
    this.announced = announced;
    return this;
  }

   /**
   * Get announced
   * @return announced
  **/
  @ApiModelProperty(value = "")
  public String getAnnounced() {
    return announced;
  }

  public void setAnnounced(String announced) {
    this.announced = announced;
  }

  public InlineResponse2004 isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public InlineResponse2004 checked(String checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Get checked
   * @return checked
  **/
  @ApiModelProperty(value = "")
  public String getChecked() {
    return checked;
  }

  public void setChecked(String checked) {
    this.checked = checked;
  }

  public InlineResponse2004 received(String received) {
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @ApiModelProperty(value = "")
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public InlineResponse2004 transaction(ApiV1PendingTxsTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public ApiV1PendingTxsTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(ApiV1PendingTxsTransaction transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.announced, inlineResponse2004.announced) &&
        Objects.equals(this.isValid, inlineResponse2004.isValid) &&
        Objects.equals(this.checked, inlineResponse2004.checked) &&
        Objects.equals(this.received, inlineResponse2004.received) &&
        Objects.equals(this.transaction, inlineResponse2004.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announced, isValid, checked, received, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    sb.append("    announced: ").append(toIndentedString(announced)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

