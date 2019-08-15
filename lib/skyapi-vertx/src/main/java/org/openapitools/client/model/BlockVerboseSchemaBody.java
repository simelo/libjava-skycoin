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
 * BlockVerboseSchemaBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T00:35:41.357-04:00[America/Havana]")
public class BlockVerboseSchemaBody {
  @JsonProperty("txns")
  private List<Object> txns = new ArrayList<>();

  public BlockVerboseSchemaBody txns(List<Object> txns) {
    this.txns = txns;
    return this;
  }

  public BlockVerboseSchemaBody addTxnsItem(Object txnsItem) {
    if (this.txns == null) {
      this.txns = new ArrayList<>();
    }
    this.txns.add(txnsItem);
    return this;
  }

   /**
   * Get txns
   * @return txns
  **/
  @ApiModelProperty(value = "")
  public List<Object> getTxns() {
    return txns;
  }

  public void setTxns(List<Object> txns) {
    this.txns = txns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockVerboseSchemaBody blockVerboseSchemaBody = (BlockVerboseSchemaBody) o;
    return Objects.equals(this.txns, blockVerboseSchemaBody.txns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockVerboseSchemaBody {\n");
    sb.append("    txns: ").append(toIndentedString(txns)).append("\n");
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

