package intefaz;

import java.util.ArrayList;

public interface cancionable {
    public String getFecha();

    public void setFecha(String fecha) ;

     public String getAutor() ;

     public void setAutor(String autor) ;

     public String getNombre();

    public void setNombre(String nombre);

    public ArrayList<String> Convertir();
}
