package intefaz;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Cancionable extends Remote {
    String union() throws RemoteException;

    void busqueda(String nombre) throws  RemoteException;

    void inicializarListaCanciones() throws RemoteException;
}
