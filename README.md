Java Client for the URN PID service by the National Library of Norway
=======================================================================

This is a library and a set of command line tools for communicating with the SOAP ID service available at the National Library of Norway.

For more information (in Norwegian) about the service:
* Regarding URN: http://www.nb.no/idtjeneste/about_urn.jsf
* Regarding the SOAP API: http://www.nb.no/idtjeneste/about_urn_webservice.jsf

Configuration
-------------

The **config** directory contains an example of the YAML config file used by the client (**config.yml.example**). Copy this to e.g. **config.yml** and replace the dummy entries with the information you have received from the National Library.

Library
-------
The library source is in the package no.clarino.pid.nb.urn.
See the unit test class for NbUrnClient for usage examples.

### Library usage example:
The following code shows a simple example of using some of the API calls:

```java
import no.clarino.pid.nb.urn.NbUrnClient;
import no.clarino.pid.nb.urn.NbUrnException;
import no.clarino.pid.nb.urn.wsdl.URNInfo;
import no.clarino.pid.nb.urn.wsdl.URNList;

public class TestThingy {
    public static void main(String[] args) {
        try {
            // Instantiate a client with some config file
            NbUrnClient c = new NbUrnClient("config/config.yml");

            // You need to login first
            c.login();

            // Reserve the next available URN in the given series
            URNInfo urnInfo = c.reserveNextUrn("some:urn:prefix");

            // Register some valid URL for the newly registered URN
            c.addUrl(urnInfo.getURN(), "http://www.someurl.com/");

            // Register another URL for the same URN
            c.addUrl(urnInfo.getURN(), "http://www.someotherurl.com/");

            // Set one of the registered URLs to be the default URL
            c.setDefaultUrl(urnInfo.getURN(), "http://www.someurl.com/");

            ///////////////////////////////////////////////////////////////////////
            // ALTERNATIVE: Using create_urn:
            // new_urn = c.create_urn('urn:series:code', 'http://www.someurl.com/')
            // c.add_url(new_urn.URN, 'http://www.someotherurl.com/')
            ///////////////////////////////////////////////////////////////////////

            // Retrieve the URN you just created - it should have all the info you just registered
            urnInfo = c.findURN(urnInfo.getURN());

            // Retrieve all URNs containing your URL. Your URN should be in the list
            URNList urnList = c.findURNsForURL("http://www.someurl.com/");

        } catch (NbUrnException e) {
            e.printStackTrace();
        }
    }
}
```


Dependencies
------------
* [SnakeYAML 1.8](https://code.google.com/p/snakeyaml/)
* [JUnit 4.9](http://junit.org/) (for testing)
