/**
 * 
 */
package io.github.mainstringargs.polygon;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import io.github.mainstringargs.alpaca.AlpacaAPI;
import io.github.mainstringargs.alpaca.properties.AlpacaProperties;
import io.github.mainstringargs.polygon.properties.PolygonProperties;


public class PolygonAPITest {

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
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#PolygonAPI()}.
     */
    @Test
    public final void testPolygonAPI_Default() {
        PolygonAPI polygonApi = new PolygonAPI();

        assertEquals(PolygonProperties.KEY_ID_VALUE, polygonApi.getKeyId());
        assertEquals(PolygonProperties.BASE_API_URL_VALUE, polygonApi.getBaseAPIURL());
        assertEquals(PolygonProperties.POLYGON_WEB_SOCKET_SERVER_URL_VALUE,
                        polygonApi.getWebsocketURL());

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#PolygonAPI(java.lang.String)}.
     */
    @Test
    public final void testPolygonAPI_KeyId() {
        String customKeyId = "ABCDEFGHIJKLM";

        PolygonAPI polygonApi = new PolygonAPI(customKeyId);

        assertEquals(customKeyId, polygonApi.getKeyId());
        assertEquals(PolygonProperties.BASE_API_URL_VALUE, polygonApi.getBaseAPIURL());
        assertEquals(PolygonProperties.POLYGON_WEB_SOCKET_SERVER_URL_VALUE,
                        polygonApi.getWebsocketURL());

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#PolygonAPI(java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testPolygonAPI_KeyId_BaseAPIURL() {
        String customKeyId = "ABCDEFGHIJKLM";
        String customBaseApiUrl = "https://paper-api.foo.bar";
        PolygonAPI polygonApi = new PolygonAPI(customKeyId, customBaseApiUrl);

        assertEquals(customKeyId, polygonApi.getKeyId());
        assertEquals(customBaseApiUrl, polygonApi.getBaseAPIURL());
        assertEquals(PolygonProperties.POLYGON_WEB_SOCKET_SERVER_URL_VALUE,
                        polygonApi.getWebsocketURL());

    }

    /**
     * 
     */
    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#PolygonAPI(java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testPolygonAPI_KeyId_BaseAPIURL_WebsocketURL() {
        String customKeyId = "ABCDEFGHIJKLM";
        String customBaseApiUrl = "https://paper-api.foo.bar";
        String customWebsocketUrl = "wss://paper-api.foo.bar";
        PolygonAPI polygonApi = new PolygonAPI(customKeyId, customBaseApiUrl, customWebsocketUrl);

        assertEquals(customKeyId, polygonApi.getKeyId());
        assertEquals(customBaseApiUrl, polygonApi.getBaseAPIURL());
        assertEquals(customWebsocketUrl, polygonApi.getWebsocketURL());

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getTickers(io.github.mainstringargs.polygon.enums.TickerSort, io.github.mainstringargs.polygon.enums.StockType, io.github.mainstringargs.polygon.enums.Market, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean)}.
     */
    @Test
    public final void testGetTickers() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getTickerTypes()}.
     */
    @Test
    public final void testGetTickerTypes() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getTickerDetails(java.lang.String)}.
     */
    @Test
    public final void testGetTickerDetails() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getTickerNews(java.lang.String, java.lang.Integer, java.lang.Integer)}.
     */
    @Test
    public final void testGetTickerNews() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getMarkets()}.
     */
    @Test
    public final void testGetMarkets() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getLocales()}.
     */
    @Test
    public final void testGetLocales() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getStockSplits(java.lang.String)}.
     */
    @Test
    public final void testGetStockSplits() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getStockDividends(java.lang.String)}.
     */
    @Test
    public final void testGetStockDividends() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getStockFinancials(java.lang.String, java.lang.Integer, io.github.mainstringargs.polygon.enums.FinancialReportType, io.github.mainstringargs.polygon.enums.FinancialSort)}.
     */
    @Test
    public final void testGetStockFinancials() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getMarketStatus()}.
     */
    @Test
    public final void testGetMarketStatus() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getMarketHolidays()}.
     */
    @Test
    public final void testGetMarketHolidays() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getExchanges()}.
     */
    @Test
    public final void testGetExchanges() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getHistoricTrades(java.lang.String, java.time.LocalDate, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Integer)}.
     */
    @Test
    public final void testGetHistoricTrades() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getHistoricQuotes(java.lang.String, java.time.LocalDate, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Integer)}.
     */
    @Test
    public final void testGetHistoricQuotes() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getLastTrade(java.lang.String)}.
     */
    @Test
    public final void testGetLastTrade() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getLastQuote(java.lang.String)}.
     */
    @Test
    public final void testGetLastQuote() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getDailyOpenClose(java.lang.String, java.time.LocalDate)}.
     */
    @Test
    public final void testGetDailyOpenClose() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getConditionsMapping(io.github.mainstringargs.polygon.enums.ConditionMappingsType)}.
     */
    @Test
    public final void testGetConditionsMapping() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#getSnapshotAllTickers()}.
     */
    @Test
    public final void testGetSnapshotAllTickers() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getSnapshotSingleTicker(java.lang.String)}.
     */
    @Test
    public final void testGetSnapshotSingleTicker() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getSnapshotsGainersLosers(io.github.mainstringargs.polygon.enums.GainersLosersDirection)}.
     */
    @Test
    public final void testGetSnapshotsGainersLosers() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getPreviousClose(java.lang.String, java.lang.Boolean)}.
     */
    @Test
    public final void testGetPreviousClose() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getAggregates(java.lang.String, java.lang.Integer, io.github.mainstringargs.polygon.enums.Timespan, java.time.LocalDate, java.time.LocalDate, java.lang.Boolean)}.
     */
    @Test
    public final void testGetAggregates() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#getGroupedDaily(java.lang.String, io.github.mainstringargs.polygon.enums.Market, java.time.LocalDate, java.lang.Boolean)}.
     */
    @Test
    public final void testGetGroupedDaily() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#addPolygonStreamListener(io.github.mainstringargs.polygon.websocket.listener.PolygonStreamListener)}.
     */
    @Test
    public final void testAddPolygonStreamListener() {

    }

    /**
     * Test method for
     * {@link io.github.mainstringargs.polygon.PolygonAPI#removePolygonStreamListener(io.github.mainstringargs.polygon.websocket.listener.PolygonStreamListener)}.
     */
    @Test
    public final void testRemovePolygonStreamListener() {

    }

    /**
     * Test method for {@link io.github.mainstringargs.polygon.PolygonAPI#toString()}.
     */
    @Test
    public final void testToString() {

    }

}
