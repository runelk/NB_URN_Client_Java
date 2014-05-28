package no.clarino.pid.nb.urn;

import no.clarino.pid.nb.urn.wsdl.*;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

/**
 * Created by rkn083 on 19.05.14.
 */
public class NbUrnClient {
    private Map <String, String> config;
    // private IdService client;
    private IdTestService client;
    private String ssoToken;

    public NbUrnClient(String config) throws NbUrnException {
        Yaml yaml = new Yaml();
        this.config = loadConfig(config);
        // this.client = new IdService_Service().getPort(IdService.class);
        this.client = new IdTestService_Service().getPort(IdTestService.class);
    }

    public NbUrnClient(String config, String username, String password) throws NbUrnException {
        this(config);
        this.config.put("username", username);
        this.config.put("password", password);
    }

    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }

    public String getSsoToken() {
        return ssoToken;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    private Map loadConfig(String filename) throws NbUrnException {
        File f = new File(filename);
        try {
            FileInputStream fileInputStream = new FileInputStream(f);
            Yaml yaml = new Yaml();
            Map m = (Map <String, String>) ((Map) ((Map) yaml.load(fileInputStream)).get("config")).get("urn");
            return m;
        } catch (FileNotFoundException e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo findURN(String urn) throws NbUrnException {
        try {
            return this.client.findURN(urn);
        } catch (URNNotFoundException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNList findURNsForURL(String url) throws NbUrnException {
        try {
            return this.client.findURNsForURL(url);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo addUrl(String urn, String url) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.addURL(this.ssoToken, urn, url);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (InvalidURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (ObjectAlreadyExistsException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNNotFoundException_Exception e) {
            e.printStackTrace();
        } catch (MalformedURNException_Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public URNInfo createUrn(String seriesCode, String url) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.createURN(this.ssoToken, seriesCode, url);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (InvalidURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (ObjectAlreadyExistsException_Exception e) {
            throw new NbUrnException(e);
        } catch (IllegalActionException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNSeriesNotFoundException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo deleteUrl(String urn, String url) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.deleteURL(this.ssoToken, urn, url);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (URLNotFoundException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNNotFoundException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (TooFewURLsException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public String getNextUrn(String seriesCode) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.getNextURN(this.ssoToken, seriesCode);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (IllegalActionException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNSeriesNotFoundException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public String login() throws NbUrnException {
        try {
            this.ssoToken = this.client.login(this.config.get("username"), this.config.get("password"));
            return this.ssoToken;
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public String login(String username, String password) throws NbUrnException {
        try {
            this.ssoToken = this.client.login(username, password);
            return this.ssoToken;
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public void logout() {
        if (this.ssoToken != null) {
            this.client.logout(this.ssoToken);
            this.ssoToken = null;
        }
    }

    public URNInfo registerUrn(String urn, String url) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.registerURN(this.ssoToken, urn, url);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (IllegalActionException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (InvalidURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNException_Exception e) {
            throw new NbUrnException(e);
        } catch (ObjectAlreadyExistsException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNSeriesNotFoundException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo replaceUrl(String urn, String oldUrl, String newUrl) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.replaceURL(this.ssoToken, urn, oldUrl, newUrl);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (InvalidURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNException_Exception e) {
            throw new NbUrnException(e);
        } catch (ObjectAlreadyExistsException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNNotFoundException_Exception e) {
            throw new NbUrnException(e);
        } catch (URLNotFoundException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo reserveNextUrn(String seriesCode) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.reserveNextURN(this.ssoToken, seriesCode);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (IllegalActionException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNSeriesNotFoundException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNSeriesCodeException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo reserveUrn(String urn) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.reserveURN(this.ssoToken, urn);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNException_Exception e) {
            throw new NbUrnException(e);
        } catch (ObjectAlreadyExistsException_Exception e) {
            throw new NbUrnException(e);
        } catch (IllegalActionException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNSeriesNotFoundException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public URNInfo setDefaultUrl(String urn, String url) throws NbUrnException {
        if (this.ssoToken == null) { throw new SsoTokenException("You need to be logged in for this call."); }
        try {
            return this.client.setDefaultURL(this.ssoToken, urn, url);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        } catch (InsufficientRightsException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURNException_Exception e) {
            throw new NbUrnException(e);
        } catch (URNNotFoundException_Exception e) {
            throw new NbUrnException(e);
        } catch (MalformedURLException_Exception e) {
            throw new NbUrnException(e);
        } catch (URLNotFoundException_Exception e) {
            throw new NbUrnException(e);
        }
    }

}
