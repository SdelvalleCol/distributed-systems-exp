import conversion.pdfclass;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Threads (Junto la data , procesa los datos)
    public static void  hilos_conversion(List<String> paths) throws InterruptedException {
        int tamano = paths.size();
        System.out.println("Archivos a convertir.. "+ tamano);
        if(tamano > 0){
            System.out.println("Comenzando a convertir a Pdfs...");
            if(tamano <= 2) {
                for (String name : paths) {
                    try {
                        pdfclass object = new pdfclass(name);
                        Thread thread = new Thread(() -> object.getpdf());
                        thread.start();
                        try {
                            thread.join();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }else{
                int contador = 0;
                if (tamano % 2 == 0) {
                    while (contador<tamano){
                        pdfclass object1 = new pdfclass(paths.get(contador));
                        pdfclass object2 = new pdfclass(paths.get(contador+1));
                        Thread thread1 = new Thread(() -> object1.getpdf());
                        thread1.start();
                        thread1.join();
                        Thread thread2 = new Thread(() -> object2.getpdf());
                        thread2.start();
                        thread2.join();
                        contador = contador +2;
                    }
                } else if (tamano % 2 != 0) {
                    while (contador < tamano){
                        if(tamano - contador <= 1 || tamano -contador <= 2){
                            pdfclass object1 = new pdfclass(paths.get(contador));
                            //1 Hilo
                            Thread thread1 = new Thread(() -> object1.getpdf());
                            thread1.start();
                            thread1.join();
                            contador++;
                        }else {
                            pdfclass object1 = new pdfclass(paths.get(contador));
                            pdfclass object2 = new pdfclass(paths.get(contador + 1));
                            pdfclass object3 = new pdfclass(paths.get(contador + 2));

                            //1 Hilo
                            Thread thread1 = new Thread(() -> object1.getpdf());
                            thread1.start();
                            thread1.join();

                            //2 Hilo
                            Thread thread2 = new Thread(() -> object2.getpdf());
                            thread2.start();
                            thread2.join();

                            //3 Hilo
                            Thread thread3 = new Thread(() -> object3.getpdf());
                            thread3.start();
                            thread3.join();
                            contador = contador +3;
                        }
                    }
                }
                System.out.println("Se han convertido todos los PDFs");
            }
        }else{
            System.out.println("No hay archivos disponibles");
        }
    }


    //Data generator (Obtiene la lista de documentos)
    public static List<String> obtener_rutas(String path){
        ArrayList<String> data = new ArrayList<>();
        File folder = new File(path);
        if(folder.listFiles().length >= 1){
            File [] files = folder.listFiles();
            for(File file : files){
                data.add(file.getAbsolutePath());
            }
            return data;
        }
        return data;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> data = obtener_rutas("C:\\Users\\admin\\Documents\\GitHub\\distributed-systems-exp\\Taller#5-ConverterLocalFilesToPdf\\Data\\Documents");
        hilos_conversion(data);
}
}
