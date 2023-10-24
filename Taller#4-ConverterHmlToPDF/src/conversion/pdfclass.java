package conversion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class pdfclass {

    private String contenidohtml;
    private String nombre_ruta;
    private final String chromeExecutable = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
    private String[] command;

    public pdfclass(String contenido, String nombre) {
        //Modificar en caso de uso
        String nn = "C:\\Users\\admin\\Documents\\GitHub\\distributed-systems-exp\\Taller#4-ConverterHmlToPDF\\pdf\\" + nombre + ".pdf";
        this.nombre_ruta = nn;
        this.contenidohtml = contenido;
        this.command = new String[]{
                chromeExecutable,
                "--headless",
                "--disable-gpu",
                "--print-to-pdf=" + this.nombre_ruta
        };
    }

    public void getpdf() {
        try {
            // Archivo temporal
            File tempf = File.createTempFile("tempHtml", ".html");
            try (FileWriter writer = new FileWriter(tempf)) {
                writer.write(contenidohtml);
            }

            // Agregar el archivo temporal al comando de conversión
            String[] commandWithFile = new String[command.length + 1];
            System.arraycopy(command, 0, commandWithFile, 0, command.length);
            commandWithFile[command.length] = tempf.getAbsolutePath();

            //procesamiento
            ProcessBuilder processBuilder = new ProcessBuilder(commandWithFile);
            Process process = processBuilder.start();

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("PDF generado exitosamente en: " + this.nombre_ruta);
            } else {
                System.out.println("Error al generar el PDF. Código de salida: " + exitCode);
            }
            // Eliminar el archivo temporal después de la conversión
            tempf.delete();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al generar el PDF: " + e.getMessage());
        }
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }
}
