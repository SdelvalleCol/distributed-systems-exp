package clases;
import intefaz.cancionable;

import java.util.ArrayList;

public class cancion implements cancionable {
    private String nombre;
    private String autor;
    private String fecha;

    public cancion(String nombre, String autor, String fecha) {
        this.nombre = nombre;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> Convertir(){
        ArrayList<String> data = new ArrayList<>();
        data.add(this.nombre);
        data.add(this.autor);
        data.add(this.fecha);
        return  data;
    }
}
