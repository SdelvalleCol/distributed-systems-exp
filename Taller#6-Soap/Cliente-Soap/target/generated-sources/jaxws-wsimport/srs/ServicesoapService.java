
package srs;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "servicesoapService", targetNamespace = "http://srs/", wsdlLocation = "http://localhost:10230/miservicio?wsdl")
public class ServicesoapService
    extends Service
{

    private final static URL SERVICESOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICESOAPSERVICE_EXCEPTION;
    private final static QName SERVICESOAPSERVICE_QNAME = new QName("http://srs/", "servicesoapService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:10230/miservicio?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICESOAPSERVICE_WSDL_LOCATION = url;
        SERVICESOAPSERVICE_EXCEPTION = e;
    }

    public ServicesoapService() {
        super(__getWsdlLocation(), SERVICESOAPSERVICE_QNAME);
    }

    public ServicesoapService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICESOAPSERVICE_QNAME, features);
    }

    public ServicesoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICESOAPSERVICE_QNAME);
    }

    public ServicesoapService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICESOAPSERVICE_QNAME, features);
    }

    public ServicesoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicesoapService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Servicesoap
     */
    @WebEndpoint(name = "servicesoapPort")
    public Servicesoap getServicesoapPort() {
        return super.getPort(new QName("http://srs/", "servicesoapPort"), Servicesoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Servicesoap
     */
    @WebEndpoint(name = "servicesoapPort")
    public Servicesoap getServicesoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://srs/", "servicesoapPort"), Servicesoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICESOAPSERVICE_EXCEPTION!= null) {
            throw SERVICESOAPSERVICE_EXCEPTION;
        }
        return SERVICESOAPSERVICE_WSDL_LOCATION;
    }

}
