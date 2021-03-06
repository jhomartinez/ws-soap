package co.codigoj.webservice.services.catagoriaws.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.16
 * 2020-02-01T01:11:46.193-05:00
 * Generated source version: 3.1.16
 * 
 */
@WebServiceClient(name = "catagoriaws", 
                  wsdlLocation = "file:/home/jhon/spring/categoriaws/src/main/resources/META-INF/wsdl/catagoriaws.wsdl",
                  targetNamespace = "http://webservice.codigoj.co/services/catagoriaws/ws") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00", comments = "Apache CXF 3.1.16")
public class Catagoriaws_Service extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public final static QName SERVICE = new QName("http://webservice.codigoj.co/services/catagoriaws/ws", "catagoriaws");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public final static QName CatagoriawsSOAP = new QName("http://webservice.codigoj.co/services/catagoriaws/ws", "catagoriawsSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/jhon/spring/categoriaws/src/main/resources/META-INF/wsdl/catagoriaws.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Catagoriaws_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/jhon/spring/categoriaws/src/main/resources/META-INF/wsdl/catagoriaws.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Catagoriaws
     */
    @WebEndpoint(name = "catagoriawsSOAP")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws getCatagoriawsSOAP() {
        return super.getPort(CatagoriawsSOAP, Catagoriaws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Catagoriaws
     */
    @WebEndpoint(name = "catagoriawsSOAP")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-02-01T01:11:46.193-05:00")
    public Catagoriaws getCatagoriawsSOAP(WebServiceFeature... features) {
        return super.getPort(CatagoriawsSOAP, Catagoriaws.class, features);
    }

}
