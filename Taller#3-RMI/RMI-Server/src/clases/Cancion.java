package clases;
import intefaz.Cancionable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cancion  implements Cancionable {
    private String nombre;
    private String autor;
    private String fecha;

    private List<Cancion> listaCancion;

    public Cancion(String nombre, String autor , String fecha) {
        this.nombre = nombre;
        this.autor = autor;
        this.fecha = fecha;
    }

    public Cancion(){}

    public void inicializarListaCanciones() {
        listaCancion = new ArrayList<>(
                List.of(
                        new Cancion("Bohemian Rhapsody", "Queen", "1975"),
                        new Cancion("Imagine", "John Lennon", "1971"),
                        new Cancion("Thriller", "Michael Jackson", "1982"),
                        new Cancion("Billie Jean", "Michael Jackson", "1983"),
                        new Cancion("Like a Rolling Stone", "Bob Dylan", "1965"),
                        new Cancion("Hey Jude", "The Beatles", "1968"),
                        new Cancion("Boogie Wonderland", "Earth, Wind & Fire", "1979"),
                        new Cancion("Hotel California", "Eagles", "1976"),
                        new Cancion("Purple Haze", "Jimi Hendrix", "1967"),
                        new Cancion("Stairway to Heaven", "Led Zeppelin", "1971")
                )
        );
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

    @Override
    public String union() {
        if(this.nombre == null){
            return "No se ha encontrado la canción";
        }else{
            return ("Nombre " + this.nombre + "\n" + "Autor " +this.autor + "\n"+ "Fecha " +this.fecha );
        }

    }

    @Override
    public void busqueda(String nombre) throws RemoteException {
        if(!this.listaCancion.isEmpty()){
            for (Cancion can : this.listaCancion) {
                if(Objects.equals(can.nombre, nombre)){
                    this.nombre = can.nombre;
                    this.autor = can.autor;
                    this.fecha = can.fecha;
                    break;
                }
            }
        }
    }
}
