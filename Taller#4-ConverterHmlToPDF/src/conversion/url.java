package conversion;
import java.io.*;
import java.net.URL;

public class url {
    private URL url;
    private String nombre;
    private String contenido;

    public url(String url) throws IOException {
        this.url = new URL(url);
        String [] parts;
        if(url.contains("/")){
            parts = url.toLowerCase().split("/");
            this.nombre = parts[parts.length-1];
        }else{
            this.nombre = url;
        }
        this.contenido =html();
    }

    private String html() throws IOException {
        StringBuilder html = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new InputStreamReader(this.url.openStream()))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                html.append(linea);
            }
        }
        return html.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }
}
