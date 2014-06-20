package no.clarino.pid.nb.urn;

import no.clarino.pid.nb.urn.wsdl.URNInfo;
import no.clarino.pid.nb.urn.wsdl.URNList;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by rkn083 on 27.05.14.
 */
public class NbUrnClientTest {
    private NbUrnClient client;
    private String urn = "URN:NBN:no-nb_ClarinoPrefix2_10";
    private String url = "http://www.dagbladet.no/";

    @Before
    public void setUp() throws Exception {
        this.client = new NbUrnClient("config/config.yml");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testConfig() throws Exception {
        this.client = new NbUrnClient("config/config.yml.example");
        assertNotNull(this.client.getConfig());
        assertEquals(this.client.getConfig().get("wsdl"), "http://foo.bar.baz");
        assertEquals(this.client.getConfig().get("proxy"), "http://foo.bar.baz");
        assertEquals(this.client.getConfig().get("username"), "foo");
        assertEquals(this.client.getConfig().get("password"), "bar");
        assertEquals(this.client.getConfig().get("prefix"), "baz");
    }

    @Test
    public void testFindURN() throws Exception {
        URNInfo urnInfo = this.client.findURN(this.urn);
        assertEquals(this.url, urnInfo.getDefaultURL());
        assertEquals(this.urn, urnInfo.getURN());
        assertEquals(1, urnInfo.getUrlList().getUrl().size());
        assertEquals(this.url, urnInfo.getUrlList().getUrl().get(0).getURL());
        System.out.println(urnInfo.toString());
    }

    @Test
    public void testFindURNsForURL() throws Exception {
        URNList urnList = this.client.findURNsForURL(this.url);
        assertEquals(urnList.getUrn().size(), 1);
        URNInfo urnInfo = urnList.getUrn().get(0);
        assertEquals(urnInfo.getURN(), this.urn);
        assertEquals(urnInfo.getDefaultURL(), this.url);
        System.out.println(urnList.toString());
    }

    @Test
    @Ignore("Not ready yet.")
    public void testAddUrl() throws Exception {

    }

    @Test
    @Ignore("Not ready yet.")
    public void testCreateUrn() throws Exception {
        this.client.login();
        URNInfo urnInfo = this.client.createUrn("URN:NBN:no-nb_ClarinoPrefix2", "http://www.google.com/");
        this.client.logout();
        assertEquals("http://www.google.com/", urnInfo.getDefaultURL());
        System.out.println(urnInfo.toString());
    }

    @Test
    public void testDeleteUrl() throws Exception {
        this.client.login();
        URNInfo urnInfo = this.client.reserveNextUrn("URN:NBN:no-nb_ClarinoPrefix2");
        this.client.addUrl(urnInfo.getURN(), "http://www.google.com/");
        this.client.addUrl(urnInfo.getURN(), "http://www.yahoo.com/");
        this.client.setDefaultUrl(urnInfo.getURN(), "http://www.google.com/");
        urnInfo = this.client.findURN(urnInfo.getURN());
        assertEquals("http://www.google.com/", urnInfo.getDefaultURL());
        assertEquals("http://www.google.com/", urnInfo.getUrlList().getUrl().get(0).getURL());
        assertEquals(2, urnInfo.getUrlList().getUrl().size());
        this.client.deleteUrl(urnInfo.getURN(), "http://www.google.com/");
        urnInfo = this.client.findURN(urnInfo.getURN());
        assertEquals("http://www.yahoo.com/", urnInfo.getDefaultURL());
        assertEquals(1, urnInfo.getUrlList().getUrl().size());
        this.client.logout();
    }

    @Test
    @Ignore("Not ready yet.")
    public void testGetNextUrn() throws Exception {

    }

    @Test
    public void testLoginFromConfig() throws Exception {
        assertNull(this.client.getSsoToken());
        String ssoToken = this.client.login();
        assertNotNull(ssoToken);
        assertNotNull(this.client.getSsoToken());
        this.client.logout();
        assertNull(this.client.getSsoToken());
        System.out.println(ssoToken);
    }

    @Test
    public void testLoginWithArguments() throws Exception {
        String username = this.client.getConfig().get("username");
        String password = this.client.getConfig().get("password");
        assertNull(this.client.getSsoToken());
        String ssoToken = this.client.login(username, password);
        assertNotNull(ssoToken);
        assertNotNull(this.client.getSsoToken());
        this.client.logout();
        assertNull(this.client.getSsoToken());
        System.out.println(ssoToken);
    }

    @Test
    @Ignore("Not ready yet.")
    public void testRegisterUrn() throws Exception {
        this.client.login();
        URNInfo urnInfo = this.client.registerUrn("URN:NBN:no-nb_ClarinoPrefix2_1_31", "http://www.reddit.com");
        this.client.logout();
        System.out.println(urnInfo.toString());
    }

    @Test
    public void testReplaceUrl() throws Exception {
        this.client.login();
        URNInfo urnInfo = this.client.reserveNextUrn("URN:NBN:no-nb_ClarinoPrefix2");
        this.client.addUrl(urnInfo.getURN(), "http://www.google.com/");
        this.client.addUrl(urnInfo.getURN(), "http://www.yahoo.com/");
        this.client.setDefaultUrl(urnInfo.getURN(), "http://www.google.com/");
        urnInfo = this.client.findURN(urnInfo.getURN());
        assertEquals("http://www.google.com/", urnInfo.getDefaultURL());
        assertEquals("http://www.google.com/", urnInfo.getUrlList().getUrl().get(0).getURL());

        this.client.replaceUrl(urnInfo.getURN(), "http://www.google.com/", "http://www.uio.no/");
        urnInfo = this.client.findURN(urnInfo.getURN());
        assertEquals("http://www.uio.no/", urnInfo.getDefaultURL());
        assertEquals(2, urnInfo.getUrlList().getUrl().size());
        assertEquals("http://www.uio.no/", urnInfo.getUrlList().getUrl().get(0).getURL());
        this.client.logout();
    }

    @Test
    @Ignore("Not ready yet.")
    public void testReserveNextUrn() throws Exception {

    }

    @Test
    @Ignore("Not ready yet.")
    public void testReserveUrn() throws Exception {

    }

    @Test
    public void testSetDefaultUrl() throws Exception {
        this.client.login();
        URNInfo urnInfo = this.client.reserveNextUrn("URN:NBN:no-nb_ClarinoPrefix2");
        this.client.addUrl(urnInfo.getURN(), "http://www.google.com/");
        urnInfo = this.client.findURN(urnInfo.getURN());
        assertEquals("http:", urnInfo.getDefaultURL());
        this.client.setDefaultUrl(urnInfo.getURN(), "http://www.google.com");
        urnInfo = this.client.findURN(urnInfo.getURN());
        assertEquals("http://www.google.com/", urnInfo.getDefaultURL());
        this.client.logout();
    }
}
