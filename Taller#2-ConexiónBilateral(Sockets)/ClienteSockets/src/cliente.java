import java.io.*;
import java.net.*;

public class cliente {
    private Socket socket;
    BufferedReader input ;
    PrintWriter output;
    BufferedReader reader;

    public cliente() throws IOException {
        this.socket = new Socket("localhost", 5000);
        this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.output =  new PrintWriter(socket.getOutputStream(), true);
        this.reader =  new BufferedReader(new InputStreamReader(System.in));
        run();
    }

    public void run() throws IOException {
        while (true) {
            System.out.println("Ingresa el nombre de la canción (o 'exit' para salir): ");
            String mensaje_cliente = this.reader.readLine();
            output.println(mensaje_cliente);
            if (mensaje_cliente.equalsIgnoreCase("exit")) {
                break;
            }
            String respuesta = input.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
        }
        socket.close();
    }
}
