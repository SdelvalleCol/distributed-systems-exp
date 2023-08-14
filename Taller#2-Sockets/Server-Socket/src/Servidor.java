import data.cancion;

import java.io.*;
import java.net.*;

public class Servidor {

    private ServerSocket server;
    private int puerto;

    public Servidor(int puerto) throws IOException {
        this.puerto = puerto;
        server = new ServerSocket(this.puerto);
        System.out.println("Esperando Conexión");
        run();
    }

    public void run() throws IOException {
        while (true) {
            Socket clienteSocket = this.server.accept();

            // Recibir el mensaje
            BufferedReader entradaCliente = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            String mensajeCliente = entradaCliente.readLine();
            System.out.println("Mensaje recibido del cliente: " + mensajeCliente);

            if (mensajeCliente.equals("salir")) {
                System.out.println("Cliente solicitó cerrar la conexión.");
                clienteSocket.close();
            }else{
                // Busqueda de la canción
                cancion objetoEncontrado = null;
                for (cancion can : Main.listaCanciones) {
                    if (can.getNombre().equals(mensajeCliente)) {
                        objetoEncontrado = can;
                        break;
                    }
                }
                // Enviar el objeto al cliente
                ObjectOutputStream salidaCliente = new ObjectOutputStream(clienteSocket.getOutputStream());
                salidaCliente.writeObject(objetoEncontrado);
            }
        }
    }

}
