import intefaz.interfaces;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteMensaje {
    public static void main(String[] args) {
        try {
            // Cambiar "localhost" por la dirección IP o nombre de host del servidor RMI
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            interfaces servidor = (interfaces) registry.lookup("NombreServidor");
            // Llamada a los métodos remotos del servidor
            servidor.enviarMensaje("¡Hola desde el cliente!");
            String respuesta = servidor.recibirMensaje();
            System.out.println("Respuesta del servidor: " + respuesta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
