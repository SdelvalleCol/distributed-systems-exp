package cl.cliente.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import services.Cancion;
import services.Servicesoap;

public class ClienteSoap {

    public static void imprimir(Cancion p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Artista: " + p.getAutor());
        System.out.println("Año: " + p.getFecha());
    }

    public static void main(String[] args) throws MalformedURLException {

        try {
            Scanner scan = new Scanner(System.in);
            URL url = new URL("http://localhost:10230/miservicio?wsdl");
            QName qname = new QName("http://srs/", "servicesoapService");
            Service service = Service.create(url, qname);
            Servicesoap song = service.getPort(Servicesoap.class);
            System.out.println("Bienvenidos a Soap-Songs");
            while (true) {
                try {
                    System.out.println("Menu \n 1.Buscar canción \n 2.Ver todas las canción \n 3.Salir \n");
                    int des = scan.nextInt();
                    scan.nextLine();
                    if (des == 1) {
                        System.out.println("Escribe el nombre: ");
                        String cancion_nombre = scan.nextLine();
                        Cancion cancion = song.busqueda(cancion_nombre);
                        System.out.println(cancion.toString());
                        if (cancion.getNombre() != null) {
                            ClienteSoap.imprimir(cancion);
                        } else {
                            System.out.println("Canción no encontrada");
                        }
                    } else if (des == 2) {
                        List<Cancion> data = song.obtenerTodo();
                        for (Cancion p : data) {
                            ClienteSoap.imprimir(p);
                        }
                    } else if (des == 3) {
                        break;
                    } else {
                        System.out.println("Opción no valida");
                    }
                } catch (Exception e) {
                    System.out.println("Formato no valido");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
