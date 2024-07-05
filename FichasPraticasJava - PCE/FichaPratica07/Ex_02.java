package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_02 {

    public static void criarFicheiro(String path, String path2) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));
        File file = new File(path2);
        PrintWriter printWriter = new PrintWriter(file);

        while (scannerFicheiro.hasNextLine()){
            String linha = scannerFicheiro.nextLine();
            printWriter.println(linha);
        }

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiro("exercicio_01_Alternativa02.txt", "exercicio_02.txt");

    }
}
