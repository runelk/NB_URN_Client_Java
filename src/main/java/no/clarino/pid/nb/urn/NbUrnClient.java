package no.clarino.pid.nb.urn;

import no.clarino.pid.nb.urn.wsdl.*;

/**
 * Created by rkn083 on 19.05.14.
 */
public class NbUrnClient {
    private IdService client;
    private String ssoToken;

    public NbUrnClient() {
        this.client = new IdService_Service().getPort(IdService.class);

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

    public String login(String username, String password) throws NbUrnException {
        //throw new UnsupportedOperationException("Not implemented yet");
        try {
            return this.client.login(username, password);
        } catch (FailedLoginException_Exception e) {
            throw new NbUrnException(e);
        }
    }

    public void logout() {

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
