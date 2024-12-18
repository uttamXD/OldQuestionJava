package CopyPDF;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyPDF {
    public static void main(String[] args) {
        Path source = Paths.get("C:\\Users\\UttamChamlingRai\\Desktop\\input.pdf");
        Path destination = Paths.get("C:\\Users\\UttamChamlingRai\\Desktop\\output.pdf");

        try {
            Files.copy(source, destination);
            System.out.println("PDF copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the PDF. " + e);
        }
    }
}

