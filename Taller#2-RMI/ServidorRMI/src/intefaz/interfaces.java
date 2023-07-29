package intefaz;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaces extends Remote {
    void enviarMensaje(String mensaje) throws RemoteException;
    String recibirMensaje() throws RemoteException;
}

