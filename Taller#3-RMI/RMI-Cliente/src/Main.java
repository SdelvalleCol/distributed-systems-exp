import intefaz.cancionable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cancionable servidor = (cancionable) registry.lookup("Server");
            System.out.println(servidor.union());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}