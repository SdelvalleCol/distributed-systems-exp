package intefaz;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface cancionable extends Remote {
    String union() throws RemoteException;
}
