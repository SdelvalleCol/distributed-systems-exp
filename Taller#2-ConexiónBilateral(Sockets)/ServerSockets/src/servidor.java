import data.cancion;
import java.io.*;
import java.net.*;

public class servidor {
    private int port;
    ServerSocket serverSocket;

    public servidor() {
        this.port = 5000;
        try {
            System.out.println("Servidor iniciado en el puerto: " + port);
            this.serverSocket = new ServerSocket(port);
            iniciar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void iniciar() {
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

                while (true) {
                    String mensaje_cliente = input.readLine();
                    if (mensaje_cliente == null || mensaje_cliente.equalsIgnoreCase("exit")) {
                        System.out.println("Cliente solicitó desconexión.");
                        clientSocket.close();
                        break;
                    } else {
                        boolean des = false;
                        String can ="";
                        System.out.println("Canción solicitada: " + mensaje_cliente);
                        for (cancion p : Main.listaCanciones) {
                            if (mensaje_cliente.trim().equalsIgnoreCase(p.getNombre().trim())) {
                                des = true;
                                can = p.toString();
                                break;
                            }
                        }
                        if (des) {
                            output.println("Se encontró la canción, sus datos son: "+can );
                        } else {
                            output.println("No se encontró la canción");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }}