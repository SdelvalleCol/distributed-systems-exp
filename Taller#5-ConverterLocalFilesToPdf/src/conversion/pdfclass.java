package conversion;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class pdfclass {
    private  String input;
    final private String output = "C:\\Users\\colom\\OneDrive\\Documentos\\GitHub\\PDFHLocal\\HilosPDF\\Data\\PDF_Convert";
    private String[] command;

    public pdfclass(String input) {
        this.input = input;
        //Modificar en caso de uso
        final String libreOfficeExecutable = "C:\\Program Files\\LibreOffice\\program\\soffice.exe";
        this.command = new String[]{
                libreOfficeExecutable,
                "--headless",
                "--convert-to",
                "pdf",
                "--outdir",
                this.output,
                this.input
        };
    }

    public void getpdf() {
        try {
            // Procesamiento
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                String[] exit = this.input.split("\\\\");
                System.out.println("PDF generado exitosamente en: " + this.output + " Con el nombre de "  + exit[exit.length-1] + "(PDF)" );
            } else {
                System.out.println("Error al generar el PDF. Código de salida: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al generar el PDF: " + e.getMessage());
        }
    }

}
