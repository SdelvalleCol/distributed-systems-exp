import intefaz.Cancionable;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            Cancionable servidor = (Cancionable) registry.lookup("Server");
            String nombre = "Imagine";
            servidor.busqueda(nombre);
            System.out.println(servidor.union());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}