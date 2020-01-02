/**
 * 
 */
package io.github.mainstringargs.alpaca;

import static org.junit.Assert.*;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import com.mashape.unirest.http.HttpResponse;
import io.github.mainstringargs.alpaca.properties.AlpacaProperties;
import io.github.mainstringargs.alpaca.rest.exception.AlpacaAPIRequestException;
import io.github.mainstringargs.domain.alpaca.account.Account;

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
     * 
     * @throws AlpacaAPIRequestException
     */
    @Test(expected = AlpacaAPIRequestException.class)
    public final void testGetAccount() throws AlpacaAPIRequestException {

        AlpacaAPI alpacaApi = new AlpacaAPI();
        HttpResponse<InputStream> responseMock = Mockito.mock(HttpResponse.class);
        Mockito.doReturn(200).when(responseMock).getStatus();

        Account account = alpacaApi.getAccount();
        assertNotNull(account);

    }


    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAccount()}.
     * 
     * @throws AlpacaAPIRequestException
     */
    @Test(expected = AlpacaAPIRequestException.class)
    public final void testGetAccount_Exception() throws AlpacaAPIRequestException {

        AlpacaAPI alpacaApi = new AlpacaAPI();
        HttpResponse<InputStream> responseMock = Mockito.mock(HttpResponse.class);
        Mockito.doReturn(400).when(responseMock).getStatus();

        alpacaApi.getAccount();

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAccountActivities(java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime, io.github.mainstringargs.alpaca.enums.Direction, java.lang.Integer, java.lang.String, io.github.mainstringargs.alpaca.enums.ActivityType[])}.
     */
    @Test
    public final void testGetAccountActivities() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAccountConfiguration()}.
     */
    @Test
    public final void testGetAccountConfiguration() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#setAccountConfiguration(io.github.mainstringargs.domain.alpaca.accountconfiguration.AccountConfiguration)}.
     */
    @Test
    public final void testSetAccountConfiguration() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOrders(io.github.mainstringargs.alpaca.enums.OrderStatus, java.lang.Integer, java.time.ZonedDateTime, java.time.ZonedDateTime, io.github.mainstringargs.alpaca.enums.Direction)}.
     */
    @Test
    public final void testGetOrders() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderType, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewOrder() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewMarketOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewMarketOrder() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewLimitOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewLimitOrder() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewStopOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewStopOrder() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#requestNewStopLimitOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderSide, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.String)}.
     */
    @Test
    public final void testRequestNewStopLimitOrder() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOrder(java.lang.String)}.
     */
    @Test
    public final void testGetOrder() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOrderByClientID(java.lang.String)}.
     */
    @Test
    public final void testGetOrderByClientID() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#replaceOrder(java.lang.String, java.lang.Integer, io.github.mainstringargs.alpaca.enums.OrderTimeInForce, java.lang.Double, java.lang.Double, java.lang.String)}.
     */
    @Test
    public final void testReplaceOrder() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#cancelAllOrders()}.
     */
    @Test
    public final void testCancelAllOrders() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#cancelOrder(java.lang.String)}.
     */
    @Test
    public final void testCancelOrder() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOpenPositions()}.
     */
    @Test
    public final void testGetOpenPositions() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getOpenPositionBySymbol(java.lang.String)}.
     */
    @Test
    public final void testGetOpenPositionBySymbol() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAssets(io.github.mainstringargs.alpaca.enums.AssetStatus, java.lang.String)}.
     */
    @Test
    public final void testGetAssets() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getAssetBySymbol(java.lang.String)}.
     */
    @Test
    public final void testGetAssetBySymbol() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getWatchlists()}.
     */
    @Test
    public final void testGetWatchlists() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#createWatchlist(java.lang.String, java.lang.String[])}.
     */
    @Test
    public final void testCreateWatchlist() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getWatchlist(java.lang.String)}.
     */
    @Test
    public final void testGetWatchlist() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#updateWatchlist(java.lang.String, java.lang.String, java.lang.String[])}.
     */
    @Test
    public final void testUpdateWatchlist() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#addWatchlistAssets(java.lang.String, java.lang.String[])}.
     */
    @Test
    public final void testAddWatchlistAssets() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#deleteWatchlist(java.lang.String)}.
     */
    @Test
    public final void testDeleteWatchlist() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#removeSymbolFromWatchlist(java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testRemoveSymbolFromWatchlist() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getCalendar()}.
     */
    @Test
    public final void testGetCalendar() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getCalendar(java.time.LocalDate, java.time.LocalDate)}.
     */
    @Test
    public final void testGetCalendarLocalDateLocalDate() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#getClock()}.
     */
    @Test
    public final void testGetClock() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getBars(io.github.mainstringargs.alpaca.enums.BarsTimeFrame, java.lang.String, java.lang.Integer, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime)}.
     */
    @Test
    public final void testGetBarsBarsTimeFrameStringIntegerZonedDateTimeZonedDateTimeZonedDateTimeZonedDateTime() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#getBars(io.github.mainstringargs.alpaca.enums.BarsTimeFrame, java.lang.String[], java.lang.Integer, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime, java.time.ZonedDateTime)}.
     */
    @Test
    public final void testGetBarsBarsTimeFrameStringArrayIntegerZonedDateTimeZonedDateTimeZonedDateTimeZonedDateTime() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#addAlpacaStreamListener(io.github.mainstringargs.alpaca.websocket.listener.AlpacaStreamListener)}.
     */
    @Test
    public final void testAddAlpacaStreamListener() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.alpaca.AlpacaAPI#removeAlpacaStreamListener(io.github.mainstringargs.alpaca.websocket.listener.AlpacaStreamListener)}.
     */
    @Test
    public final void testRemoveAlpacaStreamListener() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.alpaca.AlpacaAPI#toString()}.
     */
    @Test
    public final void testToString() {

    }

}
