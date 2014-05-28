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
    private IdService client;
    private String ssoToken;

    public NbUrnClient(String config) throws NbUrnException {
        this.client = new IdService_Service().getPort(IdService.class);
        this.config = loadConfig(config);
    }

    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
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

    public NbUrnClient(String config, String username, String password) throws NbUrnException {
        this.client = new IdService_Service().getPort(IdService.class);
        Yaml yaml = new Yaml();
        this.config = loadConfig(config);
        this.config.put("username", username);
        this.config.put("password", password);
        System.out.println(this.config.toString());
    }

    public String getSsoToken() {
        return ssoToken;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
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

    public void addUrl(String urn, String url) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public URNInfo createUrn(String seriesCode, String url) throws NbUrnException {
        throw new UnsupportedOperationException("Not implemented yet");
//        try {
//            return this.client.createURN("", seriesCode, url);
//        } catch (FailedLoginException_Exception e) {
//            throw new NbUrnException(e);
//        } catch (IllegalActionException_Exception e) {
//            throw new NbUrnException(e);
//        } catch (InsufficientRightsException_Exception e) {
//            throw new NbUrnException(e);
//        } catch (InvalidURLException_Exception e) {
//            throw new NbUrnException(e);
//        } catch (MalformedURLException_Exception e) {
//            throw new NbUrnException(e);
//        } catch (ObjectAlreadyExistsException_Exception e) {
//            throw new NbUrnException(e);
//        } catch (URNSeriesNotFoundException_Exception e) {
//            throw new NbUrnException(e);
//        }
    }

    public void deleteUrl(String urn, String url) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void getNextUrn(String seriesCode) {
        throw new UnsupportedOperationException("Not implemented yet");
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

    public void registerUrn(String urn, String url) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void replaceUrl(String urn, String oldUrl, String newUrl) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void reserveNextUrn(String seriesCode) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void reserveUrn(String urn) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setDefaultUrl(String urn, String url) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
