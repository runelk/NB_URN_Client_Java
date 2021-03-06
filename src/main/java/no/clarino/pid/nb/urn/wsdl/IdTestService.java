
package no.clarino.pid.nb.urn.wsdl;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IdService", targetNamespace = "http://nb.no/idservice/v1.0/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IdTestService {


    /**
     * 
     * @param urn
     * @param ssoToken
     * @param url
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws ObjectAlreadyExistsException_Exception
     * @throws MalformedURLException_Exception
     * @throws URNNotFoundException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws FailedLoginException_Exception
     * @throws InvalidURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addURL", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.AddURL")
    @ResponseWrapper(localName = "addURLResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.AddURLResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/addURLRequest", output = "http://nb.no/idservice/v1.0/IdService/addURLResponse", fault = {
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/MalformedURNException"),
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/MalformedURLException"),
        @FaultAction(className = ObjectAlreadyExistsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/ObjectAlreadyExistsException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/InsufficientRightsException"),
        @FaultAction(className = InvalidURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/InvalidURLException"),
        @FaultAction(className = URNNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/URNNotFoundException"),
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/addURL/Fault/FailedLoginException")
    })
    public URNInfo addURL(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "URN", targetNamespace = "")
        String urn,
        @WebParam(name = "URL", targetNamespace = "")
        String url)
        throws FailedLoginException_Exception, InsufficientRightsException_Exception, InvalidURLException_Exception, MalformedURLException_Exception, MalformedURNException_Exception, ObjectAlreadyExistsException_Exception, URNNotFoundException_Exception
    ;

    /**
     * 
     * @param urn
     * @param ssoToken
     * @param url
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws MalformedURLException_Exception
     * @throws ObjectAlreadyExistsException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws URNSeriesNotFoundException_Exception
     * @throws IllegalActionException_Exception
     * @throws FailedLoginException_Exception
     * @throws InvalidURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registerURN", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.RegisterURN")
    @ResponseWrapper(localName = "registerURNResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.RegisterURNResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/registerURNRequest", output = "http://nb.no/idservice/v1.0/IdService/registerURNResponse", fault = {
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/MalformedURNException"),
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/MalformedURLException"),
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/FailedLoginException"),
        @FaultAction(className = IllegalActionException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/IllegalActionException"),
        @FaultAction(className = ObjectAlreadyExistsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/ObjectAlreadyExistsException"),
        @FaultAction(className = URNSeriesNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/URNSeriesNotFoundException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/InsufficientRightsException"),
        @FaultAction(className = InvalidURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/registerURN/Fault/InvalidURLException")
    })
    public URNInfo registerURN(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "URN", targetNamespace = "")
        String urn,
        @WebParam(name = "URL", targetNamespace = "")
        String url)
        throws FailedLoginException_Exception, IllegalActionException_Exception, InsufficientRightsException_Exception, InvalidURLException_Exception, MalformedURLException_Exception, MalformedURNException_Exception, ObjectAlreadyExistsException_Exception, URNSeriesNotFoundException_Exception
    ;

    /**
     * 
     * @param urn
     * @param ssoToken
     * @param url
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws MalformedURLException_Exception
     * @throws URLNotFoundException_Exception
     * @throws TooFewURLsException_Exception
     * @throws URNNotFoundException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws FailedLoginException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteURL", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.DeleteURL")
    @ResponseWrapper(localName = "deleteURLResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.DeleteURLResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/deleteURLRequest", output = "http://nb.no/idservice/v1.0/IdService/deleteURLResponse", fault = {
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/MalformedURNException"),
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/MalformedURLException"),
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/FailedLoginException"),
        @FaultAction(className = TooFewURLsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/TooFewURLsException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/InsufficientRightsException"),
        @FaultAction(className = URNNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/URNNotFoundException"),
        @FaultAction(className = URLNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/deleteURL/Fault/URLNotFoundException")
    })
    public URNInfo deleteURL(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "URN", targetNamespace = "")
        String urn,
        @WebParam(name = "URL", targetNamespace = "")
        String url)
        throws FailedLoginException_Exception, InsufficientRightsException_Exception, MalformedURLException_Exception, MalformedURNException_Exception, TooFewURLsException_Exception, URLNotFoundException_Exception, URNNotFoundException_Exception
    ;

    /**
     * 
     * @param seriesCode
     * @param ssoToken
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNSeriesCodeException_Exception
     * @throws URNSeriesNotFoundException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws IllegalActionException_Exception
     * @throws FailedLoginException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserveNextURN", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.ReserveNextURN")
    @ResponseWrapper(localName = "reserveNextURNResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.ReserveNextURNResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/reserveNextURNRequest", output = "http://nb.no/idservice/v1.0/IdService/reserveNextURNResponse", fault = {
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveNextURN/Fault/FailedLoginException"),
        @FaultAction(className = MalformedURNSeriesCodeException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveNextURN/Fault/MalformedURNSeriesCodeException"),
        @FaultAction(className = IllegalActionException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveNextURN/Fault/IllegalActionException"),
        @FaultAction(className = URNSeriesNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveNextURN/Fault/URNSeriesNotFoundException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveNextURN/Fault/InsufficientRightsException")
    })
    public URNInfo reserveNextURN(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "seriesCode", targetNamespace = "")
        String seriesCode)
        throws FailedLoginException_Exception, IllegalActionException_Exception, InsufficientRightsException_Exception, MalformedURNSeriesCodeException_Exception, URNSeriesNotFoundException_Exception
    ;

    /**
     * 
     * @param urn
     * @param newURL
     * @param ssoToken
     * @param oldURL
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws MalformedURLException_Exception
     * @throws ObjectAlreadyExistsException_Exception
     * @throws URLNotFoundException_Exception
     * @throws URNNotFoundException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws FailedLoginException_Exception
     * @throws InvalidURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "replaceURL", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.ReplaceURL")
    @ResponseWrapper(localName = "replaceURLResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.ReplaceURLResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/replaceURLRequest", output = "http://nb.no/idservice/v1.0/IdService/replaceURLResponse", fault = {
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/FailedLoginException"),
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/MalformedURNException"),
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/MalformedURLException"),
        @FaultAction(className = ObjectAlreadyExistsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/ObjectAlreadyExistsException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/InsufficientRightsException"),
        @FaultAction(className = InvalidURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/InvalidURLException"),
        @FaultAction(className = URNNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/URNNotFoundException"),
        @FaultAction(className = URLNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/replaceURL/Fault/URLNotFoundException")
    })
    public URNInfo replaceURL(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "URN", targetNamespace = "")
        String urn,
        @WebParam(name = "oldURL", targetNamespace = "")
        String oldURL,
        @WebParam(name = "newURL", targetNamespace = "")
        String newURL)
        throws FailedLoginException_Exception, InsufficientRightsException_Exception, InvalidURLException_Exception, MalformedURLException_Exception, MalformedURNException_Exception, ObjectAlreadyExistsException_Exception, URLNotFoundException_Exception, URNNotFoundException_Exception
    ;

    /**
     * 
     * @param urn
     * @param ssoToken
     * @param url
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws MalformedURLException_Exception
     * @throws URLNotFoundException_Exception
     * @throws URNNotFoundException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws FailedLoginException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setDefaultURL", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.SetDefaultURL")
    @ResponseWrapper(localName = "setDefaultURLResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.SetDefaultURLResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/setDefaultURLRequest", output = "http://nb.no/idservice/v1.0/IdService/setDefaultURLResponse", fault = {
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/setDefaultURL/Fault/FailedLoginException"),
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/setDefaultURL/Fault/MalformedURNException"),
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/setDefaultURL/Fault/MalformedURLException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/setDefaultURL/Fault/InsufficientRightsException"),
        @FaultAction(className = URNNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/setDefaultURL/Fault/URNNotFoundException"),
        @FaultAction(className = URLNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/setDefaultURL/Fault/URLNotFoundException")
    })
    public URNInfo setDefaultURL(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "URN", targetNamespace = "")
        String urn,
        @WebParam(name = "URL", targetNamespace = "")
        String url)
        throws FailedLoginException_Exception, InsufficientRightsException_Exception, MalformedURLException_Exception, MalformedURNException_Exception, URLNotFoundException_Exception, URNNotFoundException_Exception
    ;

    /**
     * 
     * @param url
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNList
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findURNsForURL", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.FindURNsForURL")
    @ResponseWrapper(localName = "findURNsForURLResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.FindURNsForURLResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/findURNsForURLRequest", output = "http://nb.no/idservice/v1.0/IdService/findURNsForURLResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/findURNsForURL/Fault/MalformedURLException")
    })
    public URNList findURNsForURL(
        @WebParam(name = "URL", targetNamespace = "")
        String url)
        throws MalformedURLException_Exception
    ;

    /**
     * 
     * @param username
     * @param password
     * @return
     *     returns java.lang.String
     * @throws FailedLoginException_Exception
     */
    @WebMethod
    @WebResult(name = "SSOToken", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.LoginResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/loginRequest", output = "http://nb.no/idservice/v1.0/IdService/loginResponse", fault = {
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/login/Fault/FailedLoginException")
    })
    public String login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws FailedLoginException_Exception
    ;

    /**
     * 
     * @param ssoToken
     */
    @WebMethod
    @Oneway
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://nb.no/idservice/v1.0/IdService/logout")
    public void logout(
        @WebParam(name = "SSOToken", targetNamespace = "http://nb.no/idservice/v1.0/", partName = "SSOToken")
        String ssoToken);

    /**
     * 
     * @param urn
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws URNNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findURN", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.FindURN")
    @ResponseWrapper(localName = "findURNResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.FindURNResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/findURNRequest", output = "http://nb.no/idservice/v1.0/IdService/findURNResponse", fault = {
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/findURN/Fault/MalformedURNException"),
        @FaultAction(className = URNNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/findURN/Fault/URNNotFoundException")
    })
    public URNInfo findURN(
        @WebParam(name = "URN", targetNamespace = "")
        String urn)
        throws MalformedURNException_Exception, URNNotFoundException_Exception
    ;

    /**
     * 
     * @param seriesCode
     * @param ssoToken
     * @return
     *     returns java.lang.String
     * @throws URNSeriesNotFoundException_Exception
     * @throws IllegalActionException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws FailedLoginException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNextURN", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.GetNextURN")
    @ResponseWrapper(localName = "getNextURNResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.GetNextURNResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/getNextURNRequest", output = "http://nb.no/idservice/v1.0/IdService/getNextURNResponse", fault = {
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/getNextURN/Fault/FailedLoginException"),
        @FaultAction(className = IllegalActionException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/getNextURN/Fault/IllegalActionException"),
        @FaultAction(className = URNSeriesNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/getNextURN/Fault/URNSeriesNotFoundException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/getNextURN/Fault/InsufficientRightsException")
    })
    public String getNextURN(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "seriesCode", targetNamespace = "")
        String seriesCode)
        throws FailedLoginException_Exception, IllegalActionException_Exception, InsufficientRightsException_Exception, URNSeriesNotFoundException_Exception
    ;

    /**
     * 
     * @param seriesCode
     * @param ssoToken
     * @param url
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURLException_Exception
     * @throws ObjectAlreadyExistsException_Exception
     * @throws URNSeriesNotFoundException_Exception
     * @throws IllegalActionException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws FailedLoginException_Exception
     * @throws InvalidURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createURN", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.CreateURN")
    @ResponseWrapper(localName = "createURNResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.CreateURNResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/createURNRequest", output = "http://nb.no/idservice/v1.0/IdService/createURNResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/MalformedURLException"),
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/FailedLoginException"),
        @FaultAction(className = ObjectAlreadyExistsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/ObjectAlreadyExistsException"),
        @FaultAction(className = URNSeriesNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/URNSeriesNotFoundException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/InsufficientRightsException"),
        @FaultAction(className = IllegalActionException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/IllegalActionException"),
        @FaultAction(className = InvalidURLException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/createURN/Fault/InvalidURLException")
    })
    public URNInfo createURN(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "seriesCode", targetNamespace = "")
        String seriesCode,
        @WebParam(name = "URL", targetNamespace = "")
        String url)
        throws FailedLoginException_Exception, IllegalActionException_Exception, InsufficientRightsException_Exception, InvalidURLException_Exception, MalformedURLException_Exception, ObjectAlreadyExistsException_Exception, URNSeriesNotFoundException_Exception
    ;

    /**
     * 
     * @param urn
     * @param ssoToken
     * @return
     *     returns no.clarino.pid.nb.urn.wsdl.URNInfo
     * @throws MalformedURNException_Exception
     * @throws ObjectAlreadyExistsException_Exception
     * @throws URNSeriesNotFoundException_Exception
     * @throws InsufficientRightsException_Exception
     * @throws IllegalActionException_Exception
     * @throws FailedLoginException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserveURN", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.ReserveURN")
    @ResponseWrapper(localName = "reserveURNResponse", targetNamespace = "http://nb.no/idservice/v1.0/", className = "no.clarino.pid.nb.urn.wsdl.ReserveURNResponse")
    @Action(input = "http://nb.no/idservice/v1.0/IdService/reserveURNRequest", output = "http://nb.no/idservice/v1.0/IdService/reserveURNResponse", fault = {
        @FaultAction(className = MalformedURNException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveURN/Fault/MalformedURNException"),
        @FaultAction(className = FailedLoginException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveURN/Fault/FailedLoginException"),
        @FaultAction(className = ObjectAlreadyExistsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveURN/Fault/ObjectAlreadyExistsException"),
        @FaultAction(className = URNSeriesNotFoundException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveURN/Fault/URNSeriesNotFoundException"),
        @FaultAction(className = InsufficientRightsException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveURN/Fault/InsufficientRightsException"),
        @FaultAction(className = IllegalActionException_Exception.class, value = "http://nb.no/idservice/v1.0/IdService/reserveURN/Fault/IllegalActionException")
    })
    public URNInfo reserveURN(
        @WebParam(name = "SSOToken", targetNamespace = "")
        String ssoToken,
        @WebParam(name = "URN", targetNamespace = "")
        String urn)
        throws FailedLoginException_Exception, IllegalActionException_Exception, InsufficientRightsException_Exception, MalformedURNException_Exception, ObjectAlreadyExistsException_Exception, URNSeriesNotFoundException_Exception
    ;

}
