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

package org.openapitools.client.api;

import org.openapitools.client.model.Address;
import org.openapitools.client.model.BlockSchema;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse20010;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.InlineResponse2003;
import org.openapitools.client.model.InlineResponse2004;
import org.openapitools.client.model.InlineResponse2005;
import org.openapitools.client.model.InlineResponse2006;
import org.openapitools.client.model.InlineResponse2007;
import org.openapitools.client.model.InlineResponse2008;
import org.openapitools.client.model.InlineResponse2009;
import org.openapitools.client.model.InlineResponseDefault;
import org.openapitools.client.model.NetworkConnectionSchema;
import org.openapitools.client.model.Transaction;
import org.openapitools.client.model.TransactionV2ParamsAddress;
import org.openapitools.client.model.TransactionV2ParamsUnspent;
import org.openapitools.client.model.TransactionVerifyRequest;
import org.openapitools.client.model.WalletTransactionRequest;
import org.openapitools.client.model.WalletTransactionSignRequest;

import org.openapitools.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class DefaultApiTest {

    private DefaultApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new DefaultApiImpl();
    }
    
    /**
     * Returns the total number of unique address that have coins.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void addressCountTest(TestContext context) {
        Async async = context.async();
        api.addressCount(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Returns the historical, spent outputs associated with an address
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void addressUxoutsTest(TestContext context) {
        Async async = context.async();
        String address = null;
        api.addressUxouts(address, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void apiV1RawtxGetTest(TestContext context) {
        Async async = context.async();
        api.apiV1RawtxGet(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void apiV2MetricsGetTest(TestContext context) {
        Async async = context.async();
        api.apiV2MetricsGet(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void balanceGetTest(TestContext context) {
        Async async = context.async();
        String addrs = null;
        api.balanceGet(addrs, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void balancePostTest(TestContext context) {
        Async async = context.async();
        String addrs = null;
        api.balancePost(addrs, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void blockTest(TestContext context) {
        Async async = context.async();
        String hash = null;
        Integer seq = null;
        api.block(hash, seq, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the blockchain metadata.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void blockchainMetadataTest(TestContext context) {
        Async async = context.async();
        api.blockchainMetadata(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the blockchain sync progress.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void blockchainProgressTest(TestContext context) {
        Async async = context.async();
        api.blockchainProgress(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void blocksTest(TestContext context) {
        Async async = context.async();
        Integer start = null;
        Integer end = null;
        List<Integer> seq = null;
        api.blocks(start, end, seq, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * coinSupplyHandler returns coin distribution supply stats
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void coinSupplyTest(TestContext context) {
        Async async = context.async();
        api.coinSupply(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Creates a new CSRF token. Previous CSRF tokens are invalidated by this call.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void csrfTest(TestContext context) {
        Async async = context.async();
        api.csrf(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void dataDELETETest(TestContext context) {
        Async async = context.async();
        String type = null;
        String key = null;
        api.dataDELETE(type, key, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void dataGETTest(TestContext context) {
        Async async = context.async();
        String type = null;
        String key = null;
        api.dataGET(type, key, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void dataPOSTTest(TestContext context) {
        Async async = context.async();
        String type = null;
        String key = null;
        String val = null;
        api.dataPOST(type, key, val, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * defaultConnectionsHandler returns the list of default hardcoded bootstrap addresses.\\n They are not necessarily connected to.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void defaultConnectionsTest(TestContext context) {
        Async async = context.async();
        api.defaultConnections(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns node health data.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void healthTest(TestContext context) {
        Async async = context.async();
        api.health(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Returns the most recent N blocks on the blockchain
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void lastBlocksTest(TestContext context) {
        Async async = context.async();
        Integer num = null;
        api.lastBlocks(num, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * This endpoint returns a specific connection.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void networkConnectionTest(TestContext context) {
        Async async = context.async();
        String addr = null;
        api.networkConnection(addr, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * This endpoint returns all outgoings connections.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void networkConnectionsTest(TestContext context) {
        Async async = context.async();
        String states = null;
        String direction = null;
        api.networkConnections(states, direction, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * This endpoint disconnects a connection by ID or address
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void networkConnectionsDisconnectTest(TestContext context) {
        Async async = context.async();
        String id = null;
        api.networkConnectionsDisconnect(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * This endpoint returns all connections found through peer exchange
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void networkConnectionsExchangeTest(TestContext context) {
        Async async = context.async();
        api.networkConnectionsExchange(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * trustConnectionsHandler returns all trusted connections.\\n They are not necessarily connected to. In the default configuration, these will be a subset of the default hardcoded bootstrap addresses.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void networkConnectionsTrustTest(TestContext context) {
        Async async = context.async();
        api.networkConnectionsTrust(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void outputsGetTest(TestContext context) {
        Async async = context.async();
        List<String> address = null;
        List<String> hash = null;
        api.outputsGet(address, hash, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void outputsPostTest(TestContext context) {
        Async async = context.async();
        String address = null;
        String hash = null;
        api.outputsPost(address, hash, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void pendingTxsTest(TestContext context) {
        Async async = context.async();
        api.pendingTxs(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Broadcasts all unconfirmed transactions from the unconfirmed transaction pool
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void resendUnconfirmedTxnsTest(TestContext context) {
        Async async = context.async();
        api.resendUnconfirmedTxns(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the top skycoin holders.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void richlistTest(TestContext context) {
        Async async = context.async();
        Boolean includeDistribution = null;
        String n = null;
        api.richlist(includeDistribution, n, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Returns a transaction identified by its txid hash with just id
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionTest(TestContext context) {
        Async async = context.async();
        String txid = null;
        api.transaction(txid, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Broadcast a hex-encoded, serialized transaction to the network.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionInjectTest(TestContext context) {
        Async async = context.async();
        String rawtx = null;
        Boolean noBroadcast = null;
        api.transactionInject(rawtx, noBroadcast, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionPostTest(TestContext context) {
        Async async = context.async();
        TransactionV2ParamsAddress transactionV2ParamsAddress = null;
        api.transactionPost(transactionV2ParamsAddress, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionPostUnspentTest(TestContext context) {
        Async async = context.async();
        TransactionV2ParamsUnspent transactionV2ParamsUnspent = null;
        api.transactionPostUnspent(transactionV2ParamsUnspent, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the hex-encoded byte serialization of a transaction. The transaction may be confirmed or unconfirmed.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionRawTest(TestContext context) {
        Async async = context.async();
        String txid = null;
        api.transactionRaw(txid, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Decode and verify an encoded transaction
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionVerifyTest(TestContext context) {
        Async async = context.async();
        TransactionVerifyRequest transactionVerifyRequest = null;
        api.transactionVerify(transactionVerifyRequest, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns transactions that match the filters.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionsGetTest(TestContext context) {
        Async async = context.async();
        String addrs = null;
        String confirmed = null;
        api.transactionsGet(addrs, confirmed, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns transactions that match the filters.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void transactionsPostTest(TestContext context) {
        Async async = context.async();
        String addrs = null;
        String confirmed = null;
        api.transactionsPost(addrs, confirmed, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns an unspent output by ID.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void uxoutTest(TestContext context) {
        Async async = context.async();
        String uxid = null;
        api.uxout(uxid, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Verifies a Skycoin address.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void verifyAddressTest(TestContext context) {
        Async async = context.async();
        Address address = null;
        api.verifyAddress(address, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * versionHandler returns the application version info
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void versionTest(TestContext context) {
        Async async = context.async();
        api.version(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns a wallet by id.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletTest(TestContext context) {
        Async async = context.async();
        String id = null;
        api.wallet(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns the wallet&#39;s balance, both confirmed and predicted.  The predicted balance is the confirmed balance minus the pending spends.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletBalanceTest(TestContext context) {
        Async async = context.async();
        String id = null;
        api.walletBalance(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Create a wallet
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletCreateTest(TestContext context) {
        Async async = context.async();
        String type = null;
        String seed = null;
        String label = null;
        String seedPassphrase = null;
        String bip44Coin = null;
        String xpub = null;
        Integer scan = null;
        Boolean encrypt = null;
        String password = null;
        api.walletCreate(type, seed, label, seedPassphrase, bip44Coin, xpub, scan, encrypt, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Decrypts wallet.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletDecryptTest(TestContext context) {
        Async async = context.async();
        String id = null;
        String password = null;
        api.walletDecrypt(id, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Encrypt wallet.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletEncryptTest(TestContext context) {
        Async async = context.async();
        String id = null;
        String password = null;
        api.walletEncrypt(id, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Returns the wallet directory path
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletFolderTest(TestContext context) {
        Async async = context.async();
        String addr = null;
        api.walletFolder(addr, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Generates new addresses
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletNewAddressTest(TestContext context) {
        Async async = context.async();
        String id = null;
        String num = null;
        String password = null;
        api.walletNewAddress(id, num, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Returns the wallet directory path
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletNewSeedTest(TestContext context) {
        Async async = context.async();
        String entropy = null;
        api.walletNewSeed(entropy, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Recovers an encrypted wallet by providing the seed. The first address will be generated from seed and compared to the first address of the specified wallet. If they match, the wallet will be regenerated with an optional password. If the wallet is not encrypted, an error is returned.
     * Recovers an encrypted wallet by providing the wallet seed and optional seed passphrase
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletRecoverTest(TestContext context) {
        Async async = context.async();
        String id = null;
        String seed = null;
        String seedPassphrase = null;
        String password = null;
        api.walletRecover(id, seed, seedPassphrase, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * This endpoint only works for encrypted wallets. If the wallet is unencrypted, The seed will be not returned.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletSeedTest(TestContext context) {
        Async async = context.async();
        String id = null;
        String password = null;
        api.walletSeed(id, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Verifies a wallet seed.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletSeedVerifyTest(TestContext context) {
        Async async = context.async();
        String seed = null;
        api.walletSeedVerify(seed, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Creates a signed transaction
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletTransactionTest(TestContext context) {
        Async async = context.async();
        WalletTransactionRequest walletTransactionRequest = null;
        api.walletTransaction(walletTransactionRequest, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Creates a signed transaction
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletTransactionSignTest(TestContext context) {
        Async async = context.async();
        WalletTransactionSignRequest walletTransactionSignRequest = null;
        api.walletTransactionSign(walletTransactionSignRequest, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletTransactionsTest(TestContext context) {
        Async async = context.async();
        String id = null;
        api.walletTransactions(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Unloads wallet from the wallet service.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletUnloadTest(TestContext context) {
        Async async = context.async();
        String id = null;
        api.walletUnload(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Update the wallet.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletUpdateTest(TestContext context) {
        Async async = context.async();
        String id = null;
        String label = null;
        api.walletUpdate(id, label, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Returns all loaded wallets
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void walletsTest(TestContext context) {
        Async async = context.async();
        api.wallets(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}