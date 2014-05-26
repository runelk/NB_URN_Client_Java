
package no.clarino.pid.nb.urn.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.clarino.pid.nb.urn.wsdl package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteURLResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "deleteURLResponse");
    private final static QName _ReserveURN_QNAME = new QName("http://nb.no/idservice/v1.0/", "reserveURN");
    private final static QName _ReserveNextURNResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "reserveNextURNResponse");
    private final static QName _FindURN_QNAME = new QName("http://nb.no/idservice/v1.0/", "findURN");
    private final static QName _DeleteURL_QNAME = new QName("http://nb.no/idservice/v1.0/", "deleteURL");
    private final static QName _GetNextURN_QNAME = new QName("http://nb.no/idservice/v1.0/", "getNextURN");
    private final static QName _CreateURN_QNAME = new QName("http://nb.no/idservice/v1.0/", "createURN");
    private final static QName _RegisterURNResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "registerURNResponse");
    private final static QName _SSOToken_QNAME = new QName("http://nb.no/idservice/v1.0/", "SSOToken");
    private final static QName _SetDefaultURL_QNAME = new QName("http://nb.no/idservice/v1.0/", "setDefaultURL");
    private final static QName _FindURNsForURL_QNAME = new QName("http://nb.no/idservice/v1.0/", "findURNsForURL");
    private final static QName _SetDefaultURLResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "setDefaultURLResponse");
    private final static QName _ReserveNextURN_QNAME = new QName("http://nb.no/idservice/v1.0/", "reserveNextURN");
    private final static QName _MalformedURLException_QNAME = new QName("http://nb.no/idservice/v1.0/", "MalformedURLException");
    private final static QName _AddURL_QNAME = new QName("http://nb.no/idservice/v1.0/", "addURL");
    private final static QName _URLNotFoundException_QNAME = new QName("http://nb.no/idservice/v1.0/", "URLNotFoundException");
    private final static QName _ReplaceURLResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "replaceURLResponse");
    private final static QName _FailedLoginException_QNAME = new QName("http://nb.no/idservice/v1.0/", "FailedLoginException");
    private final static QName _ReplaceURL_QNAME = new QName("http://nb.no/idservice/v1.0/", "replaceURL");
    private final static QName _LoginResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "loginResponse");
    private final static QName _Login_QNAME = new QName("http://nb.no/idservice/v1.0/", "login");
    private final static QName _CreateURNResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "createURNResponse");
    private final static QName _FindURNResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "findURNResponse");
    private final static QName _GetNextURNResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "getNextURNResponse");
    private final static QName _TooFewURLsException_QNAME = new QName("http://nb.no/idservice/v1.0/", "TooFewURLsException");
    private final static QName _FindURNsForURLResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "findURNsForURLResponse");
    private final static QName _IllegalActionException_QNAME = new QName("http://nb.no/idservice/v1.0/", "IllegalActionException");
    private final static QName _MalformedURNSeriesCodeException_QNAME = new QName("http://nb.no/idservice/v1.0/", "MalformedURNSeriesCodeException");
    private final static QName _InvalidURLException_QNAME = new QName("http://nb.no/idservice/v1.0/", "InvalidURLException");
    private final static QName _URNNotFoundException_QNAME = new QName("http://nb.no/idservice/v1.0/", "URNNotFoundException");
    private final static QName _InsufficientRightsException_QNAME = new QName("http://nb.no/idservice/v1.0/", "InsufficientRightsException");
    private final static QName _ReserveURNResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "reserveURNResponse");
    private final static QName _AddURLResponse_QNAME = new QName("http://nb.no/idservice/v1.0/", "addURLResponse");
    private final static QName _MalformedURNException_QNAME = new QName("http://nb.no/idservice/v1.0/", "MalformedURNException");
    private final static QName _ObjectAlreadyExistsException_QNAME = new QName("http://nb.no/idservice/v1.0/", "ObjectAlreadyExistsException");
    private final static QName _RegisterURN_QNAME = new QName("http://nb.no/idservice/v1.0/", "registerURN");
    private final static QName _URNSeriesNotFoundException_QNAME = new QName("http://nb.no/idservice/v1.0/", "URNSeriesNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.clarino.pid.nb.urn.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link URNInfo }
     * 
     */
    public URNInfo createURNInfo() {
        return new URNInfo();
    }

    /**
     * Create an instance of {@link URNSeriesNotFoundException }
     * 
     */
    public URNSeriesNotFoundException createURNSeriesNotFoundException() {
        return new URNSeriesNotFoundException();
    }

    /**
     * Create an instance of {@link AddURLResponse }
     * 
     */
    public AddURLResponse createAddURLResponse() {
        return new AddURLResponse();
    }

    /**
     * Create an instance of {@link MalformedURNException }
     * 
     */
    public MalformedURNException createMalformedURNException() {
        return new MalformedURNException();
    }

    /**
     * Create an instance of {@link RegisterURN }
     * 
     */
    public RegisterURN createRegisterURN() {
        return new RegisterURN();
    }

    /**
     * Create an instance of {@link ObjectAlreadyExistsException }
     * 
     */
    public ObjectAlreadyExistsException createObjectAlreadyExistsException() {
        return new ObjectAlreadyExistsException();
    }

    /**
     * Create an instance of {@link URNNotFoundException }
     * 
     */
    public URNNotFoundException createURNNotFoundException() {
        return new URNNotFoundException();
    }

    /**
     * Create an instance of {@link InvalidURLException }
     * 
     */
    public InvalidURLException createInvalidURLException() {
        return new InvalidURLException();
    }

    /**
     * Create an instance of {@link MalformedURNSeriesCodeException }
     * 
     */
    public MalformedURNSeriesCodeException createMalformedURNSeriesCodeException() {
        return new MalformedURNSeriesCodeException();
    }

    /**
     * Create an instance of {@link IllegalActionException }
     * 
     */
    public IllegalActionException createIllegalActionException() {
        return new IllegalActionException();
    }

    /**
     * Create an instance of {@link InsufficientRightsException }
     * 
     */
    public InsufficientRightsException createInsufficientRightsException() {
        return new InsufficientRightsException();
    }

    /**
     * Create an instance of {@link ReserveURNResponse }
     * 
     */
    public ReserveURNResponse createReserveURNResponse() {
        return new ReserveURNResponse();
    }

    /**
     * Create an instance of {@link FindURNResponse }
     * 
     */
    public FindURNResponse createFindURNResponse() {
        return new FindURNResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link CreateURNResponse }
     * 
     */
    public CreateURNResponse createCreateURNResponse() {
        return new CreateURNResponse();
    }

    /**
     * Create an instance of {@link GetNextURNResponse }
     * 
     */
    public GetNextURNResponse createGetNextURNResponse() {
        return new GetNextURNResponse();
    }

    /**
     * Create an instance of {@link TooFewURLsException }
     * 
     */
    public TooFewURLsException createTooFewURLsException() {
        return new TooFewURLsException();
    }

    /**
     * Create an instance of {@link FindURNsForURLResponse }
     * 
     */
    public FindURNsForURLResponse createFindURNsForURLResponse() {
        return new FindURNsForURLResponse();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link AddURL }
     * 
     */
    public AddURL createAddURL() {
        return new AddURL();
    }

    /**
     * Create an instance of {@link SetDefaultURLResponse }
     * 
     */
    public SetDefaultURLResponse createSetDefaultURLResponse() {
        return new SetDefaultURLResponse();
    }

    /**
     * Create an instance of {@link ReserveNextURN }
     * 
     */
    public ReserveNextURN createReserveNextURN() {
        return new ReserveNextURN();
    }

    /**
     * Create an instance of {@link ReplaceURLResponse }
     * 
     */
    public ReplaceURLResponse createReplaceURLResponse() {
        return new ReplaceURLResponse();
    }

    /**
     * Create an instance of {@link ReplaceURL }
     * 
     */
    public ReplaceURL createReplaceURL() {
        return new ReplaceURL();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link FailedLoginException }
     * 
     */
    public FailedLoginException createFailedLoginException() {
        return new FailedLoginException();
    }

    /**
     * Create an instance of {@link URLNotFoundException }
     * 
     */
    public URLNotFoundException createURLNotFoundException() {
        return new URLNotFoundException();
    }

    /**
     * Create an instance of {@link SetDefaultURL }
     * 
     */
    public SetDefaultURL createSetDefaultURL() {
        return new SetDefaultURL();
    }

    /**
     * Create an instance of {@link FindURNsForURL }
     * 
     */
    public FindURNsForURL createFindURNsForURL() {
        return new FindURNsForURL();
    }

    /**
     * Create an instance of {@link DeleteURL }
     * 
     */
    public DeleteURL createDeleteURL() {
        return new DeleteURL();
    }

    /**
     * Create an instance of {@link CreateURN }
     * 
     */
    public CreateURN createCreateURN() {
        return new CreateURN();
    }

    /**
     * Create an instance of {@link GetNextURN }
     * 
     */
    public GetNextURN createGetNextURN() {
        return new GetNextURN();
    }

    /**
     * Create an instance of {@link RegisterURNResponse }
     * 
     */
    public RegisterURNResponse createRegisterURNResponse() {
        return new RegisterURNResponse();
    }

    /**
     * Create an instance of {@link ReserveNextURNResponse }
     * 
     */
    public ReserveNextURNResponse createReserveNextURNResponse() {
        return new ReserveNextURNResponse();
    }

    /**
     * Create an instance of {@link FindURN }
     * 
     */
    public FindURN createFindURN() {
        return new FindURN();
    }

    /**
     * Create an instance of {@link ReserveURN }
     * 
     */
    public ReserveURN createReserveURN() {
        return new ReserveURN();
    }

    /**
     * Create an instance of {@link DeleteURLResponse }
     * 
     */
    public DeleteURLResponse createDeleteURLResponse() {
        return new DeleteURLResponse();
    }

    /**
     * Create an instance of {@link URNList }
     * 
     */
    public URNList createURNList() {
        return new URNList();
    }

    /**
     * Create an instance of {@link URLInfo }
     * 
     */
    public URLInfo createURLInfo() {
        return new URLInfo();
    }

    /**
     * Create an instance of {@link URNInfo.UrlList }
     * 
     */
    public URNInfo.UrlList createURNInfoUrlList() {
        return new URNInfo.UrlList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "deleteURLResponse")
    public JAXBElement<DeleteURLResponse> createDeleteURLResponse(DeleteURLResponse value) {
        return new JAXBElement<DeleteURLResponse>(_DeleteURLResponse_QNAME, DeleteURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveURN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "reserveURN")
    public JAXBElement<ReserveURN> createReserveURN(ReserveURN value) {
        return new JAXBElement<ReserveURN>(_ReserveURN_QNAME, ReserveURN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveNextURNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "reserveNextURNResponse")
    public JAXBElement<ReserveNextURNResponse> createReserveNextURNResponse(ReserveNextURNResponse value) {
        return new JAXBElement<ReserveNextURNResponse>(_ReserveNextURNResponse_QNAME, ReserveNextURNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindURN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "findURN")
    public JAXBElement<FindURN> createFindURN(FindURN value) {
        return new JAXBElement<FindURN>(_FindURN_QNAME, FindURN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "deleteURL")
    public JAXBElement<DeleteURL> createDeleteURL(DeleteURL value) {
        return new JAXBElement<DeleteURL>(_DeleteURL_QNAME, DeleteURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextURN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "getNextURN")
    public JAXBElement<GetNextURN> createGetNextURN(GetNextURN value) {
        return new JAXBElement<GetNextURN>(_GetNextURN_QNAME, GetNextURN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateURN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "createURN")
    public JAXBElement<CreateURN> createCreateURN(CreateURN value) {
        return new JAXBElement<CreateURN>(_CreateURN_QNAME, CreateURN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterURNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "registerURNResponse")
    public JAXBElement<RegisterURNResponse> createRegisterURNResponse(RegisterURNResponse value) {
        return new JAXBElement<RegisterURNResponse>(_RegisterURNResponse_QNAME, RegisterURNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "SSOToken")
    public JAXBElement<String> createSSOToken(String value) {
        return new JAXBElement<String>(_SSOToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDefaultURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "setDefaultURL")
    public JAXBElement<SetDefaultURL> createSetDefaultURL(SetDefaultURL value) {
        return new JAXBElement<SetDefaultURL>(_SetDefaultURL_QNAME, SetDefaultURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindURNsForURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "findURNsForURL")
    public JAXBElement<FindURNsForURL> createFindURNsForURL(FindURNsForURL value) {
        return new JAXBElement<FindURNsForURL>(_FindURNsForURL_QNAME, FindURNsForURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDefaultURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "setDefaultURLResponse")
    public JAXBElement<SetDefaultURLResponse> createSetDefaultURLResponse(SetDefaultURLResponse value) {
        return new JAXBElement<SetDefaultURLResponse>(_SetDefaultURLResponse_QNAME, SetDefaultURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveNextURN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "reserveNextURN")
    public JAXBElement<ReserveNextURN> createReserveNextURN(ReserveNextURN value) {
        return new JAXBElement<ReserveNextURN>(_ReserveNextURN_QNAME, ReserveNextURN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "addURL")
    public JAXBElement<AddURL> createAddURL(AddURL value) {
        return new JAXBElement<AddURL>(_AddURL_QNAME, AddURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URLNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "URLNotFoundException")
    public JAXBElement<URLNotFoundException> createURLNotFoundException(URLNotFoundException value) {
        return new JAXBElement<URLNotFoundException>(_URLNotFoundException_QNAME, URLNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "replaceURLResponse")
    public JAXBElement<ReplaceURLResponse> createReplaceURLResponse(ReplaceURLResponse value) {
        return new JAXBElement<ReplaceURLResponse>(_ReplaceURLResponse_QNAME, ReplaceURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailedLoginException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "FailedLoginException")
    public JAXBElement<FailedLoginException> createFailedLoginException(FailedLoginException value) {
        return new JAXBElement<FailedLoginException>(_FailedLoginException_QNAME, FailedLoginException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "replaceURL")
    public JAXBElement<ReplaceURL> createReplaceURL(ReplaceURL value) {
        return new JAXBElement<ReplaceURL>(_ReplaceURL_QNAME, ReplaceURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateURNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "createURNResponse")
    public JAXBElement<CreateURNResponse> createCreateURNResponse(CreateURNResponse value) {
        return new JAXBElement<CreateURNResponse>(_CreateURNResponse_QNAME, CreateURNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindURNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "findURNResponse")
    public JAXBElement<FindURNResponse> createFindURNResponse(FindURNResponse value) {
        return new JAXBElement<FindURNResponse>(_FindURNResponse_QNAME, FindURNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextURNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "getNextURNResponse")
    public JAXBElement<GetNextURNResponse> createGetNextURNResponse(GetNextURNResponse value) {
        return new JAXBElement<GetNextURNResponse>(_GetNextURNResponse_QNAME, GetNextURNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TooFewURLsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "TooFewURLsException")
    public JAXBElement<TooFewURLsException> createTooFewURLsException(TooFewURLsException value) {
        return new JAXBElement<TooFewURLsException>(_TooFewURLsException_QNAME, TooFewURLsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindURNsForURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "findURNsForURLResponse")
    public JAXBElement<FindURNsForURLResponse> createFindURNsForURLResponse(FindURNsForURLResponse value) {
        return new JAXBElement<FindURNsForURLResponse>(_FindURNsForURLResponse_QNAME, FindURNsForURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalActionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "IllegalActionException")
    public JAXBElement<IllegalActionException> createIllegalActionException(IllegalActionException value) {
        return new JAXBElement<IllegalActionException>(_IllegalActionException_QNAME, IllegalActionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURNSeriesCodeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "MalformedURNSeriesCodeException")
    public JAXBElement<MalformedURNSeriesCodeException> createMalformedURNSeriesCodeException(MalformedURNSeriesCodeException value) {
        return new JAXBElement<MalformedURNSeriesCodeException>(_MalformedURNSeriesCodeException_QNAME, MalformedURNSeriesCodeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "InvalidURLException")
    public JAXBElement<InvalidURLException> createInvalidURLException(InvalidURLException value) {
        return new JAXBElement<InvalidURLException>(_InvalidURLException_QNAME, InvalidURLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URNNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "URNNotFoundException")
    public JAXBElement<URNNotFoundException> createURNNotFoundException(URNNotFoundException value) {
        return new JAXBElement<URNNotFoundException>(_URNNotFoundException_QNAME, URNNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsufficientRightsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "InsufficientRightsException")
    public JAXBElement<InsufficientRightsException> createInsufficientRightsException(InsufficientRightsException value) {
        return new JAXBElement<InsufficientRightsException>(_InsufficientRightsException_QNAME, InsufficientRightsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveURNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "reserveURNResponse")
    public JAXBElement<ReserveURNResponse> createReserveURNResponse(ReserveURNResponse value) {
        return new JAXBElement<ReserveURNResponse>(_ReserveURNResponse_QNAME, ReserveURNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "addURLResponse")
    public JAXBElement<AddURLResponse> createAddURLResponse(AddURLResponse value) {
        return new JAXBElement<AddURLResponse>(_AddURLResponse_QNAME, AddURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURNException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "MalformedURNException")
    public JAXBElement<MalformedURNException> createMalformedURNException(MalformedURNException value) {
        return new JAXBElement<MalformedURNException>(_MalformedURNException_QNAME, MalformedURNException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectAlreadyExistsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "ObjectAlreadyExistsException")
    public JAXBElement<ObjectAlreadyExistsException> createObjectAlreadyExistsException(ObjectAlreadyExistsException value) {
        return new JAXBElement<ObjectAlreadyExistsException>(_ObjectAlreadyExistsException_QNAME, ObjectAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterURN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "registerURN")
    public JAXBElement<RegisterURN> createRegisterURN(RegisterURN value) {
        return new JAXBElement<RegisterURN>(_RegisterURN_QNAME, RegisterURN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URNSeriesNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nb.no/idservice/v1.0/", name = "URNSeriesNotFoundException")
    public JAXBElement<URNSeriesNotFoundException> createURNSeriesNotFoundException(URNSeriesNotFoundException value) {
        return new JAXBElement<URNSeriesNotFoundException>(_URNSeriesNotFoundException_QNAME, URNSeriesNotFoundException.class, null, value);
    }

}
