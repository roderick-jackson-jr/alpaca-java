/**
 * 
 */
package io.github.mainstringargs.alpaca;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import io.github.mainstringargs.alpaca.properties.AlpacaProperties;

public class AlpacaAPITest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#AlpacaAPI()}.
     */
    @Test
    public final void testAlpacaAPIConstructor_Default() {

        AlpacaAPI alpacaApi = new AlpacaAPI();

        assertEquals(AlpacaProperties.API_VERSION_VALUE, alpacaApi.getApiVersion());
        assertEquals(AlpacaProperties.KEY_ID_VALUE, alpacaApi.getKeyId());
        assertEquals(AlpacaProperties.SECRET_VALUE, alpacaApi.getSecret());
        assertEquals(AlpacaProperties.BASE_API_URL_VALUE, alpacaApi.getBaseAPIURL());
        assertEquals(AlpacaProperties.BASE_DATA_URL_VALUE, alpacaApi.getBaseDataUrl());
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#AlpacaAPI(java.lang.String)}.
     */
    @Test
    public final void testAlpacaAPIConstructor_ApiVersion() {

        String customApiVersion = "v0";

        AlpacaAPI alpacaApi = new AlpacaAPI(customApiVersion);

        assertNotEquals(AlpacaProperties.API_VERSION_VALUE, alpacaApi.getApiVersion());
        assertEquals(customApiVersion, alpacaApi.getApiVersion());

        assertEquals(AlpacaProperties.KEY_ID_VALUE, alpacaApi.getKeyId());
        assertEquals(AlpacaProperties.SECRET_VALUE, alpacaApi.getSecret());
        assertEquals(AlpacaProperties.BASE_API_URL_VALUE, alpacaApi.getBaseAPIURL());
        assertEquals(AlpacaProperties.BASE_DATA_URL_VALUE, alpacaApi.getBaseDataUrl());
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#AlpacaAPI(java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testAlpacaAPIConstructor_ApiVersion_KeyId_Secret() {

        String customApiVersion = "v0";
        String customKeyId = "ABCDEFGHIJKLM";
        String customSecret = "NOPQURSTUVWXYZ";

        AlpacaAPI alpacaApi = new AlpacaAPI(customApiVersion, customKeyId, customSecret);
        assertNotEquals(AlpacaProperties.API_VERSION_VALUE, alpacaApi.getApiVersion());
        assertEquals(customApiVersion, alpacaApi.getApiVersion());

        assertNotEquals(AlpacaProperties.KEY_ID_VALUE, alpacaApi.getKeyId());
        assertEquals(customKeyId, alpacaApi.getKeyId());

        assertNotEquals(AlpacaProperties.SECRET_VALUE, alpacaApi.getSecret());
        assertEquals(customSecret, alpacaApi.getSecret());

        assertEquals(AlpacaProperties.BASE_API_URL_VALUE, alpacaApi.getBaseAPIURL());
        assertEquals(AlpacaProperties.BASE_DATA_URL_VALUE, alpacaApi.getBaseDataUrl());
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#AlpacaAPI(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testAlpacaAPIConstructor_ApiVersion_KeyId_Secret_BaseAPIURL() {

        String customApiVersion = "v0";
        String customKeyId = "ABCDEFGHIJKLM";
        String customSecret = "NOPQURSTUVWXYZ";
        String customBaseApiUrl = "https://paper-api.foo.bar";

        AlpacaAPI alpacaApi = new AlpacaAPI(customApiVersion, customKeyId, customSecret,
                        customBaseApiUrl);
        assertNotEquals(AlpacaProperties.API_VERSION_VALUE, alpacaApi.getApiVersion());
        assertEquals(customApiVersion, alpacaApi.getApiVersion());

        assertNotEquals(AlpacaProperties.KEY_ID_VALUE, alpacaApi.getKeyId());
        assertEquals(customKeyId, alpacaApi.getKeyId());

        assertNotEquals(AlpacaProperties.SECRET_VALUE, alpacaApi.getSecret());
        assertEquals(customSecret, alpacaApi.getSecret());

        assertNotEquals(AlpacaProperties.BASE_API_URL_VALUE, alpacaApi.getBaseAPIURL());
        assertEquals(customBaseApiUrl, alpacaApi.getBaseAPIURL());

        assertEquals(AlpacaProperties.BASE_DATA_URL_VALUE, alpacaApi.getBaseDataUrl());
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#AlpacaAPI(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testAlpacaAPIConstructor_ApiVersion_KeyId_Secret_BaseAPIURL_BaseDataURL() {

        String customApiVersion = "v0";
        String customKeyId = "ABCDEFGHIJKLM";
        String customSecret = "NOPQURSTUVWXYZ";
        String customBaseApiUrl = "https://paper-api.foo.bar";
        String customBaseDataUrl = "https://data.foo.bar";

        AlpacaAPI alpacaApi = new AlpacaAPI(customApiVersion, customKeyId, customSecret,
                        customBaseApiUrl, customBaseDataUrl);
        assertNotEquals(AlpacaProperties.API_VERSION_VALUE, alpacaApi.getApiVersion());
        assertEquals(customApiVersion, alpacaApi.getApiVersion());

        assertNotEquals(AlpacaProperties.KEY_ID_VALUE, alpacaApi.getKeyId());
        assertEquals(customKeyId, alpacaApi.getKeyId());

        assertNotEquals(AlpacaProperties.SECRET_VALUE, alpacaApi.getSecret());
        assertEquals(customSecret, alpacaApi.getSecret());

        assertNotEquals(AlpacaProperties.BASE_API_URL_VALUE, alpacaApi.getBaseAPIURL());
        assertEquals(customBaseApiUrl, alpacaApi.getBaseAPIURL());

        assertNotEquals(AlpacaProperties.BASE_DATA_URL_VALUE, alpacaApi.getBaseDataUrl());
        assertEquals(customBaseDataUrl, alpacaApi.getBaseDataUrl());
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAccount()}.
     */
    @Test
    public final void testGetAccount() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAccountActivities(java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime, io.github.mainstringargs.alpaca.enums.Direction, java.lang.Integer, java.lang.String, io.github.mainstringargs.alpaca.enums.ActivityType[])}.
     */
    @Test
    public final void testGetAccountActivities() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAccountConfiguration()}.
     */
    @Test
    public final void testGetAccountConfiguration() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#setAccountConfiguration(io.github.mainstringargs.domain.alpaca.accountconfiguration.AccountConfiguration)}.
     */
    @Test
    public final void testSetAccountConfiguration() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOrders(io.github.mainstringargs.alpaca.enums.OrderStatus, java.lang.Integer, java.time.ZonedDateTime, java.time.ZonedDateTime, io.github.mainstringargs.alpaca.enums.Direction)}.
     */
    @Test
    public final void testGetOrders() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderType, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewMarketOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewMarketOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewLimitOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewLimitOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewStopOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewStopOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewStopLimitOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewStopLimitOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOrder(java.lang.String)}.
     */
    @Test
    public final void testGetOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOrderByClientID(java.lang.String)}.
     */
    @Test
    public final void testGetOrderByClientID() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#replaceOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Double, java.lang.String)}.
     */
    @Test
    public final void testReplaceOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#cancelAllOrders()}.
     */
    @Test
    public final void testCancelAllOrders() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#cancelOrder(java.lang.String)}.
     */
    @Test
    public final void testCancelOrder() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOpenPositions()}.
     */
    @Test
    public final void testGetOpenPositions() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOpenPositionBySymbol(java.lang.String)}.
     */
    @Test
    public final void testGetOpenPositionBySymbol() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAssets(io.github.mainstringargs.alpaca.enums.AssetStatus, java.lang.String)}.
     */
    @Test
    public final void testGetAssets() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAssetBySymbol(java.lang.String)}.
     */
    @Test
    public final void testGetAssetBySymbol() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getWatchlists()}.
     */
    @Test
    public final void testGetWatchlists() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#createWatchlist(java.lang.String, java.lang.String[])}.
     */
    @Test
    public final void testCreateWatchlist() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getWatchlist(java.lang.String)}.
     */
    @Test
    public final void testGetWatchlist() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#updateWatchlist(java.lang.String, java.lang.String, java.lang.String[])}.
     */
    @Test
    public final void testUpdateWatchlist() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#addWatchlistAssets(java.lang.String, java.lang.String[])}.
     */
    @Test
    public final void testAddWatchlistAssets() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#deleteWatchlist(java.lang.String)}.
     */
    @Test
    public final void testDeleteWatchlist() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#removeSymbolFromWatchlist(java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testRemoveSymbolFromWatchlist() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getCalendar()}.
     */
    @Test
    public final void testGetCalendar() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getCalendar(java.time.LocalDate, java.time.LocalDate)}.
     */
    @Test
    public final void testGetCalendarLocalDateLocalDate() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getClock()}.
     */
    @Test
    public final void testGetClock() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getBars(io.github.mainstringargs.alpaca.enums.BarsTimeFrame, java.lang.String, java.lang.Integer, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime)}.
     */
    @Test
    public final void testGetBarsBarsTimeFrameStringIntegerZonedDateTimeZonedDateTimeZonedDateTimeZonedDateTime() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getBars(io.github.mainstringargs.alpaca.enums.BarsTimeFrame, java.lang.String[], java.lang.Integer, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime)}.
     */
    @Test
    public final void testGetBarsBarsTimeFrameStringArrayIntegerZonedDateTimeZonedDateTimeZonedDateTimeZonedDateTime() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#addAlpacaStreamListener(io.github.mainstringargs.alpaca.websocket.listener.AlpacaStreamListener)}.
     */
    @Test
    public final void testAddAlpacaStreamListener() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#removeAlpacaStreamListener(io.github.mainstringargs.alpaca.websocket.listener.AlpacaStreamListener)}.
     */
    @Test
    public final void testRemoveAlpacaStreamListener() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#toString()}.
     */
    @Test
    public final void testToString() {
        fail("Not yet implemented");
    }

}
