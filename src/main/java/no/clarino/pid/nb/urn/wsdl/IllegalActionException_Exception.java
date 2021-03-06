
package no.clarino.pid.nb.urn.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IllegalActionException", targetNamespace = "http://nb.no/idservice/v1.0/")
public class IllegalActionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IllegalActionException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IllegalActionException_Exception(String message, IllegalActionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IllegalActionException_Exception(String message, IllegalActionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: no.clarino.pid.nb.urn.wsdl.IllegalActionException
     */
    public IllegalActionException getFaultInfo() {
        return faultInfo;
    }

}
