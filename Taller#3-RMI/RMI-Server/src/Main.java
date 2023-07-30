import clases.cancion;
import intefaz.cancionable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) throws RemoteException {
        try {
            cancionable ss = new cancion("Columbia","Quevedo","2023");
            cancionable stub = (cancionable) UnicastRemoteObject.exportObject(ss, 0);
            java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registry.rebind("Server", stub);
            System.out.println("Se creo el servidor...");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}