import clases.Cancion;
import intefaz.Cancionable;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws RemoteException {
        
        try {
            Cancionable Cancion_object = new Cancion();
            Cancion_object.inicializarListaCanciones();
            Cancionable stub = (Cancionable) UnicastRemoteObject.exportObject(Cancion_object, 0);
            java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registry.rebind("Server", stub);
            System.out.println("Se creo el servidor...");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}