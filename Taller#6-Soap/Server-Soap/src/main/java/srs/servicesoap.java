package srs;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService
public class servicesoap {
    static List<srs.cancion> listaCanciones = new ArrayList<>(
            Arrays.asList(
                    new srs.cancion("Bohemian Rhapsody", "Queen", "1975"),
                    new srs.cancion("Imagine", "John Lennon", "1971"),
                    new srs.cancion("Thriller", "Michael Jackson", "1982"),
                    new srs.cancion("Billie Jean", "Michael Jackson", "1983"),
                    new srs.cancion("Like a Rolling Stone", "Bob Dylan", "1965"),
                    new srs.cancion("Hey Jude", "The Beatles", "1968"),
                    new srs.cancion("Boogie Wonderland", "Earth, Wind & Fire", "1979"),
                    new srs.cancion("Hotel California", "Eagles", "1976"),
                    new srs.cancion("Purple Haze", "Jimi Hendrix", "1967"),
                    new srs.cancion("Stairway to Heaven", "Led Zeppelin", "1971")
            )
    );
    @WebMethod
    public srs.cancion busqueda(String nombre){
        srs.cancion retorno = new srs.cancion();
        for(srs.cancion p: listaCanciones){
            if(nombre.toLowerCase().equals(p.getNombre().trim().toLowerCase())){
                retorno = p;
                break;
            }
        }
        return retorno;
    }
    @WebMethod
    public List<srs.cancion> obtener_todo(){
        ArrayList<srs.cancion> data = new ArrayList<>();
        for(srs.cancion p: listaCanciones){
            data.add(p);
        }
        return data;
    }
}
