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
import org.openapitools.client.model.NetworkConnectionSchemaUnconfirmedVerifyTransaction;

/**
 * NetworkConnectionSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-05T23:05:01.558-04:00[America/Havana]")
public class NetworkConnectionSchema {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CONNECTED_AT = "connected_at";
  @SerializedName(SERIALIZED_NAME_CONNECTED_AT)
  private Long connectedAt;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IS_TRUSTED_PEER = "is_trusted_peer";
  @SerializedName(SERIALIZED_NAME_IS_TRUSTED_PEER)
  private Boolean isTrustedPeer;

  public static final String SERIALIZED_NAME_LAST_RECEIVED = "last_received";
  @SerializedName(SERIALIZED_NAME_LAST_RECEIVED)
  private Long lastReceived;

  public static final String SERIALIZED_NAME_LAST_SENT = "last_sent";
  @SerializedName(SERIALIZED_NAME_LAST_SENT)
  private Long lastSent;

  public static final String SERIALIZED_NAME_LISTEN_PORT = "listen_port";
  @SerializedName(SERIALIZED_NAME_LISTEN_PORT)
  private Integer listenPort;

  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Integer mirror;

  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private Boolean outgoing;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("pending"),
    
    CONNECTED("connected"),
    
    INTRODUCED("introduced");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_UNCONFIRMED_VERIFY_TRANSACTION = "unconfirmed_verify_transaction";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_VERIFY_TRANSACTION)
  private NetworkConnectionSchemaUnconfirmedVerifyTransaction unconfirmedVerifyTransaction = null;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public NetworkConnectionSchema address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NetworkConnectionSchema connectedAt(Long connectedAt) {
    this.connectedAt = connectedAt;
    return this;
  }

   /**
   * Get connectedAt
   * @return connectedAt
  **/
  @ApiModelProperty(value = "")
  public Long getConnectedAt() {
    return connectedAt;
  }

  public void setConnectedAt(Long connectedAt) {
    this.connectedAt = connectedAt;
  }

  public NetworkConnectionSchema height(Long height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public NetworkConnectionSchema id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NetworkConnectionSchema isTrustedPeer(Boolean isTrustedPeer) {
    this.isTrustedPeer = isTrustedPeer;
    return this;
  }

   /**
   * Get isTrustedPeer
   * @return isTrustedPeer
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsTrustedPeer() {
    return isTrustedPeer;
  }

  public void setIsTrustedPeer(Boolean isTrustedPeer) {
    this.isTrustedPeer = isTrustedPeer;
  }

  public NetworkConnectionSchema lastReceived(Long lastReceived) {
    this.lastReceived = lastReceived;
    return this;
  }

   /**
   * Get lastReceived
   * @return lastReceived
  **/
  @ApiModelProperty(value = "")
  public Long getLastReceived() {
    return lastReceived;
  }

  public void setLastReceived(Long lastReceived) {
    this.lastReceived = lastReceived;
  }

  public NetworkConnectionSchema lastSent(Long lastSent) {
    this.lastSent = lastSent;
    return this;
  }

   /**
   * Get lastSent
   * @return lastSent
  **/
  @ApiModelProperty(value = "")
  public Long getLastSent() {
    return lastSent;
  }

  public void setLastSent(Long lastSent) {
    this.lastSent = lastSent;
  }

  public NetworkConnectionSchema listenPort(Integer listenPort) {
    this.listenPort = listenPort;
    return this;
  }

   /**
   * Get listenPort
   * @return listenPort
  **/
  @ApiModelProperty(value = "")
  public Integer getListenPort() {
    return listenPort;
  }

  public void setListenPort(Integer listenPort) {
    this.listenPort = listenPort;
  }

  public NetworkConnectionSchema mirror(Integer mirror) {
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @ApiModelProperty(value = "")
  public Integer getMirror() {
    return mirror;
  }

  public void setMirror(Integer mirror) {
    this.mirror = mirror;
  }

  public NetworkConnectionSchema outgoing(Boolean outgoing) {
    this.outgoing = outgoing;
    return this;
  }

   /**
   * Get outgoing
   * @return outgoing
  **/
  @ApiModelProperty(value = "")
  public Boolean getOutgoing() {
    return outgoing;
  }

  public void setOutgoing(Boolean outgoing) {
    this.outgoing = outgoing;
  }

  public NetworkConnectionSchema state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public NetworkConnectionSchema unconfirmedVerifyTransaction(NetworkConnectionSchemaUnconfirmedVerifyTransaction unconfirmedVerifyTransaction) {
    this.unconfirmedVerifyTransaction = unconfirmedVerifyTransaction;
    return this;
  }

   /**
   * Get unconfirmedVerifyTransaction
   * @return unconfirmedVerifyTransaction
  **/
  @ApiModelProperty(value = "")
  public NetworkConnectionSchemaUnconfirmedVerifyTransaction getUnconfirmedVerifyTransaction() {
    return unconfirmedVerifyTransaction;
  }

  public void setUnconfirmedVerifyTransaction(NetworkConnectionSchemaUnconfirmedVerifyTransaction unconfirmedVerifyTransaction) {
    this.unconfirmedVerifyTransaction = unconfirmedVerifyTransaction;
  }

  public NetworkConnectionSchema userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @ApiModelProperty(value = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectionSchema networkConnectionSchema = (NetworkConnectionSchema) o;
    return Objects.equals(this.address, networkConnectionSchema.address) &&
        Objects.equals(this.connectedAt, networkConnectionSchema.connectedAt) &&
        Objects.equals(this.height, networkConnectionSchema.height) &&
        Objects.equals(this.id, networkConnectionSchema.id) &&
        Objects.equals(this.isTrustedPeer, networkConnectionSchema.isTrustedPeer) &&
        Objects.equals(this.lastReceived, networkConnectionSchema.lastReceived) &&
        Objects.equals(this.lastSent, networkConnectionSchema.lastSent) &&
        Objects.equals(this.listenPort, networkConnectionSchema.listenPort) &&
        Objects.equals(this.mirror, networkConnectionSchema.mirror) &&
        Objects.equals(this.outgoing, networkConnectionSchema.outgoing) &&
        Objects.equals(this.state, networkConnectionSchema.state) &&
        Objects.equals(this.unconfirmedVerifyTransaction, networkConnectionSchema.unconfirmedVerifyTransaction) &&
        Objects.equals(this.userAgent, networkConnectionSchema.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, connectedAt, height, id, isTrustedPeer, lastReceived, lastSent, listenPort, mirror, outgoing, state, unconfirmedVerifyTransaction, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectionSchema {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    connectedAt: ").append(toIndentedString(connectedAt)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isTrustedPeer: ").append(toIndentedString(isTrustedPeer)).append("\n");
    sb.append("    lastReceived: ").append(toIndentedString(lastReceived)).append("\n");
    sb.append("    lastSent: ").append(toIndentedString(lastSent)).append("\n");
    sb.append("    listenPort: ").append(toIndentedString(listenPort)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    outgoing: ").append(toIndentedString(outgoing)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    unconfirmedVerifyTransaction: ").append(toIndentedString(unconfirmedVerifyTransaction)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

