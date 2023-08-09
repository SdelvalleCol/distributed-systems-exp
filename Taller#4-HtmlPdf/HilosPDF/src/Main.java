import conversion.pdfclass;
import conversion.url;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<String> urls = new ArrayList<>();
        System.out.println("Ingrese los enlaces web (ingrese 'q' para finalizar la lista):");
        while (true) {
            String url = scanner.nextLine().trim();
            if (url.equalsIgnoreCase("q")) {
                break;
            }
            urls.add(url);
        }

        System.out.println("Comenzando a convertir a Pdfs...");

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<?>> results = new ArrayList<>();
        for (String url : urls) {
            url p = new url(url);
            pdfclass pdf = new pdfclass(p.getContenido(), p.getNombre());
            Future<?> result = executor.submit(pdf::getpdf);
            Future<?> resul2 = executor.submit(pdf::getNombre_ruta);
            results.add(result);
            results.add(resul2);
        }

        try {
            for (Future<?> result : results) {
                result.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
}
}
