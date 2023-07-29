import data.cancion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<cancion> listaCanciones = new ArrayList<>(
            List.of(
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

    public static void main(String[] args) {
        servidor server = new servidor();
    }
}
