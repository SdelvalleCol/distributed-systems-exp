
package serversoap.server.soap;
import javax.xml.ws.Endpoint;
import srs.servicesoap;

public class ServerSoap {

    public static void main(String[] args) {
        String url = "http://localhost:10230/miservicio";
        servicesoap servicio = new servicesoap();
        Endpoint.publish(url, servicio);
        System.out.println("Servicio SOAP publicado en: " + url +"?wsdl");
    }
}
