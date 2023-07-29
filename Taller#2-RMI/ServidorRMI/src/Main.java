import clases.servidor;
import intefaz.interfaces;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) {try {
        // Crea una instancia del servidor y la registra en el registro RMI
        interfaces servidor = new servidor();
        interfaces stub = (interfaces) UnicastRemoteObject.exportObject(servidor, 0);

        // Cambiar "NombreServidor" por un nombre descriptivo para tu servidor
        java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
        registry.rebind("NombreServidor", stub);

        System.out.println("Servidor listo para recibir mensajes.");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}