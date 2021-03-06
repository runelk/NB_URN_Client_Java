
package no.clarino.pid.nb.urn.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IdService", targetNamespace = "http://nb.no/idservice/v1.0/", wsdlLocation = "http://www.nb.no/idtjeneste/ws?wsdl")
public class IdService_Service
    extends Service
{

    private final static URL IDSERVICE_WSDL_LOCATION;
    private final static WebServiceException IDSERVICE_EXCEPTION;
    private final static QName IDSERVICE_QNAME = new QName("http://nb.no/idservice/v1.0/", "IdService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.nb.no/idtjeneste/ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IDSERVICE_WSDL_LOCATION = url;
        IDSERVICE_EXCEPTION = e;
    }

    public IdService_Service() {
        super(__getWsdlLocation(), IDSERVICE_QNAME);
    }

    public IdService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), IDSERVICE_QNAME, features);
    }

    public IdService_Service(URL wsdlLocation) {
        super(wsdlLocation, IDSERVICE_QNAME);
    }

    public IdService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IDSERVICE_QNAME, features);
    }

    public IdService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IdService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IdService
     */
    @WebEndpoint(name = "IdServiceSOAP11Port")
    public IdService getIdServiceSOAP11Port() {
        return super.getPort(new QName("http://nb.no/idservice/v1.0/", "IdServiceSOAP11Port"), IdService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IdService
     */
    @WebEndpoint(name = "IdServiceSOAP11Port")
    public IdService getIdServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://nb.no/idservice/v1.0/", "IdServiceSOAP11Port"), IdService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IDSERVICE_EXCEPTION!= null) {
            throw IDSERVICE_EXCEPTION;
        }
        return IDSERVICE_WSDL_LOCATION;
    }

}
