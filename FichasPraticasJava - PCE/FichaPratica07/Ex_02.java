package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void criarFicheiro(String path) throws FileNotFoundException{

        String mensagem = "Java is the best! Put your coding to the test";

        File novoFicheiro = new File(path);
        PrintWriter printWriter = new PrintWriter(novoFicheiro);

        printWriter.println(mensagem);

        printWriter.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiro("Exemplo02.txt");

    }

}
