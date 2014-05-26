
package no.clarino.pid.nb.urn.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TooFewURLsException", targetNamespace = "http://nb.no/idservice/v1.0/")
public class TooFewURLsException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TooFewURLsException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public TooFewURLsException_Exception(String message, TooFewURLsException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public TooFewURLsException_Exception(String message, TooFewURLsException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: no.clarino.pid.nb.urn.wsdl.TooFewURLsException
     */
    public TooFewURLsException getFaultInfo() {
        return faultInfo;
    }

}
