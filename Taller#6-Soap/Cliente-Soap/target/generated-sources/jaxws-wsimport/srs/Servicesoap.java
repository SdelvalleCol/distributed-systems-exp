
package srs;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicesoap", targetNamespace = "http://srs/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicesoap {


    /**
     * 
     * @param arg0
     * @return
     *     returns srs.Cancion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "busqueda", targetNamespace = "http://srs/", className = "srs.Busqueda")
    @ResponseWrapper(localName = "busquedaResponse", targetNamespace = "http://srs/", className = "srs.BusquedaResponse")
    @Action(input = "http://srs/servicesoap/busquedaRequest", output = "http://srs/servicesoap/busquedaResponse")
    public Cancion busqueda(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<srs.Cancion>
     */
    @WebMethod(operationName = "obtener_todo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtener_todo", targetNamespace = "http://srs/", className = "srs.ObtenerTodo")
    @ResponseWrapper(localName = "obtener_todoResponse", targetNamespace = "http://srs/", className = "srs.ObtenerTodoResponse")
    @Action(input = "http://srs/servicesoap/obtener_todoRequest", output = "http://srs/servicesoap/obtener_todoResponse")
    public List<Cancion> obtenerTodo();

}
