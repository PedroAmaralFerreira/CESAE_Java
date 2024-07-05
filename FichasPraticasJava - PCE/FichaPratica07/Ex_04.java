package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_04 {

    public static void imprimirFicheiro(String path) throws FileNotFoundException{

        String mensagem = "Hello, World! My name is Pedro!";
        File criarFicheiro = new File(path);
        PrintWriter printWriter = new PrintWriter(criarFicheiro);

        printWriter.println(mensagem);

        System.out.println(mensagem);

        printWriter.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        // Chamar a funcao
        imprimirFicheiro("Exemplo04.csv");
    }
}
