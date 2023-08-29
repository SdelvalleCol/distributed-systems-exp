package srs;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService
public class servicesoap {
    static List<cancion> listaCanciones = new ArrayList<>(
            Arrays.asList(
                    new cancion("Bohemian Rhapsody", "Queen", "1975"),
                    new cancion("Imagine", "John Lennon", "1971"),
                    new cancion("Thriller", "Michael Jackson", "1982"),
                    new cancion("Billie Jean", "Michael Jackson", "1983"),
                    new cancion("Like a Rolling Stone", "Bob Dylan", "1965"),
                    new cancion("Hey Jude", "The Beatles", "1968"),
                    new cancion("Boogie Wonderland", "Earth, Wind & Fire", "1979"),
                    new cancion("Hotel California", "Eagles", "1976"),
                    new cancion("Purple Haze", "Jimi Hendrix", "1967"),
                    new cancion("Stairway to Heaven", "Led Zeppelin", "1971")
            )
    );
    @WebMethod
    public cancion busqueda(String nombre){
        cancion retorno = new cancion();
        for(cancion p: listaCanciones){
            if(nombre.toLowerCase().equals(p.getNombre().trim().toLowerCase())){
                retorno = p;
                break;
            }
        }
        return retorno;
    }
    @WebMethod
    public List<cancion> obtener_todo(){
        ArrayList<cancion> data = new ArrayList<>();
        for(cancion p: listaCanciones){
            data.add(p);
        }
        return data;
    }
}
