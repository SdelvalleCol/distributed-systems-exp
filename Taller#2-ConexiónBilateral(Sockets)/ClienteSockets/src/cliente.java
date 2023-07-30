import data.cancion;

import java.io.*;
import java.net.Socket;

public class cliente {
    private String ip;
    private int puerto;
    private Socket cliente;

    public cliente(String ip, int puerto) throws IOException, ClassNotFoundException {
        this.ip = ip;
        this.puerto = puerto;
        cliente = new Socket(this.ip, this.puerto);
        System.out.println("Conectado a la IP " + ip + " Al puerto " + puerto);
        run();
    }

    private void run() throws IOException, ClassNotFoundException {
        try {
            while (true) {
                // Entrada y envío del mensaje
                BufferedReader entradaUsuario = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Ingrese un mensaje para el servidor (o 'salir' para desconectar): ");
                String mensajeCliente = entradaUsuario.readLine();
                PrintWriter salidaServidor = new PrintWriter(this.cliente.getOutputStream(), true);
                salidaServidor.println(mensajeCliente);

                if (mensajeCliente.equals("salir")) {
                    System.out.println("Se desconectó del servidor");
                    this.cliente.close();
                    break; // Salimos del bucle while
                } else {
                    // Recibir el objeto
                    ObjectInputStream entradaServidor = new ObjectInputStream(this.cliente.getInputStream());
                    cancion objetoRecibido = (cancion) entradaServidor.readObject();
                    if (objetoRecibido != null) {
                        System.out.println("Objeto recibido del servidor: " + objetoRecibido.toString());
                    } else {
                        System.out.println("No se encontró la canción");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Se perdió la conexión con el servidor");
        }
    }
}
