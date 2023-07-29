package data;
public class cancion {
    private String nombre;
    private String autor;
    private String fecha;

    public cancion(String nombre, String autor , String fecha) {
        this.nombre = nombre;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "cancion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
