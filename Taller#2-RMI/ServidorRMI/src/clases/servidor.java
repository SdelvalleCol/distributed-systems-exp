package clases;

import intefaz.interfaces;

import java.rmi.RemoteException;

public class servidor implements interfaces {

    public servidor() {
    }

    @Override
    public void enviarMensaje(String mensaje) throws RemoteException {
        System.out.println("Mensaje recibido " + mensaje);
    }

    @Override
    public String recibirMensaje() throws RemoteException {
        return  "Se recibio el mensaje";
    }
}
