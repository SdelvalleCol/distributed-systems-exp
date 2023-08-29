
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _ObtenerTodoResponse_QNAME = new QName("http://srs/", "obtener_todoResponse");
    private final static QName _Busqueda_QNAME = new QName("http://srs/", "busqueda");
    private final static QName _ObtenerTodo_QNAME = new QName("http://srs/", "obtener_todo");
    private final static QName _BusquedaResponse_QNAME = new QName("http://srs/", "busquedaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerTodoResponse }
     * 
     */
    public ObtenerTodoResponse createObtenerTodoResponse() {
        return new ObtenerTodoResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodo }
     * 
     */
    public ObtenerTodo createObtenerTodo() {
        return new ObtenerTodo();
    }

    /**
     * Create an instance of {@link Busqueda }
     * 
     */
    public Busqueda createBusqueda() {
        return new Busqueda();
    }

    /**
     * Create an instance of {@link BusquedaResponse }
     * 
     */
    public BusquedaResponse createBusquedaResponse() {
        return new BusquedaResponse();
    }

    /**
     * Create an instance of {@link Cancion }
     * 
     */
    public Cancion createCancion() {
        return new Cancion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://srs/", name = "obtener_todoResponse")
    public JAXBElement<ObtenerTodoResponse> createObtenerTodoResponse(ObtenerTodoResponse value) {
        return new JAXBElement<ObtenerTodoResponse>(_ObtenerTodoResponse_QNAME, ObtenerTodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Busqueda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://srs/", name = "busqueda")
    public JAXBElement<Busqueda> createBusqueda(Busqueda value) {
        return new JAXBElement<Busqueda>(_Busqueda_QNAME, Busqueda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://srs/", name = "obtener_todo")
    public JAXBElement<ObtenerTodo> createObtenerTodo(ObtenerTodo value) {
        return new JAXBElement<ObtenerTodo>(_ObtenerTodo_QNAME, ObtenerTodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://srs/", name = "busquedaResponse")
    public JAXBElement<BusquedaResponse> createBusquedaResponse(BusquedaResponse value) {
        return new JAXBElement<BusquedaResponse>(_BusquedaResponse_QNAME, BusquedaResponse.class, null, value);
    }

}
