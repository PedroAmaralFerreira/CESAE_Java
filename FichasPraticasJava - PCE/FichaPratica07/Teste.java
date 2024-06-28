package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Teste {

    public static void usingPrintWriter() throws FileNotFoundException{
        String fileContent = "Hello! My name is Pedro!";

        File file = new File("/Users/pedroferreira/Documents/Programming/CESAE/CESAE_PedroFerreira/FichasPraticasJava - PCE/Exemplo");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);

        printWriter.close();
    }

    public static void main(String[] args) {

        try {
            usingPrintWriter();
            System.out.println("Success!");
        }catch (FileNotFoundException exc){
            System.out.println("Fail");
        }

    }
}
